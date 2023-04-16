package com.tachikoma.component.imageview.e;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKImage;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import un8.m;
import android.graphics.drawable.Drawable;
import iq8.x;

public final class e implements Runnable	// class@000d03
{
    public final TKImage b;
    public final String c;
    public final List d;
    public final int e;
    public final int f;

    public void e(TKImage p0,String p1,List p2,int p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       m om = new m(tb, this.d, this.e, this.f, new BitmapDrawable(BitmapFactory.decodeFile(tc, tb.p(tc))));
       x.f(v6);
    }
}
