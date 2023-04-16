package com.kwai.sdk.kbar.core.QRCodeView$b;
import java.lang.Runnable;
import com.kwai.sdk.kbar.core.QRCodeView;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Timer;
import com.kwai.sdk.kbar.core.CameraPreview;
import com.kwai.sdk.kbar.core.QRCodeView$f;
import android.hardware.Camera$PreviewCallback;
import android.hardware.Camera;

public class QRCodeView$b implements Runnable	// class@00160c
{
    public final DecodeRet[] b;
    public final QRCodeView c;

    public void QRCodeView$b(QRCodeView p0,DecodeRet[] p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       try{
          QRCodeView$b tc = this.c;
          if (tc.g != null) {
             if (tc.e != null) {
                tc = this.b;
                if (tc != null && tc.length > 0) {
                   int i = 0;
                   if (!TextUtils.isEmpty(tc[i].getUrl())) {
                      tc = this.c;
                      QRCodeView o = tc.o;
                      if (o != null) {
                         o.cancel();
                         tc.o = null;
                      }
                      o = tc.p;
                      if (o != null) {
                         o.cancel();
                         tc.p = null;
                      }
                      tc.q = true;
                      tc.c.i = i;
                      this.c.e.c(this.b);
                   }
                }
             }
             tc = this.c;
             tc.b.setOneShotPreviewCallback(tc);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
