package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$j;
import java.lang.Runnable;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import java.lang.Object;
import java.util.Collection;
import java.util.LinkedList;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$f;
import java.util.Map;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$j implements Runnable	// class@000c13
{
    public final LiveScatterPresenterControl b;

    public void LiveScatterPresenterControl$j(LiveScatterPresenterControl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (this.b.h.isEmpty() ^ 0x01) {
          LiveScatterPresenterControl$f uof = this.b.h.removeFirst();
          LiveScatterPresenterControl$f b = uof.b;
          LiveScatterPresenterControl$f a = uof.a;
          Set set = LiveScatterPresenterControl.k.get(b.c);
          boolean b1 = (set != null)? set.contains(a): false;
          if (!b1) {
             b.B(b.b, "is not allowed state chage: current state is "+b.c+", "+"target state is "+a);
          }
          if (b1) {
             b.Z(uof.b.b, "Enter state: "+uof.a);
             uof.b.c = uof.a;
             uof.a();
          }
          this.b.c();
       }
       return;
    }
}
