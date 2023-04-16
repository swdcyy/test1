package com.facebook.rebound.ui.SpringConfiguratorView$b;
import dg.h;
import com.facebook.rebound.ui.SpringConfiguratorView;
import java.lang.Object;
import dg.e;
import android.widget.FrameLayout;

public class SpringConfiguratorView$b implements h	// class@001446
{
    public final SpringConfiguratorView a;

    public void SpringConfiguratorView$b(SpringConfiguratorView p0){
       this.a = p0;
       super();
    }
    public void a(e p0){
    }
    public void b(e p0){
       SpringConfiguratorView$b ta = this.a;
       SpringConfiguratorView f = ta.f;
       ta.setTranslationY((((float)p0.b() * (ta.e - f)) + f));
    }
    public void c(e p0){
    }
    public void d(e p0){
    }
}
