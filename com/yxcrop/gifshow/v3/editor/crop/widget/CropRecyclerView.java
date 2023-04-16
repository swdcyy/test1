package com.yxcrop.gifshow.v3.editor.crop.widget.CropRecyclerView;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class CropRecyclerView extends ScrollToCenterRecyclerView	// class@000a26
{
    public HashMap d;

    public void CropRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1);
    }
    public float getRightFadingEdgeStrength(){
       return 0;
    }
}
