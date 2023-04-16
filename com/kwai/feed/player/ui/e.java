package com.kwai.feed.player.ui.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b56.w;
import java.lang.Runnable;

public abstract class e	// class@0014bd
{
    public View a;
    public Animator b;
    public Animator c;

    public void e(View p0){
       super();
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.a.post(new w(this));
       return;
    }
    public abstract void b();
}
