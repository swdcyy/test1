package i6a.r$a;
import d6a.a;
import i6a.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;

public final class r$a extends a	// class@0027ac
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, r$a.class, "2")) {
          return;
       }
       r$a tb = this.b;
       if (tb.y != null) {
          tb.y = false;
          k1.m(tb.D);
       }
       PatchProxy.onMethodExit(r$a.class, "2");
       return;
    }
    public void k1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, r$a.class, "1")) {
          return;
       }
       PhotoMeta photoMeta = r.P8(this.b).getPhotoMeta();
       if (photoMeta != null) {
          objArray = photoMeta.mInterestManageSnackBarInfo;
       }
       if (objArray != null) {
          if (objArray.mHasShow != null) {
             PatchProxy.onMethodExit(r$a.class, "1");
             return;
          }else {
             InterestManageSnackBarInfo mShowAfterTi = objArray.mShowAfterTimeInMilliseconds;
             if (mShowAfterTi > 0) {
                r$a tb = this.b;
                tb.y = true;
                k1.r(tb.D, mShowAfterTi);
             }else {
                this.b.X8(objArray);
             }
             PatchProxy.onMethodExit(r$a.class, "1");
             return;
          }
       }else {
          PatchProxy.onMethodExit(r$a.class, "1");
          return;
       }
    }
}
