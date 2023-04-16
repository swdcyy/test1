package com.yxcorp.gifshow.follow.stagger.container.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import uh5.e;
import android.view.ViewGroup;
import g9c.d;
import z8c.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.component.feedstaggercard.model.CardStyle;
import iia.w1;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import androidx.fragment.app.Fragment;
import xa5.a;
import lnc.p8;
import androidx.recyclerview.widget.RecyclerView$s;
import com.kuaishou.android.model.feed.PhotoType;
import rkd.b;
import oia.l;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;

public class d extends PresenterV2	// class@001162
{
    public w1 p;
    public b q;
    public HomeFollowFragment r;
    public RecyclerView s;
    public final boolean t;
    public CardStyle u;

    public void d(){
       super(false);
    }
    public void d(boolean p0){
       super();
       this.t = p0;
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       RecyclerView recyclerView = this.r.h0();
       if (!e.f()) {
          recyclerView.setBackgroundResource(R.color.arg_RES_7f06171f);
       }
       this.r.ia().R0(recyclerView);
       if (this.t != null) {
          a uoa = new a();
          uoa.o(a1.f(R.drawable.arg_RES_7f0807c0));
          uoa.s(a1.f(R.drawable.arg_RES_7f082470));
          uoa.p(true);
          recyclerView.addItemDecoration(uoa);
       }else if(this.u.isCornerCard != null){
          w1 ow1 = new w1(this.r, a1.e(2.00f), 0, a1.e(2.00f), false);
          this.p = v3;
          recyclerView.addItemDecoration(v3);
       }else {
          w1 ow11 = new w1(this.r);
          this.p = ow11;
          recyclerView.addItemDecoration(ow11);
       }
       if (a.g(this.r)) {
          p8.a(recyclerView, e.c());
       }
       if (!PatchProxy.applyVoidOneRefs(recyclerView, this, uod, "4")) {
          recyclerView.getRecycledViewPool().k(PhotoType.IMAGE.toInt(), 10);
          recyclerView.getRecycledViewPool().k(PhotoType.VIDEO.toInt(), 10);
          recyclerView.getRecycledViewPool().k(PhotoType.LIVESTREAM.toInt(), 10);
       }
       if (b.g() && !PatchProxy.applyVoid(objArray, this, uod, "5")) {
          this.q = new l(this);
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().i3(this.q);
          }
       }
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!b.g() || (!PatchProxy.applyVoid(objArray, this, uod, "6") && (this.getActivity() instanceof GifshowActivity && this.q != null))) {
          this.getActivity().s3(this.q);
       }
    label_0032 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.q8(RecyclerView.class);
       this.u = this.r8("PAGE_CARD_STYLE");
       return;
    }
}
