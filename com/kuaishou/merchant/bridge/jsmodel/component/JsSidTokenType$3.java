package com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType$3;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType;
import java.lang.String;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType$1;
import f55.g;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenParams;
import java.util.HashMap;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenAdResult;
import java.io.Serializable;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import com.yxcorp.gifshow.model.response.PassportServiceTokenResponse;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiHttpsService;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import cjd.e;
import erd.o;
import xt3.c;
import xt3.d;
import erd.g;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class JsSidTokenType$3 extends JsSidTokenType	// class@00161f
{

    public void JsSidTokenType$3(String p0,int p1){
       super(p0, p1, null);
    }
    public static void b(JsSidTokenType$3 p0,g p1,JsSidTokenParams p2,HashMap p3){
       p0.lambda$refreshUnknownImToken$0(p1, p2, p3);
    }
    private void lambda$refreshUnknownImToken$0(g p0,JsSidTokenParams p1,HashMap p2){
       this.handleJsonObjectResponse(p0, p1, p2);
    }
    public static void lambda$refreshUnknownImToken$1(g p0,JsSidTokenParams p1,Throwable p2){
       JsSidTokenType.handleError(p0, p1, p2);
    }
    public final void handleJsonObjectResponse(g p0,JsSidTokenParams p1,HashMap p2){
       String str = "ssecurity";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, JsSidTokenType$3.class, "3")) {
          return;
       }
       String str1 = p2.get(p1.mSid+"_st");
       String str2 = (QCurrentUser.me() == null)? "": QCurrentUser.me().getId();
       JsSidTokenType.callbackSuccess(p0, new JsSidTokenAdResult(p2.get(str), str1));
       Object[] objArray = new Object[]{p1.mSid,str2};
       Object[] objArray1 = new Object[]{p1.mSid,str2};
       g.a(n.b().edit().putString(String.format("jsinject_%s%s_ImSsecurity", objArray), p2.get(str)).putString(String.format("jsinject_%s%s_ImToken", objArray1), str1));
       return;
    }
    public void onResponse(g p0,JsSidTokenParams p1,PassportServiceTokenResponse p2){
    }
    public final void refreshUnknownImToken(g p0,JsSidTokenParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsSidTokenType$3.class, "2")) {
          return;
       }
       b.a(-171002483).getUnknownPassportServiceToken(p1.mSid, RequestTiming.DEFAULT).map(new e()).subscribe(new c(this, p0, p1), new d(p0, p1)).isDisposed();
       return;
    }
    public void runJs(g p0,JsSidTokenParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsSidTokenType$3.class, "1")) {
          return;
       }
       if (p1.mForceRefresh != null) {
          this.refreshUnknownImToken(p0, p1);
       }else {
          String str = "";
          String str1 = (QCurrentUser.me() == null)? str: QCurrentUser.me().getId();
          Object[] objArray = new Object[]{p1.mSid,str1};
          String str2 = n.b().getString(String.format("jsinject_%s%s_ImSsecurity", objArray), str);
          Object[] objArray1 = new Object[]{p1.mSid,str1};
          str1 = n.b().getString(String.format("jsinject_%s%s_ImToken", objArray1), str);
          if (TextUtils.x(str2) || TextUtils.x(str1)) {
             this.refreshUnknownImToken(p0, p1);
          }else {
             JsSidTokenType.callbackSuccess(p0, new JsSidTokenAdResult(str2, str1));
          }
       }
       return;
    }
}
