package lt1.c;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.View;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import lt1.d;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.Space;
import android.view.ViewParent;
import ekd.p1;

public final class c	// class@003024
{
    public final LinearLayout a;
    public final Context b;

    public void c(Context p0){
       a.p(p0, "context");
       super();
       this.b = p0;
       LinearLayout linearLayout = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (linearLayout != PatchProxyResult.class) {
       }else {
          linearLayout = new LinearLayout(p0);
          linearLayout.setBackgroundResource(R.drawable.arg_RES_7f0813be);
          linearLayout.setGravity(16);
          linearLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, a1.e(20.00f)));
       }
       this.a = linearLayout;
       return;
    }
    public static c d(c p0,View p1,Boolean p2,int p3,Object p4){
       p2 = (p3 & 0x02)? Boolean.FALSE: null;
       return p0.c(p1, p2);
    }
    public final c a(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.d(this, d.c(this.b, p0, p1, a1.e(10.00f)), null, 2, null);
    }
    public final c b(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "content");
       c.d(this, d.e(this.b, p0, R.color.arg_RES_7f0620c7), null, 2, null);
       return this;
    }
    public final c c(View p0,Boolean p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          return this;
       }
       if (this.a.getChildCount() > 0) {
          obj = this.a;
          c tb = this.b;
          Space space = PatchProxy.applyOneRefs(tb, null, d.class, "8");
          if (space != patchProxyRe) {
          }else {
             a.p(tb, "context");
             space = new Space(tb);
             space.setLayoutParams(new ViewGroup$LayoutParams(a1.e(4.00f), -1));
          }
          obj.addView(space);
       }
       this.a.addView(p0);
       if (a.g(p1, Boolean.TRUE) && (!PatchProxy.applyVoidOneRefs(p0, this, c.class, "5") && p0.getParent() != null)) {
          p1.c(p0, 0, 0, a1.d(R.dimen.arg_RES_7f07025d), a1.d(R.dimen.arg_RES_7f07025d));
       }
    label_0070 :
       return this;
    }
    public final View e(){
       return this.a;
    }
}
