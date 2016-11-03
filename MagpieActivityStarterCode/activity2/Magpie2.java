/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if(statement.indexOf("yes") >= 0)
        {
            response = "Mmmm that's nice ;)";
        }
        else if(statement.indexOf("maybe") >= 0)
        {
            response = "What's the hold up, why don't you just pick a side godammit?!?!?!";
        }
        else if(statement.indexOf("okay") >= 0) 
        {
            response = "Haha, and then what? ;)";
        }
        else if(statement.indexOf("depression") >= 0
        || statement.indexOf("sad") >= 0
        || statement.indexOf("existential feeling of self doubt") >= 0)
        {
            response = "Well we are all going to die one day, when the bell tolls, it tolls for thee and thee alone.";
        }

        else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("mom") >= 0
        || statement.indexOf("dad") >= 0
        || statement.indexOf("biological sister") >= 0
        || statement.indexOf("biological brother") >= 0
        || statement.indexOf("biological sibling") >= 0
        || statement.indexOf("sibling") >= 0
        || statement.indexOf("roach") >= 0
        || statement.indexOf("parasite") >= 0
        || statement.indexOf("the parasite that made me a middle child") >= 0
        || statement.indexOf("twin") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if(statement.indexOf("low self esteem") >= 0)
        {
            response = "It's okay, you don't have low self esteem, you just probably just have low esteem for other people. If not, get help.";
        }
        else if(statement.indexOf("people") >= 0)
        {
            response = "Yeah, people suck. It seems like I'm on another planet when I talk to them.";
        }
        else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if(statement.indexOf("Mr. Ettlin") >= 0)
        {
            response = "I guess he's aight?";
        }
        else if(statement.trim().length() == 0)
        {
            response = "Say something please.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}

