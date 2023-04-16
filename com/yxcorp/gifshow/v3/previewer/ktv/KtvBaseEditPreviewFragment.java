package com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import ml8.d;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import lnc.a1;
import com.yxcorp.gifshow.v3.previewer.ktv.h;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.String;
import ooc.p0;
import k2b.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.content.Intent;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.customizer.viewbinder.DefaultVideoFragmentV3ViewBinder;
import c35.c;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$c;
import ekd.j0;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import java.util.ArrayList;
import lnc.x$c;
import mwc.h;
import java.lang.Runnable;
import mwc.g;
import mwc.b;
import java.util.List;
import lnc.x;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import k2b.u1;
import mwc.a;
import mwc.f;
import mwc.i;
import com.kuaishou.viewbinder.IViewBinder;
import um6.e;
import mwc.p;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.previewer.ktv.u;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import ekd.m1;
import android.widget.SeekBar;
import com.kuaishou.edit.draft.Karaoke;
import z30.y0;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import android.widget.Button;
import android.widget.ImageView;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import android.content.Context;
import java.lang.Number;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import ekd.d0;
import android.text.SpannableString;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.utility.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.v3.previewer.ktv.p$a;
import brd.t;
import eoc.e;
import brd.z;
import mwc.r;
import com.yxcorp.gifshow.v3.previewer.ktv.g;
import erd.g;
import crd.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import mwc.m;
import java.util.Map;
import android.content.res.ColorStateList;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import mwc.c;
import erd.a;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.previewer.ktv.c;
import android.os.Bundle;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import nwc.c;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.ktv.a;
import t36.f$a;
import t45.d;
import mwc.e;
import erd.o;
import io.reactivex.android.schedulers.a;
import mwc.d;
import com.yxcorp.gifshow.v3.previewer.ktv.b;
import crd.a;
import com.yxcorp.gifshow.v3.previewer.ktv.l;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$b;
import android.content.DialogInterface$OnDismissListener;
import jz6.a;
import lnc.i3;
import android.view.View$OnClickListener;

public abstract class KtvBaseEditPreviewFragment extends VideoEditPreviewV3Fragment implements d	// class@0015aa
{
    public KtvInfo Q1;
    public long R1;
    public View S1;
    public SeekBar T1;
    public Button U1;
    public ImageView V1;
    public Button W1;
    public View X1;
    public int Y1;
    public h Z1;
    public View a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public View$OnClickListener e2;
    public static final int f2;
    public static final int g2;

