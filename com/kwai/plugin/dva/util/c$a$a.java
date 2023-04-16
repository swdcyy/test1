package com.kwai.plugin.dva.util.c$a$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.plugin.dva.util.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Byte;
import java.lang.Throwable;
import qj7.d;
import java.lang.StringBuilder;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.IllegalArgumentException;

public final class c$a$a	// class@001390
{

    public void c$a$a(){
       super();
    }
    public void c$a$a(u p0){
       super();
    }
    public final c$a a(String p0){
       char c;
       List obj = p0;
       char[] obj1 = PatchProxy.applyOneRefs(obj, this, c$a$a.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "string");
       char[] uocharArray = new char[]{'&'};
       obj = StringsKt__StringsKt.G4(p0, uocharArray, false, 0, 6, null);
       if (obj.size() != 6) {
          return null;
       }
       Object obj2 = obj.get(0);
       long l = Long.parseLong(obj.get(1));
       long l1 = Long.parseLong(obj.get(2));
       obj1 = new char[]{c};
       c = ',';
       List list = StringsKt__StringsKt.G4(obj.get(3), obj1, false, 0, 6, null);
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(list, i));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Long.valueOf(Long.parseLong(iterator.next())));
       }
       long[] olongArray = CollectionsKt___CollectionsKt.H5(uArrayList);
       char[] uocharArray1 = new char[]{c};
       List list1 = StringsKt__StringsKt.G4(obj.get(4), uocharArray1, false, 0, 6, null);
       uArrayList = new ArrayList(u.Y(list1, i));
       Iterator iterator1 = list1.iterator();
       while (iterator1.hasNext()) {
          uArrayList.add(Byte.valueOf(Byte.parseByte(iterator1.next())));
       }
       byte[] uobyteArray = CollectionsKt___CollectionsKt.z5(uArrayList);
       if (olongArray.length != uobyteArray.length) {
          return null;
       }
       c$a uoa = new c$a(obj2, l, l1, olongArray, uobyteArray, obj.get(5));
       return obj;
    }
    public final String b(c$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "identifier");
       char c = '&';
       boolean b = false;
       int i = 2;
       Object obj1 = null;
       if (!StringsKt__StringsKt.N2(p0.a(), c, b, i, obj1) && !StringsKt__StringsKt.N2(p0.b(), c, b, i, obj1)) {
          return p0.a()+c+p0.d()+c+p0.c()+c+ArraysKt___ArraysKt.Fg(p0.f(), ",", null, null, 0, null, null, 62, null)+c+ArraysKt___ArraysKt.Ag(p0.e(), ",", null, null, 0, null, null, 62, null)+c+p0.b();
       }
       throw new IllegalArgumentException(p0+" contains &");
    }
}
