package com.yxcorp.gifshow.camera.record.widget.SelectWithoutStrokeTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import java.lang.Integer;
import java.lang.reflect.Field;
import java.lang.Boolean;

public class SelectWithoutStrokeTextView extends AppCompatTextView	// class@000fdd
{
    public boolean f;
    public int g;
    public int h;
    public Paint i;

    public void SelectWithoutStrokeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectWithoutStrokeTextView.class, "2")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.x5);
          this.f = typedArray.getBoolean(0, 0);
          this.g = typedArray.getColor(1, 0x26000000);
          this.h = typedArray.getColor(2, a1.e(0x3fc00000));
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, this, SelectWithoutStrokeTextView.class, "3")) {
          this.i = this.getPaint();
          this.setGravity(17);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectWithoutStrokeTextView.class, "5")) {
          return;
       }
       if (this.f == null) {
          super.onDraw(p0);
          return;
       }else {
          this.setCurrentColor(this.g);
          this.i.setStrokeMiter(10.00f);
          this.i.setStrokeJoin(Paint$Join.ROUND);
          this.i.setStrokeWidth((float)this.h);
          this.i.setStyle(Paint$Style.FILL_AND_STROKE);
          super.onDraw(p0);
          this.setCurrentColor(this.getCurrentTextColor());
          this.i.setStyle(Paint$Style.FILL);
          this.i.setStrokeWidth(0);
          this.i.setFakeBoldText(false);
          super.onDraw(p0);
          return;
       }
    }
    public final void setCurrentColor(int p0){
       if (PatchProxy.isSupport(SelectWithoutStrokeTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SelectWithoutStrokeTextView.class, "4")) {
          return;
       }
       try{
          Field declaredFiel = TextView.class.getDeclaredField("mCurTextColor");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Integer.valueOf(p0));
          return;
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(SelectWithoutStrokeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SelectWithoutStrokeTextView.class, "1")) {
          return;
       }
       super.setSelected(p0);
       if (p0) {
          this.setStrokeColor(0);
       }else {
          this.setStrokeColor(a1.a(R.color.arg_RES_7f0601aa));
       }
       this.invalidate();
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(SelectWithoutStrokeTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SelectWithoutStrokeTextView.class, "6")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
}
