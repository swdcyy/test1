package com.yxcorp.gifshow.v3.editor.kuaishan_segment.view.KuaiShanSegmentFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.view.KuaiShanSegmentFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mrc.a;
import com.yxcorp.gifshow.v3.editor.i;
import jrc.a;

public final class KuaiShanSegmentFragment$a implements ViewModelProvider$Factory	// class@001026
{
    public final KuaiShanSegmentFragment a;

    public void KuaiShanSegmentFragment$a(KuaiShanSegmentFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       KuaiShanSegmentFragment obj = PatchProxy.applyOneRefs(p0, this, KuaiShanSegmentFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       obj = this.a.J;
       if (obj == null) {
          a.S("mEditorHelperContract");
       }
       return new a(obj, this.a.K);
    }
}
