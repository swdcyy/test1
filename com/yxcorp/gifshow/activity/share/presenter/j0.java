package com.yxcorp.gifshow.activity.share.presenter.j0;
import xw8.p0$c;
import xw8.p0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import pq.a;
import pq.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xw8.p0;
import y26.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.i1;
import com.yxcorp.gifshow.activity.share.presenter.i0;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.activity.share.presenter.j0$a;
import android.text.TextWatcher;
import android.text.InputFilter;
import zw8.e1;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.post.topic.TagSourceUtils;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.music.Music;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import ow8.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import lq.i;
import lq.e;
import fx8.s;
import zw8.g1;
import android.view.View$OnTouchListener;
import zw8.h1;
import android.widget.ScrollView;
import java.util.Set;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import lnc.a1;
import java.lang.Integer;
import android.widget.TextView;
import zw8.j1;
import zw8.d1;
import zw8.k1;
import android.widget.TextView$OnEditorActionListener;
import java.lang.Number;
import java.lang.Boolean;
import android.content.Context;
import ync.a;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.widget.m0;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import java.util.ArrayList;
import android.text.Editable;
import java.util.Iterator;
import com.kuaishou.edit.draft.CaptionTopic;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import zw8.f1;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import vw8.a;
import qr4.i;
import qr4.m$k0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bba.b;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.util.SameFrameExt$b;
import com.yxcorp.gifshow.util.SameFrameExt;
import android.content.Intent;

public class j0 extends PresenterV2 implements p0$c, p0$a	// class@0013f2
{
    public List A;
    public a B;
    public VideoContext C;
    public b D;
    public c E;
    public boolean F;
    public String G;
    public String H;
    public QPhoto I;
    public PublishPageSetting J;
    public int K;
    public SameFrameShareConfig L;
    public ShareEditorTextDisplayHandler M;
    public ShareEditorTextDisplayHandler N;
    public String O;
    public int P;
    public int Q;
    public EmojiEditText p;
    public EmojiEditText q;
    public EmojiEditText r;
    public TextView s;
    public View t;
    public ScrollViewEx u;
    public FrameLayout v;
    public ViewGroup w;
    public ConstraintLayout x;
    public p0 y;
    public GifshowActivity z;
    public static int R;

