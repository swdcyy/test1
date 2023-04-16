package aqa.e;
import pvb.a;
import aqa.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import rkd.b;
import android.content.res.Configuration;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import android.widget.TextView;
import android.content.res.Resources;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import xpa.d;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Application;
import o56.a;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import java.lang.Math;
import lnc.a1;
import brd.t;
import bn.a;
import java.util.concurrent.TimeUnit;
import aqa.c;
import erd.g;
import crd.b;
import aqa.d;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends a	// class@0002bb
{
    public TextView A;
    public View B;
    public View C;
    public View D;
    public View E;
    public TextView F;
    public boolean G;
    public QPhoto H;
    public a I;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public ViewStub s;
    public ViewStub t;
    public ViewGroup u;
    public ViewGroup v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void e(){
       super();
       this.I = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.G = c.l();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q);
       this.r = slidePlayVie;
       slidePlayVie.h(this.I);
       this.W8(b.e());
       this.X8(b.e());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.r.l(this.I);
       return;
    }
    public void R8(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       boolean b = true;
       boolean b1 = (p0.orientation == 2)? true: false;
       this.W8(b1);
       if (p0.orientation != 2) {
          b = false;
       }
       this.X8(b);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PAD_OPEN_CLOSE_AUTO_PLAY_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("auto_status", Integer.valueOf(this.G));
       e tH = this.H;
       String photoId = (tH != null)? tH.getPhotoId(): "";
       oi3.d("photo_id", photoId);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack));
       return;
    }
    public final void V8(boolean p0){
       e tF;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "9")) {
          return;
       }
       int i = this.G ^ 1;
       this.G = i;
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putBoolean("padPhotoSeriesPlayed", i);
       g.a(uEditor);
       i = 0x7f100ef9;
       if (p0) {
          tF = this.F;
          if (tF != null) {
             if (this.G == null) {
                i = 0x7f100ef8;
             }
             tF.setText(this.n8(i));
          }
       }else {
          tF = this.A;
          if (tF != null) {
             if (this.G == null) {
                i = 0x7f100ef8;
             }
             tF.setText(this.n8(i));
          }
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "10")) {
          int i1 = (this.G != null)? 0x7f100efb: 0x7f100efa;
          i.e(R.style.arg_RES_7f11066a, this.l8().getText(i1), 1);
       }
       RxBus.f.b(new d(this.G));
       return;
    }
    public final void W8(boolean p0){
       ViewGroup viewGroup;
       Point point;
       e tE;
       float f1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "6")) {
          return;
       }
       String str = "window";
       long l = 1;
       float f = 0x3f800000;
       if (p0) {
          if (this.v == null) {
             viewGroup = this.t.inflate();
             this.v = viewGroup;
             if (viewGroup.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                point = new Point();
                a.b().getSystemService(str).getDefaultDisplay().getRealSize(point);
                this.v.getLayoutParams().topMargin = Math.min(point.x, point.y) - a1.e(0x431f0000);
                this.v.requestLayout();
             }
             this.B = this.v.findViewById(0x7f0a16ab);
             this.C = this.v.findViewById(0x7f0a16a8);
             this.F = this.v.findViewById(0x7f0a16ac);
             this.D = this.v.findViewById(0x7f0a16aa);
             this.E = this.v.findViewById(0x7f0a16a9);
             this.X7(a.b(this.B).throttleFirst(l, TimeUnit.SECONDS).subscribe(new c(this)));
          }
       }else if(this.u == null){
          viewGroup = this.s.inflate();
          this.u = viewGroup;
          if (viewGroup.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             ViewGroup$MarginLayoutParams layoutParams = this.u.getLayoutParams();
             layoutParams.rightMargin = - a1.e(f);
             point = new Point();
             a.b().getSystemService(str).getDefaultDisplay().getRealSize(point);
             layoutParams.topMargin = Math.min(point.x, point.y) - a1.d(0x7f070cab);
             this.u.requestLayout();
          }
          this.w = this.u.findViewById(0x7f0a2f5f);
          this.x = this.u.findViewById(0x7f0a2f5c);
          this.A = this.u.findViewById(0x7f0a2f60);
          this.y = this.u.findViewById(0x7f0a2f5e);
          this.z = this.u.findViewById(0x7f0a2f5d);
          this.X7(a.b(this.w).throttleFirst(l, TimeUnit.SECONDS).subscribe(new d(this)));
       }
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "8")) {
          int i = 0x7f100ef9;
          if (p0) {
             tE = this.E;
             if (tE != null) {
                f1 = (this.G != null)? 0x3f800000: 0;
                tE.setAlpha(f1);
             }
             tE = this.D;
             if (tE != null) {
                if (this.G != null) {
                   f = 0;
                }
                tE.setAlpha(f);
             }
             tE = this.F;
             if (tE != null) {
                if (this.G == null) {
                   i = 0x7f100ef8;
                }
                tE.setText(this.n8(i));
             }
          }else {
             tE = this.z;
             if (tE != null) {
                f1 = (this.G != null)? 0x3f800000: 0;
                tE.setAlpha(f1);
             }
             tE = this.y;
             if (tE != null) {
                if (this.G != null) {
                   f = 0;
                }
                tE.setAlpha(f);
             }
             tE = this.A;
             if (tE != null) {
                if (this.G == null) {
                   i = 0x7f100ef8;
                }
                tE.setText(this.n8(i));
             }
          }
       }
       return;
    }
    public final void X8(boolean p0){
       e tu;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "7")) {
          return;
       }
       if (p0) {
          tu = this.u;
          if (tu != null) {
             tu.setVisibility(8);
          }
          tu = this.v;
          if (tu != null) {
             tu.setVisibility(0);
          }
       }else {
          tu = this.v;
          if (tu != null) {
             tu.setVisibility(8);
          }
          tu = this.u;
          if (tu != null) {
             tu.setVisibility(0);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a389c);
       this.t = m1.f(p0, 0x7f0a389b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
