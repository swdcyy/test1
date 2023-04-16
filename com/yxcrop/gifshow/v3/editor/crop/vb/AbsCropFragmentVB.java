package com.yxcrop.gifshow.v3.editor.crop.vb.AbsCropFragmentVB;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;

public abstract class AbsCropFragmentVB extends BaseViewBinder	// class@000a1e
{
    public View e;
    public ExpandFoldHelperView f;
    public ScrollToCenterRecyclerView g;
    public View h;
    public View i;

    public void AbsCropFragmentVB(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public final View A(){
       return this.e;
    }
    public final ExpandFoldHelperView y(){
       return this.f;
    }
    public final View z(){
       return this.h;
    }
}
