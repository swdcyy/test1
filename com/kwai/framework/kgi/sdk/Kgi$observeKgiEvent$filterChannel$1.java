package com.kwai.framework.kgi.sdk.Kgi$observeKgiEvent$filterChannel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import p76.d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import p76.g;
import java.lang.Integer;
import p76.f$c;

public final class Kgi$observeKgiEvent$filterChannel$1 extends Lambda implements l	// class@001581
{
    public final List $channelIds;
    public final l $eventConsumer;

    public void Kgi$observeKgiEvent$filterChannel$1(List p0,l p1){
       this.$channelIds = p0;
       this.$eventConsumer = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Kgi$observeKgiEvent$filterChannel$1.class, "1")) {
          return;
       }
       a.p(p0, "kgiEvent");
       if (p0 instanceof g && this.$channelIds.contains(Integer.valueOf(p0.b))) {
          this.$eventConsumer.invoke(p0);
       }else if(p0 instanceof f$c && this.$channelIds.contains(Integer.valueOf(p0.a))){
          this.$eventConsumer.invoke(p0);
       }
       return;
    }
}
