package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$checkParentRadio$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.widget.TextView;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.CharSequence;

public final class FullyDraw8060Checker$checkParentRadio$1 extends Lambda implements a	// class@0010a6
{
    public final float $heightRatio;
    public final int $pBottom;
    public final int $pLeft;
    public final int $pRight;
    public final int $pTop;
    public final TextView $view;
    public final float $widthRatio;

    public void FullyDraw8060Checker$checkParentRadio$1(TextView p0,int p1,int p2,int p3,int p4,float p5,float p6){
       this.$view = p0;
       this.$pLeft = p1;
       this.$pTop = p2;
       this.$pRight = p3;
       this.$pBottom = p4;
       this.$widthRatio = p5;
       this.$heightRatio = p6;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return this.$view.getClass().getSimpleName()+": "+this.$view.getId()+": "+this.$view.getText()+':'+" pLeft\("+this.$pLeft+"\) pTop\("+this.$pTop+"\) pRight\("+this.$pRight+"\) pBottom\("+this.$pBottom+"\) "+"widthRatio\("+this.$widthRatio+"\) heightRatio\("+this.$heightRatio+')';
    }
}
