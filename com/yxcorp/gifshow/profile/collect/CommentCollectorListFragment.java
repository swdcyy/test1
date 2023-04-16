package com.yxcorp.gifshow.profile.collect.CommentCollectorListFragment;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.collect.CommentCollectorListFragment$a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Map;
import y8c.g;
import p5c.b;
import p5c.c;
import qvb.i;
import com.yxcorp.gifshow.profile.http.i;
import com.yxcorp.gifshow.entity.QPhoto;

public class CommentCollectorListFragment extends StatusPanelListFragment	// class@001297
{

    public void CommentCollectorListFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CommentCollectorListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommentCollectorListFragment$a(this, this);
    }
    public int f(){
       return 293;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentCollectorListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CommentCollectorListFragment.class, null);
       return objectsByTag;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CommentCollectorListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.Gh()};
       return new b(objArray);
    }
    public i yh(){
       i obj = PatchProxy.apply(null, this, CommentCollectorListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new i(this.Gh().b);
       obj.q = this.Gh().d;
       obj.r = this.Gh().f;
       obj.p = this.Gh().c;
       this.Gh().h = obj;
       return obj;
    }
}
