package kgd.f;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import kgd.d;
import android.content.Context;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import wnc.a;
import e17.i;
import tkd.b;
import tkd.d;
import nx5.d;
import brd.t;
import cjd.e;
import erd.o;
import kgd.l;
import kgd.m;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment;
import kgd.g;
import sfc.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gx5.d;
import kgd.j;
import kgd.k;
import kgd.h;
import brd.w;
import erd.c;
import kgd.i;

public final class f implements SlipSwitchButton$b	// class@00178d
{
    public final d a;
    public final Context b;
    public final c c;

    public void f(d p0,Context p1,c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       int i;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "1")) {
          return;
       }
       f ta = this.a;
       uof = this.b;
       Objects.requireNonNull(ta);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(uof, Boolean.valueOf(p1), ta, uod, "6")) {
          if (!a.a()) {
             i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          }else if(p1){
             i = 3;
          }else {
             i = 1;
          }
          t ot = d.a(0x47047d).n0("message_privacy", i).map(new e()).map(new l(i)).onErrorReturn(m.b);
          if (SettingPageExperiment.a()) {
             ta.X7(ot.subscribe(new g(ta, p1), new a()));
          }else {
             ta.X7(t.zip(ot, d.a(-1188553266).jg("comment_deny", p1).map(new j(p1)).onErrorReturn(k.b), h.a).subscribe(new i(ta, uof, p1), new a()));
          }
       }
       this.c.o();
       return;
    }
}
