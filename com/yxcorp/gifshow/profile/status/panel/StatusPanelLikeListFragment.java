package com.yxcorp.gifshow.profile.status.panel.StatusPanelLikeListFragment;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListTipsHelper;
import p5c.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import java.util.HashMap;
import qvb.i;
import p5c.r;
import com.kwai.framework.model.user.User;

public final class StatusPanelLikeListFragment extends StatusPanelListFragment	// class@0015b7
{
    public HashMap G;

    public void StatusPanelLikeListFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, StatusPanelLikeListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c b = this.Gh().b;
       a.o(b, "panelCallerContext.mQPhoto");
       return new StatusPanelListTipsHelper(this, b, 1);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StatusPanelLikeListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(StatusPanelLikeListFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "LIKE_LIST";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, StatusPanelLikeListFragment.class, "4")) {
       }else {
          StatusPanelLikeListFragment tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public i yh(){
       r or = PatchProxy.apply(null, this, StatusPanelLikeListFragment.class, "1");
       if (or != PatchProxyResult.class) {
       }else {
          c b = this.Gh().b;
          a.o(b, "panelCallerContext.mQPhoto");
          or = new r(b, this.Gh().c, 1);
          this.Gh().h = or;
       }
       return or;
    }
}
