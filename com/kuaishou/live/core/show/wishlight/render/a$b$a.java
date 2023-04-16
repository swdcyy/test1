package com.kuaishou.live.core.show.wishlight.render.a$b$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlight.render.a$b;
import pz2.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xy2.a;
import com.kuaishou.live.core.show.wishlight.render.a;
import java.lang.StringBuilder;
import pz2.a;
import java.lang.Long;
import com.kuaishou.live.core.show.wishlight.render.a$a;
import fg6.a;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectMessage;
import com.google.gson.Gson;
import java.lang.Throwable;
import android.util.Log;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectMessage$Data;
import zf1.f;
import zf1.d;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class a$b$a implements Runnable	// class@0012b2
{
    public final a$b b;
    public final c c;
    public final String d;

    public void a$b$a(a$b p0,c p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       LiveWishLightEffectMessage liveWishLigh;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b$a.class, "1")) {
          return;
       }
       String str = ",json:";
       if (this.c instanceof a) {
          a$a l = a.l;
          StringBuilder str1 = "[onReceivedEffectEvent]rendingTaskMagicFaceId:";
          a e = this.b.a.e;
          Long longx = (e != null)? Long.valueOf(e.b()): objArray;
          str = str1+longx+str+this.d;
          try{
             l.b(str);
             liveWishLigh = a.a.h(this.d, LiveWishLightEffectMessage.class);
          }catch(java.lang.Exception e0){
             a.l.a("[onReceivedEffectEvent]:"+Log.getStackTraceString(e0));
             liveWishLigh = objArray;
          }
          LiveWishLightEffectMessage$Data uData = (liveWishLigh != null)? liveWishLigh.c(): objArray;
          if (uData == null) {
             return;
          }else {
             a f = this.b.a.f;
             if (f != null) {
                f.onReceivedEffectEvent(this.c, liveWishLigh);
             }
             f = this.b.a.e;
             if (f != null) {
                objArray = Long.valueOf(f.b());
             }
             if (a.g(String.valueOf(objArray), liveWishLigh.c().magicFaceId) ^ 1) {
                return;
             }else if(a.g(liveWishLigh.a(), "liveGift") ^ 1){
                return;
             }else {
                Integer integer = liveWishLigh.b();
                if (integer != null && integer.intValue() == 1) {
                   this.b.a.a();
                }
             }
          }
       }else {
          a.l.a("[onReceivedEffectEvent]unknown task "+this.c+str+this.d);
       }
       return;
    }
}
