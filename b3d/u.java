package b3d.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zf6.k;

public class u	// class@000346
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public void u(){
       super();
       this.a = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/";
       this.b = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/check_risk_st.json";
       this.c = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/check_risk_su.json";
       this.d = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/check_risk_e.json";
       this.e = "https://s1-11322.kwimgs.com/kos/nlav11322/animation/verify_fail_333.json";
       this.f = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/kwai_logo_round.png";
       this.g = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/kwai_logo_round_dark.png";
       this.h = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/circle_p_gray_anim.json";
       this.i = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/circle_p_white_anim.json";
       this.j = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/login_app_icon_corner_k.png";
       this.k = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/login_app_icon_corner_n.png";
       this.l = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/login_start_logo_new.webp";
       this.m = "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/login_start_logo_new_dark.webp";
    }
    public String a(){
       String obj = PatchProxy.apply(null, this, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (k.d())? "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/kwai_logo_round_dark.png": "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/kwai_logo_round.png";
       return obj;
    }
    public String b(int p0){
       if (p0 == 1) {
          return "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/circle_p_gray_anim.json";
       }
       if (p0 == 2) {
          return "https://ali2.a.yximgs.com/kos/nlav10225/net_icon/circle_p_white_anim.json";
       }
       return "";
    }
}
