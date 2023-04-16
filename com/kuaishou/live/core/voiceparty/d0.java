package com.kuaishou.live.core.voiceparty.d0;
import java.lang.Object;
import android.app.Activity;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.ui.popupmanager.dialog.a;
import co2.x1;
import erd.o;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kuaishou.live.core.voiceparty.a0;
import com.kuaishou.live.core.voiceparty.b0;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.kwai.library.widget.popup.common.f;
import android.view.View;
import android.view.ViewParent;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import android.content.Context;
import va1.n0;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import wkd.b;
import com.kuaishou.live.common.core.component.authority.c;
import com.kwai.feature.api.live.merchant.authority.LiveAnchorFunction;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.Integer;
import java.util.List;
import o56.c;
import o56.a;
import android.app.Application;
import android.media.AudioManager;
import erd.g;
import co2.w1;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import e17.i$b;
import e17.i;
import com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import qk.m;
import ok.o;
import com.google.common.base.Predicates;
import com.kuaishou.live.core.voiceparty.z;
import ok.h;
import java.util.LinkedList;
import java.util.Collection;

public final class d0	// class@0014d1
{
    public static int[] a;

    static {
       int[] ointArray = new int[2];
       d0.a = ointArray;
    }
    public void d0(){
       super();
    }
    public static t a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.e(p0, 0x7f102b42, 0x7f102b41, "android.permission.RECORD_AUDIO").flatMap(new x1(p0));
    }
    public static void b(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d0.class, "22")) {
          return;
       }
       if (p0 != null && p0.isShowing()) {
          p0.dismiss();
       }
       return;
    }
    public static void c(KwaiDialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d0.class, "20")) {
          return;
       }
       if (p0 != null && p0.isAdded()) {
          p0.dismissAllowingStateLoss();
       }
       return;
    }
    public static void d(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d0.class, "21")) {
          return;
       }
       if (p0 != null && p0.K()) {
          p0.q(0);
       }
       return;
    }
    public static void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d0.class, "19")) {
          return;
       }
       if (p0 != null && p0.K()) {
          p0.q(0);
       }
       return;
    }
    public static PopupInterface$c f(){
       Object obj = PatchProxy.apply(null, null, d0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.a;
    }
    public static PopupInterface$c g(){
       Object obj = PatchProxy.apply(null, null, d0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.a;
    }
    public static ViewGroup h(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       while (true) {
          if (p0 == null) {
             return null;
          }
          if (p0 instanceof DialogFragment) {
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return f.d(p0);
    }
    public static float i(View p0,ViewParent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float x = p0.getX();
       ViewParent parent = p0.getParent();
       while (parent instanceof ViewGroup && parent != p1) {
          x = x + parent.getX();
          parent = parent.getParent();
       }
       return x;
    }
    public static float j(View p0,ViewParent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float y = p0.getY();
       ViewParent parent = p0.getParent();
       while (parent instanceof ViewGroup && parent != p1) {
          y = y + parent.getY();
          parent = parent.getParent();
       }
       return y;
    }
    public static boolean k(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null && (!p0.isFinishing() && !p0.isDestroyed())) {
          b = false;
       }
    label_0026 :
       return b;
    }
    public static boolean l(){
       Object obj = PatchProxy.apply(null, null, d0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return HeadsetPlugMonitor.a();
    }
    public static boolean m(){
       Object obj = PatchProxy.apply(null, null, d0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d0.r() || HeadsetPlugMonitor.a())? true: false;
       return b;
    }
    public static boolean n(Context p0){
       int i;
       int i1;
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof Activity) {
          i = n0.k(p0);
          i1 = n0.j(p0);
       }else {
          b.B(LiveVoicePartyLogTag.OTHER, "isInWideLayout, try your best to pass a Activity context for more precise Activity parameters");
          i = n0.f();
          i1 = n0.e();
       }
       b = false;
       if (i <= 0 || (i1 > 0 && ((float)i / (float)i1) - 0x3f100000 > 0)) {
          b = true;
       }
    label_0042 :
       return b;
    }
    public static boolean o(){
       Object obj = PatchProxy.apply(null, null, d0.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-416381922).z(LiveAnchorFunction.VOICE_PARTY_THEATRE);
    }
    public static boolean p(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !TextUtils.x(p0.mId))? true: false;
       return b;
    }
    public static boolean q(LiveStreamModel p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.mVerticalTypes;
          if (p0 != null && p0.contains(Integer.valueOf(3))) {
             b = true;
          label_0028 :
             return b;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public static boolean r(){
       Object obj = PatchProxy.apply(null, null, d0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a().a().getSystemService("audio").isWiredHeadsetOn();
    }
    public static g s(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new w1(p0, p1);
    }
    public static boolean t(LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p0){
       boolean b = (p0 != null && p0.mIsMute != null)? true: false;
       return b;
    }
    public static void u(String p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d0.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       i$b uob = i.m();
       uob.y(p0);
       uob.n(p1);
       i.z(uob);
       return;
    }
    public static List v(TheaterEpisodePhotoCdnProto[] p0){
       LinkedList obj = PatchProxy.applyOneRefs(p0, null, d0.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       m.t(p0).p(Predicates.h()).F(z.b).n(obj);
       return obj;
    }
}
