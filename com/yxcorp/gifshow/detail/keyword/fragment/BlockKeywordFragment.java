package com.yxcorp.gifshow.detail.keyword.fragment.BlockKeywordFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n1a.a;
import n1a.i;
import y8c.t;
import j1a.a;
import java.util.Map;
import y8c.g;
import i1a.a;
import qvb.i;
import m1a.a;

public class BlockKeywordFragment extends RecyclerFragment	// class@001573
{

    public void BlockKeywordFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, BlockKeywordFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a());
       obj.U7(new i(this));
       PatchProxy.onMethodExit(BlockKeywordFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, BlockKeywordFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public boolean Eh(){
       return true;
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d010c;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockKeywordFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(BlockKeywordFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "BLOCK_KEYWORDS";
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, BlockKeywordFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, BlockKeywordFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
