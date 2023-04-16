package com.frog.engine.internal.BaseCommandHandler;
import android.app.Application;
import com.frog.engine.keyboard.FrogKeyBoard;
import com.frog.engine.internal.CommandExpandFuncListener;
import com.frog.engine.storage.FrogStorageManager;
import java.lang.Object;
import java.util.HashMap;
import com.frog.engine.internal.BaseCommandHandler$z;
import com.frog.engine.internal.BaseCommandHandler$A;
import com.frog.engine.internal.BaseCommandHandler$B;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.FrogCommandResponseListener;
import com.frog.engine.jsobject.FrogJSObject;
import java.lang.Boolean;
import java.util.Map;
import android.content.Context;
import com.frog.engine.utils.ViewUtils;
import com.frog.engine.data.FrogInitParam;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;
import android.os.Build$VERSION;
import ekd.l1;
import com.frog.engine.internal.FrogEngineInternal;
import com.frog.engine.internal.BaseCommandHandler$k;
import com.frog.engine.internal.BaseCommandHandler$v;
import com.frog.engine.internal.BaseCommandHandler$C;
import com.frog.engine.internal.BaseCommandHandler$D;
import com.frog.engine.internal.BaseCommandHandler$E;
import com.frog.engine.internal.BaseCommandHandler$F;
import com.frog.engine.internal.BaseCommandHandler$G;
import com.frog.engine.internal.BaseCommandHandler$H;
import com.frog.engine.internal.BaseCommandHandler$I;
import com.frog.engine.internal.BaseCommandHandler$a;
import com.frog.engine.internal.BaseCommandHandler$b;
import com.frog.engine.internal.BaseCommandHandler$c;
import com.frog.engine.internal.BaseCommandHandler$d;
import com.frog.engine.internal.BaseCommandHandler$e;
import com.frog.engine.internal.BaseCommandHandler$f;
import com.frog.engine.internal.BaseCommandHandler$g;
import com.frog.engine.internal.BaseCommandHandler$h;
import com.frog.engine.internal.BaseCommandHandler$i;
import com.frog.engine.internal.BaseCommandHandler$j;
import com.frog.engine.internal.BaseCommandHandler$l;
import com.frog.engine.internal.BaseCommandHandler$m;
import com.frog.engine.internal.BaseCommandHandler$n;
import com.frog.engine.internal.BaseCommandHandler$o;
import com.frog.engine.internal.BaseCommandHandler$p;
import com.frog.engine.internal.BaseCommandHandler$q;
import com.frog.engine.internal.BaseCommandHandler$r;
import com.frog.engine.internal.BaseCommandHandler$s;
import com.frog.engine.internal.BaseCommandHandler$t;
import com.frog.engine.internal.BaseCommandHandler$u;
import com.frog.engine.internal.BaseCommandHandler$w;
import com.frog.engine.internal.BaseCommandHandler$x;
import com.frog.engine.internal.BaseCommandHandler$y;

public class BaseCommandHandler	// class@00152e
{
    public Map mBaseCommands;
    public SensorEventListener mCompassSensorEventListener;
    public Application mContext;
    public FrogKeyBoard mFrogKeyBoard;
    public FrogStorageManager mFrogStorageManager;
    public SensorEventListener mGyroscopeSensorEventListener;
    public FrogInitParam mInitParam;
    public CommandExpandFuncListener mSendListener;
    public SensorEventListener mSensorEventListener;
    public int mWindowHeight;
    public int mWindowWidth;

