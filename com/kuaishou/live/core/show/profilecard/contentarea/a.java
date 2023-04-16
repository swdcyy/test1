package com.kuaishou.live.core.show.profilecard.contentarea.a;
import im8.g;
import a51.c;
import com.kuaishou.live.core.show.profilecard.contentarea.LiveProfileContentAreaHeightService$ConfigPriority;
import te2.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.kwai.robust.PatchProxyResult;
import te2.d;
import java.util.Map;
import java.util.HashMap;

public class a extends c implements g	// class@000dbe
{
    public CoordinatorLayout v;
    public CustomRecyclerView w;
    public LiveProfileContentAreaHeightService$ConfigPriority x;
    public LiveProfileContentAreaHeightService y;
    public static String sLivePresenterClassName = "LiveProfileContentAreaHeightPresenter";

    public void a(){
       super();
       this.x = LiveProfileContentAreaHeightService$ConfigPriority.Default;
       this.y = new a(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a2373);
       this.w = m1.f(p0, 0x7f0a23aa);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
