package com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.widget.TextView;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$a;
import android.view.View$OnClickListener;

public class PagerSlidingTabStrip$d	// class@000a8f
{
    public CharSequence a;
    public View b;
    public View c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public View$OnClickListener h;
    public String i;

    public void PagerSlidingTabStrip$d(String p0){
       super();
       this.f = true;
       this.i = p0;
    }
    public void PagerSlidingTabStrip$d(String p0,View p1){
       super(p0);
       this.b = p1;
    }
    public void PagerSlidingTabStrip$d(String p0,CharSequence p1){
       super(p0);
       this.a = p1;
    }
    public View a(Context p0,int p1,ViewPager p2){
       this.d = p1;
       PagerSlidingTabStrip$d tb = this.b;
       if (tb != null) {
          this.c = tb;
       }else {
          TextView textView = new TextView(p0);
          this.c = textView;
          textView.setText(this.a);
          textView.setFocusable(true);
          textView.setGravity(17);
          textView.setSingleLine();
       }
       this.c.setOnClickListener(new PagerSlidingTabStrip$d$a(this, p2, p1));
       return this.c;
    }
    public View b(){
       return this.b;
    }
    public String c(){
       return this.i;
    }
    public int d(){
       return this.d;
    }
    public View e(){
       return this.c;
    }
    public CharSequence f(){
       return this.a;
    }
    public void g(boolean p0){
       this.f = p0;
    }
    public void h(boolean p0){
       this.e = p0;
    }
    public void i(View$OnClickListener p0){
       this.h = p0;
       this.g = false;
    }
    public void j(View$OnClickListener p0,boolean p1){
       this.h = p0;
       this.g = p1;
    }
    public void k(CharSequence p0){
       this.a = p0;
       PagerSlidingTabStrip$d tc = this.c;
       if (tc instanceof TextView) {
          tc.setText(p0);
       }
       return;
    }
}
