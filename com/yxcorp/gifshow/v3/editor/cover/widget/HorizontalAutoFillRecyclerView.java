package com.yxcorp.gifshow.v3.editor.cover.widget.HorizontalAutoFillRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.v3.editor.cover.widget.HorizontalAutoFillRecyclerView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class HorizontalAutoFillRecyclerView extends RecyclerView	// class@000ee9
{
    public HashMap b;
    public static final HorizontalAutoFillRecyclerView$a c;

    static {
       HorizontalAutoFillRecyclerView.c = new HorizontalAutoFillRecyclerView$a(null);
    }
    public void HorizontalAutoFillRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void HorizontalAutoFillRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void HorizontalAutoFillRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       RecyclerView$Adapter obj = PatchProxy.applyOneRefs(p0, this, HorizontalAutoFillRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewGroup$LayoutParams layoutParams = super.generateLayoutParams(p0);
       if (this.getMeasuredWidth() > 0 && layoutParams.width > null) {
          obj = this.getAdapter();
          int itemCount = (obj != null)? obj.getItemCount(): 0;
          if (itemCount > 0) {
             RecyclerView$Adapter adapter = this.getAdapter();
             a.m(adapter);
             a.o(adapter, "adapter!!");
             float f = (float)this.getMeasuredWidth() / (float)adapter.getItemCount();
             float f1 = f / (float)layoutParams.width;
             if (f1 - 0x3f666666 >= 0 && f1 - 0x3f8ccccd <= 0) {
                layoutParams.width = (int)f;
             }
          }
       }
    label_0058 :
       a.o(layoutParams, "params");
       return layoutParams;
    }
}
