package com.yxcorp.plugin.setting.helper.j$a;
import ok.h;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton;
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
import pgd.u;
import pgd.t;
import crd.b;

public class j$a implements h	// class@0008bd
{
    public final String b;
    public final boolean c;
    public final SlipSwitchButton d;
    public final boolean e;
    public final g f;
    public final j g;

    public void j$a(j p0,String p1,boolean p2,SlipSwitchButton p3,boolean p4,g p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          j$a td = this.d;
          d.a(-1188553266).jg(this.b, this.c).subscribe(new u(this, td, this.e, this.f), new t(this, td));
          p0 = null;
       }
       return p0;
    }
}
