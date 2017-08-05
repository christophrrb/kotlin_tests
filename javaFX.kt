import javax.swing.JFrame

fun main(args: Array<String>) {
        val frame = JFrame("App")
        frame.contentPane = App().panel
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.pack()
        frame.isVisible = true
}