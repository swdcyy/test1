package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$b;
import androidx.fragment.app.c$b;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import rd1.m;
import lp3.c;
import lp3.i;

public final class BaseLiveAudienceMultiChatPresenter$b extends c$b	// class@000a7a
{
    public final BaseLiveAudienceMultiChatPresenter a;

    public void BaseLiveAudienceMultiChatPresenter$b(BaseLiveAudienceMultiChatPresenter p0){
       this.a = p0;
       super();
    }
    public void k(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveAudienceMultiChatPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       p0.C = false;
       return;
    }
    public void l(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveAudienceMultiChatPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       BaseLiveAudienceMultiChatPresenter$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, BaseLiveAudienceMultiChatPresenter.class, "25")) {
          ta.C = true;
          BaseLiveAudienceMultiChatPresenter q = ta.q;
          if (q == null) {
             a.S("serviceManager");
          }
          q.a(m.class).close(9);
       }
       return;
    }
}
