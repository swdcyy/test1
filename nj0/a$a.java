package nj0.a$a;
import com.facebook.react.bridge.ReactMarker$MarkerListener;
import java.lang.Object;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import lj0.c;
import lj0.d;
import java.lang.StringBuilder;
import ek0.d;
import zj0.x;
import java.lang.System;
import bk0.p;
import com.kuaishou.krn.log.model.a;
import zj0.u;
import com.kuaishou.krn.model.LoadingStateTrack;
import bk0.j;

public final class a$a implements ReactMarker$MarkerListener	// class@00332d
{

    public void a$a(){
       super();
    }
    public void logMarker(ReactMarkerConstants p0,String p1,int p2){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "name");
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p2), this, uoa, "2")) {
          if (p0 == ReactMarkerConstants.CONTENT_APPEARED) {
             c uoc = d.b(p2);
             if (uoc != null) {
                d.e("content appeared, "+uoc);
                x ox = uoc.k();
                if (ox != null) {
                   ox.d(System.currentTimeMillis());
                }
                uoc.h().h();
                ox = uoc.k();
                if (ox != null) {
                   a uoa1 = uoc.h();
                   a.o(uoa1, "it.krnPageLoadTimeHelper");
                   ox.b(uoa1.d());
                }
                if (uoc.y()) {
                   LoadingStateTrack loadingState = uoc.o();
                   if (loadingState != null) {
                      loadingState.k();
                   }
                }
             }
          }else if(p0 == ReactMarkerConstants.RUN_JS_BUNDLE_END){
             j.b.b("krn_run_js_bundle_end", "");
          }
       }
       return;
    }
}
