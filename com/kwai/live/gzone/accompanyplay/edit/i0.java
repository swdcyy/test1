package com.kwai.live.gzone.accompanyplay.edit.i0;
import java.lang.Runnable;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View$OnKeyListener;
import n37.m1;
import android.view.View$OnTouchListener;

public final class i0 implements Runnable	// class@000bf8
{
    public final j0 b;

    public void i0(j0 p0){
       this.b = p0;
    }
    public final void run(){
       i0 tb = this.b;
       if (tb.q.getParent() == null) {
       }else {
          tb.d9(tb.q.getParent(), tb.O);
          tb.q.getParent().setOnTouchListener(new m1(tb));
       }
       return;
    }
}
