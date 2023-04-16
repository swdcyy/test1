package com.kwai.library.widget.specific.lyrics.SingleLineLyricView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.Paint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;

public class SingleLineLyricView extends AppCompatTextView	// class@0009ff
{
    public List f;
    public List g;
    public List h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public List p;
    public Paint q;
    public int r;
    public long s;
    public boolean t;

    public void SingleLineLyricView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.r = 0;
       this.s = 0;
       this.t = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.f5);
       this.l = typedArray.getColor(0, -1);
       this.k = typedArray.getDimensionPixelSize(2, a1.e(18.00f));
       this.m = typedArray.getBoolean(1, 0);
       typedArray.recycle();
       TextPaint paint = this.getPaint();
       this.q = paint;
       paint.setTextSize((float)this.k);
       this.q.setColor(this.l);
       this.n = this.getResources().getColor(0x7f061610);
       this.o = a1.e(0x3fc00000);
       this.setGravity(17);
    }
    public void onDraw(Canvas p0){
       if (this.m != null) {
          this.setCurrentColor(this.n);
          this.q.setStrokeMiter(10.00f);
          this.q.setStrokeJoin(Paint$Join.ROUND);
          this.q.setStrokeWidth((float)this.o);
          this.q.setStyle(Paint$Style.FILL_AND_STROKE);
          super.onDraw(p0);
       }
       this.setCurrentColor(this.l);
       this.q.setStyle(Paint$Style.FILL);
       this.q.setStrokeWidth(0);
       this.q.setFakeBoldText(false);
       super.onDraw(p0);
       return;
    }
    public final void setCurrentColor(int p0){
       try{
          Field declaredFiel = TextView.class.getDeclaredField("mCurTextColor");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Integer.valueOf(p0));
       }catch(java.lang.NoSuchFieldException e3){
          e3.printStackTrace();
       }catch(java.lang.IllegalAccessException e3){
          e3.printStackTrace();
       }
       return;
    }
}
