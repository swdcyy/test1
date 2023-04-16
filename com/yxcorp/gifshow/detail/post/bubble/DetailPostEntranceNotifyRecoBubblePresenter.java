package com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$a;
import nsd.u;
import an6.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$onBind$1;
import u4a.d;
import msd.l;
import erd.g;
import crd.b;
import qrd.l1;
import androidx.viewpager.widget.ViewPager$i;
import hf5.g;
import com.kwai.robust.PatchProxyResult;
import an6.o;
import u4a.c;
import android.app.Activity;
import com.yxcorp.gifshow.detail.post.bubble.DetailPostEntranceNotifyRecoBubblePresenter$generateHomePostBubble$2;
import msd.a;
import x4a.a;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import com.yxcorp.gifshow.detail.post.bubble.data.NotifyRecoBubbleInfo;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uw9.o;
import q87.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import android.os.Build$VERSION;
import hf5.b;
import java.lang.StringBuilder;
import t45.d;
import brd.z;
import io.reactivex.internal.functions.Functions;
import u4a.e;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import an6.m;

public final class DetailPostEntranceNotifyRecoBubblePresenter extends PresenterV2	// class@0016a9
{
    public b p;
    public HomePostBubbleManager q;
    public o r;
    public b s;
    public g t;
    public QPhoto u;
    public final ViewPager$i v;
    public final j w;
    public static final DetailPostEntranceNotifyRecoBubblePresenter$a x;

