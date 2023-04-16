package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$f$b;
import uo7.i0;
import mhc.h2;
import java.lang.Object;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalStateException;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;

public final class ForwardGridSectionFragment$f$b implements i0	// class@001cca
{
    public final ShareInitResponse$SharePanelElement a;
    public final h2 b;

    public void ForwardGridSectionFragment$f$b(h2 p0){
       this.b = p0;
       super();
       ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
       a.m(sharePanelEl);
       this.a = sharePanelEl;
    }
    public ShareInitResponse$SharePanelElement a(){
       return this.a;
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment$f$b.class, "1")) {
          return;
       }
       if (!SystemUtil.I()) {
          return;
       }
       throw new IllegalStateException("No Implementation");
    }
    public Map getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionFragment$f$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
}
