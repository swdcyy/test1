package com.facebook.react.views.modal.ReactModalHostManager$b;
import android.content.DialogInterface$OnShowListener;
import com.facebook.react.views.modal.ReactModalHostManager;
import df.c;
import com.facebook.react.views.modal.ReactModalHostView;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf.c;
import android.view.ViewGroup;
import df.b;

public class ReactModalHostManager$b implements DialogInterface$OnShowListener	// class@0013c8
{
    public final c b;
    public final ReactModalHostView c;
    public final ReactModalHostManager d;

    public void ReactModalHostManager$b(ReactModalHostManager p0,c p1,ReactModalHostView p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostManager$b.class, "1")) {
          return;
       }
       this.b.c(new c(this.c.getId()));
       return;
    }
}
