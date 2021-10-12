import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer, Character> hashMap = new HashMap<>();
        for(int i = 0; i < 10; i++)
        {
            hashMap.put(i, (char) (i+33));
        }
        System.out.println("Java Challenge 1\n");
        java1(hashMap);
        System.out.println();

        String string1 = "abcd";
        String string2 = "dabc";
        System.out.println("Java Challenge 2\n");
        System.out.println(string1 + " " + string2);
        System.out.println(java2(string1, string2));
    }

    public static <T, K> void java1(HashMap<T,K> hashMap)
    {
        Set<T> keys = hashMap.keySet();

        System.out.println("Advanced For Loop");
        for (T key: keys)
        {
            System.out.println(key + ": " + hashMap.get(key));
        }

        System.out.println("While Loop");
        Iterator<T> iterator = keys.iterator();
        while (iterator.hasNext())
        {
            T key = iterator.next();
            System.out.println(key + ": " + hashMap.get(key));
        }
    }

    public static boolean java2(String string1, String string2)
    {
        int string2Index = -1;
        for(int i = 0; i < string2.length(); i++)
        {
            if(string1.charAt(0) == string2.charAt(i))
            {
                string2Index = i+1;
                if(string2Index >= string2.length())
                    string2Index = 0;
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
