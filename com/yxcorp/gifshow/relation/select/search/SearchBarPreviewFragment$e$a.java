package com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$e$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.ContactTargetItem;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import y8c.d;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import java.util.Set;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import wbc.k;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class SearchBarPreviewFragment$e$a extends PresenterV2	// class@0019b9
{
    public ContactTargetItem p;
    public d q;
    public KwaiImageView r;
    public View s;
    public final SearchBarPreviewFragment$e t;

    public void SearchBarPreviewFragment$e$a(SearchBarPreviewFragment$e p0){
       this.t = p0;
       super();
    }
    public void E8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, SearchBarPreviewFragment$e$a.class, str)) {
          return;
       }
       g.c(this.r, this.p.mUser, HeadImageSize.MIDDLE, objArray, objArray);
       SearchBarPreviewFragment$e$a tt = this.t;
       SearchBarPreviewFragment$e$a ts = this.s;
       int i = this.q.get();
       Objects.requireNonNull(tt);
       if (!PatchProxy.isSupport(SearchBarPreviewFragment$e.class) || !PatchProxy.applyVoidTwoRefs(ts, Integer.valueOf(i), tt, SearchBarPreviewFragment$e.class, str)) {
          SearchBarPreviewFragment$e w = tt.w;
          if (w.H != null && i == (w.J.size() - 1)) {
             ts.setVisibility(0);
          }else {
             ts.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBarPreviewFragment$e$a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0333);
       this.s = m1.f(p0, 0x7f0a2a96);
       this.r.setOnClickListener(new k(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SearchBarPreviewFragment$e$a.class, "1")) {
          return;
       }
       this.p = this.q8(ContactTargetItem.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
