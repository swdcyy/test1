package h29.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import hs7.d;
import rp7.a;
import jh5.a;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ps7.g;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import qp7.c;
import ps7.f;
import ps7.a;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import qp7.x0;
import h29.a$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import zz5.d;
import qp7.d;
import ps7.e;

public final class a extends DispatchBaseElement	// class@002548
{
    public Activity t;
    public QPhoto u;
    public Fragment v;

    public void a(){
       super(d.c, null);
    }
    public void P(a p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.t = a;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.u = mPhoto;
          d b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.v = b;
       }
       return;
    }
    public a f0(a p0){
       g og = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
    public void j0(boolean p0){
       Integer integer;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       a tu = this.u;
       String str = "mPhoto";
       if (tu == null) {
          a.S(str);
       }
       if (tu != null) {
          PlcEntryStyleInfo plcEntryStyl = tu.getPlcEntryStyleInfo();
          if (plcEntryStyl != null) {
             integer = Integer.valueOf(plcEntryStyl.mBizType);
          label_002e :
             f uof = this.A();
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             String id = mE.getId();
             a tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             String expTag = tu1.getExpTag();
             tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             String photoId = tu1.getPhotoId();
             tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             String listLoadSequ = tu1.getListLoadSequenceID();
             tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             String userId = tu1.getUserId();
             a tt = this.t;
             if (tt == null) {
                a.S("mActivity");
             }
             tu1 = new a(id, expTag, photoId, listLoadSequ, userId, tt);
             b uob = uof.a(v9, Functions.e);
             a.o(uob, "elementEventBus.observeP¡­ns.ERROR_CONSUMER\n      \)");
             this.j(uob);
             this.E().h(false);
             a tu2 = this.u;
             if (tu2 == null) {
                a.S(str);
             }
             uoa = this.v;
             if (uoa == null) {
                a.S("mFragment");
             }
             d.b(tu2, uoa, new a$a(this, integer));
             return;
          }
       }
       integer = null;
       goto label_002e ;
    }
    public d q(){
       e uoe = PatchProxy.apply(null, this, a.class, "10");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
       }
       return uoe;
    }
    public c r(){
       f uof = PatchProxy.apply(null, this, a.class, "11");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
}
