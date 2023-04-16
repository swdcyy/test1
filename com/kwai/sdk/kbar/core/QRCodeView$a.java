package com.kwai.sdk.kbar.core.QRCodeView$a;
import java.lang.Runnable;
import com.kwai.sdk.kbar.core.QRCodeView;
import android.hardware.Camera$Size;
import java.lang.Object;

public class QRCodeView$a implements Runnable	// class@00160b
{
    public final byte[] b;
    public final Camera$Size c;
    public final QRCodeView d;

    public void QRCodeView$a(QRCodeView p0,byte[] p1,Camera$Size p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       _monitor_enter(this);
       QRCodeView$a tc = this.c;
       this.d.o(this.b, tc.width, tc.height);
       _monitor_exit(this);
    }
}
