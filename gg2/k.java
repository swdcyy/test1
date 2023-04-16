package gg2.k;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.c;
import java.util.Locale;
import eg2.b;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class k extends c	// class@002b1c
{
    public TextView p;
    public KwaiImageView q;
    public c r;
    public static String sLivePresenterClassName = "LiveQuizQuestionTitleAndLogoPresenter";

    public void k(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       c g = this.r.g;
       Object[] objArray = new Object[]{Integer.valueOf(g.a)};
       this.p.setText(String.format(Locale.getDefault(), "%d. ", objArray)+g.f);
       if (!TextUtils.isEmpty(this.r.e)) {
          this.q.setVisibility(0);
          this.q.L(this.r.e);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.q.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2456);
       this.p = m1.f(p0, 0x7f0a2457);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.r = this.q8(c.class);
       return;
    }
}
