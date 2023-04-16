package hnd.d;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import xvc.b;
import zmd.a;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import amd.b;
import xld.a;
import mod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleInitAction;
import oa0.a;
import java.util.Map;
import uvc.a;
import jod.a;
import android.graphics.RectF;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationTipShowAction;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerTimeAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationUpdatePlayerTimeStateAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleListScrollAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectActionV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineRangeClickAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineAttachAction;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleItemClickAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleItemTimeClickAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleAttachAction;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachActionV3;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRetryAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleCancelAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecFailedAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecSuccessAction;
import com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo$SubtitleInfo;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecSuccessActionV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditStartAction;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextFontChangeActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextColorChangeActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextAlignTypeChangeActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontChangeActionV3;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleClearActionV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TemplateLoadedAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.KeyboardPanelFoldButtonClickedAction;
import com.yxcrop.gifshow.v3.editor.text_v2.action.DeleteTextActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelOpenActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelCloseActionV3;

public final class d	// class@000f99
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final int a(int p0,double p1,List p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), p2, this, d.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       Iterator iterator = p2.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return p0;
          }
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (obj1.h() - p1 <= 0 && p1 - obj1.g() <= 0) {
             break ;
          }else {
             i = i1;
          }
       }
       return i;
    }
    public final a b(b p0,a p1){
       boolean b;
       int i1;
       int i2;
       double d;
       UpdateTo obj4;
       Object obj5;
       boolean i3;
       NewTextBaseElementData obj6;
       double d1;
       int i6;
       int i7;
       SubtitleStatus nO_NETWORK;
       List list;
       boolean b3;
       Object obj7;
       UpdateTo updateTo;
       a uoa4;
       NewTextBaseElementData newTextBaseE1;
       boolean b4;
       Object obj = this;
       Iterator obj1 = p0;
       Iterator obj2 = p1;
       a obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, d.class, "1");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a.p(obj1, "action");
       a.p(obj2, "oldState");
       Object[] objArray = new Object[0];
       a.D().s("SubtitlePanelListVB", "action : "+p0.getClass().getSimpleName(), objArray);
       a uoa = a.x(p1, b.a.b(obj1, obj2), false, 0, null, a.a(p1.C(), false, false, false, 0, null, false, null, null, 253, null), null, null, null, false, 0, false, 0, false, 8174, null);
       int i = 1;
       if (obj1 instanceof SubtitleInitAction) {
          b = (a.k() - (long)5 < 0)? true: false;
          return a.y(uoa, false, null, null, null, null, 0, null, null, 0, false, false, b, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3ffff7ff, null);
       }else if(obj1 instanceof DecorationTipShowAction){
          a.L0((a.k() + 1));
          return a.y(uoa, false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3ffff7ff, null);
       }else if(obj1 instanceof UpdatePlayerTimeAction){
          i1 = obj.a(uoa.z(), obj1.getCurrentTime(), uoa.r().b());
          i2 = (!uoa.s() && (uoa.E() && i1 < uoa.r().b().size()))? uoa.r().b().get(i1).e(): uoa.o();
          return a.y(uoa, false, null, null, null, null, i2, null, null, 0, false, false, false, false, null, 0, 0, 0, null, false, i1, null, null, null, null, null, false, 0, false, null, false, 0x3ff7ffdf, null);
       }else if(obj1 instanceof DecorationUpdatePlayerTimeStateAction){
          return a.x(uoa, null, false, obj.a(uoa.z(), obj1.getCurrentTime(), uoa.r().b()), null, null, null, null, null, false, 0, false, null, false, 8187, null);
       }else if(obj1 instanceof SubtitleListScrollAction){
          if (obj1.getIndex() >= uoa.r().b().size()) {
             return uoa;
          }else {
             return a.y(uoa, false, null, null, null, null, uoa.r().b().get(obj1.getIndex()).e(), uoa.a().a(uoa.r().b().get(obj1.getIndex()).h(), false, UpdateTo.PLAYER), null, 0, false, false, false, false, null, 0, 0, 0, null, false, obj1.getIndex(), null, null, null, null, null, false, 0, false, null, false, 0x3ff7ff9f, null);
          }
       }else {
          boolean b1 = false;
          d = 0;
          a uoa1 = null;
          if (obj1 instanceof DecorationSelectAction) {
             obj2 = uoa.r().b().iterator();
             while (obj2.hasNext()) {
                obj4 = obj2.next();
                obj5 = (obj4.e() == obj1.getLayerIndex())? 1: null;
                if (obj5) {
                   uoa1 = obj4;
                   break ;
                }
             }
             i1 = uoa.z();
             if (uoa1 != null) {
                d = uoa1.h();
             }
             return a.x(uoa, null, false, obj.a(i1, d, uoa.r().b()), null, null, null, null, null, false, 0, false, null, false, 8187, null);
          }else if(obj1 instanceof DecorationSelectActionV3){
             NewTextBaseElementData newTextBaseE = h.l(uoa.i(), uoa.o());
             DraftTextStyleInfo uDraftTextSt = (newTextBaseE != null)? newTextBaseE.G0(): uoa1;
             obj2 = uoa.r().b().iterator();
             while (obj2.hasNext()) {
                obj4 = obj2.next();
                obj5 = (obj4.e() == obj1.getLayerIndex())? 1: null;
                if (obj5) {
                   uoa1 = obj4;
                   break ;
                }
             }
             i1 = uoa.z();
             if (uoa1 != null) {
                d = uoa1.h();
             }
             return a.x(uoa, null, false, obj.a(i1, d, uoa.r().b()), null, null, uDraftTextSt, null, null, false, 0, false, null, false, 8155, null);
          }else if(obj1 instanceof DecorationTimelineRangeClickAction){
             return a.x(uoa, null, false, obj.a(uoa.z(), obj1.getCurrentTime(), uoa.r().b()), null, null, null, null, null, false, 0, false, null, false, 8187, null);
          }else {
             obj4 = -1;
             if (obj1 instanceof DecorationTimelineAttachAction) {
                obj1 = uoa.i().iterator();
                i2 = 0;
                i3 = -1;
                while (obj1.hasNext()) {
                   obj6 = obj1.next();
                   int i4 = i2 + 1;
                   if (i2 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (obj6.l0() == uoa.o()) {
                      i3 = i2;
                      uoa1 = obj6;
                   }
                   i2 = i4;
                }
                d1 = (uoa1 != null)? uoa1.m0(): uoa.a().c();
                if (i3 > obj4 && i3 < (uoa.r().b().size() - i)) {
                   uoa.r().b().get(i3).B(i);
                }
                return a.y(uoa, true, null, null, null, null, 0, uoa.a().a(d1, b1, UpdateTo.BOTH), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3fffffbe, null);
             }else if(obj1 instanceof SubtitleItemClickAction){
                if (obj1.getPosition() >= uoa.r().b().size()) {
                   return uoa;
                }else {
                   return a.y(uoa, false, null, null, null, null, uoa.r().b().get(obj1.getPosition()).e(), a.b(uoa.a(), uoa.r().b().get(obj1.getPosition()).h(), false, UpdateTo.BOTH, 2, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, obj1.getPosition(), null, null, null, null, null, false, 0, false, null, false, 0x3ff7ff9f, null);
                }
             }else if(obj1 instanceof SubtitleItemTimeClickAction){
                double d2 = obj1.getTextElementData().m0();
                obj2 = uoa.r().b().iterator();
                while (obj2.hasNext()) {
                   obj3 = obj2.next();
                   boolean b2 = (obj3.e() == obj1.getTextElementData().l0())? true: false;
                   obj3.B(b2);
                }
                return a.y(uoa, true, null, null, null, null, obj1.getTextElementData().l0(), a.b(uoa.a(), d2, false, UpdateTo.BOTH, 2, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3fffff9e, null);
             }else if(obj1 instanceof SubtitleAttachAction){
                SubtitleStatus sUCCESS = (uoa.i().isEmpty() ^ i)? SubtitleStatus.SUCCESS: uoa.A();
                if (sUCCESS == SubtitleStatus.CLEAR) {
                   sUCCESS = SubtitleStatus.IDLE;
                }
                i2 = uoa.o();
                int i5 = uoa.z();
                if (uoa.z() && uoa.z() < uoa.i().size()) {
                   d = uoa.i().get(uoa.z()).m0();
                   i6 = uoa.i().get(uoa.z()).l0();
                   i7 = obj.a(i5, d, uoa.r().b());
                }else if(sUCCESS == SubtitleStatus.SUCCESS && (uoa.i().isEmpty() ^ i)){
                   d = uoa.i().get(b1).m0();
                   i6 = uoa.i().get(b1).l0();
                   i7 = 0;
                }else {
                   i6 = i2;
                   i7 = i5;
                }
                return a.y(uoa, false, null, null, null, null, i6, uoa.a().a(d, b1, UpdateTo.BOTH), null, 0, false, false, false, false, null, 0, 0, 0, null, true, i7, null, null, null, sUCCESS, null, false, 0, false, null, false, 0x3f73ff9f, null);
             }else if(obj1 instanceof SubtitleDetachAction || obj1 instanceof SubtitleDetachActionV3){
                return a.y(uoa, false, null, null, null, null, 0, a.b(uoa.a(), 0, true, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x1ffbffbf, null);
             }else if(obj1 instanceof SubtitleRetryAction){
                nO_NETWORK = SubtitleStatus.NO_NETWORK;
                SubtitleStatus subtitleStat = (uoa.A() != nO_NETWORK)? SubtitleStatus.IDLE: nO_NETWORK;
                return a.x(uoa, null, false, 0, null, null, null, subtitleStat, null, false, 0, false, null, false, 8127, null);
             }else if(obj1 instanceof SubtitleCancelAction){
                return a.y(uoa, false, null, null, null, null, 0, a.b(uoa.a(), 0, true, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3ffbffbf, null);
             }else if(obj1 instanceof SubtitleRecFailedAction){
                return a.x(uoa, null, false, 0, null, null, null, obj1.getSubtitleStatus(), null, false, 0, false, null, false, 8127, null);
             }else {
                i3 = 4;
                if (obj1 instanceof SubtitleRecSuccessAction) {
                   SubtitleRecSuccessAction subtitleRecS = uoa.i().get(b1).l0();
                   list = obj1.getList();
                   b3 = (list.get(b1).getType() == i3)? true: false;
                   return a.y(uoa, false, null, null, null, null, subtitleRecS, a.b(uoa.a(), (double)list.get(b1).getStartTime(), false, UpdateTo.PLAYER, 2, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, SubtitleStatus.SUCCESS, null, b3, 0, false, null, false, 0x3d77ff9f, null);
                }else if(obj1 instanceof SubtitleRecSuccessActionV3){
                   SubtitleRecSuccessActionV3 subtitleRecS1 = uoa.i().get(b1).l0();
                   list = obj1.getList();
                   obj6 = h.l(uoa.i(), subtitleRecS1);
                   DraftTextStyleInfo uDraftTextSt1 = (obj6 != null)? obj6.G0(): uoa1;
                   b3 = (list.get(b1).getType() == i3)? true: false;
                   return a.y(uoa, false, null, null, null, null, subtitleRecS1, a.b(uoa.a(), (double)list.get(b1).getStartTime(), false, UpdateTo.PLAYER, 2, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, uDraftTextSt1, SubtitleStatus.SUCCESS, null, b3, 0, false, null, false, 0x3d37ff9f, null);
                }else if(obj1 instanceof DecorationTimelineDetachAction){
                   return a.y(uoa, false, null, null, null, null, 0, a.b(uoa.a(), 0, false, UpdateTo.BOTH, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3fffffbe, null);
                }else if(obj1 instanceof TextEditStartAction){
                   a uoa2 = new a(true, false, false, obj1.getKeyboardOffset(), null, false, null, null, 246, null);
                   i1 = uoa.o();
                   obj2 = uoa.i().iterator();
                   while (obj2.hasNext()) {
                      obj7 = obj2.next();
                      updateTo = (obj7.l0() == i1)? 1: null;
                      if (updateTo) {
                         uoa1 = obj7;
                         break ;
                      }
                   }
                   d1 = (uoa1 != null)? uoa1.m0(): uoa.a().c();
                   return a.y(uoa, false, null, null, null, null, 0, uoa.a().a(d1, b1, UpdateTo.BOTH), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, v52, null, null, null, false, 0, false, null, false, 0x3fdfffbf, null);
                }else if(obj1 instanceof TextEditEndAction){
                   a uoa3 = obj1;
                   uoa4 = new a(false, false, false, 0, null, false, null, null, 255, null);
                   return a.x(uoa, null, false, 0, null, uoa3, null, null, null, false, 0, false, null, false, 8175, null);
                }else if(obj1 instanceof TextFontChangeActionV3 || (obj1 instanceof TextColorChangeActionV3 || obj1 instanceof TextAlignTypeChangeActionV3)){
                   newTextBaseE1 = h.l(uoa.i(), uoa.o());
                   if (newTextBaseE1 != null) {
                      return a.x(uoa, null, false, 0, null, null, newTextBaseE1.G0(), null, null, false, 0, false, null, false, 8159, null);
                   }
                }else if(obj1 instanceof TextDesignFontChangeActionV3){
                   newTextBaseE1 = h.l(uoa.i(), uoa.o());
                   if (newTextBaseE1 != null) {
                      return a.x(uoa, null, false, 0, null, null, newTextBaseE1.G0(), null, null, false, 0, false, null, false, 8159, null);
                   }
                }else if(obj1 instanceof SubtitleClearAction){
                   b4 = (obj1.getChangeTimelinePanelState())? false: uoa.s();
                   nO_NETWORK = (obj1.getCommit())? SubtitleStatus.CLEAR: SubtitleStatus.IDLE;
                   return a.y(uoa, b4, null, null, null, null, 0, a.b(uoa.a(), 0, obj1.getEnablePlaying(), UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, nO_NETWORK, null, false, 0, false, null, false, 0x3f7fffbe, null);
                }else if(obj1 instanceof SubtitleClearActionV3){
                   b4 = (obj1.getChangeTimelinePanelState())? false: uoa.s();
                   nO_NETWORK = (obj1.getCommit())? SubtitleStatus.CLEAR: SubtitleStatus.IDLE;
                   return a.y(uoa, b4, null, null, null, null, 0, a.b(uoa.a(), 0, obj1.getEnablePlaying(), UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, nO_NETWORK, null, false, 0, false, null, false, 0x3f7fffbe, null);
                }else if(obj1 instanceof TemplateLoadedAction){
                   return a.x(uoa, null, false, 0, null, null, null, null, null, false, 0, true, null, false, 7167, null);
                }else if(obj1 instanceof KeyboardPanelFoldButtonClickedAction){
                   return a.x(uoa, null, false, 0, null, a.a(uoa.C(), 0, 0, 0, 0, 0, obj1.isPanelOpen(), 0, 0, 223, 0), null, null, null, false, 0, false, null, false, 8175, null);
                }else if(obj1 instanceof DeleteTextActionV3){
                   if (uoa.E()) {
                      Object obj8 = obj1;
                      if (obj8.getNextLayerIndex() >= 0) {
                         obj1 = uoa.i().iterator();
                         while (obj1.hasNext()) {
                            obj7 = obj1.next();
                            Object obj9 = (obj7.l0() == obj8.getNextLayerIndex())? 1: null;
                            if (obj9) {
                               uoa1 = obj7;
                               break ;
                            }
                         }
                         d = (uoa1 != null)? uoa1.m0(): uoa.a().c();
                         uoa4 = a.y(uoa, false, null, null, null, null, obj8.getNextLayerIndex(), uoa.a().a(d, i, UpdateTo.PLAYER), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3fffff9f, null);
                      label_0ca4 :
                         return uoa4;
                      }
                   }
                   i6 = (obj1.getLayerIndex() == uoa.o())? -1: uoa.o();
                   uoa4 = a.y(uoa, false, null, null, null, null, i6, a.b(uoa.a(), 0, true, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, null, null, null, null, false, 0, false, null, false, 0x3fffff9f, null);
                   goto label_0ca4 ;
                }else if(obj1 instanceof TextPanelOpenActionV3){
                   a uoa5 = a.a(uoa.C(), true, false, true, 0, null, false, null, null, 250, null);
                   i1 = uoa.o();
                   obj2 = uoa.i().iterator();
                   while (obj2.hasNext()) {
                      obj7 = obj2.next();
                      updateTo = (obj7.l0() == i1)? 1: null;
                      if (updateTo) {
                         uoa1 = obj7;
                         break ;
                      }
                   }
                   d1 = (uoa1 != null)? uoa1.m0(): uoa.a().c();
                   return a.y(uoa, false, null, null, null, null, 0, uoa.a().a(d1, b1, UpdateTo.BOTH), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0, null, uoa5, null, null, null, false, 0, false, null, false, 0x3fdfffbf, null);
                }else if(obj1 instanceof TextPanelCloseActionV3){
                   return a.x(uoa, null, false, 0, null, a.a(uoa.C(), false, true, false, 0, null, false, null, null, 248, null), null, null, null, false, 0, false, null, false, 8175, null);
                }
                return uoa;
             }
          }
       }
    }
}
