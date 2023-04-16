package com.kuaishou.merchant.home2.feed.a;
import qvb.f;
import java.util.List;
import java.lang.String;
import qvb.a;
import com.kuaishou.merchant.home2.feed.model.LiveSlidePlayFeedPage;
import java.lang.Object;
import qvb.n0;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cx3.d;
import cx3.c;
import iy3.a;
import erd.o;

public class a extends f	// class@001784
{
    public String p;

    public void a(List p0,String p1){
       super();
       this.p = p1;
       this.b(p0);
       LiveSlidePlayFeedPage liveSlidePla = new LiveSlidePlayFeedPage();
       liveSlidePla.mItems = p0;
       liveSlidePla.mCursor = p1;
       this.S1(liveSlidePla);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c().a(this.p, 10).map(new a(this));
    }
    public boolean i(){
       return false;
    }
}
