package com.kuaishou.live.core.show.ask.LiveAskTabFragment$j;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.ask.LiveAskItemClickListener;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;

public final class LiveAskTabFragment$j implements BaseEditorFragment$c	// class@0009c3
{
    public final LiveAskTabFragment a;

    public void LiveAskTabFragment$j(LiveAskTabFragment p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment$j.class, "3")) {
          return;
       }
       a.p(p0, "event");
       if (!TextUtils.x(p0.c) && p0.a == null) {
          LiveAskTabFragment j = this.a.J;
          if (j != null) {
             p0 = p0.c;
             a.o(p0, "event.text");
             j.j(p0);
          }
       }
       return;
    }
    public void c(BaseEditorFragment$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment$j.class, "1")) {
          return;
       }
       a.p(p0, "event");
       return;
    }
    public void d(BaseEditorFragment$m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment$j.class, "2")) {
          return;
       }
       a.p(p0, "event");
       return;
    }
}
