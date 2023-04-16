package com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.util.AttributeSet;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class SlidePlayTrendingTopLayout extends RelativeLayout	// class@000aca
{
    public SlidePlayTrendingTopLayout$a b;

    public void SlidePlayTrendingTopLayout(Context p0){
       a.p(p0, "context");
       super(p0);
       this.setId(R.id.trending_top_layout);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d1637, this, true);
    }
    public void SlidePlayTrendingTopLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.setId(R.id.trending_top_layout);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d1637, this, true);
    }
    public void SlidePlayTrendingTopLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setId(R.id.trending_top_layout);
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d1637, this, true);
    }
    public final SlidePlayTrendingTopLayout$a getAdapter(){
       return this.b;
    }
    public final void setAdapter(SlidePlayTrendingTopLayout$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayTrendingTopLayout.class, "1")) {
          return;
       }
       this.b = p0;
       if (p0 != null && !PatchProxy.applyVoidOneRefs(this, p0, SlidePlayTrendingTopLayout$a.class, "23")) {
          a.p(this, "trendingTopLayout");
          View view = m1.f(this, R.id.trending_title_bg);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.trending_title_bg\)");
          p0.a = view;
          view = m1.f(this, R.id.trending_index);
          a.o(view, "ViewBindUtils.bindWidget¡­out, R.id.trending_index\)");
          p0.b = view;
          view = m1.f(this, R.id.trending_title);
          a.o(view, "ViewBindUtils.bindWidget¡­out, R.id.trending_title\)");
          p0.c = view;
          view = m1.f(this, R.id.trending_info_layout);
          a.o(view, "ViewBindUtils.bindWidget¡­.id.trending_info_layout\)");
          p0.d = view;
          view = m1.f(this, R.id.trending_top);
          a.o(view, "ViewBindUtils.bindWidget¡­ayout, R.id.trending_top\)");
          p0.e = view;
          view = m1.f(this, R.id.trending_heating);
          a.o(view, "ViewBindUtils.bindWidget¡­t, R.id.trending_heating\)");
          p0.f = view;
          view = m1.f(this, R.id.trending_info_divider_dot);
          a.o(view, "ViewBindUtils.bindWidget¡­rending_info_divider_dot\)");
          p0.g = view;
          view = m1.f(this, R.id.trending_top_tail);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.trending_top_tail\)");
          p0.i = view;
          view = m1.f(this, R.id.trending_top_icon);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.trending_top_icon\)");
          p0.h = view;
          view = m1.f(this, R.id.trending_timeline_title_layout);
          a.o(view, "ViewBindUtils.bindWidget¡­ng_timeline_title_layout\)");
          p0.j = view;
          view = m1.f(this, R.id.trending_timeline_header);
          a.o(view, "ViewBindUtils.bindWidget¡­trending_timeline_header\)");
          p0.k = view;
          p0.k();
       }
       return;
    }
}
