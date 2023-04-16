package mmd.a;
import java.util.HashMap;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@001d30
{
    public final boolean a;
    public int b;
    public final HashMap c;
    public HashMap d;
    public final VideoSDKPlayerView e;

    public void a(boolean p0,int p1,HashMap p2,HashMap p3,VideoSDKPlayerView p4){
       a.p(p2, "attachAssetSize");
       a.p(p3, "attachTransformedScale");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(boolean p0,int p1,HashMap p2,HashMap p3,VideoSDKPlayerView p4,int p5,u p6){
       super(p0, p1, p2, p3, null);
    }
    public final HashMap a(){
       return this.c;
    }
    public final HashMap b(){
       return this.d;
    }
    public final int c(){
       return this.b;
    }
    public final VideoSDKPlayerView d(){
       return this.e;
    }
    public final boolean e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public final void f(int p0){
       this.b = p0;
    }
    public int hashCode(){
       int i;
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       i = ((i * 31) + this.b) * 31;
       a tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.e;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StickerAttachInfo\(isPictureType="+this.a+", containerWidth="+this.b+", attachAssetSize="+this.c+", attachTransformedScale="+this.d+", playerView="+this.e+"\)";
    }
}
