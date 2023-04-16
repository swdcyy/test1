package dta.a1;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.homepage.kcube.presenter.i;
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

public class a1 implements ImageCallback	// class@002521
{
    public final v b;
    public final FollowTabNotify c;
    public final i d;

    public void a1(i p0,v p1,FollowTabNotify p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "1")) {
          return;
       }
       a1 uoa1 = (p0 == null)? null: p0.copy(p0.getConfig(), true);
       if (uoa1 == null) {
          this.b.onError(new NullPointerException("fetchImg failed imageUrl: "+this.c.mUserInfo.mHeadUrl));
       }else {
          this.b.onNext(uoa1);
          this.b.onComplete();
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
