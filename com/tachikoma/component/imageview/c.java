package com.tachikoma.component.imageview.c;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKImage;
import java.lang.String;
import java.lang.Object;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import un8.t;
import iq8.x;

public final class c implements Runnable	// class@000d01
{
    public final TKImage b;
    public final String c;

    public void c(TKImage p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       x.f(new t(tb, BitmapFactory.decodeFile(tc, tb.p(tc))));
    }
}
