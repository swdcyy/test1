package com.kuaishou.live.core.show.closepage.audience.basicinfo.n$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;

public class n$b extends m	// class@000a44
{
    public final n c;

    public void n$b(n p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "1")) {
          return;
       }
       if (!g.h(this.c.getActivity())) {
          this.c.getActivity().finish();
       }
       return;
    }
}
