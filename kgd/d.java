package kgd.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kgd.d$a;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.util.rx.RxBus;
import lgd.c;
import brd.t;
import kgd.d$b;
import erd.g;
import crd.b;
import lgd.b;
import kgd.d$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment;
import com.kwai.framework.model.user.QCurrentUser;
import ghd.v;
import e17.i;
import ekd.m1;

public final class d extends PresenterV2	// class@001787
{
    public TextView p;
    public final d$a q;

    public void d(){
       super();
       this.q = new d$a(this);
    }
    public static final TextView P8(d p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("entrySubText");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.m8().setOnClickListener(this.q);
       d tp = this.p;
       String str = "entrySubText";
       if (tp == null) {
          a.S(str);
       }
       tp.setVisibility(0);
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       j.d(tp, this.R8());
       RxBus f = RxBus.f;
       this.X7(f.f(c.class).subscribe(new d$b(this)));
       this.X7(f.f(b.class).subscribe(new d$c(this)));
       return;
    }
    public final boolean R8(){
       QCurrentUser obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (SettingPageExperiment.a()) {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (obj.getMessagePrivacy() != 3) {
          label_003d :
             b = false;
          }
       }else {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (obj.getMessagePrivacy() != 3 || v.a()) {
          }
       }
       return b;
    }
    public final void S8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "7")) {
          return;
       }
       int i = (p0)? 0x7f1046c1: 0x7f1046c0;
       i.a(R.style.arg_RES_7f11066a, i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.entry_sub_text);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.entry_sub_text\)");
       this.p = p0;
       return;
    }
}
