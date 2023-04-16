package com.yxcorp.gifshow.camera.record.album.slideup.list.c;
import wb9.l;
import java.lang.Object;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o79.i;
import java.lang.Number;
import java.lang.System;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import java.util.ArrayList;
import x79.e;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import wb9.c;
import erd.g;
import t45.d;
import brd.z;

public class c implements l	// class@001cd6
{

    public void c(){
       super();
    }
    public t a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, i.class, "20");
       long l = (obj != patchProxyRe)? obj.longValue(): System.currentTimeMillis();
       AlbumLimitOption uAlbumLimitO = o.a().d();
       uAlbumLimitO.w("post_album_banner");
       ArrayList uArrayList = uAlbumLimitO.c();
       uArrayList.add(l.a);
       uAlbumLimitO.z(uArrayList);
       return e.f().g(a.a().a(), 2, 50, uAlbumLimitO).buffer(50).doOnNext(new c(l)).observeOn(d.a);
    }
}
