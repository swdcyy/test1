package com.yxcorp.gifshow.ad.util.FakeDetailListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import qvb.i;
import com.yxcorp.gifshow.ad.util.FakeDetailListFragment$a;
import y8c.g;
import com.yxcorp.gifshow.ad.util.FakeDetailListFragment$b;

public final class FakeDetailListFragment extends RecyclerFragment	// class@00186d
{
    public final List F;
    public HashMap G;

    public void FakeDetailListFragment(List p0){
       a.p(p0, "mList");
       super();
       this.F = p0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FakeDetailListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FakeDetailListFragment.class, null);
       return objectsByTag;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, FakeDetailListFragment.class, "5")) {
       }else {
          FakeDetailListFragment tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public i q(){
       Object obj = PatchProxy.apply(null, this, FakeDetailListFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FakeDetailListFragment$a(this.F);
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, FakeDetailListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FakeDetailListFragment$b();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, FakeDetailListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FakeDetailListFragment$a(this.F);
    }
}
