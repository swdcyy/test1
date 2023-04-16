package com.yxcorp.gifshow.record.album.h;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import m8c.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k8c.a;
import q87.c;
import brd.t;
import java.util.Locale;
import lnc.a1;
import com.yxcorp.gifshow.record.album.v;
import erd.a;
import com.yxcorp.gifshow.record.album.c;
import k8c.l;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class h implements g	// class@001727
{
    public final LocalAlbumFragmentV2 b;
    public final e c;

    public void h(LocalAlbumFragmentV2 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          if (!PatchProxy.applyVoidOneRefs(tc, tb, LocalAlbumFragmentV2.class, "9")) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("ks://LocalAlbumFragmentV2", "saveAlbum", objArray);
             boolean b = true;
             t ot = tb.Ch(tc, b);
             if (ot != null) {
                b = new Object[b];
                b[i] = a1.p(0x7f100f18);
                tb.Hh(String.format(Locale.US, "%s ", b), "progress");
                tb.C = ot.doOnDispose(v.b).subscribe(new c(tb), new l(tb));
             }
          }
       }else {
          PermissionUtils.o(tb.getActivity(), a1.p(R.string.arg_RES_7f104ab5));
       }
       return;
    }
}
