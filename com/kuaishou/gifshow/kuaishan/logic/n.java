package com.kuaishou.gifshow.kuaishan.logic.n;
import erd.o;
import java.util.List;
import java.lang.String;
import n46.b;
import pr3.d;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import h90.e;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.models.QMedia;
import tkd.b;
import tkd.d;
import n46.g;
import com.kuaishou.gifshow.kuaishan.utils.e;
import n46.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h90.a;
import com.kuaishou.gifshow.kuaishan.logic.i0;
import n46.a;
import brd.t;
import t45.d;
import brd.z;
import x80.s0;
import erd.g;
import x80.o;
import x80.b0;

public final class n implements o	// class@001a63
{
    public final List b;
    public final List c;
    public final String d;
    public final b e;
    public final d f;

    public void n(List p0,List p1,String p2,b p3,d p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       n on = this;
       n b = on.b;
       n c = on.c;
       n d = on.d;
       n e = on.e;
       n f = on.f;
       i0$b uob = p0;
       e r = uob.c.r;
       Objects.requireNonNull(r);
       e s = uob.c.s;
       Objects.requireNonNull(s);
       String str = "."+s;
       int i = (uob.b.isImage())? 1: 2;
       int i1 = 0x745a6c00;
       String str1 = d.a(i1).T30(uob.b, r, str, 1280, 1280, e.h());
       String str2 = (TextUtils.n(uob.c.s, "zip"))? e.o(str1): null;
       b.add(uob.b().a);
       c.add("");
       return d.a(i1).Cz(d, r, uob.b().a, str1, i, i0.a, e, c, b, "").observeOn(d.a).doOnNext(new s0(f, uob)).observeOn(d.c).doOnNext(new o(str2, uob)).map(new b0(uob));
    }
}
