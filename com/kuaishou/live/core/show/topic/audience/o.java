package com.kuaishou.live.core.show.topic.audience.o;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.o$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ql2.o0;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.topic.audience.r;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;

public class o extends c implements g	// class@001210
{
    public o0 p;
    public LiveAudienceTopicDetailFragment q;
    public final o$b r;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailHeaderRecommendPresenter";

    public void o(){
       super();
       this.r = new o$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.p = o0.p0(this.q);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new r());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
