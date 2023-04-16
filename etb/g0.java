package etb.g0;
import java.lang.Runnable;
import etb.i0;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$ContentInfo;
import gtb.d;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import java.lang.StringBuilder;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import lnc.a1;
import pfc.a;

public final class g0 implements Runnable	// class@0027f4
{
    public final i0 b;

    public void g0(i0 p0){
       this.b = p0;
    }
    public final void run(){
       i0 this;
       int i1;
       int i4;
       g0 b = this.b;
       i0 w = b.w;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i0 oi0 = i0.class;
       if (PatchProxy.applyVoidOneRefs(w, b, oi0, "8")) {
       }else {
          NoticeBoxVideoCardItem mContentInfo = b.t.mContentInfo;
          a obj = null;
          if (mContentInfo.mSplitContent == null) {
             String str = PatchProxy.applyOneRefs(w, obj, d.class, "1");
             if (str != patchProxyRe) {
             }else {
                str = "";
                if (w != null && !TextUtils.x(w.getText())) {
                   String str1 = w.getText().toString();
                   TextPaint paint = w.getPaint();
                   if (paint != null) {
                      float f = (float)((w.getWidth() - w.getPaddingLeft()) - w.getPaddingRight());
                      String[] stringArray = (str1.replaceAll("\r", str)).split("\n");
                      StringBuilder str2 = "";
                      if (stringArray.length > 0) {
                         i1 = stringArray.length;
                         int i3 = 0;
                         while (i3 < i1) {
                            object oobject = stringArray[i3];
                            if (oobject == null) {
                               break ;
                            }else if(paint.measureText(oobject) - f <= 0){
                               str2 = str2+oobject;
                            }else {
                               float f1 = 0;
                               int i5 = 0;
                               float f2 = 0;
                               while (i5 < oobject.length()) {
                                  char c = oobject.charAt(i5);
                                  i4 = i1;
                                  float f3 = paint.measureText(String.valueOf(c));
                                  f2 = f2 + f3;
                                  if (f2 - f <= 0) {
                                     str2 = str2+c;
                                  }else {
                                     str2 = str2+"\n"+c;
                                     f3 = f3 + f1;
                                     f2 = f3;
                                  }
                                  i5 = i5 + 1;
                                  i1 = i4;
                               }
                            }
                            i4 = i1;
                            str2 = str2+"\n";
                            i3 = i3 + 1;
                            i1 = i4;
                            String str3 = null;
                         }
                         if (!str1.endsWith("\n") && str2.length() > 0) {
                            str2.deleteCharAt((str2.length() - 1));
                         }
                         str = str2;
                      }
                   }
                }
             }
             mContentInfo.mSplitContent = str;
          }
          this = b.t;
          if (this.mUnread == null) {
             w.setText(this.mContentInfo.mSplitContent);
          }else if(this.mContentInfo.mContentWithSpan == null){
             SpannableStringBuilder spannableStr = new SpannableStringBuilder(b.t.mContentInfo.mSplitContent);
             if (b.q == null) {
                int i = spannableStr.length();
                spannableStr.append("P");
                i1 = spannableStr.length();
                a uoa = PatchProxy.apply(null, null, oi0, "9");
                if (uoa != patchProxyRe) {
                }else {
                   Drawable uDrawable = a1.f(R.drawable.arg_RES_7f081a23);
                   int i2 = a1.e(8.00f);
                   if (uDrawable != null) {
                      uDrawable.setBounds(0, 0, i2, i2);
                   }
                   obj = new a(uDrawable, "P", i2, 0, 2);
                }
                spannableStr.setSpan(uoa, i, i1, 33);
             }
             b.t.mContentInfo.mContentWithSpan = spannableStr;
          }
          w.setText(b.t.mContentInfo.mContentWithSpan);
       }
       return;
    }
}
