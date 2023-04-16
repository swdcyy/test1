package com.yxcorp.gifshow.designermagic.v2.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designermagic.v2.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qw9.a;
import java.util.Collection;
import ekd.q;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import lnc.e0;
import java.util.Arrays;
import sw9.a;
import jd.c;
import ub.b;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.widget.TextView;
import sw9.b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import tw9.c;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import zf6.j;
import android.graphics.drawable.Drawable;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@00132f
{
    public BaseFragment p;
    public a q;
    public SimpleMagicFace r;
    public b s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public View w;
    public b x;

    public void b(){
       super();
       this.x = new b$a(this);
    }
    public void E8(){
       a b;
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "4")) {
          return;
       }
       b tq = this.q;
       this.r = tq.a;
       if (!q.f(tq.c)) {
          this.t.getHierarchy().u(t$b.i);
          this.t.S(this.q.c, this.x);
       }else if(!q.f(this.r.mHdImageUrls)){
          this.t.getHierarchy().u(t$b.e);
          this.t.R(Arrays.asList(e0.a(this.r.mHdImageUrls, "")), 0, 0, new a(), this.x);
       }else {
          this.t.getHierarchy().u(t$b.e);
          tq = this.r;
          this.t.R(Arrays.asList(e0.b(tq.mImages, tq.mImage)), 0, 0, new a(), this.x);
       }
       this.u.setText(this.r.mName);
       tq = this.v;
       int i = 0x7f1009ff;
       b = this.q.b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          str = PatchProxy.applyOneRefs(Long.valueOf(b), objArray, uob, "1");
          if (str != PatchProxyResult.class) {
          }else if(b - 0x2710 < 0){
             str = String.valueOf(b);
          }else if(b - 0x5f5e100 < 0){
             str = a1.r(R.string.arg_RES_7f100508, b.b(((double)b / 10000.00f)));
          }else {
             str = a1.r(R.string.arg_RES_7f104329, b.b(((double)b / 100000000.00f)));
          }
       }else {
          goto label_00bd ;
       }
       tq.setText(a1.r(i, str));
       this.w.setOnClickListener(new c(this));
       Context context = this.getContext();
       if (context == null) {
          return;
       }else {
          Resources resources = context.getResources();
          if (resources == null) {
             return;
          }else if(j.o(resources)){
             this.w.setBackground(context.getDrawable(R.drawable.arg_RES_7f080694));
             this.u.setTextColor(resources.getColor(R.color.arg_RES_7f0601cb));
             this.v.setTextColor(resources.getColor(R.color.arg_RES_7f060184));
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.t.L(null);
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a0aa7);
       this.u = m1.f(p0, 0x7f0a0aaa);
       this.t = m1.f(p0, 0x7f0a0aa9);
       this.v = m1.f(p0, 0x7f0a0aa8);
       if (!PatchProxy.applyVoid(null, this, uob, "3")) {
          ViewGroup$MarginLayoutParams layoutParams = this.t.getLayoutParams();
          float a = b.a;
          layoutParams.width = Math.round(((float)a1.d(0x7f0701d2) * a));
          layoutParams.height = Math.round(((float)a1.d(0x7f0701ce) * a));
          this.t.setLayoutParams(layoutParams);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.t8("FRAGMENT");
       this.q = this.q8(a.class);
       return;
    }
}
