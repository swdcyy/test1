package m1.a;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import z1.h;
import android.os.Build$VERSION;
import android.content.LocusId;
import m1.a$a;
import java.lang.StringBuilder;
import java.lang.Class;

public final class a	// class@00259f
{
    public final String a;
    public final LocusId b;

    public void a(String p0){
       super();
       h.j(p0, "id cannot be empty");
       this.a = p0;
       this.b = (Build$VERSION.SDK_INT >= 29)? a$a.a(p0): null;
       return;
    }
    public static a d(LocusId p0){
       h.h(p0, "locusId cannot be null");
       String str = a$a.b(p0);
       h.j(str, "id cannot be empty");
       return new a(str);
    }
    public String a(){
       return this.a;
    }
    public final String b(){
       return (this.a).length()+"_chars";
    }
    public LocusId c(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (a.class != p0.getClass()) {
          return false;
       }
       a ta = this.a;
       if (ta != null) {
          return ta.equals(p0.a);
       }
       if (p0.a != null) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       a ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return (31 + i);
    }
    public String toString(){
       return "LocusIdCompat["+this.b()+"]";
    }
}
