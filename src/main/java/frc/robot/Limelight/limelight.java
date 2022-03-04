import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

//Import Vector

public Limelight {
  private NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  
  private List<Vector2> positions = new ArrayList<Vector2>();
  private List<doubke> positionTime = new ArrayList<double>();
    
  private const double FOV = 164.58782681387333 / (180.0 / Math.PI);
  
  private double minimumArea;
  public Limelight(double minimumArea) {
    this.minimumArea = minimumArea;
  }
  
  public void setPosition(double x, double y) {
    positions.add(new Vector2(x, y));
    positionTime.add(System.currentTimeMillis());
  }
  public Vector2 getRelativeTapeAngle() {
     
  }
  //0 LED Mode set in the current pipeline
  //1 force off
  //2 force blink
  //3 force on
  public void setLedMode(int ledMode) {
    table.getEntry("ledMode").setNumber(ledMode);
  }
  public double getTX() {
    return table.getEntry("tx").getDouble(0.0);
  }
  public double getTY() {
    return table.getEntry("ty").getDouble(0.0);
  }
  public double getTA() {
    return table.getEntry("ta").getDouble(0.0);
  }
  public boolean validTargets() {
    return table.getEntry("tv").getBoolean(0);
  }
}
