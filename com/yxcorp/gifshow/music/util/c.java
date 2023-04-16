package com.yxcorp.gifshow.music.util.c;
import jqb.d;
import java.lang.Object;
import java.util.Stack;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.gifshow.music.util.b;
import erd.r;
import jqb.e;
import erd.a;
import com.kwai.robust.PatchProxyResult;
import brd.y;
import jqb.f;

public class c implements d	// class@002086
{
    public Stack a;
    public boolean b;

    public void c(){
       super();
       this.a = new Stack();
       this.b = true;
    }
    public void a(GifshowActivity p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       this.a.push(Integer.valueOf(p0.hashCode()));
       t ot = p0.m().filter(b.b).doOnDispose(new e(this));
       c ta = this.a;
       f uof = PatchProxy.applyOneRefs(ta, this, uoc, "2");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(this, ta);
       }
       ot.subscribe(uof);
       return;
    }
}
