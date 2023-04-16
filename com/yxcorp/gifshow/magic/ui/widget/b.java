package com.yxcorp.gifshow.magic.ui.widget.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.widget.PostGroupWithIndicatorExt;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import p5b.f;
import com.kwai.library.widget.popup.common.f;

public final class b implements Runnable	// class@001c56
{
    public final PostGroupWithIndicatorExt b;
    public final View c;
    public final View d;
    public final float e;

    public void b(PostGroupWithIndicatorExt p0,View p1,View p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       f.G(tc, new f(tb, this.d, tc, this.e));
    }
}
