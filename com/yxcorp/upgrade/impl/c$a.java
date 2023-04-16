package com.yxcorp.upgrade.impl.c$a;
import android.media.MediaPlayer$OnPreparedListener;
import com.yxcorp.upgrade.impl.c;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import com.yxcorp.upgrade.impl.c$a$a;
import java.lang.Runnable;
import android.os.Handler;

public class c$a implements MediaPlayer$OnPreparedListener	// class@000991
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onPrepared(MediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.b.l.setVisibility(0);
       c n = this.b.n;
       if (n == null) {
          return;
       }
       n.start();
       this.b.o.postDelayed(new c$a$a(this), 20);
       return;
    }
}
