package com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity;
import com.yxcorp.gifshow.v3.PostAlbumActivity;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$a;
import nsd.u;
import java.lang.String;
import k2b.u1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$b;
import dc7.e;
import ga9.a;
import java.util.List;
import tkd.b;
import tkd.d;
import om6.j;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$c;
import androidx.fragment.app.FragmentActivity;
import om6.k$a;
import om6.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import faa.a;
import q87.c;
import android.content.Intent;
import w46.b;
import android.net.Uri;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import zsd.t;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$TemplateType;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.e0;
import ytc.h;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.user.QCurrentUser;
import e17.i;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams;
import ytc.e;
import android.content.Context;
import n3d.a;
import w69.i$a;
import w69.f$a;
import o79.a;
import w69.b$a;
import w69.b;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k$a;
import lnc.a1;
import w69.k;
import java.util.Collection;
import nsd.r0;
import java.util.Arrays;
import w69.f$b;
import w69.i;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$onCreate$1;
import msd.l;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$c;
import brd.a0;
import ytc.n;
import brd.d0;
import crd.b;

public final class PicTemplateEditorAlbumActivity extends PostAlbumActivity	// class@0012fa
{
    public final String R;
    public b S;
    public boolean T;
    public final PicTemplatePageParamBuilderPresenter U;
    public List V;
    public int W;
    public HashMap X;
    public static final PicTemplateEditorAlbumActivity$a Y;

