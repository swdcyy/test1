package com.kwai.sdk.eve.internal.capsule.EveCapsule;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import trd.t0;
import com.kwai.sdk.eve.internal.capsule.EveCapsule$gatherFunc$1;

public final class EveCapsule	// class@00146c
{
    public l a;
    public Map b;
    public p c;

    public void EveCapsule(l p0){
       a.p(p0, "finder");
       super();
       this.a = p0;
       this.b = t0.J0(t0.z());
       this.c = new EveCapsule$gatherFunc$1(this);
    }
}
