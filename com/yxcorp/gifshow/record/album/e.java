package com.yxcorp.gifshow.record.album.e;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.record.album.f;
import lq.f;
import crd.b;

public final class e implements g	// class@00171e
{
    public final LocalAlbumFragmentV2 b;
    public final e c;

    public void e(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.Ef(tc);
       }else if(PatchProxy.applyVoidOneRefs(tc, tb, LocalAlbumFragmentV2.class, "25")){
          a.k(tb.getActivity(), LocalAlbumFragmentV2.I).subscribe(new f(tb, tc), f.b);
       }
       return;
    }
}
