package cf9.a$b;
import ze9.a;
import cf9.a;
import java.lang.Object;
import java.lang.String;
import ze9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import android.content.res.Resources;
import lnc.a1;

public final class a$b implements a	// class@0005da
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,float p2,float p3,String p4){
       a p1;
       e uoe;
       Activity uActivity;
       Drawable drawable;
       e p2;
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       a.p(p4, "msg");
       Object[] objArray1 = new Object[0];
       a.D().s("PlatformMagicDebugController", "onCallback msg: "+p4, objArray1);
       a p = this.a.p;
       if (p != null && (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), p, e.class, "3"))) {
          p2 = p.p;
          if (p2 != null) {
             p2.setText(p.b0(p0));
          }
       }
       if (p2 - (float)0 > 0) {
          p1 = this.a.p;
          if (p1 != null && (!PatchProxy.isSupport(e.class) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(p3), p1, e.class, "4") && p1.s != null))) {
             e q = p1.q;
             if (q == null || q.getVisibility()) {
                q = p1.q;
                if (q != null) {
                   q.setVisibility(0);
                }
             }
             q = p1.q;
             if (q != null) {
                q.setText(p1.c0(p3));
             }
             if (p1.s != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p3), p1, e.class, "10")) {
                   e r = p1.r;
                   if (r != null) {
                      r.setCompoundDrawablePadding(e.y);
                      if (p3 - p1.u <= 0) {
                         uoe = PatchProxy.apply(null, p1, e.class, "11");
                         if (uoe != patchProxyRe) {
                         }else if(p1.v == null){
                            uActivity = p1.u();
                            a.o(uActivity, "context");
                            drawable = uActivity.getResources().getDrawable(R.drawable.arg_RES_7f080681);
                            p1.v = drawable;
                            if (drawable != null) {
                               drawable.setBounds(0, 0, e.x, e.x);
                            }
                         }
                         uoe = p1.v;
                         a.m(uoe);
                         r.setCompoundDrawables(uoe, null, null, null);
                         r.setText(a1.p(R.string.arg_RES_7f103c98));
                         r.setSelected(0);
                      }else {
                         uoe = PatchProxy.apply(null, p1, e.class, "12");
                         if (uoe != patchProxyRe) {
                         }else if(p1.w == null){
                            uActivity = p1.u();
                            a.o(uActivity, "context");
                            drawable = uActivity.getResources().getDrawable(R.drawable.arg_RES_7f080682);
                            p1.w = drawable;
                            if (drawable != null) {
                               drawable.setBounds(0, 0, e.x, e.x);
                            }
                         }
                         uoe = p1.w;
                         a.m(uoe);
                         r.setCompoundDrawables(uoe, null, null, null);
                         r.setText(a1.p(R.string.arg_RES_7f103c9a));
                         r.setSelected(1);
                      }
                   }
                }
             }
          }
       }
    label_0166 :
       return;
    }
}
