package com.kwai.library.widget.span.VariableForegroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.os.Parcel;
import android.text.TextPaint;

public class VariableForegroundColorSpan extends ForegroundColorSpan	// class@0009fa
{
    public int b;

    public void VariableForegroundColorSpan(){
       super(0);
    }
    public void VariableForegroundColorSpan(int p0){
       super(0);
       this.b = p0;
    }
    public void VariableForegroundColorSpan(Parcel p0){
       super(p0);
       this.b = p0.readInt();
    }
    public int getForegroundColor(){
       return this.b;
    }
    public void updateDrawState(TextPaint p0){
       p0.setColor(this.b);
    }
}
