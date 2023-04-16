package com.yxcorp.gifshow.widget.PicturesContainer;
import android.widget.FrameLayout;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.widget.PicturesContainer$a;
import android.util.AttributeSet;
import java.lang.String;
import com.yxcorp.gifshow.widget.PicturesContainer$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import android.view.GestureDetector;
import com.yxcorp.gifshow.widget.PicturesContainer$c;
import android.view.GestureDetector$OnGestureListener;
import android.view.View$OnClickListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public class PicturesContainer extends FrameLayout	// class@001895
{
    public GestureDetector b;
    public Map c;
    public View$OnClickListener d;
    public View$OnClickListener e;

    public void PicturesContainer(Context p0){
       super(p0);
       this.c = new ConcurrentHashMap();
       this.e = new PicturesContainer$a(this);
       this.b();
    }
    public void PicturesContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new ConcurrentHashMap();
       this.e = new PicturesContainer$a(this);
       this.b();
    }
    public void PicturesContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new ConcurrentHashMap();
       this.e = new PicturesContainer$a(this);
       this.b();
    }
    public void a(String p0,PicturesContainer$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicturesContainer.class, "3")) {
          return;
       }
       if (p1 == null) {
          this.c.remove(p0);
       }else {
          this.c.put(p0, p1);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PicturesContainer.class, "1")) {
          return;
       }
       this.b = new GestureDetector(this.getContext(), new PicturesContainer$c(this));
       return;
    }
    public View$OnClickListener getInnerOnClickListener(){
       return this.e;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicturesContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c.isEmpty())? super.onInterceptTouchEvent(p0): this.b.onTouchEvent(p0);
       return b;
    }
    public void setOnClickListener(View$OnClickListener p0){
       this.d = p0;
    }
}
