package com.yxcorp.plugin.search.utils.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import z6d.i;
import brd.t;
import cjd.e;
import erd.o;
import nfd.q0;
import i7d.h;
import erd.g;
import java.lang.Integer;
import z6d.l;
import z6d.k;
import nfd.o0;
import nfd.p0;

public class l	// class@0007ab
{

    public void l(){
       super();
    }
    public static b a(String p0,boolean p1,Runnable p2){
       i obj;
       if (PatchProxy.isSupport(l.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, l.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = b.a(-1335113050);
       int i = (p1)? 1: -1;
       return obj.h(p0, i, 1).map(new e()).subscribe(new q0(p2), h.b);
    }
    public static t b(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ol, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return k.b().d(p0, p1).map(new e());
    }
    public static b c(boolean p0,String p1,int p2,Runnable p3){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), p3, null, l.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b uob = (p0)? l.d(p1, p2).subscribe(new o0(p3)): l.b(p1, p2).subscribe(new p0(p3));
       return uob;
    }
    public static t d(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ol, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return k.b().c(p0, p1).map(new e());
    }
}
