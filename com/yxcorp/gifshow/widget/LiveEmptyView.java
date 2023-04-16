package com.yxcorp.gifshow.widget.LiveEmptyView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;

public class LiveEmptyView extends LinearLayout	// class@00187d
{
    public ImageView b;
    public TextView c;
    public int d;
    public String e;

    public void LiveEmptyView(Context p0){
       super(p0, null);
    }
    public void LiveEmptyView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveEmptyView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!PatchProxy.isSupport(LiveEmptyView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveEmptyView.class, "2")) {
          int i = 0;
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.u2, p2, i);
          this.d = typedArray.getResourceId(i, i);
          this.e = typedArray.getString(1);
          typedArray.recycle();
       }
       LiveEmptyView td = this.d;
       LiveEmptyView te = this.e;
       if (!PatchProxy.isSupport(LiveEmptyView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(td), te, this, LiveEmptyView.class, "3")) {
          View view = LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d0ae7, this);
          if (!PatchProxy.applyVoidOneRefs(view, this, LiveEmptyView.class, "1")) {
             this.c = m1.f(view, 0x7f0a1c10);
             this.b = m1.f(view, 0x7f0a1c0f);
          }
          this.b.setImageResource(td);
          this.c.setText(te);
          this.setOrientation(1);
          this.setGravity(17);
       }
       return;
    }
    public void setEmptyImage(int p0){
       if (PatchProxy.isSupport(LiveEmptyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEmptyView.class, "5")) {
          return;
       }
       this.b.setImageResource(p0);
       return;
    }
    public void setEmptyImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEmptyView.class, "6")) {
          return;
       }
       this.b.setImageDrawable(p0);
       return;
    }
    public void setEmptyText(int p0){
       if (PatchProxy.isSupport(LiveEmptyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEmptyView.class, "4")) {
          return;
       }
       this.c.setText(this.getContext().getText(p0));
       return;
    }
}
