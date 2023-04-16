package k99.z;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class z implements View$OnClickListener	// class@002b9e
{
    public final HorizontalAtlasExpandPresenterV4 b;

    public void z(HorizontalAtlasExpandPresenterV4 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       this.b.R8("BUTTON_LEAVE");
       return;
    }
}
