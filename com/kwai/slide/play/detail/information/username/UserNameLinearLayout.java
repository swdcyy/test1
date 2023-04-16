package com.kwai.slide.play.detail.information.username.UserNameLinearLayout;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.Integer;
import java.lang.CharSequence;
import rnc.i;
import java.lang.StringBuilder;
import android.text.TextPaint;
import android.text.Layout;

public class UserNameLinearLayout extends PriorityLinearLayout	// class@001829
{
    public TextView g;
    public TextView h;
    public TextView i;

    public void UserNameLinearLayout(Context p0){
       super(p0, null);
    }
    public void UserNameLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void UserNameLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, UserNameLinearLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.g = this.findViewById(0x7f0a4386);
       this.h = this.findViewById(0x7f0a0bdb);
       this.i = this.findViewById(0x7f0a441b);
       return;
    }
    public void onMeasure(int p0,int p1){
       String str2;
       if (PatchProxy.isSupport(UserNameLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, UserNameLinearLayout.class, "2")) {
          return;
       }
       if (this.g.getText() != null) {
          int i = 0x7f0a2f43;
          if (this.g.getTag(i) != null) {
             CharSequence tag = this.g.getTag(i);
             if (!(this.g.getText().toString()).equals(tag.toString())) {
                this.g.setText(tag);
             }
             super.onMeasure(p0, p1);
             String str = "бн";
             String str1 = "";
             if (tag.length() > 2 && i.e(tag.charAt(1))) {
                str1 = i.j(this.g.getText()).toString();
                str2 = str1.subSequence(0, 3)+str;
             }else if(tag.length() > 2 && !i.e(tag.charAt(1))){
                str1 = i.j(this.g.getText()).toString();
                str2 = str1.subSequence(0, 2)+str;
             }else {
                str2 = str1;
             }
             int i1 = (int)this.g.getPaint().measureText(str2);
             if (i1 < (int)this.g.getPaint().measureText(str1) && this.g.getMeasuredWidth() < i1) {
                i = 8;
                this.i.setVisibility(i);
                this.h.setVisibility(i);
                super.onMeasure(p0, p1);
             }
             if (this.g.getLayout() == null) {
                return;
             }else {
                tag = this.g.getLayout().getText();
                if (tag != null && !(this.g.getText().toString()).equals(tag.toString())) {
                   this.g.setText(tag);
                   super.onMeasure(p0, p1);
                }
                return;
             }
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
}