    static {
       DetailPostEntranceNotifyRecoBubblePresenter.x = new DetailPostEntranceNotifyRecoBubblePresenter$a(null);
    }
    public void DetailPostEntranceNotifyRecoBubblePresenter(j p0){
       a.p(p0, "pageStateDelegate");
       super();
       this.w = p0;
       this.v = new DetailPostEntranceNotifyRecoBubblePresenter$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DetailPostEntranceNotifyRecoBubblePresenter.class, "3")) {
          return;
       }
       b uob = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new d(new DetailPostEntranceNotifyRecoBubblePresenter$onBind$1(this)));
       if (uob != null) {
          this.X7(uob);
          objArray = uob;
       }
       this.p = objArray;
       DetailPostEntranceNotifyRecoBubblePresenter tt = this.t;
       if (tt != null) {
          tt.cc(this.v);
       }
       return;
    }
    public void F8(){
       DetailPostEntranceNotifyRecoBubblePresenter uDetailPostE = DetailPostEntranceNotifyRecoBubblePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDetailPostE, "1")) {
          return;
       }
       c uoc = PatchProxy.apply(objArray, this, uDetailPostE, "11");
       if (uoc != PatchProxyResult.class) {
       }else {
          c uoc1 = new c(this, this.w, this.getActivity(), 0x7f0a060b, DetailPostEntranceNotifyRecoBubblePresenter$generateHomePostBubble$2.INSTANCE, 0);
       }
       this.r = uoc;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, DetailPostEntranceNotifyRecoBubblePresenter.class, "4")) {
          return;
       }
       DetailPostEntranceNotifyRecoBubblePresenter tr = this.r;
       if (tr == null) {
          a.S("nofityRecoBubble");
       }
       tr.j(true);
       this.P8();
       a e = a.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(null, e, a.class, "2")) {
          a.d.clear();
          a.a = null;
          a.b = false;
          a.c = false;
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, DetailPostEntranceNotifyRecoBubblePresenter.class, "5")) {
          return;
       }
       DetailPostEntranceNotifyRecoBubblePresenter tt = this.t;
       if (tt != null) {
          tt.Ud(this.v);
       }
       tt = this.p;
       if (tt != null) {
          tt.dispose();
       }
       return;
    }
    public final Map R8(NotifyRecoBubbleInfo p0){
       LinkedHashMap obj = PatchProxy.applyOneRefs(p0, this, DetailPostEntranceNotifyRecoBubblePresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       Integer type = p0.getType();
       if (type != null) {
          String str = obj.put("material_type", String.valueOf(type.intValue()));
       }
       String materialId = p0.getMaterialId();
       if (materialId != null) {
          materialId = obj.put("material_id", materialId);
       }
       obj.put("bubble_type", String.valueOf(1));
       return obj;
    }
    public final boolean S8(){
       Object[] objArray = null;
       DetailPostEntranceNotifyRecoBubblePresenter obj = PatchProxy.apply(objArray, this, DetailPostEntranceNotifyRecoBubblePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       a.m(obj);
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!TextUtils.n(obj.getUserId(), mE.getId())) {
          objArray = new Object[b];
          o.C().w("detail_post_bubble", "DetailPostEntranceNotifyRecoBubble invalid qPhoto, is not self work", objArray);
          return b;
       }else {
          obj = this.u;
          List magicFaces = (obj != null)? obj.getMagicFaces(): objArray;
          if (q.f(magicFaces)) {
             obj = this.u;
             if (obj != null) {
                objArray = obj.getFlashPhotoTemplate();
             }
             if (objArray == null || Build$VERSION.SDK_INT < 23) {
             label_0062 :
                return b;
             }
          }
          b = true;
          goto label_0062 ;
       }
    }
    public final void V8(){
       boolean b;
       DetailPostEntranceNotifyRecoBubblePresenter uDetailPostE = DetailPostEntranceNotifyRecoBubblePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDetailPostE, "7")) {
          return;
       }
       DetailPostEntranceNotifyRecoBubblePresenter ts = this.s;
       QPhoto currentPhoto = (ts != null)? ts.getCurrentPhoto(): objArray;
       this.u = currentPhoto;
       int i = 0;
       if (this.S8()) {
          if (!PatchProxy.applyVoid(objArray, this, uDetailPostE, "9")) {
             DetailPostEntranceNotifyRecoBubblePresenter$a obj = PatchProxy.apply(objArray, this, uDetailPostE, "10");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                o oo = o.C();
                String str = "DetailPostEntranceNotifyRecoBubble canShowBubble priority ";
                DetailPostEntranceNotifyRecoBubblePresenter tr = this.r;
                if (tr == null) {
                   a.S("nofityRecoBubble");
                }
                Object[] objArray2 = new Object[i];
                oo.w("detail_post_bubble", str+tr.getPriority(), objArray2);
                uDetailPostE = this.r;
                if (uDetailPostE == null) {
                   a.S("nofityRecoBubble");
                }
                if (!uDetailPostE.h() && this.w.l()) {
                   obj = DetailPostEntranceNotifyRecoBubblePresenter.x;
                   ts = this.u;
                   str = (ts != null)? ts.getPhotoId(): objArray;
                   if (obj.a(str)) {
                      b = true;
                   }
                }
             label_008c :
                b = false;
             }
             if (!b) {
                Object[] objArray1 = new Object[i];
                o.C().w("detail_post_bubble", "DetailPostEntranceNotifyRecoBubble triggerBubbleTask can not show now", objArray1);
                obj = DetailPostEntranceNotifyRecoBubblePresenter.x;
                ts = this.u;
                if (ts != null) {
                   objArray = ts.getPhotoId();
                }
                if (obj.a(objArray) && this.w.d()) {
                   this.X7(a.e.c(this.u).subscribeOn(d.c).subscribe(Functions.d(), e.b));
                }
             }else {
                uDetailPostE = this.q;
                if (uDetailPostE == null) {
                   a.S("bubbleManager");
                }
                ts = this.r;
                if (ts == null) {
                   a.S("nofityRecoBubble");
                }
                if (uDetailPostE.j(ts)) {
                   uDetailPostE = this.r;
                   if (uDetailPostE == null) {
                      a.S("nofityRecoBubble");
                   }
                   ts = this.q;
                   if (ts == null) {
                      a.S("bubbleManager");
                   }
                   uDetailPostE.l(ts);
                }
             }
          }
       }else {
          objArray = new Object[i];
          o.C().w("detail_post_bubble", "DetailPostEntranceNotifyRecoBubble onFeedSelected invalid qPhoto", objArray);
          this.P8();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, DetailPostEntranceNotifyRecoBubblePresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(HomePostBubbleManager.class);
       a.o(obj, "inject<HomePostBubbleMan¡­ubbleManager::class.java\)");
       this.q = obj;
       this.s = this.q8(b.class);
       this.t = this.q8(g.class);
       return;
    }
}
