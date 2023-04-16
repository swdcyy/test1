package fia.j0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.j0$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import im8.f;
import xha.a;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import bia.h;
import android.view.View;
import fia.j0$b;
import android.view.View$OnClickListener;
import ekd.m1;
import java.lang.Number;

public final class j0 extends PresenterV2	// class@002913
{
    public BaseFragment p;
    public FollowingUserBannerFeed$UserBannerInfo q;
    public int r;
    public a s;
    public f t;
    public String u;
    public String v;
    public h w;
    public static final j0$a x;

    static {
       j0.x = new j0$a(null);
    }
    public void j0(){
       super();
    }
    public final BaseFragment P8(){
       j0 obj = PatchProxy.apply(null, this, j0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mLogPageFragment");
       }
       return obj;
    }
    public final f R8(){
       j0 obj = PatchProxy.apply(null, this, j0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPosition");
       }
       return obj;
    }
    public final a S8(){
       j0 obj = PatchProxy.apply(null, this, j0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mPymiLogger");
       }
       return obj;
    }
    public final int V8(){
       return this.r;
    }
    public final FollowingUserBannerFeed$UserBannerInfo W8(){
       j0 obj = PatchProxy.apply(null, this, j0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mUserBannerInfo");
       }
       return obj;
    }
    public final h X8(){
       j0 obj = PatchProxy.apply(null, this, j0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj == null) {
          a.S("mUserListAdapter");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "16")) {
          return;
       }
       a.p(p0, "view");
       m1.a(p0, new j0$b(this), R.id.pymi_user_container);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       f obj = this.r8("PYMI_LOGPAGE_FRAGMENT");
       a.o(obj, "inject\(FollowAccessIds.PYMI_LOGPAGE_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(FollowingUserBannerFeed$UserBannerInfo.class);
       a.o(obj, "inject\(UserBannerInfo::class.java\)");
       this.q = obj;
       obj = this.r8("PYMI_SOURCE");
       a.o(obj, "inject\(FollowAccessIds.PYMI_SOURCE\)");
       this.r = obj.intValue();
       obj = this.r8("PYMI_LOGGER");
       a.o(obj, "inject\(FollowAccessIds.PYMI_LOGGER\)");
       this.s = obj;
       obj = this.x8("ADAPTER_POSITION");
       a.o(obj, "injectRef\(PageAccessIds.ADAPTER_POSITION\)");
       this.t = obj;
       Object obj1 = this.r8("PYMI_LIST_LOAD_SEQUENCEID");
       a.o(obj1, "inject\(FollowAccessIds.PYMI_LIST_LOAD_SEQUENCEID\)");
       this.u = obj1;
       obj1 = this.r8("PYMI_EXP_TAG");
       a.o(obj1, "inject\(FollowAccessIds.PYMI_EXP_TAG\)");
       this.v = obj1;
       obj1 = this.r8("PYMI_USER_LIST_ADAPTER");
       a.o(obj1, "inject\(FollowAccessIds.PYMI_USER_LIST_ADAPTER\)");
       this.w = obj1;
       return;
    }
}
