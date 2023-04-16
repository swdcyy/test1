package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$a;
import lsc.v;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jn9.b;
import msc.q;
import lsc.u;
import kotlin.jvm.internal.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.f;
import urc.i;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import urc.k;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction;
import xvc.b;
import lsc.t;
import jn9.b$b;

public final class MusicRootFragment$a implements v	// class@0010c1
{
    public final MusicRootFragment a;

    public void MusicRootFragment$a(MusicRootFragment p0){
       this.a = p0;
       super();
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment$a.class, "1")) {
          return;
       }
       b uob = this.a.Ch();
       q oq = this.a.Eh();
       if (!PatchProxy.applyVoidTwoRefs(uob, oq, null, u.class, "14")) {
          a.p(uob, "postListAdapter");
          a.p(oq, "musicViewModel");
          String str = uob.p();
          if (uob.q() >= 0) {
             i oi = oq.o0().s().i();
             SelectSource selectSource = (oi != null)? oi.h(): null;
             int i = oq.o0().v().d();
             if (selectSource != null) {
                oq.t0(new MusicUnSelectedAction(i, selectSource));
             }
          }
          b.b(uob, new t(uob, str), false, 2, null);
          b.w(uob, false, false, null, 7, null);
       }
       return;
    }
}
