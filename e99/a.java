package e99.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e99.a$a;
import nsd.u;
import java.lang.String;
import lnc.a1;
import e99.a$c;
import e99.a$d;
import e99.a$e;
import e99.a$f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import android.app.Activity;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kwai.plugin.dva.work.c$c;
import e99.a$g;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import vo5.b;
import vo5.b$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import java.util.List;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import q0.e;
import jd6.g;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import ae6.h;
import uw9.o;
import java.lang.Throwable;
import q87.c;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class a extends PresenterV2	// class@002155
{
    public final b$b A;
    public QPhoto p;
    public BaseFragment q;
    public ImageView r;
    public int s;
    public final Runnable t;
    public a$b u;
    public c v;
    public Activity w;
    public int x;
    public final a$d y;
    public final a$e z;
    public static final String B;
    public static final a$a C;

    static {
       a.C = new a$a(null);
       a.B = a1.p(0x7f100e69);
    }
    public void a(){
       super();
       this.t = new a$c(this);
       this.x = -2;
       this.y = new a$d(this);
       this.z = new a$e(this);
       this.A = new a$f(this);
    }
    public final void A7(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BUTTON_PACKAGE";
       i3 oi3 = i3.f();
       oi3.d("button_type", "SEARCH");
       uElementPack.params = oi3.e();
       a tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(tp.getEntity());
       ShowMetaData showMetaData = new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack);
       tp = this.q;
       if (tp == null) {
          a.S("mFragment");
       }
       showMetaData = showMetaData.setLogPage(tp);
       tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       u1.B0(showMetaData.setFeedLogCtx(tp.getFeedLogCtx()));
       return;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          return;
       }
       this.w = this.getActivity();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "17") && !this.Y8()) {
          String b = a.B;
          a.o(b, "ATLAS_SEARCH_PLUGIN_NAME");
          PluginDownloadExtension.k.s(b, 40);
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          c uoc = uDva.getPluginInstallManager().j(b);
          this.v = uoc;
          if (uoc != null) {
             uoc.a(this.z);
          }
       }
       uoa = this.r;
       if (uoa != null) {
          uoa.setOnClickListener(new a$g(this));
       }
       return;
    }
    public void J8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "11")) {
          b uob1 = d.a(0x3a21af1e);
          if (uob1 != null) {
             uob1.Ox(this.A);
          }
       }
       this.X8();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "16")) {
          b uob = d.a(0x3a21af1e);
          if (uob != null) {
             uob.destroy();
          }
          uoa = this.v;
          if (uoa != null) {
             uoa.n(this.z);
          }
       }
       return;
    }
    public final boolean P8(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = obj.mEntity;
       PhotoMeta photoMeta = (mEntity != null)? mEntity.a(PhotoMeta.class): objArray;
       if (photoMeta != null) {
          objArray = photoMeta.mMMUSimilarSearchInfo;
       }
       boolean b = false;
       if (objArray != null) {
          MMUSimilarSearchInfo mHasCommodit = photoMeta.mMMUSimilarSearchInfo.mHasCommodityPicIndexes;
          if (mHasCommodit != null && mHasCommodit.size() > 0) {
             b = true;
          }
       }
       return b;
    }
    public final boolean R8(int p0){
       QPhoto obj;
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoa = this.p;
       if (uoa == null) {
          a.S("mPhoto");
       }
       obj = uoa.mEntity;
       if (obj != null) {
          PhotoMeta photoMeta = obj.a(PhotoMeta.class);
          if (photoMeta != null) {
             photoMeta = photoMeta.mMMUSimilarSearchInfo;
             if (photoMeta != null) {
                MMUSimilarSearchInfo mHasCommodit = photoMeta.mHasCommodityPicIndexes;
                if (mHasCommodit != null) {
                   b = mHasCommodit.contains(Integer.valueOf(p0));
                label_0046 :
                   return b;
                }
             }
          }
       }
       b = false;
       goto label_0046 ;
    }
    public final QPhoto S8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final int V8(){
       return this.s;
    }
    public final ImageView W8(){
       return this.r;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       k1.m(this.t);
       a tu = this.u;
       if (tu != null) {
          tu.dismiss();
       }
       this.u = null;
       return;
    }
    public final boolean Y8(){
       String obj = PatchProxy.apply(null, this, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.B;
       a.o(obj, "ATLAS_SEARCH_PLUGIN_NAME");
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       b uob = d.a(0x3a21af1e);
       if (uob != null) {
          uob.I5(this.A);
       }
       return;
    }
    public void a9(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BUTTON_PACKAGE";
          i3 oi3 = i3.f();
          oi3.d("button_type", "SEARCH");
          uElementPack.params = oi3.e();
          a tp = this.p;
          String str = "mPhoto";
          if (tp == null) {
             a.S(str);
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tp.getEntity());
          ClickMetaData uClickMetaDa = new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack);
          tp = this.q;
          if (tp == null) {
             a.S("mFragment");
          }
          uClickMetaDa = uClickMetaDa.setLogPage(tp);
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          u1.B(uClickMetaDa.setFeedLogCtx(tp.getFeedLogCtx()));
       }
       if (this.Y8()) {
          this.d9();
       }else if(this.w != null){
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          b pluginInstal = uDva.getPluginInstallManager();
          a.o(pluginInstal, "Dva.instance\(\).pluginInstallManager");
          String b = a.B;
          a.o(b, "ATLAS_SEARCH_PLUGIN_NAME");
          a tw = this.w;
          a.m(tw);
          PluginInstallerUIHandler$a uoa1 = PluginInstallerUIHandler.s.b(tw);
          h.a(pluginInstal, b, uoa1.d(this.y));
       }
       return;
    }
    public final void b9(int p0){
       this.s = p0;
    }
    public final void c9(ImageView p0){
       this.r = p0;
    }
    public final void d9(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "12")) {
          return;
       }
       this.Z8();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "13")) {
          k1.r(this.t, 500);
       }
       b uob = d.a(0x3a21af1e);
       if (uob != null) {
          a tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          uob.Gq(tp, this.s, this.x);
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, a.class, "4");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       return;
    }
}
