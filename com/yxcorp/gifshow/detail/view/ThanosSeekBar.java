package com.yxcorp.gifshow.detail.view.ThanosSeekBar;
import lnc.d3;
import androidx.appcompat.widget.AppCompatSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Looper;
import java.lang.Thread;
import android.widget.ProgressBar;
import java.lang.reflect.Field;
import java.lang.Long;
import yy6.b;
import java.lang.Throwable;
import android.util.Log;
import q87.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.MotionEvent;
import android.widget.AbsSeekBar;

public class ThanosSeekBar extends AppCompatSeekBar implements d3	// class@001a6f
{
    public boolean c;
    public boolean d;

    public void ThanosSeekBar(Context p0){
       super(p0);
       this.c = true;
       this.b();
    }
    public void ThanosSeekBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = true;
       this.b();
    }
    public void ThanosSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = true;
       this.b();
    }
    public boolean a(){
       return this.c;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ThanosSeekBar.class, "1")) {
          return;
       }
       long id = Looper.getMainLooper().getThread().getId();
       if (!id - Thread.currentThread().getId()) {
          return;
       }
       try{
          Field declaredFiel = ProgressBar.class.getDeclaredField("mUiThreadId");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Long.valueOf(id));
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          b.C().t("ThanosSeekBar", Log.getStackTraceString(e0), objArray);
       }
       return;
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(ThanosSeekBar.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ThanosSeekBar.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.c != null && this.d != null) {
          return true;
       }else {
          return super.canScrollHorizontally(p0);
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ThanosSeekBar.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void setCanScrollHorizontally(boolean p0){
       this.d = p0;
    }
    public void setTouchable(boolean p0){
       this.c = p0;
    }
}
