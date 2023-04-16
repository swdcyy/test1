package q90.l;
import java.lang.Runnable;
import q90.f;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import oa0.a;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import q90.j;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class l implements Runnable	// class@002996
{
    public final f b;
    public final List c;

    public void l(f p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String obj;
       SharedPreferences$Editor uEditor;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "1")) {
          return;
       }
       l tb = this.b;
       l tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, f.class, "35") && (!PostExperimentUtils.o() || (PostExperimentUtils.m0() == 1 && (a.a.getBoolean("toolbox_tab_kuaishan_recent_viewed_bubble", true) && (PostExperimentUtils.m0() != 2 || a.a.getBoolean("toolbox_tab_kuaishan_recent_used_bubble", true)))))) {
          Iterator iterator = tc.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                if (a.g(obj.mId, "999")) {
                   objArray = obj;
                }
             }
             if (objArray != null) {
                Activity activity = tb.getActivity();
                a.m(activity);
                Objects.requireNonNull(activity);
                a$c uoc = new a$c(activity);
                f p = tb.p;
                obj = "mPagerTabStrip";
                if (p == null) {
                   a.S(obj);
                }
                if (p.i == true) {
                   p = tb.p;
                   if (p == null) {
                      a.S(obj);
                   }
                   uoc.o0(p.getChildAt(0));
                }else {
                   p = tb.p;
                   if (p == null) {
                      a.S(obj);
                   }
                   View childAt = p.g.getChildAt(0);
                   f p1 = tb.p;
                   if (p1 == null) {
                      a.S(obj);
                   }
                   View childAt1 = p1.g.getChildAt(true);
                   int[] ointArray = a$c.f0(childAt, BubbleInterface$Position.BOTTOM);
                   a.o(childAt1, "secondTabView");
                   a.o(childAt, "firstTabView");
                   ointArray[0] = (ointArray[0] + (childAt1.getWidth() / 2)) + (childAt.getWidth() / 2);
                   ointArray[1] = ointArray[1] - tb.E;
                   uoc.n0(ointArray[0], ointArray[1]);
                }
                p = (PostExperimentUtils.m0() == 1)? 1: 0;
                uoc.D0(BubbleInterface$Position.BOTTOM);
                int i = (p)? 0x7f101ba2: 0x7f101bec;
                uoc.F0(a1.p(i));
                uoc.u0(3);
                uoc.s0(a1.e(242.00f));
                uoc.A(true);
                uoc.T(3000);
                uoc.P(true);
                uoc.K(new j(tb));
                tb.G = p.e(uoc);
                if (p) {
                   uEditor = a.a.edit();
                   uEditor.putBoolean("toolbox_tab_kuaishan_recent_viewed_bubble", 0);
                   g.a(uEditor);
                   break ;
                }else {
                   uEditor = a.a.edit();
                   uEditor.putBoolean("toolbox_tab_kuaishan_recent_used_bubble", 0);
                   g.a(uEditor);
                   break ;
                }
             }
          }
       }
    label_013e :
       return;
    }
}
