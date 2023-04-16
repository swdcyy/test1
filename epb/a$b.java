package epb.a$b;
import com.kwai.feature.component.searchhistory.a$a;
import epb.a;
import com.kwai.feature.component.searchhistory.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class a$b extends a$a	// class@0027a2
{
    public ImageView c;
    public ImageView d;
    public View e;
    public final a f;

    public void a$b(a p0){
       this.f = p0;
       super(p0);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.c = m1.f(p0, 0x7f0a129e);
       this.d = m1.f(p0, 0x7f0a0782);
       this.e = m1.f(p0, 0x7f0a14c8);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       a f = this.f.F;
       if (f != null) {
          MusicSearchUiOption$b companion = MusicSearchUiOption.Companion;
          a.m(f);
          if (companion.a(f.getMainColorId())) {
             a$b te = this.e;
             a.m(te);
             a f1 = this.f.F;
             a.m(f1);
             te.setBackgroundColor(a1.a(f1.getMainColorId()));
          }
          if (companion.b(f.getHistoryLeftMargin())) {
             a$b tc = this.c;
             if (tc != null) {
                ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   layoutParams.leftMargin = f.getHistoryLeftMargin();
                   tc.setLayoutParams(layoutParams);
                }
             }
          }
       }
    label_005a :
       a$b tc1 = this.c;
       a.m(tc1);
       tc1.setImageResource(R.drawable.arg_RES_7f081b9c);
       tc1 = this.d;
       a.m(tc1);
       tc1.setImageResource(R.drawable.arg_RES_7f081b8e);
       return;
    }
}
