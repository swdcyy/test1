package com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o3a.c;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.SmallWindowActionPresenter;
import o3a.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.a;
import ag6.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.utility.Log;
import java.util.Objects;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment$b;
import m3a.t;
import qvb.q;
import qvb.j;
import m3a.s;
import m3a.a;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import m3a.p;
import lnc.g2;
import androidx.fragment.app.Fragment;

public final class SmallWindowFragment extends BaseFragment implements g2$a	// class@001636
{
    public s j;
    public g2 k;
    public SmallWindowFragment$b l;
    public static final SmallWindowFragment$a m;

    static {
       SmallWindowFragment.m = new SmallWindowFragment$a(null);
    }
    public void SmallWindowFragment(){
       super(null, null, null, null, 15, null);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, SmallWindowFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new c());
       obj.U7(new SmallWindowActionPresenter());
       obj.U7(new b());
       PatchProxy.onMethodExit(SmallWindowFragment.class, "8");
       return obj;
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SmallWindowFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d116b, p1, false);
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SmallWindowFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       Log.b("SmallWindowFragment", "onDestroy: ");
       SmallWindowFragment tl = this.l;
       if (tl == null) {
          a.S("mCallerContext");
       }
       Objects.requireNonNull(tl);
       SmallWindowFragment$b uob = PatchProxy.apply(objArray, tl, SmallWindowFragment$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = tl.b;
          if (uob == null) {
             a.S("mPlayController");
          }
       }
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, t.class, "14")) {
          uob.e.f(uob.d);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       s a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SmallWindowFragment.class, "5")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       SmallWindowFragment$b uob = SmallWindowFragment$b.class;
       Object[] objArray = null;
       String str = "6";
       if (!PatchProxy.applyVoid(objArray, this, SmallWindowFragment.class, "7")) {
          SmallWindowFragment$b uob1 = new SmallWindowFragment$b();
          this.l = uob1;
          SmallWindowFragment tj = this.j;
          if (tj == null) {
             a.S("mSmallWindowParam");
          }
          a = tj.a;
          SmallWindowFragment tj1 = this.j;
          if (tj1 == null) {
             a.S("mSmallWindowParam");
          }
          t ot = new t(a, tj1.a().a);
          if (!PatchProxy.applyVoidOneRefs(ot, uob1, uob, "2")) {
             a.p(ot, "<set-?>");
             uob1.b = ot;
          }
          SmallWindowFragment tl1 = this.l;
          if (tl1 == null) {
             a.S("mCallerContext");
          }
          p op = new p(this);
          Objects.requireNonNull(tl1);
          if (!PatchProxy.applyVoidOneRefs(op, tl1, uob, "4")) {
             a.p(op, "<set-?>");
             tl1.c = op;
          }
          tl1 = this.l;
          if (tl1 == null) {
             a.S("mCallerContext");
          }
          SmallWindowFragment tj2 = this.j;
          if (tj2 == null) {
             a.S("mSmallWindowParam");
          }
          Objects.requireNonNull(tl1);
          if (!PatchProxy.applyVoidOneRefs(tj2, tl1, uob, str)) {
             a.p(tj2, "<set-?>");
             tl1.d = tj2;
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, SmallWindowFragment.class, str)) {
          g2 og2 = new g2(this, this);
          this.k = og2;
          Object[] objArray1 = new Object[2];
          int i = 0;
          SmallWindowFragment tl = this.l;
          if (tl == null) {
             a.S("mCallerContext");
          }
          objArray1[i] = tl;
          objArray1[1] = this;
          og2.b(objArray1);
       }
       return;
    }
}
