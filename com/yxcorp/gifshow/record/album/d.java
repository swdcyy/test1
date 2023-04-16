package com.yxcorp.gifshow.record.album.d;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.String;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.record.album.h;
import com.yxcorp.gifshow.record.album.n;
import crd.b;

public final class d implements g	// class@00171a
{
    public final LocalAlbumFragmentV2 b;
    public final e c;

    public void d(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.Ef(tc);
       }else {
          a.k(tb.getActivity(), LocalAlbumFragmentV2.I).subscribe(new h(tb, tc), n.b);
       }
       return;
    }
}
