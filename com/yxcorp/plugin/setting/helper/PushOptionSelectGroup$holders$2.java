package com.yxcorp.plugin.setting.helper.PushOptionSelectGroup$holders$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.helper.PushOptionSelectGroup;
import java.util.Map;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.SwitchItem;
import com.yxcorp.gifshow.model.SelectOption;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Objects;
import java.lang.Boolean;
import xgc.i;
import xgc.i$a;
import wgc.o;
import java.util.Collection;

public final class PushOptionSelectGroup$holders$2 extends Lambda implements a	// class@0008b2
{
    public final Map $optionMaps;
    public final PushOptionSelectGroup this$0;

    public void PushOptionSelectGroup$holders$2(PushOptionSelectGroup p0,Map p1){
       this.this$0 = p0;
       this.$optionMaps = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList uArrayList;
       i oi;
       List obj = PatchProxy.apply(null, this, PushOptionSelectGroup$holders$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$optionMaps.get(this.this$0.c().mSelectedOption.mType);
       if (obj != null) {
          uArrayList = new ArrayList(u.Y(obj, 10));
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             SelectOption selectOption = iterator.next();
             boolean b = (selectOption.mValue == this.this$0.c().mSelectedOption.mValue)? true: false;
             PushOptionSelectGroup$holders$2 tthis$0 = this.this$0;
             Objects.requireNonNull(tthis$0);
             PushOptionSelectGroup pushOptionSe = PushOptionSelectGroup.class;
             if (PatchProxy.isSupport(pushOptionSe)) {
                oi = PatchProxy.applyTwoRefs(selectOption, Boolean.valueOf(b), tthis$0, pushOptionSe, "2");
                if (oi != PatchProxyResult.class) {
                label_007f :
                   uArrayList.add(oi);
                }
             }
             i$a uoa = new i$a().b(selectOption, b, R.drawable.arg_RES_7f081084);
             uoa.c(tthis$0);
             oi = uoa.a();
             goto label_007f ;
          }
       }else {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
}
