import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class Cricket {
	   String Venue;
	   String team1;
	   String team2;
	   String Toss_Won_By;
	   String toss;
	   int no_of_runs;
	   int no_of_fours;
	   int no_of_sixes;
	   int no_of_overs;
	   int no_balls;
	   int wides;
	   int maiden;
	   int leg_byes;
	   int i;
	   int team1_score;
	   int team2_score;
	   int dif;
	   String bb,bat,bowl;
	private Scanner scanf;
	  Cricket(String v,String t1,String t2,String tw,int r,int f,int s,int ov,int nb,int w,int m,int lb,int d)
	{ Venue=v;
	  team1=t1;
	  team2=t2;
	  Toss_Won_By=tw;
	  no_of_runs=r;
	  no_of_fours=f;
	  no_of_sixes=s;
	  no_of_overs=ov;
	  no_balls=nb;
	  wides=w;
	  maiden=m;
	  leg_byes=lb;
	  dif=d;
	}
	 public Cricket() {
		// TODO Auto-generated constructor stub
	}
	 //date method
	void date()
	{ SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	  String date=sdf.format(new Date());
	  System.out.println("match-date:"+date);
	}
	//team1 statistics
	void First_Innings_details()
	{ scanf = new Scanner(System.in);
	  System.out.println("enter the match details");
	  System.out.println("enter the venue");
	  Venue=scanf.nextLine();
	  System.out.println("enter team1 name");
	  team1=scanf.nextLine();
	  System.out.println("enter team2 name");
	  team2=scanf.nextLine();
	  System.out.println("toss won by team");
	  Toss_Won_By=scanf.nextLine();
	  if(Toss_Won_By.equals(team1))
	   {System.out.println(""+team1+" elects to bat or bowl?");
	    bb=scanf.nextLine();
	   if(bb.equals("bat"))
	   { System.out.println("enter "+""+team1+" batting score");
	   }
	   else
	   {System.out.println("enter "+""+team2+" batting score");
	   }
	   }
	  else
	   {System.out.println(""+team2+" elects to bat or bowl?");
		bb=scanf.nextLine();
		if(bb.equals("bat"))
	   { System.out.println("enter "+""+team2+" batting score");
	   }
	   else
	   {System.out.println("enter "+""+team1+" batting score");
	   }
	   }
	  System.out.println("enter the no of runs");
	  no_of_runs=scanf.nextInt();
	  System.out.println("enter the no of fours");
	  no_of_fours=scanf.nextInt();
	  System.out.println("enter the no of sixes");
	  no_of_sixes=scanf.nextInt();
	  System.out.println("enter no of no-balls bowled");
	  no_balls=scanf.nextInt();
	  System.out.println("enter no of wides bowled");
	  wides=scanf.nextInt();
	  System.out.println("enter no of leg-byes conceded");
	  leg_byes=scanf.nextInt();
	  return;
	  }
	void second_Innings_details() {
	if(Toss_Won_By.equals(team1))
	{ if(bb.equals("bat"))
	{System.out.println("enter "+""+team2+" batting score");
	}
	else
	{ System.out.println("enter "+""+team1+" batting score");
	}
	}
	else
	{if(bb.equals("bat"))	
	 { System.out.println("enter "+""+team1+" batting score");
	 }
	 else 
	 { System.out.println("enter "+""+team2+" batting score");
	 }
	}
	  System.out.println("enter the no of runs");
	  no_of_runs=scanf.nextInt();
	  System.out.println("enter the no of fours");
	  no_of_fours=scanf.nextInt();
	  System.out.println("enter the no of sixes");
	  no_of_sixes=scanf.nextInt();
	  System.out.println("enter no of no-balls bowled");
	  no_balls=scanf.nextInt();
	  System.out.println("enter no of wides bowled");
	  wides=scanf.nextInt();
	  System.out.println("enter no of leg-byes conceded");
	  leg_byes=scanf.nextInt();
	  return;
	}
	 void team1_scorecard()
	 { if(Toss_Won_By.equals(team1))
		{ if(bb.equals("bat"))
		{  team1_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
            System.out.println("total score of "+""+team1+" is "+""+team1_score);
 	    }
		else
		{ team2_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
	     System.out.println("total score of "+""+team2+" is "+""+team2_score);
		}
	 }
	 else
		{ if(bb.equals("bat"))
		{  team2_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
         System.out.println("total score of "+""+team2+" is "+""+team2_score);
	    }
		else
		{ team1_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
	     System.out.println("total score of "+""+team1+" is "+""+team1_score);
		}
	 }
	 }
	 void team2_scorecard()
	 { if(Toss_Won_By.equals(team1))
		{ if(bb.equals("bat"))
		{  team2_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
         System.out.println("total score of "+""+team2+" is "+""+team2_score);
	    }
		else
		{ team1_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
	     System.out.println("total score of "+""+team1+" is "+""+team1_score);
		}
	 }
	 else
		{ if(bb.equals("bat"))
		{  team1_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
      System.out.println("total score of "+""+team1+" is "+""+team1_score);
	    }
		else
		{ team2_score=no_of_runs+4*no_of_fours+6*no_of_sixes+no_balls+ wides+leg_byes;
	     System.out.println("total score of "+""+team2+" is "+""+team2_score);
		}
		}
	 }
void result_of_match()
{
	if(team1_score>team2_score)
	{ dif=team1_score-team2_score;
	System.out.println(""+team1+" wins by"+" "+dif+" runs over "+""+team2);
	} 
	else if(team1_score==team2_score)
	{ System.out.println("Match tied between "+""+team1+" and "+""+team2);
    }
	else
	{dif=team2_score-team1_score;
     System.out.println(""+team2+" wins by"+" "+dif+" runs over "+""+team1);
	} 
}

	 public static void main(String args[])
	 { Cricket c=new Cricket();
	   c.date();
	   c.First_Innings_details();
	   c.team1_scorecard();
	   c.second_Innings_details();
	   c.team2_scorecard();
	   c.result_of_match();
	 }
}
