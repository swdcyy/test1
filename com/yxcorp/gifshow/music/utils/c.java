package com.yxcorp.gifshow.music.utils.c;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kqb.g;
import io.reactivex.g;
import java.lang.Long;
import t45.d;
import brd.z;
import kqb.h;
import erd.o;

public class c	// class@00208f
{

    public void c(){
       super();
    }
    public static t a(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new g(p0));
    }
    public static t b(Music p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.a(p0).observeOn(d.c).flatMap(new h(p0, p1));
    }
}
