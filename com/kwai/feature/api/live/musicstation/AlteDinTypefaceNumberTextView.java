package com.kwai.feature.api.live.musicstation.AlteDinTypefaceNumberTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.IndexOutOfBoundsException;

public class AlteDinTypefaceNumberTextView extends TextView	// class@000fe6
{

    public void AlteDinTypefaceNumberTextView(Context p0){
       super(p0, null);
    }
    public void AlteDinTypefaceNumberTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AlteDinTypefaceNumberTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, AlteDinTypefaceNumberTextView.class, "1")) {
       }else {
          try{
             this.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          }catch(java.lang.IndexOutOfBoundsException e1){
             e1.printStackTrace();
          }
       }
    }
}
