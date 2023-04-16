package hg9.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class l	// class@002668
{
    public ViewStubInflater2 a;
    public ViewStub b;
    public View c;
    public ImageView d;
    public TextView e;
    public View f;
    public boolean g;

    public void l(){
       super();
    }
    public final View a(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 && this.d == null) {
          this.c();
       }
       return this.d;
    }
    public final View b(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 && this.c == null) {
          this.c();
       }
       return this.c;
    }
    public final void c(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "7")) {
          return;
       }
       l ta = this.a;
       View view = (ta != null)? ta.b(R.id.check_multi_mode_container): objArray;
       this.c = view;
       ta = this.a;
       ImageView imageView = (ta != null)? ta.b(R.id.check_multi_mode): objArray;
       this.d = imageView;
       ta = this.c;
       int i = 0x7f0a3f2c;
       TextView textView = (ta != null)? ta.findViewById(i): objArray;
       this.e = textView;
       if (PostExperimentUtils.b() == 1) {
          ta = this.a;
          textView = (ta != null)? ta.b(i): objArray;
          if (textView != null) {
             textView.setText(R.string.arg_RES_7f100408);
          }
       }
       if (this.g == null) {
          ta = this.f;
          ViewGroup$LayoutParams layoutParams = (ta != null)? ta.getLayoutParams(): objArray;
          if (layoutParams instanceof ConstraintLayout$LayoutParams) {
             ta = this.f;
             if (ta != null) {
                objArray = ta.getLayoutParams();
             }
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             ta = this.c;
             a.m(ta);
             objArray.p = ta.getId();
          }
       }
       return;
    }
    public final void d(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "6")) {
          return;
       }
       if (p0) {
          this.b(true);
       }
       ol = this.c;
       if (ol != null) {
          int i = (p0)? 0: 8;
          ol.setVisibility(i);
       }
       return;
    }
}
