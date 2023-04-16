package com.yxcorp.gifshow.camera.record.sidebar.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.b;
import zg9.q;
import java.lang.Class;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.b;

public final class i implements Runnable	// class@000f19
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       tb.d.l(b.class, new q(tb));
    }
}
