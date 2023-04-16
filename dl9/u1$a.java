package dl9.u1$a;
import il9.b$b;
import dl9.u1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Boolean;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import o56.a;
import android.app.Application;
import dl9.t1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import java.lang.Runnable;
import android.widget.ImageView;
import java.lang.Integer;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Objects;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import dl9.p1;
import com.yxcorp.gifshow.util.cdnresource.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import yk9.d;
import dl9.q1;
import ek9.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import ek9.m1;
import org.json.JSONException;
import q87.c;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public class u1$a implements b$b	// class@001fb7
{
    public boolean a;
    public final u1 b;

    public void u1$a(u1 p0){
       this.b = p0;
       super();
       this.a = true;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, u1$a.class, "4")) {
          return;
       }
       this.a = true;
       this.b.a9(false);
       u1$a tb = this.b;
       if (tb.I != null && !tb.Z8(tb.v.mId)) {
          tb = this.b;
          u1 v = tb.v;
          if (v != null && (v.mDisliked != null && (v.mLiked != null && tb.V8()))) {
             this.b.E.onNext(Boolean.TRUE);
          }
       }
    label_0042 :
       this.b.I = false;
       return;
    }
    public boolean b(boolean p0){
       String obj;
       u1$a uoa = u1$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.b.v.getStatus() == 2) {
          this.b.m8().performClick();
          return b;
       }else {
          this.b.I = p0;
          if (!QCurrentUser.ME.isLogined()) {
             b uob = d.a(-1712118428);
             Context context = this.b.getContext();
             String fullSource = this.b.z.getFullSource();
             obj = (this.b.v.mLiked != null)? "comment_unlike": "comment_like";
             uob.ne(context, fullSource, obj, 57, a.B.getString(R.string.arg_RES_7f103079), this.b.z.mEntity, null, null, new t1(this, p0)).h();
             return b;
          }else {
             this.b.b9(true, p0);
             this.a = b;
             u1$a tb = this.b;
             tb.s.postDelayed(tb.J, 400);
             return true;
          }
       }
    }
    public void c(int p0,boolean p1){
       u1$a tb;
       JSONObject jSONObject;
       u1 ou1 = u1.class;
       u1$a uoa = u1$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       int i = 2;
       if (this.b.v.getStatus() == i) {
          return;
       }
       boolean b = false;
       if (p0 >= i) {
          u1 t = this.b.t;
          if (t != null && !t.p()) {
             Object[] objArray = null;
             if (this.b.V8()) {
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(objArray, tb, ou1, "12")) {
                   ou1 = tb.t;
                   if (ou1 != null) {
                      ou1.t();
                      tb.t.setAnimation(tb.Y8(true));
                      f.b(tb.t, CdnResource$ResourceKey.bt_comment_like, tb.Y8(true), new p1(tb));
                   }
                }
             }else {
                tb = this.b;
                u1$a ta = this.a;
                Objects.requireNonNull(tb);
                if (!PatchProxy.isSupport(ou1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), tb, ou1, "15")) {
                   ou1 = tb.t;
                   if (ou1 != null) {
                      ou1.t();
                      tb.t.setAnimation(R.raw.arg_RES_7f0f0055);
                      if (ta != null) {
                         u1 v1 = tb.v;
                         objArray = tb.w.b(v1, v1.mReplyToCommentId);
                      }
                      f.c(tb.t, CdnResource$ResourceKey.bt_comment_like, R.raw.arg_RES_7f0f0055, new q1(tb), objArray, ta);
                   }
                }
             }
             this.a = b;
          }
       }
       if (p0 == i) {
          if (!l1.e()) {
             l1.h(true);
          }
          u1$a tb1 = this.b;
          tb1.s.removeCallbacks(tb1.J);
          tb1 = this.b;
          tb1.s.removeCallbacks(tb1.K);
          tb1 = this.b;
          u1 w = tb1.w;
          u1 v = tb1.v;
          ou1 = tb1.A;
          Objects.requireNonNull(w);
          if (!PatchProxy.isSupport(d.class) || (PatchProxy.applyVoidThreeRefs(v, Boolean.valueOf(p1), ou1, w, d.class, "38") || (w.a != null && v != null))) {
             ClientContent$ContentPackage uContentPack = w.c(v, v.mReplyToCommentId, true);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIKE_COMMENT_EFFECT";
             try{
                jSONObject = new JSONObject();
                String str = "click_type";
                String str1 = (p1)? "PRESS": "CLICK";
                jSONObject.put(str, str1);
                str1 = (v.isSub())? "2": "1";
                jSONObject.put("name", str1);
             }catch(org.json.JSONException e7){
                Object[] objArray1 = new Object[b];
                m1.C().t("CommentLogger", e7.getMessage(), objArray1);
             }
             uElementPack.params = jSONObject.toString();
             u1.B(new ClickMetaData().setLogPage(ou1).setType(true).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(w.a.getFeedLogCtx()));
          }
       }
    label_016a :
       if (p1 && p0 == 1) {
          this.b.a9(true);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, u1$a.class, "1")) {
          return;
       }
       this.b.b9(false, false);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, u1$a.class, "5")) {
          return;
       }
       u1$a tb = this.b;
       if (tb.I != null && !tb.Z8(tb.v.mId)) {
          tb = this.b;
          u1 v = tb.v;
          if (v != null && (v.mDisliked != null && (v.mLiked != null && tb.V8()))) {
             this.b.E.onNext(Boolean.TRUE);
             this.b.I = false;
          }
       }
    label_003e :
       return;
    }
    public boolean f(){
       return this.b.v.mLiked;
    }
}
