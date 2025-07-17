package Java.Projects;
import java.util.Scanner;

public class votingGame {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int votecand1 =0;
        int votecand2=0;
        int votecand3=0;
        while(true){
            System.out.print("Enter the party you want to vote enter 'results' to see result and 'exit' to stop(BJP, Congress or AAP):");
            String vote = sc.next().toLowerCase();
            switch(vote){
                case "bjp":
                    votecand1++;
                    System.out.println("Vote gone to BJP");
                    break;

                case "congress":
                    votecand2++;
                    System.out.println("Vote gone to congress");
                    break;

                case "aap":
                    votecand3++;
                    System.out.println("Vote gone to AAP");
                    break;

                case "results":
                    System.out.println("Votes so far:");
                    System.out.println("BJP:"+votecand1);
                    System.out.println("Congress:"+votecand2);
                    System.out.println("AAP:"+votecand3);
                    break;

                case "exit":
                    System.out.println("Voting Ended. Results are here:");
                    System.out.println("BJP:"+votecand1);
                    System.out.println("Congress:"+votecand2);
                    System.out.println("AAP:"+votecand3);
                    if(votecand1>votecand2 && votecand1>votecand3){
                        System.out.println("BJP won");
                    }
                    else if(votecand2>votecand1 && votecand2>votecand3){
                        System.out.println("Congress Won");
                    }else if(votecand3>votecand2&&votecand3>votecand1){
                        System.out.println("AAP won");

                    }else if(votecand1==votecand2 && votecand1>votecand3){
                        System.out.println("Votes of BJP and Congress are equal and greater than AAP");
                        
                    }else if(votecand2==votecand3&& votecand3>votecand1){
                        System.out.println("AAP and Congress have equal votes and greater than BJP");

                    }else if(votecand1==votecand3&&votecand1>votecand2){
                        System.out.println("BJP and AAP have equal votes and greater than Congress");
                        
                    }else if(votecand1==votecand2&&votecand1==votecand3){
                        System.out.println("There's a tie between all ");
                    }else{
                        System.out.println("Sorry an error occured");

                    }
                    sc.close();
                    return;
            
            }

        }

    }
}
