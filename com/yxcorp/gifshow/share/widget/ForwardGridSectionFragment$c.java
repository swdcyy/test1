package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$c;
import uo7.i0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import lnc.i3;
import kotlin.Pair;
import qrd.r0;
import trd.s0;

public final class ForwardGridSectionFragment$c implements i0	// class@001cc4
{
    public final String a;
    public final i0 b;

    public void ForwardGridSectionFragment$c(i0 p0,String p1){
       a.p(p0, "op");
       a.p(p1, "recentChannelShowText");
       super();
       this.b = p0;
       this.a = p1;
    }
    public ShareInitResponse$SharePanelElement a(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a();
    }
    public void execute(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment$c.class, "3")) {
          return;
       }
       this.b.execute();
       return;
    }
    public Map getExtraInfo(){
       i3 obj = PatchProxy.apply(null, this, ForwardGridSectionFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("text", this.a);
       return s0.k(r0.a("local_extra_info", obj.e()));
    }
}
