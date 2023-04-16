package com.kuaishou.live.core.show.floatingwindow.m$d;
import o07.d$a;
import com.kuaishou.live.core.show.floatingwindow.m;
import android.view.Window;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import va1.n0;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import tkd.b;
import tkd.d;
import os5.l;

public class m$d implements d$a	// class@000b8e
{
    public final Window b;
    public int c;
    public final m d;

    public void m$d(m p0,Window p1){
       this.d = p0;
       super();
       this.c = -1;
       this.b = p1;
    }
    public void a(int p0){
       m$d uod = m$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       m$d td = this.d;
       int i = (((n0.e() - n.A(a.a().a())) - p0) - a1.d(0x7f07076f)) - td.h;
       m g = td.g;
       if (i < g) {
          this.c = g;
          d.a(-1492894991).rE(this.d.f, i);
       }
       return;
    }
    public void b(int p0){
       m$d uod = m$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       if (this.c > null) {
          d.a(-1492894991).rE(this.d.f, this.c);
          this.c = -1;
       }
       return;
    }
}
