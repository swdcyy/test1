package com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import android.view.MotionEvent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Float;
import kotlin.Pair;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import ltc.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import uld.g;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditVoteStickerDrawer;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import wba.h0;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.VoteStickerParam$b;
import com.kuaishou.edit.draft.VoteStickerParam;
import java.lang.Iterable;
import com.kuaishou.edit.draft.TagStickerParam$b;
import com.kuaishou.edit.draft.TagStickerParam;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import ktc.a;
import com.kuaishou.edit.draft.Sticker;
import di0.b;
import crd.a;
import brd.a0;
import faa.a;
import q87.c;
import t45.d;
import brd.z;
import ntc.d;
import erd.o;
import ntc.e;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import mtc.c;
import crd.b;

public final class StickerElementViewBinder$d extends DecorationContainerView$e	// class@001235
{
    public final StickerElementViewBinder a;

    public void StickerElementViewBinder$d(StickerElementViewBinder p0){
       this.a = p0;
       super();
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerElementViewBinder$d.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.d(p0, p1);
          if ((a.g(p1, Integer.valueOf(7)) ^ 0x01) && ((a.g(p1, Integer.valueOf(8)) ^ 0x01) && (a.g(p1, Integer.valueOf(9)) ^ 0x01))) {
             this.a.G().p0(p0, 5);
          }
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerElementViewBinder$d.class, "2")) {
       }else {
          super.k(p0, p1);
          if (this.a.E().getSelectDrawer() != null && (this.a.G().k == null && this.a.G().l == null)) {
             this.a.E().R();
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       Pair pair;
       Size obj2;
       String question;
       int i3;
       EditStickerBaseDrawerData stickerBaseE;
       TimeRange$b uob;
       TimeRange timeRange;
       h0 oh0;
       float f1;
       float f2;
       int layerIndex;
       String str1;
       a uoa1;
       Object[] objArray2;
       a a;
       GeneratedMessageLite$Builder uBuilder;
       GeneratedMessageLite$Builder uBuilder1;
       VoteStickerParam$b uob1;
       TagStickerParam$b uob2;
       ListHolder value;
       List list;
       a uoa2;
       GeneratedMessageLite generatedMes;
       String decorationFi;
       Object obj = this;
       StickerElementViewBinder$d obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerElementViewModel stickerEleme = StickerElementViewModel.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, StickerElementViewBinder$d.class, "3")) {
       }else {
          super.l(obj1);
          if (obj1 != null) {
             StickerElementViewModel stickerEleme1 = obj.a.G();
             Objects.requireNonNull(stickerEleme1);
             float f = 0x3f800000;
             int i = 0;
             if (!PatchProxy.isSupport(stickerEleme) || !PatchProxy.applyVoidTwoRefs(obj1, Float.valueOf(f), stickerEleme1, stickerEleme, "12")) {
                a.p(obj1, "drawer");
                String str = "";
                if (PatchProxy.isSupport(stickerEleme)) {
                   pair = PatchProxy.applyTwoRefs(obj1, Float.valueOf(f), stickerEleme1, stickerEleme, "14");
                   if (pair != patchProxyRe) {
                   label_009d :
                      ArrayList uArrayList = new ArrayList();
                      if (obj1 instanceof EditVoteStickerDrawer) {
                         obj2 = obj1;
                         question = obj2.getQuestion();
                         a.o(question, "drawer.question");
                         uArrayList.addAll(obj2.getOptions());
                      }else {
                         question = str;
                      }
                      if (obj1 instanceof EditTagStickerElement) {
                         str = obj1.getContent();
                      }
                      obj2 = pair.getSecond();
                      int i1 = 1;
                      int i2 = 3;
                      f = 6;
                      if (!PatchProxy.applyVoidTwoRefs(obj1, obj2, stickerEleme1, stickerEleme, "13")) {
                         i3 = obj1.getEditStickerType();
                         if (i3 == i1 || (i3 == i2 || i3 == f)) {
                            Size b = obj2.b;
                            if (b > null && obj2.c > null) {
                               obj1.setStickerOriginWidth((float)b);
                               obj1.setStickerOriginHeight((float)obj2.c);
                            }
                         }
                      }
                      Size second = pair.getSecond();
                      String first = pair.getFirst();
                      i3 = 4;
                      int i4 = 5;
                      int i5 = 7;
                      int i6 = 2;
                      if (PatchProxy.isSupport(stickerEleme)) {
                         Object[] objArray1 = new Object[i5];
                         objArray1[i] = obj1;
                         objArray1[i1] = second;
                         objArray1[i6] = first;
                         objArray1[i2] = question;
                         objArray1[i3] = uArrayList;
                         objArray1[i4] = str;
                         int i7 = 6;
                         objArray1[i7] = Integer.valueOf(i7);
                         if (!PatchProxy.applyVoid(objArray1, stickerEleme1, stickerEleme, "17")) {
                         }
                      }else {
                      }
                   }
                }
                int i8 = -1;
                Size size = new Size(i8, i8);
                if (obj1.isNeedReGenerateFile()) {
                   obj1.generateDecorationBitmap(f, stickerEleme1.d, stickerEleme1.p.b());
                   BaseDrawer mDecorationB = obj1.mDecorationBitmap;
                   int width = (mDecorationB != null)? mDecorationB.getWidth(): -1;
                   size.b = width;
                   mDecorationB = obj1.mDecorationBitmap;
                   if (mDecorationB != null) {
                      i8 = mDecorationB.getHeight();
                   }
                   size.c = i8;
                   stickerEleme1.a.a(obj1);
                   decorationFi = obj1.getDecorationFilePath();
                   a.o(decorationFi, "drawer.decorationFilePath");
                   obj1.setNeedReGenerateFile(i);
                }else {
                   decorationFi = str;
                }
                pair = new Pair(decorationFi, size);
                goto label_009d ;
             }
          label_02a7 :
             obj1 = obj.a;
             if (obj1.j != null) {
                a uoa = obj1.F();
                stickerEleme1 = obj.a.G();
                Objects.requireNonNull(stickerEleme1);
                a0 uoa0 = PatchProxy.apply(null, stickerEleme1, stickerEleme, "16");
                if (uoa0 != patchProxyRe) {
                }else {
                   Object[] objArray = new Object[0];
                   a.D().w("StickerElementViewModel", "waitAllTaskCompleteAndCommitDraft start", objArray);
                   uoa0 = stickerEleme1.a.h().G(d.a).C(d.b).m(new e(stickerEleme1));
                   a.o(uoa0, "decorationDrawerFileMana¡­mitDraft complete\"\)\n    }");
                }
                uoa.c(uoa0.G(d.a).R(Functions.d(), c.b));
             }
          }
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof EditStickerBaseDrawer;
    }
}
