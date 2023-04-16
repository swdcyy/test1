package com.yxcorp.gifshow.widget.MultiLineEllipsizeTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.text.Layout;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextPaint;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.TextUtils;
import java.util.List;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.MultiLineEllipsizeTextView$b;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.MultiLineEllipsizeTextView$a;
import com.yxcorp.utility.Log;
import java.lang.IndexOutOfBoundsException;

public class MultiLineEllipsizeTextView extends EmojiTextView	// class@001886
{
    public final String v;
    public CharSequence w;
    public int x;
    public int y;
    public MultiLineEllipsizeTextView$a z;

    public void MultiLineEllipsizeTextView(Context p0){
       super(p0);
       this.v = "MultiLineEllipsizeTextView";
    }
    public void MultiLineEllipsizeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = "MultiLineEllipsizeTextView";
    }
    public void MultiLineEllipsizeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v = "MultiLineEllipsizeTextView";
    }
    public void onMeasure(int p0,int p1){
       ArrayList obj1;
       String str;
       MultiLineEllipsizeTextView$b uob;
       List eMPTY_LIST;
       Object obj = this;
       if (PatchProxy.isSupport(MultiLineEllipsizeTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, MultiLineEllipsizeTextView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       Layout layout = this.getLayout();
       if (layout != null && layout.getLineCount() > obj.y) {
          CharSequence text = this.getText();
          CharSequence uCharSequenc = text.subSequence((text.length() - obj.x), text.length());
          int i = layout.getWidth() - this.getPaddingLeft();
          int paddingRight = this.getPaddingRight();
          try{
             i = i - paddingRight;
             int i1 = 1;
             paddingRight = (int)layout.getLineWidth((obj.y - i1));
             int lineEnd = layout.getLineEnd((obj.y - i1));
             MultiLineEllipsizeTextView w = obj.w;
             if (w != null) {
                paddingRight = paddingRight + (int)Math.ceil((double)(Layout.getDesiredWidth(w, this.getPaint()) + Layout.getDesiredWidth(uCharSequenc, this.getPaint())));
                boolean i2 = 0;
                if (paddingRight > i) {
                   paddingRight = paddingRight - i;
                   CharSequence uCharSequenc1 = text.subSequence(i2, lineEnd);
                   if (PatchProxy.isSupport(MultiLineEllipsizeTextView.class)) {
                      obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(paddingRight), uCharSequenc1, obj, MultiLineEllipsizeTextView.class, "3");
                      if (obj1 != PatchProxyResult.class) {
                         i = obj1.intValue();
                      label_00a9 :
                         paddingRight = 0;
                      label_01af :
                         obj.setText(text.subSequence(paddingRight, (lineEnd - i)));
                         obj.append(obj.w);
                         obj.append(uCharSequenc);
                      }
                   }
                   if (TextUtils.isEmpty(uCharSequenc1)) {
                      i = 0;
                      goto label_00a9 ;
                   }else {
                      obj1 = PatchProxy.applyOneRefs(uCharSequenc1, obj, MultiLineEllipsizeTextView.class, "5");
                      if (obj1 != PatchProxyResult.class) {
                      }else {
                         SpannableStringBuilder spannableStr = SpannableStringBuilder.valueOf(uCharSequenc1);
                         CharacterStyle[] spans = spannableStr.getSpans(i2, spannableStr.length(), CharacterStyle.class);
                         if (spans == null || !spans.length) {
                            eMPTY_LIST = Collections.EMPTY_LIST;
                         }else {
                            ArrayList uArrayList = new ArrayList();
                            int len = spans.length;
                            int i5 = 0;
                            while (i5 < len) {
                               object oobject = spans[i5];
                               uArrayList.add(new MultiLineEllipsizeTextView$b(Integer.valueOf(spannableStr.getSpanStart(oobject)), Integer.valueOf(spannableStr.getSpanEnd(oobject))));
                               i5 = i5 + 1;
                               str = 1;
                            }
                            eMPTY_LIST = uArrayList;
                         }
                      }
                      str = uCharSequenc1.toString();
                      uCharSequenc1.length();
                      int i3 = str.codePointCount(i2, uCharSequenc1.length());
                      int i4 = 0;
                      while (i3 > 0 && paddingRight > i4) {
                         i3 = i3 - 1;
                         i4 = str.offsetByCodePoints(i2, i3);
                         if (PatchProxy.isSupport(MultiLineEllipsizeTextView.class)) {
                            uob = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(i4), obj, MultiLineEllipsizeTextView.class, "4");
                            if (uob != PatchProxyResult.class) {
                            }else if(obj1 == null || obj1.isEmpty()){
                               Iterator iterator = obj1.iterator();
                               while (true) {
                                  if (iterator.hasNext()) {
                                     MultiLineEllipsizeTextView$b uob1 = iterator.next();
                                     Integer integer = Integer.valueOf(i4);
                                     Objects.requireNonNull(uob1);
                                     String obj2 = PatchProxy.applyOneRefs(integer, uob1, MultiLineEllipsizeTextView$b.class, "1");
                                     if (obj2 != PatchProxyResult.class) {
                                        i2 = obj2.booleanValue();
                                     }else if(integer.compareTo(uob1.a) >= 0){
                                        obj2 = 1;
                                     }else {
                                        obj2 = 0;
                                     }
                                     uob = (integer.compareTo(uob1.b) < 0)? 1: null;
                                     if (obj2 && uob) {
                                        i2 = true;
                                     }else {
                                        i2 = false;
                                     }
                                     if (i2) {
                                        uob = uob1;
                                        break ;
                                     }else {
                                        obj2 = null;
                                     }
                                  }
                               }
                            }
                         label_0181 :
                            uob = null;
                         }else {
                            goto label_012d ;
                         }
                         if (uob != null) {
                            i4 = uob.a.intValue();
                            i3 = str.codePointCount(0, i4);
                         }
                         i4 = (int)Layout.getDesiredWidth(uCharSequenc1.subSequence(i4, uCharSequenc1.length()), this.getPaint());
                         i2 = 0;
                      }
                      paddingRight = 0;
                      i = uCharSequenc1.length() - str.offsetByCodePoints(paddingRight, i3);
                      goto label_01af ;
                   }
                }else {
                   obj.setText(text.subSequence(0, lineEnd));
                   obj.append(obj.w);
                   obj.append(uCharSequenc);
                }
                MultiLineEllipsizeTextView z = obj.z;
                if (z != null) {
                   z.a();
                }
             }else {
                Log.d("MultiLineEllipsizeTextView", "setEllipsizeText is not called!");
             }
          }catch(java.lang.IndexOutOfBoundsException e0){
             e0.printStackTrace();
          }
       }
    }
    public void setListener(MultiLineEllipsizeTextView$a p0){
       this.z = p0;
    }
    public void setMaxLines(int p0){
       if (PatchProxy.isSupport(MultiLineEllipsizeTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MultiLineEllipsizeTextView.class, "1")) {
          return;
       }
       super.setMaxLines(p0);
       this.y = p0;
       return;
    }
}
