package com.yxcorp.gifshow.v3.editor.segment.d0;
import com.yxcorp.gifshow.v3.editor.segment.b0$c;
import com.yxcorp.gifshow.v3.editor.segment.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import java.lang.Boolean;
import im8.f;

public class d0 implements b0$c	// class@0011cc
{
    public final b0 a;

    public void d0(b0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       d0 ta = this.a;
       ta.t.refreshTrackAsset(ta.w);
       AICutProjectManager.d(this.a.s.f());
       return;
    }
    public void commit(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       if (DraftUtils.i0(this.a.x) && this.a.x.v() != null) {
          this.a.x.n(0).m(true);
       }
       d0 ta = this.a;
       ta.t.refreshTrackAsset(ta.w);
       AICutProjectManager.d(this.a.s.f());
       this.a.z.set(Boolean.TRUE);
       return;
    }
}
