package com.hpplay.sdk.source.permission.c$d$1;
import com.hpplay.sdk.source.permission.c$a;
import com.hpplay.sdk.source.permission.c$d;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import java.lang.Object;

public class c$d$1 implements c$a	// class@000680
{
    public final SharedElementCallback$OnSharedElementsReadyListener a;
    public final c$d b;

    public void c$d$1(c$d p0,SharedElementCallback$OnSharedElementsReadyListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onSharedElementsReady(){
       this.a.onSharedElementsReady();
    }
}
