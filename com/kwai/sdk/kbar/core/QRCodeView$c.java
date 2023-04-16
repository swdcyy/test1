package com.kwai.sdk.kbar.core.QRCodeView$c;
import java.lang.Runnable;
import com.kwai.sdk.kbar.core.QRCodeView;
import java.lang.Object;
import android.hardware.Camera$PreviewCallback;
import android.hardware.Camera;

public class QRCodeView$c implements Runnable	// class@00160d
{
    public final QRCodeView b;

    public void QRCodeView$c(QRCodeView p0){
       this.b = p0;
       super();
    }
    public void run(){
       QRCodeView$c tb = this.b;
       QRCodeView b = tb.b;
       if (b != null && tb.g != null) {
          b.setOneShotPreviewCallback(tb);
       }
       return;
    }
}
