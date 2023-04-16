package com.kwai.middleware.azeroth.sdk.SDKHandler$c;
import erd.o;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import trd.t0;
import com.kwai.middleware.azeroth.api.AzerothApi;
import java.util.Objects;
import qrd.p;
import e97.a;
import brd.t;

public final class SDKHandler$c implements o	// class@000f19
{
    public final SDKHandler b;

    public void SDKHandler$c(SDKHandler p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a.q(p0, "it");
       Objects.requireNonNull(AzerothApi.b);
       return AzerothApi.a.getValue().a(t0.o0(p0, new Pair("apiInvokeTiming", this.b.e)));
    }
}
