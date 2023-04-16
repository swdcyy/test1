package com.yxcorp.gifshow.prettify.beauty.d$a;
import r0c.i;
import com.yxcorp.gifshow.prettify.beauty.d;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import ui9.f$a;
import xi9.b;
import java.lang.StringBuilder;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.util.Objects;
import u0c.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import h16.n;
import q0c.a0;
import java.util.Iterator;
import java.util.HashMap;
import lnc.i3;
import java.lang.Integer;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Float;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s66.a;
import com.yxcorp.gifshow.prettify.beauty.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public class d$a implements i	// class@0010fc
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(BeautifyConfig p0,Set p1){
       d u;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "BeautifyController";
       a.D().w(str, "EffectBus-Record-√¿—’±‰ªØ ", objArray);
       d$a ta = this.a;
       d g = ta.g;
       if (g != null && ta.m == null) {
          boolean b = g.R(new f$a(p0, p1));
          Object[] objArray1 = new Object[i];
          a.D().w(str, "set beauty enable : "+b, objArray1);
          ta = this.a;
          g = ta.c;
          if (g != CameraPageType.VIDEO && (g != CameraPageType.PHOTO && (g == CameraPageType.WHATS_UP || g == CameraPageType.TIE_TIE))) {
             if (ta.v != null) {
                boolean b1 = true;
                if (p0 != null) {
                   u = ta.u;
                   Objects.requireNonNull(u);
                   List list = PatchProxy.apply(null, u, a.class, "14");
                   if (list != PatchProxyResult.class) {
                   }else {
                      list = u.a.e();
                   }
                   if (p0.hasNeedToDropFpsItemEffect(list)) {
                      u = 1;
                   label_0085 :
                      d v = this.a.v;
                      if (!b || !u) {
                         b1 = false;
                      }
                      v.a(b1);
                   }
                }
                u = null;
                goto label_0085 ;
             }
             d$a ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(p0, ta1, d.class, "51")) {
                String str1 = "medicalBeauty";
                if (p0 != null && (p0.mId == -1 || ta1.w.isEmpty())) {
                   a.e(str1);
                }else {
                   Iterator iterator = ta1.x.iterator();
                   HashMap hashMap = new HashMap();
                   i3 oi3 = i3.f();
                   while (iterator.hasNext()) {
                      int i1 = iterator.next().intValue();
                      if (p0.mUnSupportItemList.contains(Integer.valueOf(i1))) {
                         continue ;
                      }else {
                         float filterValue = BeautyFilterItem.getFilterValue(p0, i1);
                         if (filterValue) {
                            BeautyFilterItem beautifyItem = p0.getBeautifyItemById(i1);
                            if (beautifyItem == null) {
                               continue ;
                            }else if(ta1.w.contains(Integer.valueOf(i1))){
                               hashMap.put(beautifyItem, Float.valueOf(filterValue));
                               ta1.w.remove(Integer.valueOf(i1));
                            }
                            oi3.c(String.valueOf(i1), Float.valueOf(filterValue));
                         }
                      }
                   }
                   String str2 = oi3.e();
                   if (TextUtils.x(str2)) {
                      a.e(str1);
                   }else {
                      a.d(str1, str2);
                   }
                   Object[] objArray2 = new Object[i];
                   a.D().w(str, "loggerMedicalBeautyUse : "+str2, objArray2);
                   if (!hashMap.isEmpty()) {
                      d e = ta1.e;
                      if (!PatchProxy.applyVoidThreeRefs(e, hashMap, p0, null, h.class, "42")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "USE_BEAUTY";
                         JsonObject jsonObject = new JsonObject();
                         JsonArray jsonArray = new JsonArray();
                         jsonObject.a0("suit_id", Integer.valueOf(p0.mId));
                         jsonObject.c0("suit_name", TextUtils.k(p0.mLoggerName));
                         Iterator iterator1 = hashMap.entrySet().iterator();
                         while (iterator1.hasNext()) {
                            Map$Entry uEntry = iterator1.next();
                            JsonObject jsonObject1 = new JsonObject();
                            jsonObject1.a0("id", Integer.valueOf(uEntry.getKey().mId));
                            jsonObject1.c0("name", TextUtils.k(uEntry.getKey().getLoggerName()));
                            jsonObject1.a0("value", uEntry.getValue());
                            jsonArray.G(jsonObject1);
                         }
                         jsonObject.G("items", jsonArray);
                         uElementPack.params = jsonObject.toString();
                         h$b uob = h$b.e(7, "USE_BEAUTY");
                         uob.k(uElementPack);
                         u1.p0("", e, uob);
                      }
                   }
                }
             }
          }
       }
    label_01ee :
       return;
    }
}
