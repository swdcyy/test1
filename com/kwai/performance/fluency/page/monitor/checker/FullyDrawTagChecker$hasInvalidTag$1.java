package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$hasInvalidTag$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public final class FullyDrawTagChecker$hasInvalidTag$1 extends Lambda implements a	// class@0010bb
{
    public final Object $tag;
    public final View $view;

    public void FullyDrawTagChecker$hasInvalidTag$1(View p0,Object p1){
       this.$view = p0;
       this.$tag = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return this.$view.getClass().getSimpleName()+": "+this.$view.getId()+": "+this.$tag;
    }
}
