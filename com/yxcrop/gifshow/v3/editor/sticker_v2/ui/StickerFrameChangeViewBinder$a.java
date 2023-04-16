package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.Objects;
import java.lang.Integer;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import mmd.a;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.f;
import uwc.b;
import java.util.List;
import android.util.Pair;
import kotlin.jvm.internal.a;
import lwc.h;
import java.lang.Float;
import cmd.a;
import java.util.Collection;
import java.util.HashMap;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerAttachInfoAction;
import xvc.b;
import faa.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import nmd.o;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import nmd.p;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import lq.i;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import nmd.n;

public final class StickerFrameChangeViewBinder$a implements Observer	// class@000a96
{
    public final StickerFrameChangeViewBinder b;

    public void StickerFrameChangeViewBinder$a(StickerFrameChangeViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       List decorationDr;
       Iterator iterator;
       EditDecorationBaseDrawer uEditDecorat;
       EditDecorationBaseDrawer uEditDecorat1;
       Object[] objArray;
       Object[] objArray1;
       NewStickerElementData elementData;
       int i2;
       Pair second;
       int i3;
       Object obj = this;
       StickerFrameChangeViewBinder obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, StickerFrameChangeViewBinder$a.class, "1")) {
       }else if(obj1 != null){
          int i = obj1.getFirst().intValue();
          Object obj2 = obj1.getSecond();
          StickerFrameChangeViewBinder$a b = obj.b;
          Objects.requireNonNull(b);
          obj1 = StickerFrameChangeViewBinder.class;
          int i1 = 0;
          if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), b, obj1, "5")) {
             a uoa = b.f.o0().A();
             if (uoa != null) {
                ArrayList uArrayList = new ArrayList();
                if (f.E(b.j.getType())) {
                   List list = b.E().H0();
                   if (i >= 0 && i < list.size()) {
                      if (list.get(i).first != null) {
                         Pair first = list.get(i).first;
                         a.o(first, "assetIdentifierList[assetIndex].first");
                         uArrayList.add(first);
                      }
                      if (list.get(i).second != null) {
                         second = list.get(i).second;
                         a.o(second, "assetIdentifierList[assetIndex].second");
                         uArrayList.add(second);
                      }
                      second = new Pair(b.d.w0().get(i), Float.valueOf((b.d.q0(i) / b.d.r0(i))));
                   }
                }else {
                   uArrayList.addAll(a.a());
                   second = new Pair(b.d.C0(i1), Float.valueOf(b.d.p0(i1)));
                }
                Pair pair = second;
                uoa.a().put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", null, null, 0, null, null, 62, 0)).hashCode()), pair.getFirst());
                uoa.b().put(Integer.valueOf((CollectionsKt___CollectionsKt.V2(uArrayList, "", 0, 0, 0, 0, 0, 62, 0)).hashCode()), pair.getSecond());
                if (!f.E(b.j.getType())) {
                   Size value = b.d.y0().getValue();
                   value = (value != null)? value.b: b.e.getEditorRect().width();
                   try{
                      uoa.f(value);
                      b.f.t0(new UpdateStickerAttachInfoAction(uoa));
                   }catch(java.lang.Exception e0){
                      Object[] objArray2 = new Object[0];
                      a.D().A("StickerFrameChangeViewBinder", "UpdateStickerAttachInfoAction exception: "+e0.getMessage(), objArray2);
                      b.e.post(new o(b, uoa));
                   }
                }else {
                   b.e.post(new p(b, uoa));
                }
             }
          }
       }
    }
}
