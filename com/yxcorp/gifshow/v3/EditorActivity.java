package com.yxcorp.gifshow.v3.EditorActivity;
import p16.b;
import jw8.d;
import ml8.d;
import c35.i;
import c35.c;
import im8.g;
import com.yxcorp.gifshow.activity.BasePostActivity;
import lnc.a1;
import rwc.j;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.List;
import com.yxcorp.gifshow.v3.v;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Paint;
import java.lang.Math;
import android.widget.RadioButton;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.kuaishou.viewbinder.IViewBinder;
import tkd.b;
import tkd.d;
import r16.a;
import android.app.Activity;
import r16.d;
import wwc.n0;
import kuaishou.perf.page.impl.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import android.content.Intent;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Boolean;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;
import com.yxcorp.utility.n;
import lq.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace$Type;
import lnc.s6;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.util.Collection;
import com.yxcorp.gifshow.v3.EditorActivity$g;
import java.lang.Enum;
import q16.c$a;
import com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$TemplateType;
import com.yxcorp.gifshow.v3.f;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.EditorActivity$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import w46.b;
import e17.i;
import com.yxcorp.gifshow.v3.EditorActivity$h;
import com.google.protobuf.GeneratedMessageLite;
import wba.p0;
import android.widget.ImageView;
import ekd.j0;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.io.Serializable;
import com.kuaishou.android.post.EditAbilityConfig;
import q46.t;
import com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder;
import qxc.c;
import k2b.s;
import java.lang.Double;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import om8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.v3.EditorActivity$f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.Typeface;
import yaa.c;
import bq.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import android.os.Bundle;
import lwc.h;
import lq.a;
import xvc.f;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvMvEditPreviewFragment;
import sm6.b;
import wba.e0;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import ekd.m1;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import com.yxcorp.gifshow.v3.EditorActivity$a;
import u26.a;
import com.yxcorp.gifshow.v3.EditorActivity$b;
import android.view.View$OnClickListener;
import com.kuaishou.logic.fetchframe.FetchFrameManager;
import android.os.Handler;
import java.lang.Runnable;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.s;
import t36.f$a;
import com.kuaishou.android.post.PostArguments;
import ooc.i0;
import java.util.Map;
import java.util.HashMap;
import lnc.pb;
import lnc.pb$a;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import com.yxcorp.gifshow.util.h0;
import maa.a;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;
import gba.a;
import com.kuaishou.edit.draft.Template;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.u;
import mwc.p;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import um6.e;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import laa.m0;
import com.yxcorp.gifshow.v3.k;
import com.yxcorp.gifshow.v3.l;
import erd.g;
import android.content.res.Configuration;
import ooc.z;
import ra0.d;
import androidx.lifecycle.ViewModelStore;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.v3.EditorActivity$c;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import ooc.e1;
import kwc.a;
import wh5.c;
import android.view.Window;
import uv8.o;
import faa.c;
import tj7.a;
import ppc.e;
import com.yxcorp.gifshow.v3.editor.text.d1;
import qrc.i;
import qrc.h;
import ind.c;
import ind.b;
import nod.f;
import nod.e;
import ooc.u;
import z1.a;
import ooc.a0;
import h80.c;
import h80.k;
import hu8.a;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam$Builder;
import android.content.Context;
import com.kuaishou.ax2c.PreloadParam;
import android.os.SystemClock;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.o;
import com.kwai.horae.lifecycle.a;
import kwc.t;
import jqc.a;
import kwc.n;
import kwc.f;
import kwc.m;
import kwc.e;
import kwc.l;
import wwc.c1;
import lnc.ta;
import wwc.t1;
import wwc.y1;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.v3.p;
import java.lang.System;
import com.yxcorp.gifshow.v3.EditorActivity$d;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import brd.t;
import eoc.e;
import brd.z;
import com.yxcorp.gifshow.v3.i;
import com.yxcorp.gifshow.v3.m;
import com.yxcorp.gifshow.v3.j;
import ooc.t;
import lnc.r5;
import com.yxcorp.gifshow.util.PostOuterTaskManager;
import com.yxcorp.gifshow.util.PostOuterTaskManager$a;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager;
import java.lang.Long;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import gq.a;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo$Status;
import java.util.concurrent.CountDownLatch;
import ooc.v;
import t45.c;
import ooc.w;
import lq.e;
import h69.j;
import l26.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.util.AESubtitleHelper;
import com.yxcorp.gifshow.v3.r;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import voc.t;
import android.util.LruCache;
import com.yxcorp.gifshow.v3.q;
import com.yxcorp.gifshow.edit.previewer.loaderv2.util.AESubtitleHelper$a;
import com.kwai.FaceMagic.AE2.AE2SubtitleConvertor;
import laa.e;
import mba.m0;
import com.yxcorp.gifshow.v3.u;
import android.graphics.drawable.Drawable;
import com.kwai.feature.post.api.util.g;
import qka.a;

public class EditorActivity extends BasePostActivity implements b, d, d, i, c, g	// class@000d1b
{
    public final j O;
    public RadioButton[] P;
    public PostRadioGroupWithIndicator Q;
    public ImageView R;
    public boolean S;
    public boolean T;
    public boolean U;
    public j U0;
    public Fragment[] V;
    public boolean V0;
    public String W;
    public boolean W0;
    public boolean X;
    public int X0;
    public CountDownLatch Y;
    public boolean Y0;
    public long Z;
    public boolean Z0;
    public String a1;
    public b b1;
    public b c1;
    public List d1;
    public int e1;
    public PresenterV2 f1;
    public Configuration g1;
    public boolean h1;
    public String i1;
    public j0 j1;
    public boolean k1;
    public Runnable l1;
    public boolean m1;
    public static final int[] n1;
    public static int o1;

