package com.yxcorp.gifshow.music.cloudmusic.history.b;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.data.HistoryMusicPageResponse$a;
import qvb.n0;
import com.yxcorp.gifshow.music.utils.m;
import zob.b;
import erd.o;
import com.yxcorp.gifshow.music.cloudmusic.history.a;
import t45.d;
import brd.z;
import zob.c;
import java.util.List;
import com.yxcorp.gifshow.music.data.HistoryMusicPageResponse;
import la6.b;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;

public class b extends f	// class@00201f
{
    public final int p;
    public final long q;
    public final String r;
    public List s;
    public boolean t;
    public final int u;

    public void b(int p0,long p1,String p2,boolean p3){
       super();
       this.u = 20;
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.t = p3;
    }
    public t I1(){
       HistoryMusicPageResponse$a obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HistoryMusicPageResponse$a();
       t ot = (this.s == null || this.K())? m.f(this.p, this.t): t.just(this.s);
       return ot.map(new b(this, obj)).flatMap(a.b).subscribeOn(d.c).map(new c(obj));
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(HistoryMusicPageResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             Music music = iterator.next();
             music.mCategoryId = this.q;
             music.mCategoryName = this.r;
          }
       }
       return;
    }
}
