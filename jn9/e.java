package jn9.e;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import java.lang.String;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@002b1b
{
    public final c a;
    public final PostListComponentView$b b;
    public final PostListComponentView$a c;
    public final b d;
    public final String e;
    public final SelectScrollOption f;

    public void e(c p0,PostListComponentView$b p1,PostListComponentView$a p2,b p3,String p4,SelectScrollOption p5,int p6,u p7){
       String str = null;
       if (p6 & 0x04) {
          p2 = str;
       }
       if (p6 & 0x08) {
          p3 = str;
       }
       if (p6 & 0x10) {
          str = "";
       }
       if (p6 & 0x20) {
          p5 = SelectScrollOption.NONE;
       }
       a.p(p0, "mAdapterItemViewBinder");
       a.p(p1, "mOperationCallback");
       a.p(str, "mTag");
       a.p(p5, "mSelectScrollOption");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = str;
       this.f = p5;
       return;
    }
    public final PostListComponentView$b a(){
       return this.b;
    }
    public final String b(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && a.g(this.f, p0.f)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       e tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostListViewConfig\(mAdapterItemViewBinder="+this.a+", mOperationCallback="+this.b+", mItemClickEventInterceptor="+this.c+", mViewBinder="+this.d+", mTag="+this.e+", mSelectScrollOption="+this.f+"\)";
    }
}
