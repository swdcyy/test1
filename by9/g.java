package by9.g;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq7.d;
import java.util.Objects;
import rp7.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qp7.b;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import pe5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ar7.l;
import nsd.u;
import java.lang.Boolean;
import by9.g$a;
import qp7.b1;
import qp7.x0;
import by9.g$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo$InvitationOption;
import java.lang.CharSequence;
import android.text.TextUtils;
import qp7.d;
import ar7.j;
import qp7.c;
import ar7.k;

public final class g extends DispatchBaseElement	// class@000519
{
    public final String t;
    public BaseFragment u;
    public QPhoto v;
    public final GifshowActivity w;

    public void g(GifshowActivity p0,a p1){
       a.p(p0, "activity");
       Objects.requireNonNull(d.J);
       super(d.r, p1);
       this.w = p0;
       this.t = "https://ppg.viviv.com/doodle/XmMmubEf.html?uni_src=LDCFBF&hyId=jimu_XmMmubEf";
    }
    public static final QPhoto n0(g p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.u = b;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.v = mPhoto;
          PatchProxy.onMethodExit(g.class, "1");
       }
       return;
    }
    public void S(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "6")) {
          return;
       }
       g tu = this.u;
       if (tu == null) {
          a.S("mFragment");
       }
       if (!PatchProxy.applyVoidOneRefs(tu, objArray, c.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CO_CREATION_INVITE_POPUP";
          u1.B0(new ShowMetaData().setLogPage(tu).setType(1).setElementPackage(uElementPack));
       }
       return;
    }
    public a f0(a p0){
       l ol = PatchProxy.applyOneRefs(p0, this, g.class, "9");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l(null, 1, null);
       }
       return ol;
    }
    public void j0(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "2")) {
          return;
       }
       if (this.o0()) {
          this.b0();
       }
       this.i(new g$a(this));
       l ol = this.E();
       g$b uob = new g$b(this);
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoidOneRefs(uob, ol, l.class, "2")) {
          a.p(uob, "observer");
          ol.d.d(ol.c(), uob);
       }
       return;
    }
    public void m0(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "5")) {
          return;
       }
       l ol = this.E();
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoid(null, ol, l.class, "5")) {
          ol.f.f(Boolean.TRUE);
       }
       return;
    }
    public final boolean o0(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mPhoto");
       }
       CoCreateInvitationInfo coCreateInvi = obj.getCoCreateInvitationInfo();
       if (coCreateInvi != null) {
          objArray = coCreateInvi.mAgreeOption;
       }
       boolean b = (objArray != null && (coCreateInvi.mDisagreeOption != null && (TextUtils.isEmpty(coCreateInvi.mAgreeOption.mButtonText) || TextUtils.isEmpty(coCreateInvi.mDisagreeOption.mButtonText))))? true: false;
       return b;
    }
    public d q(){
       j oj = PatchProxy.apply(null, this, g.class, "7");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
    public c r(){
       k ok = PatchProxy.apply(null, this, g.class, "8");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k();
       }
       return ok;
    }
}
