package jg9.q;
import hka.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;

public final class q implements a	// class@002aad
{
    public final MultiPicturePreviewHelper b;

    public void q(MultiPicturePreviewHelper p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.h.getChildFragmentManager().findFragmentByTag("MultiPict_PREVIEW_FRAGMENT");
       if (obj == null) {
          return false;
       }
       if (obj instanceof MediaPreviewFragment) {
          objArray = obj;
       }
       if (objArray != null) {
          objArray.fh();
       }
       return true;
    }
}
