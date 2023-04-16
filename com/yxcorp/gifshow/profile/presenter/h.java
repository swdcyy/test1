package com.yxcorp.gifshow.profile.presenter.h;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.res.Resources;
import i4c.i0;
import ekd.k1;

public final class h implements Runnable	// class@00144c
{
    public final float b;
    public final TextView c;

    public void h(float p0,TextView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       Drawable uDrawable = a1.f(R.drawable.arg_RES_7f0822fe);
       if (uDrawable instanceof BitmapDrawable) {
          Bitmap bitmap = uDrawable.getBitmap();
          k1.o(new i0(tc, new BitmapDrawable(a1.m(), Bitmap.createScaledBitmap(bitmap, (int)(((float)bitmap.getWidth() * tb) + 0x3f000000), (int)(((float)bitmap.getHeight() * tb) + 0x3f000000), true))));
       }
       return;
    }
}
