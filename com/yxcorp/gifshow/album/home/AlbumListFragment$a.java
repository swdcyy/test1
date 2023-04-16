package com.yxcorp.gifshow.album.home.AlbumListFragment$a;
import ja9.b;
import ia9.c;
import com.yxcorp.gifshow.album.home.AlbumListFragment;
import ga9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumListItemViewBinder;
import q79.d;
import r79.a;
import ga9.c;
import androidx.fragment.app.Fragment;
import android.view.View;
import ec7.a;
import jlb.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.IAlbumMainFragment$c;
import ia9.d;
import com.yxcorp.gifshow.album.home.AlbumListFragment$b;

public final class AlbumListFragment$a extends c implements b	// class@001a00
{
    public final AlbumListFragment j;

    public void AlbumListFragment$a(AlbumListFragment p0){
       this.j = p0;
       super();
       this.g = this;
    }
    public b T0(int p0){
       b uob;
       AlbumListFragment$a uoa = AlbumListFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (uob != PatchProxyResult.class) {
          label_0032 :
             return uob;
          }
       }
       uob = this.j.ch().s0().n().a(AbsAlbumListItemViewBinder.class, this.j, p0);
       goto label_0032 ;
    }
    public void V(c p0,View p1,int p2){
       if (PatchProxy.isSupport(AlbumListFragment$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AlbumListFragment$a.class, "2")) {
          return;
       }
       b uob = this.M0(p2);
       a.h(uob, "qAlbum");
       this.j.ch().X0(uob);
       AlbumListFragment i = this.j.i;
       if (i != null) {
          i.a(uob);
       }
       return;
    }
    public d W0(View p0,int p1,b p2){
       AlbumListFragment$b uob;
       if (PatchProxy.isSupport(AlbumListFragment$a.class)) {
          uob = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, AlbumListFragment$a.class, "3");
          if (uob != PatchProxyResult.class) {
          label_002f :
             return uob;
          }
       }
       a.q(p0, "itemRootView");
       a.q(p2, "viewBinder");
       uob = new AlbumListFragment$b(p0, p2);
       goto label_002f ;
    }
}
