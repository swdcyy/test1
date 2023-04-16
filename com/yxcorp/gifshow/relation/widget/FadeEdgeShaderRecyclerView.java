package com.yxcorp.gifshow.relation.widget.FadeEdgeShaderRecyclerView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;

public class FadeEdgeShaderRecyclerView extends CustomFadeEdgeRecyclerView	// class@001a5e
{
    public int f;

    public void FadeEdgeShaderRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = 0xff000000;
       int i = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.B0, i, i);
       while (i < typedArray.getIndexCount()) {
          int index = typedArray.getIndex(i);
          if (!index) {
             this.f = typedArray.getColor(index, this.f);
          }
          i = i + 1;
       }
       return;
    }
    public int getSolidColor(){
       return this.f;
    }
}
