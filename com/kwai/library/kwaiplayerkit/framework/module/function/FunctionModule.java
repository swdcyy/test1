package com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule;
import tx6.d;
import java.lang.Object;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule$executorProvider$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule$dispatcherMap$2;
import wx6.c;
import vx6.c;
import vx6.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.String;
import kotlin.jvm.internal.a;
import tx6.d$a;
import java.util.List;
import tx6.c;
import java.util.Map;
import px6.b;

public abstract class FunctionModule implements d	// class@000874
{
    public b b;
    public final p c;
    public final p d;

    public void FunctionModule(){
       super();
       this.c = s.c(new FunctionModule$executorProvider$2(this));
       this.d = s.c(new FunctionModule$dispatcherMap$2(this));
    }
    public void a(){
    }
    public void c(c p0,boolean p1){
       b.a(this, p0, p1);
    }
    public void d(){
    }
    public void e(IWaynePlayer p0){
       a.p(p0, "player");
       d$a.a(this, p0);
    }
    public void f(IWaynePlayer p0){
       a.p(p0, "player");
       d$a.b(this, p0);
    }
    public void g(){
    }
    public void h(){
    }
    public void i(){
    }
    public List j(){
       return null;
    }
    public c k(){
       return null;
    }
    public final Map l(){
       return this.d.getValue();
    }
    public final c m(){
       return this.c.getValue();
    }
    public final b n(){
       return this.b;
    }
}
