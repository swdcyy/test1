package ce.b;
import com.facebook.react.uimanager.l;
import java.lang.Object;
import we.a;
import com.facebook.react.uimanager.RootViewManager;
import java.util.concurrent.ConcurrentHashMap;
import ce.b$a;
import com.facebook.react.uimanager.ViewGroupManager;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import ze.n0;
import com.facebook.react.bridge.ReadableMap;
import ze.m0;
import ze.z;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.bridge.ReadableNativeMap;
import java.lang.Integer;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import android.view.ViewGroup;
import android.content.Context;
import com.facebook.yoga.YogaMeasureMode;

public class b	// class@000d08
{
    public final ConcurrentHashMap a;
    public final a b;
    public final l c;
    public final RootViewManager d;
    public static final String e = "b";

    public void b(l p0){
       super();
       this.b = new a();
       this.d = new RootViewManager();
       this.a = new ConcurrentHashMap();
       this.c = p0;
    }
    public static ViewGroupManager e(b$a p0){
       b$a d = p0.d;
       if (d != null) {
          return d;
       }
       throw new IllegalStateException("Unable to find ViewManager for view: "+p0);
    }
    public void a(n0 p0,String p1,int p2,ReadableMap p3,m0 p4,boolean p5){
       ViewManager viewManager;
       View view;
       if (this.d(p2) != null) {
          return;
       }
       ReadableNativeMap readableNati = null;
       z oz = (p3 != null)? new z(p3): readableNati;
       if (p5) {
          viewManager = this.c.a(p1);
          view = viewManager.createView(p0, oz, p4, this.b);
          view.setId(p2);
       }else {
          view = readableNati;
          viewManager = view;
       }
       b$a uoa = new b$a(p2, view, viewManager, false);
       uoa.e = oz;
       if (p4 != null) {
          readableNati = p4.getState();
       }
       uoa.g = readableNati;
       this.a.put(Integer.valueOf(p2), uoa);
       return;
    }
    public void b(int p0){
       UiThreadUtil.assertOnUiThread();
       b$a uoa = this.d(p0);
       if (uoa == null) {
          ReactSoftException.logSoftException(b.e, new IllegalStateException("Unable to find viewState for tag: "+p0+" for deleteView"));
          return;
       }else {
          uoa = uoa.a;
          if (uoa != null) {
             this.c(uoa);
          }else {
             this.a.remove(Integer.valueOf(p0));
          }
          return;
       }
    }
    public final void c(View p0){
       UiThreadUtil.assertOnUiThread();
       int id = p0.getId();
       b$a uoa = this.f(id);
       b$a d = uoa.d;
       if (uoa.c == null && d != null) {
          d.onDropViewInstance(p0);
       }
       if (p0 instanceof ViewGroup && d instanceof ViewGroupManager) {
          ViewGroupManager viewGroupMan = b.e(uoa);
          int childCount = viewGroupMan.getChildCount(p0);
          childCount = childCount - 1;
          while (childCount >= 0) {
             View childAt = viewGroupMan.getChildAt(p0, childCount);
             if (this.d(childAt.getId()) != null) {
                this.c(childAt);
             }
             viewGroupMan.removeViewAt(p0, childCount);
          }
       }
       this.a.remove(Integer.valueOf(id));
       return;
    }
    public final b$a d(int p0){
       return this.a.get(Integer.valueOf(p0));
    }
    public final b$a f(int p0){
       b$a uoa = this.a.get(Integer.valueOf(p0));
       if (uoa != null) {
          return uoa;
       }
       throw new IllegalStateException("Unable to find viewState view for tag "+p0);
    }
    public long g(Context p0,String p1,ReadableMap p2,ReadableMap p3,ReadableMap p4,float p5,YogaMeasureMode p6,float p7,YogaMeasureMode p8){
       return this.c.a(p1).measure(p0, p2, p3, p4, p5, p6, p7, p8);
    }
    public void h(int p0,int p1){
       UiThreadUtil.assertOnUiThread();
       b$a uoa = this.d(p0);
       if (uoa == null) {
          ReactSoftException.logSoftException(b.e, new IllegalStateException("Unable to find viewState for tag: "+p0+" for removeViewAt"));
          return;
       }else {
          b$a a = uoa.a;
          if (a == null) {
             throw new IllegalStateException("Unable to find view for tag "+p0);
          }
          b.e(uoa).removeViewAt(a, p1);
          return;
       }
    }
}
