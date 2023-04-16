package com.yxcorp.gifshow.util.span.a;
import android.text.style.ClickableSpan;
import tyc.q0;
import android.view.View;
import goc.c;
import android.view.View$OnClickListener;

public abstract class a extends ClickableSpan	// class@000d06
{
    public q0 b;

    public void a(){
       super(false);
    }
    public void a(boolean p0){
       super();
       this.b = new q0(p0);
    }
    public abstract void a(View p0);
    public final void onClick(View p0){
       this.b.a(p0, new c(this));
    }
}
