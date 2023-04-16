package com.yxcorp.gifshow.hot.stagger.a;
import com.kwai.component.homepage_interface.homeitemfragment.a$a;
import java.lang.Object;
import ab5.y;
import java.lang.Throwable;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment;
import hn5.f;

public final class a implements a$a	// class@00189d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public void a(){
       y.b(this);
    }
    public void b(){
       y.c(this);
    }
    public void c(Throwable p0){
       y.a(this, p0);
    }
    public final void d(RefreshType p0){
       if (p0 == RefreshType.RESUME) {
          f.b();
       }
       return;
    }
}
