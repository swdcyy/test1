package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$f;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import wj3.a$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$State;
import java.util.Arrays;
import com.smile.gifshow.annotation.provider.v2.a;
import vl8.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import yj3.c;
import java.lang.Class;
import xj3.d;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a$a;
import java.lang.Runnable;
import en8.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a$b;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$a$c;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveScatterPresenterControl$a extends LiveScatterPresenterControl$f	// class@000c00
{
    public final a$a c;
    public final Object[] d;
    public final LiveScatterPresenterControl e;

    public void LiveScatterPresenterControl$a(LiveScatterPresenterControl p0,a$a p1,Object[] p2){
       a.p(p2, "callerContext");
       this.e = p0;
       super(p0, LiveScatterPresenterControl$State.BIND);
       this.c = p1;
       this.d = p2;
    }
    public void a(){
       PresenterV2$c a;
       LiveScatterPresenterControl$a te;
       LiveScatterPresenterControl$a td = this.d;
       a uoa = this.e.f.a(Arrays.copyOf(td, td.length));
       Iterator iterator = this.e.g.iterator();
       String str = "it.mPresenter";
       while (iterator.hasNext()) {
          PresenterV2$c uoc = iterator.next();
          a = uoc.a;
          a.o(a, str);
          str = c.b.a(a.getClass());
          te = this.e;
          te.i.f(new d(2, str, te.j, new LiveScatterPresenterControl$a$a(str, uoc, this, uoa)));
       }
       LiveScatterPresenterControl$a te1 = this.e;
       if (te1.e == null) {
          Iterator iterator1 = te1.g.iterator();
          while (iterator1.hasNext()) {
             PresenterV2$c uoc1 = iterator1.next();
             PresenterV2$c a1 = uoc1.a;
             a.o(a1, str);
             String str1 = c.b.a(a1.getClass());
             te = this.e;
             te.i.f(new d(3, str1, te.j, new LiveScatterPresenterControl$a$b(str1, uoc1)));
          }
          te1 = this.c;
          if (te1 != null) {
             td = this.e;
             td.i.f(new d(200, "bindFinishAction", td.j, new LiveScatterPresenterControl$a$c(te1)));
          }
       }else {
          b.Z(te1.b, "It is callingUnbind, BindStateAction skip onBind");
       }
       return;
    }
}
