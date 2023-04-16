package com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment$userId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;

public final class ItemPreviewFragment$userId$2 extends Lambda implements a	// class@00130d
{
    public final ItemPreviewFragment this$0;

    public void ItemPreviewFragment$userId$2(ItemPreviewFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String str;
       b obj = PatchProxy.apply(null, this, ItemPreviewFragment$userId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.ch();
       if (obj != null) {
          str = obj.e("CREATION_USER_ID");
          if (str != null) {
          label_0023 :
             return str;
          }
       }
       str = "";
       goto label_0023 ;
    }
}
