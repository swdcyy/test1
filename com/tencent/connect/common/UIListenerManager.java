package com.tencent.connect.common.UIListenerManager;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import com.tencent.tauth.IUiListener;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.connect.common.UIListenerManager$ApiTask;
import com.tencent.open.utils.i;
import java.lang.StringBuilder;
import android.content.Intent;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import com.tencent.tauth.UiError;
import java.lang.Throwable;
import org.json.JSONException;

public class UIListenerManager	// class@000e49
{
    public Map b;
    public static UIListenerManager a;

    public void UIListenerManager(){
       super();
       Map map = Collections.synchronizedMap(new HashMap());
       this.b = map;
       if (map == null) {
          this.b = Collections.synchronizedMap(new HashMap());
       }
       return;
    }
    public static UIListenerManager getInstance(){
       if (UIListenerManager.a == null) {
          UIListenerManager.a = new UIListenerManager();
       }
       return UIListenerManager.a;
    }
    public final IUiListener a(int p0,IUiListener p1){
       if (p0 == 0x2b5d) {
          SLog.e("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
       }else if(p0 == 0x2b61){
          SLog.e("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
       }else if(p0 == 0x2b62){
          SLog.e("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
       }
       return p1;
    }
    public IUiListener getListnerWithAction(String p0){
       if (p0 == null) {
          SLog.e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
          return null;
       }else {
          UIListenerManager tb = this.b;
          _monitor_enter(tb);
          UIListenerManager$ApiTask uApiTask = this.b.get(p0);
          this.b.remove(p0);
          _monitor_exit(tb);
          if (uApiTask == null) {
             return null;
          }
          return uApiTask.mListener;
       }
    }
    public IUiListener getListnerWithRequestCode(int p0){
       String str = i.a(p0);
       if (str != null) {
          return this.getListnerWithAction(str);
       }
       SLog.e("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode="+p0);
       return null;
    }
    public void handleDataToListener(Intent p0,IUiListener p1){
       String stringExtra1;
       String str = "openSDK_LOG.UIListenerManager";
       SLog.i(str, "handleDataToListener");
       if (p0 == null) {
          p1.onCancel();
          return;
       }else {
          String stringExtra = p0.getStringExtra("key_action");
          if (("action_login").equals(stringExtra)) {
             int intExtra = p0.getIntExtra("key_error_code", 0);
             if (!intExtra) {
                stringExtra1 = p0.getStringExtra("key_response");
                if (stringExtra1 != null) {
                   try{
                      p1.onComplete(k.d(stringExtra1));
                   }catch(org.json.JSONException e1){
                      p1.onError(new UiError(-4, "服务器返回数据格式有误!", stringExtra1));
                      SLog.e(str, "OpenUi, onActivityResult, json error", e1);
                   }
                }else {
                   SLog.d(str, "OpenUi, onActivityResult, onComplete");
                   p1.onComplete(new JSONObject());
                }
             }else {
                SLog.e(str, "OpenUi, onActivityResult, onError = "+intExtra+"");
                p1.onError(new UiError(intExtra, p0.getStringExtra("key_error_msg"), p0.getStringExtra("key_error_detail")));
             }
          }else if(("action_share").equals(stringExtra)){
             str = p0.getStringExtra("result");
             stringExtra1 = p0.getStringExtra("response");
             if (("cancel").equals(str)) {
                p1.onCancel();
             }else if(("error").equals(str)){
                p1.onError(new UiError(-6, "unknown error", stringExtra1+""));
             }else if(("complete").equals(str)){
                stringExtra = (stringExtra1 == null)? "{\"ret\": 0}": stringExtra1;
                p1.onComplete(new JSONObject(stringExtra));
             }
          }
       }
    }
    public boolean onActivityResult(int p0,int p1,Intent p2,IUiListener p3){
       String stringExtra1;
       String str = "openSDK_LOG.UIListenerManager";
       SLog.i(str, "onActivityResult req="+p0+" res="+p1);
       IUiListener listnerWithR = this.getListnerWithRequestCode(p0);
       int i = 0;
       if (listnerWithR == null) {
          if (p3 != null) {
             listnerWithR = this.a(p0, p3);
          }else {
             SLog.e(str, "onActivityResult can\'t find the listener");
             return i;
          }
       }
       if (p1 == -1) {
          p0 = -6;
          if (p2 == null) {
             listnerWithR.onError(new UiError(p0, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
             return true;
          }else {
             String stringExtra = p2.getStringExtra("key_action");
             if (("action_login").equals(stringExtra)) {
                p0 = p2.getIntExtra("key_error_code", i);
                if (!p0) {
                   stringExtra1 = p2.getStringExtra("key_response");
                   if (stringExtra1 != null) {
                      try{
                         listnerWithR.onComplete(k.d(stringExtra1));
                      }catch(org.json.JSONException e13){
                         listnerWithR.onError(new UiError(-4, "服务器返回数据格式有误!", stringExtra1));
                         SLog.e(str, "OpenUi, onActivityResult, json error", e13);
                      }
                   }else {
                      SLog.d(str, "OpenUi, onActivityResult, onComplete");
                      listnerWithR.onComplete(new JSONObject());
                   }
                }else {
                   SLog.e(str, "OpenUi, onActivityResult, onError = "+p0+"");
                   listnerWithR.onError(new UiError(p0, p2.getStringExtra("key_error_msg"), p2.getStringExtra("key_error_detail")));
                }
             }else if(!("action_share").equals(stringExtra) && (!("action_request_avatar").equals(stringExtra) && (!("action_request_dynamic_avatar").equals(stringExtra) && (("action_request_set_emotion").equals(stringExtra) || ("guildOpen").equals(stringExtra))))){
                stringExtra = p2.getStringExtra("result");
                String stringExtra2 = p2.getStringExtra("response");
                if (("cancel").equals(stringExtra)) {
                   listnerWithR.onCancel();
                }else if(("error").equals(stringExtra)){
                   listnerWithR.onError(new UiError(p0, "unknown error", stringExtra2+""));
                }else if(("complete").equals(stringExtra)){
                   stringExtra = (stringExtra2 == null)? "{\"ret\": 0}": stringExtra2;
                   listnerWithR.onComplete(new JSONObject(stringExtra));
                }
             }else {
                p0 = p2.getIntExtra("key_error_code", i);
                if (!p0) {
                   stringExtra1 = p2.getStringExtra("key_response");
                   if (stringExtra1 != null) {
                      try{
                         listnerWithR.onComplete(k.d(stringExtra1));
                      }catch(org.json.JSONException e0){
                         e0.onError(new UiError(-4, "服务器返回数据格式有误!", stringExtra1));
                      }
                   }else {
                      listnerWithR.onComplete(new JSONObject());
                   }
                }else {
                   listnerWithR.onError(new UiError(p0, p2.getStringExtra("key_error_msg"), p2.getStringExtra("key_error_detail")));
                }
             }
          }
       }else {
          listnerWithR.onCancel();
       }
    }
    public Object setListenerWithRequestcode(int p0,IUiListener p1){
       String str = i.a(p0);
       if (str == null) {
          SLog.e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode="+p0);
          return null;
       }else {
          UIListenerManager tb = this.b;
          _monitor_enter(tb);
          UIListenerManager$ApiTask uApiTask = this.b.put(str, new UIListenerManager$ApiTask(this, p0, p1));
          _monitor_exit(tb);
          if (uApiTask == null) {
             return null;
          }
          return uApiTask.mListener;
       }
    }
    public Object setListnerWithAction(String p0,IUiListener p1){
       int i = i.a(p0);
       if (i == -1) {
          SLog.e("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = "+p0);
          return null;
       }else {
          UIListenerManager tb = this.b;
          _monitor_enter(tb);
          UIListenerManager$ApiTask uApiTask = this.b.put(p0, new UIListenerManager$ApiTask(this, i, p1));
          _monitor_exit(tb);
          if (uApiTask == null) {
             return null;
          }
          return uApiTask.mListener;
       }
    }
}
