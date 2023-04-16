package com.yxcorp.gifshow.detail.slideplay.presenter.c$a;
import com.kwai.framework.player.multisource.e;
import com.yxcorp.gifshow.detail.slideplay.presenter.c;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oc6.b;

public class c$a implements e	// class@001841
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public void b(PlaySourceSwitcher$a p0){
    }
    public void c(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.P8("SwitchedFailed", String.valueOf(p0));
       return;
    }
    public void d(b p0){
       a.c(this, p0);
    }
}
