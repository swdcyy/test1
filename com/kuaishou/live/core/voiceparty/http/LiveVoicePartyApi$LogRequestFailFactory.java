package com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory;
import retrofit2.b$a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$a;
import nsd.u;
import o56.a;
import java.lang.Integer;
import java.lang.Object;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.lang.String;
import retrofit2.a;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$c;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$d;
import retrofit2.b;
import msd.p;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$e;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import retrofit2.q;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.t;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$get$1;
import brd.h;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$get$2;
import brd.a0;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi$LogRequestFailFactory$get$3;

public final class LiveVoicePartyApi$LogRequestFailFactory extends b$a	// class@001507
{
    public static final boolean a;
    public static final Map b;
    public static final LiveVoicePartyApi$LogRequestFailFactory$a c;

    static {
       u ou = null;
       LiveVoicePartyApi$LogRequestFailFactory.c = new LiveVoicePartyApi$LogRequestFailFactory$a(ou);
       boolean b = a.d();
       LiveVoicePartyApi$LogRequestFailFactory.a = b;
       if (b) {
          Map map = s0.k(r0.a("n/live/author/voiceParty/playType/switch", Integer.valueOf(0x13930)));
          ou = new LinkedHashMap(s0.j(map.size()));
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             ou.put("/rest/"+uEntry.getKey(), uEntry.getValue());
          }
       }
       LiveVoicePartyApi$LogRequestFailFactory.b = ou;
    }
    public void LiveVoicePartyApi$LogRequestFailFactory(){
       super();
    }
    public final g a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyApi$LogRequestFailFactory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyApi$LogRequestFailFactory$b(p0);
    }
    public final g b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyApi$LogRequestFailFactory.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyApi$LogRequestFailFactory$c(p0);
    }
    public final g c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyApi$LogRequestFailFactory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyApi$LogRequestFailFactory$d(p0);
    }
    public final b d(b p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveVoicePartyApi$LogRequestFailFactory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyApi$LogRequestFailFactory$e(p0, p1);
    }
    public b get(Type p0,Annotation[] p1,q p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoicePartyApi$LogRequestFailFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "returnType");
       a.p(p1, "annotations");
       a.p(p2, "retrofit");
       b uob = p2.d(this, p0, p1);
       Objects.requireNonNull(uob, "null cannot be cast to non-null type retrofit2.CallAdapter<kotlin.Any, kotlin.Any>");
       Class rawType = b$a.getRawType(p0);
       if (t.class.isAssignableFrom(rawType)) {
          uob = this.d(uob, new LiveVoicePartyApi$LogRequestFailFactory$get$1(this));
       }else if(h.class.isAssignableFrom(rawType)){
          uob = this.d(uob, new LiveVoicePartyApi$LogRequestFailFactory$get$2(this));
       }else if(a0.class.isAssignableFrom(rawType)){
          uob = this.d(uob, new LiveVoicePartyApi$LogRequestFailFactory$get$3(this));
       }
       return uob;
    }
}
