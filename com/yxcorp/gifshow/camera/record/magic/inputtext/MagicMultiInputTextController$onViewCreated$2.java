package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$onViewCreated$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController;
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
import com.yxcorp.gifshow.model.ChildMagicFace;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomConfig;
import java.util.ArrayList;
import java.util.List;
import t4b.k;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.Integer;
import t4b.h;
import java.lang.Math;
import s5b.b;
import w46.b;

public final class MagicMultiInputTextController$onViewCreated$2 extends FunctionReferenceImpl implements l	// class@000e41
{

    public void MagicMultiInputTextController$onViewCreated$2(MagicMultiInputTextController p0){
       super(1, p0, MagicMultiInputTextController.class, "handleChildMagicFaceApplyEvent", "handleChildMagicFaceApplyEvent\(Lcom/yxcorp/gifshow/camera/record/magic/custom/ChildMagicFaceApplyEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       Map inputText;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiInputTextController$onViewCreated$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicMultiInputTextController.class, "7") && treceiver.n != null) {
          MagicEmoji$MagicFace mChildMagicF = p0.a().mChildMagicFace;
          if (mChildMagicF != null) {
             ChildMagicFace mConfig = mChildMagicF.mConfig;
             if (mConfig != null) {
                inputText = mConfig.getInputText();
             label_0039 :
                ArrayList uArrayList = (inputText == null || inputText.isEmpty())? 1: null;
                if (!uArrayList) {
                   uArrayList = new ArrayList();
                   MagicMultiInputTextController n = treceiver.n;
                   a.m(n);
                   uArrayList.addAll(n.e());
                   n = treceiver.n;
                   a.m(n);
                   uArrayList.addAll(n.a());
                   Map inputText1 = p0.a().mChildMagicFace.mConfig.getInputText();
                   a.m(inputText1);
                   Iterator iterator = inputText1.entrySet().iterator();
                   List list = -1;
                   int i = -1;
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      int i1 = Integer.parseInt(uEntry.getKey());
                      uArrayList.get(i1).f(uEntry.getValue());
                      i = Math.max(i, i1);
                   }
                   if (i > list) {
                      MagicMultiInputTextController n1 = treceiver.n;
                      a.m(n1);
                      i = i + 1;
                      list = uArrayList.subList(0, i);
                      a.o(list, "totalList.subList\(0, lastIndex + 1\)");
                      n1.g(list);
                      n1 = treceiver.n;
                      a.m(n1);
                      List list1 = uArrayList.subList(i, uArrayList.size());
                      a.o(list1, "totalList.subList\(lastIndex + 1, totalList.size\)");
                      n1.f(list1);
                      n1 = treceiver.n;
                      a.m(n1);
                      treceiver.f2(n1.e(), 1);
                   }
                }
             }
          }
          inputText = null;
          goto label_0039 ;
       }
    label_00ec :
       return;
    }
}
