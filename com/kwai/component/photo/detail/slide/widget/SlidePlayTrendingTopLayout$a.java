package com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout$a;
import java.lang.Object;
import android.widget.TextView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.Integer;

public abstract class SlidePlayTrendingTopLayout$a	// class@000ac9
{
    public View a;
    public TextView b;
    public TextView c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public KwaiImageView h;
    public TextView i;
    public View j;
    public TextView k;

    public void SlidePlayTrendingTopLayout$a(){
       super();
    }
    public final TextView a(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mIndexInTrending");
       }
       return obj;
    }
    public final KwaiImageView b(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("mTopIcon");
       }
       return obj;
    }
    public final View c(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mTrendingContent");
       }
       return obj;
    }
    public final TextView d(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("mTrendingDividerDot");
       }
       return obj;
    }
    public final TextView e(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("mTrendingHeating");
       }
       return obj;
    }
    public final TextView f(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("mTrendingTail");
       }
       return obj;
    }
    public final View g(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("mTrendingTimelineHeader");
       }
       return obj;
    }
    public final TextView h(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mTrendingTitle");
       }
       return obj;
    }
    public final View i(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("mTrendingTitleBg");
       }
       return obj;
    }
    public final TextView j(){
       SlidePlayTrendingTopLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingTopLayout$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mTrendingTop");
       }
       return obj;
    }
    public void k(){
    }
    public abstract void l(TrendingInfo p0);
    public abstract void m(Integer p0,Integer p1);
}
