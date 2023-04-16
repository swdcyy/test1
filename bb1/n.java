package bb1.n;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import kb1.d;
import bb1.i;
import java.lang.Class;
import erd.g;
import crd.b;
import eoc.f;
import kb1.e;
import bb1.k;
import kb1.a;
import bb1.h;
import kb1.b;
import bb1.j;
import kb1.c;
import bb1.m;
import kb1.f;
import bb1.l;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import d61.h0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.common.base.Optional;
import k2b.u1;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import androidx.fragment.app.Fragment;
import cb1.c;
import cb1.b;
import brd.t;
import cjd.e;
import erd.o;
import bb1.n$b;
import erd.a;
import bb1.n$a;
import sfc.a;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import lnc.b9;

public class n	// class@00033d
{
    public String a;
    public String b;
    public ArrayList c;
    public ArrayList d;
    public ArrayMap e;
    public boolean f;
    public b g;
    public b h;
    public b i;
    public b j;
    public b k;
    public b l;

    public void n(String p0,String p1){
       super();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = new ArrayMap();
       this.a = p0;
       this.b = p1;
       this.g = f.a(d.class, new i(this));
       this.h = f.a(e.class, new k(this));
       this.i = f.a(a.class, new h(this));
       this.j = f.a(b.class, new j(this));
       this.k = f.a(c.class, new m(this));
       this.l = f.a(f.class, new l(this));
    }
    public static void c(int p0,String p1,String p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, n.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = h0.a(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.userPackage = userPackage;
       if (!TextUtils.x(p2)) {
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.identity = Optional.fromNullable(p2).or("");
          uContentPack.liveStreamPackage = liveStreamPa;
       }
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
    public LiveApiParams$AssistantType a(UserProfile p0){
       LiveApiParams$AssistantType obj = PatchProxy.applyOneRefs(p0, this, n.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b(p0.mProfile.mId);
       if (obj == LiveApiParams$AssistantType.AUDIENCE) {
          obj = LiveApiParams$AssistantType.fromInt(p0.mProfile.getAssistantType());
       }
       return obj;
    }
    public LiveApiParams$AssistantType b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((this.b).equals(p0)) {
          return LiveApiParams$AssistantType.PUSHER;
       }
       if (this.d.contains(p0)) {
          return LiveApiParams$AssistantType.SUPER_ADMIN;
       }
       if (this.c.contains(p0)) {
          return LiveApiParams$AssistantType.ADMIN;
       }
       return LiveApiParams$AssistantType.AUDIENCE;
    }
    public void d(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       this.f = true;
       b.b().m(this.a).map(new e()).doFinally(new n$b(this)).subscribe(new n$a(this, p0), new a(p0.getActivity()));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, n.class, "11")) {
          return;
       }
       b9.a(this.g);
       b9.a(this.h);
       b9.a(this.i);
       b9.a(this.j);
       b9.a(this.k);
       b9.a(this.l);
       return;
    }
}
