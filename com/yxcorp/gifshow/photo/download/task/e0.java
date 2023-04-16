package com.yxcorp.gifshow.photo.download.task.e0;
import erd.g;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.io.File;
import java.lang.Object;
import x6b.j;
import java.util.Objects;
import x6b.j$a;
import com.yxcorp.gifshow.photo.download.task.m0;
import exc.b;
import java.lang.Class;
import lnc.pa;
import lnc.qa;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import java.lang.String;
import com.yxcorp.gifshow.photo.download.task.f;
import com.yxcorp.gifshow.photo.download.task.b;
import android.content.Context;
import android.app.Activity;
import brd.t;
import t45.d;
import brd.z;
import ixb.x1;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.l0;
import erd.r;
import ixb.y1;
import com.yxcorp.gifshow.photo.download.task.h0;
import ixb.v1;
import com.yxcorp.gifshow.photo.download.task.f0;
import com.yxcorp.gifshow.photo.download.task.d0;
import java.lang.Runnable;
import ixb.e2;
import erd.a;
import crd.b;

public final class e0 implements g	// class@000ef4
{
    public final n0 b;
    public final File c;
    public final boolean d;
    public final float e;

    public void e0(n0 p0,File p1,boolean p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       e0 tc = this.c;
       e0 td = this.d;
       Objects.requireNonNull(tb);
       p0 = p0.ml();
       m0 om0 = new m0(tb, p0);
       z a = d.a;
       z c = d.c;
       p0 = p0.a(qa.r(b.class).c5(), tc.getAbsolutePath(), tb.j.getAbsolutePath(), tb.c.getApplicationContext()).observeOn(a).map(new x1(tb, td, this.e)).filter(l0.b).observeOn(c).map(new y1(tc)).flatMap(new h0(tb, td, tc)).observeOn(a).map(new v1(tb)).observeOn(c);
       d0 uod0 = new d0(tb, tc, om0);
       tb.n[0] = p0.subscribe(f0.b, uod0, new e2(om0));
    }
}
