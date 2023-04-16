package com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationDirectSeekAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.StickerResult;
import kotlin.Pair;
import java.lang.Number;
import wnd.h;
import hba.a;
import com.kuaishou.edit.draft.Text;
import wnd.g;
import jba.a;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationDirectSeekAction$a;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Integer;
import e17.i;

public final class DecorationDirectSeekAction extends EditSdkAction	// class@000a28
{
    public final boolean canCover;
    public final boolean commit;
    public final List elementList;
    public final boolean isSticker;
    public final double openingDuration;
    public final a rangeViewData;
    public final boolean toStart;
    public final double videoLength;

    public void DecorationDirectSeekAction(boolean p0,a p1,List p2,double p3,boolean p4,boolean p5,boolean p6,double p7){
       a.p(p1, "rangeViewData");
       a.p(p2, "elementList");
       super();
       this.toStart = p0;
       this.rangeViewData = p1;
       this.elementList = p2;
       this.videoLength = p3;
       this.canCover = p4;
       this.isSticker = p5;
       this.commit = p6;
       this.openingDuration = p7;
    }
    public void DecorationDirectSeekAction(boolean p0,a p1,List p2,double p3,boolean p4,boolean p5,boolean p6,double p7,int p8,u p9){
       int i = p8;
       boolean b = (i & 0x10)? true: p4;
       boolean b1 = (i & 0x20)? false: p5;
       double d = (i & 0x0080)? 0: p7;
       super(p0, p1, p2, p3, b, b1, p6, d);
       return;
    }
    public final boolean getCanCover(){
       return this.canCover;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final List getElementList(){
       return this.elementList;
    }
    public final double getOpeningDuration(){
       return this.openingDuration;
    }
    public final a getRangeViewData(){
       return this.rangeViewData;
    }
    public final boolean getToStart(){
       return this.toStart;
    }
    public final double getVideoLength(){
       return this.videoLength;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public void performAction(c p0,c p1){
       List obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationDirectSeekAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       double d = this.rangeViewData.j();
       String str = "it.result";
       Pair pair = null;
       if (this.isSticker != null) {
          a uoa = p0.U0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.stickerDraft ?: return");
             if (this.commit != null && !uoa.D()) {
                uoa.c0();
             }
             List list = uoa.z();
             a.o(list, "stickerDraft.messages");
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                StickerResult obj1 = obj;
                a.o(obj1, "it");
                obj1 = obj1.getResult();
                a.o(obj1, str);
                int i = (obj1.getZIndex() == this.rangeViewData.e())? 1: 0;
                if (i) {
                   pair = obj;
                   break ;
                }
             }
             if (pair != null) {
                Pair pair1 = this.updateTimeRange(d);
                h.p(uoa, this.rangeViewData.e(), pair1.getFirst().doubleValue(), pair1.getSecond().doubleValue());
             }
             if (this.commit != null) {
                uoa.f();
             }
          }else {
             return;
          }
       }else {
          a uoa1 = p0.W0();
          if (uoa1 != null) {
             a.o(uoa1, "workspaceDraft.textDraft?: return");
             if (this.commit != null && !uoa1.D()) {
                uoa1.c0();
             }
             obj = uoa1.z();
             a.o(obj, "textDraft.messages");
             Iterator iterator1 = obj.iterator();
             while (iterator1.hasNext()) {
                Object obj2 = iterator1.next();
                StickerResult obj3 = obj2;
                a.o(obj3, "it");
                obj3 = obj3.getResult();
                a.o(obj3, str);
                Object obj4 = (obj3.getZIndex() == this.rangeViewData.e())? 1: null;
                if (obj4) {
                   pair = obj2;
                   break ;
                }
             }
             if (pair != null) {
                pair = this.updateTimeRange(d);
                h.q(uoa1, this.rangeViewData.e(), pair.getFirst().doubleValue(), pair.getSecond().doubleValue());
                g.a.i(p0.Z0(), uoa1, this.rangeViewData.e(), pair.getFirst().doubleValue(), true);
             }
             if (this.commit != null) {
                uoa1.f();
             }
          }
       }
       return;
    }
    public final Pair updateTimeRange(double p0){
       double d3;
       Pair pair;
       int i2;
       Object obj = this;
       DecorationDirectSeekAction uDecorationD = DecorationDirectSeekAction.class;
       if (PatchProxy.isSupport(uDecorationD)) {
          Object obj1 = PatchProxy.applyOneRefs(Double.valueOf(p0), obj, uDecorationD, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       double d = obj.rangeViewData.h();
       double d1 = obj.rangeViewData.j();
       double d2 = 0;
       if (obj.canCover != null) {
          d = (obj.toStart != null)? d2: obj.rangeViewData.h();
          if (obj.toStart != null) {
             d1 = p0 + (obj.rangeViewData.h() - obj.openingDuration);
          }else {
             d1 = p0 + obj.videoLength;
             d3 = obj.rangeViewData.g();
          label_0128 :
             d1 = d1 - d3;
          }
       }else {
          List list = CollectionsKt___CollectionsKt.f5(obj.elementList, new DecorationDirectSeekAction$a());
          Iterator iterator = list.iterator();
          int i = 0;
          int i1 = 0;
          while (true) {
             if (iterator.hasNext()) {
                Object obj2 = iterator.next();
                Object obj3 = (obj2.l0() == obj.rangeViewData.e())? 1: null;
                if (obj3) {
                   pair = new Pair(Integer.valueOf(i1), obj2);
                label_0094 :
                   if (pair != null) {
                      Integer first = pair.getFirst();
                      if (first != null) {
                         i2 = first.intValue();
                      label_00a4 :
                         if (obj.toStart != null) {
                            if (i2 > 0) {
                               NewDecorationElementData newDecoratio = list.get((i2 - 1));
                               d2 = newDecoratio.m0() + newDecoratio.j0();
                               if (d2 - (double)i >= 0) {
                                  d = d2 + 0x3f50624dd2f1a9fc;
                                  d1 = (d2 - obj.openingDuration > 0)? (d1 + obj.rangeViewData.h()) - d2: (d1 + obj.rangeViewData.h()) - obj.openingDuration;
                                  d1 = d1 - 0x3f50624dd2f1a9fc;
                                  i.a(R.style.arg_RES_7f11066a, 0x7f100cc7);
                                  break ;
                               }
                            }else {
                               d1 = p0 + (obj.rangeViewData.h() - obj.openingDuration);
                               d = d2;
                               break ;
                            }
                         }else if(i2 < (list.size() - 1)){
                            d3 = list.get((i2 + 1)).m0();
                            if (d3 - obj.videoLength <= 0) {
                               d1 = ((p0 + d3) - obj.rangeViewData.g()) - 0x3f50624dd2f1a9fc;
                               i.a(R.style.arg_RES_7f11066a, 0x7f100cc7);
                               break ;
                            }
                         }else {
                            d1 = p0 + obj.videoLength;
                            d3 = obj.rangeViewData.g();
                            goto label_0128 ;
                         }
                      }
                   }
                   i2 = -1;
                   goto label_00a4 ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                pair = null;
                goto label_0094 ;
             }
          }
       }
       return new Pair(Double.valueOf(d), Double.valueOf(d1));
    }
}
