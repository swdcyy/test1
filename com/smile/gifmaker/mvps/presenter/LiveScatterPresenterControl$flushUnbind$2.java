package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$flushUnbind$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl;
import java.lang.Object;
import xj3.d;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class LiveScatterPresenterControl$flushUnbind$2 extends Lambda implements l	// class@000c0c
{
    public final LiveScatterPresenterControl this$0;

    public void LiveScatterPresenterControl$flushUnbind$2(LiveScatterPresenterControl p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(d p0){
       a.p(p0, "it");
       boolean b = (a.g(p0.b(), this.this$0.j) && p0.c() == 200)? true: false;
       return b;
    }
}