package com.yxcorp.gifshow.ad.detail.presenter.log.a$a;
import y09.e;
import com.yxcorp.gifshow.ad.detail.presenter.log.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public class a$a implements e	// class@00165c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public long a(){
       a obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a.s;
       if (obj == null || obj.getPlayer() == null) {
          return 0;
       }
       a$a ta = this.a;
       if (ta.w != null) {
          return ta.s.getPlayer().getDuration();
       }
       return ta.s.getPlayer().getCurrentPosition();
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = this.a();
       a s = this.a.s;
       long duration = (s != null && s.getPlayer() != null)? this.a.s.getPlayer().getDuration(): 0;
       int i = -1;
       if (duration) {
          i = (int)(((float)l / (float)duration) * 100.00f);
       }
       return i;
    }
    public int c(){
       return this.a.v;
    }
}
