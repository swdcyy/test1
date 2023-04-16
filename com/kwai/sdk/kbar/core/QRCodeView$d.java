package com.kwai.sdk.kbar.core.QRCodeView$d;
import java.util.TimerTask;
import com.kwai.sdk.kbar.core.QRCodeView;

public class QRCodeView$d extends TimerTask	// class@00160e
{
    public final QRCodeView b;

    public void QRCodeView$d(QRCodeView p0){
       this.b = p0;
       super();
    }
    public void run(){
       QRCodeView$d tb = this.b;
       QRCodeView r = tb.r;
       if (r == true) {
          tb.q = true;
       }
       tb.r = r + true;
       return;
    }
}
