package com.kwai.feature.component.widget.SearchEllipsizeTextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Runnable;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import uy5.a;
import q87.c;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Exception;
import k06.f;
import android.text.TextUtils$TruncateAt;

public class SearchEllipsizeTextView extends SelectShapeTextView	// class@0012ae
{
    public Runnable g;
    public static final int h;

    public void SearchEllipsizeTextView(Context p0){
       super(p0);
    }
    public void SearchEllipsizeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SearchEllipsizeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchEllipsizeTextView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.g);
       this.g = null;
       return;
    }
    public final float q(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEllipsizeTextView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (TextUtils.isEmpty(p0) || this.getPaint() == null) {
          return 0;
       }
       return this.getPaint().measureText(p0);
    }
    public final void r(String p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEllipsizeTextView.class, "3")) {
          return;
       }
       int i = 0;
       if (TextUtils.isEmpty(p0)) {
          Object[] objArray = new Object[i];
          a.C().s("SearchEllipsizeTextView", "tryStartCutting return cause originContentText empty!", objArray);
          return;
       }else if(this.q(p0) - (float)this.getWidth() <= 0){
          return;
       }else {
          int width = this.getWidth();
          if (PatchProxy.isSupport(SearchEllipsizeTextView.class)) {
             Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(width), this, SearchEllipsizeTextView.class, "6");
             if (obj != PatchProxyResult.class) {
                p0 = obj;
             }else {
             label_004e :
                int i1 = p0.length() - 1;
                int i2 = 0;
                try{
                   while (i2 <= i1) {
                      int i3 = i1 - i2;
                      i3 = i3 / 2;
                      i3 = i3 + i2;
                      String str = p0.substring(i, i3)+"бн";
                      float f = this.q(str);
                      String str1 = null;
                      int i4 = i3 + 1;
                      if (i4 <= p0.length()) {
                         str1 = this.q(p0.substring(i3, i4));
                      }
                      float f1 = (float)width;
                      if (f - f1 > 0) {
                         i1 = i3 - 1;
                      }else {
                         f1 = f1 - str1;
                         f1 = f1 - 5.00f;
                         if (f - f1 < 0) {
                            i2 = i4;
                         }else {
                            p0 = str;
                            break ;
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
             }
          }else {
             goto label_004e ;
          }
       }
    }
    public void setEllipsisText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEllipsizeTextView.class, "1")) {
          return;
       }
       this.setText(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, SearchEllipsizeTextView.class, "2")) {
          if (this.getWidth() > 0) {
             Object[] objArray = new Object[0];
             a.C().s("SearchEllipsizeTextView", "listenViewGlobalLayoutAndTryCut immediately", objArray);
             this.r(p0);
          }else if(this.g == null){
             this.g = new f(this, p0);
          }
          this.removeCallbacks(this.g);
          this.post(this.g);
       }
       this.setEllipsize(TextUtils$TruncateAt.END);
       return;
    }
}
