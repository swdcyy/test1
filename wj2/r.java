package wj2.r;
import im8.g;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.core.show.profilecard.statistics.LiveAnchorStatisticInfo;
import kg1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import kg1.a;
import p91.m;
import t02.a0;
import t02.r1;
import cf2.c;
import cf2.b;
import cf2.a;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import wj2.k0;
import java.util.Map;
import java.util.HashMap;

public class r implements g	// class@0049be
{
    public User b;
    public GifshowActivity c;
    public LiveProfileParams d;
    public Fragment e;
    public LivePlayLogger f;
    public n0 g;
    public o0 h;
    public d i;
    public l0 j;
    public o k;
    public m l;
    public LiveProfileMode m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;
    public final MutableLiveData q;
    public LiveAnchorStatisticInfo r;
    public k s;
    public boolean t;
    public boolean u;
    public boolean v;
    public a0 w;
    public r1 x;
    public a y;

    public void r(){
       super();
       this.n = new MutableLiveData();
       this.o = new MutableLiveData();
       this.p = new MutableLiveData();
       this.q = new MutableLiveData();
       this.r = new LiveAnchorStatisticInfo();
    }
    public b a(){
       b obj = PatchProxy.apply(null, this, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.getFansGroupServiceSupplier();
       if (obj != null) {
          return obj;
       }
       return new a();
    }
    public m b(){
       r tw = this.w;
       if (tw != null) {
          return tw.Z2;
       }
       tw = this.x;
       if (tw != null) {
          return tw.v;
       }
       return null;
    }
    public c c(){
       m obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       if (obj != null) {
          return new b(obj, this.w);
       }
       c logInfoSuppl = this.d.getLogInfoSupplier();
       if (logInfoSuppl != null) {
          return logInfoSuppl;
       }
       return new a();
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getUserProfile().mProfile.mId;
    }
    public boolean e(){
       r tm = this.m;
       boolean b = (tm == LiveProfileMode.LITE_SPECIAL_ROLE || tm == LiveProfileMode.LITE_AUDIENCE_VIEW_OTHERS)? true: false;
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r.class, new k0());
       }else {
          obj.put(r.class, null);
       }
       return obj;
    }
}
