package amd.b;
import java.lang.Object;
import xld.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xvc.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import uvc.a;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.util.List;
import java.util.Map;
import jod.a;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerTimeAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationUpdatePlayerTimeStateAction;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineOtherClickAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineUserSeekAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectActionV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineRangeClickAction;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationHandlerAdjustAction;
import java.util.NoSuchElementException;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveStartAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleStartAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleEndAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineAttachAction;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineAttachAction;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineDetachAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationContainerLimitRectAction;

public final class b	// class@00006d
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (p0.o() >= 0)? true: false;
       return b;
    }
    public final a b(b p0,a p1){
       boolean b;
       a uoa;
       boolean b1;
       a uoa1;
       double d1;
       a uoa2;
       a obj4;
       double d2;
       Object obj = this;
       Iterator obj1 = p0;
       Iterator obj2 = p1;
       Iterator obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, b.class, "1");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a.p(obj1, "action");
       a.p(obj2, "oldState");
       if (obj1 instanceof UpdatePlayerStateAction) {
          return a.b(p1, false, null, null, null, null, 0, a.b(p1.a(), 0, obj1.isPlay(), obj1.getUpdateTo(), 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
       }
       if (obj1 instanceof UpdatePlayerTimeAction) {
          return a.b(p1, false, null, null, null, null, 0, a.b(p1.a(), obj1.getCurrentTime(), false, obj1.getUpdateTo(), 2, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
       }
       b = false;
       if (obj1 instanceof DecorationUpdatePlayerTimeStateAction) {
          if (obj1.isPlay()) {
             obj3 = p1.r().b().iterator();
             while (obj3.hasNext()) {
                obj3.next().B(b);
             }
          }
          return a.b(p1, 0, null, null, null, null, 0, p1.a().a(obj1.getCurrentTime(), obj1.isPlay(), obj1.getUpdateTo()), null, 0, false, false, false, 0, null, 0, 0, 0, null, false, 0x7ffbf, null);
       }else if(obj1 instanceof DecorationTimelineOtherClickAction){
          obj1 = p1.r().b().iterator();
          while (obj1.hasNext()) {
             obj1.next().B(b);
          }
          return a.b(p1, false, null, null, null, null, -1, a.b(p1.a(), 0, false, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ff9f, null);
       }else if(obj1 instanceof DecorationTimelineUserSeekAction){
          return a.b(p1, false, null, null, null, null, 0, p1.a().a(obj1.getCurrentTime(), obj1.isPlay(), obj1.getUpdateTo()), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
       }else {
          int i = 1;
          if (obj1 instanceof DecorationSelectAction) {
             obj2 = p1.r().b().iterator();
             while (obj2.hasNext()) {
                uoa = obj2.next();
                b1 = (uoa.e() == obj1.getLayerIndex())? true: false;
                uoa.B(b1);
             }
             return a.b(p1, false, null, null, null, null, obj1.getLayerIndex(), a.b(p1.a(), 0, false, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ff9f, null);
          }else if(obj1 instanceof DecorationSelectActionV3){
             obj2 = p1.r().b().iterator();
             while (obj2.hasNext()) {
                uoa = obj2.next();
                b1 = (uoa.e() == obj1.getLayerIndex())? true: false;
                uoa.B(b1);
             }
             return a.b(p1, false, null, null, null, null, obj1.getLayerIndex(), a.b(p1.a(), 0, false, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ff9f, null);
          }else if(obj1 instanceof DecorationUnSelectAction){
             obj1 = p1.r().b().iterator();
             while (obj1.hasNext()) {
                obj1.next().B(b);
             }
             uoa1 = (!p1.s())? a.b(p1.a(), 0, true, UpdateTo.PLAYER, 1, null): p1.a();
             return a.b(p1, false, null, null, null, null, -1, uoa1, null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ff9f, null);
          }else if(obj1 instanceof DecorationTimelineRangeClickAction){
             obj2 = p1.r().b().iterator();
             while (obj2.hasNext()) {
                uoa = obj2.next();
                b1 = (uoa.e() == obj1.getRangeViewData().e())? true: false;
                uoa.B(b1);
             }
             double d = (p1.a().c() - obj1.getRangeViewData().h() >= 0 && p1.a().c() - obj1.getRangeViewData().g() <= 0)? p1.a().c(): obj1.getCurrentTime();
             return a.b(p1, false, null, null, null, null, obj1.getRangeViewData().e(), p1.a().a(d, b, obj1.getUpdateTo()), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ff9f, null);
          }else if(obj1 instanceof DecorationHandlerAdjustAction){
             d1 = p1.a().c();
             obj2 = p1.r().b().iterator();
             while (true) {
                if (!obj2.hasNext()) {
                   throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                uoa2 = obj2.next();
                obj4 = obj1;
                int i1 = (uoa2.e() == obj4.getRangeView().e())? 1: 0;
                if (i1) {
                   d2 = 0x3f50624dd2f1a9fc;
                   int i2 = 0;
                   if (obj4.getPendingStartChanged() - i2) {
                      d1 = uoa2.h() + d2;
                   }
                   if (obj4.getPendingLengthChanged() - i2) {
                      d1 = uoa2.g() - d2;
                      break ;
                   }
                   break ;
                }
             }
             return a.b(p1, false, null, null, null, null, 0, a.b(p1.a(), d1, false, UpdateTo.PLAYER, 2, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
          }else if(obj1 instanceof DecorationMoveStartAction){
             return a.b(p1, false, null, null, null, null, 0, a.b(p1.a(), 0, false, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
          }else if(obj1 instanceof DecorationMoveEndAction){
             d1 = 0;
             b1 = 0;
             uoa2 = 0;
             d2 = 0;
             obj4 = p1.a();
             double d3 = 0;
             boolean b2 = (!obj.a(p1) && !p1.s())? true: false;
             return a.b(p1, false, d1, b1, uoa2, d2, 0, a.b(obj4, d3, b2, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
          }else if(obj1 instanceof DecorationScaleStartAction){
             return a.b(p1, false, null, null, null, null, 0, a.b(p1.a(), 0, false, UpdateTo.PLAYER, 1, null), null, 0, false, false, false, 0, null, 0, 0, 0, null, false, 0x7ffbf, null);
          }else if(obj1 instanceof DecorationScaleEndAction){
             return a.b(p1, false, 0, 0, 0, 0, 0, a.b(p1.a(), 0, (obj.a(p1) ^ i), UpdateTo.PLAYER, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbf, null);
          }else if(obj1 instanceof DecorationTimelineAttachAction || obj1 instanceof PhotoMovieDecorationTimelineAttachAction){
             EditBaseDrawerData uEditBaseDra = null;
             obj2 = p1.i().iterator();
             while (obj2.hasNext()) {
                NewDecorationElementData newDecoratio = obj2.next();
                if (newDecoratio.l0() == p1.o()) {
                   uEditBaseDra = newDecoratio;
                }
             }
             double d4 = (uEditBaseDra != null)? uEditBaseDra.m0(): p1.a().c();
             return a.b(p1, true, null, null, null, null, 0, p1.a().a(d4, b, UpdateTo.BOTH), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbe, null);
          }else if(obj1 instanceof DecorationTimelineDetachAction || obj1 instanceof PhotoMovieDecorationTimelineDetachAction){
             return a.b(p1, false, null, null, null, null, 0, a.b(p1.a(), 0, true, UpdateTo.BOTH, 1, null), null, 0, false, false, false, false, null, 0, 0, 0, null, false, 0x7ffbe, null);
          }else if(obj1 instanceof DecorationContainerLimitRectAction){
             uoa1 = (obj1.getContainerLimitRect() != null)? a.b(p1, false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, obj1.getContainerLimitRect(), false, 0x5ffff, null): p1;
             return uoa1;
          }else {
             return p1;
          }
       }
    }
}
