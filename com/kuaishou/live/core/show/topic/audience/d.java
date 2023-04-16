package com.kuaishou.live.core.show.topic.audience.d;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ql2.o0;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.topic.audience.g;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;

public class d extends c implements g	// class@0011fe
{
    public o0 p;
    public KwaiDialogFragment q;
    public LiveAudienceTopicDetailFragment r;
    public final d$b s;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailHeaderActivityPresenter";

    public void d(){
       super();
       this.s = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.p = o0.p0(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       x.E(this.q);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new g());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       return;
    }
}
