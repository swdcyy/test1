package com.yxcorp.gifshow.v3.editor.text.b1$c;
import voc.y;
import com.yxcorp.gifshow.v3.editor.text.b1;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.edit.draft.model.c;
import jba.a;
import faa.a;
import q87.c;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Tts$b;
import com.kuaishou.edit.draft.Tts;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.TtsAudio;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.TtsAudio$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.i;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter$Action;
import io.reactivex.subjects.PublishSubject;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.text.b1$c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class b1$c implements y	// class@0013ac
{
    public final b1 b;

    public void b1$c(b1 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       Object[] objArray2;
       b1 uob1 = b1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b1$c.class, "3")) {
          return;
       }
       this.b.L.R();
       this.b.C.j();
       if (!this.b.S8()) {
          if (this.b.R8().D()) {
             Object[] objArray1 = new Object[0];
             a.D().w("TextCommonPresenter", "discardEditChanges: discardTtsDraft", objArray1);
             this.b.R8().j();
          }
          b1$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, uob1, "7")) {
             objArray2 = new Object[0];
             a.D().w("TextCommonPresenter", "restoreOriginTts: ", objArray2);
             a uoa = tb.R8();
             if (!uoa.D()) {
                uoa.c0();
             }
             uoa.k().b();
             if (tb.V == null) {
                objArray2 = new Object[0];
                a.D().w("TextCommonPresenter", "restoreOriginTts: mOriginTts is null", objArray2);
                uoa.k().d(0);
             }else {
                uoa.k().d(tb.V.getApplyToAll());
                Iterator iterator = tb.V.getTtsAudiosList().iterator();
                while (iterator.hasNext()) {
                   TtsAudio ttsAudio = iterator.next();
                   Object[] objArray4 = new Object[0];
                   a.D().w("TextCommonPresenter", "restoreOriginTts: ttsAudio = "+ttsAudio.getFile(), objArray4);
                   TtsAudio$b uob = TtsAudio.newBuilder();
                   uob.d(ttsAudio.getSpeakerId());
                   uob.b(ttsAudio.getLanguageType());
                   uob.a(uoa.Q(ttsAudio.getFile()));
                   uob.f(ttsAudio.getTextIdentifier());
                   uob.g(ttsAudio.getVolume());
                   uob.c(ttsAudio.getRange());
                   uoa.k().a(uob.build());
                }
             }
             if (uoa.D()) {
                uoa.g(0);
             }
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, uob1, "5")) {
             objArray2 = new Object[0];
             a.D().w("TextCommonPresenter", "restoreOriginVideoEditorProjectAudioAssets: audiosAsset = "+tb.U.length, objArray2);
             for (int i = 0; i < tb.U.length; i = i + 1) {
                Object[] objArray3 = new Object[0];
                a.D().w("TextCommonPresenter", "restoreOriginVideoEditorProjectAudioAssets: audiosAsset = "+tb.U[i].assetPath(), objArray3);
             }
             tb.y.z().getVideoProject().setAudioAssets(tb.U);
             tb.y.z().sendChangeToPlayer(true);
          }
       }
       this.b.x.c(0);
       if (this.b.S8()) {
          this.b.z.h();
       }
       this.b.N.n1();
       this.b.N.c1(Integer.valueOf(15));
       this.b.A.onNext(ReEditCoverPresenter$Action.DISCARD);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, b1$c.class, "2")) {
          return;
       }
       this.b.C.f();
       if (this.b.R8().D()) {
          this.b.R8().f();
       }
       this.b.x.c(true);
       if (this.b.S8()) {
          this.b.z.h();
       }else {
          this.b.N.l1();
       }
       this.b.N.n1();
       this.b.A.onNext(ReEditCoverPresenter$Action.SAVE);
       return;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, b1$c.class, "1")) {
          return;
       }
       this.b.L.getViewTreeObserver().addOnGlobalLayoutListener(new b1$c$a(this));
       return;
    }
}
