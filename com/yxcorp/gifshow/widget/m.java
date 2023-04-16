package com.yxcorp.gifshow.widget.m;
import android.view.View$OnClickListener;
import java.lang.Object;
import tyc.q0;
import android.view.View;
import tyc.p0;

public abstract class m implements View$OnClickListener	// class@001995
{
    public q0 b;

    public void m(){
       super(false);
    }
    public void m(boolean p0){
       super();
       this.b = new q0(p0);
    }
    public void m(boolean p0,long p1){
       super();
       this.b = new q0(p0, p1);
    }
    public abstract void a(View p0);
    public final void onClick(View p0){
       this.b.a(p0, new p0(this));
    }
}
