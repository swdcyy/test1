package c.t.m.g.cg;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import java.lang.StringBuilder;

public abstract class cg	// class@000c0d
{
    public String a;
    public String b;
    public boolean c;

    public void cg(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = true;
    }
    public void a(){
    }
    public boolean a(Bundle p0){
       if (this.c == null) {
          return false;
       }
       return this.b(p0);
    }
    public abstract boolean b(Bundle p0);
    public String toString(){
       return "[name="+this.a+",desc="+this.b+",enabled="+this.c+"]";
    }
}
