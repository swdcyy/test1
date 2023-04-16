package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$d;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import maa.a;
import haa.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Template;
import java.lang.CharSequence;
import qr4.e$p;
import kotlin.text.StringsKt__StringsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.e$h;
import km6.f;

public final class PicTemplateCommitEditAction$d implements a	// class@00135c
{
    public final c b;

    public void PicTemplateCommitEditAction$d(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, PicTemplateCommitEditAction$d.class, "1")) {
          return;
       }
       List list = a.c(obj.b).z();
       a.o(list, "DraftGetUtils.getAssetDraft\(draft\).messages");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Template obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj1, "asset");
          Template atlasTemplat = obj1.getAtlasTemplate();
          a.o(atlasTemplat, "asset.atlasTemplate");
          String templateId = atlasTemplat.getTemplateId();
          a.o(templateId, "asset.atlasTemplate.templateId");
          e$p op = (templateId.length() > 0)? 1: null;
          if (op) {
             op = new e$p();
             obj1 = obj1.getAtlasTemplate();
             a.o(obj1, "asset.atlasTemplate");
             String templateId1 = obj1.getTemplateId();
             a.o(templateId1, "asset.atlasTemplate.templateId");
             String[] stringArray = new String[]{"_"};
             op.a = CollectionsKt___CollectionsKt.Y2(StringsKt__StringsKt.H4(templateId1, stringArray, false, 0, 6, null));
             op.b = i;
          }else {
             Object[] objArray1 = objArray;
          }
          if (op != null) {
             uArrayList.add(op);
          }
          i = i1;
       }
       e$p[] opArray = new e$p[0];
       Object[] objArray2 = uArrayList.toArray(opArray);
       Objects.requireNonNull(objArray2, "null cannot be cast to non-null type kotlin.Array<T>");
       VideoContext videoContext = obj.b.d1();
       a.o(videoContext, "draft.videoContext");
       f.d(videoContext).U = objArray2;
       return;
    }
}
