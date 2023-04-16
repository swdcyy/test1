package androidx.core.view.ViewKt$a;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ViewKt$a implements View$OnAttachStateChangeListener	// class@000721
{
    public final View b;
    public final l c;

    public void ViewKt$a(View p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       a.p(p0, "view");
    }
    public void onViewDetachedFromWindow(View p0){
       a.p(p0, "view");
       this.b.removeOnAttachStateChangeListener(this);
       this.c.invoke(p0);
    }
}
