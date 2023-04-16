package ko1.j;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import lnc.a1;

public final class j implements o	// class@002d82
{
    public final String b;

    public void j(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Bitmap.createScaledBitmap(BitmapUtil.s(this.b), a1.d(0x7f070872), a1.d(0x7f070872), true);
    }
}
