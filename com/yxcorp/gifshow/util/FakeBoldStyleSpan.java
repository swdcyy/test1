package com.yxcorp.gifshow.util.FakeBoldStyleSpan;
import android.text.style.StyleSpan;
import android.text.TextPaint;

public class FakeBoldStyleSpan extends StyleSpan	// class@001eeb
{

    public void FakeBoldStyleSpan(int p0){
       super(p0);
    }
    public final void a(TextPaint p0){
       p0.setFakeBoldText(true);
    }
    public void updateDrawState(TextPaint p0){
       this.a(p0);
    }
    public void updateMeasureState(TextPaint p0){
       this.a(p0);
    }
}
