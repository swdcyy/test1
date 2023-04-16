package ced.c0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.plugin.search.result.hashtag.presenters.m;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.widget.TextView;
import com.yxcorp.utility.n;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.Bitmap;
import m0d.l;

public class c0 implements ImageCallback	// class@000542
{
    public final m b;

    public void c0(m p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       if (p0 != null) {
          int i = n.c(this.b.C.getContext(), 24.00f);
          c0 tb = this.b;
          Objects.requireNonNull(tb);
          StateListDrawable stateListDra = PatchProxy.applyOneRefs(p0, tb, m.class, "19");
          if (stateListDra != PatchProxyResult.class) {
          }else {
             stateListDra = new StateListDrawable();
             Drawable uDrawable = p0.getConstantState().newDrawable().mutate();
             uDrawable.setAlpha(128);
             uDrawable.setFilterBitmap(true);
             int[] ointArray = new int[true];
             ointArray[0] = 0x10100a7;
             stateListDra.addState(ointArray, uDrawable);
             int[] ointArray1 = new int[true];
             ointArray1[0] = -16842919;
             stateListDra.addState(ointArray1, p0);
          }
          stateListDra.setBounds(0, 0, i, i);
          this.b.C.setCompoundDrawables(stateListDra, null, null, null);
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
