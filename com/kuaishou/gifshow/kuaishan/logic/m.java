package com.kuaishou.gifshow.kuaishan.logic.m;
import erd.o;
import java.lang.String;
import java.util.List;
import n46.b;
import pr3.d;
import java.lang.Object;
import java.lang.Integer;
import brd.t;
import tkd.b;
import tkd.d;
import n46.g;
import com.kuaishou.gifshow.kuaishan.logic.i0;
import n46.a;
import n46.h;
import t45.d;
import brd.z;
import x80.q;
import erd.g;
import x80.r;
import com.kuaishou.gifshow.kuaishan.logic.s;

public final class m implements o	// class@001a60
{
    public final String b;
    public final List c;
    public final b d;
    public final d e;

    public void m(String p0,List p1,b p2,d p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       m tb = this.b;
       m tc = this.c;
       m td = this.d;
       m te = this.e;
       p0 = (!p0.size())? t.just(Integer.valueOf(100)): d.a(0x745a6c00).RU(tb, tc, i0.a, td).observeOn(d.a).doOnNext(new q(tc, te)).observeOn(d.c).doOnNext(new r(p0, tc)).map(s.b);
       return p0;
    }
}
