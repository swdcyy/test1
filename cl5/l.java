package cl5.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql8.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import jl5.h;
import com.kwai.emotionsdk.widget.FrescoImageView;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.widget.TextView;
import android.view.View;
import cl5.k;
import android.view.View$OnClickListener;
import jl5.w;
import xk5.c;
import java.lang.Integer;

public class l extends PresenterV2	// class@0006fa
{
    public a p;
    public c q;
    public int r;
    public FrescoImageView s;
    public TextView t;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       a b = this.p.b;
       if (!b instanceof EmotionInfo) {
          return;
       }
       if (this.s.getTag() != null && (this.s.getTag() instanceof CharSequence && TextUtils.n(this.s.getTag(), b.mId))) {
          return;
       }
       this.s.setTag(b.mId);
       File uFile = h.i(b);
       if (uFile != null) {
          this.s.v(uFile, 0, 0);
       }else if(!q.f(b.mEmotionImageSmallUrl)){
          this.s.y(b.mEmotionImageSmallUrl);
       }
       this.t.setText(b.mEmotionName);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       p0.setOnClickListener(new k(this));
       this.t = w.a(p0, 0x7f0a0cfd);
       this.s = w.a(p0, 0x7f0a0cfa);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.t8("EMOTION_INTERACT_CALLBACK");
       this.r = this.r8("EMOTION_PACKAGE_TYPE").intValue();
       return;
    }
}
