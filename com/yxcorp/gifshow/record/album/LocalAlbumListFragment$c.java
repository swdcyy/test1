package com.yxcorp.gifshow.record.album.LocalAlbumListFragment$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import android.view.ViewGroup;

public class LocalAlbumListFragment$c extends RecyclerView$r	// class@0016ff
{
    public final LocalAlbumListFragment a;

    public void LocalAlbumListFragment$c(LocalAlbumListFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       LocalAlbumListFragment$c uoc = LocalAlbumListFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       if (!p1) {
          LocalAlbumListFragment$c ta = this.a;
          ta.l.postDelayed(ta.J, 300);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(LocalAlbumListFragment$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LocalAlbumListFragment$c.class, "1")) {
          return;
       }
       LocalAlbumListFragment$c ta = this.a;
       ta.B = ta.l.computeVerticalScrollOffset();
       this.a.ih();
       return;
    }
}
