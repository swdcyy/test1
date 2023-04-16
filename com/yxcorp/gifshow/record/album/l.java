package com.yxcorp.gifshow.record.album.l;
import a17.b$b;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import k8c.t;
import com.yxcorp.gifshow.record.album.t;
import erd.g;
import crd.b;

public final class l implements b$b	// class@001733
{
    public final LocalAlbumFragmentV2 a;
    public final e b;

    public void l(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(c p0,View p1,int p2){
       l ta = this.a;
       l tb = this.b;
       Objects.requireNonNull(ta);
       t ot = new t(ta, tb);
       tb.a().observeOn(a.c()).subscribe(ot, t.b);
    }
}
