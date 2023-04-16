package fud.c$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;

public class c$a	// class@000ee7
{
    public int a;
    public long b;
    public byte[] c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;

    public void c$a(){
       super();
    }
    public String toString(){
       Object[] objArray = new Object[9];
       objArray[0] = c$a.class.getSimpleName();
       objArray[1] = Arrays.toString(this.c);
       objArray[2] = Integer.valueOf(this.g);
       objArray[3] = Boolean.valueOf(this.f);
       objArray[4] = Integer.valueOf(this.a);
       objArray[5] = Long.valueOf(this.b);
       objArray[6] = Integer.valueOf(this.h);
       objArray[7] = Integer.valueOf(this.d);
       objArray[8] = Integer.valueOf(this.e);
       return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", objArray);
    }
}
