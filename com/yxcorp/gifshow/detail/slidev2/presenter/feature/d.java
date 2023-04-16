package com.yxcorp.gifshow.detail.slidev2.presenter.feature.d;
import java.util.concurrent.Callable;
import java.lang.Object;
import dm6.f;
import lv6.a$b;
import java.lang.String;
import lv6.a;

public final class d implements Callable	// class@00193e
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object call(){
       a$b uob = new a$b();
       uob.e("feature_preload");
       uob.c("slide_dynamic_prefetch");
       uob.d(":ks-features:ft-feed:detail");
       return new f(uob.a());
    }
}
