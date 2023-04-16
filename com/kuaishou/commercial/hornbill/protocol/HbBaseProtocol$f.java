package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$f;
import erd.g;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.google.gson.JsonObject;
import yx.j0;
import o49.g;
import com.google.gson.JsonArray;
import java.util.Collection;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import vx.d;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.entity.QPhoto;
import q35.c$a;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import q35.d;
import q35.c;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$executeInjectReport$shared$1;
import msd.l;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Number;
import o35.b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import x35.c;
import java.util.concurrent.CopyOnWriteArrayList;

public final class HbBaseProtocol$f implements g	// class@0014e8
{
    public final HbBaseProtocol b;
    public final BaseFeed c;
    public final String d;

    public void HbBaseProtocol$f(HbBaseProtocol p0,BaseFeed p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       String str3;
       HbBaseProtocol$f uof;
       HbBaseProtocol$f uof1;
       int i1;
       JsonObject jsonObject2;
       String obj2;
       int b1;
       int i3;
       c uoc1;
       int i4;
       Object obj = this;
       d obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, HbBaseProtocol$f.class, "1")) {
       }else {
          HbBaseProtocol$f b = obj.b;
          HbBaseProtocol$f c = obj.c;
          a.o(obj1, "it");
          HbBaseProtocol$f d = obj.d;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidThreeRefs(c, obj1, d, b, HbBaseProtocol.class, "4")) {
             JsonObject jsonObject = new JsonObject();
             int i = 0;
             Object[] objArray = new Object[i];
             String str = "ad_hornbill";
             String str1 = "start buildInjectSnapshot >>>";
             try{
                j0.a(str, str1, objArray);
                g.b(g.a, c, jsonObject, 0, 0, 12, null);
             }catch(java.lang.Exception e0){
             }
             JsonArray jsonArray = new JsonArray();
             String str2 = "verify";
             if (obj1.isEmpty() ^ 1) {
                Object[] objArray1 = new Object[i];
                j0.a(str, "verify data hit, feed is invalid:"+jsonObject+", execute real time report!", objArray1);
                Iterator iterator = obj1.iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   JsonObject jsonObject1 = new JsonObject();
                   jsonObject1.c0("rule_content", obj1.a);
                   jsonObject1.c0("current_value", obj1.b);
                   jsonArray.G(jsonObject1);
                }
                str1 = "inject";
                str3 = str2;
                uof = d;
                uof1 = c;
                if (!PatchProxy.applyVoidFourRefs(str1, c, d, jsonArray, b, HbBaseProtocol.class, "25")) {
                   jsonObject2 = b.c(uof, str1, 0x3f800000, null);
                   if (uof1 != null) {
                      g.a.e(jsonObject2, new QPhoto(uof1));
                   }
                   jsonObject2.G(str3, jsonArray);
                   c$a uoa1 = c$a.c();
                   uoa1.d(BusinessType.OTHER);
                   uoa1.g(SubBusinessType.OTHER);
                   uoa1.i(d.b);
                   uoa1.e("ad_ks_hornbill_guard");
                   uoa1.h(str);
                   uoa1.f(jsonObject2);
                   c uoc2 = uoa1.a();
                   a.o(uoc2, "rtLog");
                   j0.h(b.l(uof, "verifyRate"), uoc2);
                }
                i1 = 1;
             }else {
                str3 = str2;
                uof = d;
                uof1 = c;
                i1 = 0;
             }
             jsonObject2 = b.e("inject", uof1, uof, 0, new HbBaseProtocol$executeInjectReport$shared$1(b, i1));
             jsonObject2.c0("session", uof);
             jsonObject2.c0("feed", jsonObject.toString());
             jsonObject = jsonObject2.m0(str3);
             if (jsonObject != null) {
                jsonObject.G("error_list", jsonArray);
             }
             b.f(uof1, uof, "inject", jsonObject2);
             HbBaseProtocol hbBaseProtoc = HbBaseProtocol.class;
             if (!PatchProxy.applyVoidTwoRefs(uof1, uof, b, hbBaseProtoc, "37")) {
                Object[] objArray2 = new Object[0];
                j0.a(str, "execute logSnapshot, scene = "+uof, objArray2);
                if (!b.p(uof)) {
                   float f = b.l(uof, "snapshotRate");
                   JsonObject jsonObject3 = new JsonObject();
                   if (!PatchProxy.isSupport(hbBaseProtoc) || !PatchProxy.applyVoidTwoRefs(jsonObject3, Float.valueOf(f), b, hbBaseProtoc, "30")) {
                      i1 = (!f)? 0: (int)(0x3f800000 / f);
                      jsonObject3.a0("ratio_count", Integer.valueOf(i1));
                      jsonObject3.a0("snapshot_interval", Integer.valueOf(b.h()));
                   }
                   c$a uoa = c$a.b();
                   uoa.d(BusinessType.OTHER);
                   uoa.g(SubBusinessType.OTHER);
                   uoa.i(d.b);
                   uoa.e("ad_hornbill_series");
                   uoa.h(str);
                   uoa.f(jsonObject3);
                   c uoc = uoa.a();
                   long l = b.j(uof1);
                   b uob = b.g();
                   String str4 = String.valueOf(l);
                   int i2 = b.h() * 1000;
                   if (PatchProxy.isSupport(hbBaseProtoc)) {
                      obj2 = PatchProxy.applyTwoRefs(Long.valueOf(l), Float.valueOf(f), b, hbBaseProtoc, "41");
                      if (obj2 != PatchProxyResult.class) {
                         b1 = obj2.booleanValue();
                      }else if(!f - 0x3f800000){
                         obj2 = 1;
                      }else {
                         i4 = 0;
                      }
                      if (obj2) {
                         Object[] objArray3 = new Object[0];
                         j0.a(str, "isHitSnapshot,in SnapshotWhiteList,is hit!", objArray3);
                         b1 = true;
                      }else {
                         i4 = (int)(l ^ (l >> 32));
                         b1 = 0xf4240;
                         float f1 = ((float)i4 / (float)b1) - (float)(i4 / b1);
                         b1 = (f1 - f <= 0)? true: false;
                         Object[] objArray4 = new Object[0];
                         j0.a(str, "isHitSnapshot,rate = "+f+", compute result = "+f1+",isHit = "+b1, objArray4);
                      }
                   }else {
                      goto label_01f6 ;
                   }
                   Objects.requireNonNull(uob);
                   if (PatchProxy.isSupport(b.class)) {
                      i3 = i2;
                      obj2 = str4;
                      if (!PatchProxy.applyVoidFourRefs(uoc, str4, Integer.valueOf(i2), Boolean.valueOf(b1), uob, b.class, "22")) {
                      }
                   }else {
                      i3 = i2;
                      obj2 = str4;
                   }
                }
             }
          }
       }
    label_028c :
       return;
    }
}
