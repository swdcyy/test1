package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$d;
import erd.a;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import maa.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import wba.f;
import com.kuaishou.edit.draft.Template$b;
import com.kuaishou.edit.draft.Template;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset;

public final class PicTemplateApplyAction$d implements a	// class@001350
{
    public final KSStore b;
    public final c c;
    public final String d;
    public final String e;

    public void PicTemplateApplyAction$d(KSStore p0,c p1,String p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateApplyAction$d.class, "1")) {
          return;
       }
       if (!this.b.b().e()) {
          return;
       }
       a uoa = this.c.o0();
       if (uoa != null) {
          a.o(uoa, "draft.assetDraft ?: return@fromAction");
          if (!uoa.D()) {
             uoa.c0();
          }
          Asset$b uob = f.a(uoa, this.d);
          if (uob != null) {
             Template$b uob1 = Template.newBuilder();
             FeatureId$b uob2 = FeatureId.newBuilder();
             uob2.a(this.e);
             uob1.copyOnWrite();
             uob1.instance.setFeatureId(uob2);
             uob1.copyOnWrite();
             uob1.instance.setTemplateId(this.e);
             uob.copyOnWrite();
             uob.instance.setAtlasTemplate(uob1);
          }
       }
       return;
    }
}
