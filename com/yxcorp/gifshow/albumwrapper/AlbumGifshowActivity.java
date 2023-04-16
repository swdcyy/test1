package com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import j36.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import android.app.Activity;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import nsd.r0;
import java.util.Arrays;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import android.content.Intent;
import ekd.j0;
import java.util.ArrayList;
import uxb.o;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import z26.c;
import lnc.x6;
import lnc.y6;
import y79.i;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import x79.b;
import dc7.e;
import x79.c;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import r79.a;
import w69.d;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import j36.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import android.view.Window;
import android.os.Build$VERSION;
import qka.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import android.view.View;
import java.util.List;
import java.io.File;
import com.yxcorp.gifshow.models.QMedia;
import android.net.Uri;
import ekd.w0;
import java.lang.Boolean;
import o36.g;

public class AlbumGifshowActivity extends GifshowActivity implements g	// class@001b45
{
    public String A;
    public String B;
    public String C;
    public Integer D;
    public Integer E;
    public String F;
    public boolean G;
    public boolean H;
    public String I;
    public a J;
    public c K;
    public HashMap L;
    public final String y;
    public AlbumFragment z;
    public static final int M;
    public static final AlbumGifshowActivity$a N;

    static {
       AlbumGifshowActivity.N = new AlbumGifshowActivity$a(null);
       AlbumGifshowActivity.M = 1000;
    }
    public void AlbumGifshowActivity(){
       super();
       this.y = "AlbumActivity";
    }
    public String E7(){
       return "Album";
    }
    public int M(){
       AlbumGifshowActivity obj = PatchProxy.apply(null, this, AlbumGifshowActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.E;
       int i = (obj != null)? obj.intValue(): 4;
       return i;
    }
    public int P2(){
       return 1;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AlbumGifshowActivity.class, "10")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, R.anim.arg_RES_7f010065);
       return;
    }
    public int getPage(){
       int i;
       AlbumGifshowActivity obj = PatchProxy.apply(null, this, AlbumGifshowActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       if (obj == null) {
          a.S("mAlbumMainFragment");
       }
       if (obj.isAdded()) {
          obj = this.z;
          if (obj == null) {
             a.S("mAlbumMainFragment");
          }
          if (obj.Sc()) {
             i = 187;
          }else {
          label_0033 :
             obj = this.D;
             if (obj != null) {
                i = obj.intValue();
             }else {
                i = 313;
             }
          }
       }else {
          goto label_0033 ;
       }
       return i;
    }
    public String getPageParams(){
       String str;
       AlbumGifshowActivity obj = PatchProxy.apply(null, this, AlbumGifshowActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          if (TextUtils.x(this.B)) {
             AlbumGifshowActivity tA = this.A;
             a.m(tA);
             str = "task_id="+tA;
          }else {
             Object[] objArray = new Object[]{this.A,this.B};
             str = String.format("task_id=%s&entrance_type=%s", Arrays.copyOf(objArray, 2));
             a.o(str, "java.lang.String.format\(format, *args\)");
          }
       }
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AlbumGifshowActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       AlbumGifshowActivity tC = this.C;
       if (tC != null) {
       }else {
          tC = "ks://camera/normal/album_or_photo_record";
       }
       return tC;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, AlbumGifshowActivity.class, "5")) {
          return;
       }
       AlbumGifshowActivity tz = this.z;
       if (tz == null) {
          a.S("mAlbumMainFragment");
       }
       if (!tz.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       AlbumGifshowActivity uAlbumGifsho = AlbumGifshowActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAlbumGifsho, "1")) {
          return;
       }
       super.onCreate(p0);
       this.C = j0.f(this.getIntent(), "album_page_url");
       this.D = Integer.valueOf(j0.b(this.getIntent(), "album_page_name", 313));
       this.E = Integer.valueOf(j0.b(this.getIntent(), "album_page_category", 4));
       this.F = j0.f(this.getIntent(), "album_page_params");
       this.A = j0.f(this.getIntent(), "photo_task_id");
       this.B = j0.f(this.getIntent(), "album_entrance_type");
       boolean b = false;
       this.G = j0.a(this.getIntent(), "HAS_POST_PROCESS", b);
       String str = "album_disallow_pattern";
       if (!j0.g(this.getIntent(), str)) {
          SerializableHook.putExtra(this.getIntent(), str, o.d());
       }
       str = "album_black_file_path";
       if (!j0.g(this.getIntent(), str)) {
          this.getIntent().putExtra(str, o.c());
       }
       this.getIntent().putExtra("album_show_permission_dialog", true);
       this.overridePendingTransition(j0.b(this.getIntent(), "album_enter_anim", R.anim.arg_RES_7f010063), j0.b(this.getIntent(), "album_exit_anim", R.anim.arg_RES_7f010062));
       this.setContentView(this.v3());
       if (!PatchProxy.applyVoid(null, this, uAlbumGifsho, "3")) {
          this.K = y6.r(c.class);
          boolean b1 = j0.a(this.getIntent(), "single_select", b);
          AlbumFragment uAlbumFragme = new AlbumFragment();
          this.z = uAlbumFragme;
          uAlbumFragme.C8(new i());
          uAlbumGifsho = this.z;
          if (uAlbumGifsho == null) {
             a.S("mAlbumMainFragment");
          }
          uAlbumGifsho.I3(new b(this, b1));
          AlbumGifshowActivity tz = this.z;
          if (tz == null) {
             a.S("mAlbumMainFragment");
          }
          tz.u3(new c(this));
          Intent intent = this.getIntent();
          String str1 = "intent";
          a.o(intent, str1);
          intent = intent.getExtras();
          if (intent != null) {
             b = intent.getInt("ALBUM_MIN_DURATION_PER_VIDEO", b);
          }
          intent = this.getIntent();
          a.o(intent, str1);
          intent = intent.getExtras();
          if (intent != null) {
             if (!b) {
                b = AlbumGifshowActivity.M;
             }
             intent.putInt("ALBUM_MIN_DURATION_PER_VIDEO", b);
          }
          tz = this.z;
          if (tz == null) {
             a.S("mAlbumMainFragment");
          }
          Intent intent1 = this.getIntent();
          a.o(intent1, str1);
          tz.setArguments(intent1.getExtras());
          tz = this.z;
          if (tz == null) {
             a.S("mAlbumMainFragment");
          }
          tz.rh().c().g(this.getIntent().getBundleExtra("key_album_custom_options"));
          tz = this.z;
          if (tz == null) {
             a.S("mAlbumMainFragment");
          }
          this.x3(tz);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          AlbumGifshowActivity tz1 = this.z;
          if (tz1 == null) {
             a.S("mAlbumMainFragment");
          }
          uoe.v(R.id.ksa_container_layout, tz1);
          uoe.o();
       }
       if (this.z4() != null) {
          a uoa = new a(this, this);
          this.J = uoa;
          uoa.d();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumGifshowActivity.class, "9")) {
          return;
       }
       super.onDestroy();
       AlbumGifshowActivity tJ = this.J;
       if (tJ != null) {
          tJ.a();
       }
       return;
    }
    public void onResume(){
       Window window;
       if (PatchProxy.applyVoid(null, this, AlbumGifshowActivity.class, "8")) {
          return;
       }
       super.onResume();
       if (ImageSelectSupplier$ImageSelectType.MIYOU.getValue() == j0.b(this.getIntent(), "selectType", -1)) {
          window = this.getWindow();
          a.o(window, "window");
          window.setStatusBarColor(this.getResources().getColor(R.color.arg_RES_7f061d74));
          window = this.getWindow();
          a.o(window, "window");
          window.setNavigationBarColor(this.getResources().getColor(R.color.arg_RES_7f061d74));
          return;
       }else if(Build$VERSION.SDK_INT >= 23 && a.a()){
          window = this.getWindow();
          a.o(window, "window");
          window.setStatusBarColor(0xff000000);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AlbumGifshowActivity.class, "6")) {
          return;
       }
       super.onStart();
       AlbumGifshowActivity tJ = this.J;
       if (tJ != null) {
          tJ.b();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, AlbumGifshowActivity.class, "7")) {
          return;
       }
       super.onStop();
       AlbumGifshowActivity tJ = this.J;
       if (tJ != null) {
          tJ.c();
       }
       return;
    }
    public View r5(){
       Object[] objArray = null;
       Window obj = PatchProxy.apply(objArray, this, AlbumGifshowActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getWindow() != null) {
          obj = this.getWindow();
          a.o(obj, "window");
          objArray = obj.getDecorView();
       }
       return objArray;
    }
    public final void u3(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumGifshowActivity.class, "15")) {
          return;
       }
       a.p(p0, "selectedList");
       Intent intent = new Intent();
       File uFile = new File(p0.get(0).path);
       if (uFile.exists()) {
          intent.setData(w0.f(uFile.getAbsolutePath()));
       }
       SerializableHook.putExtra(intent, "album_data_list", p0);
       this.setResult(-1, intent);
       this.finish();
       return;
    }
    public int v3(){
       return 0x7f0d06e2;
    }
    public boolean w3(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumGifshowActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "mediaList");
       return false;
    }
    public void x3(AlbumFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumGifshowActivity.class, "2")) {
          return;
       }
       a.p(p0, "albumFragment");
       return;
    }
    public void y3(){
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, AlbumGifshowActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.H == null) {
          this.I = g.b(this);
          this.H = true;
       }
       return this.I;
    }
}
