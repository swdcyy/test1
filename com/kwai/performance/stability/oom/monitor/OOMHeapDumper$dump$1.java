package com.kwai.performance.stability.oom.monitor.OOMHeapDumper$dump$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import kh7.c$a;
import qrd.l1;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.google.gson.JsonObject;

public final class OOMHeapDumper$dump$1 extends Lambda implements l	// class@001245
{
    public final String $uuid;

    public void OOMHeapDumper$dump$1(String p0){
       this.$uuid = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c$a p0){
       a.p(p0, "$receiver");
       OOMHeapDumper$dump$1 t$uuid = this.$uuid;
       if (t$uuid != null) {
          Objects.requireNonNull(p0);
          a.p("logUUID", "key");
          a.p(t$uuid, "value");
          p0.a.c0("logUUID", t$uuid);
       }
       return;
    }
}
