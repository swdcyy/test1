package ho2.g;
import ho2.d;
import ho2.e;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import csd.b;
import qrd.l1;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.background.multiimage.Url;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.background.multiimage.LottieConfig;
import java.lang.StringBuilder;

public final class g extends d	// class@002de3
{
    public final Url _src;
    public final Map assets;
    public final LottieConfig config;
    public final int height;
    public final int width;
    public final int x;
    public final int y;

    public Object a(e p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.a(this, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public final Map b(){
       return this.assets;
    }
    public final Url c(){
       g obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._src;
       if (obj != null) {
          return obj;
       }
       throw new IllegalArgumentException("lottie don\'t have src");
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (a.g(this._src, p0._src) && (this.width == p0.width && (this.height == p0.height && (this.x == p0.x && (this.y == p0.y && (a.g(this.assets, p0.assets) && a.g(this.config, p0.config))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this._src;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((((((i1 * 31) + this.width) * 31) + this.height) * 31) + this.x) * 31) + this.y) * 31;
       g tassets = this.assets;
       int i2 = (tassets != null)? tassets.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tassets = this.config;
       if (tassets != null) {
          i = tassets.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Lottie\(_src="+this._src+", width="+this.width+", height="+this.height+", x="+this.x+", y="+this.y+", assets="+this.assets+", config="+this.config+"\)";
    }
}
