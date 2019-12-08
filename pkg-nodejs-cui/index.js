const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

const POSSIBLE_ANSWER = [
  { answer: "It is certain.", type: "affirmative"},
  { answer: "It is decidedly so.", type: "affirmative"},
  { answer: "Without a doubt.", type: "affirmative"},
  { answer: "Yes - definitely.", type: "affirmative"},
  { answer: "You may rely on it.", type: "affirmative"},
  { answer: "As I see it, yes.", type: "affirmative"},
  { answer: "Most likely.", type: "affirmative"},
  { answer: "Outlook good.", type: "affirmative"},
  { answer: "Yes.", type: "affirmative"},
  { answer: "Signs point to yes.", type: "affirmative"},
  { answer: "Reply hazy, try again.", type: "non-committal"},
  { answer: "Ask again later.", type: "non-committal"},
  { answer: "Better not tell you now.", type: "non-committal"},
  { answer: "Cannot predict now.", type: "non-committal"},
  { answer: "Concentrate and ask again.", type: "non-committal"},
  { answer: "Don't count on it.", type: "negative"},
  { answer: "My reply is no.", type: "negative"},
  { answer: "My sources say no.", type: "negative"},
  { answer: "Outlook not so good.", type: "negative"},
  { answer: "Very doubtful.", type: "negative"},
]

const getRandomNumber = (max) => {
  const number = Math.floor(Math.random() * Math.floor(max));
  return number;
}

const question = () => {
  console.log("Respondent : What's your question?")
  readline.question("You : ", (answer) => {
    const number = getRandomNumber(POSSIBLE_ANSWER.length);
    const response = POSSIBLE_ANSWER[number].answer;
    console.log("Respondent : " + response);
    process.exit(); // 暫定対応 ... readline.questionが非同期
  });
}

// Main
question();
