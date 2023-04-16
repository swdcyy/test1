package gqb.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import gqb.i;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public final class j extends PresenterV2	// class@002b7b
{
    public View p;
    public KwaiActionBar q;

    public void j(){
       super();
    }
    public void E8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "7")) {
          Context context = this.getContext();
          if (context != null) {
             objArray = Integer.valueOf(n.A(context));
          }
          oj = this.q;
          if (oj == null) {
             a.S("mKwaiActionBar");
          }
          ViewGroup$LayoutParams layoutParams = oj.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
          int i = (objArray != null)? objArray.intValue(): 0;
          layoutParams.topMargin = i;
          j tq = this.q;
          if (tq == null) {
             a.S("mKwaiActionBar");
          }
          tq.setLayoutParams(layoutParams);
          oj = this.p;
          if (oj == null) {
             a.S("mMusicRadioLeftBtn");
          }
          oj.setOnClickListener(new i(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       View view = m1.f(p0, R.id.title_root);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.title_root\)");
       this.q = view;
       p0 = m1.f(p0, R.id.music_radio_top_left_view);
       a.o(p0, "ViewBindUtils.bindWidget¡­usic_radio_top_left_view\)");
       this.p = p0;
       return;
    }
}
