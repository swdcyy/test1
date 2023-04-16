package com.yxcorp.gifshow.album.home.AlbumListFragment$d;
import erd.g;
import com.yxcorp.gifshow.album.home.AlbumListFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ec7.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class AlbumListFragment$d implements g	// class@001a04
{
    public final AlbumListFragment b;

    public void AlbumListFragment$d(AlbumListFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumListFragment$d.class, "1")) {
       }else {
          AlbumListFragment$d tb = this.b;
          a.h(p0, "list");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, AlbumListFragment.class, "8")) {
             a.q(p0, "data");
             Log.g("AlbumListFragmentTAG", "updateList, data.size="+p0.size());
             tb.j.S0(p0);
             tb.j.k0();
          }
          PatchProxy.onMethodExit(AlbumListFragment$d.class, "1");
       }
       return;
    }
}
