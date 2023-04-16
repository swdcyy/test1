package com.yxcorp.gifshow.v3.f;
import lnc.a1;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace$Type;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import vaa.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import uwc.a;
import uwc.c;
import android.view.MotionEvent;
import android.view.View;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;
import ooc.m;
import t36.f$a;
import com.yxcorp.gifshow.v3.c;
import ooc.k;
import android.text.TextPaint;
import android.graphics.Typeface;
import ekd.d0;
import qaa.a;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.d;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.yxcorp.gifshow.v3.e;
import android.app.Activity;
import java.lang.Runnable;
import ooc.g1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.ArrayList;
import lnc.x$c;
import com.yxcorp.gifshow.v3.a;
import ooc.l;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import java.util.List;
import lnc.x;
import java.lang.Long;
import android.content.Context;
import android.os.Vibrator;
import java.util.Map;
import wpc.y;
import ooc.n;
import com.yxcorp.gifshow.v3.f$b;
import com.yxcorp.gifshow.v3.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import crd.b;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import uxb.s;
import uxb.l;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import uxb.r;
import uxb.q;
import ooc.o;
import erd.g;
import java.lang.Iterable;
import ooc.p;
import ooc.q;
import java.lang.Float;
import java.lang.Number;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import java.io.Serializable;
import com.yxcorp.gifshow.model.Lyrics;
import com.kuaishou.android.post.EditAbilityConfig;
import com.yxcorp.gifshow.v3.v;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace;
import h69.j;
import android.text.DynamicLayout;
import java.lang.reflect.Field;
import android.text.StaticLayout;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.util.g;
import maa.a;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$Type;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import uwc.f;
import androidx.lifecycle.ViewModel;
import java.lang.RuntimeException;
import android.os.Build$VERSION;
import java.lang.Math;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Double;
import uwc.b;
import aw9.c0;
import pwc.b;
import lwc.h;
import com.yxcorp.gifshow.v3.f$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.f$c;
import java.lang.Enum;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.model.Lyrics$Line;
import evc.b$a;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.v3.editor.i;
import w46.b;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import tkd.b;
import tkd.d;
import f0c.t;
import xf6.g;
import com.kuaishou.edit.draft.Workspace$From;
import com.yxcorp.gifshow.edit.draft.DraftUtils;

