package com.kuaishou.live.core.show.vote.presenter.c$a;
import cm2.p$b;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import z12.e;
import java.util.Objects;
import yl2.a;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import dm2.l;
import sfc.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;

public class c$a implements p$b	// class@00123f
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "on vote item click "+p0+" "+p1, stringArray);
       uoa = this.a;
       Objects.requireNonNull(uoa);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uoa, uoc, "5")) {
          uoa.X7(e.p().d(p0, p1).map(new e()).subscribe(new l(uoa, p1), new a()));
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveAudienceVotePresenter", "is vote popup showing", stringArray);
       c v = this.a.V;
       if (v != null && v.K()) {
          i = true;
       }
       return i;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "on popup close click", stringArray);
       this.a.a9();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceVotePresenter", "on vote early stop click", stringArray);
       return;
    }
}
