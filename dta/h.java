package dta.h;
import lr6.c;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import wq6.h;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import java.util.Objects;
import dta.l0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.MotionEvent;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import kotlin.jvm.internal.a;
import bo5.a;
import wq6.f;
import zq6.p;
import co5.n;
import co5.m;
import co5.j;
import co5.f;
import co5.h;
import co5.q;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import jn5.g;
import wq6.g;
import yq6.d;
import do5.a;
import com.google.android.material.tabs.c;
import java.lang.Boolean;
import yq6.a;
import msd.l;

public final class h implements c	// class@002534
{
    public final a a;

    public void h(a p0){
       this.a = p0;
    }
    public final void a(h p0,View p1){
       h oh = p0;
       h a = this.a;
       a q = a.q;
       Activity activity = a.getActivity();
       List list = a.W8(oh);
       Objects.requireNonNull(q);
       if (PatchProxy.applyVoidFourRefs(p0, p1, activity, list, q, l0.class, "2")) {
       }else if(q.c == null){
          q.a(MotionEvent.obtain(0, 0, 1, 0, 0, 0), list);
       }
       boolean b = false;
       q.c = b;
       ReddotRecordHelper e = ReddotRecordHelper.e;
       l0 a1 = q.a;
       Objects.requireNonNull(e);
       a.p(a1, "controller");
       a.p(oh, "tab");
       p y = a.y;
       a.o(y, "HomeTopStateId.TAB_RED_DOT_NOTIFY");
       n on = e.b(a1, oh, y);
       if (on == null || on.a != 1) {
          y = a.z;
          a.o(y, "HomeTopStateId.TAB_NUMBER_NOTIFY");
          m om = e.b(a1, oh, y);
          if (om == null || om.a != 1) {
             y = a.A;
             a.o(y, "HomeTopStateId.TAB_IMAGE_NOTIFY");
             j oj = e.b(a1, oh, y);
             if (oj == null || oj.a != 1) {
                y = a.G;
                a.o(y, "HomeTopStateId.TAB_AVATAR");
                f uof = e.b(a1, oh, y);
                if (uof == null || uof.a != 1) {
                   y = a.J;
                   a.o(y, "HomeTopStateId.TAB_DOUBLE_AVATAR");
                   h oh1 = e.b(a1, oh, y);
                   if (oh1 == null || oh1.a != 1) {
                      y = a.K;
                      a.o(y, "HomeTopStateId.TAB_TRIPLE_AVATAR");
                      q oq = e.b(a1, oh, y);
                      if (oq == null || oq.a != 1) {
                      label_00c3 :
                         if (b) {
                            e.c(a.c(p0.M2()));
                         }
                         g.i(a.c(p0.M2()));
                         if (oh.equals(q.a.j()) ^ 1) {
                            q.b = true;
                         }else {
                            q.a.d().a(a.a, c.b, Boolean.FALSE);
                         }
                      }
                   }
                }
             }
          }
       }
       b = true;
       goto label_00c3 ;
       return;
    }
}
