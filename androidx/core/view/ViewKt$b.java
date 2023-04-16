package androidx.core.view.ViewKt$b;
import android.view.View$OnLayoutChangeListener;
import msd.l;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ViewKt$b implements View$OnLayoutChangeListener	// class@000723
{
    public final l b;

    public void ViewKt$b(l p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       a.p(p0, "view");
       p0.removeOnLayoutChangeListener(this);
       this.b.invoke(p0);
    }
}
