package com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$a;
import tvc.g;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import java.lang.Object;
import xld.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import amd.c;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import yld.l;

public final class DecorationTimelineFragment$a extends g	// class@000a31
{
    public final DecorationTimelineFragment c;

    public void DecorationTimelineFragment$a(DecorationTimelineFragment p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationTimelineFragment$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          a uoa = this.a();
          if (uoa == null) {
             uoa = this.c.kh().u0();
          }
          Iterator iterator = this.c.jh().iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (uoa1 instanceof l) {
                uoa1.x(p0, uoa);
             }
          }
       }
       return;
    }
}
