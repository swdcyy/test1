package com.kuaishou.live.core.show.contributorlist.b;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.contributorlist.b$a;
import p62.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import mq5.h;
import mq5.b;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.contributorlist.e;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends c implements g	// class@000ad9
{
    public LiveContributorListDialogFragment p;
    public a0 q;
    public final h r;
    public b$b s;
    public static String sLivePresenterClassName = "LiveAudienceContributorListPresenter";

    public void b(){
       super();
       this.r = new b$a(this);
       this.s = new c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.q.D2.Km(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       x.E(this.p);
       this.q.D2.le(this.r);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       return;
    }
}
