package ond.d$h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ond.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.LongPictureSubViewBinder$resizeContainerView$1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lwc.h;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsoluteLayout;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ond.e;
import msd.a;

public final class d$h implements ViewTreeObserver$OnGlobalLayoutListener	// class@00202d
{
    public final d b;

    public void d$h(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$h.class, "1")) {
          return;
       }
       d f = this.b.f;
       String str = "mPictureRV";
       a.o(f, str);
       f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.b.J()) {
          return;
       }
       d$h tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (!PatchProxy.applyVoid(objArray, tb, uod, "6")) {
          LongPictureSubViewBinder$resizeContainerView$1 oresizeConta = new LongPictureSubViewBinder$resizeContainerView$1(tb);
          if (!PatchProxy.applyVoidOneRefs(oresizeConta, tb, uod, "7")) {
             int i = n.k(tb.n.requireActivity());
             int i1 = n.j(tb.n.requireActivity());
             d f1 = tb.f;
             a.o(f1, str);
             RecyclerView$Adapter adapter = f1.getAdapter();
             a.m(adapter);
             a.o(adapter, "mPictureRV.adapter!!");
             int itemCount = adapter.getItemCount();
             int i2 = 0;
             int i3 = 0;
             while (i2 < itemCount) {
                i3 = i3 + tb.I(tb.d.u0(i2)).c;
                if (i3 >= i1) {
                   break ;
                }
                i2 = i2 + 1;
             }
             itemCount = Math.min(i1, i3);
             if (i > 0 && itemCount > 0) {
                ViewGroup$LayoutParams layoutParams = tb.e.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = itemCount;
                tb.e.setLayoutParams(layoutParams);
             }
             Log.b("LongPictureSubViewBinder", "width: "+i+", height: "+itemCount);
             tb.e.getViewTreeObserver().addOnGlobalLayoutListener(new e(tb, oresizeConta));
          }
       }
       return;
    }
}
