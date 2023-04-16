package gha.o;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import brd.v;
import com.yxcorp.gifshow.model.FollowTabNotify;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap$Config;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import java.lang.Throwable;
import brd.g;

public class o implements ImageCallback	// class@002adf
{
    public final v b;
    public final FollowTabNotify c;

    public void o(v p0,FollowTabNotify p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       o oo = (p0 == null)? null: p0.copy(p0.getConfig(), true);
       if (oo == null) {
          this.b.onError(new NullPointerException("fetchImg failed imageUrl: "+this.c.mUserInfo.mHeadUrl));
       }else {
          this.b.onNext(oo);
          this.b.onComplete();
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
