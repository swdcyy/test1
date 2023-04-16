package com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel$mFineTuningItemUiDataList$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import gca.a;
import gca.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import com.kuaishou.edit.draft.FineTuningParam;
import java.util.Objects;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import gca.c;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ica.c;
import java.lang.Boolean;
import hca.a;
import java.lang.Math;
import androidx.lifecycle.LiveData;

public final class FineTuningViewModel$mFineTuningItemUiDataList$1 extends Lambda implements p	// class@001bab
{
    public final FineTuningViewModel this$0;

    public void FineTuningViewModel$mFineTuningItemUiDataList$1(FineTuningViewModel p0){
       this.this$0 = p0;
       super(2);
    }
    public final b invoke(a p0,b p1){
       c a;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, FineTuningViewModel$mFineTuningItemUiDataList$1.class, str);
       if (p1 != patchProxyRe) {
          return p1;
       }
       a.p(p0, "x");
       EditorFineTuningType uEditorFineT = p0.a();
       FineTuningParam uFineTuningP = p0.b();
       FineTuningViewModel h = this.this$0.h;
       EditorFineTuningType uEditorFineT1 = p0.a();
       Objects.requireNonNull(h);
       c uoc = PatchProxy.applyOneRefs(uEditorFineT1, h, FineTuningRepo.class, "4");
       String str1 = "editorFineTuningType";
       boolean b = false;
       if (uoc != patchProxyRe) {
       }else {
          a.p(uEditorFineT1, str1);
          uoc = h.a().get(b);
          ImmutableList immutableLis = h.a();
          a.o(immutableLis, "mFineTuningViewDataList");
          Iterator iterator = immutableLis.iterator();
          while (iterator.hasNext()) {
             c uoc1 = iterator.next();
             if (uoc1.a() == uEditorFineT1) {
                uoc = uoc1;
             }
          }
          a.o(uoc, "fineTuningViewData");
       }
       a = c.a;
       FineTuningParam uFineTuningP1 = p0.b();
       EditorFineTuningType uEditorFineT2 = p0.a();
       Objects.requireNonNull(a);
       Object obj = PatchProxy.applyTwoRefs(uFineTuningP1, uEditorFineT2, a, c.class, str);
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          a.p(uFineTuningP1, "fineTuningParam");
          a.p(uEditorFineT2, str1);
          b1 = (Math.abs((a.a(uFineTuningP1, uEditorFineT2) - a.a(a.a(), uEditorFineT2))) - (float)1 >= 0)? 1: null;
       }
       boolean b2 = b1;
       b value = this.this$0.o0().getValue();
       EditorFineTuningType uEditorFineT3 = (value != null)? value.a(): null;
       if (uEditorFineT3 == p0.a()) {
          b = true;
       }
       b uob = new b(uEditorFineT, uFineTuningP, uoc, b2, b);
       return "x";
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
