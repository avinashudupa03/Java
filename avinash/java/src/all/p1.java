package all;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        String s="Java";
        s.split("a");
        System.out.println(s);
        String s2="java@gmail.com";
        String a[]=s2.split("@");
        System.out.println(s2.replace("Java","c"));
        String s3="python java c";
        System.out.println(s3.replaceFirst("java","c"));
        String n="Java";
        System.out.println(n.replaceAll("J","j"));
        String ph="123-456-789";
        String html="<p>Hello</p><p>World</p>";
        System.out.println(html.replace("<p>","").replace("</p>",""));

        String p="java";
        int q=10;
        System.out.println(p+q);
        String br[]={"Java","Python","panda"};
        System.out.println(String.join(":",br));

        String p1="Java";
        System.out.println((p1.matches("^[A-Z].*")));

        String p2="werghjyuil@vbnm,";
        System.out.println(p2.matches(".*[^A-Z,a-z,0-9].*"));

        String p3="Java#1234";
        System.out.println(p3.replaceAll(".*[^A-Z,a-z,0-9].*",""));

        String p4="JAva123";
        System.out.println(p4.replaceAll("\\d",""));

        String name="John Deo smith";
        int start=name.indexOf(" ");
        int end=name.lastIndexOf("");
        System.out.println(name.substring(start,end));

        String email="Javaaaa@gmail.com";
        System.out.println(email.substring(email.indexOf("@")+1));

        String p5="123412349";
        System.out.println(p5.matches(".*[0-9].*"));

        String p6="Java&456";
        if(p6.length()>10&&p6.matches(".*[^A-Z,a-z,0-9].*")&&p6.matches(".*[^A-Z,a-z,0-9].*"))
        {
            System.out.println("String Password");
        }
        else{
            System.out.println("weak");
        }

        String mail="javaaa@gmail.com";
        String m[]=mail.split("@");
        System.out.println(Arrays.toString(m));

    }
}
