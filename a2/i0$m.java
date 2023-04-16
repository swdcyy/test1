package a2.i0$m;
import java.util.ArrayList;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import android.view.ViewGroup;
import a2.i0$l;
import a2.i0;
import java.lang.Boolean;
import android.view.ViewParent;

public class i0$m	// class@00006d
{
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;
    public static final ArrayList d;

    static {
       i0$m.d = new ArrayList();
    }
    public void i0$m(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
    }
    public static i0$m a(View p0){
       i0$m tag = p0.getTag(R.id.tag_unhandled_key_event_manager);
       if (tag == null) {
          tag = new i0$m();
          p0.setTag(R.id.tag_unhandled_key_event_manager, tag);
       }
       return tag;
    }
    public boolean b(View p0,KeyEvent p1){
       if (!p1.getAction()) {
          this.g();
       }
       p0 = this.c(p0, p1);
       if (!p1.getAction()) {
          int keyCode = p1.getKeyCode();
          if (p0 != null && !KeyEvent.isModifierKey(keyCode)) {
             this.d().put(keyCode, new WeakReference(p0));
          }
       }
       boolean b = (p0 != null)? true: false;
       return b;
    }
    public final View c(View p0,KeyEvent p1){
       i0$m ta = this.a;
       if (ta != null && ta.containsKey(p0)) {
          if (p0 instanceof ViewGroup) {
             ViewGroup viewGroup = p0;
             int i = viewGroup.getChildCount() - 1;
             while (true) {
                if (i >= 0) {
                   View view = this.c(viewGroup.getChildAt(i), p1);
                   if (view != null) {
                      return view;
                   }else {
                      i = i - 1;
                   }
                }
             }
          }
          if (this.e(p0, p1)) {
             return p0;
          }
       }
       return null;
    }
    public final SparseArray d(){
       if (this.b == null) {
          this.b = new SparseArray();
       }
       return this.b;
    }
    public final boolean e(View p0,KeyEvent p1){
       ArrayList tag = p0.getTag(R.id.tag_unhandled_key_listeners);
       if (tag != null) {
          int i = tag.size() - 1;
          while (i >= 0) {
             if (tag.get(i).a(p0, p1)) {
                return 1;
             }
             i = i - 1;
          }
       }
       return false;
    }
    public boolean f(KeyEvent p0){
       i0$m tc = this.c;
       boolean b = false;
       if (tc != null && tc.get() == p0) {
          return b;
       }
       this.c = new WeakReference(p0);
       WeakReference weakReferenc = null;
       SparseArray sparseArray = this.d();
       if (p0.getAction() == 1) {
          int i = sparseArray.indexOfKey(p0.getKeyCode());
          if (i >= 0) {
             weakReferenc = sparseArray.valueAt(i);
             sparseArray.removeAt(i);
          }
       }
       if (weakReferenc == null) {
          weakReferenc = sparseArray.get(p0.getKeyCode());
       }
       if (weakReferenc != null) {
          View view = weakReferenc.get();
          if (view != null && i0.X(view)) {
             this.e(view, p0);
          }
          return true;
       }else {
          return b;
       }
    }
    public final void g(){
       i0$m ta = this.a;
       if (ta != null) {
          ta.clear();
       }
       ArrayList d = i0$m.d;
       if (d.isEmpty()) {
          return;
       }else {
          _monitor_enter(d);
          if (this.a == null) {
             this.a = new WeakHashMap();
          }
          int i = d.size() - 1;
          while (i >= 0) {
             ArrayList d1 = i0$m.d;
             View view = d1.get(i).get();
             if (view == null) {
                d1.remove(i);
             }else {
                this.a.put(view, Boolean.TRUE);
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                   this.a.put(parent, Boolean.TRUE);
                   parent = parent.getParent();
                }
             }
             i = i - 1;
          }
          _monitor_exit(d);
          return;
       }
    }
}
