package com.kuaishou.live.core.show.floatingwindow.e$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kuaishou.live.core.show.floatingwindow.e;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;

public class e$b implements ActivityContext$b	// class@000b7c
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       this.b.N = true;
    }
    public void onForeground(){
       this.b.N = false;
    }
}
