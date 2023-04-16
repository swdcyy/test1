package com.kwai.logger.upload.retrieve.azeroth.a;
import com.kwai.logger.upload.retrieve.azeroth.g;
import com.kwai.logger.upload.retrieve.azeroth.f;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.String;
import t87.d;
import java.util.Iterator;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Task;
import java.lang.Iterable;
import brd.t;
import com.kwai.logger.upload.retrieve.azeroth.e;
import erd.r;
import brd.a0;
import java.util.Queue;
import w87.j;
import w87.h;
import java.lang.Runnable;
import f97.a;

public final class a implements g	// class@000d33
{
    public final f a;

    public void a(f p0){
       this.a = p0;
    }
    public final void a(List p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null && !p0.isEmpty()) {
          String str = "ObiwanUploader";
          d.a(str, "LogDispatcher:appendTask size:"+p0.size());
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             d.a(str, "LogDispatcher:appendTask task:"+iterator.next().taskId);
          }
          ta.a.addAll(t.fromIterable(p0).filter(e.b).toList().e());
          ta.c();
          j oj = j.a();
          f a = ta.a;
          if (oj.p(oj.a)) {
             a.a(new h(oj, a, p0));
          }
       }
       return;
    }
}
