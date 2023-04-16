package ox0.l;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import rd1.d;
import java.lang.Object;
import crd.a;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import ox0.j;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import lnc.b9;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import qs5.d;
import android.content.Context;
import gxc.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import ox0.b;
import brd.w;
import erd.h;
import ox0.i;
import ox0.k;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.android.schedulers.a;
import android.app.Dialog;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.UserInfo;
import kz6.g;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.widget.TextView;
import b61.b;
import java.lang.CharSequence;
import kz6.f$a;
import nz6.a;
import ox0.l$b;
import android.content.DialogInterface$OnClickListener;
import ox0.l$a;
import ox0.a;
import android.content.DialogInterface$OnDismissListener;
import ox0.l$c;
import kz6.a$b;
import rd1.c0;
import com.kwai.framework.model.user.QCurrentUser;
import kz6.f;
import ox0.c;
import android.view.Window;
import ox0.h;
import ox0.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import w07.n;
import w07.l;
import w07.i;
import android.net.Uri;
import ox0.f;
import u07.u;
import lnc.a1;
import ox0.e;
import ox0.d;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ox0.l$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import u07.t;

public class l	// class@0035c5
{
    public Dialog a;
    public t b;
    public b c;
    public final a d;
    public final String e;
    public final ClientContent$LiveStreamPackage f;
    public final e0 g;
    public final d h;
    public b i;

    public void l(String p0,ClientContent$LiveStreamPackage p1,e0 p2,d p3){
       super();
       this.d = new a();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public final void a(Activity p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, l.class, "8")) {
          return;
       }
       int i = (p1)? 0x7f101efb: 0x7f102b42;
       int i1 = (p1)? 0x7f102d6b: 0x7f102b41;
       String str = "android.permission.RECORD_AUDIO";
       String[] stringArray = (p1)? new String[]{"android.permission.CAMERA",str}: new String[]{str};
       String[] stringArray1 = stringArray;
       j oj = new j(this, p1, p2, p0, stringArray1);
       this.d.c(a.f(p0, i, i1, stringArray1).subscribe(i1, e.b));
       return;
    }
    public void b(Activity p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, l.class, "7")) {
          return;
       }
       b9.a(this.i);
       String str = "live_anchor_plugin";
       if (LiveSnowManager.f() && d.d(str)) {
          this.a(p0, p1, p2);
       }else {
          this.i = t.combineLatest(LiveSnowManager.h(false, p0), d.a(str, 40), qa.s(b.class, LoadPolicy.DIALOG).d0(), b.a).subscribe(new i(this, p0, p1, p2), k.b);
       }
       return;
    }
    public t c(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.interval(1, TimeUnit.SECONDS).take((long)p0).observeOn(a.c());
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       b9.a(this.i);
       if (this.g()) {
          this.a.dismiss();
          this.a = null;
       }
       if (this.h()) {
          this.b.o();
          this.b = null;
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       b9.a(this.c);
       this.h.p9(3);
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g() || this.h())? true: false;
       return b;
    }
    public final boolean g(){
       l obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null && obj.isShowing())? true: false;
       return b;
    }
    public final boolean h(){
       l obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && obj.K())? true: false;
       return b;
    }
    public void i(Activity p0,UserInfo p1,int p2,boolean p3,boolean p4){
       f$a a;
       l te;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(l.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, l.class, "4")) {
             return;
          }
       }
       g og = (p0 instanceof g)? p0: null;
       if (og != null) {
          View view = a.a(p0, R.layout.arg_RES_7f0d0aad);
          g.d(view.findViewById(R.id.avatar), p1, HeadImageSize.MIDDLE);
          view.findViewById(R.id.live_chat_user_name).setText(b.c(p1));
          TextView textView = view.findViewById(R.id.live_chat_invitation_tips);
          int i2 = (p4)? 0x7f101f2f: 0x7f101f2e;
          textView.setText(i2);
          if (p2 < 0 || p2 > 0x2710) {
             p2 = 30;
          }
          int i3 = 0x7f101f2d;
          i2 = (p3)? 0x7f101f2c: 0x7f101f2d;
          f$a uoa = a.b(p0, og, R.style.arg_RES_7f110333);
          uoa.b(i1);
          uoa.c(R.string.arg_RES_7f101f42, new l$b(this));
          uoa.e(i2, R.drawable.arg_RES_7f0801c8, new l$a(this, p0, p3, p4));
          uoa.d(new a(this));
          uoa.h(view);
          if (p3) {
             a = uoa.a;
             a.w = a.a.getText(i3);
             a = uoa.a;
             a.i = 0x7f0801c8;
             a.I = new l$c(this, p0, p4);
             te = this.e;
             c0 uoc0 = c0.class;
             if (!PatchProxy.isSupport(uoc0) || !PatchProxy.applyVoidTwoRefs(te, Boolean.valueOf(p4), null, uoc0, "34")) {
                i3 = (p4)? 1812: 1817;
                c0.P(i3, QCurrentUser.me().getId(), te);
             }
          }else {
             p0.o = i;
          }
          f uof = uoa.i();
          this.a = uof;
          uof.setOnDismissListener(new c(this));
          if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, l.class, "9")) {
             te = this.a;
             if (te != null && te.isShowing()) {
                this.c = this.c(p2).subscribe(new h(this, p2, this.a.getWindow().findViewById(0x102001a)), new g(this));
             }
          }
       }else {
          b.c0(LiveLogTag.CHAT, "current context is not AlertDialogHandler", "activity", p0);
       }
    label_0152 :
       return;
    }
    public void j(Activity p0,UserInfo p1,int p2,boolean p3,boolean p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ol, "5")) {
             return;
          }
       }
       d uod = new d(p0);
       uod.b1(KwaiDialogOption.e);
       uod.V0(1);
       uod.a0(new n());
       uod.a0(new i());
       uod.E0(R.dimen.arg_RES_7f07034c, 0x7f07034c, R.dimen.arg_RES_7f07034c, 0x7f07034c);
       uod.G0(Uri.parse(p1.mHeadUrl));
       uod.X0(b.c(p1));
       int i = (p3)? 0x7f1017b4: 0x7f1017ab;
       uod.y0(i);
       i = (p3)? 0x7f1002aa: 0x7f104fd6;
       uod.S0(i);
       uod.u0(new f(this, p3, p0, p4));
       uod.R0(a1.r(R.string.arg_RES_7f101e3c, String.valueOf(p2)));
       uod.t0(new e(this, p3));
       uod.J(new d(this));
       uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d0a03));
       this.b = uod.Y(new l$d(this, p2));
       return;
    }
}
