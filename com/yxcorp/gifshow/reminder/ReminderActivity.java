package com.yxcorp.gifshow.reminder.ReminderActivity;
import je.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import android.content.Intent;
import android.content.Context;
import nec.d;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri$Builder;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import joc.w;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import wh5.c;
import e17.i;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import pu5.a;
import qu5.r;
import ou5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import nec.c;
import ekd.j0;
import nfc.a;
import nu5.b;
import android.os.Parcelable;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.n;
import java.lang.Integer;
import kcc.b;
import wkd.b;
import ncc.g;
import com.yxcorp.gifshow.reminder.ReminderTabHostFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import android.os.Handler;
import kcc.c;
import java.lang.Runnable;

public class ReminderActivity extends GifshowActivity implements a	// class@001a63
{
    public String A;
    public boolean B;
    public BaseFragment C;
    public boolean D;
    public boolean y;
    public Uri z;
    public static final int E;

    public void ReminderActivity(){
       super();
       this.D = true;
    }
    public static void y3(GifshowActivity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(ReminderActivity.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, ReminderActivity.class, "14")) {
          return;
       }
       ReminderActivity.z3(p0, p1, p2, false);
       return;
    }
    public static void z3(GifshowActivity p0,String p1,boolean p2,boolean p3){
       ReminderActivity reminderActi = ReminderActivity.class;
       if (PatchProxy.isSupport(reminderActi) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, ReminderActivity.class, "15")) {
          return;
       }
       Intent intent = new Intent(p0, reminderActi);
       String str = PatchProxy.applyOneRefs(p1, null, d.class, "8");
       if (str != PatchProxyResult.class) {
       }else {
          Objects.requireNonNull(p1);
          int i = -1;
          switch (p1.hashCode()){
              case 0x9acaeb3d:
                if (p1.equals("notice_message_mix")) {
                   i = 0;
                }
                break;
              case 0xc04f8200:
                if (p1.equals("moment")) {
                   i = 1;
                }
                break;
              case 0xc20796d8:
                if (p1.equals("notice")) {
                   i = 2;
                }
                break;
              case 0x38eb0007:
                if (p1.equals("message")) {
                   i = 3;
                }
                break;
              default:
          }
          switch (i){
              case 0:
              case 3:
                str = "messages";
                break;
              case 1:
                str = "moments";
                break;
              case 2:
                str = "notifications";
                break;
              default:
                str = "";
          }
       }
       if (!TextUtils.x(str)) {
          intent.setData(new Uri$Builder().scheme("kwai").authority(str).build());
       }
       intent.putExtra("EXTRA_TAB_TYPE", p1);
       intent.putExtra("RESET_NASA_MODE", p2);
       intent.putExtra("key_unserializable_bundle_id", w.e(p0));
       intent.putExtra("FORBID_REDIRECT_HOME_TAB", p3);
       p0.startActivity(intent);
       return;
    }
    public int M(){
       return 1;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, ReminderActivity.class, "17")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public int f(){
       ReminderActivity obj = PatchProxy.apply(null, this, ReminderActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.C;
       int i = (obj == null)? 0: obj.f();
       return i;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, ReminderActivity.class, "16")) {
          return;
       }
       if (this.D != null) {
          super.f3();
       }
       return;
    }
    public int getPage(){
       ReminderActivity obj = PatchProxy.apply(null, this, ReminderActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.C;
       int page = (obj != null)? obj.getPage(): 0;
       return page;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ReminderActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       ReminderActivity obj = PatchProxy.apply(null, this, ReminderActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       String str = (obj == null)? "ks://reminder": obj.getUrl();
       return str;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       boolean b;
       boolean b1;
       Uri data;
       boolean b2;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, ReminderActivity.class, "4")) {
          return;
       }
       super.onCreate(p0);
       if (!c.e()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
          return;
       }else {
          SwipeLayout obj1 = PatchProxy.applyOneRefs(obj, null, d.class, "10");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(this.getIntent() != null && (this.getIntent().getData() != null && HoldoutConfigUtilKt.a())){
             data = this.getIntent().getData();
             Object obj2 = PatchProxy.applyOneRefs(data, null, d.class, "14");
             if (obj2 != PatchProxyResult.class) {
                b2 = obj2.booleanValue();
             }else if(d.c(data) && ("messages").equals(data.getAuthority())){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2) {
                if (QCurrentUser.ME.isLogined()) {
                   d.a(-1497343380).oE(obj, true);
                   this.finish();
                }else {
                   d.a(-1712118428).ne(this, this.getUrl(), "reminder", 50, null, null, null, null, 0).K(true).w(super(obj)).h();
                }
                b = true;
             }
          }
       label_00cb :
          b = false;
          if (b) {
             return;
          }else {
             obj1 = PatchProxy.apply(null, obj, ReminderActivity.class, "5");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
                b1 = false;
             }else {
                Intent intent1 = this.getIntent();
                if (intent1 == null) {
                   b1 = false;
                   b = false;
                }else {
                   b1 = false;
                   b = j0.a(intent1, "FORBID_REDIRECT_HOME_TAB", b1);
                }
             }
             if (!b) {
                obj1 = PatchProxy.applyOneRefs(obj, null, d.class, "9");
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else if(this.getIntent() != null && (this.getIntent().getData() != null && (!QCurrentUser.ME.isLogined() || !a.a()))){
                   data = this.getIntent().getData();
                   if (("kwai").equals(data.getScheme()) && d.a()) {
                      Intent intent = d.a(0x304f5b72).G2(obj);
                      intent.putExtra("key_jump_to_nasa_reminder_inner_tab", data);
                      obj.startActivity(intent);
                      b = true;
                   }
                }
             label_0150 :
                b = false;
                if (b) {
                   obj.D = b1;
                   this.finish();
                   return;
                }
             }
             this.w3();
             obj1 = w9.a(this);
             if (obj.y == null) {
                w.c(obj, obj1);
             }
             obj.u3(true);
             return;
          }
       }
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderActivity.class, "6")) {
          return;
       }
       super.onNewIntent(p0);
       this.w3();
       this.u3(false);
       return;
    }
    public void startActivity(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderActivity.class, "11")) {
          return;
       }
       super.startActivity(p0);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       return;
    }
    public void startActivityForResult(Intent p0,int p1){
       ReminderActivity reminderActi = ReminderActivity.class;
       if (PatchProxy.isSupport(reminderActi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reminderActi, "12")) {
          return;
       }
       super.startActivityForResult(p0, p1);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       return;
    }
    public final void u3(boolean p0){
       ReminderActivity reminderActi = ReminderActivity.class;
       if (PatchProxy.isSupport(reminderActi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, reminderActi, "8")) {
          return;
       }
       if (QCurrentUser.ME.isLogined()) {
          if (p0 || this.C == null) {
             this.v3();
          }else {
             this.x3();
          }
       }else {
          d.a(-1712118428).ne(this, this.getUrl(), "reminder", 50, null, null, null, null, null).K(1).w(new b(this, p0)).h();
       }
       return;
    }
    public final void v3(){
       if (PatchProxy.applyVoid(null, this, ReminderActivity.class, "9")) {
          return;
       }
       int i = -83154551;
       if (this.B != null) {
          b.a(i).p();
       }else {
          g og = b.a(i);
       }
       this.C = ReminderTabHostFragment.Rh(this.A, this.z);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, this.C);
       uoe.m();
       return;
    }
    public final void w3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReminderActivity.class, "7")) {
          return;
       }
       Intent intent = this.getIntent();
       boolean b = j0.a(intent, "kwai_from_push", false);
       this.y = b;
       if (b) {
          this.V2().postDelayed(new c(this), 200);
       }
       this.A = j0.f(intent, "EXTRA_TAB_TYPE");
       this.B = j0.a(intent, "RESET_NASA_MODE", true);
       if (d.c(intent.getData())) {
          objArray = intent.getData();
       }
       this.z = objArray;
       return;
    }
    public final void x3(){
       if (PatchProxy.applyVoid(null, this, ReminderActivity.class, "10")) {
          return;
       }
       ReminderActivity tC = this.C;
       if (tC instanceof ReminderTabHostFragment) {
          tC.Vh(this.A, this.z);
       }
       return;
    }
}
