package com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import yld.l;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$mTimelineFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$d;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$a;
import ynd.c;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import mod.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import java.util.List;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import java.lang.Boolean;
import tnd.b;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.content.Context;
import tb7.b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.timeline.TextTimelineFragmentV3;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import cq.a;
import w46.b;
import android.view.View$OnClickListener;
import xld.b;

public final class TextKeyBoardPanelViewBinder extends KeyBoardPanelBaseViewBinder implements l	// class@000b27
{
    public final TextKeyBoardPanelViewBinder$c A;
    public final View$OnClickListener B;
    public final TextKeyBoardPanelViewBinder$a C;
    public final p x;
    public final TextKeyBoardPanelViewBinder$d y;
    public final TextKeyBoardPanelViewBinder$b z;

    public void TextKeyBoardPanelViewBinder(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       super(p0, p1, false, false, p2);
       this.x = s.c(new TextKeyBoardPanelViewBinder$mTimelineFragment$2(p2));
       this.y = new TextKeyBoardPanelViewBinder$d(this);
       this.z = new TextKeyBoardPanelViewBinder$b(this);
       this.A = new TextKeyBoardPanelViewBinder$c(this);
       this.B = new TextKeyBoardPanelViewBinder$e(this);
       this.C = new TextKeyBoardPanelViewBinder$a(this);
    }
    public c F(){
       return this.A;
    }
    public DecorationContainerView$d G(){
       return this.C;
    }
    public a I(){
       Object obj = PatchProxy.apply(null, this, TextKeyBoardPanelViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g0().o0().y();
    }
    public c K(){
       return this.z;
    }
    public EditReduxViewModel P(){
       return this.g0();
    }
    public String Q(){
       Object[] objArray = null;
       NewTextBaseElementData obj = PatchProxy.apply(objArray, this, TextKeyBoardPanelViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.l(this.g0().o0().i(), this.g0().o0().o());
       if (obj != null) {
          objArray = obj.F0();
       }
       return objArray;
    }
    public void R(boolean p0){
       FragmentActivity activity;
       TextKeyBoardPanelViewBinder textKeyBoard = TextKeyBoardPanelViewBinder.class;
       if (PatchProxy.isSupport(textKeyBoard) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textKeyBoard, "3")) {
          return;
       }
       super.R(p0);
       Fragment uFragment = b.b(this.L());
       if (uFragment.getActivity() != null) {
          activity = uFragment.getActivity();
          a.m(activity);
          a.o(activity, "fragment.activity!!");
          if (!activity.isFinishing()) {
             FragmentActivity activity1 = uFragment.getActivity();
             a.m(activity1);
             if (!b.h(activity1)) {
                if (!p0 && (this.g0().o0().v() && (this.g0().o0().D() && !this.g0().o0().s()))) {
                   TextTimelineFragmentV3 textTimeline = PatchProxy.apply(null, this, textKeyBoard, "2");
                   if (textTimeline == PatchProxyResult.class) {
                      textTimeline = this.x.getValue();
                   }
                   textTimeline.show();
                }
             label_0090 :
                if (this.H().z() instanceof VideoSDKPlayerView && (p0 && this.g0().o0().y().f())) {
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
       a.D().t("TextKeyBoardPanelViewBinder", "getPullUpAnimationCallback, activity is null", objArray);
       return;
    }
    public View$OnClickListener S(){
       return this.B;
    }
    public c T(){
       return this.y;
    }
    public boolean V(){
       Object obj = PatchProxy.apply(null, this, TextKeyBoardPanelViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g0().o0().s() || this.g0().o0().E().d())? true: false;
       return b;
    }
    public boolean X(){
       Object obj = PatchProxy.apply(null, this, TextKeyBoardPanelViewBinder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g0().o0().G();
    }
    public boolean e0(){
       Object obj = PatchProxy.apply(null, this, TextKeyBoardPanelViewBinder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g0().o0().D();
    }
    public l g0(){
       Object obj = PatchProxy.apply(null, this, TextKeyBoardPanelViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.d(this.L());
    }
    public void x(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextKeyBoardPanelViewBinder.class, "5")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          this.U(p0.y(), p1.y());
       }
       return;
    }
}
