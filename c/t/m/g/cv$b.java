package c.t.m.g.cv$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class cv$b extends Enum	// class@000c28
{
    public static final cv$b a;
    public static final cv$b b;
    public static final cv$b c;
    public static final cv$b d;
    public static final cv$b[] e;

    static {
       cv$b uob = new cv$b("Normal", 0);
       cv$b.a = uob;
       cv$b uob1 = new cv$b("Daemon", 1);
       cv$b.b = uob1;
       cv$b uob2 = new cv$b("Single", 2);
       cv$b.c = uob2;
       cv$b uob3 = new cv$b("Stop", 3);
       cv$b.d = uob3;
       cv$b[] uobArray = new cv$b[]{uob,uob1,uob2,uob3};
       cv$b.e = uobArray;
    }
    public void cv$b(String p0,int p1){
       super(p0, p1);
    }
    public static cv$b valueOf(String p0){
       return Enum.valueOf(cv$b.class, p0);
    }
    public static cv$b[] values(){
       return cv$b.e.clone();
    }
}
