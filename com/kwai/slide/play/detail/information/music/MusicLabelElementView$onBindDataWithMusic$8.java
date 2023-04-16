package com.kwai.slide.play.detail.information.music.MusicLabelElementView$onBindDataWithMusic$8;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lr7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;

public final class MusicLabelElementView$onBindDataWithMusic$8 extends FunctionReferenceImpl implements l	// class@0017f8
{

    public void MusicLabelElementView$onBindDataWithMusic$8(a p0){
       super(1, p0, a.class, "onMusicLabelOnClick", "onMusicLabelOnClick\(Landroid/view/View;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicLabelElementView$onBindDataWithMusic$8.class, str)) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, str)) {
          a.p(p0, "view");
          treceiver.a.onNext(p0);
       }
       return;
    }
}
