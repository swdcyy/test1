package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$8;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import android.widget.TextView;
import java.lang.CharSequence;

public final class FullyDraw8060Checker$calculateFillRate$8 extends Lambda implements a	// class@0010a4
{
    public final int $bottom;
    public final View $child;
    public final int $left;
    public final int $right;
    public final int $top;

    public void FullyDraw8060Checker$calculateFillRate$8(View p0,int p1,int p2,int p3,int p4){
       this.$child = p0;
       this.$left = p1;
       this.$top = p2;
       this.$right = p3;
       this.$bottom = p4;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       StringBuilder str = this.$child.getClass().getSimpleName()+": "+this.$child.getId()+": ";
       String str1 = (this.$child instanceof TextView)? this.$child.getText()+' ': "";
       return str+str1+' '+"left\("+this.$left+"\) top\("+this.$top+"\) right\("+this.$right+"\) bottom\("+this.$bottom+')';
    }
}
