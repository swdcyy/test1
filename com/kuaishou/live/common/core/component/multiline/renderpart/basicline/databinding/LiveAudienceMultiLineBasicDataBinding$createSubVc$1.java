package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBasicDataBinding$createSubVc$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBasicDataBinding;
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
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.show.multiline.LiveMultiLineCellLayoutDescription;
import java.lang.Math;
import java.util.NoSuchElementException;
import java.lang.Float;

public final class LiveAudienceMultiLineBasicDataBinding$createSubVc$1 extends Lambda implements a	// class@00154d
{
    public final LiveAudienceMultiLineBasicDataBinding this$0;

    public void LiveAudienceMultiLineBasicDataBinding$createSubVc$1(LiveAudienceMultiLineBasicDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceMultiLineBasicDataBinding$createSubVc$1 obj = PatchProxy.apply(null, this, LiveAudienceMultiLineBasicDataBinding$createSubVc$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = this.this$0;
       Map value = obj.m.v0().getValue();
       Objects.requireNonNull(obj);
       LiveMultiLineCellLayoutDescription obj1 = PatchProxy.applyOneRefs(value, obj, LiveAudienceMultiLineBasicDataBinding.class, "4");
       if (obj1 != patchProxyRe) {
          f = obj1.floatValue();
       }else if(value == null){
          f = 0x3f000000;
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
