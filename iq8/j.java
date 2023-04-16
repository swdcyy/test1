package iq8.j;
import erd.o;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.tachikoma.core.utility.b;

public final class j implements o	// class@002713
{
    public final String b;

    public void j(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       if (p0 != null && !p0.isRecycled()) {
          return p0;
       }
       throw new Exception("bitmap is recycled "+b.c(tb));
    }
}
