package com.kwai.feature.component.widget.SearchTipsLayout;
import com.kwai.feature.component.widget.SearchEditorLayout$d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import cw9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import k06.g;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.lang.Boolean;
import com.kwai.feature.component.widget.SearchTipsLayout$a;

public class SearchTipsLayout extends FrameLayout implements SearchEditorLayout$d	// class@0012b0
{
    public View b;
    public TextView c;
    public int d;
    public SearchTipsLayout$a e;
    public final float f;
    public static final int g;

    public void SearchTipsLayout(Context p0){
       super(p0, null);
    }
    public void SearchTipsLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchTipsLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       float f = (b.g())? 16.00f: 14.00f;
       this.f = f;
       if (!PatchProxy.applyVoidOneRefs(p0, this, SearchTipsLayout.class, "1")) {
          View view = a.c(p0, R.layout.arg_RES_7f0d148f, this);
          this.b = m1.f(view, 0x7f0a37d4);
          TextView textView = m1.f(view, R.id.search_tips_text);
          this.c = textView;
          textView.setTextSize(f);
          m1.a(view, new g(this), R.id.search_tips_wrapper);
       }
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTipsLayout.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, SearchTipsLayout.class, "4")) {
          int i = 1;
          if (!TextUtils.x(p0)) {
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             SpannableString spannableStr = new SpannableString(this.getResources().getString(this.d, objArray));
             int i1 = (this.getResources().getString(this.d)).indexOf("%s");
             if (i1 >= 0) {
                spannableStr.setSpan(new StyleSpan(i), i1, (p0.length() + i1), 17);
                this.c.setText(spannableStr);
             }
          }
          int i2 = TextUtils.x(p0) ^ i;
          if (!PatchProxy.isSupport(SearchTipsLayout.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i2), this, SearchTipsLayout.class, "3")) {
             if (i2 && this.b.getVisibility()) {
                this.b.setVisibility(0);
             }else if(!i2 && !this.b.getVisibility()){
                this.b.setVisibility(8);
             }
          }
       }
    label_0095 :
       return;
    }
    public SearchTipsLayout$a getISearchTipsClickAction(){
       return this.e;
    }
    public void setISearchTipsClickAction(SearchTipsLayout$a p0){
       this.e = p0;
    }
}
