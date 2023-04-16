package com.yxcorp.gifshow.mockphoto.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.lang.Object;
import tkd.b;
import tkd.d;
import lv5.d;
import o26.d;
import com.google.common.collect.ImmutableList;
import dlb.c;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import iq.a;
import com.yxcorp.gifshow.mockphoto.j;
import java.lang.String;
import java.lang.Class;
import q87.c;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.d;

public final class i implements Runnable	// class@001de7
{
    public final QPhoto b;
    public final Boolean c;

    public void i(QPhoto p0,Boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       boolean b = false;
       tb.setIsPending(b);
       if (this.c.booleanValue()) {
          if (y.y(d.a(-447917650).XV().Id(), new c(tb)).orNull() != null) {
             Object[] objArray = new Object[b];
             a.D().w(j.class.getName(), "poolingUploadStatus publish failed,show toast", objArray);
             i.a(R.style.arg_RES_7f110668, 0x7f104fa2);
          }
          RxBus.f.b(new d(tb));
       }
       return;
    }
}
