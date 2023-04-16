package com.yxcorp.gifshow.widget.h;
import java.lang.Object;
import com.yxcorp.gifshow.widget.h$a;
import e17.i$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.gifshow.widget.h$b;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.e;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.yxcorp.gifshow.widget.f;
import com.yxcorp.gifshow.widget.g;
import e17.i$e;
import tyc.s;
import e17.i$f;
import e17.i;

public class h	// class@00198a
{

    public void h(){
       super();
    }
    public static i$b a(int p0,h$a p1,int p2){
       Object[] obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), null, h.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[0];
       return h.d(f.m(p0, obj), p1, null, p2, 0, false, false);
    }
    public static i$b b(int p0,h$a p1,int p2,int p3){
       Object[] obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), null, h.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[0];
       return h.d(f.m(p0, obj), p1, null, p2, p3, false, false);
    }
    public static i$b c(String p0,h$a p1,int p2,int p3){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, h.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.d(p0, p1, null, p2, p3, false, false);
    }
    public static i$b d(String p0,h$a p1,h$b p2,int p3,int p4,boolean p5,boolean p6){
       i$b obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, null, oh, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new i$b();
       obj.o(p3);
       obj.y(p0);
       obj.r(e.a);
       obj.u(f.a);
       obj.s(R.layout.arg_RES_7f0d0126);
       g og = new g(p4, p5, p2, p6, p1);
       obj.A(R.layout.arg_RES_7f0d0126);
       obj.B(new s(p1));
       return obj;
    }
    public static void e(int p0,h$a p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, oh, "1")) {
          return;
       }
       i.z(h.a(p0, p1, 3000));
       return;
    }
}
