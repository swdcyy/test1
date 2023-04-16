package com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter$a;
import cn7.i;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import com.kwai.sdk.eve.internal.datacenter.components.DataStreamCenter;
import gn7.m;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import cn7.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cn7.f;

public final class DataStreamCenter$a implements i	// class@0014b4
{
    public final LabeledRunnable a;
    public final DataStreamCenter b;
    public final m c;
    public final PublishSubject d;

    public void DataStreamCenter$a(LabeledRunnable p0,DataStreamCenter p1,m p2,PublishSubject p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DataStreamCenter$a.class, "2")) {
          return;
       }
       a.p(p0, "labeled");
       p0.c = this.b.b(this.a);
       this.d.onNext(this.c);
       this.d.onComplete();
       PatchProxy.onMethodExit(DataStreamCenter$a.class, "2");
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DataStreamCenter$a.class, "1")) {
          return;
       }
       a.p(p0, "labeled");
       p0.b = this.b.b(this.a);
       PatchProxy.onMethodExit(DataStreamCenter$a.class, "1");
       return;
    }
}
