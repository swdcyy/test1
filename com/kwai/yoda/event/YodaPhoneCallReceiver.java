package com.kwai.yoda.event.YodaPhoneCallReceiver;
import android.content.BroadcastReceiver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yz7.r;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kwai.yoda.event.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

public class YodaPhoneCallReceiver extends BroadcastReceiver	// class@0011c3
{
    public static boolean a;

    public void YodaPhoneCallReceiver(){
       super();
    }
    public void a(String p0){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaPhoneCallReceiver.class, "4")) {
          return;
       }
       r.b(this.getClass().getSimpleName(), "dispatchPhoneEvent type="+p0);
       try{
          jSONObject = new JSONObject();
          jSONObject.put("type", "phone");
       }catch(org.json.JSONException e1){
          r.e(this.getClass().getSimpleName(), e1);
       }
       d.f().c(null, p0, jSONObject.toString());
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, YodaPhoneCallReceiver.class, "2")) {
          return;
       }
       if (!YodaPhoneCallReceiver.a) {
          YodaPhoneCallReceiver.a = true;
          this.a("audio-pause");
       }
       return;
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaPhoneCallReceiver.class, "1")) {
          return;
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return;
       }
       int callState = systemServic.getCallState();
       if (callState) {
          if (callState != 1) {
             if (callState == 2) {
                r.b(this.getClass().getSimpleName(), "CALL_STATE_OFF_HOOK");
                this.b();
             }
          }else {
             r.b(this.getClass().getSimpleName(), "CALL_STATE_RINGING");
             this.b();
          }
       }else {
          r.b(this.getClass().getSimpleName(), "CALL_STATE_IDLE");
          if (!PatchProxy.applyVoid(null, this, YodaPhoneCallReceiver.class, "3")) {
             YodaPhoneCallReceiver.a = false;
             this.a("audio-resume");
          }
       }
       return;
    }
}
