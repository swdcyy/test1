package com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import android.content.Context;
import com.kuaishou.android.model.mix.CommonMeta;
import android.util.AttributeSet;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$a;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import crd.b;
import android.widget.TextView;
import com.kwai.framework.model.user.RecoUser;
import yl8.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.relation.explore.view.a;
import erd.o;
import t45.d;
import brd.z;
import lac.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$d;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.UserExtraInfo;
import com.yxcorp.gifshow.relation.explore.presenter.f;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import fac.d;
import fac.b;
import fac.c;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import lnc.a1;
import ekd.m1;
import ekd.p1;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.app.Application;
import o56.a;
import eg.a;
import nac.a;
import cw9.c;
import android.widget.LinearLayout$LayoutParams;
import java.util.ArrayList;
import f7c.c;
import android.widget.ImageView;
import wca.m;
import wca.a;

public class FriendPymkBigCardView extends BaseCardView	// class@00188b
{
    public CustomRecyclerView e;
    public View$OnClickListener f;
    public View$OnClickListener g;
    public List h;
    public Resources i;
    public CommonMeta j;
    public static final int k;

    public void FriendPymkBigCardView(Context p0,CommonMeta p1){
       super(p0, null, 0);
       this.f = new FriendPymkBigCardView$a(this);
       this.g = new FriendPymkBigCardView$b(this);
       this.b = a.c(p0, 0x7f0d00fc, this);
       this.i = this.getResources();
       this.j = p1;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FriendPymkBigCardView.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, FriendPymkBigCardView.class, "10")) {
          FriendPymkBigCardView th = this.h;
          if (th != null) {
             Iterator iterator = th.iterator();
             while (iterator.hasNext()) {
                iterator.next().dispose();
             }
          }
       }
       return;
    }
    public void b(TextView p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendPymkBigCardView.class, "2")) {
          return;
       }
       BaseCardView tc = this.c;
       if (tc.mUser == null) {
          return;
       }
       tc.mUser.b();
       this.h.add(this.c.mUser.observable().distinctUntilChanged(a.b).observeOn(d.a).subscribe(new b(this, p1), Functions.d()));
       this.j(p1, this.c.mUser);
       p1.setOnClickListener(new FriendPymkBigCardView$c(this));
       p0.setOnClickListener(new FriendPymkBigCardView$d(this));
       return;
    }
    public void c(){
       d uod;
       b a;
       float f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FriendPymkBigCardView.class, "1")) {
          return;
       }
       BaseCardView tc = this.c;
       if (tc.mUser == null) {
          return;
       }
       int b = true;
       int i = q.f(tc.mFeedList) ^ 0x01;
       boolean b1 = f.c(this.c.mUser.mExtraInfo);
       tc = this.c;
       BaseCardView tb = this.b;
       FriendPymkBigCardView tf = this.f;
       if (PatchProxy.isSupport(FriendPymkBigCardView.class)) {
          uod = PatchProxy.applyTwoRefs(Boolean.valueOf(i), Boolean.valueOf(b1), this, FriendPymkBigCardView.class, "21");
          if (uod != PatchProxyResult.class) {
          label_0069 :
             this.h = f.d(tc, tb, tf, b, uod);
             this.b.setOnClickListener(this.f);
             b = 0x7f0a3049;
             this.e = this.b.findViewById(b);
             View view = m1.f(this.b, R.id.close_btn);
             p1.c(view, a1.e(16.00f), a1.e(16.00f), a1.e(16.00f), a1.e(16.00f));
             view.setOnClickListener(this.g);
             int i1 = 85;
             int i2 = 0x7f0a3d3f;
             if (!PatchProxy.applyVoid(objArray, this, FriendPymkBigCardView.class, "8")) {
                this.e.setTag(i2, Integer.valueOf(i1));
                if (!q.f(this.c.mFeedList)) {
                   BaseCardView td = this.d;
                   f.b(this.e, td, td.d, this.c, this.getContext());
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, FriendPymkBigCardView.class, "11")) {
                CustomRecyclerView uCustomRecyc = this.b.findViewById(b);
                View view1 = this.b.findViewById(R.id.relation_space_layout);
                View view2 = m1.f(this.b, R.id.avatar);
                View view3 = m1.f(this.b, R.id.pymk_live_anim_ring);
                View view4 = m1.f(this.b, R.id.tag_layout);
                uCustomRecyc.setTag(i2, Integer.valueOf(i1));
                this.setNameTextView(this.b.findViewById(R.id.name));
                this.setRelationSpaceViewParams(m1.f(this.b, R.id.relation_space_layout));
                b = f.c(this.c.mUser.mExtraInfo);
                i1 = 8;
                if (!b && q.f(this.c.mFeedList)) {
                   this.e(view1, view2, view3);
                   this.h(view4, i1);
                   this.f(uCustomRecyc, i1);
                }
                if (b && q.f(this.c.mFeedList)) {
                   this.e(view1, view2, view3);
                   this.h(view4, 0);
                   this.f(uCustomRecyc, i1);
                }
                f = 0x42f00000;
                if (!b && !q.f(this.c.mFeedList)) {
                   this.setRelationTextNormal(view1);
                   if (!PatchProxy.applyVoidTwoRefs(view2, view3, this, FriendPymkBigCardView.class, "15")) {
                      int i4 = (this.d.b())? 56: 80;
                      RelativeLayout$LayoutParams layoutParams1 = view2.getLayoutParams();
                      layoutParams1.topMargin = a.c(((float)i4 * this.d.a()), a.b().getResources());
                      i4 = a.c((this.d.a() * f), a.b().getResources());
                      layoutParams1.width = i4;
                      layoutParams1.height = i4;
                      this.g(view3, i4, layoutParams1.topMargin);
                      view2.setLayoutParams(layoutParams1);
                   }
                   this.h(view4, i1);
                   this.f(uCustomRecyc, 0);
                }
                if (b && !q.f(this.c.mFeedList)) {
                   this.setRelationTextNormal(view1);
                   if (!PatchProxy.applyVoidTwoRefs(view2, view3, this, FriendPymkBigCardView.class, "14")) {
                      b = (this.d.b())? 24: 48;
                      b = a.c(((float)b * this.d.a()), a.b().getResources());
                      RelativeLayout$LayoutParams layoutParams = view2.getLayoutParams();
                      int i3 = a.c((this.d.a() * f), a.b().getResources());
                      layoutParams.width = i3;
                      layoutParams.height = i3;
                      layoutParams.topMargin = b;
                      this.g(view3, i3, b);
                      view2.setLayoutParams(layoutParams);
                   }
                   this.h(view4, 0);
                   this.f(uCustomRecyc, 0);
                }
             }
          label_023b :
             if (!PatchProxy.applyVoid(objArray, this, FriendPymkBigCardView.class, "5")) {
                tc = this.c;
                if (tc != null) {
                   a = this.d.a;
                   if (a instanceof a && (tc.mShowed == null && a.V())) {
                      this.i();
                   }
                }
             }
             return;
          }
       }
       uod = new d(this.getContext().getResources(), this.d.d, i, b1, 0x7f061d77);
       goto label_0069 ;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, FriendPymkBigCardView.class, "6")) {
          return;
       }
       this.i();
       return;
    }
    public final void e(View p0,View p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FriendPymkBigCardView.class, "17")) {
          return;
       }
       int i = (this.d.b())? 80: 104;
       i = a.c(((float)i * this.d.a()), a.b().getResources());
       RelativeLayout$LayoutParams layoutParams = p1.getLayoutParams();
       int i1 = a.c((this.d.a() * 144.00f), a.b().getResources());
       layoutParams.width = i1;
       layoutParams.height = i1;
       layoutParams.topMargin = i;
       this.g(p2, i1, i);
       p1.setLayoutParams(layoutParams);
       RelativeLayout$LayoutParams layoutParams1 = p0.getLayoutParams();
       layoutParams1.topMargin = (int)(this.d.a() * a.b().getResources().getDimension(0x7f0700d8));
       p0.setLayoutParams(layoutParams1);
       return;
    }
    public final void f(View p0,int p1){
       if (PatchProxy.isSupport(FriendPymkBigCardView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FriendPymkBigCardView.class, "18")) {
          return;
       }
       p0.setVisibility(p1);
       if (p1 == 8) {
          return;
       }
       p1 = (this.d.b())? 16: 32;
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.bottomMargin = a1.e(((float)p1 * this.d.a()));
       layoutParams.leftMargin = (int)((float)a1.d(0x7f0700cc) * this.d.a());
       layoutParams.rightMargin = (int)((float)a1.d(0x7f0700cc) * this.d.a());
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void g(View p0,int p1,int p2){
       if (PatchProxy.isSupport(FriendPymkBigCardView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FriendPymkBigCardView.class, "20")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int i = a.c((this.d.a() * 8.00f), a.b().getResources());
       p1 = p1 + i;
       layoutParams.width = p1;
       layoutParams.height = p1;
       layoutParams.topMargin = p2 - (i / 2);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void h(View p0,int p1){
       if (PatchProxy.isSupport(FriendPymkBigCardView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FriendPymkBigCardView.class, "16")) {
          return;
       }
       if (p1 == 8) {
          p0.setVisibility(p1);
          return;
       }else {
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.height = (int)(this.d.a() * (float)c.b(this.i, 0x7f0700cf));
          layoutParams.topMargin = (int)(this.d.a() * (float)c.b(this.i, 0x7f0700d1));
          int i = (int)(this.d.a() * (float)c.b(this.i, 0x7f0700d5));
          int i1 = (int)(this.d.a() * (float)c.b(this.i, 0x7f0700d3));
          int i2 = (int)(this.d.a() * (float)c.b(this.i, 0x7f0700d4));
          TextView textView = p0.findViewById(R.id.tag_sex);
          TextView textView1 = p0.findViewById(R.id.tag_age);
          TextView textView2 = p0.findViewById(R.id.tag_address);
          float f = (float)(int)(this.d.a() * (float)c.b(this.i, 0x7f0700d6));
          textView.setTextSize(0, f);
          textView1.setTextSize(0, f);
          textView2.setTextSize(0, f);
          textView.setPadding(i2, i, i2, i1);
          textView1.setPadding(i2, i, i2, i1);
          textView2.setPadding(i2, i, i2, i1);
          int i3 = (int)(this.d.a() * (float)a1.d(0x7f0700d0));
          LinearLayout$LayoutParams layoutParams1 = textView1.getLayoutParams();
          layoutParams1.rightMargin = i3;
          textView1.setLayoutParams(layoutParams1);
          layoutParams1 = textView.getLayoutParams();
          layoutParams1.rightMargin = i3;
          textView.setLayoutParams(layoutParams1);
          p0.setLayoutParams(layoutParams);
          p0.setVisibility(p1);
          return;
       }
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, FriendPymkBigCardView.class, "7")) {
          return;
       }
       if (this.c.mShowed == null) {
          ArrayList uArrayList = new ArrayList();
          RecoUser recoUser = new RecoUser();
          BaseCardView tc = this.c;
          recoUser.mUser = tc.mUser;
          recoUser.mFeedList = tc.mFeedList;
          tc.mShowed = true;
          if (tc.mUser != null) {
             tc.mUser.mShowed = true;
          }
          uArrayList.add(recoUser);
          this.d.i.Ee(uArrayList);
       }
       return;
    }
    public void j(TextView p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendPymkBigCardView.class, "4")) {
          return;
       }
       if (p1.isFollowingOrFollowRequesting()) {
          m.b(p1, p0, null, p0);
          p0.setBackgroundResource(R.drawable.arg_RES_7f0801ba);
       }else {
          a.b(this.c.mUser, p0, null, p0);
       }
       return;
    }
    public final void setNameTextView(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView.class, "12")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = (int)(this.d.a() * a.b().getResources().getDimension(0x7f0700c8));
       p0.setTextSize(0, (float)(int)(this.d.a() * a.b().getResources().getDimension(R.dimen.arg_RES_7f0700ca)));
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void setRelationSpaceViewParams(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView.class, "13")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.leftMargin = (int)((float)a1.d(0x7f0700cc) * this.d.a());
       layoutParams.rightMargin = (int)((float)a1.d(0x7f0700cc) * this.d.a());
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void setRelationTextNormal(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView.class, "19")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = 0;
       p0.setLayoutParams(layoutParams);
       return;
    }
}
