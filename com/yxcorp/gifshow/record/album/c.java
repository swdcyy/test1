package com.yxcorp.gifshow.record.album.c;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.Float;
import java.io.File;
import brd.t;
import com.yxcorp.gifshow.encode.s0;
import k8c.k;
import k8c.m;
import crd.b;

public final class c implements g	// class@001716
{
    public final LocalAlbumFragmentV2 b;

    public void c(LocalAlbumFragmentV2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "save album progress: "+p0.second, objArray);
       tb.Dh((int)(p0.second.floatValue() * 100.00f));
       p0 = p0.first;
       if (p0 != null) {
          s0.A(p0).subscribe(new k(tb), new m(tb));
       }
       return;
    }
}
