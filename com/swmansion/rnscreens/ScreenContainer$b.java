package com.swmansion.rnscreens.ScreenContainer$b;
import com.facebook.react.modules.core.a$a;
import com.swmansion.rnscreens.ScreenContainer;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;

public class ScreenContainer$b extends a$a	// class@000ca6
{
    public final ScreenContainer c;

    public void ScreenContainer$b(ScreenContainer p0){
       this.c = p0;
       super();
    }
    public void a(long p0){
       ScreenContainer$b tc = this.c;
       tc.h = false;
       tc.measure(View$MeasureSpec.makeMeasureSpec(tc.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.c.getHeight(), 0x40000000));
       tc = this.c;
       tc.layout(tc.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
    }
}