    static {
       j0.R = a.t().a("postCaptionTitleMaxLength", 20);
    }
    public void j0(){
       super();
       this.B = a.b.a();
       this.K = 2000;
       this.O = null;
    }
    public void E8(){
       j0 tL;
       Object[] objArray1;
       String str;
       String str2;
       int i;
       Object[] objArray4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "5")) {
          return;
       }
       this.X7(this.y.e.a.compose(c.c(this.z.m(), ActivityEvent.DESTROY)).subscribe(new i1(this), i0.b));
       PublishPageSetting mMaxTextWord = this.J.mMaxTextWordNum;
       if (mMaxTextWord <= null) {
          mMaxTextWord = 2000;
       }
       this.K = mMaxTextWord;
       boolean b = false;
       this.p.setAllowAutoAdjustHintSize(b);
       if (!TextUtils.x(this.J.mDescriptionInputPlaceholderTip)) {
          this.p.setHint(this.J.mDescriptionInputPlaceholderTip);
       }
       ShareEditorTextDisplayHandler shareEditorT = new ShareEditorTextDisplayHandler(this.q);
       this.N = shareEditorT;
       boolean b1 = true;
       shareEditorT.L = b1;
       shareEditorT.p(b1);
       this.N.r(b);
       shareEditorT = new ShareEditorTextDisplayHandler(this.p);
       this.M = shareEditorT;
       shareEditorT.p(b1);
       this.M.r(b);
       this.R8(this.q, b, this.N);
       this.R8(this.p, b1, this.M);
       this.p.addTextChangedListener(new j0$a(this));
       InputFilter[] inputFilterA = new InputFilter[b1];
       inputFilterA[b] = new e1(this);
       this.p.setFilters(inputFilterA);
       if (!PatchProxy.applyVoid(objArray, this, oj0, "7")) {
          str = PatchProxy.apply(objArray, this, oj0, "19");
          if (str != patchProxyRe) {
          }else {
             tL = this.D;
             if (tL != null) {
                if (this.F == null || tL.v() == null) {
                   objArray1 = new Object[b];
                   a.b().s("share_draft_tag", "getDraftCaption caption title draft is null", objArray1);
                }else {
                   objArray4 = this.D.v().getCaption();
                   Object[] objArray5 = new Object[b];
                   a.b().s("share_draft_tag", "getDraftCaption: "+objArray4, objArray5);
                }
             }
             objArray4 = objArray;
          }
          String str1 = "UNKNOWN";
          if (TextUtils.x(str)) {
             this.B = TagSourceUtils.b.h();
             if (q.f(this.A)) {
                tL = this.C;
                if (tL != null && (tL.B() != null && !TextUtils.x(this.C.B().mName))) {
                   str2 = "66ÁåÉù";
                   if ((this.C.B().mName).startsWith(str2)) {
                      this.A.add(str2);
                   }
                }
             }
             if (!q.f(this.A)) {
                str = c.l(this.C, this.A, this.E);
             }else if(this.I != null){
                this.p.setCursorVisible(b);
                str = r1.r0(this.I.mEntity);
                if (!("...").equals(str)) {
                label_016e :
                   String str3 = " ";
                   if (!TextUtils.x(this.H)) {
                      str = this.H+str3+str;
                   }
                   str = c.c(str);
                   if (i.h()) {
                      str2 = i.m().k().j();
                      String str4 = PatchProxy.applyTwoRefs(str, str2, objArray, c.class, "13");
                      if (str4 != patchProxyRe) {
                      label_01ae :
                         str = str4;
                      }else if(TextUtils.x(str2)){
                         str4 = "#"+str2;
                         if (TextUtils.x(str)) {
                            goto label_01ae ;
                         }else {
                            str = str+str3+str4;
                         }
                      }
                      this.B.e(str2, "MAGIC_FACE", objArray, b);
                   }
                   if (!TextUtils.x(str)) {
                      str2 = PatchProxy.applyOneRefs(str, objArray, s.class, "11");
                      if (str2 != patchProxyRe) {
                      }else {
                         str2 = "";
                         String[] stringArray = str.split(str3);
                         int len = stringArray.length;
                         i = 0;
                         while (i < len) {
                            object oobject = stringArray[i];
                            if (!TextUtils.x(oobject) && !(str2).contains(oobject)) {
                               str2 = str2+oobject+str3;
                            }
                            i = i + 1;
                         }
                         str2 = str2;
                      }
                      this.B.a(str2, str1, objArray, b1);
                      this.p.setText(str2);
                      this.V8();
                      this.W8();
                   }
                }
             }
             str = "";
             goto label_016e ;
          }else {
             a uoa = PatchProxy.apply(objArray, this, oj0, "20");
             if (uoa != patchProxyRe) {
             }else {
                j0 tD = this.D;
                if (tD == null) {
                   uoa = a.b.a();
                }else if(this.F == null || tD.v() == null){
                   uoa = a.b.a();
                }else {
                   uoa = TagSourceUtils.b.l(this.D.v().getCaptionSourceJson());
                }
             }
             this.B = uoa;
             uoa.a(str, str1, objArray, b1);
             this.p.setText(str);
             this.V8();
             this.W8();
          }
       }
       this.p.setOnTouchListener(new g1(this));
       this.u.setOnTouchListener(new h1(this));
       this.y.q.add(this);
       this.y.s.add(this);
       tL = this.L;
       if (tL != null) {
          this.M.x(tL.mOriginSameFrameUserName);
          this.N.x(this.L.mOriginSameFrameUserName);
       }
       if (!PostExperimentUtils.d() || (!PatchProxy.applyVoid(objArray, this, oj0, "24") && (c.i(this.E, this.I) != Workspace$Type.ATLAS && (c.i(this.E, this.I) == Workspace$Type.SINGLE_PICTURE || c.i(this.E, this.I) == Workspace$Type.LONG_PICTURE)))) {
          this.r.setAllowAutoAdjustHintSize(b);
          objArray1 = new Object[b1];
          objArray1[b] = Integer.valueOf(a.t().a("postCaptionTitleMaxLength", 20));
          this.r.setHint(String.format(a1.p(R.string.arg_RES_7f1004d0), objArray1));
          this.s.setText(String.valueOf(j0.R));
          this.r.addTextChangedListener(new j1(this));
          InputFilter[] inputFilterA1 = new InputFilter[b1];
          inputFilterA1[b] = new d1(this);
          this.r.setFilters(inputFilterA1);
          this.r.setImeOptions(6);
          this.r.setOnEditorActionListener(new k1(this));
          if (!PatchProxy.applyVoid(objArray, this, oj0, "25")) {
             str = PatchProxy.apply(objArray, this, oj0, "21");
             if (str != patchProxyRe) {
             }else {
                tL = this.D;
                if (tL != null) {
                   if (this.F == null || tL.v() == null) {
                      Object[] objArray2 = new Object[b];
                      a.b().w("share_draft_tag", "getDraftCaptionTitle caption title draft is null", objArray2);
                   }else {
                      str = this.D.v().getCaptionTitle();
                      Object[] objArray3 = new Object[b];
                      a.b().w("share_draft_tag", "getDraftCaptiontitle: "+str, objArray3);
                   }
                }
                str = objArray;
             }
             Object[] obj = PatchProxy.apply(objArray, this, oj0, "27");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
                j0 tI = this.I;
                if (tI != null) {
                   objArray = tI.getCaptionTitle();
                }else {
                   obj = new Object[b];
                   a.b().w("share_draft_tag", "getReEditCaptionTitle  is null", obj);
                }
             }
             if (TextUtils.x(objArray)) {
                this.r.setText(str);
             }else {
                this.r.setText(objArray);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "18")) {
          return;
       }
       InputFilter[] inputFilterA = new InputFilter[0];
       this.p.setFilters(inputFilterA);
       return;
    }
    public int P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          c = (c && (c != 9 && (c != 10 && (c != 13 && (c < ' ' || (c > 0xd7ff && (c < 0xe000 || (c <= 0xfffd || (c >= 0x10000 && c <= 0x10ffff)))))))))? 1: 0;
          if (!c) {
             i2 = i2 + 1;
          }
          i1 = i1 + 1;
       }
       return i2;
    }
    public final void R8(EmojiEditText p0,boolean p1,KSTextDisplayHandler p2){
       Object obj1;
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, j0.class, "6")) {
          return;
       }
       p0.setKSTextDisplayHandler(p2);
       int i = a.c(this.z);
       int i1 = 0x7f062030;
       if (!p1) {
          i = a1.a(i1);
       }
       KSTextDisplayHandler kSTextDispla = p0.getKSTextDisplayHandler().o(15);
       kSTextDispla.s(i);
       kSTextDispla.q(i);
       Activity activity = this.getActivity();
       if (p1) {
          i1 = 0x7f060949;
       }
       Drawable uDrawable = j.n(activity, R.drawable.arg_RES_7f081a04, i1);
       Object obj = PatchProxy.applyOneRefs(uDrawable, kSTextDispla, KSTextDisplayHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          kSTextDispla = obj;
       }else {
          kSTextDispla.t.c = uDrawable;
       }
       Objects.requireNonNull(kSTextDispla);
       if (PatchProxy.isSupport(KSTextDisplayHandler.class)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), kSTextDispla, KSTextDisplayHandler.class, "3");
          if (obj1 != PatchProxyResult.class) {
             kSTextDispla = obj1;
          label_007d :
             kSTextDispla.w = c.a;
             return;
          }
       }
       obj1.e = i;
       goto label_007d ;
    }
    public void S8(String p0){
       Publish$b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "14")) {
          return;
       }
       int i = 0;
       String str = "share_draft_tag";
       if (this.D == null) {
          Object[] objArray = new Object[i];
          a.b().s(str, "updateCaption: publish draft is null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.b().s(str, "updateCaption "+p0, objArray1);
          TagSourceUtils b = TagSourceUtils.b;
          this.B.f(b.i(this.O, p0), "USER_INPUT", null, true);
          this.B.l(b.i(p0, this.O), "USER_INPUT");
          this.O = p0;
          if (TextUtils.x(p0)) {
             if (this.D.v() != null && !TextUtils.n(p0, this.D.v().getCaption())) {
                this.D.c0();
                uob = this.D.k();
                uob.copyOnWrite();
                uob.instance.clearCaption();
                uob = this.D.k();
                uob.copyOnWrite();
                uob.instance.clearCaptionSourceJson();
                this.D.f();
             }
          }else if(this.D.v() == null || !TextUtils.n(p0, this.D.v().getCaption())){
             this.D.c0();
             this.D.k().d(p0);
             uob = this.D.k();
             uob.copyOnWrite();
             uob.instance.setCaptionSourceJson(this.B.i());
             this.D.f();
          }
          return;
       }
    }
    public final void V8(){
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "9")) {
          return;
       }
       ArrayList uArrayList = this.p.getKSTextDisplayHandler().e();
       if (!q.f(uArrayList)) {
          String str = this.p.getText().toString();
          if (str.endsWith("#"+uArrayList.get((uArrayList.size() - 1)))) {
             str = str+" ";
          }
          Iterator obj = PatchProxy.apply(objArray, this, oj0, "22");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             oj0 = this.D;
             if (oj0 != null) {
                if (this.F == null || oj0.v() == null) {
                   Object[] objArray1 = new Object[0];
                   a.b().s("share_draft_tag", "getDraftCaptionTopic draft is null", objArray1);
                }else {
                   objArray = this.D.v().getCaptionTopicList();
                }
             }
          }
          if (objArray != null) {
             obj = objArray.iterator();
             while (obj.hasNext()) {
                CaptionTopic uCaptionTopi = obj.next();
                if (uCaptionTopi.getTopicType() == CaptionTopic$TopicType.FILM_CARD) {
                   this.M.t(uCaptionTopi.getTopicName(), 3);
                   this.N.t(uCaptionTopi.getTopicName(), 3);
                }
             }
          }
          this.p.setText(str);
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "8")) {
          return;
       }
       String str = TextUtils.G(this.p).toString();
       j0 tp = this.p;
       int i = (TextUtils.x(str))? 0: str.length();
       tp.setSelection(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "4")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0ca8);
       this.q = m1.f(p0, 0x7f0a0cb0);
       this.u = m1.f(p0, 0x7f0a374c);
       m1.a(p0, new f1(this), R.id.editor);
       this.r = m1.f(p0, 0x7f0a3f52);
       this.s = m1.f(p0, 0x7f0a3f60);
       this.v = m1.f(p0, 0x7f0a3f79);
       this.t = m1.f(p0, 0x7f0a3f4c);
       this.x = m1.f(p0, 0x7f0a31f3);
       this.w = m1.f(p0, 0x7f0a0ca7);
       return;
    }
    public void e1(UploadRequest$a p0){
       Object[] objArray;
       j0 oj0 = j0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj0, "11")) {
          return;
       }
       if (this.C != null) {
          a.z(this.C, this.p.getKSTextDisplayHandler().e());
       }
       j0 tM = this.M;
       if (tM != null) {
          p0.c(tM.v());
          p0.d(this.p.j());
       }else {
          p0.c(this.p.getText().toString());
          p0.d(this.p.j());
       }
       p0.N(this.B.i());
       if (this.r != null && !this.t.getVisibility()) {
          p0.e(this.r.getText().toString());
       }else if(this.r != null){
          if (!PatchProxy.applyVoid(null, this, oj0, "17")) {
             oj0 = this.C;
             int i = 0;
             if (oj0 == null) {
                objArray = new Object[i];
                a.b().w("share_draft_tag", "cleanCaptionTitleinPhotoMeta: videoContext is null", objArray);
             }else if(oj0.F() == null){
                objArray = new Object[i];
                a.b().w("share_draft_tag", "cleanCaptionTitleinPhotoMeta: photoMeta is null", objArray);
             }else {
                objArray = new Object[i];
                a.b().w("share_draft_tag", "cleanCaptionTitleinPhotoMeta ", objArray);
                this.C.F().b.R0 = "";
             }
          }
          this.r.setText("");
          p0.e("");
       }
       return;
    }
    public void j8(){
       j0 oj0 = j0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj0, "1")) {
          return;
       }
       this.y = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.z = this.r8("SHARE_ACTIVITY");
       this.A = this.r8("SHARE_TAG");
       this.C = this.t8("SHARE_VIDEO_CONTEXT");
       this.D = this.t8("PUBLISH");
       this.E = this.t8("WORKSPACE");
       this.F = this.r8("HAS_DRAFT_DATA").booleanValue();
       this.G = this.t8("SHARE_IMMUTABLE_CONTENT");
       this.H = i.g().getShareInitCaption().get();
       this.I = this.t8("SHARE_QPHOTO");
       this.J = this.r8("share_page_setting_kswtich");
       j0 tI = this.I;
       if (tI != null) {
          if (!PatchProxy.applyVoidOneRefs(tI, this, oj0, "2")) {
             SameFrameExt$b uob = SameFrameExt.d(tI.getCaption());
             if (uob != null) {
                Object[] objArray2 = new Object[0];
                a.b().w("ShareEditorInputPresenter", "restoreSameFrameShareConfigFromReEditQPhoto: sameFrameCaption="+uob, objArray2);
                if (!TextUtils.x(uob.a) && !TextUtils.x(uob.b)) {
                   SameFrameShareConfig sameFrameSha = new SameFrameShareConfig(uob.b, uob.a, true, false, 0);
                   this.L = objArray;
                }
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, oj0, "3") || !PostExperimentUtils.z1()){
          SameFrameShareConfig sameFrameSha1 = this.t8("SAME_FRAME_CONFIG");
          if (sameFrameSha1 == null || (!TextUtils.x(sameFrameSha1.mOriginSameFramePhotoId) && !TextUtils.x(sameFrameSha1.mOriginSameFrameUserName))) {
             this.L = sameFrameSha1;
          }
       }
       Object[] objArray1 = new Object[0];
       a.b().w("ShareEditorInputPresenter", "doInject\(\) mInitialCaption="+this.H, objArray1);
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, j0.class, "13")) {
          return;
       }
       this.p.requestFocus();
       return;
    }
}
