package com.yxcorp.gifshow.editor.fine.tuning.widget.FineTuningRecyclerView;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class FineTuningRecyclerView extends ScrollToCenterRecyclerView	// class@001bad
{
    public HashMap d;

    public void FineTuningRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1);
    }
    public float getRightFadingEdgeStrength(){
       return 0;
    }
}
