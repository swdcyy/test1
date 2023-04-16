package com.kuaishou.live.gzone.barrage.n;
import erd.g;
import com.kuaishou.live.gzone.barrage.p;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import oq5.c;
import jv1.b;
import b53.d;
import ok.x;
import p91.m;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.gzone.barrage.o;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class n implements g	// class@001c41
{
    public final p b;

    public void n(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, p.class, "4")) {
       }else {
          tb.s.x.W0(tb.B, false);
          tb.X7(d.a.get().a(tb.s.Z2.getLiveStreamId()).map(new e()).subscribe(new o(tb), Functions.e));
       }
       return;
    }
}
