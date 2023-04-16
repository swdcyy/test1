package com.yxcorp.gifshow.v3.editor.frame_v2.ui.EditFrameFragmentV2$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.frame_v2.ui.EditFrameFragmentV2;
import java.lang.Object;
import yqc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import brc.e;

public final class EditFrameFragmentV2$a implements Observer	// class@000fa4
{
    public final EditFrameFragmentV2 b;

    public void EditFrameFragmentV2$a(EditFrameFragmentV2 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditFrameFragmentV2$a.class, "1")) {
       }else {
          EditFrameFragmentV2 g = this.b.G;
          if (g == null) {
             a.S("viewModel");
          }
          b uob = g.u0();
          Iterator iterator = this.b.J.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof e) {
                a.o(p0, "newState");
                uoa.q(p0, uob);
             }
          }
       }
       return;
    }
}
