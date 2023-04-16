package com.yxcorp.gifshow.record.album.utils.g0;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import k8c.a;
import java.lang.StringBuilder;
import java.io.File;
import laa.m0;
import q87.c;
import java.lang.Integer;
import brd.t;
import t45.d;
import brd.z;
import p8c.l;
import erd.o;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import q16.a$a;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import tkd.b;
import tkd.d;
import r16.a;
import q16.a;
import android.content.Context;
import android.content.Intent;
import r16.d;
import androidx.fragment.app.FragmentActivity;
import lq.i;
import lq.a;
import p8c.e;
import com.yxcorp.gifshow.record.album.utils.p;
import erd.g;
import crd.b;
import lq.e;
import android.app.Activity;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import brd.a0;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import com.yxcorp.gifshow.record.album.utils.c0;
import erd.r;
import com.yxcorp.gifshow.record.album.utils.w;
import com.yxcorp.gifshow.record.album.utils.a0;
import com.yxcorp.gifshow.record.album.utils.y;
import so6.y;
import com.yxcorp.gifshow.record.album.utils.f;
import java.util.concurrent.Callable;
import erd.b;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.record.album.utils.x;
import lnc.s6;
import kq.b;
import wh5.c;
import com.yxcorp.gifshow.record.album.utils.b0;
import com.yxcorp.gifshow.record.album.utils.v;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import com.yxcorp.gifshow.record.album.utils.z;
import com.yxcorp.gifshow.record.album.utils.h;
import com.yxcorp.gifshow.record.album.utils.o;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import android.graphics.Bitmap;
import maa.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.u;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.music.Music;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import qkd.b;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.record.album.utils.g0$a;
import java.lang.Enum;

public final class g0	// class@001769
{
    public static boolean a;
    public static boolean b;
    public static boolean c;

    public void g0(){
       super();
    }
    public static boolean a(c p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, g0.class, "13");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          boolean b1 = true;
          if (!DraftUtils.o0(p0, b1)) {
             Object[] objArray = new Object[0];
             a.D().A("DraftRecoverUtil", "validateAssetFiles, discard "+p0.f0().getAbsolutePath(), objArray);
             t.just(Integer.valueOf(b1)).observeOn(d.a).flatMap(new l(p0)).blockingSubscribe();
             b = false;
          }else {
             b = true;
          }
       }
       return b;
    }
    public static void b(RxFragmentActivity p0,int p1,c p2,boolean p3){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), null, g0.class, "6")) {
          return;
       }
       VideoContextDraftHelper.c(p2, p2.d1());
       a$a uoa = new a$a();
       uoa.a0("edit").E(Boolean.valueOf(p3)).V(Boolean.TRUE).f0(p2.V0());
       PostFunnelManager.j.a().e(p2);
       Intent intent = d.a(0x14d6f666).NX(p0, uoa.f());
       p0.startActivityForResult(intent, p1);
       Object[] objArray = new Object[0];
       a.D().w("DraftRecoverUtil", "edit", objArray);
       i.W(p2);
       e uoe = new e(intent);
       i.m().p().init().subscribe(uoe, p.b);
       i.m().k().p(p0.getIntent());
       return;
    }
    public static boolean c(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, g0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.a().c() && g.j1()) {
          b = (g.j1() == 2)? true: false;
       }else {
          b = f.a("uploadFailedPopup4ADR");
       }
       return b;
    }
    public static a0 d(){
       a obj = PatchProxy.apply(null, null, g0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-273232199).a20();
       if (obj == null) {
          return a0.B(Boolean.FALSE);
       }
       return obj.a2().filter(c0.b).flatMap(w.b).observeOn(d.a).filter(a0.b).observeOn(d.c).filter(y.b).collect(y.b, f.b).G(a.c()).u(x.b);
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, g0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = s6.r();
       boolean b = (!1 - l || !2 - l)? true: false;
       return b;
    }
    public static void f(RxFragmentActivity p0,int p1,b p2){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, g0.class, "2")) {
          return;
       }
       if (!c.b() && !g0.e()) {
          Object[] objArray = new Object[0];
          a.D().s("DraftRecoverUtil", "recover from draft", objArray);
          g0.g(p0, p1, p2);
       }
       return;
    }
    public static void g(RxFragmentActivity p0,int p1,b p2){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, g0.class, "3")) {
          return;
       }
       a uoa = d.a(-273232199).a20();
       if (uoa == null) {
          return;
       }
       g0.b = false;
       Object[] objArray = new Object[false];
       a.D().w("DraftRecoverUtil", "recoverFromDraft", objArray);
       uoa.a2().filter(b0.b).flatMap(v.b).compose(p0.E2(ActivityEvent.PAUSE)).observeOn(d.a).filter(z.b).observeOn(d.c).filter(y.b).take(1).observeOn(a.c()).subscribe(new h(p0, p1, p2), o.b);
       return;
    }
    public static void h(Activity p0,View p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g0.class, "11")) {
          return;
       }
       KwaiImageView kwaiImageVie = p1.findViewById(R.id.cover_thumb);
       if (p2.a1() == Workspace$Type.KTV_SONG && p.k(p2)) {
          Object obj = null;
          Object[] obj1 = PatchProxy.applyTwoRefs(p2, p0, obj, g0.class, "12");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(p2.o0() == null || p0 == null){
             KtvInfo ktvInfo = u.N(p2);
             if (ktvInfo.mMusic != null) {
                obj = p.b(p2, n.k(p0), n.j(p0), ktvInfo.getMusicInfo());
             }
          }
          if (obj != null) {
             obj1 = new Object[0];
             a.D().w("DraftRecoverUtil", "generate ktv cover bitmap", obj1);
             kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
             kwaiImageVie.setImageBitmap(obj);
          label_0090 :
             ImageView imageView = p1.findViewById(R.id.type_icon);
             int i = g0$a.a[p2.a1().ordinal()];
             if (i != 1) {
                if (i != 2 && i != 3) {
                   imageView.setVisibility(8);
                }else {
                   imageView.setVisibility(0);
                   imageView.setImageResource(R.drawable.arg_RES_7f080c9e);
                }
             }else {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.arg_RES_7f080a1e);
             }
             return;
          }
       }
    label_0074 :
       File uFile = DraftFileManager.E().u(p2);
       if (b.S(uFile)) {
          kwaiImageVie.v(uFile, a1.d(R.dimen.arg_RES_7f0701ed), a1.d(R.dimen.arg_RES_7f0701ed));
          goto label_0090 ;
       }else {
          p1.findViewById(R.id.cover_wrap).setVisibility(8);
          return;
       }
    }
}
