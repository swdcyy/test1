package com.kwai.component.photo.detail.slide.cocreate.CoChangeIdentityDialog$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.component.photo.detail.slide.cocreate.CoChangeIdentityDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class CoChangeIdentityDialog$a extends m	// class@000a44
{
    public final CoChangeIdentityDialog c;

    public void CoChangeIdentityDialog$a(CoChangeIdentityDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoChangeIdentityDialog$a.class, "1")) {
          return;
       }
       this.c.dismiss();
       return;
    }
}
