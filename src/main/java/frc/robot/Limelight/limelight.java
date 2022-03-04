import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public Limelight {
  private NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  
  private const double FOV = 164.58782681387333;
  
  public Limelight() {
    
  }
  public void setPosition(double x, double y) {

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
}
