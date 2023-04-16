package com.kwai.nearby.local.presenter.secondary.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ed7.h;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout$a;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout;
import java.lang.Float;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.widget.RelativeLayout;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.HomeEnterCoordinatorLayout;
import com.kwai.nearby.local.presenter.secondary.d;
import com.yxcorp.gifshow.widget.NestedCoordinatorLayout$a;
import com.yxcorp.gifshow.widget.NestedCoordinatorLayout;

public class e extends PresenterV2	// class@000fd4
{
    public View p;
    public TextView q;
    public View r;
    public KwaiActionBar s;
    public ClipLayout t;
    public HomeEnterCoordinatorLayout u;
    public RefreshLayout v;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.P8(0);
       e tt = this.t;
       if (tt != null) {
          tt.setOnOffsetChangedListener(new h(this));
       }
       return;
    }
    public final void P8(float p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "3")) {
          return;
       }
       this.q.setAlpha(p0);
       float f = 0x3f800000;
       this.r.setAlpha((f - p0));
       if (!p0 - f) {
          this.s.setBackgroundColor(ContextCompat.getColor(this.getActivity(), R.color.arg_RES_7f06008d));
       }else {
          this.s.setBackgroundColor(ContextCompat.getColor(this.getActivity(), R.color.arg_RES_7f06202f));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a125b);
       this.s = m1.f(p0, 0x7f0a3f6a);
       this.q = m1.f(p0, 0x7f0a3f7b);
       this.r = m1.f(p0, 0x7f0a1257);
       this.t = m1.f(p0, 0x7f0a0780);
       this.v = m1.f(p0, 0x7f0a3537);
       HomeEnterCoordinatorLayout homeEnterCoo = m1.f(p0, R.id.coordinator_layout_sub_entrance);
       this.u = homeEnterCoo;
       homeEnterCoo.setBubbleScrollOrderSupplier(d.a);
       ClipLayout uClipLayout = m1.f(p0, R.id.cliplayout);
       this.t = uClipLayout;
       this.u.setClipLayout(uClipLayout);
       this.u.setRefreshLayout(this.v);
       return;
    }
    public void j8(){
    }
}
