package asc.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import asc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import android.view.ViewTreeObserver;

public final class a$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0002c4
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       FragmentActivity activity = this.b.g.getActivity();
       a.m(activity);
       this.b.c.getLayoutParams().width = e.a(activity);
       this.b.c.requestLayout();
       this.b.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
