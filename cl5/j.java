package cl5.j;
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
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.core.content.ContextCompat;
import lnc.a1;
import android.view.View;
import cl5.i;
import android.view.View$OnClickListener;
import jl5.w;
import xk5.c;
import java.lang.Integer;

public class j extends PresenterV2	// class@0006f8
{
    public a p;
    public c q;
    public int r;
    public FrescoImageView s;

    public void j(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       j tp = this.p;
       if (tp != null) {
          a b = tp.b;
          if (b instanceof EmotionInfo) {
             if (this.s.getTag() != null && (this.s.getTag() instanceof CharSequence && TextUtils.n(this.s.getTag(), b.mId))) {
                return;
             }else {
                this.s.setTag(b.mId);
                File uFile = h.i(b);
                if (uFile != null) {
                   this.s.v(uFile, 0, 0);
                }else if(!q.f(b.mEmotionImageSmallUrl)){
                   this.s.y(b.mEmotionImageSmallUrl);
                }
             }
          }
       }
       return;
    }
    public void F8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       j ts = this.s;
       Drawable uDrawable = PatchProxy.apply(objArray, this, oj, "4");
       if (uDrawable != PatchProxyResult.class) {
       }else if(this.s.getContext() != null){
          uDrawable = ContextCompat.getDrawable(this.s.getContext(), R.drawable.arg_RES_7f08092f);
       }else {
          uDrawable = a1.f(R.drawable.arg_RES_7f08092f);
       }
       ts.setPlaceHolderImage(uDrawable);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       p0.setOnClickListener(new i(this));
       this.s = w.a(p0, 0x7f0a0cfa);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.t8("EMOTION_INTERACT_CALLBACK");
       this.r = this.r8("EMOTION_PACKAGE_TYPE").intValue();
       return;
    }
}
