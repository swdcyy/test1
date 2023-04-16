package aq4.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.RelativeLayout;
import aq4.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import ekd.m1;
import java.lang.Integer;

public class b extends PresenterV2	// class@0002c0
{
    public KwaiActionBar p;
    public View q;
    public int r;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.r == 2) {
          this.q.setBackgroundResource(0);
       }else {
          this.q.setBackgroundResource(R.drawable.arg_RES_7f081dca);
       }
       this.q.setPadding(this.p.getPaddingLeft(), this.p.getPaddingTop(), this.p.getPaddingRight(), this.p.getPaddingBottom());
       this.p.h(new a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       this.q = m1.f(p0, 0x7f0a3fd1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.r8("INTENT_STORY_SOURCE").intValue();
       return;
    }
}
