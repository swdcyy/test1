package com.yxcorp.gifshow.message.init.KLinkInitManager$1;
import com.kwai.chat.kwailink.data.ZtCommonInfo;
import com.yxcorp.gifshow.message.init.KLinkInitManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c97.d;
import h97.g;
import android.app.Application;
import o56.a;
import android.content.Context;
import ca7.m;
import java.lang.Number;
import java.lang.Long;

public class KLinkInitManager$1 extends ZtCommonInfo	// class@001221
{
    public final KLinkInitManager q;

    public void KLinkInitManager$1(KLinkInitManager p0){
       this.q = p0;
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getAppVersion();
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getChannel();
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().i();
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getPlatform();
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getProductName();
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getLanguage();
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(d.a().b().getLatitude());
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(d.a().b().getLongitude());
    }
    public String i(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getManufacturerAndModel();
    }
    public String j(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m.c(a.b());
    }
    public String k(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getSysRelease();
    }
    public long l(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return Long.parseLong(d.a().b().getUserId());
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, KLinkInitManager$1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b().getVersion();
    }
}
