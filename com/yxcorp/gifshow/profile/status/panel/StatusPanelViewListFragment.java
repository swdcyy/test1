package com.yxcorp.gifshow.profile.status.panel.StatusPanelViewListFragment;
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

public final class StatusPanelViewListFragment extends StatusPanelListFragment	// class@0015bd
{
    public HashMap G;

    public void StatusPanelViewListFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, StatusPanelViewListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c b = this.Gh().b;
       a.o(b, "panelCallerContext.mQPhoto");
       return new StatusPanelListTipsHelper(this, b, 2);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StatusPanelViewListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(StatusPanelViewListFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "VIEW_LIST";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, StatusPanelViewListFragment.class, "4")) {
       }else {
          StatusPanelViewListFragment tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public i yh(){
       r or = PatchProxy.apply(null, this, StatusPanelViewListFragment.class, "1");
       if (or != PatchProxyResult.class) {
       }else {
          c b = this.Gh().b;
          a.o(b, "panelCallerContext.mQPhoto");
          or = new r(b, this.Gh().c, 2);
          this.Gh().h = or;
       }
       return or;
    }
}
