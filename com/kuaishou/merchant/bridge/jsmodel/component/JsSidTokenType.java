package com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType;
import java.lang.Enum;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType$1;
import java.lang.String;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType$2;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType$3;
import f55.g;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenParams;
import com.yxcorp.gifshow.model.response.PassportServiceTokenResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import android.os.Bundle;
import java.io.Serializable;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiHttpsService;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import cjd.e;
import erd.o;
import xt3.a;
import xt3.b;
import erd.g;
import crd.b;

public abstract class JsSidTokenType extends Enum	// class@001620
{
    public static final JsSidTokenType[] $VALUES;
    public static final JsSidTokenType OTHER_IM;
    public static final JsSidTokenType ST_AD_IM;
    public static final JsSidTokenType ST_SHOP_IM;

    static {
       JsSidTokenType$1 u1 = new JsSidTokenType$1("ST_SHOP_IM", 0);
       JsSidTokenType.ST_SHOP_IM = u1;
       JsSidTokenType$2 u2 = new JsSidTokenType$2("ST_AD_IM", 1);
       JsSidTokenType.ST_AD_IM = u2;
       JsSidTokenType$3 u3 = new JsSidTokenType$3("OTHER_IM", 2);
       JsSidTokenType.OTHER_IM = u3;
       JsSidTokenType[] jsSidTokenTy = new JsSidTokenType[]{u1,u2,u3};
       JsSidTokenType.$VALUES = jsSidTokenTy;
    }
    public void JsSidTokenType(String p0,int p1){
       super(p0, p1);
    }
    public void JsSidTokenType(String p0,int p1,JsSidTokenType$1 p2){
       super(p0, p1);
    }
    public static void a(JsSidTokenType p0,g p1,JsSidTokenParams p2,PassportServiceTokenResponse p3){
       p0.lambda$refreshImToken$0(p1, p2, p3);
    }
    public static void callbackError(g p0,int p1,String p2){
       if (PatchProxy.isSupport(JsSidTokenType.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, JsSidTokenType.class, "6")) {
          return;
       }
       if (p0 != null) {
          p0.a(p1, p2, null);
       }
       return;
    }
    public static void callbackSuccess(g p0,Serializable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsSidTokenType.class, "5")) {
          return;
       }
       if (p0 != null) {
          p0.onSuccess(p1);
       }
       return;
    }
    public static void handleError(g p0,JsSidTokenParams p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, JsSidTokenType.class, "4")) {
          return;
       }
       if (p2 instanceof KwaiException) {
          JsSidTokenType.callbackError(p0, p2.getErrorCode(), p2.getMessage());
       }else {
          JsSidTokenType.callbackError(p0, 412, p2.getMessage());
       }
       return;
    }
    private void lambda$refreshImToken$0(g p0,JsSidTokenParams p1,PassportServiceTokenResponse p2){
       this.onResponse(p0, p1, p2);
    }
    public static void lambda$refreshImToken$1(g p0,JsSidTokenParams p1,Throwable p2){
       JsSidTokenType.handleError(p0, p1, p2);
    }
    public static JsSidTokenType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsSidTokenType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsSidTokenType.class, p0);
    }
    public static JsSidTokenType[] values(){
       Object obj = PatchProxy.apply(null, null, JsSidTokenType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsSidTokenType.$VALUES.clone();
    }
    public abstract void onResponse(g p0,JsSidTokenParams p1,PassportServiceTokenResponse p2);
    public void refreshImToken(g p0,JsSidTokenParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsSidTokenType.class, "3")) {
          return;
       }
       b.a(-171002483).getPassportServiceToken(p1.mSid, RequestTiming.DEFAULT).map(new e()).subscribe(new a(this, p0, p1), new b(p0, p1));
       return;
    }
    public abstract void runJs(g p0,JsSidTokenParams p1);
}
