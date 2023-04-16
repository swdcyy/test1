package com.kuaishou.live.external.p$e;
import com.kwai.video.waynelive.debug.DebugLog$LogInterface;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public class p$e implements DebugLog$LogInterface	// class@001bb0
{

    public void p$e(){
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p$e.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.PLAYER, p0+": "+p1);
       return;
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p$e.class, "5")) {
          return;
       }
       b.B(LiveLogTag.PLAYER, p0+": "+p1);
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p$e.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.PLAYER, p0+": "+p1);
       return;
    }
    public void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p$e.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.PLAYER, p0+": "+p1);
       return;
    }
    public void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p$e.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.PLAYER, p0+": "+p1);
       return;
    }
}
