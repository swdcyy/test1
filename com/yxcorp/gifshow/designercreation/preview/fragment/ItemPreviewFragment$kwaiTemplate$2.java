package com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment$kwaiTemplate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;

public final class ItemPreviewFragment$kwaiTemplate$2 extends Lambda implements a	// class@00130c
{
    public final ItemPreviewFragment this$0;

    public void ItemPreviewFragment$kwaiTemplate$2(ItemPreviewFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final KwaiTemplate invoke(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, ItemPreviewFragment$kwaiTemplate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.ch();
       if (obj != null) {
          objArray = obj.b(KwaiTemplate.class);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
