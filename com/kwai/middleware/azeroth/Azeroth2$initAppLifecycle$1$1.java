package com.kwai.middleware.azeroth.Azeroth2$initAppLifecycle$1$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.String;
import kotlin.jvm.internal.a;
import rb7.c;
import l97.b;
import rb7.a;
import com.kwai.middleware.azeroth.Azeroth2;

public final class Azeroth2$initAppLifecycle$1$1 implements DefaultLifecycleObserver	// class@000ef1
{

    public void Azeroth2$initAppLifecycle$1$1(){
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.q(p0, "owner");
       c.c.e(new b("ON_CREATE"));
       Azeroth2.B.z("ON_CREATE");
    }
    public void onDestroy(LifecycleOwner p0){
       a.q(p0, "owner");
       c.c.e(new b("ON_DESTROY"));
       Azeroth2.B.z("ON_DESTROY");
    }
    public void onPause(LifecycleOwner p0){
       a.q(p0, "owner");
       c.c.e(new b("ON_PAUSE"));
       Azeroth2.B.z("ON_PAUSE");
    }
    public void onResume(LifecycleOwner p0){
       a.q(p0, "owner");
       c.c.e(new b("ON_RESUME"));
       Azeroth2.B.z("ON_RESUME");
    }
    public void onStart(LifecycleOwner p0){
       a.q(p0, "owner");
       Azeroth2 b = Azeroth2.B;
       Azeroth2.a(b, true);
       c.c.e(new b("ON_START"));
       b.z("ON_START");
    }
    public void onStop(LifecycleOwner p0){
       a.q(p0, "owner");
       Azeroth2 b = Azeroth2.B;
       Azeroth2.a(b, false);
       c.c.e(new b("ON_STOP"));
       b.z("ON_STOP");
    }
}
