package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.Integer;

public final class CoronaPlayPayPauseElement$h implements PopupInterface$h	// class@0013b3
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$h(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$h.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       CoronaPlayPayPauseElement x = this.b.x;
       if (x != null) {
          x.onNext(Boolean.TRUE);
       }
       CoronaPlayPayPauseElement$h tb = this.b;
       e player = CoronaPlayPayPauseElement.o0(tb).getPlayer();
       a.o(player, "mPlayModule.player");
       tb.v = player.isPlaying();
       if (this.b.v != null) {
          a.d().k(new PlayEvent(CoronaPlayPayPauseElement.n0(this.b), PlayEvent$Status.PAUSE, 521));
       }
       return;
    }
    public void H(c p0,int p1){
       CoronaPlayPayPauseElement$h oh = CoronaPlayPayPauseElement$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       CoronaPlayPayPauseElement x = this.b.x;
       if (x != null) {
          x.onNext(Boolean.FALSE);
       }
       if (this.b.v != null) {
          a.d().k(new PlayEvent(CoronaPlayPayPauseElement.n0(this.b), PlayEvent$Status.RESUME, 521));
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
