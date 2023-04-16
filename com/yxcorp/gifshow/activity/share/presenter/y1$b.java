package com.yxcorp.gifshow.activity.share.presenter.y1$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.y1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.app.Activity;
import com.yxcorp.utility.n;
import vw8.a;
import xw8.p0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class y1$b extends m	// class@00145a
{
    public final y1 c;

    public void y1$b(y1 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y1$b.class, "1")) {
          return;
       }
       y1$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, y1.class, "8")) {
          if (c.q(c.i(tc.x, tc.y), c.f(tc.x)) || (c.i(tc.x, tc.y) == Workspace$Type.LONG_PICTURE && (PostExperimentUtils.d() && tc.u == null))) {
             n.C(tc.w);
             y1.S8(tc.w);
             a.l();
          }else if(tc.v.b()){
             tc.v.p(0);
             if (!PatchProxy.applyVoid(objArray, objArray, a.class, "44")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = 828;
                u1.u(1, uElementPack, new ClientContent$ContentPackage());
             }
          }else if(tc.w.isFinishing()){
             y1.S8(tc.w);
             a.l();
          }
       }
       return;
    }
}
