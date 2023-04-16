package com.kuaishou.live.lite.slide.LiveLiteSlideParam;
import z41.b;
import java.lang.Object;
import java.util.HashSet;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z41.c;
import z41.d;
import androidx.fragment.app.FragmentActivity;
import z41.a;

public class LiveLiteSlideParam implements b	// class@000b54
{
    public Set mOrganicTrafficSet;

    public void LiveLiteSlideParam(){
       super();
       this.mOrganicTrafficSet = new HashSet();
    }
    public static LiveLiteSlideParam of(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteSlideParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0).a(LiveLiteSlideParam.class);
    }
    public static LiveLiteSlideParam of(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteSlideParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(p0).a(LiveLiteSlideParam.class);
    }
    public void b(){
       a.a(this);
    }
}
