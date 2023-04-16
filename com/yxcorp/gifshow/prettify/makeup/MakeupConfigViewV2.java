package com.yxcorp.gifshow.prettify.makeup.MakeupConfigViewV2;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class MakeupConfigViewV2 extends PrettifyConfigView	// class@00115c
{

    public void MakeupConfigViewV2(Context p0){
       super(p0);
    }
    public void MakeupConfigViewV2(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MakeupConfigViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int getConfigViewLayoutId(){
       return 0x7f0d119a;
    }
    public int getItemDividerHeight(){
       Object obj = PatchProxy.apply(null, this, MakeupConfigViewV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc0);
    }
    public int getItemDividerWidth(){
       Object obj = PatchProxy.apply(null, this, MakeupConfigViewV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc3);
    }
    public int getItemSpace(){
       Object obj = PatchProxy.apply(null, this, MakeupConfigViewV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0703d5);
    }
}
