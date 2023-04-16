package com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import u4a.a;
import com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter$b;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter;
import java.util.Objects;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e0a.j;
import an6.j;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter$onBind$1;
import u4a.f;
import msd.l;
import erd.g;
import crd.b;
import android.app.Activity;
import u4a.j;
import java.util.Map;
import java.util.HashMap;

public final class NasaDetailPostBubblePresenter extends PresenterV2 implements g	// class@0016ad
{
    public List p;
    public final HomePostBubbleManager q;
    public final a r;
    public final f s;
    public static final NasaDetailPostBubblePresenter$a t;

    static {
       NasaDetailPostBubblePresenter.t = new NasaDetailPostBubblePresenter$a(null);
    }
    public void NasaDetailPostBubblePresenter(List p0){
       a.p(p0, "bubbleFeatures");
       super();
       this.q = new HomePostBubbleManager();
       this.r = new a(0x7f0a060b);
       this.s = new NasaDetailPostBubblePresenter$b(this);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          int i = 0;
          if (iterator.next().intValue() != 1) {
             Object[] objArray = new Object[i];
             o.C().w("NasaDetailPostBubble", "illegal feature", objArray);
          }else {
             DetailPostEntranceNotifyRecoBubblePresenter$a x = DetailPostEntranceNotifyRecoBubblePresenter.x;
             Objects.requireNonNull(x);
             Object obj = PatchProxy.apply(null, x, DetailPostEntranceNotifyRecoBubblePresenter$a.class, "1");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else if(!j.m() || !x.a(null)){
                i = true;
             }
             if (i) {
                this.U7(new DetailPostEntranceNotifyRecoBubblePresenter(this.r));
             }
          }
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaDetailPostBubblePresenter.class, "3")) {
          return;
       }
       NasaDetailPostBubblePresenter tp = this.p;
       if (tp != null) {
          tp.add(this.s);
       }
       this.X7(RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new f(new NasaDetailPostBubblePresenter$onBind$1(this))));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, NasaDetailPostBubblePresenter.class, "2")) {
          return;
       }
       this.r.c = this.getActivity();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaDetailPostBubblePresenter.class, "4")) {
          return;
       }
       NasaDetailPostBubblePresenter tp = this.p;
       if (tp != null) {
          tp.remove(this.s);
       }
       return;
    }
    public final HomePostBubbleManager P8(){
       return this.q;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaDetailPostBubblePresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NasaDetailPostBubblePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaDetailPostBubblePresenter.class, new j());
       }else {
          obj.put(NasaDetailPostBubblePresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaDetailPostBubblePresenter.class, "1")) {
          return;
       }
       this.p = this.t8("NASA_DETAIL_CAMERA_BTN_DELEGATE");
       return;
    }
}
