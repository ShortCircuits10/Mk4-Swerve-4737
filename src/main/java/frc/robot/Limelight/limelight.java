import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public Limelight {
  private NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  private double FOV = 164.58782681387333 / (180.0 / Math.PI);
  
  private double steeringSpeed;
  public Limelight(double steeringSpeed) {
    this.steeringSpeed = steeringSPeed;
  }
  public Limelight() {
    
  }
  
  //0 LED Mode set in the current pipeline
  //1 force off
  //2 force blink
  //3 force on
  public void setLedMode(int ledMode) {
    table.getEntry("ledMode").setNumber(ledMode);
  }
  //Find x angle of tape relative to camera  
  public double getTX() {
    return table.getEntry("tx").getDouble(0.0);
  }
  //Find y angle of tape relative to camera
  public double getTY() {
    return table.getEntry("ty").getDouble(0.0);
  }
  //Find area of tape.
  public double getTA() {
    return table.getEntry("ta").getDouble(0.0);
  }
  //Find skew of tape.
  public double getTS() {
    return table.getEntry("ts").getDouble(0.0); 
  }
  //Check if tape is seen by the camera. 
  public boolean validTargets() {
    return table.getEntry("tv").getBoolean(0);
  }
  //3D has not yet been verified to function correctly. Returns translation and rotation of limelight camera.
  //Output NumberArray: Translation (x,y,z) Rotation(pitch, yaw, roll)
  public double[] get3d() {
    return table.getEntry("camtran").getDoubleArray(new double[]{});
  }
  //Get the amount of time it takes to process the current camera input.
  public double getLatency() {
    return table.getEntry("tl").getDouble(0.0);
  }
  
  //Find speed at which to rotate towards tape
  public double steerAdjustX() {
    return getTX() * steeringSpeed;
  }
  public double steerAdjustY() {
    return getTX() * steeringSpeed;
  }
  
}
