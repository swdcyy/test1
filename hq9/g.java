package hq9.g;
import erd.g;
import hq9.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Throwable;
import android.app.Activity;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import uq9.i;

public final class g implements g	// class@002708
{
    public final i b;
    public final GifshowActivity c;

    public void g(i p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       i.d(R.style.arg_RES_7f110668, tb.c(p0, this.c));
       if (p0 instanceof KwaiException) {
          int errorCode = p0.getErrorCode();
          if (errorCode == 0xc350) {
             errorCode = tb.a;
             i.d(errorCode.mEntity, errorCode.getPhotoId(), false);
          }else if(errorCode == 0xc351){
             errorCode = tb.a;
             i.d(errorCode.mEntity, errorCode.getPhotoId(), true);
          }
       }
       return;
    }
}
