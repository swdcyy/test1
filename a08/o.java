package a08.o;
import fw8.r$a;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.yxcorp.gifshow.activity.GifshowActivity;
import c08.a;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import com.kwaishou.merchant.daccore.PendantHolder;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import l08.c;
import n08.a;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.StringBuilder;
import hf.a;
import f08.b;
import f08.b$a;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import android.view.KeyEvent;

public class o implements r$a	// class@000014
{
    public final b b;

    public void o(b p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0,View p1,ViewGroup$LayoutParams p2){
       q.k(this, p0, p1, p2);
    }
    public void b(Activity p0,View p1){
       q.j(this, p0, p1);
    }
    public String c(Intent p0){
       return q.h(this, p0);
    }
    public void d(Intent p0,View p1){
       q.l(this, p0, p1);
    }
    public void e(Intent p0){
       q.a(this, p0);
    }
    public void f(FragmentActivity p0,Bundle p1){
       q.d(this, p0, p1);
    }
    public void g(FragmentActivity p0,Bundle p1){
       q.f(this, p0, p1);
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       String liveId;
       try{
          p1.toString();
          b e = this.b.e;
          if (e != null && e.a() == p0) {
             PendantLiveContext pendantLiveC = this.b.e.d();
             o tb = this.b;
             liveId = (pendantLiveC != null)? pendantLiveC.getLiveId(): null;
             if (tb.b != null) {
                int i = 1;
                if (p1.getAction() == i) {
                   e = tb.b;
                   Objects.requireNonNull(e);
                   ConcurrentHashMap uConcurrentH = e.h();
                   if (uConcurrentH != null) {
                      Iterator iterator = uConcurrentH.entrySet().iterator();
                      while (iterator.hasNext()) {
                         Map$Entry uEntry = iterator.next();
                         PendantMountInfo pendantMount = uEntry.getValue().f().e();
                         View view = uEntry.getValue().g();
                         if (pendantMount != null && (pendantMount.isAllChildUnClipChildren() == i && view != null)) {
                            view = a.a(view, liveId+"_beyond_parent_view");
                            if (view != null) {
                               int[] ointArray = new int[2];
                               view.getLocationOnScreen(ointArray);
                               int[] ointArray1 = new int[2];
                               int i1 = 0;
                               int i2 = ointArray[i1] + view.getMeasuredWidth();
                               ointArray1[i1] = i2;
                               i2 = ointArray[i] + view.getMeasuredHeight();
                               ointArray1[i] = i2;
                               b$a.e(b.a, "targetView leftTop:"+ointArray[i1]+' '+ointArray[i]+" rightBottom:"+ointArray1[i1]+' '+ointArray1[i]+" motionEvent:"+p1.getX()+' '+p1.getY(), null, 2, null);
                               if (p1.getX() - (float)ointArray[i1] >= 0 && (p1.getX() - (float)ointArray1[i1] <= 0 && (p1.getY() - (float)ointArray[i] >= 0 && p1.getY() - (float)ointArray1[i] <= 0))) {
                                  view.callOnClick();
                                  f$a.l(f.a, liveId, "dispatchClipChildrenTouchEvent targetView callOnClick", null, 4, null);
                                  break ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e14){
          f$a.o(f.a, liveId, "dispatchClipChildrenTouchEvent error", e14, null, 8, null);
       }
    label_0137 :
       return;
    }
    public void i(FragmentActivity p0,Intent p1){
       q.e(this, p0, p1);
    }
    public void j(Activity p0,int p1){
       q.i(this, p0, p1);
    }
    public void k(FragmentActivity p0,KeyEvent p1){
       q.b(this, p0, p1);
    }
    public void onSaveInstanceState(Bundle p0){
       q.g(this, p0);
    }
}
