package com.kuaishou.live.core.show.comments.voicecomment.widget.VoiceRecordingVolumeView;
import android.view.View;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.System;
import android.graphics.RectF;
import java.lang.Integer;

public class VoiceRecordingVolumeView extends View	// class@000a68
{
    public long b;
    public long c;
    public long d;
    public int[] e;
    public int f;
    public Paint g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;

    static {
       int i = n.c(a.a().a(), 2.00f);
       VoiceRecordingVolumeView.h = i;
       VoiceRecordingVolumeView.i = n.c(a.a().a(), 0x41f00000);
       VoiceRecordingVolumeView.j = n.c(a.a().a(), 4.00f);
       VoiceRecordingVolumeView.k = i;
    }
    public void VoiceRecordingVolumeView(Context p0){
       super(p0);
       this.d = 1000;
       int[] ointArray = new int[20];
       this.e = ointArray;
       this.f = -1;
       this.a();
    }
    public void VoiceRecordingVolumeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 1000;
       int[] ointArray = new int[20];
       this.e = ointArray;
       this.f = -1;
       this.a();
    }
    public void VoiceRecordingVolumeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 1000;
       int[] ointArray = new int[20];
       this.e = ointArray;
       this.f = -1;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, VoiceRecordingVolumeView.class, "1")) {
          return;
       }
       Paint paint = new Paint(1);
       this.g = paint;
       paint.setColor(a1.a(R.color.arg_RES_7f060753));
       this.g.setStyle(Paint$Style.FILL);
       return;
    }
    public int getIntrinsicWidth(){
       return ((VoiceRecordingVolumeView.k + VoiceRecordingVolumeView.h) * 20);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoiceRecordingVolumeView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (!this.c - null) {
          this.c = System.currentTimeMillis();
       }
       int i = (int)((((System.currentTimeMillis() - this.c) % this.d) * (long)this.getMeasuredWidth()) / this.d);
       for (int i1 = 0; i1 < 20; i1 = i1 + 1) {
          int i2 = this.e[i1];
          int h = VoiceRecordingVolumeView.h;
          int k = VoiceRecordingVolumeView.k;
          int i3 = h + k;
          i3 = i3 * i1;
          i3 = i - i3;
          int i4 = h + k;
          i4 = - i4;
          if (i3 <= i4) {
             k = k + h;
             k = k * 20;
             i3 = i3 + k;
          }
          k = VoiceRecordingVolumeView.j;
          int i5 = VoiceRecordingVolumeView.i - k;
          i5 = i5 * i2;
          i5 = i5 / 100;
          i5 = i5 + k;
          i2 = this.getMeasuredHeight() - i5;
          i2 = i2 / 2;
          i5 = i5 + i2;
          i3 = i3 + h;
          i5 = h / 2;
          h = h / 2;
          float f = (float)h;
          p0.drawRoundRect(new RectF((float)i3, (float)i2, (float)i3, (float)i5), (float)i5, f, this.g);
       }
       this.invalidate();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(VoiceRecordingVolumeView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VoiceRecordingVolumeView.class, "3")) {
          return;
       }
       this.setMeasuredDimension(((VoiceRecordingVolumeView.h + VoiceRecordingVolumeView.k) * 20), VoiceRecordingVolumeView.i);
       return;
    }
    public void setOneRoundTime(long p0){
       this.d = p0;
    }
}
