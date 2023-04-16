package com.tencent.mm.opensdk.openapi.BaseWXApiImplV10;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;
import android.content.ContentResolver;
import android.net.Uri;
import android.database.Cursor;
import com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo;
import org.json.JSONObject;
import com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo;
import com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo;
import java.util.concurrent.CountDownLatch;
import com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$1;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Exception;
import java.lang.IllegalStateException;
import android.content.Intent;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXApiImplComm;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Resp;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Resp;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Resp;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Resp;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Resp;
import com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Resp;
import com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Resp;
import com.tencent.mm.opensdk.modelmsg.SendTdiAuth$Resp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Resp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Resp;
import com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Resp;
import com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayResp;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp;
import com.tencent.mm.opensdk.modelpay.JumpToOfflinePay$Resp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp;
import com.tencent.mm.opensdk.modelbiz.HandleScanResult$Resp;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Resp;
import com.tencent.mm.opensdk.modelbiz.JoinChatroom$Resp;
import com.tencent.mm.opensdk.modelbiz.CreateChatroom$Resp;
import com.tencent.mm.opensdk.modelbiz.OpenWebview$Resp;
import com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Resp;
import com.tencent.mm.opensdk.modelmsg.LaunchFromWX$Req;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX$Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.CharSequence;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Req;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Resp;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Resp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Resp;
import com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Resp;
import com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Resp;
import com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Resp;
import com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Resp;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$2;
import android.app.PendingIntent$OnFinished;
import android.os.Handler;
import com.tencent.mm.opensdk.channel.a.a$a;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Req;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Req;
import com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Req;
import com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Req;
import com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Req;
import java.net.URLEncoder;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Req;
import com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Req;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Req;
import java.util.HashMap;
import java.util.Map;
import com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Req;
import com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Req;
import com.tencent.mm.opensdk.openapi.MMSharedPreferences;
import com.tencent.mm.opensdk.channel.MMessageActV2$Args;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Req;
import com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Req;
import com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Req;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req;
import com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Req;
import com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Req;
import com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.tencent.mm.opensdk.utils.ILog;

public class BaseWXApiImplV10 implements IWXAPI	// class@000f16
{
    public String appId;
    public boolean checkSignature;
    public Context context;
    public boolean detached;
    public int launchMode;
    public int wxSdkVersion;
    public static String wxappPayEntryClassname;

