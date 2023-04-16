package com.yxcorp.gifshow.profile.music.ProfileMusicFragment$d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
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
import com.kwai.library.widget.specific.misc.LoadingView;
import android.content.Context;
import java.lang.CharSequence;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.LinearLayout;
import android.view.View;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class ProfileMusicFragment$d extends RecyclerView$r	// class@0013fe
{
    public final ProfileMusicFragment a;

    public void ProfileMusicFragment$d(ProfileMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       ProfileMusicFragment$d uod = ProfileMusicFragment$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       if (this.a.getActivity() == null) {
          return;
       }
       if (!p1) {
          ProfileMusicFragment$d ta = this.a;
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, ta, ProfileMusicFragment.class, "17")) {
             int i = 1;
             if (ta.h0().getLayoutManager().c() >= (ta.g7().getItemCount() - i) && (!ta.g7().R0() && ta.q().hasMore())) {
                if (!PatchProxy.applyVoid(objArray, ta, ProfileMusicFragment.class, "19")) {
                   if (ta.F == null) {
                      LoadingView loadingView = new LoadingView(ta.getActivity(), 0x7f110210);
                      ta.F = loadingView;
                      loadingView.g(i, objArray);
                   }
                   if (ta.G == null) {
                      LinearLayout linearLayout = new LinearLayout(ta.getActivity());
                      ta.G = linearLayout;
                      linearLayout.setOrientation(0);
                      ta.G.addView(ta.F, -1, -2);
                      ta.ia().L0(ta.G);
                      ta.G.setLayoutParams(new RecyclerView$LayoutParams(-1, -2));
                   }
                   ta.F.setVisibility(0);
                }
                ta.q().load();
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
    }
}
