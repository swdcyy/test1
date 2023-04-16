package com.yxcorp.gifshow.visible.ShareVisibleFragment$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$ItemsVisibilityConfig;
import com.yxcorp.gifshow.visible.ShareVisibleFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment;

public final class ShareVisibleFragment$a	// class@0016b5
{

    public void ShareVisibleFragment$a(){
       super();
    }
    public void ShareVisibleFragment$a(u p0){
       super();
    }
    public final ShareVisibleFragment a(c p0,boolean p1,ShareVisibleFragment$ItemsVisibilityConfig p2){
       ShareVisibleFragment obj;
       if (PatchProxy.isSupport(ShareVisibleFragment$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, ShareVisibleFragment$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "itemsVisibilityConfig");
       obj = new ShareVisibleFragment();
       if (!PatchProxy.isSupport(ShareVisibleFragment.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, obj, ShareVisibleFragment.class, "1")) {
          Object[] objArray = new Object[0];
          a.b().w("ShareVisibleFragment", "initParams\(\) called with: draft = "+p0+", isFullScreen = "+p1+", itemsVisibilityConfig = "+p2, objArray);
          obj.A = p0;
          obj.z = p1;
          obj.B = p2;
          int i = (p1)? -1: -2;
          obj.w = i;
       }
       return obj;
    }
}
