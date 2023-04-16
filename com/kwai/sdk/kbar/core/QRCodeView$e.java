package com.kwai.sdk.kbar.core.QRCodeView$e;
import java.lang.Runnable;
import com.kwai.sdk.kbar.core.QRCodeView;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.kwai.sdk.kbar.core.QRCodeView$e$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.sdk.kbar.core.QRCodeView$e$b;
import android.animation.Animator$AnimatorListener;

public class QRCodeView$e implements Runnable	// class@001611
{
    public final int b;
    public final int c;
    public final QRCodeView d;

    public void QRCodeView$e(QRCodeView p0,int p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int[] ointArray = new int[]{this.b,this.c};
       this.d.h = ValueAnimator.ofInt(ointArray);
       this.d.h.addUpdateListener(new QRCodeView$e$a(this));
       this.d.h.addListener(new QRCodeView$e$b(this));
       this.d.h.setDuration((long)((this.c - this.b) * 50));
       this.d.h.setRepeatCount(0);
       QRCodeView$e td = this.d;
       td.n = true;
       td.h.start();
    }
}
