package com.kuaishou.live.lite.background.b$c;
import sj3.b;
import com.kuaishou.live.lite.background.b;
import java.lang.Object;
import sj3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Throwable;

public class b$c implements b	// class@001e7e
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void c(){
       a.a(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       this.b.m.setVisibility(0);
       return;
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       a.b(this, p0, p1);
    }
    public void onError(Throwable p0){
       a.c(this, p0);
    }
}
