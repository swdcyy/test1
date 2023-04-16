package com.yxcorp.gifshow.v3.previewer.r;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import lq.i;
import lq.a;
import lnc.h6;
import java.util.Objects;
import java.lang.System;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import lnc.h6$b;
import java.util.concurrent.Future;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.functions.Functions$u;
import erd.a;
import brd.a;
import t45.d;
import brd.z;
import lnc.i6;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import ird.a;
import kotlin.jvm.internal.a;
import brd.t;
import brd.w;

public final class r implements o	// class@00160a
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final Object apply(Object p0){
       h6 oh6 = i.m().p().v();
       Objects.requireNonNull(oh6);
       long l = System.currentTimeMillis();
       oh6 = oh6.a;
       ArrayList uArrayList = new ArrayList(u.Y(oh6, 10));
       Iterator iterator = oh6.iterator();
       while (iterator.hasNext()) {
          h6$b uob = iterator.next();
          Future uFuture = uob.a();
          a.c(uFuture, "future is null");
          uArrayList.add(a.q(new Functions$u(uFuture)).w(d.c).l(new i6(uob, l)));
       }
       a.c(uArrayList, "sources is null");
       a uoa = a.e(new CompletableMergeIterable(uArrayList));
       a.o(uoa, "Completable.merge\(\n     бн   \)\n          }\n      }\)");
       return uoa.s(d.a).d(t.just(p0));
    }
}
