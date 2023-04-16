package com.yxcorp.gifshow.message.notification.outapp.a;
import java.lang.Object;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.String;
import com.kwai.android.common.bean.Channel;
import android.app.PendingIntent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.message.notification.outapp.IMClickPushButtonBroadcastReceiver;
import android.content.Context;
import ukd.a;
import s7.b;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.StringBuilder;
import dc5.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import xh7.b;
import nfb.a;
import qh7.b;
import qh7.a;
import java.lang.Enum;

public class a	// class@001d81
{
    public static int a;

    public void a(){
       super();
    }
    public static PendingIntent a(int p0,KwaiPushMsgData p1,String p2,Channel p3){
       Intent obj;
       int a;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, null, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Intent(a.b(), IMClickPushButtonBroadcastReceiver.class);
       a.c(obj, p0, p1, p2, p3);
       a = a.a;
       a.a = a + 1;
       return PendingIntent.getBroadcast(a.b(), a, obj, 0x8000000);
    }
    public static void b(Context p0,Intent p1){
       a uoa = a.class;
       String obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uoa, "1")) {
          return;
       }
       if (p0 != null && p1 != null) {
          int i = 0;
          if (!PatchProxy.applyVoidOneRefs(p0, obj, uoa, "2")) {
             Object systemServic = p0.getSystemService("statusbar");
             if (systemServic != null) {
                Object[] objArray = new Object[i];
                a.a(systemServic, "collapsePanels", objArray);
             }
          }
          int intExtra = p1.getIntExtra("notification_id", i);
          if (intExtra) {
             b.b(intExtra);
          }
          if (SerializableHook.getSerializableExtra(p1, "push_data") instanceof KwaiPushMsgData) {
          }
          obj = p1.getStringExtra("uri");
          p1.getStringExtra("push_channel_name");
          c.g("IMClickPush", "onReceive notificationId="+intExtra+", uri="+obj);
          if (!TextUtils.isEmpty(obj)) {
             a.b(b.j(p0, obj), new a(obj));
          }
       }
    label_007d :
       return;
    }
    public static void c(Intent p0,int p1,KwaiPushMsgData p2,String p3,Channel p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "5")) {
             return;
          }
       }
       p0.putExtra("notification_id", p1);
       SerializableHook.putExtra(p0, "push_data", p2);
       p0.putExtra("uri", p3);
       p0.putExtra("push_channel_name", (p4.name()).toLowerCase());
       return;
    }
}
