package com.yxcorp.gifshow.music.MusicRankLabelView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.widget.TextView;
import lnc.a1;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.SpannableStringBuilder;
import android.graphics.Typeface;
import ekd.d0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.StaticLayout;

public class MusicRankLabelView extends AppCompatTextView	// class@001fd2
{
    public SpannableStringBuilder f;
    public StaticLayout g;

    public void MusicRankLabelView(Context p0){
       super(p0, null);
    }
    public void MusicRankLabelView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MusicRankLabelView(Context p0,AttributeSet p1,int p2){
       try{
          super(p0, p1, p2);
          if (PatchProxy.applyVoid(null, this, MusicRankLabelView.class, "1")) {
          }else {
             this.setTextSize(1, 12.00f);
             this.setTextColor(a.a().a().getResources().getColor(R.color.arg_RES_7f06042c));
             this.setGravity(16);
             this.setIncludeFontPadding(false);
             this.setPadding(a1.e(4.00f), false, a1.e(4.00f), false);
             this.setBackgroundResource(R.drawable.arg_RES_7f0818e4);
             this.setLayoutParams(new RelativeLayout$LayoutParams(-2, -1));
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             this.f = spannableStr;
             this.setTypeface(d0.a("alte-din.ttf", this.getContext()), 1);
             this.setShadowLayer(0x3f800000, 0x3f800000, 0x3f800000, e0);
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public int getPreWidth(){
       Object obj = PatchProxy.apply(null, this, MusicRankLabelView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float f = 0;
       MusicRankLabelView tg = this.g;
       if (tg != null) {
          int lineCount = tg.getLineCount();
          for (int i = 0; i < lineCount; i = i + 1) {
             f = f + this.g.getLineWidth(i);
          }
       }
       return (((int)f + this.getPaddingLeft()) + this.getPaddingRight());
    }
}
