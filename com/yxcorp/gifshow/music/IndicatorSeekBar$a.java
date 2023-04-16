package com.yxcorp.gifshow.music.IndicatorSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.music.IndicatorSeekBar;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.Objects;
import android.view.View;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;

public final class IndicatorSeekBar$a implements SeekBar$OnSeekBarChangeListener	// class@001fcd
{
    public final IndicatorSeekBar b;

    public void IndicatorSeekBar$a(IndicatorSeekBar p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(IndicatorSeekBar$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, IndicatorSeekBar$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          SeekBar$OnSeekBarChangeListener onSeekBarCha = iterator.next();
          if (onSeekBarCha != null) {
             onSeekBarCha.onProgressChanged(p0, p1, p2);
          }
       }
       IndicatorSeekBar$a tb = this.b;
       IndicatorSeekBar v = tb.v;
       if (v != null) {
          v.setTranslationX(tb.getIndicatorX());
       }
       IndicatorSeekBar v1 = this.b.v;
       if (v1 != null) {
          v1.setText(String.valueOf(p1));
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       IndicatorSeekBar v1;
       if (PatchProxy.applyVoidOneRefs(p0, this, IndicatorSeekBar$a.class, "2")) {
          return;
       }
       IndicatorSeekBar$a tb = this.b;
       if (tb.x == null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, IndicatorSeekBar.class, "5")) {
             View view = tb.getRootView().findViewById(0x1020002);
             a.o(view, "rootView.findViewById\(android.R.id.content\)");
             view.addView(tb.v, new FrameLayout$LayoutParams(n.c(tb.getContext(), tb.z), n.c(tb.getContext(), tb.y)));
             int i = 2;
             int[] ointArray = new int[i];
             tb.getLocationOnScreen(ointArray);
             tb.B = (float)((tb.getWidth() - tb.getPaddingStart()) - tb.getPaddingEnd());
             tb.A = (float)((ointArray[0] + tb.getPaddingStart()) - (n.c(tb.getContext(), tb.z) / i));
             IndicatorSeekBar v = tb.v;
             if (v != null) {
                v.setTranslationX(tb.getIndicatorX());
             }
             int[] ointArray1 = new int[i];
             view.getLocationOnScreen(ointArray1);
             if ((v1 = tb.v) != null) {
                v1.setY(((float)((ointArray[1] - n.c(tb.getContext(), tb.y)) - 5) - (float)ointArray1[1]));
             }
             IndicatorSeekBar v2 = tb.v;
             if (v2 != null) {
                v2.setVisibility(8);
             }
          }
          this.b.x = true;
       }
       n.Y(this.b.v, 0, true);
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          SeekBar$OnSeekBarChangeListener onSeekBarCha = iterator.next();
          if (onSeekBarCha != null) {
             onSeekBarCha.onStartTrackingTouch(p0);
          }
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IndicatorSeekBar$a.class, "3")) {
          return;
       }
       n.Y(this.b.v, 8, true);
       Iterator iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          SeekBar$OnSeekBarChangeListener onSeekBarCha = iterator.next();
          if (onSeekBarCha != null) {
             onSeekBarCha.onStopTrackingTouch(p0);
          }
       }
       return;
    }
}
