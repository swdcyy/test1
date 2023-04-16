package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailSlidePlayNavigator;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailSlidePlayNavigator$a;
import qvb.n0;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import kotlin.jvm.internal.a;

public final class LiveHotSpotDetailSlidePlayNavigator	// class@00136a
{
    public static final LiveHotSpotDetailSlidePlayNavigator a;

    static {
       LiveHotSpotDetailSlidePlayNavigator.a = new LiveHotSpotDetailSlidePlayNavigator();
    }
    public void LiveHotSpotDetailSlidePlayNavigator(){
       super();
    }
    public final String a(List p0){
       LiveHotSpotDetailSlidePlayNavigator$a obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotDetailSlidePlayNavigator.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveHotSpotDetailSlidePlayNavigator$a(p0);
       obj.a();
       String str = b.g(j.e(obj, f.b(null), SlideMediaType.ALL)).id();
       a.o(str, "SlidePlayDataFetcherImpl¡­    \)\n      \)\n      .id\(\)");
       return str;
    }
}
