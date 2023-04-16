package com.yxcorp.gifshow.webview.yoda.utils.h;
import ub7.f;
import java.lang.Object;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import java.lang.Integer;

public final class h implements f	// class@0017d0
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final Object get(){
       return Integer.valueOf(NetworkQualityEstimator.b());
    }
}
