package com.kwai.component.photo.detail.slide.widget.TrendingTextSwitcher;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import tf5.d;
import android.widget.ViewSwitcher$ViewFactory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import android.view.View;
import com.yxcorp.gifshow.entity.TrendingInfo;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class TrendingTextSwitcher extends ViewSwitcher	// class@000acc
{
    public List b;
    public int c;
    public TrendingInfo d;
    public static final int e;

    public void TrendingTextSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.setFactory(new d(this, p0));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TrendingTextSwitcher.class, "2")) {
          return;
       }
       if (a.t().d("DisableTrendingHotBottomBarSwitch", false)) {
          return;
       }
       if (this.b.size() <= 1) {
          return;
       }
       this.c = (this.c < (this.b.size() - 1))? this.c + 1: 0;
       this.c(1);
       return;
    }
    public final void b(View p0,TrendingInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrendingTextSwitcher.class, "6")) {
          return;
       }
       p0.findViewWithTag("innerText").setText(p1.mDesc);
       p0.setVisibility(0);
       return;
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(TrendingTextSwitcher.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TrendingTextSwitcher.class, "3")) {
          return;
       }
       TrendingInfo trendingInfo = this.b.get(this.c);
       this.d = trendingInfo;
       if (p0) {
          this.setText(trendingInfo);
       }else {
          this.setCurrentText(trendingInfo);
       }
       return;
    }
    public TrendingInfo getCurTrendingInfo(){
       return this.d;
    }
    public final void setCurrentText(TrendingInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingTextSwitcher.class, "5")) {
          return;
       }
       this.b(this.getChildAt(0), p0);
       return;
    }
    public final void setText(TrendingInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingTextSwitcher.class, "4")) {
          return;
       }
       this.b(this.getNextView(), p0);
       this.showNext();
       return;
    }
    public void setTexts(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingTextSwitcher.class, "1")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       TrendingTextSwitcher tc = this.c;
       if (q.f(this.b)) {
          this.c = 0;
       }else if(tc < p0.size()){
          tc = 0;
       }
       this.c = tc;
       this.b = p0;
       this.reset();
       this.c(0);
       return;
    }
}
