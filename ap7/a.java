package ap7.a;
import android.app.Activity;
import com.kwai.sharelib.model.PosterConfig;
import com.kwai.sharelib.model.PainterModel;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.graphics.Bitmap;

public interface abstract a	// class@00032f
{

    void d(boolean p0);
    void destroy();
    ViewGroup j(Activity p0,PosterConfig p1,PainterModel p2,ViewGroup p3,int p4,int p5,boolean p6);
    void k(Activity p0,PosterConfig p1,PainterModel p2,View p3);
    Bitmap n(Context p0,PainterModel p1);
}
