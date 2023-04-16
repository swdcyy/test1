package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicAlbumBottomFragment;
import w69.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import t36.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.a;
import ag6.a;
import asc.a;
import java.util.HashMap;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicAlbumBottomFragment$a;

public final class ImportMusicAlbumBottomFragment extends BaseFragment implements e0	// class@0010e9
{
    public final f j;
    public a k;
    public HashMap l;

    public void ImportMusicAlbumBottomFragment(){
       super(null, null, null, null, 15, null);
       this.j = super();
    }
    public float Se(){
       Object obj = PatchProxy.apply(null, this, ImportMusicAlbumBottomFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)a1.d(0x7f070497);
    }
    public Fragment b(){
       return this;
    }
    public boolean k3(){
       return false;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImportMusicAlbumBottomFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d00a7, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ImportMusicAlbumBottomFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       ImportMusicAlbumBottomFragment tk = this.k;
       if (tk != null) {
          tk.C();
       }
       if (!PatchProxy.applyVoid(null, this, ImportMusicAlbumBottomFragment.class, "7")) {
          tk = this.l;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImportMusicAlbumBottomFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       a uoa = new a(this.j, this, p0);
       this.k = uoa;
       uoa.B();
       return;
    }
    public IAlbumMainFragment$b t4(){
       Object obj = PatchProxy.apply(null, this, ImportMusicAlbumBottomFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImportMusicAlbumBottomFragment$a(this);
    }
}
