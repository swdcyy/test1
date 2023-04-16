package bwc.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import bwc.d;
import android.view.View$OnClickListener;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import android.widget.ImageView;
import bld.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import ekd.m1;

public class e extends PresenterV2	// class@0004a7
{
    public View p;
    public MixImporterFragment q;

    public void e(MixImporterFragment p0){
       super();
       this.q = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p.setOnClickListener(new d(this, this.q.dh()));
       if (this.getActivity() == null || (this.getActivity().getIntent() != null && j0.a(this.getActivity().getIntent(), "is_back_icon_cross", false))) {
          e tp = this.p;
          if (tp instanceof ImageView) {
             b uob = new b();
             uob.o(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0824b0));
             uob.A(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0808ff));
             tp.setImageDrawable(uob.a());
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1716);
       return;
    }
}
