package com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl;
import x49.n;
import com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$mTkManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import android.app.Activity;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import x49.o;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import tkd.b;
import tkd.d;
import rx4.i;
import yx.j0;
import g59.h0;
import a59.f;
import okd.b;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import wkd.b;
import a59.i;
import com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$initBridge$1;
import qrd.l1;
import com.yxcorp.gifshow.ad.tachikoma.a;
import a59.b;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.EasyTkImpl$b;

public final class EasyTkImpl implements n	// class@001800
{
    public final p b;
    public QPhoto c;
    public PhotoAdvertisement$TkTemplateData d;
    public PhotoAdvertisement$TkTemplateInfo e;
    public TkBridgeGroup f;
    public a g;
    public f h;
    public static final EasyTkImpl$a i;

    static {
       EasyTkImpl.i = new EasyTkImpl$a(null);
    }
    public void EasyTkImpl(){
       super();
       this.b = s.c(EasyTkImpl$mTkManager$2.INSTANCE);
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, EasyTkImpl.class, "5")) {
          return;
       }
       EasyTkImpl tf = this.f;
       if (tf != null) {
          tf.g();
       }
       return;
    }
    public boolean a(Activity p0,ViewGroup p1,QPhoto p2,String p3,o p4,a p5,l p6){
       Object[] objArray;
       b obj;
       boolean b;
       o this;
       ViewGroup viewGroup;
       boolean b1;
       object oobject7;
       o a;
       EasyTkImpl d;
       o c1;
       EasyTkImpl$initBridge$1 this1;
       PhotoAdvertisement$TkTemplateData tkTemplateDa;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn;
       TkBridgeGroup tkBridgeGrou = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EasyTkImpl uEasyTkImpl = EasyTkImpl.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(uEasyTkImpl)) {
          objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5,oobject6};
          obj = PatchProxy.apply(objArray, tkBridgeGrou, uEasyTkImpl, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(oobject, "activity");
       a.p(oobject1, "tkContainer");
       a.p(oobject2, "photo");
       a.p(oobject3, "templateId");
       int i2 = 0;
       String str = "mPhoto";
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoidThreeRefs(p2, p3, p5, this, EasyTkImpl.class, "9")) {
          tkBridgeGrou.f = objArray1;
          tkBridgeGrou.h = objArray1;
          tkBridgeGrou.c = oobject2;
          if (oobject2 == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(p2);
          String this2 = "it";
          if (photoAdverti != null) {
             a.o(photoAdverti, this2);
             tkTemplateDa = l.a.b(oobject3, photoAdverti);
          }else {
             tkTemplateDa = objArray1;
          }
          tkBridgeGrou.d = tkTemplateDa;
          EasyTkImpl c2 = tkBridgeGrou.c;
          if (c2 == null) {
             a.S(str);
          }
          photoAdverti = k.B(c2);
          if (photoAdverti != null) {
             a.o(photoAdverti, this2);
             tkTemplateIn = l.a.a(oobject3, photoAdverti);
          }else {
             tkTemplateIn = objArray1;
          }
          tkBridgeGrou.e = tkTemplateIn;
          tkBridgeGrou.g = oobject5;
       }
       obj = PatchProxy.apply(objArray1, tkBridgeGrou, uEasyTkImpl, "10");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
          this = 1;
       }else {
          obj = d.a(0x256720e1);
          a.o(obj, "PluginManager.get\(TKPlugin::class.java\)");
          if (!obj.k4()) {
             objArray = new Object[i2];
             j0.a("EasyTkImpl", "tachikoma sdk not init success", objArray);
          }else if(h0.b(tkBridgeGrou.e)){
             if (h0.a(tkBridgeGrou.d, true)) {
                c1 = 1;
             label_00f0 :
                b = c1;
             }else {
             label_00ef :
                c1 = null;
                goto label_00f0 ;
             }
          }
          this = 1;
          goto label_00ef ;
       }
       if (b) {
          if (PatchProxy.applyVoidTwoRefs(oobject, oobject4, tkBridgeGrou, uEasyTkImpl, "11")) {
             viewGroup = p1;
             b1 = b;
             oobject7 = oobject6;
             b = true;
          }else {
             EasyTkImpl c = tkBridgeGrou.c;
             if (c == null) {
                a.S(str);
             }
             if (oobject4 != null) {
                a = oobject4.a;
                if (a != null) {
                label_011c :
                   o oo = a;
                   EasyTkImpl e = tkBridgeGrou.e;
                   d = tkBridgeGrou.d;
                   o oo1 = (oobject4 != null)? oobject4.b: objArray1;
                   c1 = (oobject4 != null)? oobject4.c: objArray1;
                   o oo2 = (oobject4 != null)? oobject4.d: objArray1;
                   EasyTkImpl g = tkBridgeGrou.g;
                   o e1 = (oobject4 != null)? oobject4.e: 0;
                   this = (oobject4 != null)? oobject4.f: null;
                   o oo3 = (oobject4 != null)? oobject4.g: null;
                   oobject7 = oobject6;
                   viewGroup = p1;
                   b1 = b;
                   b = true;
                   f uof = new f(p0, c, e, oo, d, oo1, c1, oo2, e1, null, null, this, null, null, null, g, null, null, oo3, 0x37600, null);
                   tkBridgeGrou.h = i1;
                   TkBridgeGroup tkBridgeGrou1 = b.a(0x1e78909a).a(i1);
                   tkBridgeGrou.f = tkBridgeGrou1;
                   if (tkBridgeGrou1 != null) {
                      tkBridgeGrou1.j("getData", super(tkBridgeGrou));
                   }
                }
             }
             a = b.a(0x56718eb5);
             goto label_011c ;
          }
          EasyTkImpl f = tkBridgeGrou.f;
          if (f != null && oobject7 != null) {
             l1 ol1 = oobject7.invoke(f);
          }
          this.e().a(viewGroup, tkBridgeGrou.f, b);
       }else {
          b1 = b;
       }
       return b1;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EasyTkImpl.class, "7")) {
          return;
       }
       a.p(p0, "event");
       EasyTkImpl th = this.h;
       if (th != null) {
          Map map = th.d();
          if (map != null) {
             map.put(p0.getKey(), p0);
          }
       }
       return;
    }
    public void c(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EasyTkImpl.class, "3")) {
          return;
       }
       EasyTkImpl te = this.e;
       if (te != null) {
          this.e().b(te, new EasyTkImpl$b(this, p0));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, EasyTkImpl.class, "8")) {
          return;
       }
       EasyTkImpl th = this.h;
       if (th != null) {
          Map map = th.d();
          if (map != null) {
             map.clear();
          }
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, EasyTkImpl.class, "6")) {
          return;
       }
       this.e().destroy();
       this.d();
       return;
    }
    public final a e(){
       Object obj = PatchProxy.apply(null, this, EasyTkImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, EasyTkImpl.class, "4")) {
          return;
       }
       EasyTkImpl tf = this.f;
       if (tf != null) {
          tf.h();
       }
       return;
    }
}
