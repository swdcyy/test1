package h33.y;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import h33.j;
import java.lang.Runnable;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import h33.m;
import java.util.concurrent.Callable;
import h33.i;
import erd.o;
import t45.d;
import brd.z;
import java.lang.Integer;
import u07.t$a;
import android.app.Activity;
import h33.l;
import u07.u;
import h33.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import h33.a;
import h33.t;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h33.q;
import h33.r;
import com.yxcorp.gifshow.bean.ContactInfo;
import com.yxcorp.gifshow.b;
import cjd.e;
import h33.y$a;
import h33.y$b;
import erd.g;
import crd.b;
import java.lang.Exception;

public class y	// class@002c36
{
    public int a;
    public GifshowActivity b;
    public h c;
    public String d;
    public static final ContactPermissionHolder e;

    static {
       y.e = new ContactPermissionHolder(new b(new c()));
    }
    public void y(GifshowActivity p0){
       super();
       this.b = p0;
    }
    public void a(SlipSwitchButton p0,boolean p1){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oy, "9")) {
          return;
       }
       p0.setOnSwitchChangeListener(null);
       p0.setSwitch(p1);
       p0.setOnSwitchChangeListener(p0.getOnSwitchChangeListener());
       return;
    }
    public final void b(SlipSwitchButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "15")) {
          return;
       }
       y.e.h(this.b, new j(this, p0));
       return;
    }
    public final t c(){
       Object obj = PatchProxy.apply(null, this, y.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(m.b).onErrorReturn(i.b).subscribeOn(d.c).observeOn(d.a);
    }
    public boolean d(int p0,SlipSwitchButton p1){
       t$a uoa;
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oy, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       switch (p0){
           case 141:
             if (!PatchProxy.applyVoidOneRefs(p1, this, oy, "12")) {
                uoa = new t$a(this.b);
                uoa.W0(R.string.arg_RES_7f104944);
                uoa.y0(R.string.arg_RES_7f104945);
                uoa.S0(R.string.arg_RES_7f104942);
                uoa.Q0(R.string.cancel);
                uoa.t0(new a(this, p1));
                uoa.u0(new t(this, p1));
                uoa.z(false);
                j.d(uoa);
             }
             break;
           case 142:
             this.b(p1);
             break;
           case 143:
             if (!PatchProxy.applyVoidOneRefs(p1, this, oy, "13")) {
                uoa = new t$a(this.b);
                uoa.W0(R.string.arg_RES_7f1003a7);
                uoa.y0(R.string.arg_RES_7f104940);
                uoa.S0(R.string.arg_RES_7f1012ab);
                uoa.Q0(R.string.cancel);
                uoa.t0(new l(this, p1));
                uoa.u0(new u(this, p1));
                uoa.z(false);
                j.d(uoa);
             }
             break;
           default:
             return false;
       }
    label_00a0 :
       return true;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, y.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.d, "not_recommend_to_contacts");
    }
    public void f(SlipSwitchButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "18")) {
          return;
       }
       t$a uoa = new t$a(this.b);
       uoa.W0(R.string.arg_RES_7f104943);
       uoa.S0(R.string.arg_RES_7f1042cc);
       uoa.Q0(R.string.cancel);
       uoa.t0(new q(this, p0));
       uoa.u0(new r(this, p0));
       j.d(uoa);
       return;
    }
    public final void g(ContactInfo p0,SlipSwitchButton p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y.class, "16")) {
          return;
       }
       if (!y.e.d()) {
          return;
       }
       try{
          b.e(p0).map(new e()).subscribe(new y$a(this), new y$b(this, p1));
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
