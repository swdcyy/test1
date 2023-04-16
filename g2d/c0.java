package g2d.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.LoginParams;
import k1d.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import p1d.b;
import q1d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.HashMap;
import java.util.Map;
import brd.t;
import g2d.b0;
import g2d.a0;
import erd.g;
import crd.b;
import h3b.a;
import oe6.e;
import oe6.b;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import g2d.y;
import n3d.a;
import e17.i;
import z2d.f;
import g2d.w;
import ov5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import v0d.g;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import mrd.c;

public class c0 extends PresenterV2	// class@00258b
{
    public View p;
    public KwaiImageView q;
    public c r;

    public void c0(){
       super();
    }
    public static void P8(String p0,String p1,Activity p2,LoginParams p3,e p4){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoc0, "5")) {
             return;
          }
       }
       if (TextUtils.x(p0)) {
          p4.c(1);
          return;
       }else {
          a.a(5).b(p2, new HashMap()).subscribe(new b0(p1, p4), new a0(p2, p3, p1, p4));
          return;
       }
    }
    public static void R8(Activity p0,LoginParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c0.class, "7")) {
          return;
       }
       c0.S8(p0, p1, null);
       return;
    }
    public static void S8(Activity p0,LoginParams p1,e p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c0.class, "8")) {
          return;
       }
       int i = a.c();
       boolean b = false;
       if (c0.X8()) {
          if (i == 11) {
             b = true;
          }
          p1.mIsPasswordLogin = b;
       }else if(e.i()){
          p1.mIsPasswordLogin = b;
       }else if(b.A() == 2){
          b = true;
       }
       p1.mIsPasswordLogin = b;
       p1.mCurrentPhoneInput = true;
       LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.PHONE_LOGIN);
       loginPageLau.b(p0);
       loginPageLau.g(p1);
       loginPageLau.h(new y(p2));
       loginPageLau.f();
       i.a(R.style.arg_RES_7f110668, 0x7f103bf9);
       return;
    }
    public static void W8(Object p0,Activity p1,LoginParams p2,e p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c0.class, "4")) {
          return;
       }
       if (!f.o()) {
          f.s(p1, new w(p1, p2, p3), 1);
       }else {
          c0.P8(f.m(), f.j(p1), p1, p2, p3);
       }
       return;
    }
    public static boolean X8(){
       Object obj = PatchProxy.apply(null, null, c0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = a.c();
       i = (i == 11 || i == 12)? true: false;
       return i;
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, c0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return g.f(this.q);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.p = p0;
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.protocol_checkbox);
       this.q = kwaiImageVie;
       kwaiImageVie.setSelected(false);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.r = this.t8("KEY_CLICK_PROTOCOL_BUBBLE_SUBJECT");
       return;
    }
}
