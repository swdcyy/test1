package kx8.f;
import erd.g;
import com.yxcorp.gifshow.activity.web.OperateLazyLoadFragmentContainerNew;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewParent;
import android.view.ViewGroup;

public final class f implements g	// class@002c3c
{
    public final OperateLazyLoadFragmentContainerNew b;

    public void f(OperateLazyLoadFragmentContainerNew p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, OperateLazyLoadFragmentContainerNew.class, "9")) {
       }else {
          int i = - p0.intValue();
          if (tb.getView() != null && (tb.getView().getParent() != null && tb.getView().getParent().getParent() != null)) {
             ViewGroup parent = tb.getView().getParent().getParent();
             if (i >= 0) {
                parent.setClipToPadding(true);
                parent.setClipChildren(true);
                tb.getView().setTranslationY(0);
             }else {
                parent.setClipToPadding(false);
                parent.setClipChildren(false);
                tb.getView().setTranslationY((float)i);
             }
          }
       }
       return;
    }
}
