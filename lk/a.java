package lk.a;
import com.google.archivepatcher.shared.PatchConstants$DeltaFormat;
import nk.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.Enum;

public class a	// class@002560
{
    public final PatchConstants$DeltaFormat a;
    public final b b;
    public final b c;
    public final long d;

    public void a(PatchConstants$DeltaFormat p0,b p1,b p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (a.class != p0.getClass()) {
          return false;
       }
       a tc = this.c;
       if (tc == null) {
          if (p0.c != null) {
             return false;
          }
       }else if(!tc.equals(p0.c)){
          return false;
       }
       tc = this.b;
       if (tc == null) {
          if (p0.b != null) {
             return false;
          }
       }else if(!tc.equals(p0.b)){
          return false;
       }
       if (this.d - p0.d) {
          return false;
       }else if(this.a != p0.a){
          return false;
       }else {
          return true;
       }
    }
    public int hashCode(){
       a tc = this.c;
       int i = 0;
       int i1 = (tc == null)? 0: tc.hashCode();
       i1 = (i1 + 31) * 31;
       a tb = this.b;
       int i2 = (tb == null)? 0: tb.hashCode();
       tb = this.d;
       i1 = (((i1 + i2) * 31) + (int)(tb ^ (tb >> 32))) * 31;
       a ta = this.a;
       if (ta != null) {
          i = ta.hashCode();
       }
       return (i1 + i);
    }
}
