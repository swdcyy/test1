package com.kuaishou.live.core.show.subscribe.pendant.f;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.HashSet;
import crd.a;
import java.lang.Boolean;
import ok.x;
import com.google.common.base.Suppliers;
import com.kuaishou.live.core.show.subscribe.pendant.f$a;
import yk2.p;
import yk2.o;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantItemView$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.View;
import hf3.a;
import brd.t;
import androidx.lifecycle.LifecycleOwner;
import yk2.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import ja6.a;
import t45.d;
import brd.z;
import yk2.s;
import com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerInfo;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveReservationStickerMessage$SCLiveReservationStickerClose;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView;
import android.widget.ViewFlipper;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantItemView;
import ekd.k1;
import com.kuaishou.live.core.show.subscribe.pendant.f$b;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import k51.a;
import d61.h;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView$b;
import com.kuaishou.live.core.show.subscribe.pendant.e;
import erd.o;
import yk2.t;
import brd.a0;
import yk2.q;

public class f	// class@001154
{
    public final String a;
    public View b;
    public a c;
    public LifecycleOwner d;
    public f$b e;
    public f$c f;
    public LiveSubscribePendantView g;
    public MutableLiveData h;
    public List i;
    public final Set j;
    public a k;
    public x l;
    public final LiveSubscribePendantView$b m;
    public final g n;
    public final g o;

    public void f(){
       super();
       this.a = "»À";
       this.h = new MutableLiveData();
       this.i = new ArrayList();
       this.j = new HashSet();
       this.k = new a();
       this.l = Suppliers.b(Boolean.TRUE);
       this.m = new f$a(this);
       this.n = new p(this);
       this.o = new o(this);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "17")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SUBSCRIBE, "deleteSubscribe", "subscribeId", p0);
       LiveSubscribePendantItemView$a uoa = null;
       List value = this.h.getValue();
       if (value != null) {
          Iterator iterator = value.iterator();
          while (true) {
             if (iterator.hasNext()) {
                LiveSubscribePendantItemView$a uoa1 = iterator.next();
                if (TextUtils.equals(p0, uoa1.a)) {
                   uoa = uoa1;
                }
             }
          }
       }
       if (uoa != null) {
          value.remove(uoa);
          if (!value.size()) {
             this.b();
          }else {
             this.h.setValue(value);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       f tg = this.g;
       if (tg != null) {
          tg.setVisibility(8);
       }
       return;
    }
    public void c(View p0,a p1,t p2,LifecycleOwner p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "1")) {
          return;
       }
       this.b = p0;
       this.c = p1;
       this.d = p3;
       this.k.c(p2.subscribe(new r(this), Functions.d()));
       this.k.c(RxBus.f.f(a.class).observeOn(d.a).subscribe(new s(this)));
       this.c.u0(907, LiveReservationStickerMessage$SCLiveReservationStickerInfo.class, this.n);
       this.c.u0(908, LiveReservationStickerMessage$SCLiveReservationStickerClose.class, this.o);
       return;
    }
    public boolean d(){
       f obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.c.o(907, this.n);
       this.c.o(908, this.o);
       f tg = this.g;
       if (tg != null) {
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoid(null, tg, LiveSubscribePendantView.class, "16")) {
             int i = 0;
             while (i < tg.z.getChildCount()) {
                LiveSubscribePendantItemView childAt = tg.z.getChildAt(i);
                Objects.requireNonNull(childAt);
                if (!PatchProxy.applyVoid(null, childAt, LiveSubscribePendantItemView.class, "5")) {
                   k1.n(childAt.J);
                }
                i = i + 1;
             }
          }
       }
       this.b();
       this.k.dispose();
       return;
    }
    public void f(f$b p0){
       this.e = p0;
    }
    public void g(List p0,String p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, "9")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_SUBSCRIBE, "showSubscribePendant", "dataList", p0, "from", p1);
       if (this.g == null) {
          f tb = this.b;
          if (!PatchProxy.applyVoidOneRefs(tb, this, uof, "12")) {
             View view = tb.findViewById(R.id.live_subscribe_draggable_views_container);
             RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
             layoutParams.bottomMargin = (int)((double)n.j(n.d(tb)) * 0x3fd999999999999a);
             view.setLayoutParams(layoutParams);
          }
          this.g = h.g(this.b, 0x7f0a2645, 0x7f0a2644, 0x7f0d0df3, a.f());
       }
       this.h.observe(this.d, this.g);
       this.g.setVisibility(0);
       this.g.setSubscribePendantListener(this.m);
       List[] listArray = new List[]{p0};
       t.fromArray(listArray).flatMapIterable(e.b).map(new t(this)).toList().Q(new q(this));
       return;
    }
}
