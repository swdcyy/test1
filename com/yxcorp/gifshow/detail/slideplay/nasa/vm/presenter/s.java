package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.s$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.List;
import uw9.q;
import tkd.b;
import tkd.d;
import ida.b;
import mv5.b;
import java.util.Objects;
import w85.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import vy6.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.util.Iterator;
import android.view.View;
import r7a.i;
import rd5.j;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import android.app.Activity;
import com.yxcorp.utility.n;
import im8.f;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import rf5.u;
import mxb.j0;
import mxb.i0;
import ekd.m1;

public class s extends PresenterV2	// class@001833
{
    public final List A;
    public final a B;
    public QPhoto p;
    public f q;
    public u r;
    public a s;
    public a t;
    public Fragment u;
    public View v;
    public View w;
    public SlidePlayViewModel x;
    public boolean y;
    public final List z;

    public void s(){
       super();
       this.y = false;
       this.z = new ArrayList();
       this.A = new ArrayList();
       this.B = new s$a(this);
    }
    public void E8(){
       boolean b1;
       boolean b2;
       boolean b3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, s.class, "3")) {
          return;
       }
       this.x = SlidePlayViewModel.B0(this.u.getParentFragment());
       boolean b = false;
       this.y = b;
       String str = "5";
       s obj = PatchProxy.applyWithListener(objArray, this, s.class, str);
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          b1 = r1.w5(this.p.mEntity) ^ 1;
          PatchProxy.onMethodExit(s.class, str);
       }
       if (b1) {
          obj = this.v;
          String str1 = "7";
          if (!PatchProxy.applyVoidOneRefsWithListener(obj, this, s.class, str1)) {
             if (obj != null) {
                this.A.add(obj);
             }
             PatchProxy.onMethodExit(s.class, str1);
          }
       }
       obj = this.u;
       s obj1 = PatchProxy.applyOneRefs(obj, objArray, q.class, str);
       if (obj1 != patchProxyRe) {
          b2 = obj1.booleanValue();
       }else if(d.a(-859095268).mF(obj) || d.a(0x3ee97dc2).Bx(obj)){
          b2 = true;
       }else {
          b2 = false;
       }
       if (!b2) {
          obj1 = this.t;
          Objects.requireNonNull(obj1);
          Object obj2 = PatchProxy.apply(objArray, obj1, a.class, "4");
          if (obj2 != patchProxyRe) {
             b3 = obj2.booleanValue();
          }else if(obj1.R != null){
             b = obj1.i;
          }else if(obj1.T.getBizType() == 5 || obj1.T.getBizType() == 11){
             b = 1;
          }
          b3 = b;
          if (b3) {
          label_00b9 :
             String str2 = "8";
             if (!PatchProxy.applyVoidWithListener(objArray, this, s.class, str2)) {
                s tv = this.v;
                String str3 = "9";
                if (!PatchProxy.applyVoidOneRefsWithListener(tv, this, s.class, str3)) {
                   if (tv != null) {
                      this.z.add(tv);
                   }
                   PatchProxy.onMethodExit(s.class, str3);
                }
                PatchProxy.onMethodExit(s.class, str2);
             }
          }
       }else {
          goto label_00b9 ;
       }
       this.x.P(this.u, this.B);
       PatchProxy.onMethodExit(s.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, s.class, "6")) {
          return;
       }
       this.A.clear();
       s tz = this.z;
       if (tz != null) {
          tz.clear();
       }
       PatchProxy.onMethodExit(s.class, "6");
       return;
    }
    public final void P8(ChangeScreenVisibilityCause p0,boolean p1){
       String str;
       Iterator iterator;
       if (PatchProxy.isSupport2(s.class, "12") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, s.class, "12")) {
          return;
       }
       if (p0 == ChangeScreenVisibilityCause.NASA_FEATURE_SCREEN_CLEAN) {
          str = "16";
          if (!PatchProxy.isSupport2(s.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p1), this, s.class, str)) {
             iterator = this.z.iterator();
             while (iterator.hasNext()) {
                i.b(iterator.next(), false, p1);
             }
             i.b(this.w, true, p1);
             PatchProxy.onMethodExit(s.class, str);
          }
       }else {
          str = "14";
          if (!PatchProxy.isSupport2(s.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p1), this, s.class, str)) {
             iterator = this.A.iterator();
             while (iterator.hasNext()) {
                i.b(iterator.next(), false, p1);
             }
             PatchProxy.onMethodExit(s.class, str);
          }
       }
       this.s.f(new j(p0, false, p1));
       PatchProxy.onMethodExit(s.class, "12");
       return;
    }
    public final boolean R8(ChangeScreenVisibilityCause p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, s.class, "18");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       PatchProxy.onMethodExit(s.class, "18");
       return this.s.c();
    }
    public final boolean S8(ChangeScreenVisibleEvent p0){
       p0 = p0.c;
       boolean b = (p0 != ChangeScreenVisibilityCause.SHOW_FEATURED_SEEK_BAR && (p0 != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && p0 != ChangeScreenVisibilityCause.FOLLOW_GUIDE))? true: false;
       return b;
    }
    public void V8(ChangeScreenVisibleEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "10")) {
          return;
       }
       if (!this.p.equals(p0.a) || n.I(this.getActivity())) {
          PatchProxy.onMethodExit(s.class, "10");
          return;
       }else {
          ChangeScreenVisibleEvent c = p0.c;
          if (c == ChangeScreenVisibilityCause.CLICK || (c == ChangeScreenVisibilityCause.SHOW_LONG_ATLAS && (!this.R8(c) && this.x.C()))) {
             this.q.get().a(a$a.a(1027, "HIDE_PHOTO_INFO"));
          }
       label_004c :
          c = p0.b;
          int i = 0;
          if (c == ChangeScreenVisibleEvent$Operation.UNCLEAR) {
             if (p0.c == ChangeScreenVisibilityCause.SHOW_COMMENT && this.s.c()) {
                PatchProxy.onMethodExit(s.class, "10");
                return;
             }else {
                Object[] objArray = new Object[i];
                o.C().w("SlidePlayScreenVMPresenter", this.R8(p0.c)+"---解除清屏", objArray);
                if (this.y == null && !this.R8(p0.c)) {
                   c = p0.c;
                   if (c != ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS && c != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN) {
                   label_00c7 :
                      PatchProxy.onMethodExit(s.class, "10");
                      return;
                   }
                }
                objArray = new Object[i];
                o.C().s("SlidePlayScreenVMPresenter", "onScreenVisibilityChanged\(\) called with: event = ["+p0+"]", objArray);
                this.Y8(p0.c, this.S8(p0));
                this.y = i;
                goto label_00c7 ;
             }
          }else if(c == ChangeScreenVisibleEvent$Operation.CLEAR){
             Object[] objArray1 = new Object[i];
             o.C().w("SlidePlayScreenVMPresenter", this.R8(p0.c)+"---进入清屏", objArray1);
             if (this.R8(p0.c)) {
                c = p0.c;
                if (c == ChangeScreenVisibilityCause.SHOW_LONG_ATLAS || (c != ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS && c != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN)) {
                label_0111 :
                   PatchProxy.onMethodExit(s.class, "10");
                   return;
                }
             }
             this.P8(p0.c, this.S8(p0));
             this.y = true;
             goto label_0111 ;
          }else {
             this.y = i;
             this.W8(p0.c);
             PatchProxy.onMethodExit(s.class, "10");
             return;
          }
       }
    }
    public final void W8(ChangeScreenVisibilityCause p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().s("SlidePlayScreenVMPresenter", "onScreenClick\(\) called with: type = ["+p0+"]", objArray);
       if (this.x.r()) {
          this.r.l();
          PatchProxy.onMethodExit(s.class, "11");
          return;
       }else {
          boolean b = true;
          if (!this.R8(p0)) {
             this.s.e(b);
             if (p0 != ChangeScreenVisibilityCause.SHOW_LONG_ATLAS && (p0 != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && p0 != ChangeScreenVisibilityCause.CAPTION_DIALOG)) {
                i = true;
             }
          label_0057 :
             this.P8(p0, i);
             if (p0 == ChangeScreenVisibilityCause.CLICK || p0 == ChangeScreenVisibilityCause.NASA_FEATURE_SCREEN_CLEAN) {
                i0.a().t(27, this.p.mEntity);
             }
          }else {
             this.s.e(i);
             if (p0 != ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && p0 != ChangeScreenVisibilityCause.CAPTION_DIALOG) {
                i = true;
             }
             this.Y8(p0, i);
          }
          PatchProxy.onMethodExit(s.class, "11");
          return;
       }
    }
    public void X8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "4")) {
          return;
       }
       if (p0 != null && (p0.getEntity() == null || !this.s.c())) {
          PatchProxy.onMethodExit(s.class, "4");
          return;
       }else {
          this.s.e(false);
          this.s.f(new j(ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN, true, false));
          PatchProxy.onMethodExit(s.class, "4");
          return;
       }
    }
    public final void Y8(ChangeScreenVisibilityCause p0,boolean p1){
       if (PatchProxy.isSupport2(s.class, "13") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, s.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("SlidePlayScreenVMPresenter", "showScreen\(\) called with: type = ["+p0+"], showAnim = ["+p1+"]", objArray);
       if (p0 == ChangeScreenVisibilityCause.NASA_FEATURE_SCREEN_CLEAN) {
          this.Z8(p1);
       }else {
          String str = "15";
          if (!PatchProxy.isSupport2(s.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p1), this, s.class, str)) {
             Iterator iterator = this.A.iterator();
             while (iterator.hasNext()) {
                i.b(iterator.next(), true, p1);
             }
             PatchProxy.onMethodExit(s.class, str);
          }
       }
       this.s.f(new j(p0, true, p1));
       PatchProxy.onMethodExit(s.class, "13");
       return;
    }
    public void Z8(boolean p0){
       if (PatchProxy.isSupport2(s.class, "17") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, s.class, "17")) {
          return;
       }
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          i.b(iterator.next(), true, p0);
       }
       i.b(this.w, false, p0);
       PatchProxy.onMethodExit(s.class, "17");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a04db);
       this.w = m1.f(p0, 0x7f0a04e1);
       PatchProxy.onMethodExit(s.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, s.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.x8("LOG_LISTENER");
       this.r = this.q8(u.class);
       this.s = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.t = this.q8(a.class);
       this.u = this.r8("DETAIL_FRAGMENT");
       PatchProxy.onMethodExit(s.class, "1");
       return;
    }
}
