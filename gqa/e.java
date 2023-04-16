package gqa.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import u07.t;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqa.k;
import im8.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import java.lang.System;
import vma.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import o07.n;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import nna.c;
import ko5.d;
import ko5.c;
import wq6.l;
import on5.b;
import xr6.c$a;
import xr6.c;
import com.kwai.kcube.TabIdentifier;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import gqa.i;
import java.util.Map;
import java.util.HashMap;

public class e extends t implements PopupInterface$f, g	// class@002b68
{
    public Activity r;
    public PresenterV2 s;
    public boolean t;
    public QPhoto u;
    public String v;
    public static final int w;

    public void e(t$a p0){
       super(p0);
       p0.v(false);
       p0.L(this);
       p0.z(false);
       p0.A(false);
       p0.P(true);
       p0.B(false);
       p0.G(g.a);
       p0.O(j.a);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       i3 oi3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "2");
       if (p0 != patchProxyRe) {
          return p0;
       }
       View view = p1.inflate(R.layout.arg_RES_7f0d1284, p2);
       String str = "1";
       Object[] objArray = null;
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, e.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new k());
          PatchProxy.onMethodExit(e.class, str);
       }
       this.s = presenterV2;
       presenterV2.f(view);
       Object[] objArray1 = new Object[]{new c("guide_dialog", this),this};
       this.s.i(objArray1);
       if (!PatchProxy.applyVoid(objArray, this, e.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (this.t != null) {
             uElementPack.action2 = "GUIDE_FEATUREDPAGE_TOAST";
             oi3 = i3.f();
             oi3.d("click_area", "to_featurepage");
             uElementPack.params = oi3.e();
          }else {
             uElementPack.action2 = "COMMON_FIELD_LEAD_ITEM";
             oi3 = i3.f();
             e tu = this.u;
             String photoId = (tu != null)? tu.getPhotoId(): "";
             oi3.d("content_id", photoId);
             uElementPack.params = oi3.e();
          }
          u1.B0(new ShowMetaData().setElementPackage(uElementPack));
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("publicDomainGuideShownTs", System.currentTimeMillis());
       g.a(uEditor);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       n.a(this, p0);
       this.s.destroy();
       return;
    }
    public void e0(){
       i3 oi3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "4")) {
          return;
       }
       this.o();
       if (this.r instanceof FragmentActivity) {
          RxBus.f.b(new c(this.u));
          c.a(this.r).d().n(b.f, c.a("GuideSwitch").a());
       }
       if (!PatchProxy.applyVoid(objArray, this, e.class, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (this.t != null) {
             uElementPack.action2 = "GUIDE_FEATUREDPAGE_TOAST";
             oi3 = i3.f();
             oi3.d("click_area", "to_featurepage");
             uElementPack.params = oi3.e();
          }else {
             uElementPack.action2 = "COMMON_FIELD_LEAD_ITEM";
             oi3 = i3.f();
             e tu = this.u;
             String photoId = (tu != null)? tu.getPhotoId(): "";
             oi3.d("content_id", photoId);
             uElementPack.params = oi3.e();
          }
          u1.B(new ClickMetaData().setElementPackage(uElementPack).setType(1));
       }
       a.v(0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new i());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
}
