package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$c;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import mv1.b;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$d;
import mv1.a;
import p91.m;

public class a$c	// class@0016f0
{
    public LiveMiniWidgetContainerView a;
    public int b;
    public int c;
    public boolean d;
    public a$d e;
    public a f;
    public m g;
    public boolean h;
    public Context i;

    public void a$c(Context p0){
       super();
       this.i = p0;
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a = new LiveMiniWidgetContainerView(this.i, this.b, this.c);
       }
       this.a.setEnableIndicator(this.d);
       if (this.f == null) {
          this.f = new b();
       }
       a uoa = new a(this.i, this.a, this.e, this.f, this.g, this.h);
       return obj;
    }
    public a$c b(LiveMiniWidgetContainerView p0){
       this.a = p0;
       return this;
    }
    public a$c c(boolean p0){
       this.d = p0;
       return this;
    }
    public a$c d(boolean p0){
       this.h = p0;
       return this;
    }
    public a$c e(m p0){
       this.g = p0;
       return this;
    }
    public a$c f(a$d p0){
       this.e = p0;
       return this;
    }
    public a$c g(a p0){
       this.f = p0;
       return this;
    }
}
