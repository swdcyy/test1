package d5c.v0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.t;
import j5c.c;
import d5c.v0$a;
import erd.g;
import crd.b;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import d5c.v0$b;
import com.kwai.framework.model.user.User;

public final class v0 extends PresenterV2	// class@002115
{
    public c p;
    public ProfileParam q;
    public User r;
    public boolean s;

    public void v0(){
       super();
    }
    public void E8(){
       String str1;
       boolean b = PatchProxy.applyVoid(null, this, v0.class, "2");
       if (b) {
          return;
       }
       v0 tq = this.q;
       String str = "mParam";
       if (tq == null) {
          a.S(str);
       }
       PhotoAdvertisement photoAdverti = k.B(tq.mReferPhoto);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mScheme;
          if (photoAdverti != null) {
          label_0029 :
             objectRef.element = photoAdverti;
             tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             if (k.y(tq.mReferPhoto, "enableAutoJumpToChatPage", false) && !TextUtils.x(objectRef.element)) {
                str1 = TextUtils.c(objectRef.element, "pageStyle", "1");
                a.o(str1, "TextUtils.addOrReplacePa¡­geStyle\",\n      \"1\"\n    \)");
                objectRef.element = str1;
                tq = this.p;
                if (tq == null) {
                   a.S("mLoadState");
                }
                this.X7(tq.e().subscribe(new v0$a(this, objectRef)));
             }
             return;
          }
       }
       str1 = "";
       goto label_0029 ;
    }
    public final void P8(){
       boolean b = PatchProxy.applyVoid(null, this, v0.class, "3");
       if (b) {
          return;
       }
       v0 tq = this.q;
       if (tq == null) {
          a.S("mParam");
       }
       ProfileParam mReferPhoto = tq.mReferPhoto;
       if (mReferPhoto != null) {
          QPhoto mEntity = mReferPhoto.mEntity;
          if (mEntity != null) {
             i0.a().e(2, mEntity).d(v0$b.b).a();
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "1")) {
          return;
       }
       Object obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.p = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.q = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.r = obj;
       return;
    }
}
