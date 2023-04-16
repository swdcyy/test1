package com.yxcorp.gifshow.v3.editor.prettify.filter.EditPrettifyConfigView;
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
import lnc.a1;
import android.view.View;
import java.lang.Integer;

public class EditPrettifyConfigView extends PrettifyConfigView	// class@00115f
{

    public void EditPrettifyConfigView(Context p0){
       super(p0);
    }
    public void EditPrettifyConfigView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void EditPrettifyConfigView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, EditPrettifyConfigView.class, "3")) {
          return;
       }
       this.d.setVisibility(8);
       this.c.removeItemDecorationAt(0);
       this.c.addItemDecoration(new b(0, this.getItemSpace(), this.getItemSpace()));
       this.c.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       return;
    }
    public int getConfigViewLayoutId(){
       return 0x7f0d034b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, EditPrettifyConfigView.class, "1")) {
          return;
       }
       this.f.setPadding(0, a1.e(52.00f), 0, 0);
       return;
    }
    public void setItemDecoration(int p0){
       if (PatchProxy.isSupport(EditPrettifyConfigView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditPrettifyConfigView.class, "2")) {
          return;
       }
       this.c.addItemDecoration(new b(0, p0, p0));
       return;
    }
}
