package a1d.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import v0d.m;
import a1d.k$d;
import a1d.k$e;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageButton;
import android.widget.EditText;
import a1d.a;
import android.view.View$OnClickListener;
import a1d.b;
import a1d.e;
import a1d.g;
import a1d.c;
import a1d.f;
import a1d.d;
import a1d.k$a;
import android.text.TextWatcher;
import a1d.k$b;
import android.view.View$OnFocusChangeListener;
import a1d.k$c;

public class k extends PresenterV2	// class@000039
{
    public EditText A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final m G;
    public WeakReference H;
    public final g I;
    public m$b J;
    public final String p;
    public View q;
    public KwaiActionBar r;
    public ImageButton s;
    public View t;
    public TextView u;
    public View v;
    public TextView w;
    public SlipSwitchButton x;
    public ProgressFragment y;
    public EditText z;

    public void k(String p0,BaseFragment p1){
       super();
       this.D = false;
       this.E = false;
       this.F = false;
       this.G = new m();
       this.I = new k$d(this);
       this.J = new k$e(this);
       this.p = p0;
       this.H = new WeakReference(p1);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.x.setSwitch(true);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k.class, "18")) {
          return;
       }
       this.G.a();
       if (this.y != null) {
          this.R8();
       }
       return;
    }
    public void P8(String p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "12")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, ok, "13");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): ("+86").equals(TextUtils.H(this.u).toString());
       boolean b1 = true;
       if (b) {
          if (p0.length() != 11) {
             b1 = false;
          }
          this.D = b1;
       }else if(p0.length()){
          b1 = false;
       }
       this.D = b1;
       this.S8();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, k.class, "17")) {
          return;
       }
       k ty = this.y;
       if (ty != null) {
          try{
             ty.dismiss();
          }catch(java.lang.Exception e0){
             Log.d("Box.Dismiss.Exceptions", Log.f(e0));
          }
          this.y = null;
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, k.class, "14")) {
          return;
       }
       boolean b = (this.D != null && this.E != null)? true: false;
       this.v.setEnabled(b);
       this.w.setEnabled(b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a36a4);
       this.r = m1.f(p0, 0x7f0a3f6a);
       this.s = m1.f(p0, 0x7f0a1716);
       this.t = m1.f(p0, 0x7f0a09b5);
       this.u = m1.f(p0, 0x7f0a09b7);
       this.v = m1.f(p0, 0x7f0a08fb);
       this.w = m1.f(p0, 0x7f0a08fc);
       this.x = m1.f(p0, 0x7f0a36fe);
       this.z = m1.f(p0, 0x7f0a3000);
       this.A = m1.f(p0, 0x7f0a43cc);
       this.B = m1.f(p0, 0x7f0a43db);
       this.C = m1.f(p0, 0x7f0a0744);
       this.r.q(R.string.arg_RES_7f1002cf);
       this.u.setText("+86");
       this.v.setEnabled(false);
       this.w.setEnabled(false);
       m1.a(p0, new a(this), R.id.root_view);
       m1.a(p0, new b(this), R.id.left_btn);
       m1.a(p0, new e(this), R.id.country_code_layout);
       m1.a(p0, new g(this), R.id.confirm_btn);
       m1.a(p0, new c(this), R.id.save_switch);
       m1.a(p0, new f(this), R.id.verify_tv);
       m1.a(p0, new d(this), R.id.clear_layout);
       m1.e(p0, new k$a(this), R.id.phone_edit);
       m1.c(p0, new k$b(this), R.id.phone_edit);
       m1.e(p0, new k$c(this), R.id.verify_et);
       return;
    }
}
