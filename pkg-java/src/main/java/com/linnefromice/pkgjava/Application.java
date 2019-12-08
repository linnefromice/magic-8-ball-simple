package com.linnefromice.pkgjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static final Logger LOG = LoggerFactory.getLogger(Application.class);
	public static List<Message> list = new ArrayList<Message>();
	static {
		list.add(new Message("It is certain.", MessageType.AFFIRMATIVE));
		list.add(new Message("It is decidedly so.", MessageType.AFFIRMATIVE));
		list.add(new Message("Without a doubt.", MessageType.AFFIRMATIVE));
		list.add(new Message("Yes - definitely.", MessageType.AFFIRMATIVE));
		list.add(new Message("You may rely on it.", MessageType.AFFIRMATIVE));
		list.add(new Message("As I see it, yes.", MessageType.AFFIRMATIVE));
		list.add(new Message("Most likely.", MessageType.AFFIRMATIVE));
		list.add(new Message("Outlook good.", MessageType.AFFIRMATIVE));
		list.add(new Message("Yes.", MessageType.AFFIRMATIVE));
		list.add(new Message("Signs point to yes.", MessageType.AFFIRMATIVE));
		list.add(new Message("Reply hazy, try again.", MessageType.NON_COMMITTAL));
		list.add(new Message("Ask again later.", MessageType.NON_COMMITTAL));
		list.add(new Message("Better not tell you now.", MessageType.NON_COMMITTAL));
		list.add(new Message("Cannot predict now.", MessageType.NON_COMMITTAL));
		list.add(new Message("Concentrate and ask again.", MessageType.NON_COMMITTAL));
		list.add(new Message("Don't count on it.", MessageType.NEGATIVE));
		list.add(new Message("My reply is no.", MessageType.NEGATIVE));
		list.add(new Message("My sources say no.", MessageType.NEGATIVE));
		list.add(new Message("Outlook not so good.", MessageType.NEGATIVE));
		list.add(new Message("Very doubtful.", MessageType.NEGATIVE));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("START Magic 8 ball Application.");
		question();
	}

	private void question() {
		System.out.println("Respondent : What's your question?");
		System.out.print("You : ");
		System.out.println("SAMPLE QUESTION"); // <- inputAnswer();
		final Message selectedMessage = list.get(this.getRandomNumber(list.size()));
		System.out.println("Respondent : " + selectedMessage.getText());
	}

	private void inputAnswer() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private int getRandomNumber(final int max) {
		Random random = new Random();
		return random.nextInt(max);
	}
}
