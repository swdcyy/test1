package com.yxcorp.gifshow.record.album.b2;
import erd.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import k8c.a;
import q87.c;
import lq.i;
import lq.a;
import brd.t;
import k8c.f1;
import com.yxcorp.gifshow.record.album.h0;
import erd.g;
import crd.b;

public final class b2 implements a	// class@001711
{
    public final GifshowActivity b;
    public final Intent c;
    public final c d;
    public final boolean e;

    public void b2(GifshowActivity p0,Intent p1,c p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       b2 tb = this.b;
       b2 tc = this.c;
       b2 td = this.d;
       b2 te = this.e;
       if (!PatchProxy.isSupport2(LocalAlbumUtils.class, "44") || !PatchProxy.applyVoidFourRefsWithListener(tb, tc, td, Boolean.valueOf(te), null, LocalAlbumUtils.class, "44")) {
          Object[] objArray = new Object[0];
          a.D().w("LocalAlbumUtils", "doOnComplete discardCurrentPostSession", objArray);
          i oi = i.V();
          oi.b0(te);
          oi.Z(td);
          i.m().p().init().subscribe(new f1(tc), h0.b);
          tb.startActivityForResult(tc, 257);
          PatchProxy.onMethodExit(LocalAlbumUtils.class, "44");
       }
       return;
    }
}
