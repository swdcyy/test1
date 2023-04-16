package com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment;
import kqb.d;
import com.yxcorp.gifshow.music.cloudmusic.common.TabMusicFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jqb.j;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.android.model.music.Music;
import qvb.i;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import kqb.c;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.music.utils.m;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment$a;
import s2b.a;
import s2b.d;
import zob.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import qvb.n0;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.music.cloudmusic.history.b;

public class HistoryMusicFragment extends TabMusicFragment implements d	// class@00201d
{

    public void HistoryMusicFragment(){
       super();
    }
    public t Bh(){
       HistoryMusicFragment$b obj = PatchProxy.apply(null, this, HistoryMusicFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HistoryMusicFragment$b(this, this);
       obj.u((float)j.g);
       return obj;
    }
    public void Y6(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HistoryMusicFragment.class, "6")) {
          return;
       }
       this.q().add(p0);
       this.g7().K0(p0);
       if (!this.g7().R0()) {
          this.sh().f();
       }
       this.g7().k0();
       return;
    }
    public void Z5(Music p0){
       c.c(this, p0);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HistoryMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(HistoryMusicFragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HistoryMusicFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       m.h(this);
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HistoryMusicFragment.class, "3")) {
          return;
       }
       m.j(this);
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HistoryMusicFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.C.h(new HistoryMusicFragment$a(this));
       return;
    }
    public void v3(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HistoryMusicFragment.class, "7")) {
          return;
       }
       this.q().remove(p0);
       this.g7().T0(p0);
       if (this.g7().R0()) {
          this.sh().i();
       }
       this.g7().k0();
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, HistoryMusicFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.Hh(), this.N);
    }
    public i yh(){
       b uob = PatchProxy.apply(null, this, HistoryMusicFragment.class, "5");
       if (uob != PatchProxyResult.class) {
       }else {
          b uob1 = new b(this.I, this.H, this.J, this.getArguments().getBoolean("EXTRA_HIDDEN_LOCAL"));
       }
       return uob;
    }
}
