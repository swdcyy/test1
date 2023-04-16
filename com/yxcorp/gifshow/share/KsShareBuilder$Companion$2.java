package com.yxcorp.gifshow.share.KsShareBuilder$Companion$2;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import uo7.k;
import java.lang.String;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import e17.i;

public final class KsShareBuilder$Companion$2 extends Lambda implements q	// class@001b40
{
    public static final KsShareBuilder$Companion$2 INSTANCE;

    static {
       KsShareBuilder$Companion$2.INSTANCE = new KsShareBuilder$Companion$2();
    }
    public void KsShareBuilder$Companion$2(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0, p1, p2.intValue()));
    }
    public final boolean invoke(k p0,String p1,int p2){
       ShareAnyResponse$ShareObject obj;
       ShareAnyResponse shareAnyResp;
       ShareAnyResponse$ShareAnyData mShareObject;
       ShareAnyResponse$ShareAnyData shareAnyData;
       if (PatchProxy.isSupport(KsShareBuilder$Companion$2.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, KsShareBuilder$Companion$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "conf");
       a.p(p1, "<anonymous parameter 1>");
       obj = null;
       boolean b = false;
       if (p2 != 1) {
          if (p2 == 2) {
             shareAnyResp = p0.r();
             if (shareAnyResp != null) {
                shareAnyResp = shareAnyResp.mShareAnyData;
                if (shareAnyResp != null) {
                   mShareObject = shareAnyResp.mShareObject;
                   if (mShareObject != null) {
                      if (TextUtils.isEmpty(mShareObject.mShareMessage) ^ 1) {
                         shareAnyData = mShareObject;
                      }
                      if (shareAnyData != null) {
                         KwaiToken kwaiToken = KwaiToken.k();
                         a.o(kwaiToken, "KwaiToken.getInstance\(\)");
                         kwaiToken.B1(shareAnyData.mShareMessage);
                         if (TextUtils.isEmpty(shareAnyData.mCopylinkSuccessTips)) {
                            Object[] objArray = new Object[]{Boolean.TRUE};
                            i.b(R.style.arg_RES_7f11066a, 0x7f10082a, objArray);
                         label_00a9 :
                            b = true;
                         }else {
                            i.f(R.style.arg_RES_7f11066a, shareAnyData.mCopylinkSuccessTips, 1);
                            goto label_00a9 ;
                         }
                      }
                   }
                }
             }
          }
       }else {
          shareAnyResp = p0.r();
          if (shareAnyResp != null) {
             shareAnyResp = shareAnyResp.mShareAnyData;
             if (shareAnyResp != null) {
                mShareObject = shareAnyResp.mShareObject;
                if (mShareObject != null) {
                   ShareAnyResponse$ShareObject mShareMessag = mShareObject.mShareMessage;
                   if (mShareMessag != null) {
                      p2 = (mShareMessag.length() > 0)? 1: 0;
                      if (p2) {
                         obj = mShareMessag;
                      }
                      if (obj != null) {
                         KwaiToken.k().B1(obj);
                         i.a(R.style.arg_RES_7f110669, 0x7f10082a);
                         goto label_00a9 ;
                      }
                   }
                }
             }
          }
       }
       return b;
    }
}
