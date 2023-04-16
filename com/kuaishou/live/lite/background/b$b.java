package com.kuaishou.live.lite.background.b$b;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kuaishou.live.lite.background.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class b$b implements LivePlayerBufferListener	// class@001e7d
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onBufferEnd(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       this.b.m.setVisibility(8);
       return;
    }
    public void onBufferStart(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.b.V2();
       this.b.m.setVisibility(0);
       return;
    }
}
