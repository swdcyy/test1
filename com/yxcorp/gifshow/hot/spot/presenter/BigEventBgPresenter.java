package com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter$a;
import nsd.u;
import vua.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.hot.spot.presenter.BigEventBgPresenter$onCreate$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.fragment.app.Fragment;
import wq6.d;
import as6.a;
import zq6.r;
import wq6.h;
import pn5.a;
import zq6.p;
import bo5.a;
import java.lang.Boolean;
import un5.b;
import java.lang.Float;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.a1;
import android.view.ViewGroup;

public final class BigEventBgPresenter extends PresenterV2	// class@001847
{
    public RecyclerFragment p;
    public e0 q;
    public Boolean r;
    public boolean s;
    public ActionBarSkinConfig t;
    public ActionBarSkinConfig u;
    public BigEventBgPresenter$b v;
    public final a w;
    public static final BigEventBgPresenter$a x;

    static {
       BigEventBgPresenter.x = new BigEventBgPresenter$a(null);
    }
    public void BigEventBgPresenter(a p0){
       a.p(p0, "bigEventTKAdapter");
       super();
       this.w = p0;
       this.v = new BigEventBgPresenter$b(this);
    }
    public static final RecyclerFragment P8(BigEventBgPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, BigEventBgPresenter.class, "1")) {
          return;
       }
       this.w.g = new BigEventBgPresenter$onCreate$1(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, BigEventBgPresenter.class, "3")) {
          return;
       }
       this.R8();
       BigEventBgPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.h0().removeOnScrollListener(this.v);
       return;
    }
    public final void R8(){
       p e;
       if (PatchProxy.applyVoid(null, this, BigEventBgPresenter.class, "7")) {
          return;
       }
       this.t = null;
       if (this.s == null) {
          return;
       }
       BigEventBgPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       if (tp.isDetached()) {
          return;
       }else {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          d uod = a.e(tp);
          if (uod != null) {
             r or = uod.e0();
             if (or != null) {
                BigEventBgPresenter tu = this.u;
                if (tu != null) {
                   uod.r("KEY_TAB_ACTION_SKIN", tu);
                   p d = a.d;
                   a.o(d, "HomeBlockTopStateId.TAB_ACTION_BAR_SKIN_CONFIG");
                   or.a(d, tu);
                }
                tp = this.q;
                if (tp != null) {
                   e = a.e;
                   a.o(e, "HomeTopStateId.TAB_BAR_VIEW_INFO");
                   or.a(e, tp);
                }
                tp = this.r;
                if (tp != null) {
                   e = b.a;
                   a.o(e, "HomeCommonStateId.STATUS_BAR_CONTENT_DARK");
                   or.a(e, Boolean.valueOf(tp.booleanValue()));
                }
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                p q = a.q;
                a.o(q, "HomeTopStateId.BAR_BACKGROUND_ALPHA");
                a.a(tp, q, Float.valueOf(0x3f800000));
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                RefreshLayout refreshLayou = tp.Ac();
                if (refreshLayou != null) {
                   refreshLayou.setBackgroundColor(a1.a(R.color.arg_RES_7f0617b3));
                }
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                tp.h0().removeOnScrollListener(this.v);
                this.s = false;
                this.r = null;
                this.q = null;
                this.t = null;
             }
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BigEventBgPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
