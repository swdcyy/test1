package com.yxcorp.gifshow.homepage.serchcard.a;
import erd.g;
import com.yxcorp.gifshow.homepage.serchcard.b;
import java.lang.Object;
import ada.c;
import com.yxcorp.gifshow.homepage.serchcard.d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.p;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import com.yxcorp.gifshow.homepage.serchcard.d$a;
import java.util.List;
import java.lang.Long;
import java.util.Map;
import java.util.HashMap;
import crd.b;
import lnc.b9;
import com.google.gson.JsonObject;
import wkd.b;
import com.kwai.feature.component.entry.SearchEntryActionRecorder;
import com.google.gson.JsonElement;
import i89.a;
import fg6.a;
import com.google.gson.Gson;
import android.util.Base64;
import java.lang.Exception;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.homepage.serchcard.c;
import tl8.d;
import ok.h;
import tl8.e;
import java.util.Collection;
import ekd.q;
import java.util.Collections;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import lua.c;
import lua.b;

public final class a implements g	// class@0017f7
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b1;
       String str2;
       Gson a;
       a b = this.b;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!b.r.c1()) {
       }else {
          String str = "2";
          if (!b.r.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.RESUMED)) {
             HomeCardExperimentUtil e = HomeCardExperimentUtil.e;
             Objects.requireNonNull(e);
             Boolean uBoolean = PatchProxy.apply(null, e, HomeCardExperimentUtil.class, str);
             if (uBoolean == patchProxyRe) {
                uBoolean = HomeCardExperimentUtil.b.getValue();
             }
             if (!uBoolean.booleanValue()) {
             label_0049 :
                if (b.q != null && (b.V8() && (b.P8() && !w.B0(b.q.mEntity)))) {
                   b obj = PatchProxy.apply(null, b, b.class, "11");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(b.u.e() == null){
                      b1 = false;
                   }else {
                      b1 = TextUtils.n(b.q.getPhotoId(), b.u.e().getPhotoId());
                   }
                   if (b1) {
                      long l = 0;
                      if (b.u.c() - l > 0) {
                         b.u.h(l);
                         l = System.currentTimeMillis() - b.u.c();
                      }
                      b.u.k(b.w);
                      obj = b.u;
                      b q = b.q;
                      Objects.requireNonNull(obj);
                      if (!PatchProxy.applyVoidOneRefs(q, obj, uod, "4") && obj.k.size() < 20) {
                         obj.i.put("play_duration", Long.valueOf((System.currentTimeMillis() - obj.g)));
                         obj.i.put("photo_id", obj.h);
                         obj.i.put("user_id", q.getUserId());
                         obj.i.put("user_name", q.getUserName());
                         obj.k.add(obj.i);
                         obj.i = new HashMap();
                      }
                      w.L1(b.q.mEntity, true);
                      obj = b.u;
                      q = b.q;
                      Objects.requireNonNull(obj);
                      if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(q, Long.valueOf(l), obj, uod, "1")) {
                         b9.a(obj.a);
                         String str1 = PatchProxy.applyOneRefs(q, obj, uod, str);
                         if (str1 != patchProxyRe) {
                         }else {
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.c0("fromPhotoUserId", q.getUserId());
                            jsonObject.c0("fromPhotoUserName", q.getUserName());
                            str = b.a(0x7fb69d0c).a("search_entrance_findrs");
                            if (!TextUtils.x(str)) {
                               jsonObject.c0("actionInfos", str);
                            }
                            str1 = jsonObject.toString();
                         }
                         Object obj1 = str1;
                         Object obj2 = b.a(-1106399741);
                         d k = obj.k;
                         JsonObject obj3 = PatchProxy.applyOneRefs(k, obj, uod, "10");
                         if (obj3 != patchProxyRe) {
                            str2 = obj3;
                         }else {
                            try{
                               str1 = Base64.encodeToString((a.a.q(k)).getBytes(), 2);
                            }catch(java.lang.Exception e0){
                               e0.printStackTrace();
                               str1 = "";
                            }
                            obj.k.clear();
                            str2 = str1;
                         }
                         k = obj.f;
                         obj3 = PatchProxy.applyTwoRefs(k, q, obj, uod, "9");
                         if (obj3 != patchProxyRe) {
                         }else if(!k.size()){
                            k.add(q);
                         }
                         obj3 = new JsonObject();
                         Iterator iterator = k.iterator();
                         while (iterator.hasNext()) {
                            QPhoto qPhoto = iterator.next();
                            String photoId = qPhoto.getPhotoId();
                            BaseFeed entity = qPhoto.getEntity();
                            JsonElement jsonElement = PatchProxy.applyOneRefs(entity, obj, uod, "8");
                            if (jsonElement != patchProxyRe) {
                            }else {
                               List list = e.h(entity, CommonMeta.class, c.b);
                               a = a.a;
                               if (q.f(list)) {
                                  list = Collections.emptyList();
                               }
                               jsonElement = a.x(list);
                            }
                            obj3.G(photoId, jsonElement);
                         }
                         if (!PatchProxy.applyVoid(null, obj, uod, "5")) {
                            obj.f.clear();
                         }
                         obj.a = obj2.d(str2, obj3.toString(), q.getPhotoId(), "search_entrance_findrs", obj1).map(new e()).subscribeOn(d.c).observeOn(d.a).subscribe(new c(obj, l), new b(obj));
                      }
                   }
                }
             }
          }else {
             goto label_0049 ;
          }
       }
    label_024e :
       return;
    }
}
