package com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.c;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$d;
import fcc.d;
import z8c.a;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$a;
import zbc.c;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$c;
import java.lang.Throwable;
import java.lang.Boolean;
import android.view.View;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import ekd.n0;
import java.util.Map;
import qvb.i;
import android.os.Bundle;
import ekd.m1;
import v6d.a;
import android.content.SharedPreferences;
import e17.i;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.relation.user.model.MissUResponse;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.relation.user.model.MissUResponse$MissUHeadInfo;
import android.widget.TextView;
import java.lang.CharSequence;
import g9c.d;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import ccc.b;
import android.view.View$OnClickListener;
import lnc.a1;
import y8c.g;
import com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import ekd.x0;
import java.net.URLDecoder;
import xac.p;
import com.yxcorp.gifshow.relation.user.model.UserListParam;

public class MissUUserProfileAndNoticeFragment extends UserListFragment	// class@001a03
{
    public LinearLayout J;
    public MissUResponse K;
    public KwaiActionBar L;
    public View M;
    public static final int N;

    public void MissUUserProfileAndNoticeFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, MissUUserProfileAndNoticeFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MissUUserProfileAndNoticeFragment$b(this, this);
    }
    public PresenterV2 Hh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MissUUserProfileAndNoticeFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new c(0));
       obj.U7(new MissUUserProfileAndNoticeFragment$d());
       obj.U7(new d());
       PatchProxy.onMethodExit(MissUUserProfileAndNoticeFragment.class, "1");
       return obj;
    }
    public a Jh(){
       Object obj = PatchProxy.apply(null, this, MissUUserProfileAndNoticeFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MissUUserProfileAndNoticeFragment$a(this, 1, false, 1);
    }
    public c Kh(){
       Object obj = PatchProxy.apply(null, this, MissUUserProfileAndNoticeFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MissUUserProfileAndNoticeFragment$c(this);
    }
    public int M(){
       return 1;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(MissUUserProfileAndNoticeFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, MissUUserProfileAndNoticeFragment.class, "10")) {
          return;
       }
       super.M1(p0, p1);
       this.M.setVisibility(8);
       return;
    }
    public String Ph(int p0){
       if (PatchProxy.isSupport(MissUUserProfileAndNoticeFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MissUUserProfileAndNoticeFragment.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0x2710) {
          return String.valueOf(p0);
       }else {
          return n0.b("0.0").format((double)((float)p0 / 10000.00f))+"w";
       }
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MissUUserProfileAndNoticeFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MissUUserProfileAndNoticeFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "POKE_LIST";
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MissUUserProfileAndNoticeFragment.class, "3")) {
          return;
       }
       super.onResume();
       this.q().a();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MissUUserProfileAndNoticeFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.title_bar_divider).setVisibility(8);
       this.M = m1.f(p0, 0x7f0a2b93);
       return;
    }
    public void v2(boolean p0,boolean p1){
       SharedPreferences a;
       if (PatchProxy.isSupport(MissUUserProfileAndNoticeFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, MissUUserProfileAndNoticeFragment.class, "9")) {
          return;
       }
       super.v2(p0, p1);
       if (!this.q().isEmpty()) {
          if (!PatchProxy.applyVoid(null, this, MissUUserProfileAndNoticeFragment.class, "14")) {
             a = a.a;
             String str = "HasShownDisableMissUHint";
             if (!a.getBoolean(str, 0)) {
                i.a(R.style.arg_RES_7f11066a, 0x7f10363a);
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putBoolean(str, true);
                g.a(uEditor);
             }
          }
          MissUResponse missURespons = this.q().L0();
          this.K = missURespons;
          if (!PatchProxy.applyVoidOneRefs(missURespons, this, MissUUserProfileAndNoticeFragment.class, "6")) {
             if (this.J == null) {
                this.J = a.a(this.getContext(), 0x7f0d0835);
             }
             if (missURespons != null) {
                MissUResponse mMissUHeadIn = missURespons.mMissUHeadInfo;
                if (mMissUHeadIn != null) {
                   if (mMissUHeadIn.mTitle != null) {
                      this.J.findViewById(R.id.missu_head_title).setText(missURespons.mMissUHeadInfo.mTitle);
                   }
                   if (missURespons.mMissUHeadInfo.mSubTitle != null) {
                      this.J.findViewById(R.id.missu_head_subtitle).setText(missURespons.mMissUHeadInfo.mSubTitle);
                   }
                }
             }
             this.J.setPadding(0, 8, 0, 0);
             if (!this.ia().U0(this.J)) {
                this.ia().P0(this.J);
             }
          }
          MissUUserProfileAndNoticeFragment tK = this.K;
          if (!PatchProxy.applyVoidOneRefs(tK, this, MissUUserProfileAndNoticeFragment.class, "7")) {
             KwaiActionBar kwaiActionBa = this.getView().findViewById(R.id.title_root);
             this.L = kwaiActionBa;
             kwaiActionBa.m(-1);
             this.L.i(R.drawable.arg_RES_7f081ba0);
             this.L.h(new b(this));
             if (tK != null) {
                this.L.r(a1.r(R.string.arg_RES_7f10364e, this.Ph(tK.mTotalCount)));
             }
          }
          this.M.setVisibility(0);
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, MissUUserProfileAndNoticeFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MissUProfileAndNoticeAdapter(new e$b(this), this.getActivity());
    }
    public i yh(){
       Uri obj = PatchProxy.apply(null, this, MissUUserProfileAndNoticeFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity().getIntent().getData();
       String str = x0.a(obj, "style");
       String str1 = x0.a(Uri.parse(URLDecoder.decode(obj.toString())), "style");
       UserListParam mCursor = this.F.mCursor;
       if (str == null) {
          str = str1;
       }
       p op = new p(mCursor);
       op.q = str;
       op.r = x0.a(obj, "pinnedUserIDs");
       return op;
    }
}
