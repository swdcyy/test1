package com.yxcorp.gifshow.ad.webview.jshandler.c;
import com.yxcorp.gifshow.ad.webview.jshandler.e$a;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jshandler.e$b;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import p59.u;
import erd.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import da6.c;
import com.kwai.framework.model.ExtendableModelMap;
import tkd.b;
import tkd.d;
import nl9.r;
import p59.v;
import java.lang.Runnable;

public class c implements e$a	// class@0018f7
{

    public void c(){
       super();
    }
    public static void b(e$b p0,BaseFeed p1){
       i0.a().e(p0.mActionType, p1).d(new u(p0)).a();
    }
    public boolean a(BaseFeed p0,e$b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof c || p0.getExtraMap().getExtra("needAltData") == null) {
          return false;
       }
       d.a(0x691527a8).a6(p0, new v(p1, p0));
       return true;
    }
}
