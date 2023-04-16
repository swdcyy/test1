package com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.ArrayList;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$d;
import java.util.Map;
import android.os.Bundle;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y8c.g;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$b;
import qvb.i;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$c;

public class LiveGzoneKShellRankListFragment extends RecyclerFragment	// class@001c4f
{
    public a F;
    public c G;
    public final ArrayList H;
    public LiveGzoneKShellRankPopup I;
    public TextView J;
    public f K;

    public void LiveGzoneKShellRankListFragment(){
       super();
       this.H = new ArrayList();
       this.K = new LiveGzoneKShellRankListFragment$a(this);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneKShellRankListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneKShellRankListFragment$d(this, this);
    }
    public int getLayoutResId(){
       return 0x7f0d0bcd;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneKShellRankListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzoneKShellRankListFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKShellRankListFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.H.add(this.F);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneKShellRankListFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       LiveGzoneKShellRankListFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneKShellRankListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneKShellRankListFragment$b(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneKShellRankListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneKShellRankListFragment$c(this);
    }
}
