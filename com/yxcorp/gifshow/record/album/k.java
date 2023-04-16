package com.yxcorp.gifshow.record.album.k;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.util.concurrent.atomic.AtomicReference;
import m8c.e;
import erd.a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k8c.s;
import u07.u;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment;
import crd.b;

public final class k implements g	// class@001730
{
    public final LocalAlbumFragmentV2 b;
    public final AtomicReference c;
    public final e d;
    public final a e;
    public final a f;

    public void k(LocalAlbumFragmentV2 p0,AtomicReference p1,e p2,a p3,a p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       k tf = this.f;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("ks://LocalAlbumFragmentV2", "checkDurationAndShare isOver:"+p0, objArray);
       if (p0.booleanValue()) {
          s os = new s(tb, tc, td, te, tf);
          LocalAlbumUtils.D(tb.getActivity(), v6);
       }else {
          tc.set(LocalAlbumUtils.C(td, true, false, tb.getActivity(), te, tf, tb.gh(), tb.Bh()));
          tb.C = null;
       }
       return;
    }
}
