package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatModel$a;
import erd.o;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.live.core.voiceparty.hat.VoicePartyHatInfo;
import java.util.ArrayList;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MicSeatHatModel$a implements o	// class@00169f
{
    public static final MicSeatHatModel$a b;

    static {
       MicSeatHatModel$a.b = new MicSeatHatModel$a();
    }
    public void MicSeatHatModel$a(){
       super();
    }
    public Object apply(Object p0){
       Map$Entry uEntry;
       String key;
       Set set = PatchProxy.applyOneRefs(p0, this, MicSeatHatModel$a.class, "1");
       if (set != PatchProxyResult.class) {
       }else {
          a.p(p0, "userHatList");
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             uEntry = p0.next();
             key = uEntry.getKey();
             if (uEntry.getValue().mIsDisplay != null) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          p0 = new ArrayList(linkedHashMa.size());
          Iterator iterator = linkedHashMa.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             VoicePartyHatInfo value = uEntry.getValue();
             p0.add(key);
          }
          set = CollectionsKt___CollectionsKt.L5(p0);
       }
       return set;
    }
}
