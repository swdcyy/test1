package com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment;
import ey0.a;
import im8.g;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.HashSet;
import com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageButton;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment$b;
import android.view.View$OnClickListener;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ey0.b;
import y31.a;
import z1.a;
import java.util.Iterator;
import java.util.Set;
import zx0.a;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.robust.PatchProxyResult;
import y31.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import y31.e;
import com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment$c;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import dy0.a;

public class LiveGzoneAsrEmotionFloatEditorFragment extends EmotionFloatEditorFragment implements a, g	// class@000c2c
{
    public e f2;
    public LiveGzoneAsrEmotionFloatEditorFragment$c g2;
    public a0 h2;
    public h i2;
    public final Set j2;
    public View k2;
    public View l2;
    public a m2;
    public final LiveAsrFloatEditorFragment$e n2;
    public static final int o2;

    public void LiveGzoneAsrEmotionFloatEditorFragment(){
       super();
       this.j2 = new HashSet();
       this.n2 = new LiveGzoneAsrEmotionFloatEditorFragment$a(this);
    }
    public void Li(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "2")) {
          return;
       }
       super.Li();
       this.l2 = this.W0.findViewById(0x7f0a0ce2);
       this.h1 = this.W0.findViewById(0x7f0a1cc9);
       ImageButton imageButton = this.W0.findViewById(R.id.asr_button);
       this.i1 = imageButton;
       if (this.M.mEnableAsr != null) {
          imageButton.setOnClickListener(new LiveGzoneAsrEmotionFloatEditorFragment$b(this));
       }else {
          imageButton.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "3")) {
          View view = this.W0.findViewById(R.id.location_button);
          this.k2 = view;
          if (this.M.mEnableLocation != null) {
             b.a(this.h2.Z2.a());
             this.k2.setVisibility(0);
             this.k2.setOnClickListener(new a(this));
          }else {
             view.setVisibility(8);
          }
       }
       return;
    }
    public void O5(a p0){
       this.m2 = p0;
    }
    public void Uh(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "6")) {
          return;
       }
       Iterator iterator = this.j2.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void Wa(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "9")) {
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
    public int getLayoutResId(){
       return 0x7f0d0bb3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneAsrEmotionFloatEditorFragment.class, new d());
       }else {
          obj.put(LiveGzoneAsrEmotionFloatEditorFragment.class, null);
       }
       return obj;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.j2.clear();
       this.g2.unbind();
       this.g2.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment.class, "8")) {
          e uoe = new e();
          this.f2 = uoe;
          uoe.e = this;
          uoe.c = this.h2;
          uoe.d = this.M;
          uoe.f = this.i2;
          uoe.h = this.n2;
          LiveGzoneAsrEmotionFloatEditorFragment$c uoc = new LiveGzoneAsrEmotionFloatEditorFragment$c(uoe);
          this.g2 = uoc;
          uoc.U7(new b());
          this.g2.U7(new a());
          this.g2.f(p0);
          Object[] objArray = new Object[]{this.f2};
          this.g2.i(objArray);
       }
       return;
    }
}
