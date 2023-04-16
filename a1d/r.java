package a1d.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.io.File;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import w69.i$a;
import w69.b$a;
import w69.b;
import w69.k$a;
import lnc.a1;
import w69.k;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.tbruyelle.rxpermissions2.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.view.View;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageButton;
import android.widget.EditText;
import com.yxcorp.gifshow.image.KwaiImageView;
import a1d.m;
import android.view.View$OnClickListener;
import a1d.o;
import a1d.n;
import a1d.r$a;
import android.text.TextWatcher;
import bn.a;
import a1d.q;
import erd.o;
import a1d.r$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class r extends PresenterV2	// class@000051
{
    public File A;
    public g B;
    public boolean C;
    public boolean D;
    public WeakReference E;
    public final String p;
    public KwaiActionBar q;
    public ImageButton r;
    public View s;
    public View t;
    public View u;
    public TextView v;
    public SlipSwitchButton w;
    public EditText x;
    public KwaiImageView y;
    public ProgressFragment z;

    public void r(String p0,BaseFragment p1){
       super();
       this.A = new File(b.a(-1504323719).o(), "oauth_avatar.png");
       this.C = false;
       this.D = false;
       this.p = p0;
       this.E = new WeakReference(p1);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.w.setSwitch(true);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, r.class, "11")) {
          return;
       }
       if (this.z != null) {
          this.R8();
       }
       return;
    }
    public t P8(){
       Object obj = PatchProxy.apply(null, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b$a uoa = new b$a();
       uoa.c(true);
       k$a uoa1 = new k$a();
       uoa1.f(a1.p(R.string.arg_RES_7f103a83));
       f$a uoa2 = new f$a();
       uoa2.g(a.c);
       uoa2.h(false);
       AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
       uBuilder.p(true);
       return new ImageSelectSupplier(this.getActivity(), this.B, this.A).f(new i$a().a(uoa.a()).m(uoa1.b()).d(uoa2.a()).f(uBuilder.d()).b(), ImageSelectSupplier$ImageSelectType.AVATAR);
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, r.class, "9")) {
          return;
       }
       r tz = this.z;
       if (tz != null) {
          try{
             tz.dismiss();
          }catch(java.lang.Exception e0){
             Log.d("Box.Dismiss.Exceptions", Log.f(e0));
          }
          this.z = null;
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, r.class, "10")) {
          return;
       }
       boolean b = (this.D != null && this.C != null)? true: false;
       this.u.setEnabled(b);
       this.v.setEnabled(b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3f6a);
       this.r = m1.f(p0, 0x7f0a1716);
       this.s = m1.f(p0, 0x7f0a0352);
       this.t = m1.f(p0, 0x7f0a2dd2);
       this.u = m1.f(p0, 0x7f0a08fb);
       this.v = m1.f(p0, 0x7f0a08fc);
       this.w = m1.f(p0, 0x7f0a36fe);
       this.x = m1.f(p0, 0x7f0a2dd0);
       this.y = m1.f(p0, 0x7f0a0333);
       this.q.q(R.string.arg_RES_7f1002ce);
       this.u.setEnabled(false);
       this.v.setEnabled(false);
       m1.a(p0, new m(this), R.id.left_btn);
       m1.a(p0, new o(this), R.id.confirm_btn);
       m1.a(p0, new n(this), R.id.save_switch);
       m1.e(p0, new r$a(this), R.id.nickname);
       this.B = new g(this.getActivity());
       a.b(this.s).flatMap(new q(this)).subscribe(new r$b(this), Functions.d());
       return;
    }
}
