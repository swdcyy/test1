package com.yxcorp.gifshow.activity.share.presenter.c2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicSearchV3Fragment;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicHistoryV3Fragment;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import xw8.p0;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import zw8.l4;
import zw8.k4;
import zw8.j4;
import com.yxcorp.gifshow.activity.share.topic.BaseShareTopicRecyclerFragment;
import zw8.i4;
import zw8.n4;
import java.util.Objects;
import com.yxcorp.gifshow.activity.share.presenter.c2$a;
import android.text.TextWatcher;
import android.widget.EditText;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.m4;
import com.yxcorp.gifshow.activity.share.presenter.b2;
import erd.g;
import crd.b;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import android.view.View;
import wkd.b;
import com.kuaishou.android.post.topic.d;
import com.kuaishou.android.post.topic.model.TopicItem;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.CaptionTopic$TopicFrom;
import com.yxcorp.gifshow.activity.share.presenter.c2$b;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import java.lang.Enum;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import com.kuaishou.edit.draft.CaptionTopic$b;
import com.kuaishou.edit.draft.CaptionTopic;
import com.google.protobuf.GeneratedMessageLite;
import fx8.s;
import com.kuaishou.edit.draft.Publish;
import io.reactivex.subjects.PublishSubject;
import android.widget.LinearLayout;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import ekd.m1;
import android.widget.FrameLayout;
import zw8.h4;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import bba.b;

public class c2 extends PresenterV2	// class@0013d3
{
    public View A;
    public FrameLayout B;
    public View C;
    public ShareTopicSearchV3Fragment D;
    public ShareTopicHistoryV3Fragment E;
    public Fragment F;
    public int G;
    public final boolean H;
    public GifshowActivity p;
    public p0 q;
    public String r;
    public String s;
    public VideoContext t;
    public b u;
    public c v;
    public String w;
    public LinearLayout x;
    public EmojiEditText y;
    public EmojiEditText z;

