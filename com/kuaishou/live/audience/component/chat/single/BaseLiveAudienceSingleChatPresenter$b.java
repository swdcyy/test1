package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$b;
import androidx.fragment.app.c$b;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import rd1.o;
import lp3.c;
import lp3.i;

public final class BaseLiveAudienceSingleChatPresenter$b extends c$b	// class@000a85
{
    public final BaseLiveAudienceSingleChatPresenter a;

    public void BaseLiveAudienceSingleChatPresenter$b(BaseLiveAudienceSingleChatPresenter p0){
       this.a = p0;
       super();
    }
    public void k(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveAudienceSingleChatPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       this.a.Y8();
       return;
    }
    public void l(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveAudienceSingleChatPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       BaseLiveAudienceSingleChatPresenter$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, BaseLiveAudienceSingleChatPresenter.class, "25")) {
          ta.D = true;
          BaseLiveAudienceSingleChatPresenter q = ta.q;
          if (q == null) {
             a.S("serviceManager");
          }
          q.a(o.class).close(9);
       }
       return;
    }
}
