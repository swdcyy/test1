package com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import com.kuaishou.gifshow.kuaishan.ui.preview.f;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import r90.t;
import r90.r;
import com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import java.lang.String;
import android.graphics.drawable.ColorDrawable;
import k2b.e0;
import androidx.fragment.app.FragmentActivity;
import crd.a;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import android.content.Context;
import u80.i;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import bya.a;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$a;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextPaint;
import com.yxcorp.gifshow.widget.PlayerLayout;
import com.kuaishou.gifshow.kuaishan.widget.KSCollectAnimationView;
import android.widget.LinearLayout;
import r90.w;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.lang.Float;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$TemplateAuthor;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q90.v;
import t90.j;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import r90.y;
import t90.u;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import r90.v;
import android.view.TextureView;
import r90.u;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b$a;
import com.kuaishou.gifshow.kuaishan.ui.preview.d;
import r90.z;
import java.lang.System;
import org.json.JSONObject;
import java.lang.Throwable;
import w46.b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import r90.x;

public class c$b extends f	// class@001aeb
{
    public View A;
    public TextView B;
    public View C;
    public KwaiImageView D;
    public TextView E;
    public TextView F;
    public KSCollectAnimationView G;
    public TextView H;
    public KwaiImageView I;
    public View J;
    public LinearLayout K;
    public View L;
    public FragmentActivity M;
    public c$a N;
    public final KSLaunchParams O;
    public final t P;
    public final r Q;
    public final UITemplatePreviewItem R;
    public final String S;
    public final String T;
    public final String U;
    public final List U0;
    public final String V;
    public final float V0;
    public final KSFeedTemplateDetailInfo$TemplateTag W;
    public boolean W0;
    public final String X;
    public long X0;
    public final String Y;
    public boolean Y0;
    public final ColorDrawable Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public final e0 c1;
    public a d1;
    public TextView w;
    public TextView x;
    public KwaiLoadingView y;
    public View z;
    public static long e1 = 0xc8000;
    public static long f1;

