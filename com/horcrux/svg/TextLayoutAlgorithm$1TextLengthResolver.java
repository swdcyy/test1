package com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver;
import com.horcrux.svg.TextLayoutAlgorithm;
import com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation;
import java.lang.Object;
import com.horcrux.svg.TextView;
import java.lang.Class;
import com.horcrux.svg.TSpanView;
import java.lang.String;
import java.lang.Math;
import com.horcrux.svg.SVGLength;
import android.view.ViewGroup;
import android.view.View;
import com.horcrux.svg.TextPathView;

public class TextLayoutAlgorithm$1TextLengthResolver	// class@000604
{
    public int global;
    public final TextLayoutAlgorithm this$0;
    public final TextLayoutAlgorithm$CharacterInformation[] val$result;

    public void TextLayoutAlgorithm$1TextLengthResolver(TextLayoutAlgorithm p0,TextLayoutAlgorithm$CharacterInformation[] p1){
       this.this$0 = p0;
       this.val$result = p1;
       super();
    }
    public void resolveTextLength(TextView p0){
       TextView textView2;
       double d2;
       TextView textView3;
       TextLayoutAlgorithm$1TextLengthResolver u1TextLength = this;
       TextView textView = p0;
       Class class = p0.getClass();
       int i = (textView.mTextLength != null)? 1: 0;
       if (class == TSpanView.class && i) {
          double d = Double.NEGATIVE_INFINITY;
          TextView textView1 = textView;
          TSpanView mContent = textView1.mContent;
          TextLayoutAlgorithm$1TextLengthResolver global = u1TextLength.global;
          int i1 = (mContent == null)? 0: mContent.length();
          i1 = i1 + global;
          TextLayoutAlgorithm$1TextLengthResolver u1TextLength1 = global;
          double d1 = Double.POSITIVE_INFINITY;
          while (true) {
             if (u1TextLength1 <= i1) {
                TextLayoutAlgorithm$1TextLengthResolver val$result = u1TextLength.val$result;
                if (val$result[global].addressable == null) {
                   textView2 = textView1;
                }else {
                   TextLayoutAlgorithm$CharacterInformation character = val$result[global].character;
                   if (character != 10 && character != 13) {
                      textView2 = textView1;
                      TextLayoutAlgorithm$CharacterInformation x = val$result[u1TextLength1].x;
                      d2 = val$result[u1TextLength1].advance + x;
                      d1 = Math.min(d1, Math.min(x, d2));
                      d = Math.max(d, Math.max(x, d2));
                   }else {
                      return;
                   }
                }
                u1TextLength1 = u1TextLength1 + 1;
                textView1 = textView2;
             }else {
                textView2 = textView1;
                if (d1 - Double.POSITIVE_INFINITY) {
                   double d3 = textView.mTextLength.value - (d - d1);
                   int i2 = 0;
                   i = 0;
                   int i3 = 0;
                   while (i2 < p0.getChildCount()) {
                      if (textView.getChildAt(i2).mTextLength == null) {
                         textView3 = textView2;
                         TSpanView mContent1 = textView3.mContent;
                         int i4 = (mContent1 == null)? 0: mContent1.length();
                         i = i + i4;
                         int i5 = 1;
                      }else {
                         textView3 = textView2;
                         u1TextLength.val$result[i].firstCharacterInResolvedDescendant = true;
                         i3 = i3 + 1;
                      }
                      i2 = i2 + 1;
                      textView2 = textView3;
                   }
                   d3 = d3 / (double)(i + (i3 - 1));
                   double d4 = 0;
                   while (global <= i1) {
                      TextLayoutAlgorithm$1TextLengthResolver val$result1 = u1TextLength.val$result;
                      object oobject = val$result1[global];
                      d2 = oobject.x + d4;
                      oobject.x = d2;
                      if (val$result1[global].middle == null && (val$result1[global].resolved == null || val$result1[global].firstCharacterInResolvedDescendant != null)) {
                         d4 = d4 + d3;
                      }
                      global = global + 1;
                   }
                }
             }
          }
       }
       return;
    }
}
