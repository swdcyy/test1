package cc8.h;
import erd.g;
import android.widget.ImageView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.mini.js.jsapi.ui.nativeui.PictureToastView;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.mini.d;

public final class h implements g	// class@0003e8
{
    public final ImageView b;
    public final String c;

    public void h(ImageView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.setImageBitmap(null);
       d.c("#toast#", "Toast获取图片失败： 路径是: "+this.c+" 原因是:"+p0);
    }
}
