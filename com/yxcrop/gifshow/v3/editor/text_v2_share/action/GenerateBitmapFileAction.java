package com.yxcrop.gifshow.v3.editor.text_v2_share.action.GenerateBitmapFileAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import vnd.b;
import java.util.ArrayList;
import trd.u;
import java.util.Objects;
import java.util.Collection;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.TextFunnel$funnelText$$inlined$let$lambda$1;
import msd.l;

public final class GenerateBitmapFileAction extends EditDraftAction	// class@000b78
{
    public final boolean commit;
    public final List elementList;

    public void GenerateBitmapFileAction(List p0,boolean p1){
       a.p(p0, "elementList");
       super(false, 1, null);
       this.elementList = p0;
       this.commit = p1;
    }
    public void GenerateBitmapFileAction(List p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       super(p0, p1);
       return;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final List getElementList(){
       return this.elementList;
    }
    public void performAction(c p0,c p1){
       b a;
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GenerateBitmapFileAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          GenerateBitmapFileAction telementList = this.elementList;
          h oh = h.class;
          NewEditTextElement obj = null;
          if (!PatchProxy.applyVoidTwoRefs(telementList, uoa, obj, oh, "35")) {
             a.p(telementList, "elementList");
             a.p(uoa, "textDraft");
             iterator = telementList.iterator();
             while (iterator.hasNext()) {
                NewEditTextElement newEditTextE = iterator.next();
                BaseDrawer mDecorationB = newEditTextE.mDecorationBitmap;
                int i = -1;
                int width = (mDecorationB != null)? mDecorationB.getWidth(): -1;
                BaseDrawer mDecorationB1 = newEditTextE.mDecorationBitmap;
                if (mDecorationB1 != null) {
                   i = mDecorationB1.getHeight();
                }
                String outputFilePa = newEditTextE.getOutputFilePath();
                String str = ", ";
                Log.b("TextDraftUtil", newEditTextE.getLayerIndex()+" GenerateFile: "+width+str+i+str+outputFilePa);
                int layerIndex = newEditTextE.getLayerIndex();
                int i1 = 0;
                if (PatchProxy.isSupport(oh)) {
                   Object[] objArray = new Object[5];
                   objArray[i1] = Integer.valueOf(layerIndex);
                   objArray[1] = uoa;
                   objArray[2] = outputFilePa;
                   objArray[3] = Integer.valueOf(width);
                   objArray[4] = Integer.valueOf(i);
                   if (PatchProxy.applyVoid(objArray, obj, oh, "36")) {
                      continue ;
                   }
                }
                if (!uoa.z().size()) {
                   continue ;
                }else {
                   int i2 = l0.a.a(layerIndex, uoa);
                   if (i2 < 0) {
                      Object[] objArray1 = new Object[i1];
                      a.D().t("TextDraftUtil", "updateTextBitmapInfo textDraftPosition is invalid", objArray1);
                   }else {
                      Log.b("TextDraftUtil", "updateTextBitmapInfo: "+layerIndex+str+outputFilePa);
                      GeneratedMessageLite$Builder uBuilder = uoa.n(i2);
                      a.o(uBuilder, "textDraft.getBuilder\(index\)");
                      StickerResult$b uob = uBuilder.getResult().toBuilder();
                      a.o(uob, "stickerBuilder");
                      uob.l(uoa.Q(outputFilePa));
                      if (width > 0) {
                         uob.r((double)width);
                      }
                      if (i > 0) {
                         uob.q((double)i);
                      }
                      uob.build();
                      uBuilder.j(uob);
                      uBuilder.build();
                   }
                }
             }
          }
          if (this.commit != null) {
             uoa.f();
          }
          a = b.a;
          telementList = this.elementList;
          ArrayList uArrayList = new ArrayList(u.Y(telementList, 10));
          iterator = telementList.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement<com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData>");
             uArrayList.add(obj);
          }
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, a, b.class, "1")) {
             PostFunnelManager.j.a().d().l(new TextFunnel$funnelText$$inlined$let$lambda$1(uArrayList));
          }
       }
       return;
    }
}
