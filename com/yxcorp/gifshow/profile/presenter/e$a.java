package com.yxcorp.gifshow.profile.presenter.e$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import om6.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.yxcorp.gifshow.profile.presenter.c;
import com.yxcorp.gifshow.profile.presenter.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class e$a extends m	// class@001444
{
    public final e c;

    public void e$a(e p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.c.X7(y6.s(d.class, LoadPolicy.DIALOG).R(new c(this), d.b));
       return;
    }
}
