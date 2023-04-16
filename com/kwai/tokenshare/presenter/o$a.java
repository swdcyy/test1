package com.kwai.tokenshare.presenter.o$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.tokenshare.presenter.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.tokenshare.KwaiTokenDialog;

public class o$a extends m	// class@00194b
{
    public final o c;

    public void o$a(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o w = this.c.w;
       if (w != null) {
          w.Zc();
       }
       return;
    }
}
