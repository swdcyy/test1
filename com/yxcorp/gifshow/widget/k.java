package com.yxcorp.gifshow.widget.k;
import android.view.View$OnClickListener;
import java.lang.Object;
import tyc.q0;
import android.view.View;
import tyc.c0;

public abstract class k implements View$OnClickListener	// class@001990
{
    public final q0 b;

    public void k(){
       super(false);
    }
    public void k(boolean p0){
       super();
       this.b = new q0(p0);
    }
    public abstract void a();
    public final void onClick(View p0){
       this.b.a(p0, new c0(this));
    }
}
