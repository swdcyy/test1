package afd.g;
import fed.s2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.template.bigcard.state.a;
import brd.t;
import afd.f;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import afd.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import afd.g$a;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import mfd.a;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.google.gson.JsonObject;
import nfd.q1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import xed.b;
import android.view.View;
import nfd.o3;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.plugin.search.entity.ExtInfo;
import nfd.t0;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.model.CDNUrl;
import jfd.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import tkd.b;
import tkd.d;
import nl9.v;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateIcon;
import ekd.j;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class g extends s2	// class@000026
{
    public ViewStub A;
    public View B;
    public KwaiImageView C;
    public TextView D;
    public ImageView E;
    public TextView F;
    public FrameLayout G;
    public a t;
    public LiveAutoPlayModule u;
    public SearchItem v;
    public d w;
    public TemplateBaseFeed x;
    public RecyclerFragment y;
    public KBoxItem z;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       super.E8();
       this.V8(this.t.c());
       this.X7(this.t.e().subscribe(new f(this)));
       this.E.setOnClickListener(new e(this));
       this.u.O(new g$a(this));
       this.X8(null);
       return;
    }
    public void V8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "12")) {
          return;
       }
       super.V8(p0);
       this.E.setSelected(p0);
       return;
    }
    public final void W8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "11")) {
          return;
       }
       SearchItem mKBoxItem = this.v.mKBoxItem;
       if (mKBoxItem != null) {
          g tx = this.x;
          q1.x(1, this.y, this.v, tx, a.b(mKBoxItem, p0), null, q1.r(tx));
       }
       return;
    }
    public void X8(LiveAutoPlayerState p0){
       int b;
       SearchItem mExtInfo;
       boolean b1;
       g og = g.class;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, og, str)) {
          return;
       }
       int i = 8;
       if (b.b(this.x)) {
          o3.H(this.E, i);
          o3.H(this.B, i);
          return;
       }else {
          int i1 = 0;
          b = (p0 == LiveAutoPlayerState.PLAYING)? true: false;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, og, "5")) {
             o3.H(this.E, i);
          }
          g og1 = 13;
          if (this.z.mType != og1) {
             o3.H(this.B, i);
          }else {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoid(null, this, og, "7")) {
                if (!PatchProxy.applyVoid(null, this, og, "10") && this.B == null) {
                   View view = this.A.inflate();
                   this.B = view;
                   this.C = view.findViewById(0x7f0a15fe);
                   this.D = this.B.findViewById(0x7f0a42f7);
                   this.F = this.B.findViewById(0x7f0a421c);
                   this.G = this.B.findViewById(0x7f0a40e0);
                }
                if (!PatchProxy.applyVoid(null, this, og, "6")) {
                   ConstraintLayout$LayoutParams layoutParams1 = this.B.getLayoutParams();
                   if (this.z.mType == og1) {
                      mExtInfo = this.v.mExtInfo;
                      if (mExtInfo != null && mExtInfo.mEnableUserInfoNewLine != null) {
                         layoutParams1.i = 0x7f0a30d8;
                         layoutParams1.g = 0x7f0a30d8;
                         layoutParams1.d = 0x7f0a30d8;
                         layoutParams1.k = -1;
                         layoutParams1.height = t0.H;
                         layoutParams1.width = i1;
                         this.B.setLayoutParams(layoutParams1);
                         this.B.setBackgroundResource(R.color.arg_RES_7f0608d3);
                         this.F.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061686));
                         this.D.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f0607cf));
                      }
                   }
                   layoutParams1.i = -1;
                   layoutParams1.g = -1;
                   layoutParams1.d = 0x7f0a30d8;
                   layoutParams1.k = 0x7f0a30d8;
                   layoutParams1.height = -2;
                   layoutParams1.width = -2;
                   layoutParams1.bottomMargin = t0.i;
                   this.B.setLayoutParams(layoutParams1);
                   this.F.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061c3d));
                   this.B.setBackgroundResource(R.color.arg_RES_7f06202f);
                   this.D.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061be0));
                }
                o3.H(this.B, i1);
                this.C.U(this.w.n());
                this.D.setText(this.w.getUserName());
                mExtInfo = this.v.mExtInfo;
                if (mExtInfo != null && mExtInfo.mEnableApLiveUser != null) {
                   og1 = this.x;
                   if (og1 != null) {
                      TemplateBaseFeed mExtInfo1 = og1.mExtInfo;
                      if (mExtInfo1 != null && mExtInfo1.mLiveUserInfo != null) {
                         this.D.setMaxWidth(a1.d(R.dimen.arg_RES_7f070337));
                         o3.H(this.F, i1);
                         this.F.setText(this.x.mExtInfo.mLiveUserInfo);
                      label_01a3 :
                         View obj = PatchProxy.apply(null, this, og, "8");
                         if (obj != patchProxyRe) {
                            b1 = obj.booleanValue();
                         }else {
                            og1 = this.x;
                            if (og1 != null && (og1.getQphoto() == null || !this.x.getQphoto().isAd())) {
                               o3.H(this.G, i);
                            }else {
                               String str1 = PatchProxy.apply(null, this, og, "9");
                               int i2 = 0x53db42e7;
                               if (str1 != patchProxyRe) {
                               }else {
                                  og = this.x;
                                  str1 = (og == null || og.getQphoto() == null)? "": d.a(i2).AO(this.x.getQphoto());
                               }
                               if (!TextUtils.x(str1)) {
                                  g tG = this.G;
                                  if (tG != null) {
                                     tG.removeAllViews();
                                     obj = d.a(i2).o6(this.G, true);
                                     if (obj instanceof TextView) {
                                        obj.setText(str1);
                                     }
                                     this.G.addView(obj);
                                     o3.H(obj, i1);
                                     o3.H(this.G, i1);
                                     this.D.setMaxWidth(a1.d(R.dimen.arg_RES_7f070261));
                                     if (this.D.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                                        LinearLayout$LayoutParams layoutParams = this.D.getLayoutParams();
                                        layoutParams.weight = 0x3f800000;
                                        this.D.setLayoutParams(layoutParams);
                                     }
                                     b1 = true;
                                  }
                               }
                            }
                            b1 = false;
                         }
                         if (!b1) {
                            og = this.x;
                            Object obj1 = PatchProxy.applyOneRefs(og, null, b.class, str);
                            if (obj1 != patchProxyRe) {
                               b = obj1.booleanValue();
                            }else if(og != null){
                               TemplateBaseFeed mCoverExtInf = og.mCoverExtInfo;
                               if (mCoverExtInf != null) {
                                  CoverExtInfo mBottomRight = mCoverExtInf.mBottomRightIcon;
                                  if (mBottomRight != null && (j.h(mBottomRight.getIconUrls()) && (!TextUtils.x(og.mCoverExtInfo.mBottomRightIcon.getTextName()) || og.mCoverExtInfo.mBottomRightIcon.mType == 4))) {
                                     i1 = 1;
                                  }
                               }
                            }
                            b = i1;
                            if (b) {
                               this.D.setMaxWidth(t0.h0);
                            }
                         }
                      }
                   }
                }
                this.D.setMaxWidth(a1.d(R.dimen.arg_RES_7f070298));
                o3.H(this.F, i);
                goto label_01a3 ;
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a37df);
       this.A = m1.f(p0, 0x7f0a454d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.r8("SEARCH_PLAY_STATE_PLAYER_VOLUME");
       this.u = this.r8("SEARCH_PLAY_LIVE_PLAY_MODULE");
       this.v = this.q8(SearchItem.class);
       this.w = this.r8("SEARCH_PLAY_PHOTO_WRAPPER");
       this.x = this.r8("SEARCH_PLAY_KBOX_FEED");
       this.y = this.r8("FRAGMENT");
       this.z = this.q8(KBoxItem.class);
       return;
    }
}
