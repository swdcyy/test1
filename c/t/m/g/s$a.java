package c.t.m.g.s$a;
import java.lang.Object;
import java.lang.String;

public class s$a	// class@000ca5
{
    public int a;
    public int b;

    public void s$a(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int a(String p0){
       int i = p0.length();
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i3 = this.b * i2;
          i2 = p0.charAt(i1) + i3;
       }
       return ((this.a - 1) & i2);
    }
}
