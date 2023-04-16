package com.yxcorp.gifshow.prettify.makeup.FilterConfigView;
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
import java.lang.Integer;

public class FilterConfigView extends PrettifyConfigView	// class@00115a
{

    public void FilterConfigView(Context p0){
       super(p0);
    }
    public void FilterConfigView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FilterConfigView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, FilterConfigView.class, "2")) {
          return;
       }
       this.d.setVisibility(8);
       this.c.removeItemDecorationAt(0);
       this.c.addItemDecoration(new b(0, this.getItemSpace(), this.getItemSpace()));
       this.c.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       return;
    }
    public int getConfigViewLayoutId(){
       return 0x7f0d0447;
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(FilterConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FilterConfigView.class, "1")) {
          return;
       }
       this.c.addItemDecoration(new b(0, p0, p0));
       return;
    }
}
