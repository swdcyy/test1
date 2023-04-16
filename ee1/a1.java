package ee1.a1;
import yv4.d;
import u71.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.nio.ByteBuffer;

public class a1 implements d	// class@0020fa
{
    public final f a;

    public void a1(f p0){
       super();
       this.a = p0;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, a1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.a();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.b();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, a1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.c();
    }
    public int getColorSpaceValue(){
       Object obj = PatchProxy.apply(null, this, a1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getColorSpaceValue();
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, a1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getHeight();
    }
    public int getRotation(){
       Object obj = PatchProxy.apply(null, this, a1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getRotation();
    }
    public int getTextureId(){
       Object obj = PatchProxy.apply(null, this, a1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getTextureId();
    }
    public long getTimestamp(){
       Object obj = PatchProxy.apply(null, this, a1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.getTimestamp();
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, a1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getWidth();
    }
    public ByteBuffer n(){
       Object obj = PatchProxy.apply(null, this, a1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.n();
    }
}
