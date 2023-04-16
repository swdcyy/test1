package com.kuaishou.live.core.show.screenrecord.videocapture.gl.d;
import java.lang.Object;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.d$a;

public class d	// class@000ff6
{
    public a$a a;
    public static final String b = "com.kuaishou.live.core.show.screenrecord.videocapture.gl.d";

    public void d(){
       int i;
       super();
       try{
          i = 0;
          a uoa = PatchProxy.apply(i, i, a.class, "2");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = a.a(i, a.b);
          }
          this.a = uoa.e();
       }catch(java.lang.Exception e1){
          b.y(LiveLogTag.LIVE_SCREEN_RECORD.appendTag(d.b), "EglBase.create\(\).getEglBaseContext\(\) failed", e1);
          this.a = i;
       }
       return;
    }
    public void d(d$a p0){
       int i;
       super();
       try{
          i = 0;
          a uoa = PatchProxy.apply(i, i, a.class, "2");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = a.a(i, a.b);
          }
          this.a = uoa.e();
       }catch(java.lang.Exception e0){
          b.y(LiveLogTag.LIVE_SCREEN_RECORD.appendTag(d.b), "EglBase.create\(\).getEglBaseContext\(\) failed", e0);
          this.a = i;
       }
       return;
    }
}