    public void c$b(KSLaunchParams p0,t p1,r p2,UITemplatePreviewItem p3,int p4,String p5,String p6,ColorDrawable p7,float p8,e0 p9,FragmentActivity p10,a p11){
       int i = this;
       UITemplatePreviewItem uITemplatePr = p3;
       String str = p5;
       String str1 = p6;
       float f = p8;
       String str2 = (uITemplatePr.mVideoUrls.isEmpty())? "": uITemplatePr.mVideoUrls.get(0).getUrl();
       super(p4, str2, uITemplatePr.mCoverImageUrls.get(0).getUrl(), true, i.a());
       i.X0 = -1;
       i.Y0 = false;
       i.Z0 = false;
       i.a1 = false;
       i.b1 = false;
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewAdapter", "IjkPlayerPreviewItem\(\) called with: index = ["+p4+"], coverUrl = ["+uITemplatePr.mCoverImageUrls+"], templateId = ["+uITemplatePr.mTemplateId+"], tabId = ["+uITemplatePr.mGroupId+"], videoUrl = ["+uITemplatePr.mVideoUrls+"], numInfo = ["+str+"], tag = ["+uITemplatePr.mTag+"], whRatio = ["+f+"], durationInfo = ["+str1+"]", objArray);
       i.O = p0;
       i.Q = p2;
       i.P = p1;
       i.R = uITemplatePr;
       i.S = uITemplatePr.mTemplateId;
       i.T = uITemplatePr.mName;
       i.U = uITemplatePr.mGroupId;
       i.V = uITemplatePr.mGroupName;
       i.U0 = uITemplatePr.mCoverImageUrls;
       i.Z = p7;
       i.Y = str;
       i.X = str1;
       i.W = uITemplatePr.mTag;
       i.c1 = p9;
       i.V0 = f;
       i.M = p10;
       i.d1 = p11;
       return;
    }
    public UITemplatePreviewItem A(){
       return this.R;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "10")) {
          return;
       }
       c$b ty = this.y;
       if (ty != null) {
          ty.setVisibility(4);
          this.y.i();
       }
       return;
    }
    public boolean C(){
       UITemplatePreviewItem mDataSource = this.R.mDataSource;
       boolean b = false;
       if (mDataSource instanceof KSTemplateDetailInfo && mDataSource.mTemplateType == 12) {
          b = true;
       }
       return b;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSPreviewPlayer", "preloadPlayer: invoked with template: "+this.T, objArray);
       f th = this.h;
       if (th == null || !th.b()) {
          Object[] objArray1 = new Object[i];
          e.D().w("KSPreviewAdapter", "preloadPlayer: do preload: "+this.T, objArray1);
          this.j();
          this.a1 = true;
       }
       return;
    }
    public void E(c$a p0){
       this.N = p0;
    }
    public final void F(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "15")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          p0.setVisibility(0);
          p0.setText(p1);
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public void G(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       int i = 0;
       if (!c.o) {
          objArray = new Object[i];
          e.D().A("KSPreviewAdapter", "onPrepared\(\) mExtraAudioSourceReady is false", objArray);
          return;
       }else if(!this.isPrepared()){
          objArray = new Object[i];
          e.D().A("KSPreviewAdapter", "startPreview\(\) not prepared", objArray);
          return;
       }else if(this.isPlaying()){
          objArray = new Object[i];
          e.D().A("KSPreviewAdapter", "startPreview\(\) already in play", objArray);
          this.B();
          return;
       }else if(this.k != null){
          this.r();
       }
       this.W0 = true;
       this.B();
       return;
    }
    public void H(boolean p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewPlayer", "stopPlayer: invoked with template: "+this.T+", release: "+p0, objArray);
       if (p0) {
          this.c();
       }else {
          this.i();
          f th = this.h;
          if (th != null) {
             Objects.requireNonNull(th);
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(0), th, uoa, "10")) {
                uoa = th.a;
                if (uoa != null && uoa.isMediaPlayerValid()) {
                   th.a.seekTo((long)0);
                }
             }
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "9")) {
          return;
       }
       super.c();
       this.Y0 = false;
       this.Z0 = false;
       this.a1 = false;
       return;
    }
    public void d(View p0){
       String str3;
       c$b q;
       c$b r;
       Object[] objArray2;
       int i3;
       int b2;
       Object[] objArray3;
       View view = this;
       KwaiLoadingView obj = p0;
       c$b uob = c$b.class;
       if (PatchProxy.applyVoidOneRefs(obj, view, uob, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "KSPreviewAdapter";
       e.D().w(str, "bind: index="+view.b, objArray);
       view.g = obj;
       view.z = obj.findViewById(0x7f0a0bec);
       view.A = view.g.findViewById(0x7f0a0bf4);
       view.t = view.g.findViewById(0x7f0a31e5);
       this.m();
       view.w = view.g.findViewById(0x7f0a3d81);
       int i1 = 8;
       boolean b = true;
       if (TextUtils.x(view.Y)) {
          view.w.setVisibility(i1);
       }else {
          view.w.setVisibility(i);
          view.w.getPaint().setFakeBoldText(b);
          view.w.setText(view.Y);
       }
       view.v = view.g.findViewById(0x7f0a3d8c);
       obj = view.g.findViewById(R.id.preview_video_loading_bar);
       view.y = obj;
       String str1 = "";
       obj.setLoadingText(str1);
       int i2 = 4;
       view.y.setVisibility(i2);
       TextView textView = view.g.findViewById(R.id.template_duration);
       view.x = textView;
       textView.getPaint().setFakeBoldText(b);
       if (!TextUtils.x(view.X)) {
          view.x.setVisibility(i);
          view.x.setText(view.X);
          view.A.setVisibility(i);
       }else {
          view.x.setVisibility(i1);
          view.A.setVisibility(i1);
       }
       String str2 = "3";
       if (PatchProxy.applyVoid(null, view, uob, "13")) {
          str3 = str2;
       }else {
          TextView textView1 = view.g.findViewById(R.id.template_use_count);
          view.B = textView1;
          textView1.getPaint().setFakeBoldText(b);
          view.C = view.g.findViewById(0x7f0a3d72);
          view.D = view.g.findViewById(0x7f0a3d71);
          view.E = view.g.findViewById(0x7f0a3d7b);
          view.F = view.g.findViewById(0x7f0a3d9c);
          view.G = view.g.findViewById(0x7f0a3d79);
          view.H = view.g.findViewById(0x7f0a3d7a);
          view.I = view.g.findViewById(0x7f0a3d95);
          view.J = view.g.findViewById(0x7f0a3d94);
          view.K = view.g.findViewById(0x7f0a1687);
          view.L = view.g.findViewById(0x7f0a3d78);
          view.F.getPaint().setFakeBoldText(b);
          view.D.setOnClickListener(new w(view));
          View view1 = view.g.findViewById(R.id.preview_top_shadow);
          View view2 = view.g.findViewById(R.id.preview_bottom_shadow);
          c$b o = view.O;
          if (o != null && (o.getMediaSceneConfig() != null || view.O.getMediaSceneLaunchParams() != null)) {
             view2.setBackground(a1.f(R.drawable.arg_RES_7f0816eb));
          }
          o = view.P;
          if (o != null) {
             View view3 = view.g.findViewById(R.id.template_info_panel);
             f v1 = view.v;
             r = view.R;
             float f = (float)r.mHeight / (float)r.mWidth;
             t ot = t.class;
             if (PatchProxy.isSupport(ot)) {
                Object[] objArray1 = new Object[]{view3,v1,Float.valueOf(f),view1,view2};
                if (PatchProxy.applyVoid(objArray1, o, ot, str2)) {
                label_025d :
                   str3 = str2;
                }
             }
             a.p(view3, "templateInfoArea");
             a.p(view1, "topShadow");
             a.p(view2, "bottomShadow");
             b2 = (o.i - o.b <= 0)? o.h + o.g: o.h;
             str3 = str2;
             objArray3 = new Object[0];
             e.D().w(o.a, "adaptPagerItem\(\) displayRatio="+o.i+", actualBottomMargin="+o.h+", info bottom margin="+b2, objArray3);
             g.x(view3, -1, b2, true);
             if (v1 != null) {
                o.a(v1, f, view1, view2);
             }
          }else {
             goto label_025d ;
          }
          String str4 = null;
          if (view.R.mUseCount - str4 > 0) {
             view.F(view.B, TextUtils.N(view.R.mUseCount)+a1.p(R.string.arg_RES_7f10186d));
             view.z.setVisibility(0);
          }else {
             view.F(view.B, null);
             view.z.setVisibility(8);
          }
          q = view.R;
          UITemplatePreviewItem mAuthor = q.mAuthor;
          UITemplatePreviewItem mPlaceholder = q.mPlaceholderDrawable;
          if (!PatchProxy.applyVoidTwoRefs(mAuthor, mPlaceholder, view, uob, "16")) {
             if (mAuthor == null || TextUtils.x(mAuthor.mName)) {
                i1 = 8;
                view.D.setVisibility(i1);
                view.C.setVisibility(i1);
             }else {
                i = 0;
                view.D.setVisibility(i);
                view.C.setVisibility(i);
                int i4 = a1.d(R.dimen.arg_RES_7f0702fe);
                view.D.setPlaceHolderImage(mPlaceholder);
                view.D.R(mAuthor.mIconUrls, i4, i4, null, null);
             }
          }
          view.F(view.E, view.R.mDescription);
          view.F(view.F, view.T);
          this.z();
          if (!PatchProxy.applyVoid(null, view, uob, "14")) {
             mPlaceholder = view.R.mDataSource;
             if (mPlaceholder instanceof KSTemplateDetailInfo && view.M instanceof GifshowActivity) {
                objArray3 = new Object[0];
                e.D().w(str, "bindKSFriend friendCount "+mPlaceholder.mFriendUseCount, objArray3);
                v ov = new v();
                ov.b(view.g);
                ov.a(mPlaceholder, view.M, true);
                KSTemplateDetailInfo mFriendUseCo = mPlaceholder.mFriendUseCount;
                if (mFriendUseCo - str4 > 0) {
                   q = view.M;
                   j oj = j.class;
                   if (!PatchProxy.isSupport(oj) || (!PatchProxy.applyVoidTwoRefs(q, Long.valueOf(mFriendUseCo), null, oj, "35") && q != null)) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "FRIEND_USE";
                      i3 oi3 = i3.f();
                      oi3.c("friends_num", Long.valueOf(mFriendUseCo));
                      uElementPack.params = oi3.e();
                      objArray2 = null;
                      u1.C0(str1, q, 0, uElementPack, objArray2);
                   label_038b :
                      if (!PatchProxy.applyVoid(objArray2, view, uob, "19")) {
                         q = view.O;
                         if (q != null && (q.getMediaSceneConfig() != null || view.O.getMediaSceneLaunchParams() != null)) {
                            view.J.setVisibility(8);
                         }else {
                            i3 = 8;
                            if (!view.R.mDataSource instanceof KSTemplateDetailInfo) {
                               view.J.setVisibility(i3);
                            }else if(this.C()){
                               view.J.setVisibility(i3);
                            }else {
                               view.I.setImageDrawable(a1.f(R.drawable.arg_RES_7f081047));
                               view.I.setOnClickListener(new y(view, view.R.mDataSource));
                               t obj1 = PatchProxy.apply(null, null, u.class, "4");
                               if (obj1 != PatchProxyResult.class) {
                                  b2 = obj1.booleanValue();
                                  i1 = 0;
                               }else {
                                  i1 = false;
                                  b2 = a.t().d("disableKuaishanShare", i1);
                               }
                               if (b2) {
                                  view.J.setVisibility(8);
                               label_0411 :
                                  if (this.C()) {
                                     view.K.setVisibility(i1);
                                  }
                               }else {
                                  goto label_0411 ;
                               }
                            }
                         }
                      }
                      i1 = 0;
                      goto label_0411 ;
                   }
                }
             }
          }
          objArray2 = null;
          goto label_038b ;
       }
       KwaiImageView kwaiImageVie = view.g.findViewById(R.id.template_video_control);
       view.s = kwaiImageVie;
       if (kwaiImageVie != null) {
          kwaiImageVie.setOnClickListener(new v(view));
       }
       view.w(view.i, false);
       TextureView textureView = view.g.findViewById(R.id.texture_view);
       view.u = textureView;
       if (textureView != null) {
          textureView.setOnClickListener(new u(view));
       }
       view.l = new c$b$a(view);
       view.m = new d(view);
       view.p.add(new z(view));
       f v = view.v;
       if (v != null) {
          v.setRatio(view.V0);
       }
       if (view.k == null) {
          v = view.u;
          if (v != null) {
             v.setVisibility(4);
          }
       }
       this.x();
       view.b1 = true;
       q = view.Q;
       if (q != null) {
          f b1 = view.b;
          Objects.requireNonNull(q);
          r or = r.class;
          if (!PatchProxy.isSupport(or) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(b1), q, or, str3)) {
             objArray = new Object[0];
             e.D().w(q.b, "tryThisItemPreload: toPreloadItemPosition = "+b1, objArray);
             q.a(b1);
          }
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "5")) {
          return;
       }
       int i = 0;
       if (this.g != null) {
          f tt = this.t;
          if (tt != null) {
             tt.setPlaceHolderImage(this.Z);
             this.t.P(this.U0);
             this.t.setVisibility(i);
             return;
          }
       }
       Object[] objArray = new Object[i];
       e.D().s("KSPreviewAdapter", "showCover: is unbind ignore this", objArray);
       return;
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "20")) {
          return;
       }
       this.y();
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "8")) {
          return;
       }
       super.p();
       this.X0 = -1;
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "3")) {
          return;
       }
       if (!c.o) {
          Object[] objArray = new Object[0];
          e.D().A("KSPreviewAdapter", "onPrepared\(\) mExtraAudioSourceReady is false", objArray);
          return;
       }else {
          super.r();
          return;
       }
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "7")) {
          return;
       }
       this.k = true;
       f tu = this.u;
       if (tu != null) {
          tu.setVisibility(0);
       }
       c$b ty = this.y;
       if (ty != null && this.W0 == null) {
          ty.setVisibility(0);
          this.y.h();
          this.X0 = System.currentTimeMillis();
          this.z();
       }
       return;
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "4")) {
          return;
       }
       super.unbind();
       this.b1 = false;
       this.N = null;
       return;
    }
    public void y(){
       JSONObject jSONObject;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$b.class, "6")) {
          return;
       }
       String str = "KSPreviewAdapter";
       int i = 0;
       if (this.k == null) {
          objArray = new Object[i];
          e.D().w(str, "onClickPlayBtn: is not selected ignore this click", objArray);
          return;
       }else if(this.g == null){
          objArray = new Object[i];
          e.D().w(str, "onClickPlayBtn: is unbind ignore this", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().s(str, "onClickPlayBtn: ", objArray1);
          f th = this.h;
          if (th == null || !th.b()) {
             this.j();
          }
          th = this.h;
          if (th == null) {
             return;
          }else {
             c$b tc1 = this.c1;
             int i1 = 1;
             int i2 = th.c() ^ i1;
             c$b tS = this.S;
             c$b tT = this.T;
             c$b tU = this.U;
             c$b tV = this.V;
             f tb = this.b;
             j oj = j.class;
             if (PatchProxy.isSupport(oj)) {
                Object[] objArray2 = new Object[]{tc1,Boolean.valueOf(i2),tS,tT,tU,tV,Integer.valueOf(tb)};
                if (PatchProxy.applyVoid(objArray2, objArray, oj, "5")) {
                label_010e :
                   super.y();
                   return;
                }
             }
             Object[] objArray3 = new Object[i];
             e.D().s("KSLogger", "logClickTemplate\(\) called with: logPage = ["+tc1+"], play = ["+i2+"], templateId = ["+tS+"], templateName = ["+tT+"], groupId = ["+tU+"], index = ["+tb+"]", objArray3);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_KUAISHAN_TEMPLATE";
             try{
                jSONObject = new JSONObject();
                String str1 = (i2)? "resume": "pause";
                jSONObject.put("play_mode", str1);
             }catch(org.json.JSONException e0){
                e.D().e("KSLogger", "ksSelectPageClickLog: ", e0);
             }
             uElementPack.params = jSONObject.toString();
             u1.M("2014531", tc1, 1, uElementPack, j.a(tS, tT, tU, tV, tb), null);
             goto label_010e ;
          }
       }
    }
    public final void z(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "17")) {
          return;
       }
       c$b tO = this.O;
       if (tO != null && (tO.getMediaSceneConfig() != null || this.O.getMediaSceneLaunchParams() != null)) {
          return;
       }
       int i = 8;
       if (!this.R.mDataSource instanceof KSTemplateDetailInfo) {
          this.G.setVisibility(i);
          this.H.setVisibility(i);
          return;
       }else if(this.C()){
          this.G.setVisibility(i);
          this.H.setVisibility(i);
          this.L.setVisibility(i);
          return;
       }else {
          UITemplatePreviewItem mDataSource = this.R.mDataSource;
          this.L.setVisibility(0);
          this.G.setVisibility(0);
          this.H.setVisibility(0);
          this.G.j(2, mDataSource.mIsCollect);
          this.G.setOnClickListener(new x(this, mDataSource));
          return;
       }
    }
}
