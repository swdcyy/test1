package com.kwai.live.gzone.guess.kshell.q$c;
import c77.a$a;
import com.kwai.live.gzone.guess.kshell.q;
import java.lang.String;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.c;
import n57.b;
import brd.y;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public class q$c extends a$a	// class@000d5e
{
    public final q b;

    public void q$c(q p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(LiveGzoneTabSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$c.class, "1")) {
          return;
       }
       q k = this.b.K;
       if (k != null) {
          k.e().onNext(new Object());
       }
       if (QCurrentUser.me().isLogined()) {
          this.b.s.setVisibility(0);
          k = this.b.K;
          if (k != null) {
             k.k();
          }
       }
       this.b.Y8();
       return;
    }
}