    static {
       PicTemplateEditorAlbumActivity.Y = new PicTemplateEditorAlbumActivity$a(null);
    }
    public void PicTemplateEditorAlbumActivity(){
       super();
       String str = u1.f();
       a.o(str, "Logger.generateTaskSessionId\(\)");
       this.R = str;
       this.U = new PicTemplatePageParamBuilderPresenter();
       this.W = -1;
    }
    public void H3(IAlbumMainFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateEditorAlbumActivity.class, "3")) {
          return;
       }
       a.p(p0, "albumFragment");
       p0.I3(new PicTemplateEditorAlbumActivity$b(this));
       return;
    }
    public final void I3(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateEditorAlbumActivity.class, "9")) {
          return;
       }
       d.a(0x2538349d).oy(this, p0, true, this.R, "", "", Boolean.FALSE, false, true, new PicTemplateEditorAlbumActivity$c(this));
       return;
    }
    public int M(){
       return 4;
    }
    public ClientContent$ContentPackage Nf(){
       return null;
    }
    public ClientContent$ContentPackage Q3(){
       return null;
    }
    public String a2(){
       return "";
    }
    public int getPage(){
       return 17;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, PicTemplateEditorAlbumActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "task_id="+this.R+"&"+"template_id=";
       PicTemplateEditorAlbumActivity tV = this.V;
       if (tV == null) {
          a.S("mTemplateIdList");
       }
       return obj+tV;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PicTemplateEditorAlbumActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "PHOTO_PICKER";
    }
    public void onCreate(Bundle p0){
       int b1;
       PicTemplateEditorAlbumActivity v;
       PicTemplatePageParamBuilderPresenter a;
       int i;
       String str1;
       StringBuilder str2;
       ArrayList uArrayList1;
       Object[] objArray4;
       List list = this;
       PicTemplateEditorAlbumActivity picTemplateE = PicTemplateEditorAlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, list, picTemplateE, "1")) {
          return;
       }
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, list, picTemplateE, "5");
       String str = "mTemplateIdList";
       PicTemplateEditorAlbumActivity$onCreate$1 oonCreate$1 = 1;
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          Object[] objArray3 = new Object[b];
          str1 = "PicTemplateEditorAlbumActivity";
          a.D().w(str1, "4685 fillParams ", objArray3);
          Intent intent = this.getIntent();
          str2 = "intent";
          a.o(intent, str2);
          if (intent.getScheme() == null) {
             objArray3 = new Object[b];
             a.D().t(str1, "5569 scheme = null", objArray3);
          }else {
             intent = this.getIntent();
             a.o(intent, str2);
             Uri data = intent.getData();
             if (data == null) {
                objArray3 = new Object[b];
                a.D().w(str1, "1015 data = null ", objArray3);
             }else if(!data.isHierarchical()){
                objArray3 = new Object[b];
                a.D().w(str1, "1601 uri.isHierarchical = false", objArray3);
             }else {
                String queryParamet = data.getQueryParameter("templateId");
                if (queryParamet != null) {
                   String[] stringArray1 = new String[]{","};
                   List list1 = StringsKt__StringsKt.H4(queryParamet, stringArray1, false, 0, 6, null);
                   if (list1 != null) {
                      uArrayList1 = new ArrayList();
                      Iterator iterator = list1.iterator();
                      while (iterator.hasNext()) {
                         Object obj1 = iterator.next();
                         Object obj2 = ((obj1).length() > 0)? 1: null;
                         if (obj2) {
                            uArrayList1.add(obj1);
                         }
                      }
                      list.V = uArrayList1;
                      if (uArrayList1 == null) {
                         a.S(str);
                      }
                      if (uArrayList1.isEmpty()) {
                         objArray4 = new Object[b];
                         a.D().t(str1, "9058 template id is empty", objArray4);
                      }
                      String queryParamet1 = data.getQueryParameter("type");
                      if (queryParamet1 != null) {
                         Integer integer = t.X0(queryParamet1);
                         if (integer != null) {
                            b1 = integer.intValue();
                         label_00e9 :
                            list.W = b1;
                            if (b1 < PicTemplatePageParamBuilderPresenter$TemplateType.SINGLE_PIC.getType() || list.W > PicTemplatePageParamBuilderPresenter$TemplateType.LONG_PIC.getType()) {
                               objArray4 = new Object[b];
                               a.D().t(str1, "template type "+list.W+" out of range", objArray4);
                            }else {
                               a uoa9 = a.D();
                               str2 = "4599 fillParams complete: templateId=";
                               PicTemplateEditorAlbumActivity v1 = list.V;
                               if (v1 == null) {
                                  a.S(str);
                               }
                               objArray4 = new Object[b];
                               uoa9.w(str1, str2+v1, objArray4);
                               b1 = true;
                            }
                         }
                      }
                      b1 = 0;
                      goto label_00e9 ;
                   }
                }
                uArrayList1 = CollectionsKt__CollectionsKt.E();
                goto label_00bd ;
             }
          }
          b1 = false;
       }
       if (!b1) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("参数校验失败"));
          super.onCreate(p0);
          this.finish();
          return;
       }else {
          u1.L0(this);
          obj = h.a;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoid(objArray, obj, h.class, "1")) {
             u1.u0(oonCreate$1, new ClientEvent$ElementPackage(), objArray);
          }
          if (!PatchProxy.applyVoid(objArray, list, picTemplateE, "2")) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (!qCurrentUser.isLogined()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f103078);
                d.a(-1712118428).x00(list, b, new LoginParams(), new e(list));
             }
          }
          if (!PatchProxy.applyVoid(objArray, list, picTemplateE, "6")) {
             i$a uoa1 = new i$a();
             v = list.W;
             i = 0x7f103a83;
             str1 = "post_image_template_plc";
             int i1 = 2;
             if (v == PicTemplatePageParamBuilderPresenter$TemplateType.SINGLE_PIC.getType()) {
                f$a uoa2 = new f$a();
                uoa2.g(a.c);
                uoa2.h(b);
                b$a uoa3 = new b$a();
                uoa3.c(oonCreate$1);
                AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder().a(str1);
                uBuilder.p(oonCreate$1);
                k$a uoa4 = new k$a();
                uoa4.d(i1);
                uoa4 = uoa4.r(b);
                uoa4.m(oonCreate$1);
                uoa4.f(a1.p(i));
                uoa1 = new i$a().a(uoa3.a()).d(uoa2.a()).f(uBuilder.d()).m(uoa4.b());
             }else if(v == PicTemplatePageParamBuilderPresenter$TemplateType.ATLAS.getType() || v == PicTemplatePageParamBuilderPresenter$TemplateType.LONG_PIC.getType()){
                picTemplateE = list.V;
                if (picTemplateE == null) {
                   a.S(str);
                }
                String[] stringArray = new String[b];
                Object[] objArray1 = picTemplateE.toArray(stringArray);
                Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                ArrayList uArrayList = new ArrayList();
                b1 = objArray1.length;
                int i2 = 0;
                while (i2 < b1) {
                   object oobject = objArray1[i2];
                   i = a.g(oobject, "0") ^ oonCreate$1;
                   if (i) {
                      uArrayList.add(oobject);
                   }
                   i2 = i2 + 1;
                   str2 = 0x7f103a83;
                }
                int i3 = uArrayList.size();
                String str3 = a1.p(R.string.arg_RES_7f103c5e);
                a.o(str3, "CommonUtil.string\(R.stri….pic_template_album_tips\)");
                Object[] objArray2 = new Object[i1];
                objArray2[b] = Integer.valueOf(i3);
                objArray2[oonCreate$1] = Integer.valueOf(i3);
                String str4 = String.format(str3, Arrays.copyOf(objArray2, i1));
                a.o(str4, "java.lang.String.format\(format, *args\)");
                f$a uoa5 = f.w.a();
                uoa5.g(a.c);
                uoa5.c(oonCreate$1);
                uoa5.h(b);
                b$a uoa6 = new b$a();
                uoa6.c(oonCreate$1);
                AlbumLimitOption$Builder uBuilder1 = new AlbumLimitOption$Builder().a(str1);
                uBuilder1.p(b);
                i$a uoa7 = new i$a().a(uoa6.a()).d(uoa5.a()).f(uBuilder1.d());
                k$a uoa8 = new k$a();
                uoa8.d(i1);
                uoa8 = uoa8.r(b);
                uoa8.m(oonCreate$1);
                uoa8.f(a1.p(R.string.arg_RES_7f103a83));
                str2 = a1.p(R.string.arg_RES_7f104619);
                if (str2 != null) {
                   uoa8.v = str2;
                }
                uoa8.k(str4);
                uoa8.l(oonCreate$1);
                uoa8.q(oonCreate$1);
                uoa1 = uoa7.m(uoa8.b());
             }
             this.getIntent().putExtras(uoa1.b().d());
          }
          super.onCreate(p0);
          PicTemplateEditorAlbumActivity u = list.U;
          v = list.V;
          if (v == null) {
             a.S(str);
          }
          PicTemplatePageParamBuilderPresenter$a uoa = new PicTemplatePageParamBuilderPresenter$a(this, v, list.W, false, false, new PicTemplateEditorAlbumActivity$onCreate$1(list), 24, null);
          Objects.requireNonNull(u);
          PicTemplatePageParamBuilderPresenter picTemplateP = PicTemplatePageParamBuilderPresenter.class;
          if (!PatchProxy.isSupport(picTemplateP) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, v13, u, picTemplateP, "1")) {
             a.p(v13, "arg");
             a = u.a;
             if (!PatchProxy.applyVoidTwoRefs(v13, a, u, picTemplateP, "2")) {
                u.a(v13, a).b(new n(u, v13));
             }
          }
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PicTemplateEditorAlbumActivity.class, "4")) {
          return;
       }
       PicTemplateEditorAlbumActivity tS = this.S;
       if (tS != null) {
          tS.dispose();
       }
       this.S = null;
       super.onDestroy();
       return;
    }
}
