package com.yxcorp.plugin.setting.helper.a;
import ok.h;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.TextView;
import erd.g;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import tkd.b;
import tkd.d;
import gx5.d;
import brd.t;
import pgd.k;
import pgd.i;
import crd.b;

public final class a implements h	// class@0008b4
{
    public final j b;
    public final String c;
    public final boolean d;
    public final SlipSwitchButton e;
    public final boolean f;
    public final TextView g;
    public final g h;

    public void a(j p0,String p1,boolean p2,SlipSwitchButton p3,boolean p4,TextView p5,g p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       a td = this.d;
       a te = this.e;
       Objects.requireNonNull(tb);
       k ok = new k(tb, te, this.f, this.g, this.h, td);
       d.a(-1188553266).jg(this.c, td).subscribe(v9, new i(tb, te));
       return null;
    }
}
