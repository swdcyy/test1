package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$c;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$f;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$State;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2$c;
import yj3.c;
import java.lang.Class;
import xj3.d;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$c$a;
import java.lang.Runnable;
import en8.a;

public final class LiveScatterPresenterControl$c extends LiveScatterPresenterControl$f	// class@000c03
{
    public final View c;
    public final LiveScatterPresenterControl d;

    public void LiveScatterPresenterControl$c(LiveScatterPresenterControl p0,View p1){
       a.p(p1, "view");
       this.d = p0;
       super(p0, LiveScatterPresenterControl$State.CREATE);
       this.c = p1;
    }
    public void a(){
       Iterator iterator = this.d.g.iterator();
       while (iterator.hasNext()) {
          PresenterV2$c uoc = iterator.next();
          PresenterV2$c a = uoc.a;
          a.o(a, "it.mPresenter");
          String str = c.b.a(a.getClass());
          LiveScatterPresenterControl$c td = this.d;
          td.i.f(new d(1, str, td.j, new LiveScatterPresenterControl$c$a(str, uoc, this)));
       }
       return;
    }
}
