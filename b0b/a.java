package b0b.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.screencast.ScreencastStatus;
import kotlin.jvm.internal.a;
import q2b.h$b;

public final class a	// class@000347
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;

    public void a(){
       super();
       this.f = true;
       this.i = "NORMAL";
       this.j = "NORMAL";
    }
    public final void a(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PROJECTION_SCREEN_POPUP_BANNER";
       i3 oi3 = i3.f();
       oi3.d("is_find_kstv", this.j(p0));
       oi3.d("is_find_normal_tv", this.j(p1));
       uElementPack.params = oi3.e();
       u1.M("", null, 1, uElementPack, null, null);
       return;
    }
    public final void b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "17")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VIEW_RESOLVE_WAY_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("is_ks_tv", this.j(p0));
       oi3.d("reason", this.i);
       uElementPack.params = oi3.e();
       u1.M("", null, 1, uElementPack, null, null);
       return;
    }
    public final void c(String p0,String p1,ScreencastStatus p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "13")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "deviceType");
       a.p(p2, "status");
       if (p2 == ScreencastStatus.START || p2 == ScreencastStatus.PAUSE) {
       label_003a :
          str = "ING";
       }else if(p2 == ScreencastStatus.UNSTART || p2 == ScreencastStatus.END){
          str = "BEGIN";
       }else if(p2 == ScreencastStatus.BREAK){
          str = "STOP";
       }else {
          goto label_003a ;
       }
       super();
       this.action2 = "PROJECTION_SCREEN_POPUP_DEVICE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("button_name", p0);
       oi3.d("device_type", p1);
       oi3.d("type", str);
       this.params = oi3.e();
       u1.M("", null, 1, this, null, null);
       return;
    }
    public final void d(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "11")) {
          return;
       }
       a.p(p0, "buttonName");
       a.p(p1, "type");
       super();
       this.action2 = "PROJECTION_SCREEN_CHOOSE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("button_name", p0);
       oi3.d("type", p1);
       oi3.d("is_ks_tv", this.j(p2));
       oi3.d("reason", this.i);
       this.params = oi3.e();
       u1.M("", null, 1, this, null, null);
       return;
    }
    public final void e(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "16")) {
          return;
       }
       a.p(p0, "buttonName");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PROJECTION_SCREEN_CLARITY_OPTION_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("is_ks_tv", this.j(p1));
       oi3.d("button_name", p0);
       oi3.d("reason", this.i);
       uElementPack.params = oi3.e();
       u1.M("", null, 1, uElementPack, null, null);
       return;
    }
    public final void f(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, a.class, "6")) {
          return;
       }
       a.p(p0, "deviceType");
       String str = "TRUE";
       String str1 = "FALSE";
       String str2 = (p1)? str: str1;
       if (!p2) {
          str = str1;
       }
       super();
       this.action2 = "SCREEN_PROJECTION_FRESH_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("is_find_kstv", str2);
       oi3.d("is_find_normal_tv", str);
       oi3.d("device_type", p0);
       this.params = oi3.e();
       u1.M("", null, 1, this, null, null);
       return;
    }
    public final void g(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       a.p(p0, "isFindKwaiDevice");
       a.p(p1, "isFindNormalDevice");
       h$b uob = h$b.e(1, "SCREEN_PROJECTION_POPUP_TYPE");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("is_find_kstv", p0);
       oi3.d("is_find_normal_tv", p1);
       uElementPack.params = oi3.e();
       a.o(uob, "taskEventBuilder");
       uob.k(uElementPack);
       u1.p0("", null, uob);
       return;
    }
    public final void h(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       this.d = p0;
       if (!p0 && this.e != null) {
          return;
       }
       this.e = true;
       String str = "TRUE";
       String str1 = (p0)? str: "FALSE";
       if (this.b == null) {
          str = (this.c != null)? "FALSE": "ING";
       }
    label_003c :
       this.g(str1, str);
       return;
    }
    public final void i(boolean p0){
       String str1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = p0;
       if (!p0 && this.c != null) {
          return;
       }
       this.c = true;
       String str = "FALSE";
       if (this.d != null) {
          str1 = "TRUE";
       }else if(this.e != null){
          str1 = str;
       }else {
          str1 = "ING";
       }
       if (p0) {
          str = "TRUE";
       }
       this.g(str1, str);
       return;
    }
    public final String j(boolean p0){
       String str = (p0)? "TRUE": "FALSE";
       return str;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       this.a = true;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SCREEN_PROJECTION_POPUP";
       u1.D0("", null, 3, uElementPack, null, null);
       return;
    }
    public final void l(){
       this.i = this.j;
    }
    public final void m(){
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = false;
       this.g = false;
       this.h = false;
       this.e = false;
       this.i = "NORMAL";
       this.j = "NORMAL";
    }
    public final void n(){
       this.h = false;
       this.e = false;
    }
    public final void o(){
       this.b = false;
       this.c = false;
    }
    public final void p(boolean p0){
       this.f = p0;
    }
    public final void q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.p(p0, "reason");
       this.j = p0;
       return;
    }
    public final void r(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "5")) {
          return;
       }
       a.p(p0, "type");
       h$b uob = h$b.e(1, "SCREEN_PROJECTION_SCREEN_TYPE");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("type", p0);
       oi3.d("reason", this.i);
       p0 = (p1)? "TRUE": "FALSE";
       oi3.d("is_ks_tv", p0);
       uElementPack.params = oi3.e();
       a.o(uob, "taskEventBuilder");
       uob.k(uElementPack);
       u1.p0("", null, uob);
       return;
    }
    public final void s(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "10")) {
          return;
       }
       a.p(p0, "btnName");
       a.p(p1, "type");
       super();
       this.action2 = "PROJECTION_SCREEN_CHOOSE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("button_name", p0);
       oi3.d("type", p1);
       p0 = (p2)? "TRUE": "FALSE";
       oi3.d("is_ks_tv", p0);
       this.params = oi3.e();
       u1.D0("", null, 3, this, null, null);
       return;
    }
    public final void t(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "15")) {
          return;
       }
       a.p(p0, "buttonName");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PROJECTION_SCREEN_CLARITY_OPTION_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("is_ks_tv", this.j(p1));
       oi3.d("button_name", p0);
       oi3.d("reason", this.i);
       uElementPack.params = oi3.e();
       u1.D0("", null, 3, uElementPack, null, null);
       return;
    }
}
