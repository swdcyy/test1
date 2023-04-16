package com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$a;
import rc3.c;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mc3.c;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;

public final class LiveLitePlayerViewController$a implements c	// class@000a61
{
    public final LiveLitePlayerViewController a;

    public void LiveLitePlayerViewController$a(LiveLitePlayerViewController p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLitePlayerViewController obj = PatchProxy.apply(objArray, this, LiveLitePlayerViewController$a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.n;
       boolean b = true;
       if (obj != null) {
          Object obj1 = PatchProxy.apply(objArray, obj, c.class, "16");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             b.Z(LiveLiteLogTag.PLAYER, obj.a+" hasPrePlayStarted "+obj.k);
             b1 = obj.k;
          }
          if (b1 == b) {
          label_004f :
             return b;
          }
       }
       b = false;
       goto label_004f ;
    }
    public Long b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLitePlayerViewController obj = PatchProxy.apply(objArray, this, LiveLitePlayerViewController$a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.n;
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, c.class, "15");
          if (objArray != patchProxyRe) {
          }else {
             b.Z(LiveLiteLogTag.PLAYER, obj.a+" getPrePlayStopTime "+obj.j);
             objArray = obj.j;
          }
       }
       return objArray;
    }
    public Long c(){
       Object[] objArray = null;
       LiveLitePlayerViewController obj = PatchProxy.apply(objArray, this, LiveLitePlayerViewController$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.n;
       if (obj != null) {
          objArray = Long.valueOf(obj.c);
       }
       return objArray;
    }
    public Long d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLitePlayerViewController obj = PatchProxy.apply(objArray, this, LiveLitePlayerViewController$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.n;
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, c.class, "14");
          if (objArray != patchProxyRe) {
          }else {
             b.Z(LiveLiteLogTag.PLAYER, obj.a+" getPrePlayStartTime "+obj.i);
             objArray = obj.i;
          }
       }
       return objArray;
    }
}
