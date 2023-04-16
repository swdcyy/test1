package com.kuaishou.commercial.splash.h;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.commercial.splash.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import o56.d;
import wkd.b;
import com.yxcorp.gifshow.w;
import fg6.a;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.yxcorp.gifshow.log.h;

public final class h implements Runnable	// class@0015af
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       ClientEvent$ElementPackage uElementPack;
       String str;
       String str2;
       try{
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_BUSINESS_LAUNCH_AD";
          str = PatchProxy.apply(null, null, i.class, "18");
          if (str != PatchProxyResult.class) {
          }else {
             HashMap hashMap = new HashMap();
             String str1 = "launch_type";
             if (d.b) {
                str2 = "cold";
             }else if(b.a(-1343064608).a()){
                str2 = "warm";
             }else {
                str2 = "hot";
             }
             hashMap.put(str1, str2);
             w ow = b.a(-1343064608);
             if (ow != null) {
                hashMap.put("launch_source", String.valueOf(ow.getLaunchSource()));
             }
             str = a.a.q(hashMap);
          }
       }catch(java.lang.Exception e0){
          str = "";
       }
       if (!TextUtils.isEmpty(str)) {
          uElementPack.params = str;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = uElementPack;
          b.a(0x4b316083).i0(showEvent, false);
       }
       return;
    }
}
