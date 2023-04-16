package mg.m0;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams;
import f55.g;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$PageShareParams;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import k2b.u1;
import java.lang.Exception;
import android.os.Bundle;
import com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$SharePlatformType;
import com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$ShareFileType;
import com.yxcorp.gifshow.model.response.SharePlatformDataResponse;
import java.util.List;
import java.util.Collections;
import com.yxcorp.gifshow.share.OperationModelUtil;
import brd.t;
import java.io.File;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.factory.QRImageForwardFactory;
import java.lang.Enum;
import msd.l;
import com.yxcorp.gifshow.share.OperationModelFactory;
import rhc.j;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import mhc.v1;
import mhc.p1;
import yic.o0;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mg.l0;
import xxb.b;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import e17.i;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class m0	// class@002636
{

    public static void a(Activity p0,JsIntownPageShareParams p1,g p2){
       JsIntownPageShareParams mParams;
       JsIntownPageShareParams$PageShareParams mSiteName;
       JsIntownPageShareParams$PageShareParams mSiteUrl;
       String str;
       JsIntownPageShareParams mParams1;
       OperationModel operationMod;
       QRImageForwardFactory qRImageForwa;
       JsIntownPageShareParams jsIntownPage = p1;
       g og = p2;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsInTownShare", "inTownShare: ", objArray);
       boolean b = true;
       boolean b1 = a.t().d("enableIntownShare", b);
       if (jsIntownPage) {
          mParams = jsIntownPage.mParams;
          if (mParams != null) {
             mSiteName = mParams.mSiteName;
             if (mSiteName == null) {
                str = "";
             }
             mSiteUrl = mParams.mSiteUrl;
             if (mSiteUrl == null) {
                mSiteUrl = "";
             }
          }else {
          label_0034 :
             mSiteUrl = "";
             str = mSiteUrl;
          }
       }else {
          goto label_0034 ;
       }
       try{
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("name", "inTownShare");
          jsonObject.c0("path", mSiteName);
          jsonObject.c0("url", mSiteUrl);
          jsonObject.a0("enabled", Integer.valueOf(b1));
          str = jsonObject.toString();
          u1.R("share_bridge_usage", str, 13);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (!b1) {
          return;
       }else {
          try{
             mParams = jsIntownPage.mParams;
             if (mParams == null) {
                og.a(412, "", new Bundle());
                return;
             }else if(mParams.mPlatformType != JsIntownPageShareParams$SharePlatformType.COPY_LINK && JsIntownPageShareParams$ShareFileType.IMAGE == mParams.mType){
                b = false;
             }
             SharePlatformDataResponse sharePlatfor = new SharePlatformDataResponse();
             sharePlatfor.mSharePlatformList = Collections.emptyList();
             if (b) {
                mParams1 = jsIntownPage.mParams;
                operationMod = OperationModelUtil.a.a(null, mParams.mCaption, mParams.mDesc, mParams1.mImageUrl, mParams1.mSiteUrl, t.just(sharePlatfor));
                qRImageForwa = new QRImageForwardFactory(i);
             }else {
                mParams1 = jsIntownPage.mParams;
                operationMod = OperationModelFactory.a(Collections.singletonList(mParams.mPlatformType.name()), mParams.mCaption, mParams.mDesc, mParams1.mImageUrl, mParams1.mSiteUrl, mParams1.mSiteName, null, null, t.just(sharePlatfor));
                qRImageForwa = new j(i);
             }
             operationMod.f = jsIntownPage.mHideResultToast;
             p1 op1 = o0.a(operationMod, mParams.mPlatformType.mKwaiOp, qRImageForwa);
             if (op1 == null) {
                og.a(432, "", new Bundle());
             }else {
                KwaiOperator.q.a(p0, operationMod, op1, new l0(og));
             }
          }catch(java.lang.Exception e0){
             i.d(R.style.arg_RES_7f110668, a.B.getString(R.string.arg_RES_7f10474b));
             PostUtils.D("JsInTownShare", "inTownShare", e0);
          }
             return;
       }
    }
}
