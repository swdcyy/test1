package com.yxcorp.gifshow.prettify.makeup.FilterConfigViewV2;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Integer;

public class FilterConfigViewV2 extends PrettifyConfigView	// class@00115b
{

    public void FilterConfigViewV2(Context p0){
       super(p0);
    }
    public void FilterConfigViewV2(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FilterConfigViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, FilterConfigViewV2.class, "5")) {
          return;
       }
       this.d.setVisibility(8);
       this.c.removeItemDecorationAt(0);
       this.c.addItemDecoration(new b(0, this.getItemSpace(), this.getItemSpace()));
       PrettifyConfigView tc = this.c;
       tc.setPadding(tc.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), this.c.getPaddingBottom());
       return;
    }
    public int getConfigViewLayoutId(){
       return 0x7f0d0448;
    }
    public int getItemDividerHeight(){
       Object obj = PatchProxy.apply(null, this, FilterConfigViewV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc0);
    }
    public int getItemDividerWidth(){
       Object obj = PatchProxy.apply(null, this, FilterConfigViewV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070cc3);
    }
    public int getItemSpace(){
       Object obj = PatchProxy.apply(null, this, FilterConfigViewV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0703d5);
    }
    public void n(){
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(FilterConfigViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FilterConfigViewV2.class, "4")) {
          return;
       }
       this.c.addItemDecoration(new b(0, p0, p0));
       return;
    }
}
