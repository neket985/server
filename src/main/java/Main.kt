import ratpack.server.RatpackServer
import java.io.File


/**
 * Created by nikita on 23.06.17.
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        RatpackServer.start {
            it
                    .serverConfig {
                        it
                                .port(5555)
                                .baseDir(File("/home/nikita/Загрузки").toPath())
                    }
                    .handlers { chain ->
                        chain.files { f ->
                            f.dir("index")
                        }
                    }
        }.start()
    }
}