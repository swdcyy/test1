package ok.b$u;
import ok.b$q;
import java.lang.Integer;
import java.lang.String;

public final class b$u extends b$q	// class@002045
{
    public static final int q;
    public static final b$u r;

    static {
       b$u.q = Integer.numberOfLeadingZeros(31);
       b$u.r = new b$u();
    }
    public void b$u(){
       super("CharMatcher.whitespace\(\)");
    }
    public boolean f(char p0){
       boolean b = (("\x20\x02\x30\x02\r\x85\x20\x02\x20\x02\x20\x02\x30\x02\x20\x02\x0b\x30\x02\x20\x02\x20\x02\x20\x02\x30\x02\x16\x02\t \x20\x02\x20\x02\x20\x02\xa0\f\x20\x02\x30\x02\x20\x02\x30\x02\x30\x02\x20\x02\n\x20\x02\x30\x02\x00").charAt(((0x6449bf0a * p0) >> b$u.q)) == p0)? true: false;
       return b;
    }
}
