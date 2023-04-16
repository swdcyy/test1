package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController$onViewCreated$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicInputTextController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import je9.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t4b.f;
import com.yxcorp.gifshow.model.ChildMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomConfig;
import ekd.q;
import t4b.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import lnc.o5;

public final class MagicInputTextController$onViewCreated$1 extends FunctionReferenceImpl implements l	// class@000e39
{

    public void MagicInputTextController$onViewCreated$1(MagicInputTextController p0){
       super(1, p0, MagicInputTextController.class, "handleChildMagicFaceApplyEvent", "handleChildMagicFaceApplyEvent\(Lcom/yxcorp/gifshow/camera/record/magic/custom/ChildMagicFaceApplyEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicInputTextController$onViewCreated$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicInputTextController.class, "16") && !TextUtils.x(p0.a().mChildId)) {
          MagicInputTextController n = treceiver.n;
          MagicEmoji$MagicFace magicFace = p0.a();
          Objects.requireNonNull(n);
          if (!PatchProxy.applyVoidOneRefs(magicFace, n, f.class, "3")) {
             a.p(magicFace, "magicFace");
             MagicEmoji$MagicFace mChildMagicF = magicFace.mChildMagicFace;
             ChildMagicFace mConfig = (mChildMagicF != null)? mChildMagicF.mConfig: null;
             if (mConfig != null && (!q.h(mConfig.getInputText()) && (q.h(n.d.g0()) && n.d.J0()))) {
                Map inputText = mConfig.getInputText();
                a.m(inputText);
                Iterator iterator = inputText.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   n.d.B1(o5.b(uEntry.getKey(), 0), uEntry.getValue(), magicFace);
                }
             }
          }
       }
    label_00a2 :
       return;
    }
}
