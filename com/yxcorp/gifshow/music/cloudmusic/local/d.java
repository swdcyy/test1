package com.yxcorp.gifshow.music.cloudmusic.local.d;
import qvb.f;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import voc.a0;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.local.b;
import io.reactivex.g;
import t45.d;
import brd.z;
import java.util.List;
import com.yxcorp.gifshow.music.cloudmusic.local.response.LocalMusicResponse;
import la6.b;
import java.util.Iterator;

public class d extends f	// class@00202c
{
    public long p;
    public String q;
    public a0 r;
    public static Music s;

    static {
       d.s = new Music();
    }
    public void d(long p0,String p1,a0 p2){
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new b(this)).subscribeOn(d.c).observeOn(d.a);
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(LocalMusicResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             Music music = iterator.next();
             music.mCategoryId = this.p;
             music.mCategoryName = this.q;
          }
       }
       return;
    }
}
