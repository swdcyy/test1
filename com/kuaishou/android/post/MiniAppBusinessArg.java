package com.kuaishou.android.post.MiniAppBusinessArg;
import com.kuaishou.android.post.SerialArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import com.kwai.feature.post.api.feature.mix.model.MiniAppBusinessInfoModel;
import java.lang.CharSequence;
import java.util.Map;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import qrd.l1;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;

public final class MiniAppBusinessArg extends SerialArg	// class@000ea2
{

    public void MiniAppBusinessArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2);
    }
    public final boolean isValid(){
       MiniAppBusinessInfoModel obj = PatchProxy.apply(null, this, MiniAppBusinessArg.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getValue() != null) {
          obj = this.getValue();
          a.m(obj);
          if (obj.mBusinessLinkModel != null) {
             obj = this.getValue();
             a.m(obj);
             obj = obj.mAppId;
             obj = (obj == null || !obj.length())? 1: 0;
             if (!obj) {
             label_0044 :
                return b;
             }
          }
       }
       b = false;
       goto label_0044 ;
    }
    public final void readFromMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MiniAppBusinessArg.class, "3")) {
          return;
       }
       MiniAppBusinessInfoModel miniAppBusin = 1;
       int i = 0;
       String str = (p0 == null || p0.isEmpty())? 1: null;
       if (str) {
          return;
       }else {
          str = p0.get("serviceId");
          String str1 = p0.get("appId");
          String str2 = p0.get("appTitle");
          String str3 = p0.get("subType");
          int i1 = (str == null || !str.length())? 1: 0;
          if (!i1) {
             i1 = (str1 == null || !str1.length())? 1: 0;
             if (!i1) {
                i1 = (str2 == null || !str2.length())? 1: 0;
                if (!i1) {
                   if (str3 != null && str3.length()) {
                      miniAppBusin = null;
                   }
                   if (!miniAppBusin) {
                      miniAppBusin = new MiniAppBusinessInfoModel();
                      miniAppBusin.mAppId = str1;
                      UpdateShareBusinessLinkModel updateShareB = new UpdateShareBusinessLinkModel();
                      updateShareB.mServiceId = str;
                      updateShareB.mMetaText = str2;
                      updateShareB.mSubtype = str3;
                      miniAppBusin.mBusinessLinkModel = updateShareB;
                      this.setValue(miniAppBusin);
                      Object[] objArray = new Object[i];
                      p3.D().w("MiniAppBusinessArg", "MiniAppBusinessArg readFromMap value: "+this.getValue(), objArray);
                   }
                }
             }
          }
       label_00ae :
          return;
       }
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MiniAppBusinessArg.class, "4")) {
          return;
       }
       a.p(p0, "v");
       return;
    }
    public void readScheme(Intent p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, MiniAppBusinessArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       int i = 0;
       if (this.getValue() != null) {
          objArray = new Object[i];
          p3.D().A("MiniAppBusinessArg", "MiniAppBusinessArg readScheme value has been set "+this.getValue(), objArray);
          return;
       }else {
          String str = x0.a(p0.getData(), "from");
          if (str instanceof String && !str.equals("miniProgram")) {
             objArray = new Object[i];
             p3.D().A("MiniAppBusinessArg", "MiniAppBusinessArg readScheme from is not miniProgram "+this.getValue(), objArray);
             return;
          }else {
             str = x0.a(p0.getData(), "serviceId");
             String str1 = x0.a(p0.getData(), "appId");
             String str2 = x0.a(p0.getData(), "appTitle");
             String str3 = x0.a(p0.getData(), "subType");
             MiniAppBusinessInfoModel miniAppBusin = 1;
             int i1 = (str == null || !str.length())? 1: 0;
             if (!i1) {
                i1 = (str1 == null || !str1.length())? 1: 0;
                if (!i1) {
                   i1 = (str2 == null || !str2.length())? 1: 0;
                   if (!i1) {
                      if (str3 != null && str3.length()) {
                         miniAppBusin = null;
                      }
                      if (!miniAppBusin) {
                         miniAppBusin = new MiniAppBusinessInfoModel();
                         miniAppBusin.mAppId = str1;
                         UpdateShareBusinessLinkModel updateShareB = new UpdateShareBusinessLinkModel();
                         updateShareB.mServiceId = str;
                         updateShareB.mMetaText = str2;
                         updateShareB.mSubtype = str3;
                         miniAppBusin.mBusinessLinkModel = updateShareB;
                         this.setValue(miniAppBusin);
                         objArray = new Object[i];
                         p3.D().w("MiniAppBusinessArg", "MiniAppBusinessArg readScheme value: "+this.getValue(), objArray);
                      }
                   }
                }
             }
          label_010a :
             return;
          }
       }
    }
    public void set(MiniAppBusinessInfoModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MiniAppBusinessArg.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("MiniAppBusinessArg", "MiniAppBusinessArg reset old: "+this.getValue()+" new "+p0, objArray);
       this.setValue(p0);
       return;
    }
    public void set(Object p0){
       this.set(p0);
    }
}
