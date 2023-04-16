package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a$a;
import tyc.k;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import java.util.List;
import android.view.View;

public class a$a implements k	// class@001bbc
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       b.a(0x8708467).log("AtlasCover first frame error");
       return;
    }
    public void b(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "5")) {
          ta.p.setImageDrawable(p0);
          if (!ta.u.contains(Integer.valueOf(ta.t))) {
             ta.u.add(Integer.valueOf(ta.t));
          }
          ta.q.setVisibility(8);
          a r = ta.r;
          if (r != null) {
             r.setVisibility(8);
          }
          b.a(0x8708467).log("AtlasCover first frame ready");
       }
       return;
    }
}
