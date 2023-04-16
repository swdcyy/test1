package com.kuaishou.webkit.WebView$SysWebView;
import android.webkit.WebView;
import com.kuaishou.webkit.WebView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class WebView$SysWebView extends WebView	// class@00128b
{
    public WebView mWebView;
    public final WebView this$0;

    public void WebView$SysWebView(WebView p0,WebView p1,Context p2){
       super(p0, p1, p2, null);
    }
    public void WebView$SysWebView(WebView p0,WebView p1,Context p2,AttributeSet p3){
       this.this$0 = p0;
       super(p2, p3);
       this.mWebView = p1;
    }
    public int computeHorizontalScrollOffsetImpl(){
       return this.computeHorizontalScrollOffset();
    }
    public int computeHorizontalScrollRangeImpl(){
       return this.computeHorizontalScrollRange();
    }
    public int computeVerticalScrollExtentImpl(){
       return this.computeVerticalScrollExtent();
    }
    public int computeVerticalScrollOffsetImpl(){
       return this.computeVerticalScrollOffset();
    }
    public int computeVerticalScrollRangeImpl(){
       return this.computeVerticalScrollRange();
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       WebView$SysWebView tthis$0 = this.this$0;
       tthis$0.mCalledBySysWebView = true;
       p1.mCalledBySysWebView = false;
       return tthis$0.onKeyDown(p0, p1);
    }
    public boolean onKeyMultiple(int p0,int p1,KeyEvent p2){
       WebView$SysWebView tthis$0 = this.this$0;
       tthis$0.mCalledBySysWebView = true;
       p1.mCalledBySysWebView = false;
       return tthis$0.onKeyMultiple(p0, p1, p2);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       WebView$SysWebView tthis$0 = this.this$0;
       tthis$0.mCalledBySysWebView = true;
       p1.mCalledBySysWebView = false;
       return tthis$0.onKeyUp(p0, p1);
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       WebView$SysWebView tthis$0 = this.this$0;
       tthis$0.mCalledBySysWebView = true;
       tthis$0.onOverScrolled(p0, p1, p2, p3);
       p0.mCalledBySysWebView = false;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       WebView$SysWebView tthis$0 = this.this$0;
       tthis$0.mCalledBySysWebView = true;
       tthis$0.onScrollChanged(p0, p1, p2, p3);
       p0.mCalledBySysWebView = false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       WebView$SysWebView tthis$0 = this.this$0;
       tthis$0.mCalledBySysWebView = true;
       this.this$0.mCalledBySysWebView = false;
       return tthis$0.onTouchEvent(p0);
    }
    public boolean overScrollBy(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       WebView$SysWebView sysWebView = this;
       WebView$SysWebView this$0 = sysWebView.this$0;
       this$0.mCalledBySysWebView = true;
       sysWebView.this$0.mCalledBySysWebView = false;
       return this$0.overScrollBy(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public boolean super_TouchEvent(MotionEvent p0){
       return super.onTouchEvent(p0);
    }
    public boolean super_onKeyDown(int p0,KeyEvent p1){
       return super.onKeyDown(p0, p1);
    }
    public boolean super_onKeyMultiple(int p0,int p1,KeyEvent p2){
       return super.onKeyMultiple(p0, p1, p2);
    }
    public boolean super_onKeyUp(int p0,KeyEvent p1){
       return super.onKeyUp(p0, p1);
    }
    public void super_onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       super.onOverScrolled(p0, p1, p2, p3);
    }
    public void super_onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
    }
    public boolean super_overScrollBy(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,boolean p8){
       return super.overScrollBy(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
}
