package com.yxcorp.gifshow.activity.share.presenter.m1;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.n1;
import java.lang.Object;
import xw8.p0;
import zw8.s2;
import com.kwai.library.widget.scrollview.ScrollViewEx$b;
import com.kwai.library.widget.scrollview.ScrollViewEx;

public final class m1 implements g	// class@001402
{
    public final n1 b;
    public final int c;

    public void m1(n1 p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 = this.b;
       m1 tc = this.c;
       if (p0.Z.i()) {
          p0.Z0.setInterceptTouchListener(new s2(p0, tc));
       }
       return;
    }
}
