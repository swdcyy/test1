package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import ir1.c;
import java.util.Map;
import java.util.Objects;
import com.yxcorp.utility.SystemUtil;
import java.lang.Exception;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.show.multiline.LiveMultiLineCellLayoutDescription;
import java.lang.Math;
import java.util.NoSuchElementException;
import java.lang.Float;

public final class LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3 extends Lambda implements a	// class@001569
{
    public final LiveAudienceMultiLineGiftBattleDataBinding this$0;

    public void LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3(LiveAudienceMultiLineGiftBattleDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3 obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleDataBinding$createSubVc$3.class, "1");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = this.this$0;
       Map value = obj.o.v0().getValue();
       Objects.requireNonNull(obj);
       LiveMultiLineCellLayoutDescription obj1 = PatchProxy.applyOneRefs(value, obj, LiveAudienceMultiLineGiftBattleDataBinding.class, "5");
       if (obj1 != patchProxyRe) {
          f = obj1.floatValue();
       }else if(value == null){
          if (!SystemUtil.I()) {
             f = 0x3f000000;
          }else {
             throw new Exception("getMinWidgetWidth, layoutDescMap null !!! ");
          }
       }else {
          Iterator iterator = value.values().iterator();
          if (iterator.hasNext()) {
             obj1 = iterator.next();
             float ratioEndX = obj1.getRatioEndX();
             ratioEndX = ratioEndX - obj1.getRatioStartX();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                float ratioEndX1 = obj1.getRatioEndX();
                ratioEndX1 = ratioEndX1 - obj1.getRatioStartX();
                ratioEndX = Math.min(ratioEndX, ratioEndX1);
             }
             f = ratioEndX;
          }else {
             throw new NoSuchElementException();
          }
       }
       return f;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}