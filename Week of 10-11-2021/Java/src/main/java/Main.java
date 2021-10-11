import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {

    }

    public static void java1()
    {
        HashMap<Integer, String> hashMap = new HashMap<>();


    }

    public static boolean java2(String string1, String string2)
    {
        int string2Index = -1;
        for(int i = 0; i < string2.length(); i++)
        {
            if(string1.charAt(0) == string2.charAt(i))
            {
                string2Index = i+1;
                break;
            }
        }
        if(string2Index < 0)
            return false;
        else
        {
            for(int i = 1; i < string1.length(); i++)
            {
                if(string1.charAt(i) != string2.charAt(string2Index))
                {
                    return false;
                }
                string2Index++;
                if(string2Index >= string2.length())
                    string2Index = 0;
            }
        }
        return true;
    }
}
