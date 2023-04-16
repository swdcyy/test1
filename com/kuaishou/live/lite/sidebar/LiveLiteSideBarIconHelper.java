package com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper;
import java.lang.Object;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveLiteSideBarIconHelper	// class@000b35
{
    public static final LiveLiteSideBarIconHelper a;

    static {
       LiveLiteSideBarIconHelper.a = new LiveLiteSideBarIconHelper();
    }
    public void LiveLiteSideBarIconHelper(){
       super();
    }
    public static final void a(LiveLiteSideBarIconHelper$Request p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveLiteSideBarIconHelper.class, "1")) {
          return;
       }
       a.p(p0, "request");
       p0.d().a0(p0.e(), new LiveLiteSideBarIconHelper$a(p0));
       return;
    }
}
