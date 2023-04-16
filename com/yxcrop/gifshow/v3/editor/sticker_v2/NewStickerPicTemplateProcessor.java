package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import qsc.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$a;
import nsd.u;
import lwc.h;
import smd.d;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$mPictureViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$mContainerView$2;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$d;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$e;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$c;
import brd.e;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$i;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$f;
import mmd.a;
import java.util.HashMap;
import uwc.b;
import java.util.List;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.util.Pair;
import java.util.ArrayList;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import java.util.Map;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$g;
import java.lang.Runnable;
import yb7.p;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorManager;
import qsc.e;
import t36.f;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$h;
import t36.f$a;

public final class NewStickerPicTemplateProcessor extends a	// class@000a4c
{
    public final p b;
    public final p c;
    public final h d;
    public final d e;
    public final PhotosEditPreviewV3Fragment f;
    public static final NewStickerPicTemplateProcessor$a g;

    static {
       NewStickerPicTemplateProcessor.g = new NewStickerPicTemplateProcessor$a(null);
    }
    public void NewStickerPicTemplateProcessor(h p0,d p1,PhotosEditPreviewV3Fragment p2){
       a.p(p0, "previewViewModel");
       a.p(p1, "stickerViewModel");
       a.p(p2, "fragment");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.b = s.c(new NewStickerPicTemplateProcessor$mPictureViewModel$2(this));
       this.c = s.c(new NewStickerPicTemplateProcessor$mContainerView$2(this));
    }
    public a a(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, NewStickerPicTemplateProcessor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a uoa = a.q(new NewStickerPicTemplateProcessor$d(this, p1));
       a.o(uoa, "Completable.fromAction {¡­n\(assetIdentifier\)\)\n    }");
       return uoa;
    }
    public a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewStickerPicTemplateProcessor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new NewStickerPicTemplateProcessor$e(this, p0));
       a.o(uoa, "Completable.fromAction {¡­ateStickerAction\(\)\)\n    }");
       return uoa;
    }
    public a c(c p0,String p1,c p2){
       a uoa;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NewStickerPicTemplateProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a.p(p1, "assetIdentifier");
       a.p(p2, "templateDraft");
       if (p0.a1() == Workspace$Type.SINGLE_PICTURE) {
          uoa = a.q(new NewStickerPicTemplateProcessor$b(this, p0, p2));
          a.o(uoa, "Completable.fromAction {¡­stContainerView\(\)\n      }");
       }else {
          uoa = this.a(p0, p1).b(a.q(new NewStickerPicTemplateProcessor$c(this, p0, p1, p2)));
          a.o(uoa, "clear\(projectDraft, asse¡­ntIdentifier\)\)\n        }\)");
       }
       return uoa;
    }
    public a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewStickerPicTemplateProcessor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new NewStickerPicTemplateProcessor$i(this, p0));
       a.o(uoa, "Completable.fromAction {¡­aft.safeStartEdit\(\)\n    }");
       return uoa;
    }
    public a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewStickerPicTemplateProcessor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "projectDraft");
       a uoa = a.q(new NewStickerPicTemplateProcessor$f(this, p0));
       a.o(uoa, "Completable.fromAction {¡­ateStickerAction\(\)\)\n    }");
       return uoa;
    }
    public final a j(){
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NewStickerPicTemplateProcessor newStickerPi = NewStickerPicTemplateProcessor.class;
       Object[] objArray = null;
       List obj1 = PatchProxy.apply(objArray, obj, newStickerPi, "11");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       obj1 = this.k().I0(true);
       boolean b = false;
       if (obj1.size() != obj.d.w0().size()) {
          obj1 = this.k().I0(b);
       }
       if (obj1.size() != obj.d.w0().size() && obj.e.o0().A() != null) {
          objArray = new Object[b];
          a.D().A("StickerPicTemplateProcessorV2", "buildStickerAttachInfo: assetIdentifierList.size = "+obj1.size()+", previewViewModel.getFinalAssetSizeList\(\).size = "+obj.d.w0().size(), objArray);
          a uoa = obj.e.o0().A();
          a.m(uoa);
          return uoa;
       }else {
          Iterator iterator = obj1.iterator();
          while (iterator.hasNext()) {
             Pair obj2 = iterator.next();
             int i = b + 1;
             if (b < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (b >= 0 && b < obj.d.w0().size()) {
                ArrayList uArrayList = new ArrayList();
                Pair first = obj2.first;
                if (first != null) {
                   a.o(first, "identifierList.first");
                   uArrayList.add(first);
                }
                obj2 = obj2.second;
                if (obj2 != null) {
                   a.o(obj2, "identifierList.second");
                   uArrayList.add(obj2);
                }
                hashMap.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", null, null, 0, null, null, 62, null)).hashCode()), obj.d.w0().get(b));
                float f = obj.d.q0(b) / obj.d.r0(b);
                hashMap1.put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", null, null, 0, null, null, 62, null)).hashCode()), Float.valueOf(f));
             }
             b = i;
          }
          Object obj3 = PatchProxy.apply(objArray, obj, newStickerPi, "2");
          if (obj3 != patchProxyRe) {
          }else {
             obj3 = obj.c.getValue();
          }
          a uoa1 = new a(true, obj3.getEditorRect().width(), hashMap, hashMap1, null, 16, null);
          return iterator;
       }
    }
    public final b k(){
       Object obj = PatchProxy.apply(null, this, NewStickerPicTemplateProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void l(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewStickerPicTemplateProcessor.class, "10")) {
          return;
       }
       p.e(new NewStickerPicTemplateProcessor$g(this, p0), 0);
       return;
    }
    public final void m(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewStickerPicTemplateProcessor.class, "9")) {
          return;
       }
       if (p0.a1() == Workspace$Type.SINGLE_PICTURE) {
          BaseEditorFragment b = this.f.B;
          a.o(b, "fragment.mEditorManager");
          EditorDelegate uEditorDeleg = b.m();
          a.o(uEditorDeleg, "fragment.mEditorManager.delegate");
          f.p0(uEditorDeleg.u(), e.class).s0(NewStickerPicTemplateProcessor$h.a);
       }
       return;
    }
}
