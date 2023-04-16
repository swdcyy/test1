package iq8.g;
import erd.o;
import android.content.Context;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;

public final class g implements o	// class@002710
{
    public final Context b;

    public void g(Context p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return new BitmapDrawable(this.b.getResources(), p0);
    }
}
