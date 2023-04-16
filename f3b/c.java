package f3b.c;
import f3b.v;
import java.lang.String;
import com.google.common.collect.ImmutableList;
import y2b.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c extends v	// class@00287f
{
    public final String a;
    public final ImmutableList b;
    public final b c;
    public final ImmutableList d;

    public void c(String p0,ImmutableList p1,b p2,ImmutableList p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public ImmutableList b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof v) {
          return false;
       }
       c ta = this.a;
       if (ta == null) {
          if (p0.g() == null) {
          label_0033 :
             ta = this.b;
             if (ta == null) {
                if (p0.b() != null) {
                label_0073 :
                   b = false;
                label_0074 :
                   return b;
                }
             }else if(ta.equals(p0.b())){
             }
             ta = this.c;
             if (ta == null) {
                if (p0.i() != null) {
                }
             }else if(ta.equals(p0.i())){
             }
             ta = this.d;
             if (ta == null) {
                if (p0.j() == null) {
                   goto label_0074 ;
                }else {
                   goto label_0073 ;
                }
             }else if(ta.equals(p0.j())){
                goto label_0074 ;
             }else {
                goto label_0073 ;
             }
          }else {
             goto label_0073 ;
          }
       }else if(ta.equals(p0.g())){
          goto label_0033 ;
       }else {
          goto label_0073 ;
       }
    }
    public String g(){
       return this.a;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj == null)? 0: obj.hashCode();
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       c tb = this.b;
       int i3 = (tb == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       tb = this.c;
       i3 = (tb == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       c td = this.d;
       if (td != null) {
          i = td.hashCode();
       }
       return (i1 ^ i);
    }
    public b i(){
       return this.c;
    }
    public ImmutableList j(){
       return this.d;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Transferable{ksOrderId="+this.a+", entryTag="+this.b+", stidData="+this.c+", userRouteTrace="+this.d+"}";
    }
}
