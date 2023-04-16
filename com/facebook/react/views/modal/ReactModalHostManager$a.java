package com.facebook.react.views.modal.ReactModalHostManager$a;
import com.facebook.react.views.modal.ReactModalHostView$b;
import com.facebook.react.views.modal.ReactModalHostManager;
import df.c;
import com.facebook.react.views.modal.ReactModalHostView;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rf.b;
import android.view.ViewGroup;
import df.b;

public class ReactModalHostManager$a implements ReactModalHostView$b	// class@0013c7
{
    public final c a;
    public final ReactModalHostView b;
    public final ReactModalHostManager c;

    public void ReactModalHostManager$a(ReactModalHostManager p0,c p1,ReactModalHostView p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostManager$a.class, "1")) {
          return;
       }
       this.a.c(new b(this.b.getId()));
       return;
    }
}