    public void c2(){
       super();
       this.D = new ShareTopicSearchV3Fragment();
       this.E = new ShareTopicHistoryV3Fragment();
       int i = 0;
       this.G = i;
       if (PostExperimentUtils.A1() || PostExperimentUtils.y1()) {
          i = true;
       }
       this.H = i;
       return;
    }
    public void E8(){
       c2 uoc2 = c2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc2, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc2, "10")) {
          Bundle uBundle = new Bundle();
          uBundle.putString("photo_task_id", this.r);
          uBundle.putString("editSessionId", this.s);
          uBundle.putString("from_page", this.w);
          c2 tq = this.q;
          if (tq.C == null) {
             tq.C = ShareTopicExtra.generateData(this.v, this.y.getKSTextDisplayHandler().e(), this.s);
          }
          SerializableHook.putSerializable(uBundle, "topic_extra", this.q.C);
          this.E.setArguments(uBundle);
          tq = this.E;
          tq.L = new l4(this);
          tq.P = new k4(this);
          this.D.setArguments(uBundle);
          uoc2 = this.D;
          uoc2.G = new j4(this);
          uoc2.H = new i4(this);
          n4 on4 = new n4(this);
          tq = this.E;
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(on4, tq, ShareTopicHistoryV3Fragment.class, "13")) {
             tq.N.add(on4);
          }
          tq = this.D;
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(on4, tq, ShareTopicSearchV3Fragment.class, "11")) {
             tq.J.add(on4);
          }
       }
       this.y.addTextChangedListener(new c2$a(this));
       this.X7(this.q.b.compose(c.c(this.p.m(), ActivityEvent.DESTROY)).subscribe(new m4(this), b2.b));
       if (i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
          View view = this.k8(R.id.topic_button);
          if (view != null) {
             view.setVisibility(8);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c2.class, "18")) {
          return;
       }
       b.a(0x73a785a0).f();
       return;
    }
    public final void P8(TopicItem p0){
       String str2;
       String str3;
       String str4;
       Object obj = this;
       c2 obj1 = p0;
       c2 uoc2 = c2.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uoc2, "11")) {
          return;
       }
       String keyWorld = p0.getKeyWorld();
       String str = obj.y.getText().toString();
       int selectionEnd = obj.y.getSelectionEnd();
       String str1 = "";
       if (selectionEnd <= str.length()) {
          str2 = str.substring(selectionEnd);
          str3 = str.substring(0, selectionEnd);
       }else {
          str2 = str1;
          str3 = str2;
       }
       Object[] objArray = new Object[0];
       a.b().s("ShareTopicV3Presenter", "beforeCursorStr: "+str3+", afterCursorStr: "+str2, objArray);
       int i = Math.max(str3.lastIndexOf("#"), str3.lastIndexOf(0xff03));
       if (i == -1) {
          i = selectionEnd;
       }
       int i1 = 1;
       if (!keyWorld.indexOf("#") && keyWorld.length() > i1) {
          Object[] objArray1 = new Object[0];
          a.b().s("ShareTopicV3Presenter", "addTopicÊ×¸ö×Ö·ûÊÇ#", objArray1);
          keyWorld = keyWorld.substring(i1);
       }
       if (!TextUtils.x(keyWorld)) {
          if (PatchProxy.applyVoidTwoRefs(obj1, keyWorld, obj, uoc2, "15") || obj.u == null) {
             str4 = "ShareTopicV3Presenter";
          }else {
             CaptionTopic$TopicFrom iMPORT = CaptionTopic$TopicFrom.IMPORT;
             int i2 = c2$b.a[p0.getType().ordinal()];
             c2 uoc21 = 3;
             if (i2 != i1) {
                if (i2 != 2) {
                   if (i2 != uoc21) {
                      if (i2 == 4) {
                         iMPORT = CaptionTopic$TopicFrom.SEARCH;
                      }
                   }else {
                      iMPORT = CaptionTopic$TopicFrom.Autotake;
                   }
                }else {
                   iMPORT = CaptionTopic$TopicFrom.HISTORY;
                }
             }else {
                iMPORT = CaptionTopic$TopicFrom.RECOMMEND;
             }
             CaptionTopic$TopicType topicType = CaptionTopic$TopicType.forNumber(p0.getTopicType());
             if (topicType == null) {
                Object[] objArray3 = new Object[0];
                a.b().t("ShareTopicV3Presenter", "saveTopicToDraft: not found in daftType", objArray3);
                topicType = CaptionTopic$TopicType.NORMAL;
             }
             int topicType1 = p0.getTopicType();
             if (topicType1 != i1) {
                if (topicType1 == uoc21) {
                   str1 = p0.getSpecialId();
                }
             }else {
                str1 = p0.getMKsOrderId();
             }
             obj.u.c0();
             CaptionTopic$b uob = CaptionTopic.newBuilder();
             str4 = "ShareTopicV3Presenter";
             uob.b((long)p0.getId());
             uob.c(keyWorld);
             uob.copyOnWrite();
             uob.instance.setTopicFrom(iMPORT);
             uob.d(topicType);
             uob.a(TextUtils.k(str1));
             obj.u.k().a(uob.build());
             obj.u.f();
          }
          s.a(obj.y, keyWorld, p0.getTopicType());
          s.a(obj.z, keyWorld, p0.getTopicType());
          if (selectionEnd > str.length()) {
             obj.y.getText().clear();
             selectionEnd = 0;
             i = 0;
          }
          obj.y.getText().replace(i, selectionEnd, "#"+keyWorld+" ");
          Object[] objArray2 = new Object[0];
          a.b().s(str4, "finalAllStr: "+obj.y.getText(), objArray2);
          obj1 = obj.y;
          obj1.setSelection(obj1.getText().length());
          obj.q.p(1);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c2.class, "17")) {
          return;
       }
       c2 tu = this.u;
       if (tu == null) {
          return;
       }
       tu.c0();
       Publish$b uob = this.u.k();
       uob.copyOnWrite();
       uob.instance.clearCaptionTopic();
       this.u.f();
       return;
    }
    public final void S8(){
       c2 uoc2 = c2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc2, "12")) {
          return;
       }
       if (this.H != null) {
          if (!PatchProxy.applyVoid(objArray, this, uoc2, "13") && this.q.b() == 2) {
             this.q.g();
             this.q.n.onNext(Boolean.FALSE);
          }
          return;
       }else if(this.F == null){
          return;
       }else {
          this.x.setVisibility(8);
          this.q.n.onNext(Boolean.FALSE);
          e uoe = this.p.getSupportFragmentManager().beginTransaction();
          if (this.F.isAdded()) {
             uoe.s(this.F);
          }
          uoe.m();
          this.F = objArray;
          return;
       }
    }
    public void V8(Fragment p0){
       c2 uoc2 = c2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc2, "7")) {
          return;
       }
       if (this.H != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoc2, "8")) {
             this.q.o(p0);
             this.q.n.onNext(Boolean.TRUE);
             this.q.p(2);
          }
          return;
       }else {
          this.S8();
          this.F = p0;
          int i = 0;
          if (!PatchProxy.applyVoid(null, this, uoc2, "9")) {
             Object[] objArray = new Object[i];
             a.b().w("ShareTopicV3Presenter", "adjustTopicContainerTopMargin", objArray);
             RelativeLayout$LayoutParams layoutParams = this.x.getLayoutParams();
             layoutParams.topMargin = (n.o(this.C)[1] + this.C.getHeight()) - n.A(this.p);
             this.x.setLayoutParams(layoutParams);
          }
          this.x.setVisibility(i);
          this.q.n.onNext(Boolean.TRUE);
          e uoe = this.p.getSupportFragmentManager().beginTransaction();
          if (!p0.isAdded()) {
             uoe.v(R.id.implant_panel_frame, p0);
          }else {
             uoe.E(p0);
          }
          uoe.m();
          this.q.p(2);
          return;
       }
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, c2.class, "5")) {
          return;
       }
       if (this.q.b() == 2) {
          this.q.p(1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c2.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a13cc);
       this.A = m1.f(p0, 0x7f0a2efa);
       this.y = m1.f(p0, 0x7f0a0ca8);
       this.z = m1.f(p0, 0x7f0a0cb0);
       this.B = m1.f(p0, 0x7f0a13cd);
       this.C = m1.f(p0, 0x7f0a31f3);
       m1.a(p0, new h4(this), R.id.topic_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c2.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_ACTIVITY");
       this.q = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.r = this.t8("PHOTO_TASK_ID");
       this.s = this.t8("EDIT_SESSION_ID");
       this.t = this.t8("SHARE_VIDEO_CONTEXT");
       this.w = this.t8("SHARE_FROM_PAGE");
       this.u = this.t8("PUBLISH");
       this.v = this.t8("WORKSPACE");
       return;
    }
}
