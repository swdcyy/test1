package lh.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lh.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nh.c;
import java.lang.Boolean;
import android.widget.Button;
import android.view.View$OnClickListener;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lnc.i3;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import ekd.m1;

public class a extends PresenterV2	// class@00255b
{
    public Button p;
    public BaseFragment q;
    public m r;

    public void a(){
       super();
       this.r = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       boolean b = c.a();
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "4")) {
          this.p.setVisibility(0);
          this.p.setOnClickListener(this.r);
          if (!b) {
             this.p.setText(R.string.arg_RES_7f1007e9);
          }else {
             this.p.setText(R.string.arg_RES_7f1007e8);
          }
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SUBMIT_BUTTON";
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = this.q.o();
          i3 oi3 = i3.f();
          oi3.d("button_name", this.p.getText().toString());
          oi3.d("is_open", (String.valueOf(b)).toUpperCase());
          uElementPack.params = oi3.e();
          u1.y0(urlPackage, 3, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a078c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
