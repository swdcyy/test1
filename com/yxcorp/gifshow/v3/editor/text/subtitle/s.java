package com.yxcorp.gifshow.v3.editor.text.subtitle.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import bld.b;
import android.content.Context;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import ekd.m1;
import dvc.a0;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;

public class s extends PresenterV2	// class@0014a8
{
    public boolean p;
    public KwaiImageView q;
    public PublishSubject r;
    public f s;
    public TextConfigParam t;

    public void s(boolean p0){
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       if (this.s.get() == this.t) {
          b uob = new b();
          uob.x(2.00f);
          uob.w(this.getContext().getResources().getColor(R.color.arg_RES_7f060751));
          uob.g(KwaiRadiusStyles.R8);
          this.q.setBackground(uob.a());
       }else {
          this.q.setBackgroundResource(0);
       }
       if (this.t.g() == 1) {
          if (PostExperimentUtils.t1() && this.p != null) {
             this.q.P(this.t.k);
          }else {
             this.q.P(this.t.j);
          }
       }else {
          this.q.setImageResource(this.t.h());
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, s.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3bfd);
       m1.a(p0, new a0(this), R.id.subtitle_image_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.r = this.r8("EDITOR_SUBTITLE_SELECTION_PUBLISHER");
       this.s = this.x8("NOW_TEXT_BUBBLE_CONFIG");
       this.t = this.r8("SUBTITLE_ITEM_DATA");
       return;
    }
}
