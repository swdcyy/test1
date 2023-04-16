package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameBatchUpdateAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import u80.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import vaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Kuaishan$b;
import tkd.b;
import tkd.d;
import u80.h;
import maa.a;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.utility.TextUtils;
import java.util.List;

public final class KeyFrameBatchUpdateAction extends EditSdkAction	// class@001009
{
    public final d ksProject;

    public void KeyFrameBatchUpdateAction(d p0){
       a.p(p0, "ksProject");
       super();
       this.ksProject = p0;
    }
    public final d getKsProject(){
       return this.ksProject;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFrameBatchUpdateAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       GeneratedMessageLite$Builder uBuilder = a.m(p0).k();
       a.o(uBuilder, "kuaishanDraft.ensureFirstBuilder\(\)");
       d.a(-711186681).SY(p0, this.ksProject, uBuilder);
       this.saveOriginMediaPathToAssetDraft(p0);
       return;
    }
    public final void saveOriginMediaPathToAssetDraft(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyFrameBatchUpdateAction.class, "2")) {
          return;
       }
       a uoa = a.c(p0);
       uoa.d();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.ksProject.h(null).iterator();
       while (iterator.hasNext()) {
          uArrayList.add(TextUtils.k(iterator.next().path));
       }
       d.a(-711186681).n30(uoa, uArrayList);
       return;
    }
}
