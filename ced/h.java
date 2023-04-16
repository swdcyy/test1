package ced.h;
import uo7.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import java.lang.String;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.c;
import android.graphics.Bitmap;
import yic.j;

public final class h implements d	// class@00055b
{
    public final GifshowActivity b;
    public final OperationModel c;

    public void h(GifshowActivity p0,OperationModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean M3(String p0,String p1,String p2,ShareAnyResponse$ShareObject p3){
       return c.a(this, p0, p1, p2, p3);
    }
    public final Bitmap h3(Bitmap p0,String p1,String p2,String p3,ShareAnyResponse$ShareObject p4){
       return new j(p0, p4, this.b, this.c).d();
    }
}
