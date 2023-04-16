package com.yxcorp.gifshow.widget.EllipsizingTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.TextView;
import android.graphics.Canvas;
import android.text.TextUtils$TruncateAt;
import android.text.Layout;
import java.lang.StringBuilder;
import android.text.TextPaint;
import java.lang.CharSequence;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.EllipsizingTextView$a;
import java.lang.Integer;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import java.lang.Float;
import android.text.StaticLayout;
import rnc.i;
import android.text.Layout$Alignment;

public class EllipsizingTextView extends EmojiTextView	// class@00182e
{
    public int A;
    public float B;
    public float C;
    public final List v;
    public boolean w;
    public boolean x;
    public boolean y;
    public String z;

    public void EllipsizingTextView(Context p0){
       super(p0);
       this.v = new ArrayList();
       this.A = -1;
       this.B = 0x3f800000;
       this.C = 0;
    }
    public void EllipsizingTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = new ArrayList();
       this.A = -1;
       this.B = 0x3f800000;
       this.C = 0;
    }
    public void EllipsizingTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v = new ArrayList();
       this.A = -1;
       this.B = 0x3f800000;
       this.C = 0;
    }
    public final int getInnerWidth(){
       Object obj = PatchProxy.apply(null, this, EllipsizingTextView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public int getMaxLines(){
       return this.A;
    }
    public void onDraw(Canvas p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, EllipsizingTextView.class, "6")) {
          return;
       }
       if (this.x != null) {
          super.setEllipsize(null);
          if (!PatchProxy.applyVoid(null, this, EllipsizingTextView.class, "7")) {
             int maxLines = this.getMaxLines();
             EllipsizingTextView tz = this.z;
             boolean i = -1;
             if (maxLines != i) {
                Layout layout = this.v(tz);
                if (layout.getLineCount() > maxLines) {
                   int i1 = maxLines - 1;
                   tz = ((this.z).substring(0, layout.getLineEnd(i1))).trim();
                   while (this.v(tz+"...").getLineCount() > maxLines) {
                      i1 = tz.lastIndexOf(32);
                      if (i1 == i) {
                         break ;
                      }
                      tz = tz.substring(0, i1);
                   }
                   i = true;
                }else {
                   i = false;
                }
                if (maxLines == 1 || layout.getLineCount() == 1) {
                   while (true) {
                      if (i) {
                         str = tz+"...";
                      label_008b :
                         TextPaint paint = this.getPaint();
                         Object obj = PatchProxy.applyTwoRefs(str, paint, this, EllipsizingTextView.class, "11");
                         float f = (obj != PatchProxyResult.class)? obj.floatValue(): Layout.getDesiredWidth(str, paint);
                         if (f - (float)this.getInnerWidth() > 0 && tz.length() > 1) {
                            maxLines = tz.length() - 1;
                            tz = tz.substring(0, maxLines);
                         }
                      }else {
                         str = tz;
                         goto label_008b ;
                      }
                   }
                }
             label_00bf :
                if (i) {
                   tz = tz+"...";
                }
             }else {
                i = false;
             }
             if (!tz.equals(this.getText())) {
                this.y = true;
                this.setText(tz);
                this.y = false;
             }
             this.x = false;
             if (i != this.w) {
                this.w = i;
                Iterator iterator = this.v.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(i);
                }
             }
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(EllipsizingTextView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, EllipsizingTextView.class, "5")) {
          return;
       }
       super.onTextChanged(p0, p1, p2, p3);
       if (this.y == null) {
          this.z = p0.toString();
          this.x = true;
       }
       return;
    }
    public void setEllipsize(TextUtils$TruncateAt p0){
    }
    public void setLineSpacing(float p0,float p1){
       if (PatchProxy.isSupport(EllipsizingTextView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EllipsizingTextView.class, "4")) {
          return;
       }
       this.C = p0;
       this.B = p1;
       super.setLineSpacing(p0, p1);
       return;
    }
    public void setMaxLines(int p0){
       if (PatchProxy.isSupport(EllipsizingTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EllipsizingTextView.class, "3")) {
          return;
       }
       super.setMaxLines(p0);
       this.A = p0;
       this.x = true;
       return;
    }
    public final Layout v(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EllipsizingTextView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       StaticLayout staticLayout = new StaticLayout(i.i(p0), this.getPaint(), this.getInnerWidth(), Layout$Alignment.ALIGN_NORMAL, this.B, this.C, false);
       return obj;
    }
}