    static {
       KtvBaseEditPreviewFragment.f2 = a1.e(60.00f);
       KtvBaseEditPreviewFragment.g2 = a1.e(42.00f);
    }
    public void KtvBaseEditPreviewFragment(){
       super();
       this.R1 = 0;
       this.Z1 = new h();
       this.d2 = false;
       this.e2 = new KtvBaseEditPreviewFragment$a(this);
    }
    public static void oi(KtvBaseEditPreviewFragment p0){
       p0.si(true);
       p0.c(p0.Q1, "one_more_karaoke");
    }
    public static void pi(KtvBaseEditPreviewFragment p0){
       p0.si(false);
       s.p(404, "ktv_edit_quit_cancel");
    }
    public static void qi(KtvBaseEditPreviewFragment p0){
       p0.si(true);
       s.p(404, "ktv_edit_quit_cancel");
    }
    public static void ri(KtvBaseEditPreviewFragment p0){
       p0.si(false);
       p0.c(p0.Q1, "exit_select_karaoke");
    }
    private void si(boolean p0){
       if (PatchProxy.isSupport(KtvBaseEditPreviewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvBaseEditPreviewFragment.class, "24")) {
          return;
       }
       KtvBaseEditPreviewFragment tZ1 = this.Z1;
       Objects.requireNonNull(tZ1);
       if (!PatchProxy.applyVoid(null, tZ1, h.class, "4")) {
          h f = tZ1.f;
          if (f != null) {
             f.pause();
          }
       }
       this.Dh();
       EditorActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }else {
          Intent intent = new Intent();
          intent.putExtra("ktv_result_retry", p0);
          activity.setResult(0, intent);
          activity.finish();
          return;
       }
    }
    public void Ah(LayoutInflater p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvBaseEditPreviewFragment.class, "2")) {
          return;
       }
       ViewGroup viewGroup = p1.findViewById(R.id.extra_component_container);
       if (viewGroup.findViewById(0x7f0a1642) == null) {
          this.a2 = a.g(p0, 0x7f0d070f, viewGroup, true);
       }
       return;
    }
    public AbsVideoFragmentV3ViewBinder Hh(int p0){
       if (PatchProxy.isSupport(KtvBaseEditPreviewFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KtvBaseEditPreviewFragment.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DefaultVideoFragmentV3ViewBinder(this);
    }
    public Object Ph(){
       Object obj = PatchProxy.apply(null, this, KtvBaseEditPreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KtvBaseEditPreviewFragment$c(this.Q1);
    }
    public boolean T4(boolean p0){
       String obj;
       VideoEditPreviewV3Fragment videoEditPre;
       KtvBaseEditPreviewFragment tQ1;
       ArrayList uArrayList;
       if (PatchProxy.isSupport(KtvBaseEditPreviewFragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, KtvBaseEditPreviewFragment.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.isAdded() || this.Qh() == null) {
          return false;
       }else {
          obj = j0.f(this.Qh(), "SOURCE");
          if (("edit").equals(obj) || ("album_draft").equals(obj)) {
             return super.T4(p0);
          }else if(this.getActivity() != null && (this.getActivity() instanceof EditorActivity && (this.getActivity().N3() != null && this.getActivity().N3().i != null))){
             videoEditPre = 1;
          }else {
             videoEditPre = null;
          }
          if (!videoEditPre) {
             return false;
          }else {
             int i = 0x7f081b6b;
             int i1 = 0x7f081b7e;
             int i2 = 0x7f081b66;
             if (this.V == null) {
                tQ1 = this.Q1;
                if (tQ1 == null || tQ1.getKaraokeType() != 1) {
                   uArrayList = new ArrayList();
                   uArrayList.add(new x$c(i1, a1.p(R.string.arg_RES_7f101b13), new h(this), true));
                   uArrayList.add(new x$c(i, a1.p(R.string.arg_RES_7f101b12), new g(this), false));
                   if (this.M != null) {
                      uArrayList.add(new x$c(i2, a1.p(R.string.arg_RES_7f1047a2), new b(this), false));
                   }
                   x.g(this.getActivity(), this.getActivity().N3().i, uArrayList, false, null);
                   if (this.M != null) {
                      x.f();
                   }
                   return true;
                }
             }
             if (!PatchProxy.applyVoid(null, this, KtvBaseEditPreviewFragment.class, "18")) {
                tQ1 = this.Q1;
                if (tQ1 != null) {
                   KtvInfo mMusic = tQ1.mMusic;
                   if (!PatchProxy.applyVoidOneRefs(mMusic, null, p0.class, "4")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "KARAOKE_POPUP";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.tagPackage = p0.a(mMusic);
                      u1.u0(4, uElementPack, uContentPack);
                   }
                }
                uArrayList = new ArrayList();
                uArrayList.add(new x$c(i2, a1.p(R.string.arg_RES_7f101b16), new a(this), true));
                uArrayList.add(new x$c(i1, a1.p(R.string.arg_RES_7f101b18), new f(this), false));
                uArrayList.add(new x$c(i, a1.p(R.string.arg_RES_7f101b10), new i(this), false));
                x.g(this.getActivity(), this.getActivity().N3().i, uArrayList, false, null);
             }
             return true;
          }
       }
    }
    public IViewBinder V5(int p0){
       return this.Hh(p0);
    }
    public void Zh(){
       if (PatchProxy.applyVoid(null, this, KtvBaseEditPreviewFragment.class, "5")) {
          return;
       }
       super.Zh();
       KtvInfo ktvInfo = KtvInfo.fromIntent(this.Qh());
       this.Q1 = ktvInfo;
       if (ktvInfo != null) {
          ktvInfo.mMusic = e.c(this.Qh());
          p.a().h(this.Q1);
          this.Q1.mOutputVideoPath = DraftFileManager.E().J(this.M.v()).getAbsolutePath();
       }else {
          this.Q1 = u.N(this.M);
          this.c2 = true;
       }
       return;
    }
    public boolean ai(){
       return true;
    }
    public void ci(){
       if (PatchProxy.applyVoid(null, this, KtvBaseEditPreviewFragment.class, "17")) {
          return;
       }
       super.ci();
       this.S1.setVisibility(0);
       return;
    }
    public void di(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvBaseEditPreviewFragment.class, "16")) {
          return;
       }
       super.di(p0);
       if (p0 != EditorItemFunc.KTV && (p0 != EditorItemFunc.FILTER && p0 != EditorItemFunc.PRETTIFY)) {
          this.S1.setVisibility(8);
       }
    label_0021 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvBaseEditPreviewFragment.class, "1")) {
          return;
       }
       this.T1 = m1.f(p0, 0x7f0a311c);
       this.S1 = m1.f(p0, 0x7f0a1643);
       return;
    }
    public void fi(){
       ConstraintLayout obj;
       int i;
       int i1;
       KtvInfo mDenoise;
       KtvInfo mRealOffset;
       KtvBaseEditPreviewFragment z1;
       SpannableString obj1;
       Drawable uDrawable;
       boolean b1;
       long l = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, l, KtvBaseEditPreviewFragment.class, "6")) {
          return;
       }
       super.fi();
       l.R1 = DraftUtils.u(l.M.v().getKaraoke());
       l.U1 = this.getActivity().findViewById(0x7f0a1672);
       l.V1 = this.getActivity().findViewById(0x7f0a1664);
       l.W1 = this.getActivity().findViewById(0x7f0a3074);
       l.X1 = this.getActivity().findViewById(0x7f0a1666);
       KtvBaseEditPreviewFragment q1 = l.Q1;
       KtvInfo mKtvScoreInf = q1.mKtvScoreInfo;
       KtvInfo ktvInfo = 8;
       KtvInfo ktvInfo1 = null;
       if (mKtvScoreInf != null && (q1.mSingDuration >= 0x3a98 && mKtvScoreInf.mLevel != null)) {
          q1.mMinEditCropDuration = 0x3a98;
          String str = "A";
          String str1 = "S";
          if (l.c2 == null && !PatchProxy.applyVoid(objArray, l, KtvBaseEditPreviewFragment.class, "9")) {
             q1 = l.Q1;
             if (q1 != null) {
                KtvInfo mKtvScoreInf1 = q1.mKtvScoreInfo;
                if (mKtvScoreInf1 != null) {
                   KaraokeScoreInfo mLevel2 = mKtvScoreInf1.mLevel;
                   if (mLevel2 != null) {
                      Object obj3 = PatchProxy.applyOneRefs(mLevel2, l, KtvBaseEditPreviewFragment.class, "10");
                      if (obj3 != patchProxyRe) {
                         b1 = obj3.booleanValue();
                      }else if(!mLevel2.equals("SSS") && (!mLevel2.equals("SS") && (mLevel2.equals(str1) || mLevel2.equals(str)))){
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                      b1 = (b1 && l.Q1.mChorusMode == null)? true: false;
                      mKtvScoreInf1.mShouldDisPlay = b1;
                   }
                }
             }
          }
          if (l.c2 == null) {
             q1 = l.Q1;
             if (q1.mScoreViewClosed == null && q1.mFromAddMv == null) {
                l.ui(Boolean.TRUE, this.getContext());
             label_00ef :
                obj = PatchProxy.apply(objArray, l, KtvBaseEditPreviewFragment.class, "11");
                if (obj != patchProxyRe) {
                   i = obj.intValue();
                }else {
                   i1 = View$MeasureSpec.makeMeasureSpec(ktvInfo1, ktvInfo1);
                   mDenoise = 2656;
                   mRealOffset = 83;
                   if (l.W1 != null) {
                      KaraokeScoreInfo mLevel = l.Q1.mKtvScoreInfo.mLevel;
                      if (!PatchProxy.applyVoidOneRefs(mLevel, l, KtvBaseEditPreviewFragment.class, "13")) {
                         l.U1.setVisibility(ktvInfo);
                         l.V1.setVisibility(ktvInfo1);
                         obj1 = PatchProxy.applyOneRefs(mLevel, l, KtvBaseEditPreviewFragment.class, "15");
                         if (obj1 != patchProxyRe) {
                            i = obj1.intValue();
                         }else {
                            Objects.requireNonNull(mLevel);
                            i = mLevel.hashCode();
                            if (i != mRealOffset) {
                               if (i != mDenoise) {
                                  if (i != 0x141f3) {
                                     switch (i){
                                         case 'A':
                                           if (mLevel.equals(str)) {
                                              z1 = 0;
                                           }
                                           break;
                                         case 'B':
                                           if (mLevel.equals("B")) {
                                              z1 = 1;
                                           }
                                           break;
                                         case 'C':
                                           if (mLevel.equals("C")) {
                                              z1 = 2;
                                           }
                                           break;
                                         default:
                                     }
                                  label_0189 :
                                     if (z1) {
                                        if (z1 != 1) {
                                           if (z1 != 2) {
                                              if (z1 != 3) {
                                                 if (z1 != 4) {
                                                    if (z1 != 5) {
                                                       i = 0x7f081cbe;
                                                    }else {
                                                       i = 0x7f081cc1;
                                                    }
                                                 }else {
                                                    i = 0x7f081cc0;
                                                 }
                                              }else {
                                                 i = 0x7f081cbf;
                                              }
                                           }else {
                                              i = 0x7f081cbd;
                                           }
                                        }else {
                                           i = 0x7f081cbc;
                                        }
                                     }else {
                                        i = 0x7f081cbb;
                                     }
                                  }else if(!mLevel.equals("SSS")){
                                     z1 = 5;
                                     goto label_0189 ;
                                  }
                               }else if(!mLevel.equals("SS")){
                                  z1 = 4;
                                  goto label_0189 ;
                               }
                            }else if(!mLevel.equals(str1)){
                               z1 = 3;
                               goto label_0189 ;
                            }
                            z1 = -1;
                            goto label_0189 ;
                         }
                         l.V1.setImageDrawable(a1.f(i));
                      }
                      l.W1.measure(i1, i1);
                      i = l.W1.getMeasuredWidth();
                   }else {
                      l.U1.setTypeface(d0.a("alte-din.ttf", this.getContext()));
                      obj1 = new SpannableString(l.Q1.mKtvScoreInfo.mTotalScore+" "+a1.p(0x7f104451));
                      obj1.setSpan(new RelativeSizeSpan(0x3f666666), (obj1.length() - 1), obj1.length(), 33);
                      obj1.setSpan(new StyleSpan(1), (obj1.length() - 1), obj1.length(), 33);
                      l.U1.setText(obj1);
                      KaraokeScoreInfo mLevel1 = l.Q1.mKtvScoreInfo.mLevel;
                      float f = 12.00f;
                      if (!PatchProxy.applyVoidOneRefs(mLevel1, l, KtvBaseEditPreviewFragment.class, "12")) {
                         Object obj2 = PatchProxy.applyOneRefs(mLevel1, l, KtvBaseEditPreviewFragment.class, "14");
                         if (obj2 != patchProxyRe) {
                            i = obj2.intValue();
                         }else {
                            Objects.requireNonNull(mLevel1);
                            i = mLevel1.hashCode();
                            if (i != mRealOffset) {
                               if (i != 2656) {
                                  if (i != 0x141f3) {
                                     switch (i){
                                         case 'A':
                                           if (mLevel1.equals(str)) {
                                              uDrawable = 0;
                                           }
                                           break;
                                         case 'B':
                                           if (mLevel1.equals("B")) {
                                              uDrawable = 1;
                                           }
                                           break;
                                         case 'C':
                                           if (mLevel1.equals("C")) {
                                              uDrawable = 2;
                                           }
                                           break;
                                         default:
                                     }
                                  label_029f :
                                     if (uDrawable) {
                                        if (uDrawable != 1) {
                                           if (uDrawable != 2) {
                                              if (uDrawable != 3) {
                                                 if (uDrawable != 4) {
                                                    if (uDrawable != 5) {
                                                       i = 0x7f081038;
                                                    }else {
                                                       i = 0x7f08103b;
                                                    }
                                                 }else {
                                                    i = 0x7f08103a;
                                                 }
                                              }else {
                                                 i = 0x7f081039;
                                              }
                                           }else {
                                              i = 0x7f081037;
                                           }
                                        }else {
                                           i = 0x7f081036;
                                        }
                                     }else {
                                        i = 0x7f081035;
                                     }
                                  }else if(!mLevel1.equals("SSS")){
                                     uDrawable = 5;
                                     goto label_029f ;
                                  }
                               }else if(!mLevel1.equals("SS")){
                                  uDrawable = 4;
                                  goto label_029f ;
                               }
                            }else if(!mLevel1.equals(str1)){
                               uDrawable = 3;
                               goto label_029f ;
                            }
                            uDrawable = -1;
                            goto label_029f ;
                         }
                         uDrawable = a1.f(i);
                         int i2 = a1.e(16.00f);
                         int i3 = a1.e(f);
                         if (mLevel1.equals("SS")) {
                            i3 = a1.e(18.00f);
                         }else if(mLevel1.equals("SSS")){
                            i3 = a1.e(26.00f);
                         }
                         uDrawable.setBounds(0, 0, i3, i2);
                         l.U1.setCompoundDrawables(uDrawable, null, null, null);
                         l.U1.setCompoundDrawablePadding(a1.e(4.00f));
                      }
                      l.U1.measure(i1, i1);
                      i = l.U1.getMeasuredWidth() + a1.e(f);
                   }
                }
                l.Y1 = i;
             }
          }
          this.vi();
          goto label_00ef ;
       }else {
          q1.mMinEditCropDuration = 3000;
          l.U1.setVisibility(8);
       }
       i1 = KtvBaseEditPreviewFragment.f2;
       if (l.Y1 < i1) {
          l.Y1 = i1;
       }
       SizeAdjustableTextView sizeAdjustab = this.getActivity().findViewById(R.id.ktv_title_tv);
       sizeAdjustab.setVisibility(0);
       sizeAdjustab.setTextColor(-1);
       sizeAdjustab.setSingleLine(true);
       sizeAdjustab.setTextSizeAdjustable(0);
       sizeAdjustab.setTextSize(18.00f);
       sizeAdjustab.setText(l.Q1.mMusic.getDisplayName());
       sizeAdjustab.setEllipsize(TextUtils$TruncateAt.END);
       this.getActivity().findViewById(R.id.title_tv).setVisibility(8);
       obj = this.getActivity().findViewById(R.id.ktv_new_title_info_layout);
       ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
       layoutParams.width = (n.k(this.getActivity()) / 3) + KtvBaseEditPreviewFragment.g2;
       obj.setLayoutParams(layoutParams);
       obj.setVisibility(0);
       p op = p.a();
       q1 = l.Q1;
       Objects.requireNonNull(op);
       KtvInfo mRecordVolum = q1.mRecordVolume;
       op.a = mRecordVolum;
       mKtvScoreInf = q1.mAccompanyVolume;
       op.b = mKtvScoreInf;
       mDenoise = q1.mDenoise;
       op.c = mDenoise;
       KtvInfo mEffectId = q1.mEffectId;
       op.d = mEffectId;
       ktvInfo = q1.mChangeId;
       op.e = ktvInfo;
       mRealOffset = q1.mRealOffset;
       op.f = mRealOffset;
       KtvInfo mTimbreOffse = q1.mTimbreOffset;
       op.h = mTimbreOffse;
       ktvInfo1 = q1.mCropBegin;
       op.i = ktvInfo1;
       KtvInfo mCropEnd = q1.mCropEnd;
       op.j = mCropEnd;
       op.k = mRecordVolum;
       op.l = mKtvScoreInf;
       op.m = mDenoise;
       op.n = mEffectId;
       op.o = ktvInfo;
       op.p = mRealOffset;
       op.r = mTimbreOffse;
       op.s = ktvInfo1;
       op.t = mCropEnd;
       op.g = mRealOffset - q1.mRecordDelay;
       if (!PatchProxy.applyVoid(null, l, KtvBaseEditPreviewFragment.class, "8")) {
          z1 = l.Z1;
          KtvBaseEditPreviewFragment a2 = l.a2;
          VideoEditPreviewV3Fragment g = l.G;
          boolean b = (l.Q1.getKaraokeType() == 1)? true: false;
          Objects.requireNonNull(z1);
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(a2, g, Boolean.valueOf(b), z1, h.class, "2")) {
             z1.i = b;
             z1.f = g;
             if (a2 != null) {
                z1.doBindView(a2);
                z1.f.setPreviewEventListener("ktv_listener", z1.k);
                z1.a();
                z1.e.setOnSeekBarChangeListener(z1.l);
                z1.j = RxBus.f.f(p$a.class).observeOn(e.c).subscribe(new r(z1), g.b);
             }
          }
       }
    label_044c :
       p.r(l.G.getVideoProject(), l.Q1);
       l.G.sendChangeToPlayer(false);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvBaseEditPreviewFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, KtvBaseEditPreviewFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(KtvBaseEditPreviewFragment.class, new m());
       }else {
          obj.put(KtvBaseEditPreviewFragment.class, null);
       }
       return obj;
    }
    public void gi(){
       if (PatchProxy.applyVoid(null, this, KtvBaseEditPreviewFragment.class, "28")) {
          return;
       }
       super.gi();
       Button uButton = this.getActivity().findViewById(R.id.title_root).findViewById(R.id.right_btn);
       uButton.setTextColor(a1.b(R.color.arg_RES_7f060a06));
       uButton.setActivated(true);
       return;
    }
    public void ii(){
       if (PatchProxy.applyVoid(null, this, KtvBaseEditPreviewFragment.class, "25")) {
          return;
       }
       this.R1 = u.O(this.M, this.Q1, this.R1);
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KtvBaseEditPreviewFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KtvBaseEditPreviewFragment.class, "29")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 530) {
          if (p1 == -1) {
             if (this.V == null && (this.Q1.getKaraokeType() != 1 && this.d2 == null)) {
                return;
             }else if(j0.a(p2, "ktv_share_guide_private", false)){
                p0.mKtvVisibility = PhotoVisibility.PRIVATE;
             }else {
                p0.mKtvVisibility = PhotoVisibility.FRIENDS;
             }
             this.Qd(false);
          }else if(!p1){
             DraftFileManager.E().p(this.M).doAfterTerminate(new c(this)).subscribe(Functions.d(), c.b);
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvBaseEditPreviewFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       KtvBaseEditPreviewFragment tZ1 = this.Z1;
       if (tZ1 != null) {
          Objects.requireNonNull(tZ1);
          if (!PatchProxy.applyVoid(null, tZ1, h.class, "5")) {
             h f = tZ1.f;
             if (f != null) {
                f.setPreviewEventListener("ktv_listener", null);
             }
             h j = tZ1.j;
             if (j != null) {
                j.dispose();
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvBaseEditPreviewFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.T1.setSplitTrack(false);
       ViewGroup$MarginLayoutParams layoutParams = this.S1.getLayoutParams();
       float f = 58.00f;
       layoutParams.topMargin = (g.o())? a1.e(f) + n.A(this.getActivity()): a1.e(f);
       this.S1.setLayoutParams(layoutParams);
       return;
    }
    public final void ti(boolean p0){
       t ot;
       if (PatchProxy.isSupport(KtvBaseEditPreviewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvBaseEditPreviewFragment.class, "19")) {
          return;
       }
       EditorActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
       boolean b = false;
       uAttrAnimPro.setCancelable(b);
       uAttrAnimPro.show(activity.getSupportFragmentManager(), "VideoEditBack");
       boolean b1 = true;
       if (p0) {
          p.o(this.M, this.getActivity(), this.Q1, b);
          this.d2 = b1;
       }else {
          this.d2 = b;
       }
       if (this.V != null || (this.Q1.getKaraokeType() != b1 || !DraftUtils.b0(this.M))) {
          ot = t.just(Boolean.TRUE);
       }else {
          f.p0(this.R, c.class).s0(a.a);
          ot = this.li().observeOn(d.a);
       }
       this.u1.c(ot.flatMap(new e(this)).observeOn(a.c()).doAfterTerminate(new d(this, uAttrAnimPro)).subscribe(Functions.d(), b.b));
       return;
    }
    public void ui(Boolean p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvBaseEditPreviewFragment.class, "22")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       l ol = new l(this.Q1, p0.booleanValue(), p1, this.V1);
       ol.setOnDismissListener(new KtvBaseEditPreviewFragment$b(this));
       ol.show();
       return;
    }
    public void vi(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KtvBaseEditPreviewFragment.class, "23")) {
          return;
       }
       this.b2 = true;
       this.X1.setVisibility(0);
       KtvBaseEditPreviewFragment tQ1 = this.Q1;
       if (tQ1 != null) {
          KtvInfo mKtvScoreInf = tQ1.mKtvScoreInfo;
          if (mKtvScoreInf != null) {
             KaraokeScoreInfo mLevel = mKtvScoreInf.mLevel;
             if (mLevel != null) {
                String str = this.Q1.mKtvScoreInfo.mTotalScore+"";
                if (!PatchProxy.applyVoidTwoRefs(mLevel, str, objArray, p0.class, "1")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "SCORER_CARD";
                   i3 oi3 = i3.f();
                   oi3.d("level", mLevel);
                   oi3.d("grade", str);
                   uElementPack.params = oi3.e();
                   u1.u0(6, uElementPack, new ClientContent$ContentPackage());
                }
             }
          }
       }
       this.V1.setVisibility(0);
       this.U1.setVisibility(8);
       this.V1.setOnClickListener(this.e2);
       return;
    }
}
