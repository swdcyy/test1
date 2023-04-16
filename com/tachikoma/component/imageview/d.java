package com.tachikoma.component.imageview.d;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKImage;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tachikoma.component.imageview.b;
import android.graphics.drawable.Drawable;
import iq8.x;

public final class d implements Runnable	// class@000d02
{
    public final TKImage b;
    public final String c;

    public void d(TKImage p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       x.f(new b(tb, new BitmapDrawable(BitmapFactory.decodeFile(tc, tb.p(tc)))));
    }
}
