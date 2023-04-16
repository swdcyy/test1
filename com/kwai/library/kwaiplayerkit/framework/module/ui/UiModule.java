package com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import tx6.d;
import java.lang.Object;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule$uiModuleExecutorPair$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import ux6.d;
import ux6.a;
import wx6.c;
import vx6.c;
import vx6.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.String;
import kotlin.jvm.internal.a;
import tx6.d$a;
import yx6.e;
import ux6.b;
import kotlin.Pair;
import android.view.ViewGroup;

public abstract class UiModule implements d	// class@000876
{
    public b b;
    public final p c;
    public View d;
    public d e;
    public a f;

    public void UiModule(){
       super();
       this.c = s.c(new UiModule$uiModuleExecutorPair$2(this));
    }
    public void a(){
    }
    public abstract a b(View p0,d p1);
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
    public final a j(){
       UiModule td;
       if (this.f == null) {
          td = this.d;
          a.m(td);
          UiModule te = this.e;
          a.m(te);
          this.f = this.b(td, te);
       }
       td = this.f;
       a.m(td);
       return td;
    }
    public final View k(){
       return this.d;
    }
    public final d l(){
       return this.e;
    }
    public e m(){
       return null;
    }
    public final b n(){
       return this.b;
    }
    public final Pair o(){
       return this.c.getValue();
    }
    public Pair p(){
       return null;
    }
    public abstract View q(ViewGroup p0);
    public abstract d r(b p0);
}
