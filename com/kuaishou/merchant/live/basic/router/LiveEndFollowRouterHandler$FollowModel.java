package com.kuaishou.merchant.live.basic.router.LiveEndFollowRouterHandler$FollowModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Exception;
import p74.a;
import o74.a;

public class LiveEndFollowRouterHandler$FollowModel implements Serializable	// class@0018b4
{
    public List mComponents;
    public long mDisplayMills;
    public String mExtraMap;
    public static final long serialVersionUID = 0x2a5dafb3c6d08d60;

    public void LiveEndFollowRouterHandler$FollowModel(){
       super();
    }
    public static LiveEndFollowRouterHandler$FollowModel parse(String p0){
       LiveEndFollowRouterHandler$FollowModel obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveEndFollowRouterHandler$FollowModel.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       try{
          obj = a.a.h(p0, LiveEndFollowRouterHandler$FollowModel.class);
       }catch(java.lang.Exception e5){
          a.h(MerchantCommonLogBiz.ROUTER, "FollowModel", "parse json failed", "msg", e5.getMessage());
       }
       return obj;
    }
}
