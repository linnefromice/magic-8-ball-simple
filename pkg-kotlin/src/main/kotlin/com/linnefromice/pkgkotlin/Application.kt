package com.linnefromice.pkgkotlin

import lombok.AllArgsConstructor
import lombok.Data
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application : CommandLineRunner {
	private val log = LoggerFactory.getLogger(Application::class.java)

	public val messageList: MutableList<String> = mutableListOf<String>()
	companion object {

	}

	override fun run(vararg args: String?) {
		log.info("START Magic 8 ball Application.")
	}

}

fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}

@Data
@AllArgsConstructor
class Message {
  val text: String, val type: MessageType,
}

enum class MessageType(val mean: String ) {
	AFFIRMATIVE("affirmative"),
	NON_COMMITTAL("non-committal"),
	NEGATIVE("negative")
}