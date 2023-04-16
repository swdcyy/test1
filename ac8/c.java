package ac8.c;
import ja8.f;
import com.mini.js.jsapi.ui.MiniAppMenuInvokeApi;
import java.lang.Object;
import ja8.e;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import na8.a;
import ga8.g;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.b;
import androidx.fragment.app.FragmentActivity;
import ma8.i;
import com.mini.widget.activity.MiniActivity;
import com.mini.widget.capsule.a;
import java.lang.Boolean;
import android.graphics.Rect;
import n88.b;
import j98.a;
import android.app.Application;
import zi8.p;
import android.content.Context;
import zi8.y0;
import zi8.m1;
import com.mini.widget.capsule.CapsuleView;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout;
import java.lang.StringBuilder;
import com.mini.d;
import com.mini.js.helper.a;
import com.mini.js.jsapi.ui.MiniAppMenuInvokeApi$Data;
import com.mini.js.jsapi.ui.MiniAppMenuInvokeApi$a;

public final class c implements f	// class@000061
{
    public final MiniAppMenuInvokeApi a;

    public void c(MiniAppMenuInvokeApi p0){
       this.a = p0;
    }
    public final String a(e p0){
       Application obj1;
       Rect rect;
       a c1;
       Object[] objArray;
       c ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MiniAppMenuInvokeApi miniAppMenuI = MiniAppMenuInvokeApi.class;
       String str = PatchProxy.applyOneRefs(p0, ta, miniAppMenuI, "1");
       if (str != patchProxyRe) {
       }else {
          a c = ta.c;
          c.b(c.j(p0), p0);
          FragmentActivity uFragmentAct = ta.b.g();
          c = (uFragmentAct instanceof MiniActivity)? uFragmentAct.N2(): null;
          if (c != null) {
             a obj = PatchProxy.applyOneRefs(c, ta, miniAppMenuI, "3");
             int b = (obj != patchProxyRe)? obj.booleanValue(): new Rect().equals(c.getMenuButtonBounding());
             if (b) {
             label_0094 :
                obj1 = PatchProxy.apply(null, ta, miniAppMenuI, "4");
                if (obj1 != patchProxyRe) {
                   rect = obj1;
                }else {
                   CapsuleView uCapsuleView = new CapsuleView(p.a());
                   uCapsuleView.measure(View$MeasureSpec.makeMeasureSpec(0x1fffffff, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(0x1fffffff, Integer.MIN_VALUE));
                   int i = m1.m(p.a()) - uCapsuleView.getMarginRightInPxUnit();
                   int i1 = i - uCapsuleView.getMeasuredWidth();
                   b = (ta.b.i().Q().F0())? CapsuleView.getMarginTopOfHalfPagePx(): CapsuleView.getMarginTopOfFullPagePx();
                   Rect rect1 = new Rect(i1, b, i, (uCapsuleView.getMeasuredHeight() + b));
                   d.c("ApiRegistry", "manualCalculateCapsuleViewRect rect : "+rect1);
                   rect = rect1;
                }
             }else {
                rect = c.getMenuButtonBounding();
                obj = ta.b;
                obj1 = PatchProxy.applyTwoRefs(rect, obj, ta, miniAppMenuI, "2");
                if (obj1 != patchProxyRe) {
                   rect = obj1;
                }else {
                   a uoa = obj.i().Q();
                   if (uoa.F0()) {
                      obj1 = p.a();
                      y0.a(obj1);
                      int i2 = uoa.l();
                      if (i2 > 0) {
                         rect.offset(false, (- ((m1.k(obj1) + m1.o(obj1)) - i2)));
                      }
                   }
                }
             }
          }else {
             goto label_0094 ;
          }
          if (rect == null) {
             c1 = ta.c;
             c1.h(c1.e(p0, 0, -1, "rect is null", false), p0);
             str = a.c(p0, false);
          }else {
             MiniAppMenuInvokeApi$Data uData = new MiniAppMenuInvokeApi$Data(ta, null);
             uData.width = (float)m1.u((float)rect.width());
             uData.height = (float)m1.u((float)rect.height());
             uData.top = (float)m1.u((float)rect.top);
             uData.right = (float)m1.u((float)rect.right);
             uData.bottom = (float)m1.u((float)rect.bottom);
             uData.left = (float)m1.u((float)rect.left);
             rect.toString();
             c1 = ta.c;
             c1.h(c1.e(p0, 0, 0, "", true), p0);
             str = a.k(p0, true, uData, null);
          }
       }
       return str;
    }
}
