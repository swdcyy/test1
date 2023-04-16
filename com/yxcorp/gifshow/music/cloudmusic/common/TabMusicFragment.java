package com.yxcorp.gifshow.music.cloudmusic.common.TabMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;

public abstract class TabMusicFragment extends CloudMusicRecyclerFragmentV2	// class@001fff
{

    public void TabMusicFragment(){
       super();
    }
    public void Oh(int p0){
       if (PatchProxy.isSupport(TabMusicFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabMusicFragment.class, "1")) {
          return;
       }
       RecyclerFragment ts = this.s;
       if (ts != null) {
          boolean b = (!p0)? true: false;
          ts.setEnabled(b);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabMusicFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(TabMusicFragment.class, null);
       return objectsByTag;
    }
}
