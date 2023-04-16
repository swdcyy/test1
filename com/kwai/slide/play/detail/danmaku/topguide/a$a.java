package com.kwai.slide.play.detail.danmaku.topguide.a$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.slide.play.detail.danmaku.topguide.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import oq7.i;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class a$a extends m	// class@0017a6
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       i oi = this.c.l();
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoid(null, oi, i.class, "3")) {
          oi.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
