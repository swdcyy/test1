package com.kwai.sdk.kbar.core.QRCodeView$e$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.sdk.kbar.core.QRCodeView$e;
import android.animation.Animator;
import com.kwai.sdk.kbar.core.QRCodeView;

public class QRCodeView$e$b extends AnimatorListenerAdapter	// class@001610
{
    public final QRCodeView$e a;

    public void QRCodeView$e$b(QRCodeView$e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.n = false;
    }
}
