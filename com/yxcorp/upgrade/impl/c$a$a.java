package com.yxcorp.upgrade.impl.c$a$a;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.upgrade.impl.c;
import android.os.Handler;
import android.media.MediaPlayer;
import android.widget.FrameLayout;

public class c$a$a implements Runnable	// class@000990
{
    public final c$a b;

    public void c$a$a(c$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a$a.class, "1")) {
          return;
       }
       c$a b = this.b.b;
       c n = b.n;
       if (n == null) {
          b.o.removeCallbacks(this);
          return;
       }else if(n.getCurrentPosition() > 0){
          this.b.b.l.setVisibility(4);
          this.b.b.o.removeCallbacks(this);
       }else {
          this.b.b.o.postDelayed(this, 20);
       }
       return;
    }
}
