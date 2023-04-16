package com.yxcorp.gifshow.v3.previewer.ktv.o;
import brd.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.app.Activity;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Object;
import brd.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.a;
import t45.d;
import brd.z;
import mwc.b0;
import erd.a;
import mwc.a0;
import mwc.c0;
import com.yxcorp.gifshow.v3.previewer.ktv.m;
import com.yxcorp.gifshow.v3.previewer.ktv.n;
import erd.g;

public class o implements e	// class@0015ca
{
    public Bitmap b;
    public String c;
    public String d;
    public String e;
    public a f;
    public final c g;
    public final Activity h;
    public final KtvInfo i;
    public final boolean j;

    public void o(c p0,Activity p1,KtvInfo p2,boolean p3){
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       super();
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       z a = d.a;
       a uoa = a.g().s(a).b(a.q(new b0(this, this.g, this.h, this.i))).s(d.c).b(a.q(new a0(this))).s(a);
       uoa.b(a.q(new c0(this, this.g, this.j))).l(m.b).m(n.b).a(p0);
       return;
    }
}
