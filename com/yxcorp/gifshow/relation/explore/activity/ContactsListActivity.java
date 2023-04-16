package com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import xwb.c;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.d;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import ekd.j0;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import java.util.Locale;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import oe6.e;
import android.view.View;
import wwb.f;
import aac.f;
import java.lang.Runnable;
import oe6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.util.Map;
import n3d.a;
import android.os.Bundle;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import brd.t;
import aac.e;
import erd.g;
import crd.b;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.d;
import aac.d;
import android.content.SharedPreferences;
import e17.i;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import aac.a;
import aac.c;
import aac.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class ContactsListActivity extends GifshowActivity implements View$OnClickListener	// class@0017eb
{
    public View A;
    public View B;
    public ContactsListFragment C;
    public boolean D;
    public SwipeLayout E;
    public KwaiActionBar F;
    public int G;
    public final c H;
    public final c I;
    public final ContactPermissionHolder J;
    public View y;
    public View z;
    public static final int K;

    public void ContactsListActivity(){
       super();
       this.G = 0;
       c uoc = new c();
       this.H = uoc;
       this.I = new c();
       this.J = new ContactPermissionHolder(new b(uoc));
    }
    public static Intent u3(Context p0,int p1){
       Intent obj;
       if (PatchProxy.isSupport(ContactsListActivity.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ContactsListActivity.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Intent(p0, ContactsListActivity.class);
       obj.putExtra("pageFrom", p1);
       return obj;
    }
    public int M(){
       return 1;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, ContactsListActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUrl();
    }
    public int f(){
       return 10;
    }
    public int getPage(){
       ContactsListActivity obj = PatchProxy.apply(null, this, ContactsListActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = false;
       if (this.getIntent() != null && j0.a(this.getIntent(), "isShowContactsFirstGuide", b)) {
          return 54;
       }
       obj = this.C;
       if (obj != null) {
          b = obj.getPage();
       }
       return b;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, ContactsListActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.I.b),this.I.c};
       return String.format(Locale.US, "index=%d&name=%s", objArray);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ContactsListActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, ContactsListActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getIntent() == null || !j0.a(this.getIntent(), "isShowContactsFirstGuide", false)) {
          return "ks://contactslist";
       }
       if (!e.h()) {
          return "ks://exploreFriends/guide/contact";
       }
       return "ks://exploreFriends/contact";
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactsListActivity.class, "10")) {
          return;
       }
       int id = p0.getId();
       if (id == 0x7f0a0d11) {
          this.H.i();
          f.c(true);
          this.J.h(this, new f(this));
       }else if(id == 0x7f0a043b && TextUtils.isEmpty(a.f())){
          BindPhoneParams$b uob = new BindPhoneParams$b();
          uob.m(false);
          uob.n(true);
          d.a(-1712118428).ew(this, uob.a(), null, "contactlist", null);
       }
       return;
    }
    public void onCreate(Bundle p0){
       ClientEvent$UrlPackage urlPackage;
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactsListActivity.class, "4")) {
          return;
       }
       Intent intent = this.getIntent();
       boolean b = false;
       this.D = j0.a(intent, "isShowContactsFirstGuide", b);
       int i = j0.b(intent, "pageFrom", 100);
       String str = j0.f(intent, "loginEntry");
       if (str == null) {
          str = "other";
       }
       ContactsListActivity tI = this.I;
       tI.r(i);
       tI.q(str);
       tI = this.D;
       if (!PatchProxy.isSupport(ContactsListActivity.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(tI), this, ContactsListActivity.class, "5") && tI != null)) {
          urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 54;
          urlPackage.params = this.getPageParams();
          this.I.s(urlPackage);
       }
       urlPackage = new ClientEvent$UrlPackage();
       int i1 = 280;
       urlPackage.page = i1;
       urlPackage.params = this.getPageParams();
       ContactsListActivity tH = this.H;
       tH.r(i);
       tH.q(str);
       tH.s(urlPackage);
       super.onCreate(p0);
       this.E = w9.a(this);
       this.setContentView(R.layout.arg_RES_7f0d021f);
       this.F = this.findViewById(0x7f0a3f6a);
       this.y = this.findViewById(0x7f0a01f2);
       this.findViewById(R.id.empty_button).setOnClickListener(this);
       this.z = this.findViewById(0x7f0a17ac);
       this.A = this.findViewById(0x7f0a043b);
       this.B = this.findViewById(0x7f0a0921);
       int i2 = 1;
       if (this.D != null) {
          this.E.setEnabled(b);
          ContactsListActivity tH1 = this.H;
          Objects.requireNonNull(tH1);
          if (!PatchProxy.applyVoid(null, tH1, c.class, "8")) {
             new ClientEvent$UrlPackage().page = i1;
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = tH1.c(i2, 0x753a);
             tH1.o(showEvent);
          }
       }else {
          this.F.i(R.drawable.arg_RES_7f081d80).g(i2);
       }
       this.y3();
       this.J.e().subscribe(new e(this));
       this.J.l(this);
       if (QCurrentUser.me().isLogined()) {
          this.w3();
       }else {
          d.a(-1712118428).ne(this, this.getUrl(), "contacts_list", 50, null, null, null, null, null).K(i2).w(new d(this)).h();
       }
       this.x3();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ContactsListActivity.class, "6")) {
          return;
       }
       super.onDestroy();
       this.J.j();
       if (e.a.getBoolean("HomePageShouldToastRegisterStatus", false) && this.getIntent().getBooleanExtra("isInLoginProcess", false)) {
          i.d(R.style.arg_RES_7f110669, this.getResources().getString(R.string.arg_RES_7f104b64));
          e.g0(false);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ContactsListActivity.class, "8")) {
          return;
       }
       super.onStart();
       if (this.C != null && this.v3()) {
          this.H.k();
       }
       return;
    }
    public final boolean v3(){
       Object obj = PatchProxy.apply(null, this, ContactsListActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (this.D != null && !e.h())? 1: 0;
       if (this.J.d() && !obj) {
          b = false;
       }
       return b;
    }
    public final void w3(){
       if (PatchProxy.applyVoid(null, this, ContactsListActivity.class, "7")) {
          return;
       }
       this.C = new ContactsListFragment();
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.content_fragment, this.C);
       uoe.m();
       return;
    }
    public final void x3(){
       boolean i;
       ContactsListActivity tI;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ContactsListActivity.class, "15")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ContactsListActivity obj = PatchProxy.apply(objArray, this, ContactsListActivity.class, "20");
       String str = 4;
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(this.v3()){
          i = 1;
       }else {
          obj = this.C;
          if (obj == null || obj.H == null) {
             i = 2;
          }else {
             Object obj1 = PatchProxy.apply(objArray, this, ContactsListActivity.class, "22");
             if (obj1 != patchProxyRe) {
                i = obj1.booleanValue();
             }else {
                tI = this.C;
                i = (tI != null && (tI.q() == null || this.C.q().isEmpty()))? true: false;
             }
             if (i) {
                i = 4;
             }else {
                i = 3;
             }
          }
       }
       if (this.G == i) {
          return;
       }else {
          this.G = i;
          obj = this.F;
          int i1 = (i <= 1)? 0x7f100808: 0x7f100807;
          obj.q(i1);
          if (this.D == null) {
             return;
          }else if(i != 1){
             int i2 = -1;
             if (i != 3) {
                if (i == str) {
                   this.F.m(i2).i(R.drawable.arg_RES_7f081d80).h(new a(this));
                }
             }else {
                this.F.i(i2).m(R.string.arg_RES_7f100f6b).l(new c(this));
                tI = this.I;
                Objects.requireNonNull(tI);
                if (!PatchProxy.applyVoid(objArray, tI, c.class, "17")) {
                   ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                   showEvent.elementPackage = tI.c(1, 0x75b1);
                   tI.o(showEvent);
                }
             }
          }else {
             this.F.m(R.string.arg_RES_7f104838).l(new b(this));
          }
          return;
       }
    }
    public final void y3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ContactsListActivity.class, "19")) {
          return;
       }
       this.x3();
       int i = 0;
       if (this.v3()) {
          this.F.q(R.string.arg_RES_7f100808);
          this.A.setVisibility(8);
          this.y.setVisibility(i);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 961;
          u1.u0(6, uElementPack, objArray);
          this.z.setVisibility(8);
       }else {
          this.F.q(R.string.arg_RES_7f100807);
          if (TextUtils.isEmpty(a.f())) {
             this.A.setVisibility(i);
          }else {
             this.A.setVisibility(8);
          }
          this.y.setVisibility(8);
          this.z.setVisibility(i);
          if (QCurrentUser.me().isNotRecommendToContacts()) {
             this.B.setVisibility(i);
          }
          ContactsListActivity tC = this.C;
          if (tC != null && (tC.q() != null && this.C.q().isEmpty())) {
             this.C.a();
          }
       }
    label_008e :
       return;
    }
}
