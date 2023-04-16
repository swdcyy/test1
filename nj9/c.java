package nj9.c;
import qa5.h;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import tkd.b;
import tkd.d;
import os5.l;
import android.view.View;
import k2b.e0;
import java.lang.Integer;
import x2b.a;
import pa5.n;
import pa5.a;
import pj9.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import ta5.a;
import org.json.JSONObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public class c extends h	// class@003190
{

    public void c(RecyclerView p0,g p1){
       super(p0, p1);
    }
    public boolean f(StaggeredGridLayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.getSpanCount() != b && p0.getSpanCount() != 2) {
          b = false;
       }
       return b;
    }
    public void g(QPhoto p0,i3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       if (r1.S2(p0.mEntity)) {
          d.a(-1492894991).mK(p0.mEntity, p1);
       }else {
          super.g(p0, p1);
       }
       return;
    }
    public boolean j(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.isShowed();
    }
    public void k(QPhoto p0,int p1,View p2,e0 p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, c.class, "1")) {
          return;
       }
       a uoa = null;
       a tc = this.c;
       if (tc instanceof n) {
          uoa = tc.u1();
       }
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), uoa, null, b.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (r1.k2(p0.mEntity)) {
             uElementPack.action2 = "ODD_OPERATING_CARD";
             uElementPack.params = a.a(p0.mEntity, -1);
          }else {
             uElementPack.action2 = "SHOW_PHOTO";
             if (uoa != null) {
                JSONObject jSONObject = new JSONObject();
                uoa.a(jSONObject, p0.mEntity, false);
                uElementPack.params = jSONObject.toString();
             }
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          p1++;
          uContentPack.photoPackage = w1.g(p0.mEntity, p1);
          ClientContent$LiveStreamPackage liveStreamPa = x.e(p0.mEntity, 2);
          liveStreamPa.sourceTypeNew = 5;
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.ksOrderInfoPackage = l0.a(w1.o(p0.mEntity));
          u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(p0.getFeedLogCtx()));
       }
       return;
    }
}
