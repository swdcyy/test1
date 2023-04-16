package a1d.q0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w0d.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import android.widget.Button;
import a1d.o0;
import android.view.View$OnClickListener;
import a1d.p0;
import im8.f;
import java.util.ArrayList;
import com.kwai.feature.api.social.login.model.AuthSource;
import java.util.HashMap;
import java.lang.Boolean;
import mrd.c;

public class q0 extends PresenterV2	// class@00004a
{
    public f A;
    public Button B;
    public Button C;
    public View D;
    public g E;
    public c p;
    public f q;
    public f r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public String v;
    public AuthSource w;
    public String x;
    public HashMap y;
    public boolean z;

    public void q0(g p0){
       super();
       this.E = p0;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "3")) {
          return;
       }
       this.E = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a353f);
       this.C = m1.f(p0, 0x7f0a08fb);
       this.D = m1.f(p0, 0x7f0a3307);
       m1.a(p0, new o0(this), R.id.refuse_btn);
       m1.a(p0, new p0(this), R.id.confirm_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       this.q = this.x8("AUTH_INFO_RESPONSE");
       this.r = this.x8("CURRENT_SHOW_SCOPE");
       this.s = this.r8("GRANT_SCOPE_LIST");
       this.t = this.r8("DENY_SCOPE_LIST");
       this.v = this.r8("PARAM_APP_ID");
       this.w = this.r8("AUTH_SOURCE");
       this.x = this.r8("PARAM_REQUEST_SCOPE");
       this.y = this.r8("SELECT_INDEX_MAP");
       this.z = this.r8("IS_HALF_SCREEN_AUTH_SHOW").booleanValue();
       this.A = this.x8("FOLLOW_SELECTED");
       this.u = this.r8("POLICY_STATE");
       this.p = this.t8("PROTOCOL_BUBBLE_SUBJECT");
       return;
    }
}
