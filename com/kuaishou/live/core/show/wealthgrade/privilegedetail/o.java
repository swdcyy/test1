package com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import k51.c;
import java.lang.String;
import d61.j;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.l;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.n;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$a;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qm2.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import d61.h;
import android.view.ViewGroup;
import z8c.a;
import android.graphics.drawable.ColorDrawable;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import p91.m;
import java.lang.Long;
import java.lang.Math;
import android.widget.ProgressBar;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeProtectionInfo;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hm2.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import java.util.Collection;
import ekd.q;
import android.view.View;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import android.widget.TextView;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class o extends c	// class@00127e
{
    public LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo A;
    public a B;
    public Observer C;
    public final l D;
    public final p$a E;
    public final p$a F;
    public ViewGroup p;
    public TextView q;
    public ProgressBar r;
    public TextView s;
    public LiveUserView t;
    public TextView u;
    public ImageView v;
    public View w;
    public RecyclerView x;
    public KwaiImageView y;
    public o$e z;
    public static final String G;
    public static String sLivePresenterClassName;

    static {
       o.G = j.a("http://static.yximgs.com/udata/pkg/kwai-client-image/live_wealth_grade_info_bg.png");
    }
    public void o(){
       super();
       this.C = new l(this);
       this.D = n.a;
       this.E = new o$a(this);
       this.F = new o$b(this);
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "4")) {
          return;
       }
       o tB = this.B;
       tB.b.observe(tB.d, this.C);
       this.y.L(o.G);
       if (!PatchProxy.applyVoid(objArray, this, oo, "5")) {
          int[] ointArray = new int[]{a1.a(0x7f060cb9),a1.a(0x7f060cc4)};
          Drawable uDrawable = h.b(a1.e(12.00f), GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
          uDrawable.setAlpha(122);
          this.x.setBackground(uDrawable);
          a uoa = new a(1, 0, 0);
          ColorDrawable uColorDrawab = new ColorDrawable(a1.a(0x7f061c33));
          uColorDrawab.setBounds(0, 0, 0, a1.e(0x3f000000));
          uoa.o(uColorDrawab);
          this.x.addItemDecoration(uoa);
       }
       return;
    }
    public ClientContent$LiveStreamPackage P8(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B.c;
       if (obj != null) {
          objArray = obj.Z2.a();
       }
       return objArray;
    }
    public final void R8(long p0,long p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, oo, "9")) {
          return;
       }
       this.r.setMax((int)Math.max(p1, 0));
       this.r.setProgress((int)Math.max(p0, 0));
       return;
    }
    public void S8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "7")) {
          return;
       }
       o tA = this.A;
       if (tA != null) {
          LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo mLiveWealthG = tA.mLiveWealthGradeInfo;
          if (mLiveWealthG != null && mLiveWealthG.mCurrentGrade != null) {
             o$e obj = PatchProxy.apply(objArray, this, oo, "8");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else if(this.A == null){
                ArrayList uArrayList = new ArrayList();
                mLiveWealthG = this.A.mWealthGradeProtectionInfo;
                if (mLiveWealthG != null && mLiveWealthG.mIsWealthGradeProtectionEnabled != null) {
                   p op = new p();
                   op.a = a1.p(0x7f102ec4);
                   LiveWealthGradeProtectionInfo mIsBalanceLa = mLiveWealthG.mIsBalanceLacked;
                   LiveWealthGradeProtectionInfo mBalanceLack = (mIsBalanceLa != null)? mLiveWealthG.mBalanceLackedDescription: objArray;
                   op.b = mBalanceLack;
                   op.d = mIsBalanceLa;
                   boolean b = (mLiveWealthG.mIsWealthGradeProtectionOpen != null && mIsBalanceLa == null)? true: false;
                   op.c = b;
                   op.e = this.F;
                   uArrayList.add(op);
                   if (mLiveWealthG.mIsBalanceLacked != null && !TextUtils.x(mLiveWealthG.mBalanceLackedDescription)) {
                      ClientContent$LiveStreamPackage liveStreamPa = this.P8();
                      if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, k.class, "14") && liveStreamPa != null) {
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.liveStreamPackage = liveStreamPa;
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "PRIVILEGE_SETTING_LACK_OF_BALANCE_CARD";
                         u1.u0(9, uElementPack, uContentPack);
                      }
                   }
                }
             label_00a0 :
                LiveWealthGradePrivilegeResponse$LiveWealthGradePrivilegeInfo mLiveWealthG1 = this.A.mLiveWealthGradeInfo;
                if (mLiveWealthG1 != null && mLiveWealthG1.mCurrentGrade != null) {
                   p op1 = new p();
                   op1.a = a1.p(0x7f102ecb);
                   op1.c = mLiveWealthG1.mIsGradeHidden;
                   op1.e = this.E;
                   uArrayList.add(op1);
                }
                objArray = uArrayList;
             }
             if (q.f(objArray)) {
                this.x.setVisibility(8);
                this.w.setVisibility(8);
                return;
             }else {
                this.x.setVisibility(0);
                this.w.setVisibility(0);
                if (this.z == null) {
                   obj = new o$e();
                   this.z = obj;
                   this.x.setAdapter(obj);
                }
                this.z.W0(objArray);
                this.z.k0();
                return;
             }
          }
       }
       this.x.setVisibility(8);
       this.w.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a2805);
       this.q = p0.findViewById(0x7f0a2806);
       this.r = p0.findViewById(0x7f0a2810);
       this.s = p0.findViewById(0x7f0a2808);
       this.t = p0.findViewById(0x7f0a2819);
       this.u = p0.findViewById(0x7f0a282d);
       this.v = p0.findViewById(0x7f0a2807);
       this.x = m1.f(p0, 0x7f0a2812);
       this.w = m1.f(p0, 0x7f0a2813);
       this.y = m1.f(p0, 0x7f0a281c);
       m1.a(p0, new o$c(this), R.id.live_wealth_grade_setting_tips_image_view);
       m1.a(p0, new o$d(this), R.id.live_wealth_grade_detail_description_tips_image_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.B = this.q8(a.class);
       return;
    }
}
