package com.yxcorp.gifshow.push.ClickPushButtonBroadcastReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.String;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q6c.b;
import java.util.LinkedList;
import com.kwai.android.register.core.click.ClickChain;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.bean.PushData;
import i6c.h;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.content.pm.PackageManager;
import java.util.List;
import s7.b;
import ukd.a;
import java.lang.Exception;

public class ClickPushButtonBroadcastReceiver extends BroadcastReceiver	// class@001611
{

    public void ClickPushButtonBroadcastReceiver(){
       super();
    }
    public final Intent a(Context p0,KwaiPushMsgData p1,String p2){
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClickPushButtonBroadcastReceiver.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       LinkedList linkedList = new LinkedList();
       linkedList.add(obj);
       ClickChain uClickChain = new ClickChain(p0, p1, Channel.valueOf(p2.toUpperCase()), true, linkedList);
       obj.a(v7);
       if (v7.getIntentArray() != null && v7.getIntentArray().length > 0) {
          return v7.getIntentArray()[0];
       }
       return null;
    }
    public void onReceive(Context p0,Intent p1){
       Object[] objArray;
       h oh = h.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClickPushButtonBroadcastReceiver.class, str)) {
          return;
       }
       try{
          int intExtra = p1.getIntExtra("pending_intent_type", -1);
          int intExtra1 = p1.getIntExtra("msgId", -1);
          String stringExtra = p1.getStringExtra("push_channel_name");
          KwaiPushMsgData serializable = SerializableHook.getSerializableExtra(p1, "pushData");
          if (intExtra != 1) {
             if (intExtra != 2) {
                if (intExtra == 3 && !PatchProxy.applyVoidOneRefs(serializable, null, oh, "3")) {
                   u1.A(h.b(), "", 1, h.a("DELETE_NOTIFICATION", serializable), new ClientContent$ContentPackage());
                }
             }else if(PatchProxy.applyVoidOneRefs(serializable, null, oh, "2")){
                u1.A(h.b(), "", 1, h.a("CLICK_CLOSE_BUTTON", serializable), new ClientContent$ContentPackage());
             }
          }else {
             Intent intent = this.a(p0, serializable, stringExtra);
             try{
                if (p0.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
                   p0.startActivity(intent);
                   if (!PatchProxy.applyVoidOneRefs(serializable, null, oh, str)) {
                      u1.A(h.b(), "", 1, h.a("CLICK_PLAY_BUTTON", serializable), new ClientContent$ContentPackage());
                   }
                }
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e12){
          e12.printStackTrace();
       }
    }
}
