package dl9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.LinearLayout;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.corona.model.CoronaTvFilm;
import ul5.c;
import android.view.View;
import ekd.m1;
import nx9.c;
import android.content.res.ColorStateList;
import hl9.t;
import android.content.Context;

public class a extends PresenterV2	// class@001f48
{
    public QPhoto p;
    public QComment q;
    public LinearLayout r;
    public TextView s;

    public void a(){
       super();
    }
    public void E8(){
       a tr;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.s.setText(this.q.mComment);
       if (this.p.isArticle()) {
          tr = this.r;
          tr.setPadding(tr.getPaddingLeft(), a1.d(R.dimen.arg_RES_7f070334), this.r.getPaddingRight(), this.r.getPaddingBottom());
       }else if(c.g(this.p.mEntity) != null){
          tr = this.r;
          tr.setPadding(tr.getPaddingLeft(), a1.d(R.dimen.arg_RES_7f07033f), this.r.getPaddingRight(), this.r.getPaddingBottom());
       }else {
          tr = this.r;
          tr.setPadding(tr.getPaddingLeft(), 0, this.r.getPaddingRight(), this.r.getPaddingBottom());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a382f);
       this.s = m1.f(p0, 0x7f0a030f);
       if (c.d() || c.c()) {
          t.c9(this.s, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
       }else {
          t.c9(this.s, a1.b(R.color.arg_RES_7f06168c));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(QComment.class);
       return;
    }
}
