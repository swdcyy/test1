package com.kuaishou.live.core.show.topic.audience.h;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ql2.o0;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import pl2.b;
import pl2.a;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import brd.t;
import cjd.e;
import erd.o;
import ql2.m;
import ql2.n;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.topic.audience.j;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;

public class h extends c implements g	// class@001204
{
    public o0 p;
    public LiveTopicHeaderInfo q;
    public boolean r;
    public LiveAudienceTopicDetailFragment s;
    public final h$b t;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailHeaderBasicInfoPresenter";

    public void h(){
       super();
       this.t = new h$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.p = o0.p0(this.s);
       return;
    }
    public final void P8(LiveAudienceTopicDetailHeaderView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       if (this.q != null && this.r == null) {
          this.r = true;
          h tq = this.q;
          this.X7(a.b().b(tq.mTopicId, (true ^ tq.mIsFollowing)).map(new e()).subscribe(new m(this, p0), new n(this, p0)));
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new j());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       return;
    }
}
