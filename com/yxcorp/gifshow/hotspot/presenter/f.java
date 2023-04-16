package com.yxcorp.gifshow.hotspot.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.hotspot.presenter.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import gwa.l;
import com.yxcorp.gifshow.hotspot.widget.OverScrollViewGroup;
import lwa.c;
import android.view.View;
import gwa.i;
import com.yxcorp.gifshow.hotspot.widget.OverScrollViewGroup$b;
import gwa.j;
import com.yxcorp.gifshow.hotspot.widget.OverScrollViewGroup$c;
import com.yxcorp.gifshow.util.rx.RxBus;
import kwa.d;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import gwa.k;
import erd.g;
import crd.b;
import java.util.Map;
import kwa.f;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$r;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;

public class f extends PresenterV2	// class@0018eb
{
    public CommonInsertCardFeed p;
    public Map q;
    public RecyclerView r;
    public TextView s;
    public c t;
    public f u;
    public OverScrollViewGroup v;
    public boolean w;
    public final RecyclerView$r x;
    public static final int y;

    static {
       f.y = a1.e(60.00f);
    }
    public void f(){
       super();
       this.x = new f$a(this);
    }
    public void E8(){
       boolean i1;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       this.r.setTranslationX(0);
       if (!PatchProxy.applyVoid(objArray, this, uof, "7")) {
          this.t = new l(this);
          i1 = true;
          this.v.setEnableInnerIntercept(i1);
          if (this.t.isEnable()) {
             this.R8(this.s, 0);
             this.v.setIsNeedControlBounceBack(i1);
             this.v.setOnTargetViewOffsetListener(new i(this));
             this.v.setOnTargetViewStopListener(new j(this));
          }else {
             this.R8(this.s, 8);
          }
       }
       this.X7(RxBus.f.g(d.class, RxBus$ThreadMode.MAIN).subscribe(new k(this)));
       if (this.q.containsKey(this.p)) {
          this.u = this.q.get(this.p);
       }else {
          f uof1 = new f();
          this.u = uof1;
          this.q.put(this.p, uof1);
       }
       int i = this.u.b();
       i1 = this.u.a();
       if (PatchProxy.isSupport(uof) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, uof, "5") && this.r.getLayoutManager() != null)) {
          this.r.getLayoutManager().scrollToPositionWithOffset(i, i1);
       }
       this.r.addOnScrollListener(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.r.removeOnScrollListener(this.x);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       LinearLayoutManager layoutManage = this.r.getLayoutManager();
       if (this.u != null && layoutManage != null) {
          int i = layoutManage.i0();
          View view = layoutManage.findViewByPosition(i);
          if (view != null) {
             this.u.c(view.getLeft());
          }
          this.u.d(i);
       }
       return;
    }
    public final void R8(View p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVisibility(p1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a06d2);
       this.s = p0.findViewById(0x7f0a28fd);
       this.v = p0.findViewById(0x7f0a2f5a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(CommonInsertCardFeed.class);
       this.q = this.r8("HOTSPOT_LIST_SCROLL_STATE");
       return;
    }
}
