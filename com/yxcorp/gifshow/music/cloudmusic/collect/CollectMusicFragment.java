package com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.common.TabMusicFragment;
import java.util.HashSet;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment$a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment$c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jqb.j;
import com.yxcorp.gifshow.fragment.f;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.music.utils.f$a;
import com.yxcorp.gifshow.music.utils.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment$b;
import s2b.a;
import s2b.d;
import java.util.Set;
import y8c.g;
import nob.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import qvb.i;
import nob.c;
import com.yxcorp.gifshow.music.cloudmusic.collect.b;
import erd.r;

public class CollectMusicFragment extends TabMusicFragment	// class@001ff9
{
    public Set U;
    public f$a V;
    public static final int W;

    public void CollectMusicFragment(){
       super();
       this.U = new HashSet();
       this.V = new CollectMusicFragment$a(this);
    }
    public t Bh(){
       CollectMusicFragment$c obj = PatchProxy.apply(null, this, CollectMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CollectMusicFragment$c(this, this);
       obj.u((float)j.g);
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CollectMusicFragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CollectMusicFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f.d(this.V);
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectMusicFragment.class, "4")) {
          return;
       }
       f.e(this.V);
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectMusicFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.C.h(new CollectMusicFragment$b(this));
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, CollectMusicFragment.class, "1")) {
          return;
       }
       super.u();
       if (!this.U.isEmpty()) {
          this.U.clear();
          this.a();
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CollectMusicFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.Hh(), this.N);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, CollectMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CloudMusicRecyclerFragment uCloudMusicR = 1;
       if (this.I != uCloudMusicR) {
          uCloudMusicR = null;
       }
       if (uCloudMusicR) {
          return new c(this.H, this.J, b.b);
       }else {
          return new c(this.H, this.J);
       }
    }
}
