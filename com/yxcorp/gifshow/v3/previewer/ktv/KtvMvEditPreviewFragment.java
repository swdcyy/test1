package com.yxcorp.gifshow.v3.previewer.ktv.KtvMvEditPreviewFragment;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvMvEditPreviewFragment$a;
import java.util.Map;

public class KtvMvEditPreviewFragment extends KtvBaseEditPreviewFragment	// class@0015ac
{

    public void KtvMvEditPreviewFragment(){
       super();
    }
    public v Oh(EditorItemFunc p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvMvEditPreviewFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KtvMvEditPreviewFragment$a(this, p0);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvMvEditPreviewFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KtvMvEditPreviewFragment.class, null);
       return objectsByTag;
    }
}
