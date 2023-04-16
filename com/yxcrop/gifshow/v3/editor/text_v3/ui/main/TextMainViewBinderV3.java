package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import yld.l;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xod.f;
import yod.k;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$mTimelineFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$e;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$d;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$c;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.c;
import rod.b;
import java.lang.Boolean;
import tnd.b;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.content.Context;
import tb7.b;
import xld.a;
import java.util.List;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import cq.a;
import w46.b;
import xld.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;

public final class TextMainViewBinderV3 extends TextMainBaseViewBinderV3 implements l	// class@000c4a
{
    public final TextMainViewBinderV3$d A;
    public final TextMainViewBinderV3$c B;
    public final TextMainViewBinderV3$b C;
    public final TextMainViewBinderV3$a D;
    public final k x;
    public final p y;
    public final TextMainViewBinderV3$e z;

    public void TextMainViewBinderV3(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       super(p0, p1, false, p2);
       this.x = f.a.g(p1);
       this.y = s.c(new TextMainViewBinderV3$mTimelineFragment$2(this, p2));
       this.z = new TextMainViewBinderV3$e(this);
       this.A = new TextMainViewBinderV3$d(this);
       this.B = new TextMainViewBinderV3$c(this);
       this.C = new TextMainViewBinderV3$b(this);
       this.D = new TextMainViewBinderV3$a(this);
    }
    public DecorationContainerView$d G(){
       return this.D;
    }
    public a I(){
       Object obj = PatchProxy.apply(null, this, TextMainViewBinderV3.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a0().o0().y();
    }
    public b J(){
       return this.A;
    }
    public EditReduxViewModel M(){
       return this.a0();
    }
    public void N(boolean p0){
       FragmentActivity activity;
       TextMainViewBinderV3 textMainView = TextMainViewBinderV3.class;
       if (PatchProxy.isSupport(textMainView) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textMainView, "2")) {
          return;
       }
       super.N(p0);
       Fragment uFragment = b.b(this.K());
       if (uFragment.getActivity() != null) {
          activity = uFragment.getActivity();
          a.m(activity);
          a.o(activity, "fragment.activity!!");
          if (!activity.isFinishing()) {
             FragmentActivity activity1 = uFragment.getActivity();
             a.m(activity1);
             if (!b.h(activity1)) {
                if (!p0 && (this.a0().o0().v() && (this.a0().o0().D() && (!this.a0().o0().s() && (this.a0().o0().i().isEmpty() ^ 0x01))))) {
                   TextTimelineFragmentV3 textTimeline = PatchProxy.apply(null, this, textMainView, "1");
                   if (textTimeline == PatchProxyResult.class) {
                      textTimeline = this.y.getValue();
                   }
                   textTimeline.show();
                }
             label_00a6 :
                if (this.H().z() instanceof VideoSDKPlayerView && (p0 && this.a0().o0().y().f())) {
                   View view = this.H().z();
                   Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
                   if (view.isPlaying()) {
                      view = this.H().z();
                      Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView");
                      view.pause();
                   }
                }
                return;
             }
          }
       }
       Object[] objArray = new Object[0];
       a.D().t("TextMainViewBinderV3", "getPullUpAnimationCallback, activity is null", objArray);
       return;
    }
    public b P(){
       return this.C;
    }
    public b Q(){
       return this.B;
    }
    public b R(){
       return this.z;
    }
    public boolean T(){
       Object obj = PatchProxy.apply(null, this, TextMainViewBinderV3.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a0().o0().s() || this.a0().o0().E().d())? true: false;
       return b;
    }
    public boolean V(){
       Object obj = PatchProxy.apply(null, this, TextMainViewBinderV3.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a0().o0().G();
    }
    public boolean Z(){
       Object obj = PatchProxy.apply(null, this, TextMainViewBinderV3.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a0().o0().D();
    }
    public k a0(){
       return this.x;
    }
    public void x(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextMainViewBinderV3.class, "4")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          this.S(p0.y(), p1.y());
          DraftTextStyleInfo uDraftTextSt = p0.A();
          String str = null;
          String str1 = (uDraftTextSt != null)? uDraftTextSt.g(): str;
          DraftTextStyleInfo uDraftTextSt1 = p1.A();
          String str2 = (uDraftTextSt1 != null)? uDraftTextSt1.g(): str;
          if (a.g(str1, str2) ^ 0x01) {
             DraftTextStyleInfo uDraftTextSt2 = p0.A();
             if (uDraftTextSt2 != null) {
                str = uDraftTextSt2.g();
             }
             if (!PatchProxy.applyVoidOneRefs(str, this, TextMainBaseViewBinderV3.class, "11")) {
                TextMainBaseViewBinderV3 th = this.h;
                if (th != null) {
                   th.Bh(str);
                }
             }
          }
       }
    label_0061 :
       return;
    }
}
