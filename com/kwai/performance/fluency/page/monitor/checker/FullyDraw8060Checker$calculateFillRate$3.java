package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.ViewGroup;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public final class FullyDraw8060Checker$calculateFillRate$3 extends Lambda implements a	// class@0010a1
{
    public final Ref$IntRef $parentBottom;
    public final Ref$IntRef $parentLeft;
    public final Ref$IntRef $parentRight;
    public final Ref$IntRef $parentTop;
    public final ViewGroup $rootView;

    public void FullyDraw8060Checker$calculateFillRate$3(ViewGroup p0,Ref$IntRef p1,Ref$IntRef p2,Ref$IntRef p3,Ref$IntRef p4){
       this.$rootView = p0;
       this.$parentLeft = p1;
       this.$parentTop = p2;
       this.$parentRight = p3;
       this.$parentBottom = p4;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return "== Parent "+this.$rootView.getClass().getSimpleName()+" == : "+this.$rootView.getId()+": "+"left\("+this.$parentLeft.element+"\) top \("+this.$parentTop.element+"\) right\("+this.$parentRight.element+"\) bottom\("+this.$parentBottom.element+')';
    }
}
