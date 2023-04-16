package ia1.c;
import w4.c;
import ia1.b;
import java.lang.Object;
import w4.i;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.File;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class c implements c	// class@002879
{
    public final b a;

    public void c(b p0){
       this.a = p0;
    }
    public final Bitmap a(i p0){
       c ta = this.a;
       String str = (ta.h())? p0.b()+File.separator: "";
       return BitmapUtil.t(ta.f()+File.separator+str+p0.c(), p0.e(), p0.d(), false);
    }
}
