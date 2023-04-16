package com.kuaishou.live.livestage.dataflow.SnowStreamerDataFlow$invoke$destroyOldStreamer$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import oe3.i;
import msd.l;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.livestage.videopipe.streamer.SnowEngineStreamer;
import java.lang.StringBuilder;

public final class SnowStreamerDataFlow$invoke$destroyOldStreamer$1 extends Lambda implements a	// class@000be6
{
    public final Ref$ObjectRef $latestStreamer;
    public final l $log;
    public final i $snowStreamerPipeRecorder;

    public void SnowStreamerDataFlow$invoke$destroyOldStreamer$1(Ref$ObjectRef p0,i p1,l p2){
       this.$latestStreamer = p0;
       this.$snowStreamerPipeRecorder = p1;
       this.$log = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final l1 invoke(){
       Object[] objArray = null;
       SnowStreamerDataFlow$invoke$destroyOldStreamer$1 obj = PatchProxy.apply(objArray, this, SnowStreamerDataFlow$invoke$destroyOldStreamer$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$latestStreamer;
       Ref$ObjectRef element = obj.element;
       if (element != null) {
          obj.element = objArray;
          this.$snowStreamerPipeRecorder.b();
          element.release();
          this.$log.invoke("[SnowStreamer] destroySnowStreamer "+element);
          objArray = l1.a;
       }
       return objArray;
    }
}
