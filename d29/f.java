package d29.f;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import qp7.t0;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import lnc.y0;

public final class f	// class@00203a
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final i3 a(QPhoto p0,boolean p1,AvatarInfoResponse p2,t0 p3,boolean p4){
       AvatarInfoResponse mDynamicEffe;
       Boolean uBoolean;
       int i = 1;
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          p3 = PatchProxy.apply(objArray, this, f.class, "3");
          if (p3 != PatchProxyResult.class) {
             return p3;
          }
       }
       i3 oi3 = i3.f();
       String str = String.valueOf(p1);
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toUpperCase();
       a.o(str, "\(this as java.lang.String\).toUpperCase\(\)");
       oi3.d("is_live", str);
       String str1 = String.valueOf(p4);
       Objects.requireNonNull(str1, "null cannot be cast to non-null type java.lang.String");
       str1 = str1.toUpperCase();
       a.o(str1, "\(this as java.lang.String\).toUpperCase\(\)");
       oi3.d("anthor_is_live_judge", str1);
       oi3.d("head_position", "RIGHT_BAR");
       if (r1.T1(p0.getEntity()) != null) {
          User user = r1.T1(p0.getEntity());
          a.m(user);
          oi3.a("is_favorite", Boolean.valueOf(user.mFavorited));
       }
       String str2 = (p1)? "1": "0";
       oi3.d("live_tag", str2);
       str2 = PatchProxy.applyOneRefs(p2, this, f.class, "4");
       DynamicEffectMarker uDynamicEffe = null;
       if (str2 != PatchProxyResult.class) {
       }else if(p2 != null){
          mDynamicEffe = p2.mDynamicEffectMarker;
          if (mDynamicEffe != null) {
             DynamicEffectMarker mIcon = mDynamicEffe.mIcon;
             if (mIcon != null) {
                if (mIcon.length() <= 0) {
                   i = false;
                }
                uBoolean = Boolean.valueOf(i);
             }else {
                uBoolean = uDynamicEffe;
             }
             if (y0.p(uBoolean) && mDynamicEffe.mIsBlocked == null) {
                str2 = String.valueOf(mDynamicEffe.mStyle);
             }
          }
       }
       DynamicEffectMarker uDynamicEffe1 = uDynamicEffe;
       if (str2 != null) {
          oi3.d("live_type", str2);
       }
       if (p2 != null) {
          mDynamicEffe = p2.mDynamicEffectMarker;
          if (mDynamicEffe != null) {
             uDynamicEffe = mDynamicEffe.mLiveType;
          }
       }
       if (uDynamicEffe != null) {
          oi3.d("live_room_type", uDynamicEffe);
       }
       a.o(oi3, "stringBuilder");
       return oi3;
    }
}
