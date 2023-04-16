package com.yxcorp.gifshow.easteregg.core.FireworkScriptGroupConverter;
import baa.i;
import java.lang.Object;
import android.content.Context;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import vfa.b;
import daa.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import rfa.a;
import java.util.List;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.easteregg.core.FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import com.yxcorp.gifshow.easteregg.core.FireworkScriptGroupConverter$a;
import java.util.Comparator;
import java.util.Collection;
import vfa.a;

public final class FireworkScriptGroupConverter implements i	// class@001acc
{
    public static final FireworkScriptGroupConverter b;

    static {
       FireworkScriptGroupConverter.b = new FireworkScriptGroupConverter();
    }
    public void FireworkScriptGroupConverter(){
       super();
    }
    public b a(Context p0,PokeGroup p1){
       return this.b(p0, p1);
    }
    public b b(Context p0,j p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, FireworkScriptGroupConverter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "pokeGroup");
       obj = new a();
       b uob = new b();
       uob.b = p1.repeatCount;
       long l = (!p1.a())? 300: p1.a();
       uob.c = l;
       List list = SequencesKt___SequencesKt.V2(SequencesKt___SequencesKt.D2(SequencesKt___SequencesKt.g1(CollectionsKt___CollectionsKt.l1(p1.b()), new FireworkScriptGroupConverter$convert$$inlined$apply$lambda$1(p1, p0, obj)), new FireworkScriptGroupConverter$a()));
       int i = 1;
       if (!(list.isEmpty() ^ i) || (list.size() <= i || (!list.get(i).a && !PatchProxy.applyVoidOneRefs(list, obj, a.class, "6")))) {
          for (int i1 = 0; i1 < list.size(); i1++) {
             l = (long)i1 * 300;
             list.get(i1).a = l;
          }
       }
    label_0093 :
       if (!PatchProxy.applyVoidOneRefs(list, uob, b.class, "3")) {
          uob.a.addAll(list);
       }
       return uob;
    }
}
