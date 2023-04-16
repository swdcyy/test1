package ba2.f$a$a;
import android.view.View$OnClickListener;
import ba2.f$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ba2.f;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import ba2.v;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ba2.i;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.u1;

public class f$a$a implements View$OnClickListener	// class@00038d
{
    public final f$a b;

    public void f$a$a(f$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       Object[] objArray1;
       ClientContent$ContentPackage uContentPack;
       ClientContent$UserPackage userPackage;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, f$a$a.class, "1")) {
          return;
       }
       f$a$a b = obj.b;
       f w = b.s.w;
       if (w != null) {
          UserProfile userProfile = new UserProfile(b.q);
          LiveStreamClickType lIVE_DISTRIC = LiveStreamClickType.LIVE_DISTRICT_RANK;
          int i = 7;
          boolean b1 = false;
          int i1 = 5;
          int i2 = (obj.b.s.A != i1)? 76: 176;
          w.w0(userProfile, lIVE_DISTRIC, i, b1, i2);
          String str = obj.b.s.w.d();
          String liveStreamId = obj.b.s.w.getLiveStreamId();
          f$a$a b2 = obj.b;
          f$a s = b2.s;
          f x = s.x;
          f z = s.z;
          f y = s.y;
          UserInfo mId = b2.q.mId;
          String str1 = v.a(s.A);
          String str2 = (TextUtils.x(obj.b.s.B))? "": obj.b.s.B;
          int i3 = 4;
          if (PatchProxy.isSupport(i.class)) {
             Object[] objArray = new Object[]{str,liveStreamId,Integer.valueOf(x),z,Integer.valueOf(y),mId,str1,str2};
             if (!PatchProxy.applyVoid(objArray, null, i.class, "6")) {
             }
          }else {
          }
       }
    label_0108 :
       return;
    }
}
