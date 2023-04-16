package com.yxcorp.gifshow.widget.PicturesContainer$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.widget.PicturesContainer;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gq.a;
import q87.c;
import java.util.Map;
import java.lang.Math;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.PicturesContainer$b;
import java.lang.StringBuilder;

public class PicturesContainer$c extends GestureDetector$SimpleOnGestureListener	// class@001894
{
    public final int b;
    public final int c;
    public final PicturesContainer d;

    public void PicturesContainer$c(PicturesContainer p0){
       this.d = p0;
       super();
       this.b = n.c(a.a().a(), 60.00f);
       this.c = 200;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       Iterator iterator;
       if (PatchProxy.isSupport(PicturesContainer$c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, PicturesContainer$c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("LongPictureContainer", "onFling", objArray);
       if (this.d.c.isEmpty()) {
          return i;
       }else if(p0 == null || p1 == null){
          Object[] objArray1 = new Object[i];
          a.D().A("", "onFling e1: "+p0+", e2 "+p1, objArray1);
          return i;
       }else if((p0.getX() - p1.getX()) - (float)this.b > 0 && Math.abs(p2) - 0x43480000 > 0){
          iterator = this.d.c.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().i();
          }
       }else if((p1.getX() - p0.getX()) - (float)this.b > 0 && Math.abs(p2) - 0x43480000 > 0){
          iterator = this.d.c.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().q();
          }
       }else if((p1.getY() - p0.getY()) - (float)this.b > 0 && Math.abs(p3) - 0x43480000 > 0){
          iterator = this.d.c.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().s();
          }
       }else if((p0.getY() - p1.getY()) - (float)this.b > 0 && Math.abs(p3) - 0x43480000 > 0){
          iterator = this.d.c.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().t();
          }
       }
       return true;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, PicturesContainer$c.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Iterator iterator = this.d.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().r();
       }
       return true;
    }
}
