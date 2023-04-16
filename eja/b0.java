package eja.b0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.m$a;
import java.lang.Object;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.follow.stagger.presenter.m;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.view.View;

public final class b0 implements g	// class@0026b4
{
    public final m$a b;

    public void b0(m$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Drawable[] uDrawableArr = new Drawable[]{new BitmapDrawable(a1.m(), p0),a1.f(0x7f061f19)};
       this.b.c.p.setBackground(new LayerDrawable(uDrawableArr));
    }
}
