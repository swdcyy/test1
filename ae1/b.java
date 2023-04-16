package ae1.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Float;
import java.lang.StringBuilder;

public final class b	// class@000066
{
    public float a;
    public float b;
    public float c;
    public float d;
    public String e;

    public void b(){
       super(0xbf800000, 0xbf800000, 0xbf800000, 0xbf800000, null);
    }
    public void b(float p0,float p1,float p2,float p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final String a(){
       return this.e;
    }
    public final float b(){
       return this.d;
    }
    public final float c(){
       return this.b;
    }
    public final float d(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!p0 instanceof b) {
          return b;
       }
       obj = p0.e;
       if (obj != null && (obj.equals(this.e) == true && (!p0.a - this.a && (!p0.b - this.b && (!p0.c - this.c && !p0.d - this.d))))) {
          b = true;
       }
    label_0049 :
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31;
       b te = this.e;
       int i1 = (te != null)? te.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChatViewPosition\(chatViewPositionTop="+this.a+", chatViewPositionLeft="+this.b+", chatViewPositionWidth="+this.c+", chatViewPositionHeight="+this.d+", chatGuestId="+this.e+"\)";
    }
}
