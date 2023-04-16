package com.kwai.tokenshare.presenter.d$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.tokenshare.presenter.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tokenshare.KwaiTokenDialog;

public class d$a extends m	// class@00193f
{
    public final d c;

    public void d$a(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d w = this.c.w;
       if (w != null) {
          w.Zc();
       }
       return;
    }
}
