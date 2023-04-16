package com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a;
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
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment;
import java.util.ArrayList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a$a$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class HalfSearchBarPreviewFragment$a$a extends PresenterV2	// class@001996
{
    public ContactTargetItem p;
    public d q;
    public KwaiImageView r;
    public View s;
    public final HalfSearchBarPreviewFragment$a t;

    public void HalfSearchBarPreviewFragment$a$a(HalfSearchBarPreviewFragment$a p0){
       this.t = p0;
       super();
    }
    public void E8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, HalfSearchBarPreviewFragment$a$a.class, str)) {
          return;
       }
       g.c(this.r, this.p.mUser, HeadImageSize.MIDDLE, objArray, objArray);
       HalfSearchBarPreviewFragment$a$a tt = this.t;
       HalfSearchBarPreviewFragment$a$a ts = this.s;
       int i = this.q.get();
       Objects.requireNonNull(tt);
       if (!PatchProxy.isSupport(HalfSearchBarPreviewFragment$a.class) || !PatchProxy.applyVoidTwoRefs(ts, Integer.valueOf(i), tt, HalfSearchBarPreviewFragment$a.class, str)) {
          HalfSearchBarPreviewFragment$a w = tt.w;
          if (w.H != null && i == (w.J.size() - 1)) {
             ts.setVisibility(0);
          }else {
             ts.setVisibility(8);
          }
       }
       if (!this.t.w.O.contains(this.p)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CHOOSEN_USER_BUTTON";
          i3 oi3 = i3.f();
          oi3.c("index", Integer.valueOf((this.q.get() + 1)));
          oi3.d("identity", this.p.mUser.mId);
          uElementPack.params = oi3.e();
          u1.u0(6, uElementPack, objArray);
          this.t.w.O.add(this.p);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfSearchBarPreviewFragment$a$a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0333);
       this.s = m1.f(p0, 0x7f0a2a96);
       this.r.setOnClickListener(new HalfSearchBarPreviewFragment$a$a$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HalfSearchBarPreviewFragment$a$a.class, "1")) {
          return;
       }
       this.p = this.q8(ContactTargetItem.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
