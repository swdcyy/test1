package l69.n;
import java.util.ArrayList;
import java.lang.Object;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.view.View;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.text.TextPaint;
import java.lang.CharSequence;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import l69.o;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import o69.c;
import l69.t;
import java.util.Map;
import o69.o2;
import java.util.List;
import com.yxcorp.gifshow.album.selected.interact.a;
import o79.q;
import j69.a$a;
import i69.d;
import java.util.Objects;
import m69.b;
import m69.d;
import m69.g;
import m69.f;
import m69.h;
import m69.e;
import j69.a;
import h69.g;
import q87.c;
import tkd.b;
import tkd.d;
import kob.i;
import java.lang.ref.WeakReference;
import lq.i;
import lq.a;
import s66.a;
import l69.r;
import java.lang.Runnable;
import ekd.k1;
import n69.c;
import h69.a;
import o69.q1;
import k69.e;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import java.lang.Number;

public final class n	// class@002ca1
{
    public static o a;
    public static final ArrayList b;
    public static boolean c;
    public static boolean d;
    public static b e;
    public static final n f;

    static {
       n.f = new n();
       n.b = new ArrayList();
    }
    public void n(){
       super();
    }
    public final TextView a(IAlbumMainFragment p0,boolean p1){
       String obj;
       FrameLayout$LayoutParams layoutParams;
       TextPaint paint;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, on, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       FrameLayout uFrameLayout = p0.fa();
       obj = "ai_cut_button_tag";
       TextView textView = uFrameLayout.findViewWithTag(obj);
       if (textView == null) {
          a.o(uFrameLayout, "parent");
          textView = new TextView(uFrameLayout.getContext());
          textView.setMaxLines(1);
          textView.setTag(obj);
          if (PostExperimentUtils.x0() == 2 || (PostExperimentUtils.x0() == 3 && p1)) {
             layoutParams = new FrameLayout$LayoutParams(-1, a1.d(0x7f070309));
             layoutParams.gravity = 0x800005;
             textView.setPadding(a1.d(R.dimen.arg_RES_7f070307), 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
             textView.setCompoundDrawablePadding(a1.e(6.00f));
             textView.setLayoutParams(layoutParams);
             textView.setTextSize(1, 14.00f);
             paint = textView.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(1);
             }
             textView.setGravity(16);
          }else if(PostExperimentUtils.x0() == 1 && p1){
             uFrameLayout.setPadding(0, 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
             layoutParams = new FrameLayout$LayoutParams(a1.d(0x7f07025f), a1.d(0x7f0702fe));
             layoutParams.gravity = 0x800005;
             textView.setPadding(a1.d(R.dimen.arg_RES_7f070283), 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
             textView.setLayoutParams(layoutParams);
             textView.setTextSize(1, 14.00f);
             paint = textView.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(1);
             }
             textView.setGravity(16);
          }else {
             uFrameLayout.setPadding(0, 0, a1.d(R.dimen.arg_RES_7f070271), 0);
             layoutParams = new FrameLayout$LayoutParams(a1.d(0x7f07034e), a1.d(0x7f0702ef));
             layoutParams.gravity = 0x800005;
             textView.setPadding(a1.d(R.dimen.arg_RES_7f07034b), 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
             textView.setLayoutParams(layoutParams);
             textView.setTextSize(1, 12.00f);
             paint = textView.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(1);
             }
             textView.setGravity(17);
          }
          uFrameLayout.addView(textView);
          textView.setText(a1.p(R.string.arg_RES_7f100b0b));
       }
       return textView;
    }
    public final Music b(){
       Object[] objArray = null;
       o obj = PatchProxy.apply(objArray, this, n.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = n.a;
       if (obj != null) {
          VideoTemplateProject videoTemplat = obj.b();
          if (videoTemplat != null) {
             AICutMusicInfo music = videoTemplat.getMusic();
             if (music != null) {
                return t.a.b(music);
             }
          }
       }
       return objArray;
    }
    public final Music c(String p0){
       o a;
       AICutMusicInfo uAICutMusicI1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "styleId");
       a = n.a;
       if (a != null) {
          VideoTemplateProject videoTemplat = a.b();
          if (videoTemplat != null) {
             AICutMusicInfo uAICutMusicI = PatchProxy.applyOneRefs(p0, videoTemplat, VideoTemplateProject.class, "19");
             if (uAICutMusicI != patchProxyRe) {
             }else {
                a.p(p0, "styleId");
                if (videoTemplat.V != null) {
                   uAICutMusicI1 = videoTemplat.K();
                }else {
                   o2 oo2 = videoTemplat.Y().get(p0);
                   if (oo2 != null) {
                      uAICutMusicI1 = oo2.b();
                   }else {
                      uAICutMusicI = null;
                   }
                }
                uAICutMusicI = uAICutMusicI1;
             }
             if (uAICutMusicI != null) {
                return t.a.b(uAICutMusicI);
             }
          }
       }
       return null;
    }
    public final o d(){
       return n.a;
    }
    public final List e(IAlbumMainFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = p0.m8().m();
       ArrayList uArrayList = (list == null)? new ArrayList(): q.f(list);
       return uArrayList;
    }
    public final void f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a uoa = a$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "3")) {
          return;
       }
       d d = d.d;
       Objects.requireNonNull(d);
       if (!d.b) {
          a$a uoa1 = new a$a();
          b uob = new b();
          Object obj = PatchProxy.applyOneRefs(uob, uoa1, uoa, "13");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             a.p(uob, "fileManager");
             uoa1.a = uob;
          }
          d uod = new d();
          Objects.requireNonNull(uoa1);
          obj = PatchProxy.applyOneRefs(uod, uoa1, uoa, "14");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             a.p(uod, "logger");
             uoa1.b = uod;
          }
          g og = new g();
          Objects.requireNonNull(uoa1);
          obj = PatchProxy.applyOneRefs(og, uoa1, uoa, "15");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             a.p(og, "hook");
             uoa1.c = og;
          }
          f uof = new f();
          Objects.requireNonNull(uoa1);
          obj = PatchProxy.applyOneRefs(uof, uoa1, uoa, "16");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             a.p(uof, "limit");
             uoa1.d = uof;
          }
          h oh = new h();
          Objects.requireNonNull(uoa1);
          obj = PatchProxy.applyOneRefs(oh, uoa1, uoa, "17");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             a.p(oh, "transcode");
             uoa1.e = oh;
          }
          e uoe = new e();
          Objects.requireNonNull(uoa1);
          obj = PatchProxy.applyOneRefs(uoe, uoa1, uoa, "18");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             a.p(uoe, "uiConfig");
             uoa1.f = uoe;
          }
          Objects.requireNonNull(uoa1);
          a uoa2 = PatchProxy.apply(objArray, uoa1, uoa, "19");
          if (uoa2 != patchProxyRe) {
          }else {
             uoa2 = new a(uoa1);
          }
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(uoa2, d, d.class, "1")) {
             a.p(uoa2, "aiCutConfig");
             if (!d.b) {
                d.c = uoa2;
                d.b = true;
             }
          }
          Object[] objArray1 = new Object[0];
          g.D().w("KwaiAICutModule", "init sdk config", objArray1);
       }
       return;
    }
    public final void g(){
       o oo;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "18")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "KwaiAICutModule";
       g.D().w(str, "release: ", objArray1);
       d.a(0x2be267d).rX();
       if (n.a == null) {
          objArray = new Object[i];
          g.D().w(str, "release: return", objArray);
          return;
       }else {
          ArrayList b = n.b;
          if (b.size() > 0) {
             Object[] objArray2 = new Object[i];
             g.D().w(str, "release: mProjectRefs", objArray2);
             oo = b.remove(i).get();
          }else if(i.h() && i.m().I()){
             a uoa = i.m().p();
             a.o(uoa, "PostSession.current\(\).editSession\(\)");
             if (uoa.isLoaded()) {
                objArray = new Object[i];
                g.D().w(str, "release: hasEditSession return", objArray);
                return;
             }
          }
          Object[] objArray3 = new Object[i];
          g.D().w(str, "release: really", objArray3);
          a.e("AICutStyleId");
          oo = n.a;
          if (oo != null && !PatchProxy.applyVoid(objArray, oo, o.class, "1")) {
             k1.o(new r(oo));
             o c = oo.c;
             if (c != null) {
                c.a();
             }
          }
          n.a = objArray;
          a b1 = a.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(objArray, b1, a.class, "9")) {
             q1.h.f();
             a.a = objArray;
          }
          if (oo != null) {
             VideoTemplateProject videoTemplat = oo.b();
             if (videoTemplat != null) {
                videoTemplat.b();
                videoTemplat.x0(objArray);
             }
          }
          return;
       }
    }
    public final void h(o p0){
       n.a = p0;
    }
    public final void i(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "13")) {
          return;
       }
       p0.setBackground(a1.f(R.drawable.arg_RES_7f0800d8));
       p0.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.arg_RES_7f0800de, 0, 0, 0);
       p0.setTextColor(a1.b(R.color.arg_RES_7f06004c));
       return;
    }
    public final int j(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.isEmpty()) {
          return -3;
       }
       int i = 0;
       if (0 - (float)i < 0) {
          i = -2;
       }
       return i;
    }
}
