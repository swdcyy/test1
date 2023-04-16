package com.kwai.sdk.kbar.core.QRCodeView$e$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.sdk.kbar.core.QRCodeView$e;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.kwai.sdk.kbar.core.QRCodeView;
import com.kwai.sdk.kbar.core.CameraPreview;
import java.lang.Integer;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;

public class QRCodeView$e$a implements ValueAnimator$AnimatorUpdateListener	// class@00160f
{
    public final QRCodeView$e a;

    public void QRCodeView$e$a(QRCodeView$e p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       QRCodeView c = this.a.d.c;
       if (c != null && c.b()) {
          Camera$Parameters parameters = this.a.d.b.getParameters();
          parameters.setZoom(p0.getAnimatedValue().intValue());
          this.a.d.b.setParameters(parameters);
       }
       return;
    }
}
