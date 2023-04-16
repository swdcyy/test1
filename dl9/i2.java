package dl9.i2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import android.widget.ImageView;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import ek9.l1;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;

public class i2 extends PresenterV2	// class@001f6c
{
    public ViewStub p;
    public KwaiImageView q;
    public QComment r;
    public CommentConfig s;

    public void i2(){
       super();
    }
    public void E8(){
       i2 oi2 = i2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi2, "3")) {
          return;
       }
       i2 tr = this.r;
       if (tr.mIsGodComment != null || tr.mIsHighQualityComment != null) {
          tr = this.p;
          if (tr != null && tr.getParent() != null) {
             this.q = this.p.inflate().findViewById(0x7f0a3b20);
          }else if(this.q == null){
             this.q = this.m8().findViewById(0x7f0a3b20);
          }
          if (!PatchProxy.applyVoid(objArray, this, oi2, "4")) {
             int i = 0;
             if (this.r.mIsGodComment != null && l1.c() == 2) {
                this.q.setImageResource(R.drawable.arg_RES_7f081964);
                this.q.setVisibility(i);
             }else if(this.r.mIsGodComment != null && l1.c() == 1){
                this.q.setImageResource(R.drawable.arg_RES_7f080a5d);
                this.q.setVisibility(i);
             }else if(this.r.mIsHighQualityComment != null){
                this.q.setImageResource(R.drawable.arg_RES_7f080a5e);
                this.q.setVisibility(i);
             }else {
                this.q.setVisibility(4);
             }
             if (this.q.getLayoutParams() instanceof ConstraintLayout$LayoutParams) {
                ConstraintLayout$LayoutParams layoutParams = this.q.getLayoutParams();
                tr = this.s;
                if (tr != null) {
                   i = tr.mEnableNewLikeDislikeUi;
                }
                layoutParams.rightMargin = (i != null)? a1.d(0x7f0702e2): a1.d(0x7f070315);
                this.q.setLayoutParams(layoutParams);
             }
          }
       }else {
          oi2 = this.q;
          if (oi2 != null) {
             oi2.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i2.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3b21);
       this.q = m1.f(p0, 0x7f0a3b20);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i2.class, "1")) {
          return;
       }
       this.r = this.q8(QComment.class);
       this.s = this.q8(CommentConfig.class);
       return;
    }
}
