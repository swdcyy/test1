package ah5.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ah5.a;
import ah5.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.widget.LinearLayout;
import java.util.List;
import ah5.c$b;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.HorizontalScrollView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.widget.TextView;
import rkd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zg5.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import ah5.b;
import erd.g;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import java.util.Objects;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import com.kwai.component.tabs.panel.c;
import com.yxcorp.utility.n;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.FrameLayout$LayoutParams;
import yg5.j0;
import mrd.c;

public class c extends PresenterV2	// class@0000a2
{
    public TabsPanelHostFragment p;
    public List q;
    public View r;
    public c s;
    public final b t;
    public PagerSlidingTabStrip$e u;

    public void c(){
       super();
       this.t = new a(this);
       this.u = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       LinearLayout tabsContaine = this.p.zh().getTabsContainer();
       int i = 0;
       boolean b = true;
       if (this.q.size() > b) {
          tabsContaine.setDividerDrawable(new c$b(this, i));
          tabsContaine.setShowDividers(2);
          this.p.zh().setScrollSelectedTabToCenter(b);
          this.p.zh().getLayoutParams().bottomMargin = a1.e(8.00f);
          if (this.r != null) {
             this.p.zh().a(this.u);
          }
          this.p.zh().setTabGravity(19);
       }else {
          this.p.zh().setTabGravity(17);
          if (this.p.zh().getLayoutParams() instanceof RelativeLayout$LayoutParams) {
             this.p.zh().getLayoutParams().removeRule(i);
          }
       }
       while (i < tabsContaine.getChildCount()) {
          View childAt = tabsContaine.getChildAt(i);
          if (childAt instanceof TextView) {
             childAt.setSingleLine();
          }else if(childAt != null){
             childAt = childAt.findViewById(R.id.tab_text);
             if (childAt instanceof TextView) {
                childAt.setSingleLine();
             }
          }
          i = i + 1;
       }
       if (b.b()) {
          this.X7(RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new b(this)));
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().i3(this.t);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.p.zh().s(this.u);
       if (b.b() && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.t);
       }
       return;
    }
    public final void P8(a p0){
       int i1;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          Objects.requireNonNull(tp);
          if (!PatchProxy.applyVoidOneRefs(p0, tp, TabsPanelHostFragment.class, "25")) {
             TabsPanelHostFragment t = tp.T;
             if (t == null || (!PatchProxy.applyVoidOneRefs(p0, t, c.class, str) && (t.n != null && t.b != null))) {
                c a = t.a;
                if (a != null && p0 != null) {
                   int i = n.j(a) - n.A(t.a);
                   if (t.b.getLayoutParams() instanceof FrameLayout$LayoutParams) {
                      FrameLayout$LayoutParams layoutParams = t.b.getLayoutParams();
                      if (p0.a != null) {
                         t.j(t.b, layoutParams, i);
                      }else if(t.n.e() == -1){
                         i1 = -2;
                      }else {
                         i1 = t.n.e();
                      }
                      if (i1 > 0) {
                         t.b.getLayoutParams().height = i1;
                      }
                      layoutParams.bottomMargin = 0;
                      t.b.setLayoutParams(layoutParams);
                   }
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a3cb9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.p = this.q8(TabsPanelHostFragment.class);
       this.q = this.q8(List.class);
       this.s = this.r8("COMMENT_PANEL_TITLE_VIEW_INFLATE");
       return;
    }
}
