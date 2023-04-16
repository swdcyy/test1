package com.kwai.live.gzone.guess.kshell.f0$a;
import erd.g;
import com.kwai.live.gzone.guess.kshell.f0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.w;
import q57.a;

public class f0$a implements g	// class@000d34
{
    public final f0 b;

    public void f0$a(f0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$a.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b;
          if (p0.D == null || (p0.B == null && p0.C != null)) {
             a.i("SQUARE", p0.x.a(), w.a(this.b.getActivity()));
          }
       }
       return;
    }
}
