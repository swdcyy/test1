package com.yxcorp.gifshow.v3.editor.cover.i;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.cover.j;
import java.lang.Object;
import brd.v;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.yxcorp.gifshow.v3.editor.cover.j$a;
import ppc.j;
import java.util.Objects;
import q14.n;
import erd.g;
import crd.b;
import brd.t;
import nwc.c;
import java.util.Map;
import java.lang.Class;
import t36.f;
import ppc.g;
import t36.f$a;
import faa.a;
import java.lang.String;
import q87.c;

public final class i implements g	// class@000e6e
{
    public final j b;
    public final boolean c;
    public final boolean d;

    public void i(j p0,boolean p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       i tb = this.b;
       Objects.requireNonNull(p0);
       tb.b(tb.b.d.subscribe(new j(p0), new n(p0)));
       f.p0(tb.b.e, c.class).s0(new g(this.c, this.d));
       Object[] objArray = new Object[0];
       a.D().w("CoverGenerateNSTask", "updateCover trigger", objArray);
    }
}
