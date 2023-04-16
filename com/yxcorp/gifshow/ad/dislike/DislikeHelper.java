package com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$a;
import java.lang.Runnable;
import java.lang.Boolean;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$b;
import erd.g;
import com.kuaishou.commercial.photoreduce.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$c;
import l29.d;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$d;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$e;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$f;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$g;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$h;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$i;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$j;
import android.app.Activity;
import lnc.y0;
import java.lang.CharSequence;
import tw.f;
import tkd.b;
import tkd.d;
import nl9.u;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import a17.c$a;
import l29.b;
import msd.a;
import a17.b$b;
import a17.f;
import l29.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper$clickDislikeItemExp$1;
import l29.a;
import msd.l;
import nl9.f;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import jga.f$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class DislikeHelper	// class@001742
{
    public static final DislikeHelper a;

    static {
       DislikeHelper.a = new DislikeHelper();
    }
    public void DislikeHelper(){
       super();
    }
    public static final void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DislikeHelper.class, "2")) {
          return;
       }
       a.p(p0, "photo");
       new Handler(Looper.getMainLooper()).postDelayed(new DislikeHelper$a(p0), 300);
       return;
    }
    public static final int c(boolean p0){
       int i = (p0)? 2: 1;
       return i;
    }
    public static final void d(QPhoto p0,boolean p1){
       DislikeHelper uDislikeHelp = DislikeHelper.class;
       if (PatchProxy.isSupport(uDislikeHelp) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uDislikeHelp, "4")) {
          return;
       }
       a.p(p0, "photo");
       i0.a().e(220, p0.mEntity).d(new DislikeHelper$b(p1)).a();
       return;
    }
    public static final int e(a$a p0,QPhoto p1,boolean p2){
       a$a obj;
       if (PatchProxy.isSupport(DislikeHelper.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, DislikeHelper.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "reason");
       a.p(p1, "photo");
       int i = DislikeHelper.c(p2);
       obj = p0.a;
       if (obj != 15) {
          if (obj != 17) {
             i0.a().e(18, p1.mEntity).d(new DislikeHelper$c(i, p0)).a();
          }else {
             DislikeHelper.l(p1, i);
          }
       }else {
          d.b(p1, i);
       }
       return i;
    }
    public static final void f(a$a p0,QPhoto p1,boolean p2){
       if (PatchProxy.isSupport(DislikeHelper.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, DislikeHelper.class, "6")) {
          return;
       }
       a.p(p0, "reason");
       a.p(p1, "photo");
       if (p0.a == 12) {
          i0.a().e(744, p1.mEntity).d(new DislikeHelper$d(p2)).a();
       }
       return;
    }
    public static final int g(a$a p0,a$a p1,QPhoto p2,boolean p3){
       Ref$IntRef obj;
       if (PatchProxy.isSupport(DislikeHelper.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, DislikeHelper.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "reason");
       a.p(p1, "subReason");
       a.p(p2, "photo");
       obj = new Ref$IntRef();
       obj.element = 0;
       if (p0.a == 12) {
          i0.a().e(18, p2.mEntity).d(new DislikeHelper$e(obj, p3, p1)).a();
       }
       return obj.element;
    }
    public static final void h(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DislikeHelper.class, "8")) {
          return;
       }
       a.p(p0, "photo");
       i0.a().e(221, p0.mEntity).d(DislikeHelper$f.b).a();
       return;
    }
    public static final void i(a$a p0,QPhoto p1){
       a$a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DislikeHelper.class, "9")) {
          return;
       }
       a.p(p0, "reason");
       a.p(p1, "photo");
       a = p0.a;
       if (a != 11) {
          if (a != 14) {
             switch (a){
                 case 16:
                 case 17:
                   DislikeHelper.l(p1, 3);
                   break;
                 case 18:
                   i0.a().e(4, p1.mEntity).d(new DislikeHelper$g(p0)).a();
                   break;
                 default:
             }
          }else {
             d.b(p1, 3);
          }
       }else {
          goto label_002d ;
       }
       return;
    }
    public static final void j(a$a p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DislikeHelper.class, "10")) {
          return;
       }
       a.p(p0, "reason");
       a.p(p1, "photo");
       if (p0.a == 11) {
          i0.a().e(222, p1.mEntity).d(DislikeHelper$h.b).a();
       }
       return;
    }
    public static final void k(a$a p0,a$a p1,QPhoto p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DislikeHelper.class, "11")) {
          return;
       }
       a.p(p0, "reason");
       a.p(p1, "subReason");
       a.p(p2, "photo");
       if (p0.a == 11) {
          i0.a().e(4, p2.mEntity).d(new DislikeHelper$i(p1)).a();
       }
       return;
    }
    public static final void l(QPhoto p0,int p1){
       DislikeHelper uDislikeHelp = DislikeHelper.class;
       if (PatchProxy.isSupport(uDislikeHelp) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uDislikeHelp, "12")) {
          return;
       }
       i0.a().e(743, p0.mEntity).d(new DislikeHelper$j(p1)).a();
       return;
    }
    public static final void m(a$a p0,BaseFeed p1,Activity p2,int p3){
       if (PatchProxy.isSupport(DislikeHelper.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, DislikeHelper.class, "1")) {
          return;
       }
       a.p(p0, "reason");
       a.p(p1, "photo");
       if (y0.o(p2)) {
          return;
       }
       a$a e = p0.e;
       e = (e == null || !e.length())? 1: 0;
       if (!e) {
          String str = f.b(p0.e, p3);
          if (str != null) {
             d.a(-1694791652).RQ(p2, p1, str);
          }
       }
       return;
    }
    public final void a(Activity p0,QPhoto p1,a$a p2){
       int this;
       String this1;
       QPhoto mEntity;
       object oobject = p0;
       QPhoto obj = p1;
       Object obj1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DislikeHelper.class, "15")) {
          return;
       }
       String str = "qPhoto";
       a.p(obj, str);
       String str1 = "reason";
       a.p(obj1, str1);
       DislikeHelper.i(obj1, obj);
       if (y0.o(p0)) {
          return;
       }
       a$a d = obj1.d;
       String str2 = "qPhoto.mEntity";
       this = 0;
       int i = 1;
       DislikeHelper uDislikeHelp = 3;
       if (d != i) {
          String str3 = 4;
          int i1 = 2;
          if (d != i1) {
             if (d != uDislikeHelp) {
                if (d != str3) {
                   DislikeHelper.b(p1);
                   int i2 = this;
                }else {
                   this.n(obj, p0);
                }
             }else if(PatchProxy.applyVoidFourRefs(p1, p2, p0, null, null, DislikeHelper.class, "13")){
                a.p(obj, str);
                if (!y0.o(p0)) {
                   DislikeHelper.j(obj1, obj);
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = obj1.i.iterator();
                   while (iterator.hasNext()) {
                      a$a b = iterator.next().b;
                      a.o(b, "subReason.name");
                      uArrayList.add(new g(b, SheetItemStatus.Enable));
                   }
                   a.m(p0);
                   c$a uoa = new c$a(p0);
                   uoa.n0(obj1.g);
                   uoa.j0(uArrayList);
                   uoa.g0(R.string.cancel);
                   b uob = new b(p2, p2, p1, p0, null);
                   uoa.i0(str);
                   f.a(uoa).Y(new c(obj1, obj, p0, null));
                }
             }
          }else {
             obj = obj.mEntity;
             a.o(obj, str2);
             DislikeHelper$clickDislikeItemExp$1 iNSTANCE = DislikeHelper$clickDislikeItemExp$1.INSTANCE;
             DislikeHelper uDislikeHelp1 = DislikeHelper.class;
             if (PatchProxy.isSupport(uDislikeHelp1)) {
                Object[] objArray = new Object[]{obj1,obj,oobject,Integer.valueOf(uDislikeHelp),iNSTANCE};
                if (!PatchProxy.applyVoid(objArray, null, uDislikeHelp1, "3")) {
                }
             }else {
             }
          }
       }else {
          a$a e = obj1.e;
          if (e == null || !e.length()) {
             this = 1;
          }
          if (this) {
             DislikeHelper.b(p1);
          }else {
             mEntity = obj.mEntity;
             a.o(mEntity, str2);
             DislikeHelper.m(obj1, mEntity, p0, uDislikeHelp);
          }
       }
    label_0146 :
       return;
    }
    public final void n(QPhoto p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DislikeHelper.class, "16")) {
          return;
       }
       i0.a().e(19, p0.mEntity).a();
       User user = p0.getUser();
       v2 = p1 instanceof GifshowActivity;
       String str = null;
       GifshowActivity gifshowActiv = (!v2)? str: p1;
       String str1 = (gifshowActiv)? gifshowActiv.Q2(): str;
       f$a uoa = new f$a(user, str1);
       uoa.c(p0.getFullSource());
       GifshowActivity gifshowActiv1 = (!v2)? str: p1;
       String url = (gifshowActiv1)? gifshowActiv1.getUrl(): str;
       uoa.o(a.C(url, "#unfollow"));
       if (p1 != null) {
          Intent intent = p1.getIntent();
          if (intent != null) {
             str = intent.getStringExtra("arg_photo_exp_tag");
          }
       }
       uoa.g(str);
       uoa.f(p0.getExpTag());
       FollowHelper.k(uoa.b()).subscribe(Functions.d(), Functions.e);
       f.m(p0.getUser(), User$FollowStatus.UNFOLLOW);
       return;
    }
}
