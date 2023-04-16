package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$h;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$f;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$State;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import yj3.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import xj3.d;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$h$a;
import java.lang.Runnable;
import en8.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$h$b;

public final class LiveScatterPresenterControl$h extends LiveScatterPresenterControl$f	// class@000c11
{
    public final LiveScatterPresenterControl c;

    public void LiveScatterPresenterControl$h(LiveScatterPresenterControl p0){
       this.c = p0;
       super(p0, LiveScatterPresenterControl$State.UNBIND);
    }
    public void a(){
       PresenterV2$c uoc;
       PresenterV2$c a;
       Iterator iterator = this.c.g.iterator();
       String str = "it.mPresenter";
       while (iterator.hasNext()) {
          uoc = iterator.next();
          a = uoc.a;
          a.o(a, str);
          str = c.b.a(a.getClass());
          LiveScatterPresenterControl$h tc = this.c;
          tc.i.f(new d(4, str, tc.j, new LiveScatterPresenterControl$h$a(str, uoc)));
       }
       iterator = this.c.g.iterator();
       while (iterator.hasNext()) {
          uoc = iterator.next();
          a = uoc.a;
          a.o(a, str);
          String str1 = c.b.a(a.getClass());
          LiveScatterPresenterControl$h tc1 = this.c;
          tc1.i.f(new d(6, str1, tc1.j, new LiveScatterPresenterControl$h$b(str1, uoc)));
       }
       return;
    }
}
