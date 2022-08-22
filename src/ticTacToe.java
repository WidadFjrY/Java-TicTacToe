import java.util.Objects;
import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {

        // Deklarasi
        Scanner inputUser = new Scanner(System.in);
        int pilihan;

        // Game
        System.out.println("\n===============TicTacToe===============\n");
        System.out.println("Game Mode");
        System.out.println("1. Single Player");
        System.out.println("2. Multiplayer");

        do {
            System.out.print("Select Mode : ");
            pilihan = inputUser.nextInt();

            if (pilihan == 1){
                singlePlayer();
            } else if (pilihan == 2){
                multiPlayer();
            } else {
                System.out.println("Pilihan tidak valid, Masukan ulang");
            }
        } while (pilihan > 2);

    }

    static void singlePlayer(){

        // Deklarasi
        String[] ticTacToe;
        ticTacToe = new String[9];

        String player, com;
        player = "O";
        com = "X";

        System.out.println("\nPlayer 1 : " + player);
        System.out.println("Com      : " + com + "\n");

        for (int i = 0; i <= 8; i++){
            ticTacToe[i] = ".";
        }

        board(ticTacToe);

        System.out.println("You Go First!");
        System.out.print("\n");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        com(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        com(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        com(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        com(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("\n______________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinnerCom(ticTacToe);

        System.out.println("Draw!!!!!");
    }

    static void com(String[] ticTacToe){
        System.out.println("Com (X)\n");

        // First Turn

        // Horizontal 1, X Win
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], ".")
        ){
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
        ){
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "X")
        ){
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
        ){
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], "X")
        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
        ){
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")
        ){
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[6], ".")
        ){
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[7], ".")
        ){
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[7], "X")
        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[7], "X")
        ){
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[8], ".")
        ){
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[8], ".")
        ){
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[6], ".")
        ){
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            ticTacToe[2] = "X";
        }

        // BOT AI
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")
        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[2] = "X";
        }  else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], ".")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ){
            ticTacToe[4] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")
        ){
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ){
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")
        ){
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "x")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[2] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[1] = "X";
        }  else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[0] = "X";
        }  else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], ".")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], ".")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[1] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], ".")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[6] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[8] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], ".")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[7] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], ".")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "X")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[5] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], ".")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "O")

        ) {
            ticTacToe[3] = "X";
        } else if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[3], ".")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], ".")

        ) {
            ticTacToe[3] = "X";
        }
    }
    static void multiPlayer(){

        // Deklarasi
        String[] ticTacToe;
        ticTacToe = new String[9];

        for (int i = 0; i <= 8; i++){
            ticTacToe[i] = ".";
        }

        String player1, player2;
        player1 = "O";
        player2 = "X";

        // Game
        System.out.println("\nPlayer 1 :" + " " + player1);
        System.out.println("Player 2 :" + " " + player2 + "\n");

        board(ticTacToe);
        System.out.println("Masukan angka sesuai indexing (1 - 9)");

        System.out.println("\n");

        player1(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player2(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player2(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player2(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player2(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("___________________________________________");
        player1(ticTacToe);
        board(ticTacToe);
        checkWinner(ticTacToe);
        System.out.print("\n");

        System.out.println("Draw!!!!!!!");

    }

    static void player1(String[] ticTacToe){
        int inputPlayer1;
        Scanner input = new Scanner(System.in);
        String player1 = "O";
        do {
            System.out.print("Player 1 (O) : ");
            inputPlayer1 = input.nextInt();
            if (
                    Objects.equals(ticTacToe[inputPlayer1 -1], "X")
                            || Objects.equals(ticTacToe[inputPlayer1 - 1], "O")
            ){
                System.out.println("Petak Sudah Terisi!!!!");
            }
        } while (
                    Objects.equals(ticTacToe[inputPlayer1 - 1], "X")
                            || Objects.equals(ticTacToe[inputPlayer1 - 1], "O")
        );

        ticTacToe[inputPlayer1 - 1] = player1;
        System.out.print("\n");

    }

    static void  player2 (String[] ticTacToe){
        int inputPlayer2;
        Scanner input = new Scanner(System.in);
        String player2 = "X";
        do {
            System.out.print("Player 2 (X) : ");
            inputPlayer2 = input.nextInt();
            if (
                    Objects.equals(ticTacToe[inputPlayer2 -1], "X")
                            || Objects.equals(ticTacToe[inputPlayer2 - 1], "O")
            ){
                System.out.println("Petak Sudah Terisi!!!!");
            }
        } while (
                    Objects.equals(ticTacToe[inputPlayer2 - 1], "X")
                            || Objects.equals(ticTacToe[inputPlayer2 - 1], "O")
        );
        ticTacToe[inputPlayer2 - 1] = player2;
        System.out.print("\n");
    }

    static void board(String[] ticTacToe){
        for (int i = 0; i <= 8; i++){
            if (i == 0){
                System.out.print("|");
            }
            if (i == 3){
                System.out.print("|");
            }
            if (i == 6){
                System.out.print("|");
            }
            System.out.print("  " + ticTacToe[i] + "  ");
            if (i == 2){
                System.out.println("|\n");
            }
            if (i == 5){
                System.out.println("|\n");
            }
            if (i == 8){
                System.out.println("|");
            }
        }
    }

    static void checkWinner(String[] ticTacToe){

        // Horizontal X
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }

        // Vertical X
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[7], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }

        // Diagonal X
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            System.out.println("Player 2 Win");
            System.exit(0);
        }


        // Horizontal O
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }

        // Vertical O
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[6], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[7], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }

        // Diagonal O
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[6], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
    }

    static void checkWinnerCom(String[] ticTacToe){

        // Horizontal X
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[2], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[5], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[6], "X")
                        && Objects.equals(ticTacToe[7], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }

        // Vertical X
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[3], "X")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[1], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[7], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[5], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }

        // Diagonal X
        if (
                Objects.equals(ticTacToe[0], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[8], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "X")
                        && Objects.equals(ticTacToe[4], "X")
                        && Objects.equals(ticTacToe[6], "X")
        ){
            System.out.println("Com Win");
            System.exit(0);
        }


        // Horizontal O
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[2], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[5], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[6], "O")
                        && Objects.equals(ticTacToe[7], "O")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }

        // Vertical O
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[3], "O")
                        && Objects.equals(ticTacToe[6], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[1], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[7], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[5], "O")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }

        // Diagonal O
        if (
                Objects.equals(ticTacToe[0], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[8], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
        if (
                Objects.equals(ticTacToe[2], "O")
                        && Objects.equals(ticTacToe[4], "O")
                        && Objects.equals(ticTacToe[6], "O")
        ){
            System.out.println("Player 1 Win");
            System.exit(0);
        }
    }
}
