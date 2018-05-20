public class ch_16_15
{
    /*
    Write a method called notEquals that accepts a second list as a parameter, returns true if the two lists are not
    equal, and returns false otherwise. Two lists are considered unequal if they store the different values in any random
    order and do not have the same length.
    */

    public static void main(String[] args)
    {
        LinkedIntList LL = new LinkedIntList();
        LL.add(1);
        LL.add(2);
        LL.add(3);

        LinkedIntList LI = new LinkedIntList();
        LI.add(1);
        LI.add(2);
        LI.add(3);

        System.out.println(notEquals(LL, LI));

    }

    public static boolean notEquals(LinkedIntList list1, LinkedIntList list2) {
        for (int i = 0; i < list1.size() ; i++)
        {
            if (list1.get(i) == list2.get(i)) {
                if (list1.size() == list2.size()) {
                    return true;
                }
            }
            else
                return false;
        }
        return false;
    }
}

