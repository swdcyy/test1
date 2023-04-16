package com.yxcorp.upgrade.impl.c$b;
import android.media.MediaPlayer$OnErrorListener;
import com.yxcorp.upgrade.impl.c;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import akd.n;
import java.lang.Runnable;
import android.app.Activity;

public class c$b implements MediaPlayer$OnErrorListener	// class@000992
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public boolean onError(MediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(c$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       this.b.f();
       this.b.t.runOnUiThread(new n(this));
       return true;
    }
}
