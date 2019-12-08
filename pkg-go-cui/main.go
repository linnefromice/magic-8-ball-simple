package main

import (
	"bufio"
	"fmt"
	"math/rand"
	"os"
	"time"
)

var stdin = bufio.NewScanner(os.Stdin)
var answerList = []string{
	"It is certain.",
	"It is decidedly so.",
	"Without a doubt.",
	"Yes - definitely.",
	"You may rely on it.",
	"As I see it, yes.",
	"Most likely.",
	"Outlook good.",
	"Yes.",
	"Signs point to yes.",
	"Reply hazy, try again.",
	"Ask again later.",
	"Better not tell you now.",
	"Cannot predict now.",
	"Concentrate and ask again.",
	"Don't count on it.",
	"My reply is no.",
	"My sources say no.",
	"Outlook not so good.",
	"Very doubtful.",
}

// 文字列を1行入力
func main() {

	fmt.Println("Respondent : What's your question?")
	for {
		fmt.Print("You : ")
		stdin.Scan()
		if stdin.Text() != "" {
			break
		}
		fmt.Println("[!]PLEASE INPUT YOUR ANSWER.")
	}
	fmt.Println("Respondent :", selectAnswer())
}

func selectAnswer() string {
	rand.Seed(time.Now().UnixNano())
	num := rand.Intn(len(answerList))
	return answerList[num]
}
