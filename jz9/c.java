package jz9.c;
import qp7.b;
import hs7.d;
import rp7.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import qp7.g;
import hs7.e;
import jz9.b;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import kotlin.jvm.internal.a;
import erd.g;
import brd.t;
import com.kwai.slide.play.detail.rightactionbar.backgroundplay.BackgroundPlayRightEntranceEventBus;
import jz9.a;
import io.reactivex.subjects.PublishSubject;
import qp7.a;
import v6a.m0;
import le5.a;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.d;
import is7.c;
import qp7.c;
import qp7.x0;
import is7.d;

public class c extends b	// class@002b8c
{
    public PublishSubject q;
    public QPhoto r;
    public PhotoDetailParam s;

    public void c(){
       super(d.n);
    }
    public void O(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       if (PatchProxy.applyVoid(null, this, c.class, str)) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "BGEntranceElement";
       o.C().w(str1, "onBind: ...photo:"+this.r, objArray);
       if (this.s.getBizType() == 17) {
          this.b0();
          return;
       }else if(!QCurrentUser.ME.isLogined()){
          this.b0();
          return;
       }else {
          objArray = new Object[i];
          o.C().w(str1, "onBind: isKtv:"+this.r.isKtv(), objArray);
          Object[] objArray1 = new Object[i];
          o.C().w(str1, "onBind: getStereoType:"+this.r.getStereoType(), objArray1);
          if (this.r.isKtv() || this.r.getStereoType()) {
             this.b0();
             return;
          }else {
             c tr = this.r;
             if (tr == null) {
                this.b0();
                return;
             }else {
                PhotoDisplayLocationInfo photoDisplay = tr.getPhotoDisplayLocationInfo();
                if (this.r.isHdr() && (photoDisplay != null && photoDisplay.mHeightRatio - null > 0)) {
                   this.b0();
                   return;
                }else {
                   e uoe = this.D();
                   b uob = new b(this);
                   g e = Functions.e;
                   Objects.requireNonNull(uoe);
                   b uob1 = PatchProxy.applyTwoRefs(uob, e, uoe, e.class, "6");
                   if (uob1 != patchProxyRe) {
                   }else {
                      a.p(uob, "onNext");
                      a.p(e, "onError");
                      uob1 = uoe.d.subscribe(uob, e);
                      a.o(uob1, "screenCleanSubject.subscribe\(onNext, onError\)");
                   }
                   this.j(uob1);
                   b ti = this.i;
                   a uoa = new a(this);
                   Objects.requireNonNull(ti);
                   b uob2 = PatchProxy.applyTwoRefs(uoa, e, ti, BackgroundPlayRightEntranceEventBus.class, str);
                   if (uob2 != patchProxyRe) {
                   }else {
                      a.p(uoa, "onNext");
                      a.p(e, "onError");
                      uob2 = ti.a().subscribe(uoa, e);
                      a.o(uob2, "entranceClickSubject.subscribe\(onNext, onError\)");
                   }
                   this.j(uob2);
                   return;
                }
             }
          }
       }
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          o.C().w("BGEntranceElement", "bindData: ...photo:"+p0.c.mPhoto, objArray);
          this.r = p0.c.mPhoto;
          this.q = this.H().s1;
          this.s = p0.c;
          PatchProxy.onMethodExit(c.class, "1");
       }
       return;
    }
    public d q(){
       c uoc = PatchProxy.apply(null, this, c.class, "5");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
    public c r(){
       BackgroundPlayRightEntranceEventBus uBackgroundP = PatchProxy.apply(null, this, c.class, "4");
       if (uBackgroundP != PatchProxyResult.class) {
       }else {
          uBackgroundP = new BackgroundPlayRightEntranceEventBus();
       }
       return uBackgroundP;
    }
    public x0 t(){
       d uod = PatchProxy.apply(null, this, c.class, "3");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
}
