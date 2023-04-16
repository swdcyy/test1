package f22.m;
import androidx.fragment.app.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.widget.SingleSwitchPanel;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.widget.SingleSwitchPanel$a;
import f22.j;
import java.util.Objects;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import f22.h;
import f22.i;
import erd.g;
import crd.b;

public final class m	// class@002850
{
    public final String a;
    public final a b;
    public SingleSwitchPanel c;
    public final c d;
    public final e0 e;
    public final ClientContent$LiveStreamPackage f;
    public final ClientContent$LiveVoicePartyPackageV2 g;
    public final String h;
    public final String i;
    public final String j;

    public void m(c p0,e0 p1,ClientContent$LiveStreamPackage p2,ClientContent$LiveVoicePartyPackageV2 p3,String p4,String p5,String p6){
       a.p(p0, "fragmentManager");
       a.p(p2, "liveStreamPackage");
       a.p(p4, "source");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.a = "GuestInvitingFriendsSettingHandler";
       this.b = new a();
    }
    public final void a(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "1")) {
          return;
       }
       LiveLogTag gUEST_INVITE = LiveLogTag.GUEST_INVITE_FRIENDS;
       b.Z(gUEST_INVITE, this.a+" showSettingPanel");
       if (this.c == null) {
          String str = a1.p(R.string.arg_RES_7f102308);
          a.o(str, "CommonUtil.string\(R.stri¡­o_invite_friends_setting\)");
          String str1 = a1.p(R.string.arg_RES_7f10230a);
          a.o(str1, "CommonUtil.string\(R.stri¡­iends_setting_item_title\)");
          String str2 = a1.p(R.string.arg_RES_7f102309);
          a.o(str2, "CommonUtil.string\(R.stri¡­setting_item_description\)");
          j oj = PatchProxy.apply(objArray, this, om, "3");
          if (oj != PatchProxyResult.class) {
          }else {
             oj = new j(this);
          }
          this.c = new SingleSwitchPanel(str, str1, str2, oj);
       }
       m tc = this.c;
       a.m(tc);
       m td = this.d;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(td, tc, SingleSwitchPanel.class, "5")) {
          a.p(td, "fragmentManager");
          tc.show(td, tc.s);
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "4")) {
          b.Z(gUEST_INVITE, this.a+" fetchAutoInvitationSetting");
          this.b.c(e.a().m0().map(new e()).subscribeOn(d.a).subscribe(new h(this), new i(this)));
       }
       return;
    }
}
