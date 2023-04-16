package i6a.r$i;
import java.lang.Runnable;
import i6a.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;

public final class r$i implements Runnable	// class@0027b4
{
    public final r b;

    public void r$i(r p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, r$i.class, "1")) {
          return;
       }
       r$i tb = this.b;
       tb.y = false;
       PhotoMeta photoMeta = r.P8(tb).getPhotoMeta();
       if (photoMeta != null) {
          photoMeta = photoMeta.mInterestManageSnackBarInfo;
          if (photoMeta != null) {
             this.b.X8(photoMeta);
          }
       }
       PatchProxy.onMethodExit(r$i.class, "1");
       return;
    }
}
