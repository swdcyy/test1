package com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2$a;
import g14.e;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import com.google.gson.JsonObject;
import g14.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter;
import fq5.b;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import g14.d;

public final class LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2$a implements e	// class@001ac1
{
    public final LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2 a;

    public void LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2$a(LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2 p0){
       this.a = p0;
       super();
    }
    public final boolean a(Activity p0,String p1,JsonObject p2,a p3,User p4,BaseFeed p5){
       int i = 1;
       if (PatchProxy.isSupport(LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2$a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          p4 = PatchProxy.apply(objArray, this, LiveDynamicRightsGuaranteePendantPresenter$rnCommandHandler$2$a.class, "1");
          if (p4 != PatchProxyResult.class) {
             return p4.booleanValue();
          }
       }
       if (p0 == null || p0.isFinishing()) {
          p3.onFailed("Host is destroyed");
          return 0;
       }else {
          LiveDynamicRightsGuaranteePendantPresenter p = this.a.this$0.p;
          String str = null;
          String liveStreamId = (p != null)? p.getLiveStreamId(): str;
          if (p2 != null) {
             JsonElement jsonElement = p2.e0("liveStreamId");
             if (jsonElement != null) {
                str = jsonElement.w();
             }
          }
          if (!TextUtils.n(liveStreamId, str)) {
             return 0;
          }else if(p1.hashCode() == 0x2a6af3ff && p1.equals("getChallengeStatus")){
             p3.onSuccess(Integer.valueOf(this.a.this$0.s));
          }else {
             i = false;
          }
          return i;
       }
    }
    public String getLiveId(){
       return d.a(this);
    }
}
