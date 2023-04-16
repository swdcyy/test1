package com.kuaishou.live.core.show.pk.a$a;
import ic3.a$a;
import com.kuaishou.live.core.show.pk.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hd2.l0;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a$a implements a$a	// class@000d76
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void E(int p0){
    }
    public void p(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!l0.a()) {
          return;
       }
       if (p0 == 3 && l0.d((float)this.a.m8().getWidth(), (float)this.a.m8().getHeight())) {
          this.a.X8();
       }
       return;
    }
}