    public void BaseWXApiImplV10(Context p0,String p1,boolean p2,int p3){
       super();
       this.checkSignature = false;
       this.detached = false;
       this.launchMode = 2;
       Log.d("MicroMsg.SDK.WXApiImplV10", "<init>, appId = "+p1+", checkSignature = "+p2+", launchMode = "+p3);
       this.context = p0;
       this.appId = p1;
       this.checkSignature = p2;
       this.launchMode = p3;
       b.a = p0.getApplicationContext();
    }
    public static int access$002(BaseWXApiImplV10 p0,int p1){
       p0.wxSdkVersion = p1;
       return p1;
    }
    public final boolean checkSumConsistent(byte[] p0,byte[] p1){
       String str1;
       String str = "MicroMsg.SDK.WXApiImplV10";
       if (p0 != null && (p0.length && (p1 == null || !p1.length))) {
          str1 = "checkSumConsistent fail, invalid arguments";
       }else if(p0.length != p1.length){
          str1 = "checkSumConsistent fail, length is different";
       }else {
          int i = 0;
          while (true) {
             if (i >= p0.length) {
                return true;
             }
             if (p0[i] != p1[i]) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return false;
       }
       Log.e(str, str1);
       return false;
    }
    public final boolean createChatroom(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.getString("_wxapi_basereq_transaction", ""),p1.getString("_wxapi_create_chatroom_group_id", ""),p1.getString("_wxapi_create_chatroom_chatroom_name", ""),p1.getString("_wxapi_create_chatroom_chatroom_nickname", ""),p1.getString("_wxapi_create_chatroom_ext_msg", ""),p1.getString("_wxapi_basereq_openid", "")};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public void detach(){
       Log.d("MicroMsg.SDK.WXApiImplV10", "detach");
       this.detached = true;
       this.context = null;
    }
    public final String finderShareVideoJumpInfoToString(IWXChannelJumpInfo p0){
       WXChannelJumpMiniProgramInfo path;
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("jumpType", p0.type());
          if (p0 instanceof WXChannelBaseJumpInfo) {
             jSONObject.put("wording", p0.wording);
             try{
                String str = "extra";
                jSONObject.put(str, p0.extra);
                if (p0 instanceof WXChannelJumpMiniProgramInfo) {
                   jSONObject.put("username", p0.username);
                   path = p0.path;
                   str = "path";
                }else if(p0 instanceof WXChannelJumpUrlInfo){
                   path = p0.url;
                   str = "url";
                }
                jSONObject.put(str, path);
             }catch(java.lang.Exception e0){
                return "";
             }
          }
          return jSONObject.toString();
       }catch(java.lang.Exception e0){
       }
    }
    public final String getTokenFromWX(Context p0){
       String[] stringArray = new String[]{this.appId,"638058496"};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, stringArray, null);
       if (uCursor != null && uCursor.moveToFirst()) {
          String str = uCursor.getString(0);
          Log.i("MicroMsg.SDK.WXApiImplV10", "getTokenFromWX token is "+str);
          uCursor.close();
          return str;
       }else {
          Log.e("MicroMsg.SDK.WXApiImplV10", "getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include \'com.tencent.mm\' in a set of <package> elements inside the <queries> element");
          return null;
       }
    }
    public int getWXAppSupportAPI(){
       if (this.detached != null) {
          throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
       }
       int i = 0;
       if (!this.isWXAppInstalled()) {
          Log.e("MicroMsg.SDK.WXApiImplV10", "open wx app failed, not installed or signature check failed");
          return i;
       }else {
          this.wxSdkVersion = i;
          CountDownLatch uCountDownLa = new CountDownLatch(1);
          b.e.submit(new BaseWXApiImplV10$1(this, uCountDownLa));
          try{
             int i1 = 1000;
             uCountDownLa.await(i1, TimeUnit.MILLISECONDS);
          }catch(java.lang.InterruptedException e0){
             Log.w("MicroMsg.SDK.WXApiImplV10", e0.getMessage());
          }
          Log.d("MicroMsg.SDK.WXApiImplV10", "wxSdkVersion = "+this.wxSdkVersion);
          if (this.wxSdkVersion == null) {
             try{
                this.wxSdkVersion = this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", i);
                Log.d("MicroMsg.SDK.WXApiImplV10", "OPEN_SDK_VERSION = "+this.wxSdkVersion);
             }catch(java.lang.Exception e0){
                Log.e("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : "+e0.getMessage());
             }
          }
       }
    }
    public boolean handleIntent(Intent p0,IWXAPIEventHandler p1){
       String str = "openbusinesswebview";
       boolean b = false;
       try{
          if (!WXApiImplComm.isIntentFromWx(p0, "com.tencent.mm.openapi.token")) {
             Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent fail, intent not from weixin msg");
             return b;
          }else if(this.detached == null){
             String stringExtra = p0.getStringExtra("_mmessage_content");
             int intExtra = p0.getIntExtra("_mmessage_sdkVersion", b);
             String stringExtra1 = p0.getStringExtra("_mmessage_appPackage");
             if (stringExtra1 == null || !stringExtra1.length()) {
                Log.e("MicroMsg.SDK.WXApiImplV10", "invalid argument");
                return b;
             }else if(!this.checkSumConsistent(p0.getByteArrayExtra("_mmessage_checksum"), a.a(stringExtra, intExtra, stringExtra1))){
                Log.e("MicroMsg.SDK.WXApiImplV10", "checksum fail");
                return b;
             }else {
                int intExtra1 = p0.getIntExtra("_wxapi_command_type", b);
                Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent, cmd = "+intExtra1);
                switch (intExtra1){
                    case 1:
                      p1.onResp(new SendAuth$Resp(p0.getExtras()));
                      return true;
                    case 2:
                      p1.onResp(new SendMessageToWX$Resp(p0.getExtras()));
                      return true;
                    case 3:
                      p1.onReq(new GetMessageFromWX$Req(p0.getExtras()));
                      return true;
                    case 4:
                      ShowMessageFromWX$Req req = new ShowMessageFromWX$Req(p0.getExtras());
                      WXMediaMessage messageExt = req.message.messageExt;
                      if (messageExt != null && messageExt.contains("wx_internal_resptype")) {
                         boolean b1 = this.handleWxInternalRespType(messageExt, p1);
                         Log.i("MicroMsg.SDK.WXApiImplV10", "handleIntent, extInfo contains wx_internal_resptype, ret = "+b1);
                         return b1;
                      }else if(messageExt != null && messageExt.contains(str)){
                         try{
                            Uri uri = Uri.parse(messageExt);
                            if (uri != null && str.equals(uri.getHost())) {
                               WXOpenBusinessWebview$Resp resp = new WXOpenBusinessWebview$Resp();
                               str = uri.getQueryParameter("ret");
                               if (str != null && str.length() > 0) {
                                  resp.errCode = b.a(str, b);
                               }
                               resp.resultInfo = uri.getQueryParameter("resultInfo");
                               resp.errStr = uri.getQueryParameter("errmsg");
                               str = uri.getQueryParameter("type");
                               if (str != null && str.length() > 0) {
                                  resp.businessType = b.a(str, b);
                               }
                               p1.onResp(resp);
                               return true;
                            }else {
                               Log.d("MicroMsg.SDK.WXApiImplV10", "not openbusinesswebview %"+messageExt);
                            }
                         }catch(java.lang.Exception e8){
                            Log.e("MicroMsg.SDK.WXApiImplV10", "parse fail, ex = "+e8.getMessage());
                         }
                      }
                      break;
                    case 5:
                      p1.onResp(new PayResp(p0.getExtras()));
                      return true;
                    case 6:
                      p1.onReq(new LaunchFromWX$Req(p0.getExtras()));
                      return true;
                    case 9:
                      p1.onResp(new AddCardToWXCardPackage$Resp(p0.getExtras()));
                      return true;
                    case 12:
                      p1.onResp(new OpenWebview$Resp(p0.getExtras()));
                      return true;
                    case 14:
                      p1.onResp(new CreateChatroom$Resp(p0.getExtras()));
                      return true;
                    case 15:
                      p1.onResp(new JoinChatroom$Resp(p0.getExtras()));
                      return true;
                    case 16:
                      p1.onResp(new ChooseCardFromWXCardPackage$Resp(p0.getExtras()));
                      return true;
                    case 17:
                      p1.onResp(new HandleScanResult$Resp(p0.getExtras()));
                      return true;
                    case 19:
                      p1.onResp(new WXLaunchMiniProgram$Resp(p0.getExtras()));
                      return true;
                    case 24:
                      p1.onResp(new JumpToOfflinePay$Resp(p0.getExtras()));
                      return true;
                    case 25:
                      p1.onResp(new WXOpenBusinessWebview$Resp(p0.getExtras()));
                      return true;
                    case 26:
                      p1.onResp(new WXOpenBusinessView$Resp(p0.getExtras()));
                      return true;
                    case 27:
                      p1.onResp(new WXJointPay$JointPayResp(p0.getExtras()));
                      return true;
                    case 28:
                      p1.onResp(new WXPreloadMiniProgram$Resp(p0.getExtras()));
                      return true;
                    case 29:
                      p1.onResp(new WXLaunchMiniProgramWithToken$Resp(p0.getExtras()));
                      return true;
                    case 30:
                      p1.onResp(new WXLaunchWxaRedirectingPage$Resp(p0.getExtras()));
                      return true;
                    case 31:
                      p1.onResp(new SendTdiAuth$Resp(p0.getExtras()));
                      return true;
                    case 32:
                      p1.onResp(new WXPreloadMiniProgramEnvironment$Resp(p0.getExtras()));
                      return true;
                    case '!':
                      p1.onResp(new WXChannelShareVideo$Resp(p0.getExtras()));
                      return true;
                    case '"':
                      p1.onResp(new WXChannelOpenProfile$Resp(p0.getExtras()));
                      return true;
                    case '#':
                      p1.onResp(new WXChannelOpenLive$Resp(p0.getExtras()));
                      return true;
                    case '$':
                      p1.onResp(new WXChannelOpenFeed$Resp(p0.getExtras()));
                      return true;
                    case '%':
                      p1.onResp(new WXOpenCustomerServiceChat$Resp(p0.getExtras()));
                      return true;
                    case '&':
                      p1.onResp(new WXQRCodePay$Resp(p0.getExtras()));
                      return true;
                    default:
                      Log.e("MicroMsg.SDK.WXApiImplV10", "unknown cmd = "+intExtra1);
                }
             }
          }else {
             throw new IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
          }
       }catch(java.lang.Exception e8){
          Log.e("MicroMsg.SDK.WXApiImplV10", "handleIntent fail, ex = "+e8.getMessage());
       }
       return b;
    }
    public final boolean handleWxInternalRespType(String p0,IWXAPIEventHandler p1){
       int i;
       String queryParamet1;
       Log.i("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType, extInfo = "+p0);
       try{
          i = 0;
          Uri uri = Uri.parse(p0);
          String queryParamet = uri.getQueryParameter("wx_internal_resptype");
          Log.i("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType, respType = "+queryParamet);
          if (b.b(queryParamet)) {
             Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, respType is null");
             return i;
          }else {
             String str = "openid";
             String str1 = "ret";
             if (queryParamet.equals("subscribemessage")) {
                SubscribeMessage$Resp resp = new SubscribeMessage$Resp();
                queryParamet1 = uri.getQueryParameter(str1);
                if (queryParamet1 != null && queryParamet1.length() > 0) {
                   resp.errCode = b.a(queryParamet1, i);
                }
                resp.openId = uri.getQueryParameter(str);
                resp.templateID = uri.getQueryParameter("template_id");
                resp.scene = b.a(uri.getQueryParameter("scene"), i);
                resp.action = uri.getQueryParameter("action");
                resp.reserved = uri.getQueryParameter("reserved");
                p1.onResp(resp);
                return true;
             }else if(queryParamet.contains("invoice_auth_insert")){
                WXInvoiceAuthInsert$Resp resp1 = new WXInvoiceAuthInsert$Resp();
                queryParamet1 = uri.getQueryParameter(str1);
                if (queryParamet1 != null && queryParamet1.length() > 0) {
                   resp1.errCode = b.a(queryParamet1, i);
                }
                resp1.wxOrderId = uri.getQueryParameter("wx_order_id");
                p1.onResp(resp1);
                return true;
             }else if(queryParamet.contains("payinsurance")){
                WXPayInsurance$Resp resp2 = new WXPayInsurance$Resp();
                queryParamet1 = uri.getQueryParameter(str1);
                if (queryParamet1 != null && queryParamet1.length() > 0) {
                   resp2.errCode = b.a(queryParamet1, i);
                }
                resp2.wxOrderId = uri.getQueryParameter("wx_order_id");
                p1.onResp(resp2);
                return true;
             }else if(queryParamet.contains("nontaxpay")){
                WXNontaxPay$Resp resp3 = new WXNontaxPay$Resp();
                queryParamet1 = uri.getQueryParameter(str1);
                if (queryParamet1 != null && queryParamet1.length() > 0) {
                   resp3.errCode = b.a(queryParamet1, i);
                }
                resp3.wxOrderId = uri.getQueryParameter("wx_order_id");
                p1.onResp(resp3);
                return true;
             }else if(("subscribeminiprogrammsg").equals(queryParamet) || ("5").equals(queryParamet)){
                SubscribeMiniProgramMsg$Resp resp4 = new SubscribeMiniProgramMsg$Resp();
                queryParamet1 = uri.getQueryParameter(str1);
                if (queryParamet1 != null && queryParamet1.length() > 0) {
                   resp4.errCode = b.a(queryParamet1, i);
                }
                resp4.openId = uri.getQueryParameter(str);
                resp4.unionId = uri.getQueryParameter("unionid");
                resp4.nickname = uri.getQueryParameter("nickname");
                resp4.errStr = uri.getQueryParameter("errmsg");
                p1.onResp(resp4);
                return true;
             }else {
                Log.e("MicroMsg.SDK.WXApiImplV10", "this open sdk version not support the request type");
             }
          }
       }catch(java.lang.Exception e9){
          Log.e("MicroMsg.SDK.WXApiImplV10", "handleWxInternalRespType fail, ex = "+e9.getMessage());
       }
       return i;
    }
    public boolean isWXAppInstalled(){
       if (this.detached != null) {
          throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
       }
       boolean b = false;
       try{
          PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
          if (packageInfo == null) {
             return b;
          }
          b = WXApiImplComm.validateAppSignature(this.context, packageInfo.signatures, this.checkSignature);
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean joinChatroom(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.getString("_wxapi_basereq_transaction", ""),p1.getString("_wxapi_join_chatroom_group_id", ""),p1.getString("_wxapi_join_chatroom_chatroom_nickname", ""),p1.getString("_wxapi_join_chatroom_ext_msg", ""),p1.getString("_wxapi_basereq_openid", "")};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final void launchWXIfNeed(){
       if (Build$VERSION.SDK_INT >= 29 && this.launchMode == 2) {
          this.launchWXUsingPendingIntent();
       }else {
          this.openWXApp();
       }
       return;
    }
    public final void launchWXUsingPendingIntent(){
       if (this.detached != null) {
          throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
       }
       if (!this.isWXAppInstalled()) {
          Log.e("MicroMsg.SDK.WXApiImplV10", "openWXApp failed, not installed or signature check failed");
          return;
       }else {
          try{
             Log.i("MicroMsg.SDK.WXApiImplV10", "launchWXUsingPendingIntent");
             PendingIntent.getActivity(this.context, 1, this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"), 0x8000000).send(this.context, 2, null, new BaseWXApiImplV10$2(this), null);
          }catch(java.lang.Exception e0){
             Log.e("MicroMsg.SDK.WXApiImplV10", "launchWXUsingPendingIntent pendingIntent send failed: "+e0.getMessage());
             this.openWXApp();
          }
          return;
       }
    }
    public boolean openWXApp(){
       String str;
       if (this.detached != null) {
          throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
       }
       try{
          if (!this.isWXAppInstalled()) {
             str = "open wx app failed, not installed or signature check failed";
          }else {
             BaseWXApiImplV10 tcontext = this.context;
             tcontext.startActivity(tcontext.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
             return true;
          }
       }catch(java.lang.Exception e0){
          str = "startActivity fail, exception = "+e0.getMessage();
       }
       Log.e("MicroMsg.SDK.WXApiImplV10", str);
       return false;
    }
    public boolean registerApp(String p0){
       return this.registerApp(p0, 0);
    }
    public boolean registerApp(String p0,long p1){
       if (this.detached != null) {
          throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
       }
       String str = "MicroMsg.SDK.WXApiImplV10";
       if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
          Log.e(str, "register app failed for wechat app signature check failed");
          return false;
       }else {
          Log.d(str, "registerApp, appId = "+p0);
          if (p0 != null) {
             this.appId = p0;
          }
          Log.d(str, "registerApp, appId = "+p0);
          if (p0 != null) {
             this.appId = p0;
          }
          Log.d(str, "register app "+this.context.getPackageName());
          a$a uoa = new a$a();
          uoa.a = "com.tencent.mm";
          uoa.b = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER";
          uoa.c = "weixin://registerapp?appid="+this.appId;
          uoa.d = p1;
          return a.a(this.context, uoa);
       }
    }
    public final boolean sendAddCardToWX(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.getString("_wxapi_add_card_to_wx_card_list"),p1.getString("_wxapi_basereq_transaction")};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendChooseCardFromWX(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[10];
       stringArray[0] = p1.getString("_wxapi_choose_card_from_wx_card_app_id");
       stringArray[1] = p1.getString("_wxapi_choose_card_from_wx_card_location_id");
       stringArray[2] = p1.getString("_wxapi_choose_card_from_wx_card_sign_type");
       stringArray[3] = p1.getString("_wxapi_choose_card_from_wx_card_card_sign");
       stringArray[4] = p1.getString("_wxapi_choose_card_from_wx_card_time_stamp");
       stringArray[5] = p1.getString("_wxapi_choose_card_from_wx_card_nonce_str");
       stringArray[6] = p1.getString("_wxapi_choose_card_from_wx_card_card_id");
       stringArray[7] = p1.getString("_wxapi_choose_card_from_wx_card_card_type");
       stringArray[8] = p1.getString("_wxapi_choose_card_from_wx_card_can_multi_select");
       stringArray[9] = p1.getString("_wxapi_basereq_transaction");
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendFinderOpenFeed(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Log.i("MicroMsg.SDK.WXApiImplV10", "sendFinderOpenFeed");
       String[] stringArray = new String[]{this.appId,p1.feedID,p1.nonceID,String.valueOf(p1.notGetReleatedList)};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenFeed"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendFinderOpenLive(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Log.i("MicroMsg.SDK.WXApiImplV10", "sendFinderOpenLive");
       String[] stringArray = new String[]{this.appId,p1.feedID,p1.nonceID};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenLive"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendFinderOpenProfile(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Log.i("MicroMsg.SDK.WXApiImplV10", "sendFinderOpenProfile");
       String[] stringArray = new String[]{this.appId,p1.userName};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenProfile"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendFinderShareVideo(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Log.i("MicroMsg.SDK.WXApiImplV10", "sendFinderShareVideo");
       String[] stringArray = new String[]{this.appId,p1.videoPath,"","",p1.extData,this.finderShareVideoJumpInfoToString(p1.jumpInfo)};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderShareVideo"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendHandleScanResult(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.getString("_wxapi_scan_qrcode_result")};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendInvoiceAuthInsert(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Object[] objArray = new Object[]{URLEncoder.encode(p1.url)};
       String[] stringArray = new String[]{this.appId,String.valueOf(2),URLEncoder.encode(String.format("url=%s", objArray))};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendJumpToOfflinePayReq(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendLaunchWXMiniprogram(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.userName,p1.path,p1.miniprogramType+"",p1.extData};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendLaunchWXMiniprogramWithToken(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.token};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendNonTaxPay(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Object[] objArray = new Object[]{URLEncoder.encode(p1.url)};
       String[] stringArray = new String[]{this.appId,String.valueOf(3),URLEncoder.encode(String.format("url=%s", objArray))};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendOpenBusiLuckyMoney(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.getString("_wxapi_open_busi_lucky_money_timeStamp"),p1.getString("_wxapi_open_busi_lucky_money_nonceStr"),p1.getString("_wxapi_open_busi_lucky_money_signType"),p1.getString("_wxapi_open_busi_lucky_money_signature"),p1.getString("_wxapi_open_busi_lucky_money_package")};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendOpenBusinessView(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.businessType,p1.query,p1.extInfo,p1.transaction,p1.openId};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessView"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendOpenBusinessWebview(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       ContentResolver contentResol = p0.getContentResolver();
       Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
       WXOpenBusinessWebview$Req queryInfo = p1.queryInfo;
       String str = "";
       String str1 = (queryInfo != null && queryInfo.size() > 0)? new JSONObject(p1.queryInfo).toString(): str;
       String[] stringArray = new String[]{this.appId,p1.businessType+str,str1};
       Cursor uCursor = contentResol.query(uri, null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendOpenCustomerServiceChat(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.corpId,p1.url};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendOpenRankListReq(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[0];
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return true;
    }
    public final boolean sendOpenWebview(Context p0,Bundle p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.getString("_wxapi_jump_to_webview_url"),p1.getString("_wxapi_basereq_transaction")};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendPayInSurance(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       Object[] objArray = new Object[]{URLEncoder.encode(p1.url)};
       String[] stringArray = new String[]{this.appId,String.valueOf(4),URLEncoder.encode(String.format("url=%s", objArray))};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendPayReq(Context p0,Bundle p1){
       if (BaseWXApiImplV10.wxappPayEntryClassname == null) {
          BaseWXApiImplV10.wxappPayEntryClassname = new MMSharedPreferences(p0).getString("_wxapp_pay_entry_classname_", null);
          Log.d("MicroMsg.SDK.WXApiImplV10", "pay, set wxappPayEntryClassname = "+BaseWXApiImplV10.wxappPayEntryClassname);
          if (BaseWXApiImplV10.wxappPayEntryClassname == null) {
             try{
                BaseWXApiImplV10.wxappPayEntryClassname = p0.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
             }catch(java.lang.Exception e0){
                Log.e("MicroMsg.SDK.WXApiImplV10", "get from metaData failed : "+e0.getMessage());
             }
          }
       }
       MMessageActV2$Args uArgs = new MMessageActV2$Args();
       uArgs.bundle = p1;
       uArgs.targetPkgName = "com.tencent.mm";
       uArgs.targetClassName = BaseWXApiImplV10.wxappPayEntryClassname;
       BaseWXApiImplV10 tlaunchMode = this.launchMode;
       try{
          uArgs.launchMode = tlaunchMode;
          String tokenFromWX = this.getTokenFromWX(p0);
          if (tokenFromWX != null) {
             uArgs.token = tokenFromWX;
          }
       }catch(java.lang.Exception e7){
          Log.e("MicroMsg.SDK.WXApiImplV10", "getTokenFromWX fail, exception = "+e7);
       }
       return MMessageActV2.send(p0, uArgs);
    }
    public final boolean sendPreloadWXMiniProgramEnvironment(Context p0,BaseReq p1){
       String[] stringArray = new String[]{this.appId,p1.extData};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendPreloadWXMiniprogram(Context p0,BaseReq p1){
       String[] stringArray = new String[]{this.appId,p1.userName,p1.path,p1.miniprogramType+"",p1.extData};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendQRCodePayReq(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,p1.codeContent,p1.extraMsg};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/QRCodePay"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public boolean sendReq(BaseReq p0){
       String str1;
       SendMessageToWX$Req req;
       SendMessageToWX$Req sceneDataObj;
       int type;
       WXWebpageObject wXWebpageObj;
       StringBuilder str3;
       object oobject;
       if (this.detached != null) {
          throw new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
       }
       String str = "com.tencent.mm";
       boolean b = false;
       if (!WXApiImplComm.validateAppSignatureForPackage(this.context, str, this.checkSignature)) {
          str1 = "sendReq failed for wechat app signature check failed";
       }else {
          int i = 2;
          if (p0.getType() == i) {
             req = p0;
             if (req.scene == 4) {
                sceneDataObj = req.sceneDataObject;
                if (sceneDataObj instanceof WXStateSceneDataObject) {
                   SendMessageToWX$Req message = req.message;
                   if (message.mediaObject == null) {
                      message.mediaObject = new WXTextObject();
                   }
                   if (req.message.getType() == 1) {
                      WXStateSceneDataObject stateTitle = sceneDataObj.stateTitle;
                      if (stateTitle == null || stateTitle.length() <= 0) {
                         sceneDataObj.stateTitle = req.message.mediaObject.text;
                      }
                   }
                }
             }
          }
          if (!p0.checkArgs()) {
             str1 = "sendReq checkArgs fail";
          }else {
             Log.i("MicroMsg.SDK.WXApiImplV10", "sendReq, req type = "+p0.getType());
             Bundle uBundle = new Bundle();
             p0.toBundle(uBundle);
             if (p0.getType() == 5 || p0.getType() == 27) {
                return this.sendPayReq(this.context, uBundle);
             }else if(p0.getType() == 9){
                return this.sendAddCardToWX(this.context, uBundle);
             }else if(p0.getType() == 16){
                return this.sendChooseCardFromWX(this.context, uBundle);
             }else if(p0.getType() == 11){
                return this.sendOpenRankListReq(this.context, uBundle);
             }else if(p0.getType() == 12){
                return this.sendOpenWebview(this.context, uBundle);
             }else if(p0.getType() == 25){
                return this.sendOpenBusinessWebview(this.context, p0);
             }else if(p0.getType() == 13){
                return this.sendOpenBusiLuckyMoney(this.context, uBundle);
             }else if(p0.getType() == 14){
                return this.createChatroom(this.context, uBundle);
             }else if(p0.getType() == 15){
                return this.joinChatroom(this.context, uBundle);
             }else if(p0.getType() == 17){
                return this.sendHandleScanResult(this.context, uBundle);
             }else if(p0.getType() == 18){
                return this.sendSubscribeMessage(this.context, p0);
             }else if(p0.getType() == 28){
                return this.sendPreloadWXMiniprogram(this.context, p0);
             }else if(p0.getType() == 29){
                return this.sendLaunchWXMiniprogramWithToken(this.context, p0);
             }else if(p0.getType() == 23){
                return this.sendSubscribeMiniProgramMsg(this.context, p0);
             }else if(p0.getType() == 19){
                return this.sendLaunchWXMiniprogram(this.context, p0);
             }else if(p0.getType() == 32){
                return this.sendPreloadWXMiniProgramEnvironment(this.context, p0);
             }else if(p0.getType() == 30){
                return this.sendToWxaRedirectingPage(this.context, p0);
             }else if(p0.getType() == 26){
                return this.sendOpenBusinessView(this.context, p0);
             }else if(p0.getType() == 33){
                return this.sendFinderShareVideo(this.context, p0);
             }else if(p0.getType() == 34){
                return this.sendFinderOpenProfile(this.context, p0);
             }else if(p0.getType() == 35){
                return this.sendFinderOpenLive(this.context, p0);
             }else if(p0.getType() == 36){
                return this.sendFinderOpenFeed(this.context, p0);
             }else if(p0.getType() == 37){
                return this.sendOpenCustomerServiceChat(this.context, p0);
             }else if(p0.getType() == 38){
                return this.sendQRCodePayReq(this.context, p0);
             }else if(p0.getType() == 20){
                return this.sendInvoiceAuthInsert(this.context, p0);
             }else if(p0.getType() == 21){
                return this.sendNonTaxPay(this.context, p0);
             }else if(p0.getType() == 22){
                return this.sendPayInSurance(this.context, p0);
             }else if(p0.getType() == 24){
                return this.sendJumpToOfflinePayReq(this.context, uBundle);
             }else if(p0.getType() == i){
                SendMessageToWX$Req req1 = p0;
                type = req1.message.getType();
                if (b.a(type)) {
                   String str2 = "_wxminiprogram_webpageurl";
                   if (this.getWXAppSupportAPI() < 0x25000001) {
                      wXWebpageObj = new WXWebpageObject();
                   label_024e :
                      wXWebpageObj.webpageUrl = uBundle.getString(str2);
                      req1.message.mediaObject = wXWebpageObj;
                   }else if(type == 46 && this.getWXAppSupportAPI() < 0x25030100){
                      wXWebpageObj = new WXWebpageObject();
                      goto label_024e ;
                   }else {
                      WXMediaMessage mediaObject = req1.message.mediaObject;
                      mediaObject.userName = mediaObject.userName+"@app";
                      WXMiniProgramObject path = mediaObject.path;
                      if (!b.b(path)) {
                         String[] stringArray = path.split("\\?");
                         if (stringArray.length > 1) {
                            str3 = stringArray[b]+".html?";
                            oobject = stringArray[1];
                         }else {
                            str3 = stringArray[b];
                            oobject = ".html";
                         }
                         mediaObject.path = str3+oobject;
                      }
                   }
                   sceneDataObj = req1.scene;
                   if (sceneDataObj != 3 && sceneDataObj != 1) {
                      req1.scene = b;
                   }
                   p0.toBundle(uBundle);
                }
             }
             MMessageActV2$Args uArgs = new MMessageActV2$Args();
             uArgs.bundle = uBundle;
             uArgs.content = "weixin://sendreq?appid="+this.appId;
             uArgs.targetPkgName = str;
             uArgs.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
             BaseWXApiImplV10 tlaunchMode = this.launchMode;
             try{
                uArgs.launchMode = tlaunchMode;
                String tokenFromWX = this.getTokenFromWX(this.context);
                if (tokenFromWX != null) {
                   uArgs.token = tokenFromWX;
                }
             }catch(java.lang.Exception e0){
                Log.e("MicroMsg.SDK.WXApiImplV10", "getTokenFromWX fail, exception = "+e0);
             }
             return MMessageActV2.send(this.context, uArgs);
          }
       }
       Log.e("MicroMsg.SDK.WXApiImplV10", str1);
       return b;
    }
    public boolean sendResp(BaseResp p0){
       String str1;
       if (this.detached != null) {
          throw new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
       }
       String str = "com.tencent.mm";
       boolean b = false;
       if (!WXApiImplComm.validateAppSignatureForPackage(this.context, str, this.checkSignature)) {
          str1 = "sendResp failed for wechat app signature check failed";
       }else if(!p0.checkArgs()){
          str1 = "sendResp checkArgs fail";
       }else {
          Bundle uBundle = new Bundle();
          p0.toBundle(uBundle);
          MMessageActV2$Args uArgs = new MMessageActV2$Args();
          uArgs.bundle = uBundle;
          uArgs.content = "weixin://sendresp?appid="+this.appId;
          uArgs.targetPkgName = str;
          String str2 = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
          try{
             uArgs.targetClassName = str2;
             str2 = this.getTokenFromWX(this.context);
             if (str2 != null) {
                uArgs.token = str2;
             }
          }catch(java.lang.Exception e0){
             Log.e("MicroMsg.SDK.WXApiImplV10", "getTokenFromWX fail, exception = "+e0);
          }
          return MMessageActV2.send(this.context, uArgs);
       }
       Log.e("MicroMsg.SDK.WXApiImplV10", str1);
       return b;
    }
    public final boolean sendSubscribeMessage(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,String.valueOf(1),String.valueOf(p1.scene),p1.templateID,p1.reserved};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendSubscribeMiniProgramMsg(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       String[] stringArray = new String[]{this.appId,String.valueOf(5),p1.miniProgramAppId};
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, stringArray, null);
       if (uCursor != null) {
          uCursor.close();
       }
       return 1;
    }
    public final boolean sendToWxaRedirectingPage(Context p0,BaseReq p1){
       this.launchWXIfNeed();
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(0, this.appId);
       uArrayList.addAll(Arrays.asList(p1.toArray()));
       String[] stringArray = new String[0];
       Cursor uCursor = p0.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage"), null, 0, uArrayList.toArray(stringArray), null);
       if (uCursor != null) {
          uCursor.close();
       }
       return true;
    }
    public void setLogImpl(ILog p0){
       Log.setLogImpl(p0);
    }
    public void unregisterApp(){
       if (this.detached != null) {
          throw new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
       }
       String str = "com.tencent.mm";
       String str1 = "MicroMsg.SDK.WXApiImplV10";
       if (!WXApiImplComm.validateAppSignatureForPackage(this.context, str, this.checkSignature)) {
          Log.e(str1, "unregister app failed for wechat app signature check failed");
          return;
       }else {
          Log.d(str1, "unregisterApp, appId = "+this.appId);
          BaseWXApiImplV10 tappId = this.appId;
          if (tappId == null || !tappId.length()) {
             Log.e(str1, "unregisterApp fail, appId is empty");
             return;
          }else {
             Log.d(str1, "unregister app "+this.context.getPackageName());
             a$a uoa = new a$a();
             uoa.a = str;
             uoa.b = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER";
             uoa.c = "weixin://unregisterapp?appid="+this.appId;
             a.a(this.context, uoa);
             return;
          }
       }
    }
}
