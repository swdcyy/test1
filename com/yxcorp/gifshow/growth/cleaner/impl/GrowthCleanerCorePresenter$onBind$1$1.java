package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$onBind$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import ena.j;
import android.widget.TextView;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ena.h;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$a;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startCleanSelectedRubbish$1;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import fna.a0;
import fna.b0;
import erd.g;
import crd.b;
import crd.a;
import gna.b$b;
import gna.a;
import gna.b;
import gna.c;
import fna.f;
import java.lang.Boolean;
import java.lang.Float;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import fna.j$a;
import fna.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import io.reactivex.subjects.PublishSubject;

public final class GrowthCleanerCorePresenter$onBind$1$1 extends Lambda implements a	// class@001328
{
    public final GrowthCleanerCorePresenter$onBind$1 this$0;

    public void GrowthCleanerCorePresenter$onBind$1$1(GrowthCleanerCorePresenter$onBind$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] tag;
       GrowthCleanerCorePresenter u;
       float f2;
       GrowthCleanerCorePresenter d;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, GrowthCleanerCorePresenter$onBind$1$1.class, "1")) {
          return;
       }
       GrowthCleanerCorePresenter$onBind$1 b = obj.this$0.b;
       Objects.requireNonNull(b);
       String str = "5";
       if (!PatchProxy.applyVoid(objArray, b, GrowthCleanerCorePresenter.class, str)) {
          GrowthCleanerCorePresenter t = b.t;
          if (t != null) {
             j n = t.n;
             if (n != null) {
                tag = n.getTag();
             label_002f :
                if (tag instanceof Integer) {
                   GrowthCleanerCorePresenter f = b.F;
                   int i = 2;
                   boolean b1 = true;
                   if (f == null) {
                      b.w = b1;
                      b.S8();
                      h.c(b.getActivity(), false, i, objArray);
                   }else if(a.g(tag, Integer.valueOf(false))){
                      f.a().c();
                      h.c(b.getActivity(), false, i, objArray);
                   }else {
                      float f1 = 0;
                      if (a.g(tag, Integer.valueOf(b1))) {
                         GrowthCleanerService growthCleane = f.a();
                         Objects.requireNonNull(growthCleane);
                         if (PatchProxy.applyVoid(objArray, growthCleane, GrowthCleanerService.class, str) || (growthCleane.d == null && growthCleane.e == null)) {
                            growthCleane.e = b1;
                            growthCleane.b.c(t.create(new GrowthCleanerService$startCleanSelectedRubbish$1(growthCleane, new ArrayList(growthCleane.c))).subscribeOn(d.c).observeOn(d.a).subscribe(new a0(growthCleane), new b0(growthCleane)));
                         }
                      label_00b9 :
                         u = b.u;
                         if (u != null) {
                            b$b uob = u.J0();
                            if (uob != null) {
                               f2 = f.b(c.a(uob));
                            label_00ce :
                               b.E = f2;
                               Activity activity = b.getActivity();
                               t = b.z;
                               d = b.D;
                               f = b.E;
                               if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(activity, Boolean.valueOf(t), Float.valueOf(d), Float.valueOf(f), null, h.class, "4")) {
                                  ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                                  uElementPack.action2 = "CLEAN";
                                  JsonObject jsonObject = new JsonObject();
                                  jsonObject.a0("is_rescan", Integer.valueOf(t));
                                  jsonObject.a0("scan_total_size", Float.valueOf(d));
                                  jsonObject.a0("selected_total_size", Float.valueOf(f));
                                  uElementPack.params = jsonObject.toString();
                                  h.a(activity, uElementPack);
                               }
                               if (!b.E - f1) {
                                  h.d(b.getActivity(), false, b.z, b.D, b.C);
                               }
                            }
                         }
                         f2 = 0xbf800000;
                         goto label_00ce ;
                      }else if(a.g(tag, Integer.valueOf(i))){
                         b.E = f1;
                         u = b.p;
                         if (u == null) {
                            a.S("mCleanerEventSubject");
                         }
                         j$a uoa = new j$a(null, 0, new b(), new b(), CollectionsKt__CollectionsKt.E());
                         u.onNext(tag);
                         h.d(b.getActivity(), false, b.z, b.D, b.C);
                      }
                   }
                }
             }
          }
          tag = objArray;
          goto label_002f ;
       }
    label_017c :
       return;
    }
}
