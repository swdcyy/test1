package com.kwai.library.widget.layout.LinearLayoutEx;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.library.widget.layout.LinearLayoutEx$a;
import android.view.ViewGroup;
import java.lang.Exception;
import com.kwai.library.widget.layout.LinearLayoutEx$b;
import android.view.View;

public class LinearLayoutEx extends LinearLayout	// class@00095a
{
    public LinearLayoutEx$b b;
    public LinearLayoutEx$a c;
    public boolean d;

    public void LinearLayoutEx(Context p0){
       super(p0);
       this.d = true;
    }
    public void LinearLayoutEx(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = true;
    }
    public void LinearLayoutEx(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = true;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b = true;
       try{
          LinearLayoutEx tc = this.c;
          if (tc != null && tc.dispatchTouchEvent(p0)) {
             return b;
          }
          if (this.d != null && !super.dispatchTouchEvent(p0)) {
             b = false;
          }
          return b;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return (this.d ^ b);
       }
    }
    public LinearLayoutEx$a getOnDispatchListener(){
       return this.c;
    }
    public LinearLayoutEx$b getOnSizeChangedListener(){
       return this.b;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       LinearLayoutEx tb = this.b;
       if (tb != null) {
          tb.onSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void setOnDispatchListener(LinearLayoutEx$a p0){
       this.c = p0;
    }
    public void setOnSizeChangedListener(LinearLayoutEx$b p0){
       this.b = p0;
    }
}
