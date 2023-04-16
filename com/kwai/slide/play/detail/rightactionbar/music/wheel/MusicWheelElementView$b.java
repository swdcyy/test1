package com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.c;
import qp7.d;
import ss7.p;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;

public final class MusicWheelElementView$b extends m	// class@00186a
{
    public final MusicWheelElementView c;

    public void MusicWheelElementView$b(MusicWheelElementView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicWheelElementView$b.class, str)) {
          return;
       }
       a.p(p0, "v");
       p op = this.c.l();
       Objects.requireNonNull(op);
       if (!PatchProxy.applyVoidOneRefs(p0, op, p.class, str)) {
          a.p(p0, "view");
          op.a.onNext(p0);
       }
       return;
    }
}
