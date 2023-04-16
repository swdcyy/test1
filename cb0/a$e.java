package cb0.a$e;
import androidx.lifecycle.Observer;
import cb0.a;
import java.lang.Object;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel$EndAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cb0.b;
import java.lang.Enum;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.animation.ValueAnimator;
import cb0.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import e17.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.widget.FrameLayout;

public final class a$e implements Observer	// class@0002fc
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else if(p0 == null){
          int i = b.a[p0.ordinal()];
          int i1 = 0;
          int i2 = 1;
          if (i != i2) {
             p0 = 2;
             if (i == p0) {
                a$e tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(null, tb, a.class, "6")) {
                   Integer value = tb.i.r0().getValue();
                   int i3 = 100;
                   if (value == null) {
                      value = Integer.valueOf(i3);
                   }
                   a.o(value, "mViewModel.mProgress.value ?: FINISH_PERCENT");
                   int i4 = value.intValue();
                   int[] ointArray = new int[p0];
                   ointArray[i1] = i4;
                   ointArray[i2] = i3;
                   ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
                   a.o(valueAnimato, "valueAnimator");
                   valueAnimato.setDuration((long)((i3 - i4) * 2));
                   valueAnimato.addUpdateListener(new c(tb));
                   valueAnimato.start();
                   tb.l = valueAnimato;
                }
             }
          }else {
             i = 0x7f110668;
             if (p0.getErrorCode()) {
                i.a(i, R.string.arg_RES_7f104894);
                this.b.m.finish();
             }else {
                i.a(i, R.string.arg_RES_7f1038e5);
                this.b.h.setVisibility(i1);
                this.b.E(8);
             }
          }
       }
       this.b.F();
       return;
    }
}
