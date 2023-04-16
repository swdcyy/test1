package com.kwai.component.photo.reduce.PhotoReduceToast;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import android.widget.TextView;

public class PhotoReduceToast extends FrameLayout implements d	// class@000ad9
{
    public View b;
    public TextView c;
    public View d;
    public Runnable e;
    public boolean f;
    public static final int g;

    public void PhotoReduceToast(Context p0){
       super(p0);
    }
    public void PhotoReduceToast(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PhotoReduceToast(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceToast.class, "11")) {
          return;
       }
       if (this.getParent() != null) {
          this.getParent().removeView(this);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceToast.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a3f96);
       this.d = m1.f(p0, 0x7f0a35e7);
       this.c = m1.f(p0, 0x7f0a2b4f);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceToast.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
}
