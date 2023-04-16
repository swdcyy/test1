package com.yxcorp.plugin.setting.helper.j$e;
import ok.h;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import gx5.d;
import brd.t;
import pgd.w;
import com.yxcorp.plugin.setting.helper.l;
import erd.g;
import crd.b;

public class j$e implements h	// class@0008c1
{
    public final String b;
    public final boolean c;
    public final SlipSwitchButton d;
    public final TextView e;
    public final j f;

    public void j$e(j p0,String p1,boolean p2,SlipSwitchButton p3,TextView p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j$e.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          d.a(-1188553266).zq(this.b, this.c).subscribe(new w(this, this.d, this.c, this.e), l.b);
          p0 = null;
       }
       return p0;
    }
}
