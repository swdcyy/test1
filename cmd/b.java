package cmd.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.List;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@00033e
{
    public final boolean a;
    public final boolean b;
    public final Size c;
    public final float d;
    public final float e;
    public final float f;
    public final List g;
    public final int h;
    public final float i;
    public final float j;

    public void b(boolean p0,boolean p1,Size p2,float p3,float p4,float p5,List p6,int p7,float p8,float p9,int p10,u p11){
       if (p10 & 0x01) {
          p0 = false;
       }
       if (p10 & 0x02) {
          p1 = false;
       }
       if (p10 & 0x04) {
          p2 = new Size(-1, -1);
       }
       if (p10 & 0x10) {
          p4 = 0x3f800000;
       }
       if (p10 & 0x20) {
          p5 = 0x3f800000;
       }
       if (p10 & 0x40) {
          p6 = CollectionsKt__CollectionsKt.E();
       }
       if (p10 & 0x0080) {
          p7 = 0;
       }
       if (p10 & 0x0100) {
          p8 = 0x3f000000;
       }
       if (p10 & 0x0200) {
          p9 = 0x3f000000;
       }
       a.p(p2, "previewSize");
       a.p(p6, "assetIdentifier");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       return;
    }
    public final List a(){
       return this.g;
    }
    public final float b(){
       return this.d;
    }
    public final Size c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && (!Float.compare(this.d, p0.d) && (!Float.compare(this.e, p0.e) && (!Float.compare(this.f, p0.f) && (a.g(this.g, p0.g) && (this.h == p0.h && (!Float.compare(this.i, p0.i) && !Float.compare(this.j, p0.j)))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       b tc;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       b tb = this.b;
       if (tb == null) {
          tc = tb;
       }
       i1 = (i1 + i) * 31;
       tc = this.c;
       int i2 = 0;
       i = (tc != null)? tc.hashCode(): 0;
       i1 = (((((((i1 + i) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31;
       tc = this.g;
       if (tc != null) {
          i2 = tc.hashCode();
       }
       return (((((((i1 + i2) * 31) + this.h) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(this.j));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StickerPreviewInfo\(isPictureType="+this.a+", isOriginPhotoMovie="+this.b+", previewSize="+this.c+", containerWidth="+this.d+", globalScale="+this.e+", assetTransformedScale="+this.f+", assetIdentifier="+this.g+", assetSize="+this.h+", moveX="+this.i+", moveY="+this.j+"\)";
    }
}
