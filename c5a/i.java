package c5a.i;
import c5a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.PostShowInfo;
import com.kuaishou.android.model.mix.w;
import ixc.c;
import brd.t;
import lnc.pa;
import lnc.qa;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import c5a.g;
import erd.o;
import c5a.h;
import t45.d;
import brd.z;
import c5a.f;
import c5a.e;
import erd.g;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.i;
import g26.d;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import c16.c;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import c5a.d;
import ok.h;
import tl8.e;
import java.util.List;
import java.util.Collection;
import ekd.q;
import s3b.a;

public class i extends c	// class@000551
{
    public final String w;
    public b x;

    public void i(){
       super();
       this.w = "NasaSpecialCameraBtn";
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       super.J8();
       b9.a(this.x);
       this.x = null;
       return;
    }
    public void P8(QPhoto p0,boolean p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "2")) {
          return;
       }
       super.P8(p0, p1);
       b9.a(this.x);
       this.x = null;
       if (p0 != null && p0.getEntity() != null) {
          BaseFeed entity = p0.getEntity();
          PostShowInfo obj = PatchProxy.applyOneRefs(entity, this, oi, "5");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(entity != null && (entity.a(PhotoMeta.class) != null && w.a0(entity.a(PhotoMeta.class)) != null)){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             this.R8();
             return;
          }else {
             obj = w.a0(entity.a(PhotoMeta.class));
             t ot = PatchProxy.applyTwoRefs(entity, obj, this, oi, "4");
             if (ot != patchProxyRe) {
             }else {
                c uoc = qa.r(c.class);
                ot = (obj.mType == 1 && uoc == null)? qa.s(c.class, LoadPolicy.SILENT_IF_DOWNLOADED).w(new g(this, entity, obj)).onErrorReturn(new h(this, entity, obj)).observeOn(d.a): t.just(this.V8(entity, obj, uoc));
             }
             this.x = ot.observeOn(d.a).subscribe(new f(this, obj, entity, p1), new e(this));
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("NasaSpecialCameraBtn", "send hide event", objArray);
       super.R8();
       RxBus.f.b(new i(1, null));
       return;
    }
    public final Boolean V8(BaseFeed p0,PostShowInfo p1,c p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, i.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       p1 = p1.mType;
       boolean b = true;
       if (p1 != b) {
          if (p1 != 9) {
             if (p1 != 5 && p1 != 6) {
                if (p1 == 7) {
                   b = d.b();
                }
             }else {
                Map a = MagicEmojiResourceHelper.a;
             }
          }else {
             b = c.c();
          }
       }else {
          p1 = PatchProxy.applyOneRefs(p0, this, i.class, "7");
          if (p1 != patchProxyRe) {
          }else {
             List list = e.h(p0, PhotoMeta.class, d.b);
             p1 = (!q.f(list))? list.get(0): null;
          }
          if (p1 == null || (p2 != null && !p2.KA().h(p1))) {
             b = false;
          }
          if (b) {
             Object[] objArray = new Object[0];
             o.C().s("NasaSpecialCameraBtn", "magicFace available", objArray);
          }
       }
       return Boolean.valueOf(b);
    }
}
