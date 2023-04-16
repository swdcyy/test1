package com.tachikoma.component.imageview.b;
import java.lang.Runnable;
import com.tachikoma.component.imageview.TKImage;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import vn8.v;
import android.widget.ImageView;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import android.view.View;
import com.tachikoma.core.component.e;
import un8.l;
import java.lang.String;
import vn8.v$a;

public final class b implements Runnable	// class@000d00
{
    public final TKImage b;
    public final Drawable c;

    public void b(TKImage p0,Drawable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       v ov = tb.n();
       ImageView imageView = (tb.y != null)? new ImageView(tb.getContext()): tb.getView();
       ov.f(imageView, tb.src, tc, tb.blurRadius, new l(tb));
       return;
    }
}
