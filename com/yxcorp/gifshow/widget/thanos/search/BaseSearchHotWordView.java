package com.yxcorp.gifshow.widget.thanos.search.BaseSearchHotWordView;
import szc.k;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import szc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import szc.f;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import szc.g;
import java.lang.Float;
import com.yxcorp.gifshow.widget.thanos.search.SearchMarqueeGroupHotWordView;
import vy5.b;
import java.util.Objects;
import java.lang.Long;
import ekd.y0;
import android.os.Looper;
import szc.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.thanos.search.SearchHotWordMarqueeTextView;
import szc.a;
import java.lang.Boolean;
import szc.h;

public abstract class BaseSearchHotWordView extends FrameLayout implements k	// class@0019d4
{
    public Context b;
    public DetailToolBarButtonView c;
    public DetailToolBarButtonView d;
    public SearchMarqueeGroupHotWordView e;
    public h f;
    public View$OnClickListener g;
    public int h;
    public b i;
    public boolean j;
    public float k;
    public AnimatorSet l;
    public AnimatorSet m;
    public boolean n;
    public a o;
    public View$OnClickListener p;
    public final Runnable q;
    public static final String r;

    static {
       BaseSearchHotWordView.r = "BaseSearchHotWordView";
    }
    public void BaseSearchHotWordView(Context p0){
       super(p0, null);
    }
    public void BaseSearchHotWordView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseSearchHotWordView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = a1.e(60.00f);
       boolean b = false;
       this.j = b;
       this.k = 0xbf800000;
       this.n = b;
       this.q = new b(this);
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseSearchHotWordView.class, "1")) {
       }else {
          this.b = p0;
          a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d05ea, this, true);
          this.c = this.findViewById(0x7f0a3fa6);
          this.d = this.findViewById(0x7f0a3fa7);
          if (!PatchProxy.applyVoid(null, this, BaseSearchHotWordView.class, "16")) {
             this.d.setBottomResourceId(R.drawable.arg_RES_7f080db0);
             this.d.setImageResource(R.drawable.arg_RES_7f080daf);
             this.c.setBottomResourceId(R.drawable.arg_RES_7f082403);
             this.c.setImageResource(R.drawable.arg_RES_7f082402);
             this.c.setOnClickListener(new f(this));
             this.d.setOnClickListener(new g(this));
             this.c.setVisibility(b);
             this.d.setVisibility(8);
             this.d.setAlpha(0x3f19999a);
          }
       }
       return;
    }
    public void a(float p0,float p1){
       if (PatchProxy.isSupport(BaseSearchHotWordView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseSearchHotWordView.class, "7")) {
          return;
       }
       BaseSearchHotWordView te = this.e;
       if (te != null) {
          te.a(p0, p1);
       }
       this.c.j(p0, p1);
       this.d.j(p0, p1);
       return;
    }
    public abstract void b(b p0);
    public b getCurrentItem(){
       return this.i;
    }
    public abstract b getHotWordItem();
    public void setAlpha(float p0){
       BaseSearchHotWordView te;
       if (PatchProxy.isSupport(BaseSearchHotWordView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseSearchHotWordView.class, "13")) {
          return;
       }
       super.setAlpha(p0);
       Object[] objArray = null;
       if (!p0) {
          if (!PatchProxy.applyVoid(objArray, this, BaseSearchHotWordView.class, "12")) {
             te = this.e;
             if (te != null) {
                te.c();
                this.e.setText("");
             }
          }
       }else if(p0 - 0x3f800000 || (PatchProxy.applyVoid(objArray, this, BaseSearchHotWordView.class, "11") || this.i == null)){
          te = this.e;
          if (te != null) {
             te.c();
             this.e.setText(this.i.mHotWord);
             te = this.e;
             Objects.requireNonNull(te);
             if (!PatchProxy.isSupport(SearchMarqueeGroupHotWordView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(1000), te, SearchMarqueeGroupHotWordView.class, "3")) {
                if (te.h == null && !PatchProxy.applyVoid(objArray, te, SearchMarqueeGroupHotWordView.class, "6")) {
                   te.h = new y0(Looper.getMainLooper(), 16, new l(te));
                }
                SearchMarqueeGroupHotWordView h = te.h;
                if (h != null) {
                   h.b(1000);
                }
                te.f.q();
                te.g.q();
             }
          }
       }
       return;
    }
    public void setAnimatorProgressListener(a p0){
       this.o = p0;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(BaseSearchHotWordView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseSearchHotWordView.class, "8")) {
          return;
       }
       super.setEnabled(p0);
       this.c.setEnabled(p0);
       this.d.setEnabled(p0);
       BaseSearchHotWordView te = this.e;
       if (te != null) {
          te.setEnabled(p0);
       }
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(BaseSearchHotWordView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseSearchHotWordView.class, "9")) {
          return;
       }
       BaseSearchHotWordView te = this.e;
       if (te != null) {
          te.setProgress(p0);
       }else {
          this.k = p0;
       }
       this.c.setProgress(p0);
       this.d.setProgress(p0);
       return;
    }
    public void setSearchHotWordClickListener(h p0){
       this.f = p0;
    }
    public void setSearchOnClickListener(View$OnClickListener p0){
       this.g = p0;
    }
    public void setSearchUnLoginClickListenerFromNebula(View$OnClickListener p0){
       this.p = p0;
    }
}
