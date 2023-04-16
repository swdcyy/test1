package com.kwai.live.gzone.guess.kshell.e0$b;
import c77.a$a;
import com.kwai.live.gzone.guess.kshell.e0;
import java.lang.String;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.c;
import n57.b;
import brd.y;
import com.kwai.framework.model.user.QCurrentUser;

public class e0$b extends a$a	// class@000d31
{
    public final e0 b;

    public void e0$b(e0 p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(LiveGzoneTabSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$b.class, "1")) {
          return;
       }
       e0 t = this.b.t;
       if (t != null) {
          t.e().onNext(new Object());
       }
       if (QCurrentUser.me().isLogined()) {
          this.b.P8();
       }
       return;
    }
}
