package ok.b$e;
import ok.b$s;
import java.lang.String;

public final class b$e extends b$s	// class@002035
{
    public static final b$e s;

    static {
       b$e.s = new b$e();
    }
    public void b$e(){
       String str = "0\x06\x02\x06\x02\x07\x02\x09\x02\x09\x02\x0a\x02\x0a\x02\x0b\x02\x0b\x02\x0c\x02\x0c\x02\x0d\x02\x0d\x02\x0e\x02\x0e\x02\x0f\x02\x10\x02\x10\x02\x17\x02\x18\x02\x19\x02\x19\x02\x1a\x02\x1a\x02\x1b\x02\x1b\x02\x1c\x02\x1c\x02\xa6\x02\xa8\x02\xa9\x02\xa9\x02\xa9\x02\xaa\x02\xab\x02\xff\x02\x00";
       char[] uocharArray = str.toCharArray();
       char[] uocharArray1 = new char[37];
       for (int i = 0; i < 37; i = i + 1) {
          int i1 = str.charAt(i) + 9;
          uocharArray1[i] = (char)i1;
       }
       super("CharMatcher.digit\(\)", uocharArray, uocharArray1);
       return;
    }
}
