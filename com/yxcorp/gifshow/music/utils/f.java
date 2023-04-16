package com.yxcorp.gifshow.music.utils.f;
import java.util.ArrayList;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import upb.c;
import upb.e;
import com.kuaishou.android.model.music.MusicType;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import kqb.l;
import erd.g;
import kqb.m;
import com.yxcorp.gifshow.music.utils.f$a;
import java.util.List;

public class f	// class@002093
{
    public static final List a;

    static {
       f.a = new ArrayList();
    }
    public void f(){
       super();
    }
    public static t a(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.c(p0, false, false);
    }
    public static t b(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.c(p0, true, false);
    }
    public static t c(Music p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, f.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          return e.a().e(p0.mId, p0.mType.mValue).map(new e()).observeOn(d.a).doOnNext(new l(p0, p2));
       }else {
          return e.a().d(p0.mId, p0.mType.mValue).map(new e()).observeOn(d.a).doOnNext(new m(p0, p2));
       }
    }
    public static void d(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "6")) {
          return;
       }
       f.a.add(p0);
       return;
    }
    public static void e(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "7")) {
          return;
       }
       f.a.remove(p0);
       return;
    }
}
