package je9.b;
import ui9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import je9.e;
import je9.b$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ce9.l;
import i5b.c;
import i5b.c$a;
import java.lang.CharSequence;
import java.util.List;
import xi9.n;
import java.util.Collection;
import ekd.q;
import java.util.Map;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import je9.c;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import je9.d;
import erd.g;
import crd.b;
import je9.f;
import java.util.Objects;
import com.yxcorp.gifshow.model.CustomMagicInfo;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.model.CustomConfig;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.io.File;
import java.lang.StringBuilder;
import android.view.View;
import j4b.b;
import je9.b$b;
import eoc.f;
import t4b.e;
import je9.b$c;
import t4b.j;
import je9.b$d;
import j4b.k;
import je9.b$e;

public final class b extends d implements b	// class@002a6e
{
    public final ArrayList n;
    public final HashMap o;
    public final HashMap p;
    public final HashMap q;
    public final HashMap r;
    public c s;
    public b t;
    public final b u;

    public void b(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.u = p1;
       this.n = new ArrayList();
       this.o = new HashMap();
       this.p = new HashMap();
       this.q = new HashMap();
       this.r = new HashMap();
       p1.n(e.class, new b$a(this));
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       b uob;
       d tg;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, b.class, "2")) {
          return;
       }
       if (p0 != null) {
          String str = this.f2();
          Object[] objArray = null;
          l ol = PatchProxy.apply(objArray, this, b.class, "8");
          if (ol != PatchProxyResult.class) {
          }else {
             ol = this.u.d(l.i).a;
          }
          c uoc = c.k.a(p0);
          this.s = uoc;
          a.m(uoc);
          int i = 0;
          if (uoc.a != null) {
             uob = (str == null || !str.length())? 1: null;
             if (!uob && !this.n.contains(str)) {
                this.n.add(str);
             }
          }
       label_0067 :
          uob = this.s;
          a.m(uob);
          if (uob.f()) {
             tg = this.g;
             List list = (tg != null)? tg.m(): objArray;
             if (q.f(list) && str != null) {
                this.p.remove(str);
                this.q.remove(str);
             }
          }
       label_008e :
          tg = this.g;
          Map map = (tg != null)? tg.g0(): objArray;
          if (q.h(map)) {
             tg = this.g;
             if (tg != null) {
                objArray = tg.b1();
             }
             if (q.h(objArray) && str != null) {
                this.o.remove(str);
             }
          }
       label_00b3 :
          SimpleMagicFace simpleMagicF = (str == null || !str.length())? 1: null;
          if (!simpleMagicF) {
             this.g2(str);
          }
          if (ol != null) {
             simpleMagicF = ol.mChildId;
             if (simpleMagicF == null || !simpleMagicF.length()) {
                i = 1;
             }
             if (!i && !PatchProxy.applyVoidOneRefs(ol, this, b.class, "7")) {
                uob = t.fromCallable(new c(ol)).subscribeOn(d.c).observeOn(d.a).subscribe(new d(this, ol));
                this.t = uob;
                a.m(uob);
                this.Y1(uob);
             }
          }
       }
    label_0102 :
       return;
    }
    public final String f2(){
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u.d(l.i).a;
       if (obj != null) {
          objArray = obj.mId;
       }
       return objArray;
    }
    public final void g2(String p0){
       ArrayList obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       f a = f.a;
       b tn = this.n;
       b to = this.o;
       b tp = this.p;
       b tq = this.q;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,tn,to,tp,tq};
          obj = PatchProxy.apply(objArray, a, uof, "2");
          if (obj != patchProxyRe) {
          }else {
          label_0040 :
             a.p(tn, "customMagicList");
             a.p(to, "inputTextMap");
             a.p(tp, "imagePathMap");
             a.p(tq, "magicImageFirstKeyMap");
             if (CollectionsKt___CollectionsKt.H1(tn, p0) && p0 != null) {
                String str = tq.get(p0);
                if (str != null) {
                   Map map = tp.get(p0);
                   if (map != null) {
                      str = map.get(str);
                   label_0078 :
                      Objects.requireNonNull(a);
                      CustomConfig uCustomConfi = PatchProxy.applyThreeRefs(p0, to, tp, a, f.class, "3");
                      if (uCustomConfi != patchProxyRe) {
                      }else {
                         uCustomConfi = new CustomConfig();
                         obj = new ArrayList();
                         Map map1 = to.get(p0);
                         String str1 = (map1 == null || map1.isEmpty())? 1: null;
                         if (!str1) {
                            obj.add("inputText");
                            uCustomConfi.setInputText(to.get(p0));
                         }
                         map1 = tp.get(p0);
                         if (map1 != null && !map1.isEmpty()) {
                            i = 0;
                         }
                         if (!i) {
                            obj.add("pickMoreMedia");
                            HashMap hashMap = new HashMap();
                            ArrayList uArrayList = new ArrayList();
                            Iterator obj1 = tp.get(p0);
                            a.m(obj1);
                            obj1 = obj1.entrySet().iterator();
                            while (obj1.hasNext()) {
                               Map$Entry uEntry = obj1.next();
                               File uFile = new File(uEntry.getValue());
                               if (uFile.exists()) {
                                  String separator = File.separator;
                                  hashMap.put(uEntry.getKey(), separator+"media"+separator+uFile.getName());
                                  uArrayList.add(uEntry.getValue());
                               }
                            }
                            uCustomConfi.setPickMoreMedia(hashMap);
                            uCustomConfi.setFilePaths(uArrayList);
                         }
                         if (obj.isEmpty()) {
                            uCustomConfi = null;
                         }else {
                            uCustomConfi.setThingsTodo(obj);
                         }
                      }
                      if (uCustomConfi != null) {
                         obj = new CustomMagicInfo(p0, str, uCustomConfi);
                      }
                   }
                }
                str = null;
                goto label_0078 ;
             }
          label_005b :
             obj = null;
          }
       }else {
          goto label_0040 ;
       }
       this.r.put(p0, obj);
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(b.class, new b$b(this)));
       this.Y1(this.u.l(e.class, new b$c(this)));
       this.Y1(this.u.l(j.class, new b$d(this)));
       this.Y1(f.a(k.class, new b$e(this)));
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
}
