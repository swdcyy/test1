package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$f;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$State;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class LiveScatterPresenterControl$f	// class@000c08
{
    public final LiveScatterPresenterControl$State a;
    public final LiveScatterPresenterControl b;

    public void LiveScatterPresenterControl$f(LiveScatterPresenterControl p0,LiveScatterPresenterControl$State p1){
       a.p(p1, "state");
       this.b = p0;
       super();
       this.a = p1;
    }
    public abstract void a();
}
