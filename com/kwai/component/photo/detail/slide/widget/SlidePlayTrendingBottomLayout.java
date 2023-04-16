package com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import android.util.AttributeSet;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.component.photo.detail.slide.widget.TrendingTextSwitcher;
import android.widget.ImageView;

public final class SlidePlayTrendingBottomLayout extends ConstraintLayout	// class@000ac8
{
    public SlidePlayTrendingBottomLayout$a B;

    public void SlidePlayTrendingBottomLayout(Context p0){
       a.p(p0, "context");
       super(p0);
       this.setId(R.id.trending_bottom_bar);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d162d, this, true);
    }
    public void SlidePlayTrendingBottomLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.setId(R.id.trending_bottom_bar);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d162d, this, true);
    }
    public void SlidePlayTrendingBottomLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setId(R.id.trending_bottom_bar);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d162d, this, true);
    }
    public final SlidePlayTrendingBottomLayout$a getAdapter(){
       return this.B;
    }
    public final void setAdapter(SlidePlayTrendingBottomLayout$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayTrendingBottomLayout.class, "1")) {
          return;
       }
       this.B = p0;
       if (p0 != null && !PatchProxy.applyVoidOneRefs(this, p0, SlidePlayTrendingBottomLayout$a.class, "19")) {
          a.p(this, "layout");
          View view = m1.f(this, R.id.trending_icon);
          a.o(view, "ViewBindUtils.bindWidget¡­yout, R.id.trending_icon\)");
          p0.f = view;
          view = m1.f(this, R.id.shoot_same_style);
          a.o(view, "ViewBindUtils.bindWidget¡­t, R.id.shoot_same_style\)");
          p0.a = view;
          view = m1.f(this, R.id.shoot_same_style_text);
          a.o(view, "ViewBindUtils.bindWidget¡­id.shoot_same_style_text\)");
          p0.b = view;
          view = m1.f(this, R.id.inner_next_trending);
          a.o(view, "ViewBindUtils.bindWidget¡­R.id.inner_next_trending\)");
          p0.g = view;
          view = m1.f(this, R.id.trending_switcher);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.trending_switcher\)");
          p0.h = view;
          view = m1.f(this, R.id.more_icon);
          a.o(view, "ViewBindUtils.bindWidget\(layout, R.id.more_icon\)");
          p0.d = view;
          view = m1.f(this, R.id.divider_line);
          a.o(view, "ViewBindUtils.bindWidget¡­ayout, R.id.divider_line\)");
          p0.e = view;
          view = m1.f(this, R.id.next_trending_bar);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.next_trending_bar\)");
          p0.i = view;
          view = m1.f(this, R.id.more_trending_bar);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.more_trending_bar\)");
          p0.c = view;
       }
       return;
    }
}
