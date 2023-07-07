public class Twofer {
    public String twofer(String name) {
        String str1 = "One for ";
        String str2 = ", one for me.";
        if(name == null )
        {
            str1 = str1 + "you" + str2;
            return str1;
        }
        else
        {
            str1 = str1 + name + str2;
            return str1;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
