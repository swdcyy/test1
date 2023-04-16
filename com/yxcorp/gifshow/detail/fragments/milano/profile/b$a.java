package com.yxcorp.gifshow.detail.fragments.milano.profile.b$a;
import bf5.p;
import com.yxcorp.gifshow.detail.fragments.milano.profile.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Boolean;

public class b$a implements p	// class@001543
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public int b(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       b w = obj.w;
       if (w == null) {
          return obj.q.getPlayer().b();
       }
       return w;
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q.c();
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.u.getActualPlayDuration();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.q.getPlayer().getCurrentPosition();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.q.getPlayer().getDuration();
    }
    public boolean isPrepared(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.q.getPlayer().isPrepared();
    }
}
