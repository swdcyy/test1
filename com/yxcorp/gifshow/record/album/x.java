package com.yxcorp.gifshow.record.album.x;
import erd.g;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import m8c.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import l8c.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kuaishou.perf.page.impl.d;
import k8c.a;
import q87.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import com.yxcorp.gifshow.record.album.w;
import com.yxcorp.gifshow.record.album.z;
import crd.b;
import crd.a;

public final class x implements g	// class@001786
{
    public final LocalAlbumListFragment b;
    public final e c;
    public final int d;

    public void x(LocalAlbumListFragment p0,e p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       x tb = this.b;
       x tc = this.c;
       x td = this.d;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0.booleanValue()) {
          tb.u.Ef(tc);
          tb.w = b;
       }else if(PatchProxy.isSupport(LocalAlbumListFragment.class) && PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(td), tb, LocalAlbumListFragment.class, "32")){
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, LocalAlbumListFragment.class, "30")) {
             d.d("postLoadToEditorMonitor").n();
             d.d("postLoadToEditorMonitor").l("local");
             d.d("postLoadToEditorMonitor").g("clickToPause");
          }
          Object[] objArray1 = new Object[b];
          String str = "LocalAlbumListFragment";
          a.D().w(str, "checkDurationAndEdit", objArray1);
          p0 = tb.getActivity();
          if (tc == null) {
             objArray = new Object[b];
             a.D().w(str, "edit project is null", objArray);
             tb.w = b;
          }else {
             LocalAlbumListFragment u = tb.u;
             String str1 = (u != null)? u.f8(): objArray;
             w ow = new w(tb, p0, tc, td, str1);
             tb.r.c(LocalAlbumUtils.r(tc).subscribe(v8, z.b));
          }
       }
       return;
    }
}
