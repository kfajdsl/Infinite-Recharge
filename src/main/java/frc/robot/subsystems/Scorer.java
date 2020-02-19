package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Servo;

public class Scorer extends SubsystemBase {
    private Servo m_left, m_right;

    public Scorer(Servo left, Servo right) {
        m_left = left;
        m_right = right;
    }

    public void open() {
        m_left.set(1.0);
        m_right.set(0.0);
    }

    public void close() {
        m_left.set(0.0);
        m_right.set(1.0);
    }
}