package com.kuaishou.live.gzone.treasurebox.i;
import f37.b0;
import com.kuaishou.live.gzone.treasurebox.i$a;
import m53.e;
import m53.f;
import com.kuaishou.live.gzone.treasurebox.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import com.kuaishou.live.gzone.treasurebox.i$d;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.i$e;
import mq5.h;
import mq5.b;
import androidx.fragment.app.c$b;
import kq5.b;
import t47.a$a;
import t47.a;
import m67.p;
import m67.p$b;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import r53.b;
import m53.g;
import m53.i;
import r53.b$a;
import com.kwai.robust.PatchProxyResult;
import n53.c;
import n53.b;
import cjd.e;
import erd.o;
import brd.z;
import io.reactivex.android.schedulers.a;
import m53.h;
import m53.j;
import java.lang.Boolean;
import android.view.View;
import android.content.Context;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.content.res.Resources;
import cw9.c;
import f37.o0;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask$Skin;
import z12.x;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import java.lang.Integer;
import android.content.res.ColorStateList;
import android.graphics.Color;
import com.kwai.live.gzone.popup.bean.LiveGzoneCommonPopupInfo;
import n67.a$a;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.activitycontext.ActivityContext;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.f0;
import com.kuaishou.live.gzone.treasurebox.i$c;
import android.view.View$OnClickListener;
import mrd.a;

public class i extends b0	// class@001c70
{
    public a$a A;
    public a B;
    public a C;
    public LiveGzoneTreasureTask D;
    public h E;
    public c F;
    public LiveGzoneCommonPopupInfo G;
    public b H;
    public final c$b I;
    public final a$a J;
    public final p$b K;
    public final b$a L;
    public KwaiImageView q;
    public View r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public TextView w;
    public TextView x;
    public KwaiImageView y;
    public CDNUrl[] z;
    public static String sLivePresenterClassName = "LiveGzoneTreasureTaskHeaderPresenter";

