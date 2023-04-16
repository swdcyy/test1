package com.yxcorp.gifshow.record.album.j;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.io.File;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.record.album.a2;
import io.reactivex.g;
import brd.t;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.record.album.f0;

public final class j implements g	// class@00172d
{
    public final LocalAlbumFragmentV2 b;
    public final AtomicReference c;

    public void j(LocalAlbumFragmentV2 p0,AtomicReference p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j tc = this.c;
       GifshowActivity activity = this.b.getActivity();
       b uob = PatchProxy.applyTwoRefs(p0, activity, null, LocalAlbumUtils.class, "27");
       if (uob != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("LocalAlbumUtils", "doShareFile file:"+p0, objArray);
          uob = t.create(new a2(p0, activity)).subscribe(Functions.d(), f0.b);
       }
       tc.set(uob);
       return;
    }
}
