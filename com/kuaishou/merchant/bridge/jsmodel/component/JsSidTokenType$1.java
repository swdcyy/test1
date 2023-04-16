package com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType$1;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenType;
import java.lang.String;
import f55.g;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenParams;
import com.yxcorp.gifshow.model.response.PassportServiceTokenResponse;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenResult;
import java.io.Serializable;
import w90.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class JsSidTokenType$1 extends JsSidTokenType	// class@00161d
{

    public void JsSidTokenType$1(String p0,int p1){
       super(p0, p1, null);
    }
    public void onResponse(g p0,JsSidTokenParams p1,PassportServiceTokenResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, JsSidTokenType$1.class, "2")) {
          return;
       }
       JsSidTokenType.callbackSuccess(p0, new JsSidTokenResult(p2.mSecurity, p2.mShopIMServiceToken));
       SharedPreferences a = a.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putString(b.d("user")+"kuaishou_shop_im_token", p2.mShopIMServiceToken);
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putString(b.d("user")+"kuaishou_shop_im_ssecurity", p2.mSecurity);
       g.a(uEditor1);
       return;
    }
    public void runJs(g p0,JsSidTokenParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsSidTokenType$1.class, "1")) {
          return;
       }
       if (p1.mForceRefresh != null) {
          this.refreshImToken(p0, p1);
       }else {
          SharedPreferences a = a.a;
          String str = a.getString(b.d("user")+"kuaishou_shop_im_ssecurity", "");
          String str1 = a.getString(b.d("user")+"kuaishou_shop_im_token", "");
          if (TextUtils.x(str) || TextUtils.x(str1)) {
             this.refreshImToken(p0, p1);
          }else {
             JsSidTokenType.callbackSuccess(p0, new JsSidTokenResult(str, str1));
          }
       }
       return;
    }
}
