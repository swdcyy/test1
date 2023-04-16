package com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback$mCallbacks$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Objects;
import java.util.Collection;
import nsd.s0;

public final class VideoAutoPlayerStateRecordCallback	// class@001bf2
{
    public final p a;

    public void VideoAutoPlayerStateRecordCallback(){
       super();
       this.a = s.c(VideoAutoPlayerStateRecordCallback$mCallbacks$2.INSTANCE);
    }
    public final void a(VideoAutoPlayerStateRecordCallback$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoAutoPlayerStateRecordCallback.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       this.b().add(p0);
       return;
    }
    public final List b(){
       Object obj = PatchProxy.apply(null, this, VideoAutoPlayerStateRecordCallback.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, VideoAutoPlayerStateRecordCallback.class, "5")) {
          return;
       }
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, VideoAutoPlayerStateRecordCallback.class, "4")) {
          return;
       }
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void e(VideoAutoPlayerStateRecordCallback$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoAutoPlayerStateRecordCallback.class, "3")) {
          return;
       }
       List list = this.b();
       Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       s0.a(list).remove(p0);
       return;
    }
}
