package h80.m;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class m	// class@00210d
{
    public final Paint a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    public final List g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public void m(){
       String[] stringArray = new String[0];
       a.p(stringArray, "mAllNextTextList");
       super();
       this.a = null;
       this.b = true;
       this.c = false;
       this.d = false;
       this.e = false;
       this.f = stringArray;
       this.g = null;
       this.h = null;
       this.i = true;
       this.j = false;
       this.k = 1;
    }
    public final boolean a(){
       return this.j;
    }
    public final boolean b(){
       return this.d;
    }
    public final boolean c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && (this.i == p0.i && (this.j == p0.j && this.k == p0.k)))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i3;
       m obj = PatchProxy.apply(null, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       m tb = this.b;
       int i2 = 1;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.d;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.e;
       if (tb != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tb = this.f;
       i3 = (tb != null)? Arrays.hashCode(tb): 0;
       i1 = (i1 + i3) * 31;
       tb = this.g;
       i3 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tb = this.h;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       m ti = this.i;
       if (ti != null) {
          ti = 1;
       }
       i1 = (i1 + ti) * 31;
       ti = this.j;
       if (ti == null) {
          i2 = ti;
       }
       return (((i1 + i2) * 31) + this.k);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextCustomParam\(mTextSelectBoxPaint="+this.a+", mOffsetTextActionButtonRect="+this.b+", mEnableTextSelectBox="+this.c+", mForceUseDefaultTextOrder="+this.d+", mDisableDynamicTextConfig="+this.e+", mAllNextTextList="+Arrays.toString(this.f)+", mRegisterCustomTextId="+this.g+", mCoverTextIdList="+this.h+", mAllowSubtitle="+this.i+", mForceEnableTextRotate="+this.j+", mPhotoCropTextStickerTransformStrategy="+this.k+"\)";
    }
}
