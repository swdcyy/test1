package nn9.b;
import mn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import java.lang.Throwable;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@0031e4
{
    public final a a;
    public final ItemLoadingStatus b;
    public int c;
    public final boolean d;
    public final int e;
    public final Throwable f;
    public final boolean g;
    public final boolean h;
    public final SelectScrollOption i;

    public void b(a p0,ItemLoadingStatus p1,int p2,boolean p3,int p4,Throwable p5,boolean p6,boolean p7,SelectScrollOption p8){
       a.p(p0, "mWrappedItem");
       a.p(p1, "mItemLoadingStatus");
       a.p(p8, "mSelectScrollOption");
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
    }
    public void b(a p0,ItemLoadingStatus p1,int p2,boolean p3,int p4,Throwable p5,boolean p6,boolean p7,SelectScrollOption p8,int p9,u p10){
       int i = p9;
       int i1 = (i & 0x04)? -1: p2;
       boolean b = (i & 0x08)? false: p3;
       int i2 = (i & 0x10)? -1: p4;
       boolean b1 = (i & 0x40)? false: p6;
       boolean b2 = (i & 0x0080)? true: p7;
       SelectScrollOption nONE = (i & 0x0100)? SelectScrollOption.NONE: 0;
       super(p0, p1, i1, b, i2, null, b1, b2, nONE);
       return;
    }
    public static b a(b p0,a p1,ItemLoadingStatus p2,int p3,boolean p4,int p5,Throwable p6,boolean p7,boolean p8,SelectScrollOption p9,int p10,Object p11){
       b uob = p0;
       int i = p10;
       b a = (i & 0x01)? uob.a: p1;
       b b = (i & 0x02)? uob.b: p2;
       b c = (i & 0x04)? uob.c: p3;
       b d = (i & 0x08)? uob.d: p4;
       b e = (i & 0x10)? uob.e: p5;
       b f = (i & 0x20)? uob.f: p6;
       b g = (i & 0x40)? uob.g: p7;
       b h = (i & 0x0080)? uob.h: p8;
       b i1 = (i & 0x0100)? uob.i: p9;
       Objects.requireNonNull(p0);
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[9];
          objArray[0] = a;
          objArray[1] = b;
          objArray[2] = Integer.valueOf(c);
          objArray[3] = Boolean.valueOf(d);
          objArray[4] = Integer.valueOf(e);
          objArray[5] = f;
          objArray[6] = Boolean.valueOf(g);
          objArray[7] = Boolean.valueOf(h);
          objArray[8] = i1;
          uob = PatchProxy.apply(objArray, p0, uob1, "3");
          if (uob != PatchProxyResult.class) {
          label_00c5 :
             return uob;
          }
       }
       a.p(a, "mWrappedItem");
       a.p(b, "mItemLoadingStatus");
       a.p(i1, "mSelectScrollOption");
       p0 = new b(a, b, c, d, e, f, g, h, i1);
       goto label_00c5 ;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getId();
    }
    public final int c(){
       return this.c;
    }
    public final boolean d(){
       return this.d;
    }
    public final ItemLoadingStatus e(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (p0 instanceof b)? TextUtils.equals(this.b(), p0.b()): false;
       return b;
    }
    public final int f(){
       return this.e;
    }
    public final a g(){
       return this.a;
    }
    public final boolean h(){
       return this.g;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.c) * 31;
       tb = this.d;
       int i3 = 1;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (((i1 + i2) * 31) + this.e) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.h;
       if (tb == null) {
          i3 = tb;
       }
       i1 = (i1 + i3) * 31;
       tb = this.i;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final boolean i(){
       boolean b = (this.b == ItemLoadingStatus.ITEM_LOADING)? true: false;
       return b;
    }
    public final void j(int p0){
       this.c = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostListComponentItemSubState\(mWrappedItem="+this.a+", mItemLoadingStatus="+this.b+", mIndex="+this.c+", mIsSelected="+this.d+", mLoadingProgress="+this.e+", mLoadingError="+this.f+", refreshFlag="+this.g+", mNotifySelected="+this.h+", mSelectScrollOption="+this.i+"\)";
    }
}
