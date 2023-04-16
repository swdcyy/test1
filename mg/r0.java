package mg.r0;
import erd.o;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.StringBuilder;

public final class r0 implements o	// class@002654
{
    public final String b;

    public void r0(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return "data:image/jpg;base64,"+BitmapUtil.d(BitmapUtil.m(this.b, 3));
    }
}
