package com.yxcorp.gifshow.detail.slideplay.SlidePlayFooterLoadingLayout;
import com.kwai.library.slide.base.widget.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import d6a.d;
import android.view.View;
import xtd.i;
import ytd.b;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFooterLoadingLayout$a;
import xtd.d;
import xtd.g;
import com.kwai.library.slide.base.widget.a$a;

public class SlidePlayFooterLoadingLayout extends FrameLayout implements a	// class@001715
{
    public KwaiLoadingView b;
    public View c;
    public d d;
    public a$a e;
    public boolean f;

    public void SlidePlayFooterLoadingLayout(Context p0){
       super(p0);
       this.f = true;
    }
    public void SlidePlayFooterLoadingLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = true;
    }
    public void SlidePlayFooterLoadingLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = true;
    }
    public void d(boolean p0,boolean p1){
       d uod;
       if (PatchProxy.isSupport(SlidePlayFooterLoadingLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SlidePlayFooterLoadingLayout.class, "1")) {
          return;
       }
       if (this.d == null) {
          uod = new d(this.c);
          this.d = uod;
          i oi = new i(uod);
          oi.b(new SlidePlayFooterLoadingLayout$a(this));
       }
       uod.d = p0;
       return;
    }
    public void setContentView(View p0){
       this.c = p0;
    }
    public void setOnLoadingMoreListener(a$a p0){
       this.e = p0;
    }
}
