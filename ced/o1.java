package ced.o1;
import com.yxcorp.plugin.search.result.hashtag.presenters.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.RelativeLayout;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.plugin.search.widget.AutoMarqueeTextView;
import android.view.ViewTreeObserver;
import ced.n1;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Boolean;
import ded.h;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import lnc.a1;
import android.widget.TextView;
import android.content.res.Resources;
import zf6.k;
import android.view.View;
import ekd.m1;

public class o1 extends a	// class@00056f
{
    public KwaiActionBar v;
    public AutoMarqueeTextView w;
    public TagInfo x;

    public void o1(){
       super();
    }
    public void E8(){
       o1 oo1 = o1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo1, "3")) {
          return;
       }
       super.E8();
       this.v.f(true);
       this.v.setClipChildren(false);
       o1 tx = this.x;
       if (tx != null) {
          this.w.setText(tx.mTagName);
       }
       this.P8(this.q);
       if (!PatchProxy.applyVoid(objArray, this, oo1, "4")) {
          this.v.getViewTreeObserver().addOnPreDrawListener(new n1(this));
       }
       return;
    }
    public void P8(boolean p0){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo1, "6")) {
          return;
       }
       int i = 0x7f080566;
       Drawable uDrawable = j.n(this.getActivity(), i, R.color.arg_RES_7f0606c8);
       Drawable uDrawable1 = j.n(this.getContext(), R.drawable.arg_RES_7f080623, 0x7f0606c8);
       if (h.b(this.x)) {
          this.w.setTextColor(a1.a(R.color.arg_RES_7f06060a));
       }else if(p0){
          this.w.setTextColor(this.getActivity().getResources().getColor(R.color.arg_RES_7f061fd5));
       }else {
          int i1 = 0x7f060148;
          uDrawable = j.n(this.getContext(), i, i1);
          uDrawable1 = j.n(this.getContext(), R.drawable.arg_RES_7f080623, i1);
          if (k.d()) {
             this.w.setTextColor(this.getContext().getResources().getColor(R.color.arg_RES_7f061dc4));
          }else {
             this.w.setTextColor(this.getContext().getResources().getColor(R.color.arg_RES_7f061f94));
          }
       }
       this.v.j(uDrawable1);
       this.v.p(uDrawable, false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o1.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a3f6a);
       this.w = m1.f(p0, 0x7f0a3f7b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o1.class, "1")) {
          return;
       }
       super.j8();
       this.x = this.r8("TagInfo");
       return;
    }
}