    public void i(){
       super();
       this.I = new i$a(this);
       this.J = new e(this);
       this.K = new f(this);
       this.L = new i$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "3")) {
          return;
       }
       this.W8(false, objArray);
       this.X7(this.C.subscribe(new i$d(this)));
       i$e uoe = new i$e(this);
       this.E = uoe;
       this.B.n.Km(uoe);
       this.B.s.c(this.I);
       a t = this.B.t;
       if (t != null) {
          t.b("/gift", this.J);
       }
       p.b().c(this.K);
       t = this.B.f;
       if (t != null) {
          this.X7(t.p().i.subscribe(new g(this)));
          this.X7(this.B.f.p().j.subscribe(new i(this)));
       }
       t = this.B.f;
       if (t != null) {
          t.w(this.L);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       super.J8();
       this.D = objArray;
       this.G = objArray;
       i tE = this.E;
       if (tE != null) {
          this.B.n.le(tE);
       }
       this.z = objArray;
       this.B.s.a(this.I);
       a f = this.B.f;
       if (f != null) {
          f.i(this.L);
       }
       f = this.B.t;
       if (f != null) {
          f.a("/gift", this.J);
       }
       p.b().d(this.K);
       tE = this.H;
       if (tE != null) {
          tE.dispose();
       }
       return;
    }
    public t S8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().h(p0).map(new e());
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "13")) {
          return;
       }
       this.X7(b.b().f(p0).map(new e()).subscribeOn(a.c()).subscribe(new h(this), new j(this)));
       return;
    }
    public void W8(boolean p0,LiveGzoneTreasureTask p1){
       int i;
       LiveGzoneTreasureTask$Skin mMainTextCol;
       LiveGzoneTreasureTask$Skin mButtonUnSel;
       b uob1;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oi, "7")) {
          return;
       }
       if (p0) {
          i = 0;
          this.v.setVisibility(i);
          if (!PatchProxy.applyVoidOneRefs(p1, this, oi, "8")) {
             Context context = this.getContext();
             if (context != null) {
                this.q.U(p1.mTaskIcon);
                this.w.setText(p1.mTaskTitle);
                this.x.setText(p1.mTaskPrizeTitle);
                LiveGzoneTreasureTask mTaskStatus = p1.mTaskStatus;
                b uob = 0x7f07098d;
                KwaiRadiusStyles kwaiRadiusSt = 1;
                if (mTaskStatus != kwaiRadiusSt) {
                   if (mTaskStatus != 2) {
                      if (mTaskStatus == 3) {
                         this.u.setText(R.string.arg_RES_7f10116d);
                         this.u.setTextSize(i, (float)c.a(context.getResources(), uob));
                         this.r.setEnabled(kwaiRadiusSt);
                      }
                   }else {
                      this.u.setText(o0.h(p1.mTaskProgress));
                      this.u.setTextSize(i, (float)c.a(context.getResources(), R.dimen.arg_RES_7f07098c));
                      this.r.setEnabled(i);
                   }
                }else {
                   this.u.setText(R.string.arg_RES_7f102411);
                   this.u.setTextSize(i, (float)c.a(context.getResources(), uob));
                   this.r.setEnabled(kwaiRadiusSt);
                }
                LiveGzoneTreasureTask mSkin = p1.mSkin;
                if (!PatchProxy.applyVoidOneRefs(mSkin, this, oi, "9")) {
                   LiveGzoneTreasureTask$Skin skin = null;
                   if (!PatchProxy.applyVoidOneRefs(mSkin, this, oi, "10")) {
                      if (mSkin == null) {
                         uob1 = new b();
                         uob1.s(DrawableCreator$Shape.Rectangle);
                         uob1.v(a1.a(R.color.arg_RES_7f062034));
                         uob1.g(KwaiRadiusStyles.R8);
                         this.y.setPlaceHolderImage(uob1.a());
                         this.z = skin;
                      }else if(o0.b(this.z, mSkin.mCardBackgroundPic)){
                         this.z = mSkin.mCardBackgroundPic;
                         uob1 = new b();
                         uob1.s(DrawableCreator$Shape.Rectangle);
                         uob1.v(x.z(mSkin.mCardBackgroundColor));
                         uob1.g(KwaiRadiusStyles.R8);
                         this.y.setPlaceHolderImage(uob1.a());
                         RoundingParams roundingPara = RoundingParams.c((float)a1.d(R.dimen.arg_RES_7f07042b));
                         roundingPara.j(x.z(mSkin.mBorderColor), (float)a1.e(0x3fc00000));
                         this.y.getHierarchy().L(roundingPara);
                         mButtonUnSel = mSkin.mCardBackgroundPic;
                         if (mButtonUnSel != null) {
                            this.y.U(mButtonUnSel);
                         }
                      }
                   }
                   int i1 = 0x7f0607c8;
                   i = 0x7f061c32;
                   if (mSkin == null) {
                      uob = new b();
                      uob.g(KwaiRadiusStyles.FULL);
                      uob.s(DrawableCreator$Shape.Rectangle);
                      uob.N = Integer.valueOf(a1.a(0x7f060752));
                      uob.T = Integer.valueOf(a1.a(0x7f061d82));
                      this.s.setPlaceHolderImage(uob.a());
                      this.u.setTextColor(o0.f(i, i1));
                   }else if(this.r.isEnabled()){
                      mMainTextCol = mSkin.mButtonSelectedBgImg;
                      if (mMainTextCol != null) {
                         this.s.U(mMainTextCol);
                      }
                      this.X8(this.u, mSkin.mButtonTextSelectedColor, i1);
                   }else {
                      mButtonUnSel = mSkin.mButtonUnSelectedBgImg;
                      if (mButtonUnSel != null) {
                         this.s.U(mButtonUnSel);
                      }
                      this.X8(this.u, mSkin.mMainTextColor, i);
                   }
                   i tt = this.t;
                   mMainTextCol = (mSkin != null)? mSkin.mMainTextColor: skin;
                   this.X8(tt, mMainTextCol, R.color.arg_RES_7f061db2);
                   tt = this.x;
                   mMainTextCol = (mSkin != null)? mSkin.mPrizeTitleColor: skin;
                   this.X8(tt, mMainTextCol, R.color.arg_RES_7f061e2b);
                   tt = this.w;
                   if (mSkin != null) {
                      skin = mSkin.mMainTextColor;
                   }
                   this.X8(tt, skin, R.color.arg_RES_7f061dc4);
                }
             }
          }
       }else {
          this.v.setVisibility(8);
       }
       return;
    }
    public final void X8(TextView p0,String p1,int p2){
       int i;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, i.class, "11")) {
          return;
       }
       try{
          i = Color.parseColor(p1);
       }catch(java.lang.Exception e0){
          i = a1.a(p2);
       }
       p0.setTextColor(i);
       return;
    }
    public void Y8(LiveGzoneCommonPopupInfo p0){
       i tA;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       if (p0 == null) {
          tA = this.A;
          if (tA != null) {
             tA.a("task prize is empty");
          }
          return;
       }else if(this.getActivity() == null){
          tA = this.A;
          if (tA != null) {
             tA.a("activity is null");
          }
          return;
       }else {
          i tF = this.F;
          if (tF != null && tF.K()) {
             this.F.o();
          }
          a f = this.B.f;
          if (f != null) {
             this.F = f.m(ActivityContext.g().e(), p0, this.D);
          }
          tF = this.F;
          if (tF != null && !tF.K()) {
             this.G = p0;
             this.F.Z();
             this.P8(this.F);
          }
          return;
       }
    }
    public void Z8(LiveGzoneTreasureTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       this.D = p0;
       i oi = (p0 != null && p0.canShowTask())? 1: null;
       if (oi) {
          this.W8(true, this.D);
       }else {
          this.W8(false, this.D);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1fbf);
       this.r = m1.f(p0, 0x7f0a1fbc);
       this.s = m1.f(p0, 0x7f0a1fbb);
       this.t = m1.f(p0, 0x7f0a1fc1);
       this.u = m1.f(p0, 0x7f0a1fbd);
       this.v = m1.f(p0, 0x7f0a1fbe);
       this.w = m1.f(p0, 0x7f0a1fc2);
       this.x = m1.f(p0, 0x7f0a1fc0);
       this.y = m1.f(p0, 0x7f0a1fba);
       this.u.setTextColor(o0.f(R.color.arg_RES_7f061c32, 0x7f0607c8));
       f0.i(this.u, this.getContext());
       this.r.setOnClickListener(new i$c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.B = this.q8(a.class);
       this.C = this.r8("TREASURE_TASK_SUBJECT");
       return;
    }
}
