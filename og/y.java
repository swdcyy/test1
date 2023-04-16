package og.y;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import og.b1;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.feature.post.bridge.util.PostVideoHelper;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$PairedPhotoParams;
import java.util.Objects;
import java.lang.String;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import nm6.d;
import n3d.a;
import om6.f;
import hn6.c;

public final class y implements g	// class@0027cd
{
    public final ProgressFragment b;
    public final GifshowActivity c;
    public final Bundle d;
    public final JsCameraCallbackParams$Param e;
    public final b1 f;
    public final PostVideoHelper$c g;

    public void y(ProgressFragment p0,GifshowActivity p1,Bundle p2,JsCameraCallbackParams$Param p3,b1 p4,PostVideoHelper$c p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       Object[] objArray;
       d uod;
       y tc = this.c;
       y td = this.d;
       y te = this.e;
       y tf = this.f;
       y tg = this.g;
       PostVideoHelper.d(this.b);
       if (!tc.b3()) {
       }else if(td == null){
          td = PostVideoHelper.b(te);
       }
       int i = 0;
       int i1 = (te.mReturnToOriginalPage != null || te.mReturnToWeb != null)? 1: 0;
       JsCameraCallbackParams$PairedPhotoParams mType = te.mPairedPhotoParams.mType;
       Objects.requireNonNull(mType);
       l ol = -1;
       int i2 = mType.hashCode();
       if (i2 != 0x2d8048a7) {
          if (i2 != 0x4b081efb) {
             if (i2 == 0x5e7bfeee && mType.equals("followShoot")) {
                ol = 2;
             }
          }else if(!mType.equals("lipsSync")){
             ol = 1;
          }
       }else if(!mType.equals("sameFrame")){
          ol = null;
       }
       if (ol) {
          if (ol != 1) {
             if (ol == 2) {
                objArray = new Object[i];
                l.D().w("PostVideoHelper", "jump to followShoot with type="+te.mPairedPhotoParams.mType, objArray);
                uod = new d();
                uod.p((i1 ^ 1));
                uod.m(1);
                uod.n(td);
                uod.j(PostVideoHelper.l(tf, tg));
                tg.f.uI(tc, p0, uod);
             }
          }else {
             objArray = new Object[i];
             l.D().w("PostVideoHelper", "jump to lipsSync with type="+te.mPairedPhotoParams.mType, objArray);
             uod = new d();
             uod.p((i1 ^ 1));
             uod.m(1);
             uod.n(td);
             uod.j(PostVideoHelper.l(tf, tg));
             tg.f.Qh(tc, p0, uod);
          }
       }else {
          objArray = new Object[i];
          l.D().w("PostVideoHelper", "jump to sameFrame with type="+te.mPairedPhotoParams.mType, objArray);
          uod = new d();
          uod.p((i1 ^ 1));
          uod.m(1);
          uod.n(td);
          uod.j(PostVideoHelper.l(tf, tg));
          tg.g.vd(tc, p0, uod);
       }
       return;
    }
}
