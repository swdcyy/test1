package com.kuaishou.live.core.show.wishlist.detail.sponsors.a;
import a51.c;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.wishlist.LiveWishListResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiImageView;
import l12.d;
import va1.f0;
import com.kuaishou.live.core.show.wishlist.detail.sponsors.LiveWishListDetailSponsorsPresenter$1;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import sn2.c;
import androidx.recyclerview.widget.RecyclerView$n;
import on2.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import sn2.b;
import un2.b;
import sn2.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.widget.TextView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fq5.b;
import android.app.Activity;
import java.lang.Boolean;

public class a extends c	// class@0012d6
{
    public CustomFadeEdgeRecyclerView A;
    public k B;
    public TextView C;
    public int D;
    public List E;
    public b v;
    public b w;
    public Activity x;
    public boolean y;
    public KwaiImageView z;
    public static String sLivePresenterClassName = "LiveWishListDetailSponsorsPresenter";

    public void a(){
       super();
       this.D = 0;
       this.E = new ArrayList();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          f0.a(this.z, LiveWishListResourcePathConstant.LIVE_WISH_LIST_SPONSOR_EMPTY);
          this.A.setItemAnimator(objArray);
          this.A.setLayoutManager(new LiveWishListDetailSponsorsPresenter$1(this, this.x, 0, 0));
          this.A.addItemDecoration(new c(this, n.c(a.a().a(), 13.00f), 0));
          k ok = new k();
          this.B = ok;
          ok.h = this.y;
          this.A.setAdapter(ok);
          this.B.g = new b(this);
       }
       uoa = this.v;
       uoa.j.observe(uoa.c, new a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a2864);
       this.z = m1.f(p0, 0x7f0a2861);
       this.C = m1.f(p0, 0x7f0a2863);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.v = this.q8(b.class);
       this.w = this.r8("LIVE_BASIC_CONTEXT");
       this.x = this.q8(Activity.class);
       this.y = this.r8("IS_AUDIENCE").booleanValue();
       return;
    }
}
