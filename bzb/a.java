package bzb.a;
import vma.c;
import java.lang.Object;
import lq.i;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import o36.g;
import azb.h;
import java.util.Objects;
import azb.g;
import lq.l;
import czb.b;
import java.util.HashSet;
import j36.d;
import java.util.List;
import lnc.d7;
import r46.e;
import java.util.Map;
import lnc.p3;
import q87.c;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import lnc.s6;
import r46.d;
import azb.c;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import azb.d;
import erd.g;
import crd.b;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.IntArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.content.Intent;
import android.app.Activity;
import czb.a;
import j36.e;
import tkd.b;
import tkd.d;
import f26.a;
import i46.b;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.model.GrowthGuideConfig;
import o16.a;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import azb.e;

public class a implements c	// class@0004da
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public void qS(i p0,BasePostActivity p1,boolean p2){
       g h;
       e a;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "2")) {
          return;
       }
       String str = "session";
       a.p(p0, str);
       if (g.a) {
          h b = h.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), b, h.class, "2")) {
             a.p(p0, str);
             if (p2) {
                h = g.h;
                h.d();
                p0.U(h.a);
                b c = b.c;
                Objects.requireNonNull(c);
                if (!PatchProxy.applyVoid(null, c, b.class, "2")) {
                   b.b.clear();
                   d uod = d.c();
                   a = b.a;
                   Objects.requireNonNull(uod);
                   if (!PatchProxy.applyVoidOneRefs(a, uod, d.class, "3")) {
                      uod.b.remove(a);
                   }
                }
                h.g(d7.a.d());
                e.b.a().clear();
             }
          }
       }else {
          Object[] objArray = new Object[0];
          p3.D().w("FlyWheel", "onExistPage flywheel not enable", objArray);
       }
       return;
    }
    public void sD(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       GrowthGuideConfigCacheHelper e = GrowthGuideConfigCacheHelper.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(objArray, e, GrowthGuideConfigCacheHelper.class, "14") && s6.G()) {
          if (d.a.b() - 1) {
             objArray = new Object[0];
             p3.D().w("PostGrowth", "GrowthGuideConfigManager preloadGuideConfig version not match", objArray);
          }else {
             t.create(c.b).subscribeOn(d.c).subscribe(d.b);
          }
       }
       return;
    }
    public void wP(i p0,BasePostActivity p1,boolean p2){
       d7 a;
       g h;
       Iterator iterator1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "1")) {
          return;
       }
       String str = "session";
       a.p(p0, str);
       String str1 = "currentPage";
       a.p(p1, str1);
       int i = 0;
       if (g.a) {
          h b = h.b;
          Objects.requireNonNull(b);
          g og = g.class;
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), b, h.class, "1")) {
             a.p(p0, str);
             a.p(p1, str1);
             if (p2) {
                p0.f(h.a);
                Integer integer = i.g().getFlywheelTaskType().get();
                String str2 = "PostGrowth";
                if (integer != null && integer.intValue() != Integer.MIN_VALUE) {
                   Object[] objArray = new Object[i];
                   p3.D().w(str2, "argsTaskType: "+integer, objArray);
                   Intent intent = p1.getIntent();
                   if (intent != null) {
                      intent.putExtra("entranceTaskType", integer.intValue());
                   }
                }
                b c = b.c;
                Objects.requireNonNull(c);
                String str3 = "1";
                if (!PatchProxy.applyVoid(null, c, b.class, str3)) {
                   b.a = a.a;
                   d.c().a(b.a);
                }
                a uoa = d.a(0x3b0a11d7);
                if (uoa != null) {
                   uoa.BN(p1.getIntent());
                }
                a = d7.a;
                str1 = p1.B3();
                String str4 = "currentPage.postScene";
                a.o(str1, str4);
                Objects.requireNonNull(a);
                String str5 = "scene";
                a.p(str1, str5);
                if (i.h()) {
                   i.m().Q("taskTypeScene", str1);
                }
                int i1 = a.g();
                Object[] objArray1 = new Object[i];
                p3.D().w(str2, "onEnterPage current taskType "+i1, objArray1);
                if (i1 != Integer.MIN_VALUE) {
                   h = g.h;
                   Objects.requireNonNull(h);
                   if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), h, og, str3)) {
                      h.c(null, Integer.valueOf(i1));
                   }
                   if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), h, og, "4")) {
                      LinkedHashMap linkedHashMa = new LinkedHashMap();
                      Iterator iterator = GrowthGuideConfigCacheHelper.e.a().iterator();
                      while (iterator.hasNext()) {
                         iterator1 = iterator.next().getGuideItemCfgs(a.b.a()).iterator();
                         while (iterator1.hasNext()) {
                            GrowthGuideItemConfig growthGuideI = iterator1.next();
                            if (i1 != Integer.MIN_VALUE && growthGuideI.getTaskType() != i1) {
                               continue ;
                            }
                            linkedHashMa.put(growthGuideI.getGuideItemId(), growthGuideI);
                         }
                      }
                      h.e(CollectionsKt___CollectionsKt.G5(linkedHashMa.values()));
                   }
                }else {
                   g h1 = g.h;
                   str1 = p1.B3();
                   a.o(str1, str4);
                   Objects.requireNonNull(h1);
                   if (!PatchProxy.applyVoidOneRefs(str1, h1, og, "2")) {
                      a.p(str1, str5);
                      h1.c(str1, null);
                   }
                   String str6 = p1.B3();
                   a.o(str6, str4);
                   if (!PatchProxy.applyVoidOneRefs(str6, h1, og, "5")) {
                      a.p(str6, str5);
                      LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                      int i2 = a.g();
                      iterator1 = GrowthGuideConfigCacheHelper.e.a().iterator();
                      while (iterator1.hasNext()) {
                         GrowthGuideConfig growthGuideC = iterator1.next();
                         Iterator iterator2 = growthGuideC.getGuideItemCfgs(a.b.a()).iterator();
                         while (iterator2.hasNext()) {
                            GrowthGuideItemConfig growthGuideI1 = iterator2.next();
                            if (i2 != Integer.MIN_VALUE && (growthGuideI1.getTaskType() == i2 && growthGuideC.getSupportScenes().contains(str6))) {
                               linkedHashMa1.put(growthGuideI1.getGuideItemId(), growthGuideI1);
                            }
                         }
                      }
                      g.a.putAll(linkedHashMa1);
                      h1.e(CollectionsKt___CollectionsKt.G5(linkedHashMa1.values()));
                   }
                }
                e.b.a(3, null, null);
             }
             g.h.d();
          }
       }else {
          Object[] objArray2 = new Object[i];
          p3.D().w("FlyWheel", "onEnterPage flywheel not enable", objArray2);
       }
       return;
    }
    public void we(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       g.h.g(p0);
       return;
    }
}
