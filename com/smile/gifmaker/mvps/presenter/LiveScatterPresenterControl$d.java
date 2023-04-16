package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$d;
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
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$d$a;
import java.lang.Runnable;
import en8.a;

public final class LiveScatterPresenterControl$d extends LiveScatterPresenterControl$f	// class@000c05
{
    public final LiveScatterPresenterControl c;

    public void LiveScatterPresenterControl$d(LiveScatterPresenterControl p0){
       this.c = p0;
       super(p0, LiveScatterPresenterControl$State.DESTROY);
    }
    public void a(){
       Iterator iterator = this.c.g.iterator();
       while (iterator.hasNext()) {
          PresenterV2$c uoc = iterator.next();
          PresenterV2$c a = uoc.a;
          a.o(a, "it.mPresenter");
          String str = c.b.a(a.getClass());
          LiveScatterPresenterControl$d tc = this.c;
          tc.i.f(new d(5, str, tc.j, new LiveScatterPresenterControl$d$a(str, uoc)));
       }
       return;
    }
}