    static {
       int[] ointArray = new int[]{a1.e(36.00f),a1.e(12.00f),a1.e(36.00f),a1.e(12.00f)};
       EditorActivity.n1 = ointArray;
       EditorActivity.o1 = 0;
    }
    public void EditorActivity(){
       super();
       this.O = new j(null);
       this.S = false;
       this.T = false;
       this.U = false;
       Fragment[] uFragmentArr = new Fragment[3];
       this.V = uFragmentArr;
       this.X = false;
       this.V0 = false;
       this.W0 = false;
       this.X0 = Integer.MIN_VALUE;
       this.Y0 = false;
       this.Z0 = false;
       this.d1 = v.g();
       this.e1 = this.K3(EditorActivity$PreviewTabInfo.VIDEO);
       this.h1 = false;
       this.k1 = true;
       this.m1 = true;
    }
    public static int J3(String p0,int p1,int p2,int p3){
       Paint obj;
       if (PatchProxy.isSupport(EditorActivity.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, EditorActivity.class, "56");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = new Paint();
       int i = p2;
       p2 = p1;
       while (p1 <= i) {
          int i1 = p1 + i;
          i1 = i1 / 2;
          obj.setTextSize((float)i1);
          float f = obj.measureText(p0);
          float f1 = (float)p3;
          if (f - f1 > 0) {
             i = i1 - 1;
          }else if(p2 < i1){
             p2 = i1;
          }
          if (f - f1 < 0) {
             p1 = i1 + 1;
          }else {
             break ;
          }
       }
       return p2;
    }
    public String E7(){
       return "EditorPage";
    }
    public final int G3(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(EditorActivity.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, EditorActivity.class, "57");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = a1.e(10.00f);
       int i1 = Math.min(a1.e(17.00f), (a1.e(44.00f) - 20));
       int i2 = EditorActivity.J3(p2, i, i1, this.P[1].getMaxWidth());
       if (!TextUtils.x(p0)) {
          i2 = Math.min(i2, EditorActivity.J3(p0, i, i1, p3));
       }
       if (!TextUtils.x(p1)) {
          i2 = Math.min(i2, EditorActivity.J3(p1, i, i1, p3));
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorActivity", "textSize of tab change to size="+i2, objArray);
       EditorActivity tP = this.P;
       int len = tP.length;
       i1 = 0;
       while (i1 < len) {
          object oobject = tP[i1];
          if (oobject == null || (oobject.getVisibility() != 8 && !TextUtils.x(oobject.getText()))) {
             int i3 = (oobject.isSelected())? a1.e(17.00f): a1.e(16.00f);
             oobject.setTextSize(0, (float)i3);
          }
       label_00b3 :
          i1 = i1 + 1;
       }
       return i2;
    }
    public BaseEditorFragment H3(){
       Object obj = PatchProxy.apply(null, this, EditorActivity.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O.getValue();
    }
    public final FilterVideoPlugin$FilterEntranceType I3(){
       return FilterVideoPlugin$FilterEntranceType.EDIT;
    }
    public int K3(EditorActivity$PreviewTabInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorActivity.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.d1.indexOf(p0);
       if (i != -1) {
          return i;
       }
       i1.c(new RuntimeException("getTabIndex previewTabInfo:"+p0));
       return 0;
    }
    public final RadioButton L3(int p0){
       EditorActivity uEditorActiv = EditorActivity.class;
       if (PatchProxy.isSupport(uEditorActiv)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorActiv, "64");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uEditorActiv = this.P;
       if (uEditorActiv[p0] == null) {
          String str = "getTabViews : mTabViews["+p0+"] is null";
          Object[] objArray = new Object[0];
          a.D().A("EditorActivity", str, objArray);
          PostUtils.D("EditorActivity", str, new NullPointerException(str));
          this.finish();
          return null;
       }else {
          return uEditorActiv[p0];
       }
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, EditorActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.O.getValue() != null)? 1: 0;
       return i;
    }
    public final int M3(String p0,int p1,Paint p2){
       if (PatchProxy.isSupport(EditorActivity.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, EditorActivity.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (!TextUtils.x(p0))? (int)(p2.measureText(p0) + 0x3f000000): p1;
       if (p1 < this.P[1].getMaxWidth()) {
          i = (i + this.P[1].getMaxWidth()) - p1;
       }
       return i;
    }
    public AbsEditorActivityViewBinder N3(){
       return this.I;
    }
    public IViewBinder O1(){
       return this.N3();
    }
    public void O3(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "42")) {
          return;
       }
       if (this.U == null) {
          return;
       }
       d.a(0x14d6f666).it(this);
       return;
    }
    public void Of(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorActivity.class, "63")) {
          return;
       }
       super.Of();
       if (!PatchProxy.applyVoid(objArray, objArray, n0.class, "16")) {
          d.d("postLoadToEditorMonitor").h("createToPreview");
          d.d("postLoadToEditorMonitor").g("previewToRenderFirstFrame");
          d.d("postVideoToEditorMonitor").h("createToPreview");
          d.d("postVideoToEditorMonitor").g("previewToRenderFirstFrame");
       }
       return;
    }
    public int P2(){
       return 1;
    }
    public void P3(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "32")) {
          return;
       }
       this.R3(true);
       return;
    }
    public ClientContent$ContentPackage Q3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditorActivity uEditorActiv = EditorActivity.class;
       Object[] objArray = null;
       ClientContent$ContentPackage obj = PatchProxy.apply(objArray, this, uEditorActiv, "47");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       Object[] objArray1 = PatchProxy.apply(objArray, this, uEditorActiv, "48");
       if (objArray1 != patchProxyRe) {
       }else {
          Music music = b.a(this.getIntent().getParcelableExtra("MUSIC_INFO_MUSIC"));
          if (music != null) {
             objArray = new ClientContent$TagPackage();
             objArray.identity = TextUtils.k(music.mId);
             objArray.name = TextUtils.k(music.getDisplayName());
             objArray.secondaryType = String.valueOf(music.mType.mValue);
             objArray.type = 1;
             objArray.index = (long)(music.mViewAdapterPosition + 1);
             objArray.llsid = TextUtils.k(music.mLlsid);
             objArray.expTag = TextUtils.k(music.mExpTag);
          }
          objArray1 = objArray;
       }
       obj.tagPackage = objArray1;
       return obj;
    }
    public void R3(boolean p0){
       EditorActivity uEditorActiv = EditorActivity.class;
       if (PatchProxy.isSupport(uEditorActiv) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEditorActiv, "33")) {
          return;
       }
       this.Z0 = false;
       if (p0) {
          this.N3().k.setVisibility(8);
          this.N3().m.setVisibility(8);
       }else {
          this.N3().i.setVisibility(8);
       }
       n.Y(this.N3().y(), 8, false);
       return;
    }
    public final void S3(){
       int i;
       Workspace$Type aTLAS;
       Workspace$Type lONG_PICTURE;
       object obj;
       List list = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditorActivity uEditorActiv = EditorActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, list, uEditorActiv, "19")) {
          return;
       }
       list.d1 = v.g();
       RadioButton radioButton = list.L3(list.K3(EditorActivity$PreviewTabInfo.VIDEO));
       if (radioButton == null) {
          return;
       }
       RadioButton radioButton1 = list.L3(list.K3(EditorActivity$PreviewTabInfo.ATLAS));
       if (radioButton1 == null) {
          return;
       }
       RadioButton radioButton2 = list.L3(list.K3(EditorActivity$PreviewTabInfo.LONGPICTURE));
       if (radioButton2 == null) {
          return;
       }
       radioButton.setText(R.string.arg_RES_7f10162d);
       radioButton1.setText(R.string.arg_RES_7f103c5b);
       radioButton2.setText(R.string.arg_RES_7f1030c7);
       List list1 = i.m().y();
       c uoc = v.f();
       if (uoc == null || uoc.E()) {
          Object[] objArray1 = new Object[0];
          a.D().t(this.getUrl(), "Workspace state or data error. "+uoc+".Finish.", objArray1);
          i.a(R.style.arg_RES_7f110668, 0x7f100dd9);
          this.finish();
          return;
       }else {
          Workspace$Type type = uoc.a1();
          if (list1.size() <= 1) {
             EditorActivity p = list.P;
             int len = p.length;
             for (i = 0; i < len; i = i + 1) {
                p[i].setBackgroundColor(0);
             }
          }
          if (type == Workspace$Type.PHOTO_MOVIE) {
             this.N3().m.setVisibility(0);
             Workspace$Type[] typeArray = new Workspace$Type[]{aTLAS,lONG_PICTURE};
             aTLAS = Workspace$Type.ATLAS;
             lONG_PICTURE = Workspace$Type.LONG_PICTURE;
             type = (i.m().x(typeArray) != null)? 1: 0;
             EditorActivity$PreviewTabInfo previewTabIn = v.d();
             if (previewTabIn == null) {
                previewTabIn = v.e(list.d1);
             }
             if (s6.c()) {
                obj = PatchProxy.applyTwoRefs(list1, previewTabIn, list, uEditorActiv, "20");
                if (obj != patchProxyRe) {
                   previewTabIn = obj;
                }else if(this.U3() || list1.isEmpty()){
                   c uoc1 = list1.get(0);
                   if (DraftFileManager.E().H(uoc1).exists() && !uoc1.L0().isEmpty()) {
                      int i3 = EditorActivity$g.a[uoc1.a1().ordinal()];
                      if (i3 != 1) {
                         if (i3 != 2) {
                            if (i3 == 3) {
                               previewTabIn = EditorActivity$PreviewTabInfo.LONGPICTURE;
                            }
                         }else {
                            previewTabIn = EditorActivity$PreviewTabInfo.VIDEO;
                         }
                      }else {
                         previewTabIn = EditorActivity$PreviewTabInfo.ATLAS;
                      }
                   }
                }
             }
             EditorActivity$PreviewTabInfo aTLAS1 = EditorActivity$PreviewTabInfo.ATLAS;
             obj = list.P[list.K3(aTLAS1)];
             int i1 = (type)? 0: 8;
             obj.setVisibility(i1);
             EditorActivity$PreviewTabInfo lONGPICTURE = EditorActivity$PreviewTabInfo.LONGPICTURE;
             obj = list.P[list.K3(lONGPICTURE)];
             int i2 = (type)? 0: 8;
             obj.setVisibility(i2);
             EditorActivity$PreviewTabInfo vIDEO = EditorActivity$PreviewTabInfo.VIDEO;
             list.P[list.K3(vIDEO)].setVisibility(0);
             Object[] objArray2 = PatchProxy.apply(objArray, list, uEditorActiv, "52");
             if (objArray2 != patchProxyRe) {
             }else {
                c$a uoa = c$a.b(this.getIntent());
                if (uoa != null) {
                   if (uoa.d() == PicTemplatePageParamBuilderPresenter$TemplateType.LONG_PIC.getType()) {
                      lONGPICTURE = aTLAS1;
                      aTLAS1 = lONGPICTURE;
                   }else if(uoa.d() == PicTemplatePageParamBuilderPresenter$TemplateType.ATLAS.getType()){
                   label_0176 :
                      aTLAS1 = objArray;
                   }
                }else {
                   goto label_0176 ;
                }
                if (aTLAS1 != null && list.P[list.K3(aTLAS1)].getVisibility()) {
                   if (!list.P[list.K3(lONGPICTURE)].getVisibility()) {
                      objArray = lONGPICTURE;
                   }
                }else {
                   objArray = aTLAS1;
                }
                objArray2 = objArray;
             }
             if (objArray2 == null) {
                if (!list.P[list.K3(previewTabIn)].getVisibility()) {
                   list.e1 = list.K3(previewTabIn);
                   list.W3(list.P[list.K3(previewTabIn)]);
                }else {
                   list.e1 = list.K3(vIDEO);
                   list.W3(list.P[list.K3(vIDEO)]);
                }
             }else {
                list.e1 = list.K3(objArray2);
                list.W3(list.P[list.K3(objArray2)]);
             }
             Workspace$Type[] typeArray1 = new Workspace$Type[]{aTLAS,lONG_PICTURE};
             if (i.m().x(typeArray1) == null) {
                list.P[list.K3(vIDEO)].setClickable(0);
             }
          }else {
             Workspace$Type sINGLE_PICTU = Workspace$Type.SINGLE_PICTURE;
             if (type == sINGLE_PICTU) {
                this.N3().m.setVisibility(8);
                list.b4(sINGLE_PICTU);
             }else if(f.E(type)){
                this.N3().m.setVisibility(0);
                EditorActivity$PreviewTabInfo aTLAS2 = (type == Workspace$Type.ATLAS)? EditorActivity$PreviewTabInfo.ATLAS: EditorActivity$PreviewTabInfo.LONGPICTURE;
                Iterator iterator = list.d1.iterator();
                while (iterator.hasNext()) {
                   EditorActivity$PreviewTabInfo previewTabIn1 = iterator.next();
                   object oobject = list.P[list.K3(previewTabIn1)];
                   int i4 = (previewTabIn1 == aTLAS2)? 0: 8;
                   oobject.setVisibility(i4);
                }
                list.e1 = list.K3(aTLAS2);
                list.W3(list.P[list.K3(aTLAS2)]);
                list.P[list.K3(aTLAS2)].setClickable(0);
                list.P[list.K3(aTLAS2)].getLayoutParams().leftMargin = 0;
                list.P[list.K3(aTLAS2)].getLayoutParams().rightMargin = 0;
                list.P[list.K3(aTLAS2)].setGravity(17);
                list.P[list.K3(aTLAS2)].requestLayout();
             }else {
                this.N3().m.setVisibility(8);
                this.d4();
             }
          }
          this.N3().m.setIndicatorUseAnim(0);
          this.N3().k.getViewTreeObserver().addOnPreDrawListener(new EditorActivity$e(list, list1));
          if (this.U3()) {
             this.N3().m.setVisibility(8);
          }
          return;
       }
    }
    public boolean T0(){
       c obj = PatchProxy.apply(null, this, EditorActivity.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.O.getValue() instanceof EditorActivity$h) {
          return this.O.getValue().T0();
       }
       int i = 0;
       if (i.h()) {
          Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE};
          if (i.m().x(typeArray) != null) {
             return 1;
          }else {
             obj = v.f();
             if (obj != null && obj.v() != null) {
                Workspace$Type type = obj.a1();
                if (f.E(type) || type == Workspace$Type.PHOTO_MOVIE) {
                   i = true;
                }
                return i;
             }
          }
       }
       if (("photo").equals(this.W) || ("post_share_photo").equals(this.W)) {
          i = true;
       }
       return i;
    }
    public final void T3(){
       boolean b;
       EditorActivity uEditorActiv = EditorActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEditorActiv, "7")) {
          return;
       }
       if (this.U3()) {
          this.P3();
          return;
       }else {
          EditorActivity tV0 = this.V0;
          if (!PatchProxy.isSupport(uEditorActiv) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tV0), this, uEditorActiv, "10")) {
             int i = 0;
             Object[] objArray1 = new Object[i];
             a.D().w("EditorActivity", "updateLeftBtnIcon isClose:"+tV0+",mSource:"+this.W, objArray1);
             if (p0.b(this.W)) {
                this.N3().e.setImageResource(R.drawable.arg_RES_7f080df5);
             }else if(tV0 != null){
                Object obj = PatchProxy.apply(objArray, this, uEditorActiv, "11");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(j0.a(this.getIntent(), "FROM_BACKGROUND", i) && PostExperimentUtils.I0()){
                   i = 1;
                }
                b = i;
                if (!b) {
                   this.N3().e.setImageResource(R.drawable.arg_RES_7f080429);
                }
             }
             this.N3().e.setImageResource(R.drawable.arg_RES_7f0807e7);
          }
          this.N3().k.getLayoutParams().height = a1.d(0x7f070310);
          ViewGroup$MarginLayoutParams layoutParams = this.N3().e.getLayoutParams();
          layoutParams.setMargins(a1.d(R.dimen.arg_RES_7f070329), a1.e(2.00f), a1.e(2.00f), a1.e(2.00f));
          layoutParams.height = a1.e(40.00f);
          layoutParams.width = a1.e(40.00f);
          this.N3().e.setLayoutParams(layoutParams);
          return;
       }
    }
    public final boolean U3(){
       Object obj = PatchProxy.apply(null, this, EditorActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.C(this.getIntent());
    }
    public boolean V3(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorActivity.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == this.O.getValue())? true: false;
       return b;
    }
    public IViewBinder V5(int p0){
       AbsEditorActivityViewBinder uAbsEditorAc;
       String str;
       EditorActivity uEditorActiv = EditorActivity.class;
       if (PatchProxy.isSupport(uEditorActiv)) {
          uAbsEditorAc = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEditorActiv, "40");
          if (uAbsEditorAc != PatchProxyResult.class) {
          label_0041 :
             return uAbsEditorAc;
          }
       }
       EditAbilityConfig uEditAbility = j0.e(this.getIntent(), "editAbilityConfig");
       if (uEditAbility == null) {
          uEditAbility = EditAbilityConfig.DEFAULT;
       }
       uEditAbility = uEditAbility.mActivityScenario;
       if (uEditAbility.isEmpty()) {
          str = t.c(this.getIntent());
       }
       uAbsEditorAc = c.a(str, AbsDefaultEditorActivityViewBinder.class, this);
       goto label_0041 ;
    }
    public void W3(RadioButton p0){
       double d1;
       ClientEvent$ElementPackage uElementPack;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, EditorActivity.class, "27")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorActivity", "onTabClicked", objArray);
       String str = (obj.O.getValue() != null)? 1: null;
       EditorActivity$PreviewTabInfo vIDEO = EditorActivity$PreviewTabInfo.VIDEO;
       int i = 0;
       EditorActivity p = obj.P;
       while (i < p.length) {
          int i1 = 0;
          if (obj1 == p[i]) {
             if (str) {
                int i2 = 406;
                String str1 = "switch_top_tab";
                double d = (double)i;
                if (PatchProxy.isSupport(s.class)) {
                   d1 = d;
                   if (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(i2), str1, Double.valueOf(d), null, s.class, "18")) {
                   }
                }else {
                   d1 = d;
                }
             }
          label_0070 :
             EditorActivity$PreviewTabInfo previewTabIn = obj.d1.get(i);
             if (this.T0()) {
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putString("newLastPhotosPageKey", previewTabIn.mPageKey);
                g.a(uEditor);
             }
             if (PostExperimentUtils.b1()) {
                obj1.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
             }else {
                obj1.setTextColor(a1.a(R.color.arg_RES_7f0601cb));
             }
             obj1.setTextSize(0, (float)a1.e(17.00f));
             p0.getViewTreeObserver().addOnGlobalLayoutListener(new EditorActivity$f(obj, obj1));
             vIDEO = previewTabIn;
          }else if(PostExperimentUtils.b1()){
             obj.P[i].setTextColor(a1.a(R.color.arg_RES_7f061dc8));
          }else {
             obj.P[i].setTextColor(a1.a(R.color.arg_RES_7f060184));
          }
          int i4 = 0;
          obj.P[i].setTextSize(i4, (float)a1.e(16.00f));
          obj.P[i].setSelected(i4);
          obj.P[i].setChecked(i4);
          obj.P[i].setTypeface(i1, i4);
          obj.P[i].invalidate();
          i = i + 1;
          d1 = 0;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditorActivity", "onTabClicked tabInfo:"+vIDEO, objArray1);
       int i3 = EditorActivity$g.c[vIDEO.ordinal()];
       if (i3 != 1) {
          if (i3 != 2) {
             if (i3 == 3) {
                obj.b4(Workspace$Type.ATLAS);
                obj.a1 = "tab=atlas";
                if (str) {
                   u1.y(obj1, "atlas");
                }
             }
          }else {
             obj.b4(Workspace$Type.LONG_PICTURE);
             obj.a1 = "tab=long_figure";
             if (str != null) {
                u1.y(obj1, "long_figure");
             }
          }
       }else {
          this.d4();
          obj.a1 = "tab=photo_film";
          if (str != null) {
             u1.y(obj1, "photo_film");
          }
       }
       return;
    }
    public final void X3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorActivity.class, "62")) {
          return;
       }
       if (j0.a(this.getIntent(), "IS_RECOVER", false) && p0.J0() != null) {
          p0.J0().d();
       }
       d.a(0x7c418b06).r50(this, -1, p0);
       this.X = true;
       this.finish();
       this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       return;
    }
    public void Y3(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "41")) {
          return;
       }
       if (this.U == null) {
          return;
       }
       d.a(0x14d6f666).UL(this);
       return;
    }
    public void Z3(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "31")) {
          return;
       }
       int i = 0;
       if (this.isFinishing() || !i.h()) {
          Object[] objArray = new Object[i];
          a.D().A("EditorActivity", "showTitleBar activity is finishing", objArray);
          return;
       }else {
          this.Z0 = true;
          if (this.Y0 != null) {
             n.Y(this.N3().k, i, true);
             n.Y(this.N3().i, i, true);
             n.Y(this.N3().y(), i, i);
             if (v.f() != null && (v.f().a1() != Workspace$Type.PHOTO_MOVIE && (v.f().a1() == Workspace$Type.LONG_PICTURE || v.f().a1() == Workspace$Type.ATLAS))) {
                n.Y(this.N3().m, i, true);
             }
          }
          return;
       }
    }
    public String a2(){
       String obj = PatchProxy.apply(null, this, EditorActivity.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.O.getValue() != null)? this.O.getValue().getUrl(): "ks://preview/unknown";
       return obj;
    }
    public final void a4(Fragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorActivity.class, "37")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorActivity", "switchFragment to:"+p0+",tag:"+p1+",CurrentFragment:"+this.O.getValue(), objArray);
       if (this.O.getValue() != p0) {
          try{
             e uoe = this.getSupportFragmentManager().beginTransaction();
             if (this.O.getValue() == null) {
                if (!p0.isAdded()) {
                   uoe.g(R.id.container_all, p0, p1);
                   uoe.m();
                }else {
                   uoe.E(p0).m();
                }
             }else if(!p0.isAdded()){
                uoe = uoe.s(this.O.getValue());
                uoe.g(R.id.container_all, p0, p1);
                uoe.m();
             }else {
                uoe.s(this.O.getValue()).E(p0).m();
             }
             this.O.setValue(p0);
          }catch(java.lang.Exception e5){
             PostUtils.D("EditorActivity", "switchFragment", e5);
          }
       }
    }
    public final void b4(Workspace$Type p0){
       EditorActivity$PreviewTabInfo aTLAS1;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorActivity.class, "34")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorActivity", "switchToPicturesPreview switchToType:"+p0, objArray);
       if (!ActivityContext.g().e() instanceof EditorActivity) {
          return;
       }
       int i = 3;
       Workspace$Type[] typeArray = new Workspace$Type[i];
       Workspace$Type sINGLE_PICTU = Workspace$Type.SINGLE_PICTURE;
       typeArray[0] = sINGLE_PICTU;
       Workspace$Type aTLAS = Workspace$Type.ATLAS;
       typeArray[1] = aTLAS;
       Workspace$Type lONG_PICTURE = Workspace$Type.LONG_PICTURE;
       typeArray[2] = lONG_PICTURE;
       if (i.m().x(typeArray) == null) {
          Object[] objArray1 = new Object[0];
          a.D().w("EditorActivity", "switchToPicturesPreview draft is null", objArray1);
          return;
       }else if(p0 == aTLAS){
          aTLAS1 = EditorActivity$PreviewTabInfo.ATLAS;
       }else {
          aTLAS1 = EditorActivity$PreviewTabInfo.LONGPICTURE;
       }
       int i1 = 0x4b316083;
       if (this.O.getValue() instanceof PhotosEditPreviewV3Fragment) {
          this.O.getValue().Mh(p0, 0);
          if (b.a(i1).f() != null) {
             b.a(i1).f().y(this.O.getValue().getUrl());
          }
       }else if(this.V[this.K3(aTLAS1)] == null){
          Fragment uFragment = this.getSupportFragmentManager().findFragmentByTag(aTLAS1.mPageKey);
          this.V[this.K3(aTLAS1)] = uFragment;
          if (uFragment == null) {
             PhotosEditPreviewV3Fragment photosEditPr = PatchProxy.applyOneRefs(p0, null, PhotosEditPreviewV3Fragment.class, "1");
             if (photosEditPr != PatchProxyResult.class) {
             }else {
                photosEditPr = new PhotosEditPreviewV3Fragment();
                photosEditPr.V0 = p0;
                Bundle uBundle = new Bundle();
                uBundle.putInt("PHOTOS_EDIT_TYPE", p0.getNumber());
                photosEditPr.setArguments(uBundle);
             }
             EditorActivity$PreviewTabInfo aTLAS2 = EditorActivity$PreviewTabInfo.ATLAS;
             this.V[this.K3(aTLAS2)] = photosEditPr;
             this.V[this.K3(EditorActivity$PreviewTabInfo.LONGPICTURE)] = this.V[this.K3(aTLAS2)];
             b = true;
          label_0109 :
             this.a4(this.V[this.K3(aTLAS1)], aTLAS1.mPageKey);
             if (!b) {
                this.O.getValue().Mh(p0, 1);
                this.N3().G(f.l(this.O.getValue()), this.O.getValue());
             }
             if (b.a(i1).f() != null) {
                b.a(i1).f().y(this.V[this.K3(aTLAS1)].getUrl());
             }
             Object[] objArray3 = new Object[0];
             a.D().w("EditorActivity", "switchToPicturesPreview isNew:"+b, objArray3);
          }
       }
       b = false;
       goto label_0109 ;
       if (i.h()) {
          Workspace$Type[] typeArray1 = new Workspace$Type[i];
          typeArray1[0] = sINGLE_PICTU;
          typeArray1[1] = aTLAS;
          typeArray1[2] = lONG_PICTURE;
          i.m().p().f().l(typeArray1);
       }
       Object[] objArray2 = new Object[0];
       a.D().w("EditorActivity", "switchToPicturesPreview switchToTabInfo:"+aTLAS1, objArray2);
       return;
    }
    public final void d4(){
       int i;
       f obj;
       KtvSongEditPreviewFragment ktvSongEditP;
       EditorActivity uEditorActiv = EditorActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEditorActiv, "35")) {
          return;
       }
       EditorActivity$PreviewTabInfo vIDEO = EditorActivity$PreviewTabInfo.VIDEO;
       if (this.V[this.K3(vIDEO)] == null) {
          this.V[this.K3(vIDEO)] = this.getSupportFragmentManager().findFragmentByTag(vIDEO.mPageKey);
       }
       if (this.V[this.K3(vIDEO)] == null) {
          EditorActivity tV = this.V;
          i = this.K3(vIDEO);
          obj = PatchProxy.apply(objArray, this, uEditorActiv, "36");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             c uoc1 = v.f();
             if (uoc1 != null && uoc1.v() != null) {
                Workspace$Type type = uoc1.a1();
                Workspace$Source rEEDIT = Workspace$Source.REEDIT;
                if (uoc1.T0() != rEEDIT && type == Workspace$Type.KTV_SONG) {
                   ktvSongEditP = new KtvSongEditPreviewFragment();
                }else if(uoc1.T0() != rEEDIT && type == Workspace$Type.KTV_MV){
                   ktvSongEditP = new KtvMvEditPreviewFragment();
                }else if(type == Workspace$Type.PHOTO_MOVIE && !b.d()){
                   t.a(this.getIntent(), "photoMovie");
                }else if(e0.e(v.f())){
                   t.a(this.getIntent(), "defaultV4");
                }
                ktvSongEditP = new VideoEditPreviewV3Fragment();
                objArray = ktvSongEditP;
                objArray.vh(0);
                if (this.T == null && (this.S != null || p0.b(this.W))) {
                   Bundle uBundle = new Bundle();
                   uBundle.putBoolean("FADE_COVER_NO_DIALOG", 1);
                   objArray.setArguments(uBundle);
                }
             }
          }
          tV[i] = objArray;
       }
       if (this.V[this.K3(vIDEO)] == null) {
          return;
       }else {
          this.a4(this.V[this.K3(vIDEO)], vIDEO.mPageKey);
          if (this.O.getValue().isAdded()) {
             this.N3().G(f.l(this.O.getValue()), this.O.getValue());
          }
          int i1 = 0x4b316083;
          if (b.a(i1).f() != null) {
             b.a(i1).f().y(this.V[this.K3(vIDEO)].getUrl());
          }
          if (i.h() && i.m().p().f() != null) {
             obj = i.m().p().f();
             int i2 = 3;
             Workspace$Type[] typeArray = new Workspace$Type[i2];
             typeArray[0] = Workspace$Type.SINGLE_PICTURE;
             typeArray[1] = Workspace$Type.ATLAS;
             typeArray[2] = Workspace$Type.LONG_PICTURE;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidOneRefs(typeArray, obj, f.class, "10")) {
                a.p(typeArray, "types");
                Iterator iterator = obj.j.iterator();
                while (true) {
                   if (!iterator.hasNext()) {
                      throw new IllegalStateException("aliveWorkspaceDraft is null");
                   }
                   c uoc = iterator.next();
                   int i3 = 0;
                   while (true) {
                      if (i3 < i2) {
                         if (uoc.a1() == typeArray[i3]) {
                            i3 = 0;
                         label_01a0 :
                            if (i3) {
                               obj.i = uoc;
                               break ;
                            }else {
                               continue ;
                            }
                         }else {
                            i3 = i3 + 1;
                         }
                      }else {
                         i3 = 1;
                         goto label_01a0 ;
                      }
                   }
                }
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorActivity.class, "1")) {
          return;
       }
       RadioButton[] radioButtonA = new RadioButton[]{m1.f(p0, 0x7f0a05a5),m1.f(p0, 0x7f0a05a6),m1.f(p0, 0x7f0a05a7)};
       this.P = radioButtonA;
       int i = 0;
       PostRadioGroupWithIndicator postRadioGro = m1.f(p0, R.id.tabs_container);
       this.Q = postRadioGro;
       if (postRadioGro == null) {
          String str = "doBindView : mRadioGroupWithIndicator is null";
          Object[] objArray = new Object[i];
          a.D().A("EditorActivity", str, objArray);
          PostUtils.D("EditorActivity", str, new NullPointerException(str));
       }else {
          postRadioGro.setTouchActionListener(new EditorActivity$a(this, p0));
          this.Q.setCorner((float)a1.e(0x3f800000));
       }
       this.N3().i.setOnClickListener(new EditorActivity$b(this));
       return;
    }
    public void finish(){
       Workspace$Type[] typeArray;
       c uoc;
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "29")) {
          return;
       }
       super.finish();
       FetchFrameManager.i().b();
       if (this.l1 != null) {
          this.V2().removeCallbacks(this.l1);
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "EditorActivity";
       a.D().w(str, "finish source="+this.W, objArray);
       if (this.k1 == null) {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "finish editorActivity not single top", objArray1);
          return;
       }else {
          this.j1.o0().s0(s.a);
          if (this.V0 != null && this.W0 == null) {
             this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
          }
          if (!i.h()) {
             return;
          }else if(this.W == null){
             PostUtils.D(str, "finish", new RuntimeException("mSource is null"));
             return;
          }else {
             String str1 = 3;
             if (i.m().D() == str1) {
                i.m().s();
                i.m().j(i);
                return;
             }else if(!EditAbilityConfig.enableDraft(i.g())){
                i.m().s();
                i.m().i();
                return;
             }else {
                EditorActivity tW = this.W;
                switch (tW.hashCode()){
                    case 0xae79c325:
                      if (tW.equals("camera")) {
                         str1 = 18;
                      }else {
                      label_01c8 :
                         str1 = -1;
                      }
                      break;
                    case 0xb4359a12:
                      if (tW.equals("recreation")) {
                         str1 = 0;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xb96173a5:
                      if (tW.equals("import")) {
                         str1 = 16;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xbd3046fb:
                      if (tW.equals("ktv_mv")) {
                         str1 = 10;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xbfc2bd01:
                      if (tW.equals("memory")) {
                         str1 = 14;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xdd905cfe:
                      if (tW.equals("picture")) {
                         str1 = 5;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xe3998bd1:
                      if (tW.equals("album_draft")) {
                         str1 = 19;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xe4175160:
                      if (tW.equals("album_movie")) {
                         str1 = 17;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xea566ce1:
                      if (tW.equals("share_photos")) {
                         str1 = 12;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0xef54ba4f:
                      if (tW.equals("source_ai_cut")) {
                         str1 = 13;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x17a21:
                      if (tW.equals("app")) {
                         str1 = 11;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x2f6e0a:
                      if (tW.equals("edit")) {
                         str1 = 22;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x609c88a:
                      if (tW.equals("joint")) {
                         str1 = 8;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x65b3e32:
                      if (tW.equals("photo")) {
                         str1 = 4;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x22f454b3:
                      if (!tW.equals("post_share_photo")) {
                      }
                      break;
                    case 0x23bde417:
                      if (tW.equals("SOURCE_FANSTOP_EDITOR_IMAGE")) {
                         str1 = 6;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x24734f37:
                      if (tW.equals("SOURCE_FANSTOP_EDITOR_VIDEO")) {
                         str1 = 7;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x24dfda74:
                      if (tW.equals("kuaishan_mv")) {
                         str1 = 15;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x323d21e7:
                      if (tW.equals("ktv_song")) {
                         str1 = 9;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x4aa58d92:
                      if (tW.equals("cover_edit")) {
                         str1 = 21;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x5589286c:
                      if (tW.equals("music_recreation")) {
                         str1 = 1;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x6869540e:
                      if (tW.equals("cover_re_edit")) {
                         str1 = 20;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    case 0x773427f3:
                      if (tW.equals("picture_recreation")) {
                         str1 = 2;
                      }else {
                         goto label_01c8 ;
                      }
                      break;
                    default:
                      goto label_01c8 ;
                }
                switch (str1){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 1:
                      i.m().s();
                      i.m().i();
                      break;
                    case 16:
                      if (!j0.a(this.getIntent(), "edit_from_mix_preview_page", i) || j0.a(this.getIntent(), "INTENT_EXTRA_IS_FROM_IM_MESSAGE", i)) {
                         i.m().s();
                      }else {
                         i.m().p().b();
                      }
                      i.m().i();
                      break;
                    case 17:
                      i.m().p().b();
                      i.m().i();
                      break;
                    case 18:
                      if (!j0.a(this.getIntent(), "edit_from_mix_preview", i)) {
                         i.m().s();
                         typeArray = new Workspace$Type[]{Workspace$Type.VIDEO};
                         uoc = i.m().x(typeArray);
                      }else {
                         i.m().p().b();
                         typeArray = new Workspace$Type[]{Workspace$Type.LONG_VIDEO};
                         uoc = i.m().x(typeArray);
                      }
                      if (uoc != null) {
                         int i1 = EditorActivity$g.d[uoc.T0().ordinal()];
                      }
                      break;
                    case 19:
                      i.m().s();
                      if (this.X == null) {
                         i.m().i();
                      }
                      break;
                    default:
                }
             label_0281 :
                return;
             }
          }
       }
    }
    public void finishAffinity(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "30")) {
          return;
       }
       super.finishAffinity();
       if (this.V0 != null && this.W0 == null) {
          this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorActivity.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, EditorActivity.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(EditorActivity.class, new i0());
       }else {
          obj.put(EditorActivity.class, null);
       }
       return obj;
    }
    public int getPage(){
       int i;
       String obj = PatchProxy.apply(null, this, EditorActivity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (i.h())? EditAbilityConfig.page2Name(i.g()): "";
       if (!obj.isEmpty()) {
          return 0;
       }else if(p0.b(this.W)){
          return 0;
       }else if(j0.a(this.getIntent(), "is_long_video", 0)){
          return 116;
       }else if(this.T0()){
          i = 63;
       }else {
          i = 29;
       }
       return i;
    }
    public String getPageParams(){
       int b;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditorActivity uEditorActiv = EditorActivity.class;
       Object[] objArray = null;
       String obj1 = PatchProxy.apply(objArray, obj, uEditorActiv, "49");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       String str = "photo_task_id";
       String str1 = "task_id=";
       String str2 = "&";
       obj1 = (TextUtils.x(obj.a1))? str1+j0.f(this.getIntent(), str): str1+j0.f(this.getIntent(), str)+str2+obj.a1;
       Workspace$Type[] typeArray = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE};
       int i = 1;
       c uoc = i.m().w(typeArray);
       if (uoc != null) {
          if (uoc.T0() == Workspace$Source.ANNUAL_ALBUM_2022) {
             obj1 = obj1+"&year_album_type=auto";
          }else if(uoc.T0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL){
             obj1 = obj1+"&year_album_type=manual";
          }
       }
       if (!TextUtils.x(obj.i1)) {
          obj1 = obj1+"&activity="+obj.i1;
       }
       String str3 = j0.f(this.getIntent(), "SOURCE");
       Intent intent = this.getIntent();
       pb$a e = pb.e;
       Objects.requireNonNull(e);
       String str4 = "";
       if (uoc != null) {
          str = ((e.d(uoc)).length() > 0)? 1: null;
          if (str) {
          label_0105 :
             str = 1;
          label_0108 :
             String str5 = "post_share_photo";
             if (str) {
                str = "ecosys";
             }else if(("edit").equals(str3)){
                str = "draft_photo";
             }else if(!("import").equals(str3) && ("photo".equals(str3) || str5.equals(str3))){
                str = "import_photo";
             }else if(("album_draft").equals(str3)){
                str = "import_draft_photo";
             }else if("source_ai_cut".equals(str3)){
                str = "AI_CUT";
             }else if(("album_movie").equals(str3)){
                str = "intelligent_album";
             }else if(("cover_re_edit").equals(str3)){
                str = "reedit_photo";
             }else {
                Object[] objArray1 = objArray;
             }
             if (!TextUtils.x(str)) {
                obj1 = obj1+"&edit_type="+str;
             }
             str = PatchProxy.applyOneRefs(str3, obj, uEditorActiv, "53");
             if (str != patchProxyRe) {
             }else if(this.getIntent() == null){
                ArrayList uArrayList = new ArrayList();
                Workspace$Type[] typeArray2 = new Workspace$Type[i];
                typeArray2[0] = Workspace$Type.AI_CUT;
                c uoc2 = i.m().x(typeArray2);
                String str8 = "mix_video_tracks";
                if (this.getIntent().hasExtra(str8)) {
                   List list = j0.e(this.getIntent(), str8);
                   if (list != null) {
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         uArrayList.add(iterator.next().mMedia);
                      }
                      str = h0.e(uArrayList);
                   }
                }else {
                   str8 = "PHOTOS";
                   String str9 = "picture_cnt=";
                   if (this.getIntent().hasExtra(str8) && ("photo".equals(str3) || str5.equals(str3))) {
                      String[] stringArrayE = this.getIntent().getStringArrayExtra(str8);
                      if (stringArrayE != null) {
                         str = str9+stringArrayE.length;
                      }
                   }else if(uoc2 != null && "source_ai_cut".equals(str3)){
                      a uoa2 = uoc2.o0();
                      if (uoa2 != null) {
                         b = f.g(uoa2);
                         str = "video_cnt="+(uoa2.p() - b)+str2+str9+b;
                      }
                   }
                }
             }
             str = str4;
             if (!TextUtils.x(str)) {
                obj1 = obj1+str2+str;
             }
             StringBuilder obj2 = PatchProxy.apply(objArray, obj, uEditorActiv, "9");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else if(v.f() != null && (v.f().a1() == Workspace$Type.KTV_MV || v.f().a1() == Workspace$Type.KTV_SONG)){
                b = true;
             }else {
                b = false;
             }
             obj1 = (b)? obj1+"&edit_photo_type=karaoke": obj1+"&edit_photo_type=normal";
             if (i.h()) {
                obj2 = i.m().z("toolbox_template_params");
                if (obj2 instanceof String) {
                   obj1 = obj1+str2+obj2;
                }
             }
             obj2 = obj1;
             String str6 = PatchProxy.apply(objArray, obj, uEditorActiv, "51");
             if (str6 != patchProxyRe) {
             }else {
                Workspace$Type[] typeArray1 = new Workspace$Type[]{Workspace$Type.ATLAS,Workspace$Type.LONG_PICTURE,Workspace$Type.SINGLE_PICTURE};
                c uoc1 = i.m().x(typeArray1);
                if (uoc1 != null) {
                   c$a uoa = c$a.b(this.getIntent());
                   if (uoa != null) {
                      String[] stringArray = uoa.c();
                      if (stringArray != null && stringArray.length > 0) {
                         str6 = "&template_id="+ArraysKt___ArraysKt.xg(stringArray, ",", "", "", -1, "", null);
                      }
                   }else {
                      a uoa1 = uoc1.O0();
                      if (uoa1 != null) {
                         Template template = uoa1.v();
                         if (template != null && !TextUtils.x(template.getTemplateId())) {
                            str6 = "&template_id="+template.getTemplateId();
                         }
                      }
                   }
                }
                str6 = str4;
             }
             obj1 = obj2+str6;
             Object obj3 = PatchProxy.applyOneRefs(str3, obj, uEditorActiv, "50");
             if (obj3 != patchProxyRe) {
                str4 = obj3;
             }else if(!PostExperimentUtils.c1() || !this.T0()){
                String str7 = j0.f(this.getIntent(), "EDIT_PHOTO_ENTRANCE_TYPE");
                if (!TextUtils.x(str7)) {
                   str4 = "&entrance_type="+str7;
                }else if(("picture").equals(str3)){
                   str4 = "&entrance_type=take_picture";
                }else if("photo".equals(str3)){
                   str4 = "&entrance_type=click_photo_picker";
                }
             }
             return obj1+str4;
          }
       }
       if (intent != null) {
          str = intent.getStringExtra("INTENT_EXTRA_RELAY_EXTRA_INFO");
          if (str == null) {
             str = str4;
          }
          a.o(str, "intent.getStringExtra\(IN\x20\x02A_RELAY_EXTRA_INFO\) ?: \"\"\x00");
          uoc = ((e.g(str)).length() > 0)? 1: 0;
          if (uoc) {
             goto label_0105 ;
          }
       }
       str = null;
       goto label_0108 ;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, EditorActivity.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       StringBuilder obj = PatchProxy.apply(null, this, EditorActivity.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ks://editorActivity";
       String str = (TextUtils.x(this.W))? "": "/"+this.W;
       return obj+str;
    }
    public String o(){
       String obj = PatchProxy.apply(null, this, EditorActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.b(this.W)) {
          return "RETRANS_EDIT_PREVIEW";
       }
       obj = (i.h())? EditAbilityConfig.page2Name(i.g()): "";
       if (!obj.isEmpty()) {
          Object[] objArray = new Object[0];
          a.D().w("EditorActivity", "getPage2:"+obj, objArray);
          return obj;
       }else {
          return super.o();
       }
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       int i;
       EditorActivity uEditorActiv = EditorActivity.class;
       if (PatchProxy.isSupport(uEditorActiv) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, EditorActivity.class, "43")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (PatchProxy.isSupport(uEditorActiv) && (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, EditorActivity.class, "44") && (p0 == 2325 && p1 == -1))) {
          i.m().p().b();
          c uoc = v.f();
          if (uoc != null) {
             KtvInfo ktvInfo = u.N(uoc);
             p.a().l(ktvInfo);
             b9.a(this.b1);
             Intent intent = this.getIntent();
             if (!PatchProxy.applyVoidThreeRefs(intent, p2, ktvInfo, null, p.class, "30")) {
                intent.removeExtra("PHOTOS");
                i = j0.b(p2, "INTENT_EXTRA_BGM_AUDIO_DURATION", 0);
                if (ktvInfo != null) {
                   ktvInfo.setSongMode(0);
                   if (i) {
                      ktvInfo.mSingDuration = i;
                      ktvInfo.mCropEnd = ktvInfo.mCropBegin + i;
                   }
                   ktvInfo.mFromAddMv = true;
                   intent.putExtra("ktv_info", ktvInfo.toFullJson());
                }
                p2.putExtra("MUSIC_START_TIME", j0.b(intent, "MUSIC_START_TIME", 0));
                p2.putExtra("photo_task_id", j0.f(intent, "photo_task_id"));
                p2.putExtra("SOURCE", "ktv_mv");
                if (e.c(intent) == null) {
                   ktvInfo = ktvInfo.mMusic;
                   if (ktvInfo != null) {
                      SerializableHook.putExtra(p2, "ktv_music", ktvInfo);
                   }
                }
                intent.putExtras(p2);
             }
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = i.m().y().iterator();
             while (iterator.hasNext()) {
                c uoc1 = iterator.next();
                uArrayList.add(uoc1.f0());
                uoc1.g0(new File(uoc1.f0().getAbsolutePath()+"-tmp"));
             }
             i.m().i();
             Object[] objArray = new Object[0];
             a.D().w("EditorActivity", "needRefreshByAddMV requestCode:"+p0+",resultCode:"+p1, objArray);
             i.m().p().n(this.getIntent(), true);
             this.b1 = i.m().p().e(new k(this, uArrayList), l.b);
          }
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "26")) {
          return;
       }
       if (this.S != null) {
          Object[] objArray = new Object[0];
          a.D().s("EditorActivity", "onBackPressed: fade image is showing. no repsone to backpress", objArray);
          return;
       }else {
          super.onBackPressed();
          return;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorActivity.class, "14")) {
          return;
       }
       super.onConfigurationChanged(p0);
       EditorActivity tg1 = this.g1;
       if (tg1 == null) {
          return;
       }
       int i = tg1.diff(p0);
       this.g1 = new Configuration(p0);
       if (!(i & 0x0800) && (!(i & 0x0400) && ((i & 0x0100) || (i & 0x0080)))) {
          this.j1.o0().s0(new z(i));
          this.y3();
       }
       return;
    }
    public void onCreate(Bundle p0){
       int i;
       RxBus f;
       PostOuterTaskManager$a d;
       j0 oj0 = this;
       PreLoader obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditorActivity uEditorActiv = EditorActivity.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(obj, oj0, uEditorActiv, str)) {
          return;
       }
       d.a(0x1bf6ff1d).P2();
       Object[] objArray = null;
       String str1 = "1";
       if (!PatchProxy.applyVoid(objArray, objArray, n0.class, str1)) {
          d.d("postPhotoToEditorMonitor").h("pauseToStart");
          d.d("postPhotoToEditorMonitor").g("startToPreview");
          d.d("postVideoToEditorMonitor").h("pauseToCreate");
          d.d("postVideoToEditorMonitor").g("createToPreview");
       }
       this.getViewModelStore().clear();
       j0 oj01 = ViewModelProviders.of(oj0, new EditorActivity$c(oj0)).get(j0.class);
       oj0.j1 = oj01;
       oj01.o0().b();
       oj0.f1 = new PresenterV2();
       String str2 = 1;
       boolean b = false;
       if (this.getClass() == uEditorActiv) {
          EditorActivity uEditorActiv1 = (SystemUtil.I() || a.t().d("editor_thread_monitor", b))? 1: null;
          if (uEditorActiv1) {
             oj0.f1.U7(new e1());
          }
       }
       oj0.f1.U7(new a());
       super.onCreate(p0);
       if (i.h() && i.m().X(uEditorActiv) > str2) {
          oj0.k1 = b;
          Object[] objArray1 = new Object[b];
          a.D().w("EditorActivity", "onCreate editorActivity exist", objArray1);
          this.finish();
          return;
       }else if(this.isFinishing()){
          return;
       }else if(!c.g()){
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
          return;
       }else {
          this.getWindow().addFlags(128);
          this.getWindow().setFormat(-3);
          Intent intent = this.getIntent();
          if (!PatchProxy.applyVoidOneRefs(intent, oj0, uEditorActiv, "5")) {
             oj0.W = j0.f(intent, "SOURCE");
             Object[] objArray5 = new Object[b];
             a.D().s("EditorActivity", "mSource:"+oj0.W, objArray5);
             oj0.Z = j0.c(intent, "photoCropId", -1);
          }
          o oo = oj0.j1.p0();
          EditorActivity w = oj0.W;
          Objects.requireNonNull(oo);
          o oo1 = o.class;
          if (PatchProxy.applyOneRefs(w, oo, oo1, str) != patchProxyRe) {
          }else {
             str = "cover_edit";
             if (str.equals(w) || "cover_re_edit".equals(w)) {
                if (!PatchProxy.applyVoidTwoRefs(oo, w, objArray, oo1, "7")) {
                   if (!PatchProxy.applyVoidTwoRefs(oo, w, objArray, e.class, str1) && ("cover_re_edit".equals(w) || str.equals(w))) {
                      oo.b("Text", new d1());
                      oo.b("Cover", new e());
                   }
                   String str5 = "pageSource";
                   if (!PatchProxy.applyVoidTwoRefs(oo, w, objArray, i.class, str1)) {
                      a.p(oo, "register");
                      a.p(w, str5);
                      if (a.g("cover_re_edit", w)) {
                         oo.b("Music_V2", new h());
                      }
                   }
                   if (!PatchProxy.applyVoidTwoRefs(oo, w, objArray, c.class, str1)) {
                      a.p(oo, "register");
                      a.p(w, str5);
                      if (a.g("cover_re_edit", w)) {
                         oo.b("Text_V2", new b());
                      }
                   }
                   if (!PatchProxy.applyVoidTwoRefs(oo, w, objArray, f.class, str1)) {
                      a.p(oo, "register");
                      a.p(w, str5);
                      Object[] objArray4 = new Object[0];
                      a.D().w("TextEditorV3Factory", "register pageSource:"+w, objArray4);
                      if (a.g("cover_re_edit", w)) {
                         oo.b("Text_V3", new e());
                      }
                   }
                }
             }else if(PatchProxy.applyVoid(objArray, oo, oo1, str1)){
                c uoc = new c(oo);
             }
          }
          oj0.j1.p0().c(new u(oj0));
          oj0.j1.o0().s0(new a0(obj));
          if (k.a() == null) {
             k.e(new a());
          }
          if (PostExperimentUtils.H0()) {
             obj = PreLoader.getInstance();
             PreloadParam$Builder uBuilder = new PreloadParam$Builder(oj0);
             i = (e0.e(v.f()))? 0x7f0d109e: 0x7f0d109d;
             obj.preload(uBuilder.addLayoutId(i).build());
          }
          EditorActivity.o1 = EditorActivity.o1 + 1;
          Intent intent1 = this.getIntent();
          if (!PatchProxy.applyVoidOneRefs(intent1, oj0, uEditorActiv, "4")) {
             long l1 = SystemClock.elapsedRealtime();
             long l2 = 0;
             long l3 = j0.c(intent1, "START_PREVIEW_ACTIVITY_TIME", l2);
             if (l3 - l2 > 0 && l1 - l3 > 0) {
                PostUtils.x(this.getUrl(), "startnum"+EditorActivity.o1+"cost"+(l1 - l3));
             }
             l3 = j0.c(intent1, "photo_picker_click_next_time", l2);
             if (l3 - l2 > 0 && l1 - l3 > 0) {
                PostUtils.x("photo_picker_start_edit_cost", String.valueOf((l1 - l3)));
             }
          }
       label_02dd :
          boolean b1 = false;
          oj0.W0 = j0.a(this.getIntent(), "from_click_draft_remind_bubble", b1);
          boolean b2 = (this.D3() && (j0.d(this.getIntent(), "goto_page_list_when_finish") != null || (!j0.a(this.getIntent(), "EDIT_CLOSE_ICON_DEFAULT", b1) || oj0.W0 != null)))? true: false;
          oj0.V0 = b2;
          View view = BasePostActivity.C3(oj0, oj0.I.p());
          View view1 = PatchProxy.applyOneRefs(view, oj0, BasePostActivity.class, "30");
          if (view1 != patchProxyRe) {
          }else {
             view1 = oj0.J.g(view);
          }
          oj0.setContentView(view1);
          oj0.doBindView(this.getWindow().getDecorView());
          d.a(0x14d6f666).Ux(oj0.f1, j0.f(this.getIntent(), "SOURCE"), this.U3());
          if (EditAbilityConfig.enableNormalSplash(i.g())) {
             oj0.f1.U7(new t());
          }
          oj0.f1.U7(new a());
          if (("camera").equals(oj0.W)) {
             oj0.f1.U7(new n());
             oj0.f1.U7(new f());
          }
          if (p0.b(oj0.W)) {
             oj0.f1.U7(new m());
          }
          oj0.f1.U7(new e());
          oj0.f1.U7(new l());
          oj0.f1.U7(new c1());
          if (ta.a()) {
             oj0.f1.U7(new t1());
             oj0.f1.U7(new y1());
          }
          oj0.f1.f(this.N3().j);
          Object[] objArray2 = new Object[]{oj0};
          oj0.f1.i(objArray2);
          this.N3().m.setVisibility(8);
          this.N3().n.setVisibility(8);
          PostFunnelManager.j.a().d().l(p.b);
          long l = System.currentTimeMillis();
          a uoa = a.D();
          Object[] objArray3 = new Object[0];
          str = "EditCost";
          String str3 = "½øÈë±à¼­Ò³";
          try{
             uoa.w(str, str3, objArray3);
             this.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new EditorActivity$d(oj0));
          }catch(java.lang.IllegalStateException e0){
             PostUtils.D("EditorActivity", "addOnGlobalLayoutListener", e0);
          }catch(java.lang.Exception e0){
             PostUtils.D("EditorActivity", "addOnGlobalLayoutListener", e0);
          }
          f = RxBus.f;
          oj0.c1 = f.f(MultiplePhotosWorkManager$CropPhotoWorkEvent.class).observeOn(e.c).subscribe(new i(oj0), m.b);
          oj0.b1 = i.m().p().init().subscribe(new j(oj0, l), new t(oj0));
          d = PostOuterTaskManager.d;
          PostOuterTaskManager postOuterTas = r5.b().a(d.a(), PostOuterTaskManager.class);
          if (postOuterTas != null) {
             i.m().p().m(postOuterTas);
             r5.b().d(d.a());
          }
          EditorActivity z = oj0.Z;
          MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = MultiplePhotosWorkManager.f().c.get(Long.valueOf(z));
          StringBuilder str4 = "getWorkInfo workId:"+z;
          objArray2 = new Object[0];
          a.D().w("MultiplePhotosWorkManager", str4+",cropWorkInfo:"+uCropWorkInf, objArray2);
          if (uCropWorkInf != null && (uCropWorkInf.b() == MultiplePhotosWorkManager$CropWorkInfo$Status.PREPARED || uCropWorkInf.b() == MultiplePhotosWorkManager$CropWorkInfo$Status.PENDING)) {
             oj0.Y = new CountDownLatch(1);
          }
          oj0.g1 = this.getResources().getConfiguration();
          c.a(new v(oj0));
          oj0.E3(new w(oj0));
          oj0.i1 = i.m().k().b();
          if (j.j(v.f())) {
             f.b(new a(oj0));
             oj0.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
          }
          return;
       }
    }
    public void onDestroy(){
       AESubtitleHelper uAESubtitleH = AESubtitleHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorActivity.class, "18")) {
          return;
       }
       super.onDestroy();
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("EditorActivity", "onDestroy", objArray1);
       if (this.k1 == null) {
          objArray = new Object[i];
          a.D().w("EditorActivity", "onDestroy editorActivity not single top", objArray);
          return;
       }else {
          this.j1.o0().s0(r.a);
          MultiplePhotosWorkManager multiplePhot = MultiplePhotosWorkManager.f();
          EditorActivity tZ = this.Z;
          Objects.requireNonNull(multiplePhot);
          Object[] objArray2 = new Object[i];
          String str = "MultiplePhotosWorkManager";
          a.D().w(str, "doInBackground workId:"+tZ, objArray2);
          if (multiplePhot.b.containsKey(Long.valueOf(tZ))) {
             b uob = multiplePhot.b.get(Long.valueOf(tZ));
             if (uob != null && !uob.isDisposed()) {
                objArray2 = new Object[i];
                a.D().w(str, "doInBackground can cancel", objArray2);
                uob.dispose();
                MultiplePhotosWorkManager$CropWorkInfo uCropWorkInf = multiplePhot.c.get(Long.valueOf(tZ));
                if (uCropWorkInf != null) {
                   MultiplePhotosWorkManager$CropWorkInfo$Status cANCELED = MultiplePhotosWorkManager$CropWorkInfo$Status.CANCELED;
                   uCropWorkInf.c(cANCELED);
                   Object[] objArray3 = new Object[i];
                   a.D().w(str, "notifyPhotoCropTaskCanceled", objArray3);
                   uCropWorkInf.c(cANCELED);
                   RxBus.f.b(new MultiplePhotosWorkManager$CropPhotoWorkEvent(uCropWorkInf, MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Canceled, objArray));
                }
                multiplePhot.b.remove(Long.valueOf(tZ));
                multiplePhot.c.remove(Long.valueOf(tZ));
             label_00e1 :
                if (!("edit").equals(this.W)) {
                   t ot = t.a();
                   _monitor_enter(ot);
                   if (PatchProxy.applyVoid(objArray, ot, t.class, "6")) {
                      _monitor_exit(ot);
                   }else {
                      ot.a.evictAll();
                      _monitor_exit(ot);
                   }
                }
                e uoe = this.getSupportFragmentManager().beginTransaction();
                EditorActivity tV = this.V;
                int len = tV.length;
                int i1 = 0;
                while (i1 < len) {
                   object oobject = tV[i1];
                   if (oobject != null) {
                      uoe = uoe.u(oobject);
                   }
                   i1 = i1 + 1;
                }
                uoe.m();
                b9.a(this.c1);
                this.c1 = objArray;
                b9.a(this.b1);
                this.b1 = objArray;
                EditorActivity tuEditorActi = this.f1;
                if (tuEditorActi != null) {
                   tuEditorActi.destroy();
                   this.f1 = objArray;
                }
                if (PostExperimentUtils.H0()) {
                   PreLoader instance = PreLoader.getInstance();
                   int[] ointArray = new int[3];
                   len = (e0.e(v.f()))? 0x7f0d109e: 0x7f0d109d;
                   ointArray[i] = len;
                   len = (b.d())? 0x7f0d002b: 0x7f0d002a;
                   ointArray[1] = len;
                   ointArray[2] = 0x7f0d1282;
                   instance.clear(ointArray);
                }
                this.j1.p0().c(q.a);
                AESubtitleHelper uAESubtitleH1 = PatchProxy.apply(objArray, objArray, uAESubtitleH, "3");
                if (uAESubtitleH1 != PatchProxyResult.class) {
                }else {
                   uAESubtitleH1 = AESubtitleHelper.c.a();
                }
                Objects.requireNonNull(uAESubtitleH1);
                if (!PatchProxy.applyVoid(objArray, uAESubtitleH1, uAESubtitleH, "1")) {
                   uAESubtitleH = uAESubtitleH1.a;
                   if (uAESubtitleH != null) {
                      uAESubtitleH.destroy();
                   }
                   uAESubtitleH1.a = objArray;
                }
                return;
             }
          }
          multiplePhot.b.remove(Long.valueOf(tZ));
          multiplePhot.c.remove(Long.valueOf(tZ));
          goto label_00e1 ;
       }
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "13")) {
          return;
       }
       super.onResume();
       EditorActivity tV = this.V;
       int len = tV.length;
       int i = 0;
       while (i < len) {
          object oobject = tV[i];
          if (oobject instanceof EditorActivity$h) {
             oobject.onActivityResume();
          }
          i = i + 1;
       }
       if (v.f() != null) {
          v.f().u().q(true);
       }
       this.j1.o0().s0(u.a);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorActivity.class, "3")) {
          return;
       }
       super.onSaveInstanceState(p0);
       p0.putParcelable("android:support:fragments", null);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "12")) {
          return;
       }
       super.onStart();
       this.N3().j.getBackground().setAlpha(255);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "17")) {
          return;
       }
       super.onStop();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditorActivity", "onStop", objArray);
       EditorActivity tV = this.V;
       int len = tV.length;
       while (i < len) {
          object oobject = tV[i];
          if (oobject instanceof EditorActivity$h) {
             oobject.onActivityPause();
          }
          i = i + 1;
       }
       FetchFrameManager.i().b();
       return;
    }
    public boolean u3(){
       return true;
    }
    public boolean x3(){
       return false;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, EditorActivity.class, "15")) {
          return;
       }
       int i = 0;
       if (e0.e(v.f())) {
          g.a(this);
       }else if(a.a()){
          Window window = this.getWindow();
          window.clearFlags(1024);
          window.addFlags(2048);
          window.getDecorView().setSystemUiVisibility(1280);
          g.w(window, i);
       }else {
          g.w(this.getWindow(), a1.a(R.color.arg_RES_7f0618c1));
       }
       g.z(this.getWindow());
       if (g.m(this)) {
          this.h1 = true;
          Object[] objArray = new Object[i];
          a.D().w("EditorActivity", "current activity is in MultiWindowMode.", objArray);
       }else if(this.N3().k == null){
          this.h1 = i;
          return;
       }else if(this.X0 == Integer.MIN_VALUE){
          this.X0 = this.N3().k.getLayoutParams().topMargin;
       }else if(this.h1 != null){
          ViewGroup$MarginLayoutParams layoutParams = this.N3().k.getLayoutParams();
          layoutParams.topMargin = this.X0;
          this.N3().k.setLayoutParams(layoutParams);
          this.N3().k.requestLayout();
       }
       this.h1 = i;
       return;
    }
}
