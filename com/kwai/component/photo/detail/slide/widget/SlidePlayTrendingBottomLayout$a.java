package com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout$a;
import java.lang.Object;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.component.photo.detail.slide.widget.TrendingTextSwitcher;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import com.yxcorp.gifshow.entity.TrendingTitleInfo;

public abstract class SlidePlayTrendingBottomLayout$a	// class@000ac7
{
    public View a;
    public TextView b;
    public View c;
    public ImageView d;
    public View e;
    public KwaiImageView f;
    public View g;
    public TrendingTextSwitcher h;
    public View i;

    public void SlidePlayTrendingBottomLayout$a(){
       super();
    }
    public abstract void a(View$OnClickListener p0);
    public abstract void b();
    public abstract void c(View$OnClickListener p0);
    public final View d(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("mBuySameStyleContainer");
       }
       return obj;
    }
    public final TextView e(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mBuySameStyleTextView");
       }
       return obj;
    }
    public final View f(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj == null) {
          a.S("mDividerLine");
       }
       return obj;
    }
    public final View g(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          a.S("mInnerNextIcon");
       }
       return obj;
    }
    public final ImageView h(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("mMoreIcon");
       }
       return obj;
    }
    public final View i(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mMoreTrendingBar");
       }
       return obj;
    }
    public final View j(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("mNextTrendingBar");
       }
       return obj;
    }
    public final TrendingTextSwitcher k(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("mTextSwitcher");
       }
       return obj;
    }
    public final KwaiImageView l(){
       SlidePlayTrendingBottomLayout$a obj = PatchProxy.apply(null, this, SlidePlayTrendingBottomLayout$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          a.S("mTrendingIcon");
       }
       return obj;
    }
    public abstract void m(List p0);
    public abstract void n(TrendingTitleInfo p0);
    public abstract void o();
}
