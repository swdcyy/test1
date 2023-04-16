package com.yxcorp.plugin.setting.helper.j$b;
import ok.h;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.String;
import android.widget.TextView;
import erd.g;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import gx5.d;
import brd.t;
import pgd.v;
import com.yxcorp.plugin.setting.helper.k;
import crd.b;

public class j$b implements h	// class@0008be
{
    public final String b;
    public final boolean c;
    public final boolean d;
    public final TextView e;
    public final g f;
    public final j g;

    public void j$b(j p0,String p1,boolean p2,boolean p3,TextView p4,g p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j$b.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          v ov = new v(this, this.d, this.b, this.e, this.c, this.f);
          d.a(-1188553266).jg(this.b, this.c).subscribe(v7, k.b);
          p0 = null;
       }
       return p0;
    }
}
