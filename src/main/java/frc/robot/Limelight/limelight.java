import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public Limelight {
  public Limelight() {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
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
