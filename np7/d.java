package np7.d;
import android.app.Activity;
import android.graphics.Paint;
import com.kwai.sharelib.model.PainterModel;
import android.graphics.Bitmap;
import android.view.View;
import com.kwai.sharelib.model.PainterModel$QrContent;
import java.lang.Throwable;
import android.widget.ImageView;
import com.kwai.sharelib.model.PainterModel$ImageContent;
import com.kwai.sharelib.model.PainterModel$QrLayout;
import android.graphics.Bitmap$Config;

public interface abstract d	// class@003023
{

    boolean E(Activity p0);
    Paint a();
    Bitmap b(PainterModel p0,Bitmap p1,int p2,int p3);
    View c(View p0,int p1);
    Bitmap e(PainterModel$QrContent p0,int p1);
    void f(PainterModel p0,Throwable p1);
    void g(View p0);
    void h(ImageView p0);
    Bitmap i(PainterModel$ImageContent p0);
    Bitmap l(Bitmap p0,PainterModel$QrLayout p1);
    Bitmap m(View p0,int p1,int p2,Bitmap$Config p3);
}
