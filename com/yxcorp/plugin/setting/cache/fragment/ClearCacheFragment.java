package com.yxcorp.plugin.setting.cache.fragment.ClearCacheFragment;
import dgd.a;
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
import lnc.e;
import y8c.g;
import cgd.e;
import qvb.i;
import com.yxcorp.plugin.setting.cache.fragment.ClearCacheFragment$a;
import bgd.c;
import lnc.a1;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ClearCacheFragment extends RecyclerFragment implements a	// class@000830
{
    public HashMap F;

    public void ClearCacheFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public float R9(){
       return 0;
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
       Object obj = PatchProxy.applyOneRefs(p0, this, ClearCacheFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ClearCacheFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 65;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ClearCacheFragment.class, "6")) {
       }else {
          ClearCacheFragment tF = this.F;
          if (tF != null) {
             tF.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClearCacheFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       e.b(p0, R.drawable.arg_RES_7f0819d9, -1, R.string.arg_RES_7f1005ac);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ClearCacheFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public i yh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ClearCacheFragment.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       c[] uocArray = new c[2];
       String str = a1.p(R.string.arg_RES_7f104c16);
       a.o(str, "CommonUtil.string\(R.string.temp_cache\)");
       String str1 = a1.p(R.string.arg_RES_7f104d0a);
       a.o(str1, "CommonUtil.string\(R.string.tips_clear_temp_cache\)");
       uocArray[0] = new c(0, str, "0MB", str1);
       str = a1.p(R.string.arg_RES_7f1042c5);
       a.o(str, "CommonUtil.string\(R.string.resource_cache\)");
       Object obj1 = PatchProxy.apply(objArray, this, ClearCacheFragment.class, "4");
       int b = (obj1 != patchProxyRe)? obj1.booleanValue(): f.d("magicFaceRename");
       b = (b)? 0x7f104d09: 0x7f104d08;
       String str2 = a1.p(b);
       a.o(str2, "CommonUtil.string\(if \(en¡­ips_clear_resource_cache\)");
       uocArray[1] = new c(1, str, "0MB", str2);
       return new ClearCacheFragment$a(CollectionsKt__CollectionsKt.L(uocArray));
    }
}
