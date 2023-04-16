package com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment;
import ey0.a;
import im8.g;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.HashSet;
import com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import android.widget.ImageButton;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import zx0.n0;
import android.view.View$OnClickListener;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ey0.b;
import zx0.m0;
import java.util.ArrayList;
import z1.a;
import java.util.Iterator;
import java.util.Set;
import zx0.a;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiEditText;
import ow0.a;
import pf1.f;
import com.kwai.robust.PatchProxyResult;
import zx0.p0;
import java.util.Map;
import java.util.HashMap;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import y31.e;
import com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment$b;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import dy0.a;

public class LiveUniversalCommentFloatEditorFragment extends EmotionFloatEditorFragment implements a, g	// class@000a9b
{
    public e f2;
    public LiveUniversalCommentFloatEditorFragment$b g2;
    public a0 h2;
    public h i2;
    public View j2;
    public a k2;
    public View l2;
    public final Set m2;
    public final LiveAsrFloatEditorFragment$e n2;
    public static final int o2;

    public void LiveUniversalCommentFloatEditorFragment(){
       super();
       this.m2 = new HashSet();
       this.n2 = new LiveUniversalCommentFloatEditorFragment$a(this);
    }
    public void Li(){
       View view;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveUniversalCommentFloatEditorFragment.class, "3")) {
          return;
       }
       super.Li();
       String str = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveUniversalCommentFloatEditorFragment.class, "9")) {
          this.l2 = this.W0.findViewById(0x7f0a0ce2);
          if (y.d(this.getActivity())) {
             this.cj(str);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveUniversalCommentFloatEditorFragment.class, "6")) {
          this.h1 = this.W0.findViewById(0x7f0a1cc9);
          ImageButton imageButton = this.W0.findViewById(R.id.asr_button);
          this.i1 = imageButton;
          if (this.M.mEnableAsr != null) {
             imageButton.setOnClickListener(new n0(this));
          }else {
             imageButton.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveUniversalCommentFloatEditorFragment.class, "7")) {
          view = this.W0.findViewById(R.id.location_button);
          this.j2 = view;
          if (this.M.mEnableLocation != null) {
             b.a(this.h2.Z2.a());
             this.j2.setVisibility(str);
             this.j2.setOnClickListener(new m0(this));
          }else {
             view.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveUniversalCommentFloatEditorFragment.class, "8")) {
          view = this.W0.findViewById(R.id.live_comment_editor_panel_tab_container);
          BaseEditorFragment$Arguments mHotWords = this.M.mHotWords;
          if (mHotWords != null && !mHotWords.isEmpty()) {
             view.setVisibility(8);
          }
       }
       return;
    }
    public void O5(a p0){
       this.k2 = p0;
    }
    public void Uh(){
       if (PatchProxy.applyVoid(null, this, LiveUniversalCommentFloatEditorFragment.class, "14")) {
          return;
       }
       Iterator iterator = this.m2.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void Ui(boolean p0){
       if (PatchProxy.isSupport(LiveUniversalCommentFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveUniversalCommentFloatEditorFragment.class, "2")) {
          return;
       }
       super.Ui(p0);
       this.cj((p0 ^ 0x01));
       return;
    }
    public void Wa(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment.class, "16")) {
          return;
       }
       if (this.isAdded()) {
          EmotionFloatEditorFragment tV0 = this.V0;
          if (tV0 != null) {
             tV0.h(p0);
          }
       }
       return;
    }
    public void Xi(boolean p0){
       if (PatchProxy.isSupport(LiveUniversalCommentFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveUniversalCommentFloatEditorFragment.class, "4")) {
          return;
       }
       super.Xi(p0);
       a.p(p0);
       if (p0) {
          f.e(this.h2.Z2.a(), "UNKNOWN");
       }
       return;
    }
    public void Zi(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveUniversalCommentFloatEditorFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveUniversalCommentFloatEditorFragment.class, "5")) {
          return;
       }
       super.Zi(p0, p1);
       a.p(false);
       return;
    }
    public final void cj(boolean p0){
       if (PatchProxy.isSupport(LiveUniversalCommentFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveUniversalCommentFloatEditorFragment.class, "10")) {
          return;
       }
       int i = 8;
       if (!y.d(this.getActivity())) {
          LiveUniversalCommentFloatEditorFragment tl2 = this.l2;
          if (p0) {
             i = 0;
          }
          tl2.setVisibility(i);
       }else {
          this.l2.setVisibility(i);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0bb3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveUniversalCommentFloatEditorFragment.class, new p0());
       }else {
          obj.put(LiveUniversalCommentFloatEditorFragment.class, null);
       }
       return obj;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment.class, "17")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.dismiss();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveUniversalCommentFloatEditorFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       this.m2.clear();
       this.g2.unbind();
       this.g2.destroy();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveUniversalCommentFloatEditorFragment.class, "11")) {
          return;
       }
       super.onStart();
       BaseEditorFragment tM = this.M;
       if (tM.mShowAsrFirst != null && tM.mEnableAsr != null) {
          this.Xi(true);
          this.cj(false);
       }else {
          a.p(false);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveUniversalCommentFloatEditorFragment.class, "12")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment.class, "15")) {
          e uoe = new e();
          this.f2 = uoe;
          uoe.e = this;
          uoe.c = this.h2;
          uoe.d = this.M;
          uoe.f = this.i2;
          uoe.h = this.n2;
          LiveUniversalCommentFloatEditorFragment$b uob = new LiveUniversalCommentFloatEditorFragment$b(uoe);
          this.g2 = uob;
          uob.U7(new b());
          this.g2.U7(new a());
          this.g2.f(p0);
          Object[] objArray = new Object[]{this.f2};
          this.g2.i(objArray);
       }
       return;
    }
}
