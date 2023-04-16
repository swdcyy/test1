package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$clearPopup$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public final class PictureInPicturePresenter$clearPopup$4 extends Lambda implements l	// class@0016b4
{
    public static final PictureInPicturePresenter$clearPopup$4 INSTANCE;

    static {
       PictureInPicturePresenter$clearPopup$4.INSTANCE = new PictureInPicturePresenter$clearPopup$4();
    }
    public void PictureInPicturePresenter$clearPopup$4(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PictureInPicturePresenter$clearPopup$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       KwaiDialogFragment kwaiDialogFr = p0.get();
       boolean b = true;
       int i = 0;
       if (kwaiDialogFr != null && kwaiDialogFr.isVisible() == b) {
          kwaiDialogFr.dismiss();
          Object[] objArray = new Object[i];
          o.C().w("PictureInPicturePresent", "dismiss dialog: "+kwaiDialogFr, objArray);
       }else {
          b = false;
       }
       return b;
    }
}
