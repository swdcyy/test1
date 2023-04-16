package com.yxcorp.gifshow.prettify.beauty.BeautyConfigViewV2;
import com.yxcorp.gifshow.prettify.beauty.BeautyConfigView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Integer;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import m0c.m;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;

public class BeautyConfigViewV2 extends BeautyConfigView	// class@0010ef
{

    public void BeautyConfigViewV2(Context p0){
       super(p0);
    }
    public void BeautyConfigViewV2(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void BeautyConfigViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int getItemDividerHeight(){
       Object obj = PatchProxy.apply(null, this, BeautyConfigViewV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc0);
    }
    public int getItemDividerWidth(){
       Object obj = PatchProxy.apply(null, this, BeautyConfigViewV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc3);
    }
    public int getItemSpace(){
       Object obj = PatchProxy.apply(null, this, BeautyConfigViewV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0703d5);
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(BeautyConfigViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BeautyConfigViewV2.class, "4")) {
          return;
       }
       m om = new m(0, a1.d(0x7f070295), p0, this.getItemDividerWidth(), this.getItemDividerHeight(), 2);
       this.c.addItemDecoration(v8);
       return;
    }
}
