package com.yxcorp.gifshow.relation.black.BlockUserListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import y8c.g;
import com.yxcorp.gifshow.relation.black.BlockUserListFragment$a;
import qvb.i;
import qvb.n0;
import com.yxcorp.gifshow.relation.black.BlockUserListFragment$b;

public class BlockUserListFragment extends RecyclerFragment	// class@0017de
{
    public static final int F;

    public void BlockUserListFragment(){
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(BlockUserListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, BlockUserListFragment.class, "5")) {
          return;
       }
       super.M1(p0, p1);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d010e;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlockUserListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(BlockUserListFragment.class, null);
       return objectsByTag;
    }
    public String getUrl(){
       return "ks://live/blacklist";
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BlockUserListFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.title_root).d(R.drawable.arg_RES_7f0819d9, -1, R.string.arg_RES_7f1003ba);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, BlockUserListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BlockUserListFragment$a(this);
    }
    public i yh(){
       BlockUserListFragment$b uob = PatchProxy.apply(null, this, BlockUserListFragment.class, "4");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new BlockUserListFragment$b(this);
       }
       return uob;
    }
}