    public void BaseCommandHandler(Application p0,FrogKeyBoard p1,CommandExpandFuncListener p2,FrogStorageManager p3){
       super();
       this.mBaseCommands = new HashMap();
       this.mSensorEventListener = new BaseCommandHandler$z(this);
       this.mCompassSensorEventListener = new BaseCommandHandler$A(this);
       this.mGyroscopeSensorEventListener = new BaseCommandHandler$B(this);
       this.mContext = p0;
       this.mFrogKeyBoard = p1;
       this.mSendListener = p2;
       this.mFrogStorageManager = p3;
    }
    public static JSONObject buildResponse(int p0,String p1,JSONObject p2){
       JSONObject obj;
       if (PatchProxy.isSupport(BaseCommandHandler.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, BaseCommandHandler.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new JSONObject();
          obj.put("code", p0);
          if (!TextUtils.isEmpty(p1)) {
             obj.put("msg", p1);
          label_0033 :
             if (p2 != null) {
                obj.put("result", p2);
             }
          }else {
             goto label_0033 ;
          }
       }catch(java.lang.Exception e7){
          FrogLog.e("BaseCommandHandler", e7.getMessage());
       }
       return obj;
    }
    public void callFuncFail(int p0,String p1,FrogCommandResponseListener p2){
       if (PatchProxy.isSupport(BaseCommandHandler.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, BaseCommandHandler.class, "2")) {
          return;
       }
       if (p2 != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          uFrogJSObjec.put("code", p0);
          uFrogJSObjec.put("msg", p1);
          p2.onResponse(uFrogJSObjec);
       }
       return;
    }
    public void callFuncSuccess(FrogCommandResponseListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseCommandHandler.class, "3")) {
          return;
       }
       if (p0 != null) {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          uFrogJSObjec.put("code", 1);
          p0.onResponse(uFrogJSObjec);
       }
       return;
    }
    public boolean checkParamInvalid(FrogJSObject p0,FrogCommandResponseListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BaseCommandHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return false;
       }
       if (p1 != null) {
          p0 = new FrogJSObject();
          p0.put("code", -10001);
          p0.put("msg", "connect scoket param is null");
          p1.onResponse(p0);
       }
       return true;
    }
    public void clear(){
       this.mSendListener = null;
       this.mFrogStorageManager = null;
       this.mFrogKeyBoard = null;
    }
    public Map getBaseCommands(){
       return this.mBaseCommands;
    }
    public JSONObject getSystemInfo(int p0,int p1){
       JSONObject obj;
       boolean b;
       BaseCommandHandler uBaseCommand = BaseCommandHandler.class;
       if (PatchProxy.isSupport(uBaseCommand)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uBaseCommand, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new JSONObject();
          float displayMetri = ViewUtils.getDisplayMetrics(this.mContext);
          int i = 1;
          String str = "BaseCommandHandler";
          int i1 = 0;
          if (this.mInitParam.getLandScapeGame() != null) {
             FrogLog.d(str, "gameInfo landScape "+this.mInitParam.getLandScapeGame()+"--"+this.mContext.getResources().getConfiguration().orientation);
             b = this.mInitParam.getLandScapeGame().booleanValue();
             if (b && this.mContext.getResources().getConfiguration().orientation == i) {
             label_00b2 :
                FrogLog.d(str, "gameInfo landScape end--"+p1+"  "+p0);
                obj.put("pixelRatio", (double)displayMetri);
                int i2 = (int)((float)p1 / displayMetri);
                obj.put("windowWidth", i2);
                int i3 = (int)((float)p0 / displayMetri);
                obj.put("windowHeight", i3);
                obj.put("screenWidth", i2);
                obj.put("screenHeight", i3);
                obj.put("brand", Build.BRAND);
                try{
                   String str1 = "model";
                   obj.put(str1, Build.MODEL);
                   obj.put("statusBarHeight", (int)((float)ViewUtils.getStatusBarHeight(this.mContext) / displayMetri));
                   obj.put("language", Locale.getDefault().getLanguage()+"_"+Locale.getDefault().getCountry());
                   try{
                      str1 = "version";
                      obj.put(str1, ViewUtils.getAppVersionName(this.mContext));
                      obj.put("platform", "android");
                      obj.put("system", Build$VERSION.SDK_INT+"");
                      obj.put("SDKVersion", "0.5.19.9");
                      str1 = "deviceOrientation";
                      String str2 = (b)? "landscape": "portrait";
                      obj.put(str1, str2);
                      boolean b1 = l1.a(this.mContext);
                      int i4 = (int)((float)ViewUtils.getStatusBarHeight(this.mContext) / displayMetri);
                      if (b) {
                         if (p1 < FrogEngineInternal.getActivityDisplayWidth()) {
                         label_018f :
                            i = 0;
                         }
                      }else if(p0 >= FrogEngineInternal.getActivityDisplayHeight()){
                      }
                      p0 = (b && (b1 && i))? i4: 0;
                      if (!b && (b1 && i)) {
                         i1 = i4;
                      }
                   label_01a0 :
                      JSONObject jSONObject = new JSONObject();
                      jSONObject.put("width", (i2 - p0));
                      jSONObject.put("height", (i3 - i1));
                      jSONObject.put("left", p0);
                      jSONObject.put("right", i2);
                      jSONObject.put("top", i1);
                      jSONObject.put("bottom", i3);
                      obj.put("safeArea", jSONObject);
                      return e0;
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                }
             }
          }else {
             FrogLog.d(str, "activity Configuration "+this.mContext.getResources().getConfiguration().orientation);
             b = (this.mContext.getResources().getConfiguration().orientation == 2)? true: false;
          }
          p1 = p0;
          p0 = p1;
          goto label_00b2 ;
       }catch(java.lang.Exception e0){
       }
    }
    public void init(int p0,int p1,FrogInitParam p2){
       if (PatchProxy.isSupport(BaseCommandHandler.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BaseCommandHandler.class, "6")) {
          return;
       }
       this.mInitParam = p2;
       this.mWindowWidth = p0;
       this.mWindowHeight = p1;
       this.mBaseCommands.put("ks.getSystemInfo", new BaseCommandHandler$v(this));
       this.mBaseCommands.put("ks.getSystemInfoSync", new BaseCommandHandler$k(this));
       this.mBaseCommands.put("ks.getSystemInfoAsync", new BaseCommandHandler$C(this));
       this.mBaseCommands.put("ks.request", new BaseCommandHandler$D(this));
       this.mBaseCommands.put("ks.showKeyboard", new BaseCommandHandler$E(this));
       this.mBaseCommands.put("ks.hideKeyboard", new BaseCommandHandler$F(this));
       this.mBaseCommands.put("ks.updateKeyboard", new BaseCommandHandler$G(this));
       this.mBaseCommands.put("ks.setStorageSync", new BaseCommandHandler$H(this));
       this.mBaseCommands.put("ks.setStorage", new BaseCommandHandler$I(this));
       this.mBaseCommands.put("ks.removeStorageSync", new BaseCommandHandler$a(this));
       this.mBaseCommands.put("ks.removeStorage", new BaseCommandHandler$b(this));
       this.mBaseCommands.put("ks.getStorageSync", new BaseCommandHandler$c(this));
       this.mBaseCommands.put("ks.getStorage", new BaseCommandHandler$d(this));
       this.mBaseCommands.put("ks.getStorageInfoSync", new BaseCommandHandler$e(this));
       this.mBaseCommands.put("ks.getStorageInfo", new BaseCommandHandler$f(this));
       this.mBaseCommands.put("ks.clearStorageSync", new BaseCommandHandler$g(this));
       this.mBaseCommands.put("ks.clearStorage", new BaseCommandHandler$h(this));
       this.mBaseCommands.put("ks.getLaunchOptionsSync", new BaseCommandHandler$i(this));
       this.mBaseCommands.put("ks.abortRequest", new BaseCommandHandler$j(this));
       this.mBaseCommands.put("ks.downloadFile", new BaseCommandHandler$l(this));
       this.mBaseCommands.put("ks.uploadFile", new BaseCommandHandler$m(this));
       this.mBaseCommands.put("ks.connectSocket", new BaseCommandHandler$n(this));
       this.mBaseCommands.put("ks.sendSocketMessage", new BaseCommandHandler$o(this));
       this.mBaseCommands.put("ks.closeSocket", new BaseCommandHandler$p(this));
       this.mBaseCommands.put("ks.vibrateShort", new BaseCommandHandler$q(this));
       this.mBaseCommands.put("ks.vibrateLong", new BaseCommandHandler$r(this));
       this.mBaseCommands.put("ks.startAccelerometer", new BaseCommandHandler$s(this));
       this.mBaseCommands.put("ks.stopAccelerometer", new BaseCommandHandler$t(this));
       this.mBaseCommands.put("ks.startCompass", new BaseCommandHandler$u(this));
       this.mBaseCommands.put("ks.stopCompass", new BaseCommandHandler$w(this));
       this.mBaseCommands.put("ks.startGyroscope", new BaseCommandHandler$x(this));
       this.mBaseCommands.put("ks.stopGyroscope", new BaseCommandHandler$y(this));
       return;
    }
    public void setWindowHeight(int p0){
       this.mWindowHeight = p0;
    }
    public void setWindowWidth(int p0){
       this.mWindowWidth = p0;
    }
}
