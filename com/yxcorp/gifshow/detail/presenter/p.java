package com.yxcorp.gifshow.detail.presenter.p;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.presenter.q;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class p implements x	// class@0016f7
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("loadCoverAfterStartPlay", false));
    }
}
