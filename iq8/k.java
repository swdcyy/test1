package iq8.k;
import erd.o;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.tachikoma.core.utility.b;

public final class k implements o	// class@002714
{
    public final String b;

    public void k(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       if (p0 != null && !p0.isRecycled()) {
          return p0;
       }
       throw new Exception("bitmap is recycled "+b.c(tb));
    }
}
