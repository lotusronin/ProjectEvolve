import javax.swing.JFrame
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent

object Main {
  def main(args: Array[String]) = {
    println("Hello Scala World!")

    val frame : JFrame = new JFrame("Project Evolve")
    frame.addWindowListener(new WindowAdapter() {
      override def windowClosing(windowevent : WindowEvent) = {
        frame.dispose()
        System.exit(0)
      }
    })
    frame.setSize(640,480)
    frame.setVisible(true)
  }
}
