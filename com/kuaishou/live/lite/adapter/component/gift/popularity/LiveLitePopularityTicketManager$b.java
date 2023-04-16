package com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager$b;
import a83.a$b;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b83.a;
import java.util.Objects;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.a;

public final class LiveLitePopularityTicketManager$b implements a$b	// class@001def
{
    public final LiveLitePopularityTicketManager a;

    public void LiveLitePopularityTicketManager$b(LiveLitePopularityTicketManager p0){
       this.a = p0;
       super();
    }
    public void c(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLitePopularityTicketManager$b.class, "1")) {
          return;
       }
       this.a.f.d(true);
       LiveLitePopularityTicketManager f = this.a.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoid(objArray, f, a.class, "5")) {
          a = f.a;
          if (a != null && !f.l.j()) {
             a.q();
          }
          a = f.b;
          if (a != null && !f.l.j()) {
             a.l();
          }
       }
    label_0044 :
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveLitePopularityTicketManager$b.class, "2")) {
          return;
       }
       this.a.f.c();
       return;
    }
}
