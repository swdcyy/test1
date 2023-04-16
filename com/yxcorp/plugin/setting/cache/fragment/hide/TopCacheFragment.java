package com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.lang.CharSequence;
import lnc.e;
import y8c.g;
import egd.a;
import qvb.i;
import com.yxcorp.plugin.setting.cache.fragment.hide.TopCacheFragment$a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class TopCacheFragment extends RecyclerFragment	// class@00083c
{
    public HashMap F;

    public void TopCacheFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d04a5;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TopCacheFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(TopCacheFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 65;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TopCacheFragment.class, "5")) {
       }else {
          TopCacheFragment tF = this.F;
          if (tF != null) {
             tF.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TopCacheFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       e.c(p0, R.drawable.arg_RES_7f0819d9, -1, "Top文件占用");
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, TopCacheFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, TopCacheFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TopCacheFragment$a(CollectionsKt__CollectionsKt.E());
    }
}
