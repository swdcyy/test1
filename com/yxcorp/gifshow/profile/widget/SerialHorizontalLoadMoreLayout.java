package com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout;
import com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout;
import com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup;
import ekd.p1;
import java.lang.Integer;

public class SerialHorizontalLoadMoreLayout extends HorizontalLoadMoreLayout	// class@001604
{
    public SerialHorizontalLoadMoreLayout$b n;
    public boolean o;
    public HashMap p;
    public static final String q;
    public static final SerialHorizontalLoadMoreLayout$a r;

    static {
       SerialHorizontalLoadMoreLayout.r = new SerialHorizontalLoadMoreLayout$a(null);
       SerialHorizontalLoadMoreLayout.q = "SerialHorizontalLoadMoreLayout";
    }
    public void SerialHorizontalLoadMoreLayout(Context p0){
       super(p0, null);
    }
    public void SerialHorizontalLoadMoreLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SerialHorizontalLoadMoreLayout.class, "2")) {
          return;
       }
       this.o = false;
       if (this.getScrollX() >= this.getMReleaseSlop()) {
          SerialHorizontalLoadMoreLayout tn = this.n;
          if (tn != null) {
             tn.onRelease();
          }
       }
       return;
    }
    public int getLoadViewLayoutId(){
       return 0x7f0d14bd;
    }
    public final SerialHorizontalLoadMoreLayout$b getMReleaseCallback(){
       return this.n;
    }
    public final int getMReleaseSlop(){
       View obj = PatchProxy.apply(null, this, SerialHorizontalLoadMoreLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getMLoadView();
       a.m(obj);
       View mLoadView = this.getMLoadView();
       a.m(mLoadView);
       return (obj.getMeasuredWidth() - mLoadView.getPaddingEnd());
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SerialHorizontalLoadMoreLayout.class, "4")) {
          return;
       }
       super.onFinishInflate();
       this.setMLoadView(p1.i(this, this.getLoadViewLayoutId(), false));
       this.addView(this.getMLoadView());
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(SerialHorizontalLoadMoreLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, SerialHorizontalLoadMoreLayout.class, "3")) {
             return;
          }
       }
       a.p(p0, "target");
       int scrollX = this.getScrollX();
       super.onNestedScroll(p0, p1, p2, p3, p4, p5);
       if (this.o == null && this.getScrollX() != scrollX) {
          this.o = true;
          SerialHorizontalLoadMoreLayout tn = this.n;
          if (tn != null) {
             tn.onStart();
          }
       }
       return;
    }
    public final void setMReleaseCallback(SerialHorizontalLoadMoreLayout$b p0){
       this.n = p0;
    }
}
