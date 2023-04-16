package com.kuaishou.live.audience.component.gift.DrawingGiftGallery;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import wy0.b;
import android.view.View$OnClickListener;
import wy0.a;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery$c;
import h3.a;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery$b;
import android.view.View$OnKeyListener;
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import com.kuaishou.live.audience.component.gift.DrawingGiftGallery$d;

public class DrawingGiftGallery extends RelativeLayout implements d	// class@000ad9
{
    public ViewPager b;
    public HorizontalPageIndicator c;
    public DrawingGiftGallery$d d;
    public DrawingGiftGallery$c e;
    public static final int f;

    public void DrawingGiftGallery(Context p0){
       super(p0);
    }
    public void DrawingGiftGallery(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DrawingGiftGallery(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftGallery.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a444e);
       this.c = m1.f(p0, 0x7f0a2f6d);
       m1.a(p0, new b(this), R.id.select_btn);
       m1.a(p0, new a(this), R.id.cancel_btn);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, DrawingGiftGallery.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       DrawingGiftGallery$c uoc = new DrawingGiftGallery$c();
       this.e = uoc;
       this.b.setAdapter(uoc);
       this.b.addOnPageChangeListener(new DrawingGiftGallery$a(this));
       this.setFocusableInTouchMode(true);
       this.setOnKeyListener(new DrawingGiftGallery$b(this));
       return;
    }
    public void setGifts(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawingGiftGallery.class, "3")) {
          return;
       }
       DrawingGiftGallery te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, DrawingGiftGallery$c.class, "1")) {
          te.d.clear();
          te.d.addAll(p0);
       }
       this.b.setAdapter(this.e);
       this.b.setCurrentItem((p0.size() * 20));
       this.c.setItemCount(p0.size());
       return;
    }
    public void setListener(DrawingGiftGallery$d p0){
       this.d = p0;
    }
}
