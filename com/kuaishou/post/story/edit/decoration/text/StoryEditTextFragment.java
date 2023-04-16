package com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import ml8.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$d;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import io.reactivex.subjects.PublishSubject;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$c;
import rp4.c;
import android.view.View;
import ekd.m1;
import android.widget.EditText;
import java.lang.CharSequence;
import java.lang.Runnable;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import dq4.b;
import dq4.a;
import java.util.Objects;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.AbsoluteLayout;
import rp4.a;
import q87.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.edit.decoration.text.c0;
import com.kuaishou.post.story.edit.decoration.text.f0;
import com.kuaishou.post.story.edit.decoration.text.h0;
import com.kuaishou.post.story.edit.decoration.text.z;
import com.kuaishou.post.story.edit.decoration.text.i0;
import com.kuaishou.post.story.edit.decoration.text.v;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.lang.Boolean;
import androidx.activity.ComponentActivity;
import lnc.i1;
import dq4.c;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import dq4.d;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import java.lang.Number;
import skd.a;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class StoryEditTextFragment extends BaseEditorFragment implements d	// class@000ad7
{
    public View V0;
    public EditText W0;
    public View X0;
    public View Y0;
    public PresenterV2 Z0;
    public StoryEditTextFragment$a a1;
    public Handler b1;
    public int c1;
    public StoryEditTextFragment$c d1;
    public boolean e1;
    public Runnable f1;
    public boolean g1;
    public boolean h1;
    public static final int i1;

    public void StoryEditTextFragment(){
       super();
       this.a1 = new StoryEditTextFragment$a(this);
       this.b1 = new Handler(Looper.getMainLooper());
       this.c1 = 0;
       this.e1 = false;
       this.f1 = null;
       this.g1 = false;
       this.h1 = false;
    }
    public boolean Ch(){
       return false;
    }
    public EmojiEditText Kh(){
       return null;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "18")) {
          return;
       }
       StoryEditTextFragment ta1 = this.a1;
       if (ta1.g.b == 2) {
          ta1.d.restoreFromBackup(ta1.c);
       }else {
          ta1.e.onNext(new Object());
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          activity.onBackPressed();
       }
       ta1 = this.d1;
       if (ta1 != null) {
          StoryEditTextFragment ta11 = this.a1;
          StoryEditTextFragment$a g = ta11.g;
          g.a = ta11.d;
          ta1.a(g);
       }
       c.b(this.a1.l, "collapse_text_dialog");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryEditTextFragment.class, "1")) {
          return;
       }
       this.V0 = m1.f(p0, 0x7f0a3e12);
       this.X0 = m1.f(p0, 0x7f0a3dfd);
       this.W0 = m1.f(p0, 0x7f0a3e20);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d1573;
    }
    public void hi(CharSequence p0){
    }
    public final void ii(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "8")) {
          return;
       }
       this.e1 = true;
       StoryEditTextFragment tX0 = this.X0;
       if (tX0 != null && !tX0.getAlpha() - 0x3f800000) {
          tX0 = this.f1;
          if (tX0 != null) {
             tX0.run();
          }
          this.W0.setAlpha(0x3f800000);
       }
       return;
    }
    public void ji(DecorationDrawer p0,StoryDecorationContainerView p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryEditTextFragment.class, "7")) {
          return;
       }
       if (p0 != null) {
          this.f1 = new b(p0);
          a uoa = new a(this);
          Objects.requireNonNull(p1);
          if (!PatchProxy.applyVoidOneRefs(uoa, p1, StoryDecorationContainerView.class, "13")) {
             DecorationContainerView k = p1.k;
             if (k instanceof StoryTextDrawer) {
                k.mIsInEditing = true;
                k.startTextEditAnimation(p1, uoa);
                p1.d0();
                p1.removeCallbacks(p1.j);
                if (p1.v != null) {
                   p1.t.setVisibility(8);
                }
                objArray = new Object[0];
                a.D().s("StoryDecorationContainerView", "onTextEditStart edit text", objArray);
             }else {
                objArray = new Object[0];
                a.D().s("StoryDecorationContainerView", "onTextEditStart click sticker", objArray);
             }
          }
          p1.i = p0.isEnableTextShadow();
       }else {
          this.ii();
       }
       return;
    }
    public void ki(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "6")) {
          return;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.Z0 = presenterV2;
       presenterV2.U7(new c0());
       this.Z0.U7(new f0());
       this.Z0.U7(new h0());
       this.Z0.U7(new z());
       this.Z0.U7(new i0());
       this.Z0.U7(new v());
       this.Z0.f(this.Y0);
       Object[] objArray = new Object[]{this.a1};
       this.Z0.i(objArray);
       return;
    }
    public boolean li(){
       return this.a1.p;
    }
    public void mi(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "16")) {
          return;
       }
       if (this.g1 == null) {
          this.cancel();
          this.h1 = false;
       }
       return;
    }
    public void ni(int p0){
       if (PatchProxy.isSupport(StoryEditTextFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryEditTextFragment.class, "15")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.V0.getLayoutParams();
       layoutParams.bottomMargin = p0;
       if (this.e1 != null) {
          StoryEditTextFragment tStoryEditTe = this.f1;
          if (tStoryEditTe != null) {
             tStoryEditTe.run();
          }
          this.W0.setAlpha(0x3f800000);
       }
       this.X0.setAlpha(0x3f800000);
       this.V0.setLayoutParams(layoutParams);
       this.P = false;
       this.h1 = true;
       return;
    }
    public void oi(int p0){
       this.a1.o = p0;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryEditTextFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StoryEditTextFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       View view = a.g(p0, this.getLayoutResId(), p1, b);
       this.Y0 = view;
       if (this.a1.h == null) {
          view.setBackgroundResource(b);
       }
       this.doBindView(this.Y0);
       Object[] objArray = null;
       view = PatchProxy.apply(objArray, this, StoryEditTextFragment.class, "4");
       if (view != PatchProxyResult.class) {
          b = view.booleanValue();
       }else {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             if (this.d1 == null) {
                activity.onBackPressed();
                i1.a("StoryEditTextFragment", "low memory activity is recycled!");
             }else {
                b = true;
             }
          }
       }
       if (b && !PatchProxy.applyVoid(objArray, this, StoryEditTextFragment.class, "14")) {
          this.W0.setOnClickListener(new c(this));
          this.V0.getViewTreeObserver().addOnPreDrawListener(new d(this));
       }
       return this.Y0;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       StoryEditTextFragment tZ0 = this.Z0;
       if (tZ0 != null) {
          tZ0.unbind();
          this.Z0.destroy();
          this.Z0 = null;
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "10")) {
          return;
       }
       super.onResume();
       this.W0.requestFocus();
       this.P = true;
       n.b0(this.getActivity(), this.W0, true);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "11")) {
          return;
       }
       super.onStart();
       this.g1 = false;
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, StoryEditTextFragment.class, "12")) {
          return;
       }
       super.onStop();
       FrameLayout$LayoutParams layoutParams = this.V0.getLayoutParams();
       layoutParams.bottomMargin = 0;
       this.V0.setLayoutParams(layoutParams);
       this.g1 = true;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       StoryTextDrawer storyTextDra;
       StoryEditTextFragment ta11;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryEditTextFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StoryTextDataManager storyTextDat = StoryTextDataManager.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, StoryEditTextFragment.class, "9")) {
          StoryEditTextFragment ta1 = this.a1;
          ta1.b = this;
          if (ta1.d == null) {
             StoryEditTextFragment$a f = ta1.f;
             StoryEditTextFragment$a l = ta1.l;
             Objects.requireNonNull(f);
             if (PatchProxy.isSupport(storyTextDat)) {
                storyTextDra = PatchProxy.applyOneRefs(Integer.valueOf(l), f, storyTextDat, "6");
                if (storyTextDra != patchProxyRe) {
                label_0048 :
                   ta1.d = storyTextDra;
                   ta1 = this.a1;
                   if (ta1.k != null) {
                      f = ta1.d;
                      StoryEditTextFragment$a f1 = ta1.f;
                      Objects.requireNonNull(f1);
                      storyTextDat = PatchProxy.apply(objArray, f1, storyTextDat, "2");
                      int i = 2;
                      if (storyTextDat != patchProxyRe) {
                         i = storyTextDat.intValue();
                      }else {
                         int intx = f1.b.getInt("BACKGROUND_STYLE", 0);
                         if (intx < 0 || intx > i) {
                            i1.c(new RuntimeException("defaultBackgroundStyle overflow, defaultBackgroundStyle:"+intx));
                         }else {
                            i = intx;
                         }
                      }
                      f.mTextBackgroundStyle = i;
                   }else {
                      patchProxyRe.mTextBackgroundStyle = 0;
                   }
                   ta11 = this.a1;
                   StoryEditTextFragment$a d = ta11.d;
                   StoryEditTextFragment$a o = ta11.o;
                   StoryTextDataManager a = ta11.f.a;
                   object oobject = (a.length <= o)? a[0]: a[o];
                   d.mTextColors = oobject;
                }
             }
             storyTextDra = f.a(l, 0);
             goto label_0048 ;
          }
          ta11 = this.a1;
          ta11.c = ta11.d.shallowClone();
       }
       this.ki();
       return;
    }
    public void pi(int p0){
       this.a1.l = p0;
    }
    public void qi(String p0){
       this.a1.m = p0;
    }
    public void ri(StoryEditTextFragment$c p0){
       this.d1 = p0;
    }
    public void si(int p0){
       this.a1.n = p0;
    }
    public void ti(StoryTextDrawer p0){
       this.a1.d = p0;
    }
}
