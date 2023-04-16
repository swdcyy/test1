package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$f;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import y8c.g;
import g9c.a;
import qvb.i;

public class CollectionMusicFragment$f extends RecyclerView$r	// class@0013f9
{
    public final CollectionMusicFragment a;

    public void CollectionMusicFragment$f(CollectionMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       CollectionMusicFragment$f uof = CollectionMusicFragment$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "1")) {
          return;
       }
       if (this.a.getActivity() == null) {
          return;
       }
       if (!p1) {
          CollectionMusicFragment$f ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, CollectionMusicFragment.class, "22") && (ta.h0().getLayoutManager().c() >= (ta.g7().getItemCount() - 1) && (!ta.g7().R0() && ta.q().hasMore()))) {
             ta.q().load();
          }
       }
    label_0067 :
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
    }
}
