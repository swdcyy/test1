package iq8.h;
import erd.o;
import android.content.Context;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;

public final class h implements o	// class@002711
{
    public final Context b;

    public void h(Context p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return new BitmapDrawable(this.b.getResources(), p0);
    }
}
