package c3c.a;
import com.kwai.page.component.b;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vd7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c3c.b;
import java.lang.ref.WeakReference;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import org.greenrobot.eventbus.a;
import ee7.d;
import c3c.a$a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.page.component.load.LoadState;
import com.google.common.collect.ArrayListMultimap;
import qk.g0;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import brd.t;
import c3c.a$b;
import erd.o;
import c3c.a$c;
import erd.g;
import crd.b;
import crd.a;
import com.kwai.page.component.ComponentException;
import ge7.b;
import com.yxcorp.gifshow.profile.components.common.tag.ProfileHeadTagUI;
import b66.k$a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.social.startup.relation.model.IntimateRelationConfig;
import java.lang.reflect.Type;
import mw4.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.s1;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import u3c.h;
import com.yxcorp.gifshow.profile.common.model.TagLabel;

public final class a extends b	// class@000516
{
    public boolean n;

    public void a(LifecycleOwner p0){
       a.p(p0, "page");
       super(p0);
    }
    public a d(){
       b uob = PatchProxy.apply(null, this, a.class, "2");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
          LifecycleOwner lifecycleOwn = this.k.get();
          Objects.requireNonNull(lifecycleOwn, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
          if (!PatchProxy.applyVoidOneRefs(lifecycleOwn, uob, b.class, "8")) {
             a.p(lifecycleOwn, "<set-?>");
             uob.g = lifecycleOwn;
          }
       }
       return uob;
    }
    public void k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a.d().p(this);
       b td = this.d;
       Objects.requireNonNull(td);
       b uob1 = PatchProxy.apply(null, td, uob, "1");
       if (uob1 != patchProxyRe) {
       }else {
          uob1 = td.d;
          if (uob1 == null) {
             a.S("mUserProfileState");
          }
       }
       a$a uoa = new a$a(this);
       this.f("addStateObserver");
       uob1.observe(this.k.get(), uoa);
       b td1 = this.d;
       Objects.requireNonNull(td1);
       if (!uob1.getValue() instanceof LoadState) {
          if (td1.b == null) {
             td1.b = ArrayListMultimap.create();
          }
          td1.b.put(uob1, uoa);
          td = this.d;
          Objects.requireNonNull(td);
          uob = PatchProxy.apply(null, td, uob, "13");
          if (uob != patchProxyRe) {
          }else {
             uob = td.k;
             if (uob == null) {
                a.S("mRxPageBus");
             }
          }
          b uob2 = uob.f("PROFILE_INTIMATE_CHANGE").map(a$b.b).subscribe(new a$c(this));
          this.f("addToAutoDisposes");
          uob = this.d;
          if (uob.c == null) {
             uob.c = new a();
          }
          uob.c.c(uob2);
          return;
       }else {
          throw new ComponentException("LoadState 只能由ComponentBuilder监听，组件中不能监听LoadState");
       }
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a.d().t(this);
       return;
    }
    public b n(){
       ProfileHeadTagUI profileHeadT = PatchProxy.apply(null, this, a.class, "1");
       if (profileHeadT != PatchProxyResult.class) {
       }else {
          profileHeadT = new ProfileHeadTagUI(false);
       }
       return profileHeadT;
    }
    public final void onEventMainThread(k$a p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "event");
       if (p0.a == 2) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             return;
          }else {
             ProfileParam mUserProfile = this.d.c().mUserProfile;
             if (mUserProfile != null) {
                if (a.k(IntimateRelationConfig.class) == null) {
                   this.c.g();
                   return;
                }else {
                   boolean b = s1.b(this.d.d(), mUserProfile);
                   if (!b) {
                      this.c.g();
                      return;
                   }else if(b && this.c.f()){
                      return;
                   }else {
                      CommonRoleLabel uCommonRoleL = h.d(mUserProfile);
                      if (uCommonRoleL != null) {
                         TagLabel tagLabel = s1.a(this.d.d(), mUserProfile, uCommonRoleL.mLabelGroup);
                         if (tagLabel != null) {
                            this.c.e(tagLabel);
                            b1 = true;
                         }else {
                            b1 = false;
                         }
                         this.n = b1;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
