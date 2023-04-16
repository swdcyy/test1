package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public final class FullyDraw8060Checker$calculateFillRate$4 extends Lambda implements a	// class@0010a2
{
    public final int $bottom;
    public final View $child;
    public final int $left;
    public final int $right;
    public final ViewGroup $rootView;
    public final int $top;

    public void FullyDraw8060Checker$calculateFillRate$4(View p0,ViewGroup p1,int p2,int p3,int p4,int p5){
       this.$child = p0;
       this.$rootView = p1;
       this.$left = p2;
       this.$top = p3;
       this.$right = p4;
       this.$bottom = p5;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return this.$child.getClass().getSimpleName()+" is not focus view, continue : "+this.$rootView.getId()+": "+"left\("+this.$left+"\) top\("+this.$top+"\) right\("+this.$right+"\) bottom\("+this.$bottom+')';
    }
}
