package a43.j;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.feedback.b;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.c;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import lp3.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.component.misc.report.ReportInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a43.b;
import android.app.Activity;
import o63.a;
import com.kuaishou.live.report.e;
import xp5.i;
import lp3.c;
import k2b.e0;

public class j extends m	// class@000042
{
    public final boolean c;
    public final String d;
    public final GifshowActivity e;
    public final BaseFeed f;
    public final String g;
    public final c h;
    public final LiveSceneInfoService$LiveSceneInfo i;
    public final e j;
    public final b k;

    public void j(b p0,boolean p1,String p2,GifshowActivity p3,BaseFeed p4,String p5,c p6,LiveSceneInfoService$LiveSceneInfo p7,e p8){
       this.k = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       super();
    }
    public void a(View p0){
       j k;
       j g;
       j j;
       j oj;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, j.class, "1")) {
          return;
       }
       int i = 1;
       if (obj.c != null) {
          k = obj.k;
          j d = obj.d;
          j e = obj.e;
          j f = obj.f;
          g = obj.g;
          Objects.requireNonNull(k);
          if (!PatchProxy.applyVoidFourRefs(d, e, f, g, k, b.class, "10")) {
             ReportInfo reportInfo = k.a(e, f);
             reportInfo.mEntrySource = "live_simple";
             k.c();
             b.a(f, d, g, i);
             e.h(e, reportInfo, f, null);
          }
       }else {
          j h = obj.h;
          if (h != null) {
             k = obj.k;
             j d1 = obj.d;
             g = obj.e;
             j f1 = obj.f;
             j i1 = obj.i;
             j = obj.j;
             j g1 = obj.g;
             Objects.requireNonNull(k);
             if (PatchProxy.isSupport(b.class)) {
                Object[] objArray = new Object[]{d1,g,h,f1,i1,j,g1};
                if (!PatchProxy.applyVoid(objArray, k, b.class, "11")) {
                }
             }else {
             }
          }
       }
       return;
    }
}
