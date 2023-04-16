package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.c;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d$c;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.b;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d;

public final class c implements Runnable	// class@000e0b
{
    public final View b;
    public final View c;
    public final int d;
    public final View e;
    public final d$c f;

    public void c(View p0,View p1,int p2,View p3,d$c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       c tb = this.b;
       b uob = new b(this.c, tb, this.d, this.e, this.f);
       d.b(false, tb, v7);
    }
}
