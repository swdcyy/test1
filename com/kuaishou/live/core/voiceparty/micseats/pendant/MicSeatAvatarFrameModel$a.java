package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameModel$a;
import erd.o;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import su2.b;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MicSeatAvatarFrameModel$a implements o	// class@00164d
{
    public final boolean b;

    public void MicSeatAvatarFrameModel$a(boolean p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Set set = PatchProxy.applyOneRefs(p0, this, MicSeatAvatarFrameModel$a.class, "1");
       if (set != patchProxyRe) {
       }else {
          a.p(p0, "avatarFrameInfoList");
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             Map$Entry uEntry = p0.next();
             b value = uEntry.getValue();
             boolean b = false;
             if (this.b == null) {
                List list = value.a();
                obj = (list == null || list.isEmpty())? 1: null;
                if (!obj) {
                label_0081 :
                   b = true;
                }
             }else {
                Objects.requireNonNull(value);
                b obj1 = PatchProxy.apply(null, value, b.class, "1");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = value.c;
                   MicSeatAvatarFrameModel$a uoa = (obj1 == null || obj1.isEmpty())? 1: null;
                   if (uoa) {
                      value = value.b;
                      obj = (value != 1 && (value != 2 && value != 3))? null: 1;
                      if (obj) {
                         goto label_0081 ;
                      }
                   }else {
                      goto label_0081 ;
                   }
                }
             }
             if (b) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          p0 = new ArrayList(linkedHashMa.size());
          Iterator iterator = linkedHashMa.entrySet().iterator();
          while (iterator.hasNext()) {
             p0.add(iterator.next().getKey());
          }
          set = CollectionsKt___CollectionsKt.L5(p0);
       }
       return set;
    }
}
