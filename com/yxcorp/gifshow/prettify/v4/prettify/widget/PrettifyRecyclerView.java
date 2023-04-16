package com.yxcorp.gifshow.prettify.v4.prettify.widget.PrettifyRecyclerView;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import android.content.Context;
import android.util.AttributeSet;

public class PrettifyRecyclerView extends ScrollToCenterRecyclerView	// class@0011da
{

    public void PrettifyRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public float getRightFadingEdgeStrength(){
       return 0;
    }
}