public final class f	// class@001523
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
       f.a = f.a(2.00f);
       f.b = f.a(10.00f);
       f.c = f.a(12.00f);
       f.d = a1.e(225.00f);
       f.e = a1.e(58.00f);
    }
    public void f(){
       super();
    }
    public static boolean A(Workspace$Type p0){
       boolean b = (p0 == Workspace$Type.KTV_MV || p0 == Workspace$Type.KTV_SONG)? true: false;
       return b;
    }
    public static boolean B(Workspace$Type p0){
       boolean b = (p0 == Workspace$Type.ATLAS || p0 == Workspace$Type.LONG_PICTURE)? true: false;
       return b;
    }
    public static boolean C(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return TextUtils.n(j0.f(p0, "EDIT_STATR_PARAMETER"), "EDIT_STATR_COVER");
    }
    public static boolean D(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.a1() == Workspace$Type.PHOTO_MOVIE && p0.F0() != null)? true: false;
       return b;
    }
    public static boolean E(Workspace$Type p0){
       boolean b = (p0 != Workspace$Type.ATLAS && (p0 == Workspace$Type.LONG_PICTURE || p0 == Workspace$Type.SINGLE_PICTURE))? true: false;
       return b;
    }
    public static boolean F(BaseEditorFragment p0){
       return p0 instanceof PhotosEditPreviewV3Fragment;
    }
    public static boolean G(a p0){
       return p0 instanceof c;
    }
    public static boolean H(MotionEvent p0,View p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       if (p1.getVisibility()) {
          return b;
       }
       int[] ointArray = new int[2];
       p1.getLocationOnScreen(ointArray);
       float rawX = p0.getRawX();
       float rawY = p0.getRawY();
       int i = ointArray[b];
       int i1 = 1;
       int i2 = p1.getMeasuredWidth() + i;
       int i3 = ointArray[i1] + p1.getMeasuredHeight();
       if (rawY - (float)(i3 - f.d) >= 0 && rawY - (float)i3 <= 0) {
          int e = f.e;
          if (rawX - (float)(i - e) >= 0 && rawX - (float)(i2 + e) <= 0) {
          label_005a :
             obj = new Object[b];
             a.D().w("EditUtils", "isTouchPointInProgressHotArea\(\) is in hot area, event action="+p0.getAction()+", is in hot area="+i1, obj);
             return i1;
          }
       }
       i1 = false;
       goto label_005a ;
    }
    public static double I(long p0){
       return ((double)p0 / 0x408f400000000000);
    }
    public static void J(f p0,VideoFrameChangeListener$CHANGE_TYPE p1,Size p2,int p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, f.class, "40")) {
          return;
       }
       p0.s0(new m(p1, p2, p3));
       p0.s0(c.a);
       p0.s0(new k(p1));
       return;
    }
    public static TextPaint K(){
       TextPaint obj = PatchProxy.apply(null, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextPaint(71);
       obj.setTextSize((float)a1.e(22.00f));
       obj.setARGB(255, 255, 255, 255);
       obj.setTypeface(d0.c());
       return obj;
    }
    public static boolean L(a p0,Bitmap p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = SystemClock.elapsedRealtime();
       if (p0.D()) {
          Object[] objArray = new Object[0];
          a.D().s("EditUtils", "草稿处于编辑状态,不能再次编辑,保存封面失败", objArray);
          return 0;
       }else {
          p0.c0();
          p0.l(d.a).e(p0.M(p1));
          p0.g(0);
          obj = new Object[0];
          a.D().s("EditCost", "保存封面文件耗时 "+(SystemClock.elapsedRealtime() - l), obj);
          return true;
       }
    }
    public static boolean M(a p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.c0();
       p0.l(e.a).e(p0.Q(p1));
       p0.g(false);
       Object[] objArray = new Object[false];
       a.D().s("EditCost", "保存封面文件耗时 "+(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()), objArray);
       return true;
    }
    public static long N(double p0){
       return (long)(p0 * 0x408f400000000000);
    }
    public static void O(Activity p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "5")) {
          return;
       }
       String str = "SHOW_QUIT_WINDOW";
       if (!PatchProxy.applyVoidOneRefs(str, null, g1.class, "16")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = str;
          uElementPack.type = 18;
          u1.u0(4, uElementPack, new ClientContent$ContentPackage());
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new x$c(R.drawable.arg_RES_7f081c68, a1.p(R.string.arg_RES_7f104728), a.b, true));
       uArrayList.add(new x$c(R.drawable.arg_RES_7f081b66, a1.p(R.string.arg_RES_7f104729), new l(p1), false));
       x.g(p0, p0.N3().e, uArrayList, false, null);
       return;
    }
    public static void P(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uof, "18")) {
          return;
       }
       Vibrator systemServic = a1.c().getSystemService("vibrator");
       if (systemServic != null && systemServic.hasVibrator()) {
          systemServic.vibrate(p0);
       }
       return;
    }
    public static void Q(Map p0,Runnable p1,boolean p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, f.class, "44")) {
          return;
       }
       f.p0(p0, y.class).s0(new n(p2));
       f.p0(p0, y.class).d(new f$b(p1, p0));
       f.p0(p0, y.class).s0(b.a);
       return;
    }
    public static b R(Runnable p0,EditorDelegate p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.S(p0, p1, false);
    }
    public static b S(Runnable p0,EditorDelegate p1,boolean p2){
       q obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, f.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       int i = (p1 != null && p1.P(EditorItemFunc.TEXT_V2) != null)? 1: 0;
       c uoc = (p1 != null && p1.P(EditorItemFunc.SUBTITLE_V2) != null)? 1: null;
       int i1 = (p1 != null && p1.P(EditorItemFunc.STICKER_V2) != null)? 1: 0;
       ArrayList uArrayList = new ArrayList();
       if (i) {
          uArrayList.add(l.j().Ld(p1.q(), p2));
       }
       if (uoc && !PostExperimentUtils.F(p1.N())) {
          obj = 1;
       }
       if (obj) {
          uArrayList.add(l.i().bD(p1.q(), p2));
       }
       if (i1) {
          uArrayList.add(l.h().ws(p1.q(), p2));
       }
       b uob = (!i && (obj || i1))? t.concat(uArrayList).takeLast(1).subscribe(new p(p0), new q(p0)): t.just(new Object()).subscribe(new o(p0));
       return uob;
    }
    public static int a(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return n.c(a.a().a(), p0);
    }
    public static boolean b(c p0,Intent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p1 != null) {
          Lyrics lyrics = j0.e(p1, "LYRICS");
          boolean b = j0.a(p1, "VIDEO_IS_LIP_SYNC", false);
          Workspace$Type type = p0.a1();
          if (type == Workspace$Type.VIDEO || (type == Workspace$Type.LONG_VIDEO && (b && lyrics != null))) {
             return true;
          }
       }
    label_003a :
       return false;
    }
    public static boolean c(Activity p0,c p1,EditAbilityConfig p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 == null || p1 == null) {
          Object[] objArray = new Object[i];
          a.D().w("EditUtils", "enableChangePhotoVisibilityInEditPage activity: "+p0+"workSpaceDraft"+p1, objArray);
          return i;
       }else if(v.b(p1, p2) && p1.T0() != Workspace$Source.REEDIT){
          i = true;
       }
       return i;
    }
    public static boolean d(Workspace p0){
       Workspace$Type obj = PatchProxy.applyOneRefs(p0, null, f.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.getType();
       Workspace$Type typeFrom = p0.getTypeFrom();
       boolean b = (p0.getSource() != Workspace$Source.REEDIT && (obj != Workspace$Type.ALBUM_MOVIE && (!j.o(obj, typeFrom) && obj != Workspace$Type.KUAISHAN)))? true: false;
       return b;
    }
    public static void e(){
       String str = "fixLineSpaceBugInAndroidO:";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, f.class, "17")) {
          return;
       }
       try{
          Field declaredFiel = DynamicLayout.class.getDeclaredField("sStaticLayout");
          boolean b = true;
          declaredFiel.setAccessible(b);
          Object obj = declaredFiel.get(objArray);
          if (obj != null) {
             Field declaredFiel1 = StaticLayout.class.getDeclaredField("mEllipsized");
             declaredFiel1.setAccessible(b);
             declaredFiel1.set(obj, Boolean.FALSE);
          }
       }catch(java.lang.NoSuchFieldException e2){
          a.D().z("EditUtils", str, e2);
       }catch(java.lang.IllegalAccessException e2){
          a.D().z("EditUtils", str, e2);
       }catch(java.lang.Exception e0){
          PostUtils.D("EditUtils", "fixLineSpaceBugInAndroidO", e0);
       }
       return;
    }
    public static int f(int p0,Activity p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uof, "43");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (a.t().d("smallScreenModeEditPreviewAdaptation", false) && g.n(p1)) {
          p0 = (int)((float)p0 * 2.00f);
       }
       return p0;
    }
    public static int g(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = p0.z().iterator();
       while (iterator.hasNext()) {
          if (iterator.next().getType() == Asset$Type.PICTURE) {
             i = i + 1;
          }
       }
       return i;
    }
    public static a h(EditorBasePreviewFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof VideoEditPreviewV3Fragment) {
          return ViewModelProviders.of(p0).get(f.class);
       }
       if (p0 instanceof PhotosEditPreviewV3Fragment) {
          return ViewModelProviders.of(p0).get(c.class);
       }
       throw new RuntimeException("getBaseEditPreviewV3ViewModel not support this fragment:"+p0);
    }
    public static float i(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, uof, "33");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (Build$VERSION.SDK_INT <= 23) {
          p0 = Math.min(25.00f, p0);
       }
       return p0;
    }
    public static double j(double p0,EditorSdk2V2$VideoEditorProject p1,double p2,int p3){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyFourRefs(Double.valueOf(p0), p1, Double.valueOf(p2), Integer.valueOf(p3), null, f.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       if (p1 != null && f.s(p1)) {
          if (PostExperimentUtils.X() && !p3) {
             return 0;
          }else {
             p0 = Math.max(0, (p0 - p2));
          }
       }
       return p0;
    }
    public static b k(EditorDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.O().a;
    }
    public static h l(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(p0, new f$a()).get(h.class);
    }
    public static String m(Workspace$Type p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       int i = f$c.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   str = (i != 5)? "": "longPicture";
                }else {
                   str = "singlePicture";
                }
             }else {
                str = "atlas";
             }
          }else {
             str = "photoMovie";
          }
       }else {
          str = "video";
       }
       return str;
    }
    public static VideoSDKPlayerView n(EditorDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.z();
    }
    public static ArrayList o(Lyrics p0,double p1){
       ArrayList obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, uof, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (p0 != null) {
          Lyrics mLines = p0.mLines;
          if (mLines != null && !mLines.isEmpty()) {
             Iterator iterator = p0.mLines.iterator();
             while (iterator.hasNext()) {
                Lyrics$Line line = iterator.next();
                int i = line.mDuration + line.mStart;
                double d = f.I((long)i);
                double d1 = f.I((long)line.mStart);
                if (d1 - p1 < 0) {
                   b$a uoa = new b$a();
                   uoa.f(line.mText);
                   uoa.e((float)d1);
                   uoa.d((float)Math.min(d, p1));
                   obj.add(uoa);
                }
             }
             return obj;
          }
       }
       PostUtils.D("EditUtils", "getSubtitleFromLyric", new NullPointerException("lyrics data error"));
       goto label_007b ;
    }
    public static EditorSdk2V2$VideoEditorProject p(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = p0.e();
       if (videoEditorP != null) {
          return videoEditorP;
       }
       RuntimeException runtimeExcep = new RuntimeException("error videoEditorProject is null!");
       Object[] objArray = new Object[0];
       a.D().u("EditUtils", runtimeExcep, objArray);
       throw runtimeExcep;
    }
    public static VideoSDKPlayerView q(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VideoSDKPlayerView videoSDKPlay = p0.j();
       if (videoSDKPlay != null) {
          return videoSDKPlay;
       }
       RuntimeException runtimeExcep = new RuntimeException("error VideoSDKPlayerView is null!");
       Object[] objArray = new Object[0];
       a.D().u("EditUtils", runtimeExcep, objArray);
       throw runtimeExcep;
    }
    public static Size r(int p0,int p1,Activity p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, f.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = a1.h();
       int i1 = (p2 != null)? n.j(p2): a1.g();
       double d = (double)p1 / (double)p0;
       double d1 = (double)i1;
       double d2 = (double)i;
       if (d - (d1 / d2) > 0) {
          return new Size((int)(d1 / d), i1);
       }else {
          return new Size(i, (int)(d2 * d));
       }
    }
    public static boolean s(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.timeEffect() != null && p0.timeEffect().timeEffectType() == 3)? true: false;
       return b;
    }
    public static boolean t(Workspace$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.a(-273232199).Ta() && p0 != Workspace$Type.PHOTO_MOVIE)? true: false;
       return b;
    }
    public static boolean u(){
       Object obj = PatchProxy.apply(null, null, f.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (g.Z0() || a.t().d("disableMagicFaceEffectDetect", b)) {
          b = true;
       }
       return b;
    }
    public static boolean v(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PostExperimentUtils.c0() && (!f.z(p0) && (p0.B0() != Workspace$From.IM_SEND_MESSAGE && (p0.B0() != Workspace$From.IM_SEND_MESSAGE_WHATS_UP && p0.B0() != Workspace$From.IM_TAKE_IN_SAME))))? true: false;
       return b;
    }
    public static boolean w(Workspace$Type p0){
       boolean b = (p0 == Workspace$Type.PHOTO_MOVIE || p0 == Workspace$Type.KTV_SONG)? true: false;
       return b;
    }
    public static boolean x(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.B0() == Workspace$From.PROFILE_BACKGROUND) {
          return true;
       }
       return false;
    }
    public static boolean y(Workspace$Source p0,Workspace$Type p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!DraftUtils.n0(p0) && (p0 != Workspace$Source.IMPORT_MIXED && (p0 != Workspace$Source.IMPORT_CLIP && (p0 != Workspace$Source.SHARE && (p1 == Workspace$Type.ALBUM_MOVIE || p1 == Workspace$Type.AI_CUT)))))? true: false;
       return b;
    }
    public static boolean z(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.a1() == Workspace$Type.KTV_SONG || p0.a1() == Workspace$Type.KTV_MV)? true: false;
       return b;
    }
}
