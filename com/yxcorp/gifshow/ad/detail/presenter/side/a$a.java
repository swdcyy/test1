package com.yxcorp.gifshow.ad.detail.presenter.side.a$a;
import bf5.p;
import com.yxcorp.gifshow.ad.detail.presenter.side.a;
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

public class a$a implements p	// class@0016a3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.r.getPlayer().b();
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.r.c();
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.v.getActualPlayDuration();
    }
    public long getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.r.getPlayer().getCurrentPosition();
    }
    public long getDuration(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.r.getPlayer().getDuration();
    }
    public boolean isPrepared(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.r.getPlayer().isPrepared();
    }
}
