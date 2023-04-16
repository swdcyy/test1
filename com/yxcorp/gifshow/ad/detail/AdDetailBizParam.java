package com.yxcorp.gifshow.ad.detail.AdDetailBizParam;
import im8.g;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import sy8.d;
import java.util.Map;
import java.util.HashMap;

public final class AdDetailBizParam implements g	// class@00153a
{
    public boolean mIsSameMerchantItem;

    public void AdDetailBizParam(){
       super();
    }
    public static AdDetailBizParam getBizParamFromBundle(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdDetailBizParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelable("adDetailBizParam"));
    }
    public static AdDetailBizParam getBizParamFromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdDetailBizParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelableExtra("adDetailBizParam"));
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdDetailBizParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, AdDetailBizParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(AdDetailBizParam.class, new d());
       }else {
          obj.put(AdDetailBizParam.class, null);
       }
       return obj;
    }
    public void putParamIntoBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailBizParam.class, "3")) {
          return;
       }
       p0.putParcelable("adDetailBizParam", b.c(this));
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailBizParam.class, "1")) {
          return;
       }
       p0.putExtra("adDetailBizParam", b.c(this));
       return;
    }
}
