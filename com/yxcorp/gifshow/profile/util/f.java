package com.yxcorp.gifshow.profile.util.f;
import java.lang.Object;
import java.io.File;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import o3c.l;
import okhttp3.MultipartBody$Part;
import ojd.e;
import dnc.a;
import com.yxcorp.gifshow.profile.model.response.a;
import erd.o;
import com.yxcorp.gifshow.profile.util.c;
import erd.g;
import cjd.e;
import com.yxcorp.gifshow.profile.util.d;
import java.lang.Boolean;
import z5c.i0;

public final class f	// class@0015d7
{

    public void f(){
       super();
    }
    public static t a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x37313f08;
       t ot = (p0 != null)? b.a(i).u(e.d("file", p0), a.a(p0.getAbsolutePath())).retryWhen(new a(232)).doOnError(c.b): b.a(i).n(true);
       return ot.map(new e()).doOnNext(d.b);
    }
    public static t b(String p0,boolean p1){
       l obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = b.a(0x37313f08);
       String str = (p1)? "1": "0";
       return obj.changePrivateOption(p0, str).map(new e()).doOnNext(new i0(p0, p1));
    }
}
