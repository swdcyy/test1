package bw2.b;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import d61.f0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.util.List;
import java.util.Objects;
import android.text.TextUtils;
import e17.i;

public final class b	// class@00046e
{
    public static final List a;

    static {
       b.a = new ArrayList();
    }
    public void b(){
       super();
    }
    public static int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min(Math.max(p0, p1), p2);
    }
    public static String b(VoicePartyOnlineUser p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object[] obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 != null) {
          p0 = p0.mApplyUserInfo;
          if (p0 != null) {
             String str = b.c(p0);
             int i = 8;
             if (PatchProxy.isSupport(f0.class)) {
                obj = PatchProxy.applyTwoRefs(str, Integer.valueOf(i), obj, f0.class, "10");
                if (obj != patchProxyRe) {
                   str = obj;
                }else if(TextUtils.x(str)){
                   str = "";
                }else if(str.length() <= i){
                   str = TextUtils.A(str, i)+"...";
                }
             }else {
                goto label_0035 ;
             }
             obj1 = new Object[]{str};
             return String.format(a1.p(0x7f102e68), obj1);
          }
       }
       return obj;
    }
    public static List c(VoicePartyTeamPkResult p0,MicSeatsDataManager p1){
       List list;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == VoicePartyTeamPkResult.BLUE_TEAM_WIN) {
          Objects.requireNonNull(p1);
          list = PatchProxy.apply(null, p1, MicSeatsDataManager.class, "15");
          if (list != PatchProxyResult.class) {
          }else {
             list = p1.h(true);
          }
          return list;
       }else if(p0 == VoicePartyTeamPkResult.YELLOW_TEAM_WIN){
          Objects.requireNonNull(p1);
          list = PatchProxy.apply(null, p1, MicSeatsDataManager.class, "17");
          if (list != PatchProxyResult.class) {
          }else {
             list = p1.o(true);
          }
          return list;
       }else {
          return b.a;
       }
    }
    public static void d(VoicePartyOnlineUser p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uob, "4")) {
          return;
       }
       VoicePartyOnlineUser mApplyUserIn = p0.mApplyUserInfo;
       if (mApplyUserIn != null && !TextUtils.isEmpty(mApplyUserIn.mName)) {
          String str = a1.p(R.string.arg_RES_7f102e66);
          Object[] objArray = new Object[2];
          objArray[0] = p0.mApplyUserInfo.mName;
          int i = 1;
          String str1 = (p1 == i)? a1.p(R.string.arg_RES_7f102e77): a1.p(R.string.arg_RES_7f102ded);
          objArray[i] = str1;
          i.d(R.style.arg_RES_7f11066a, String.format(str, objArray));
       }
       return;
    }
}
