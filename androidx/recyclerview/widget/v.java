package androidx.recyclerview.widget.v;
import a2.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v$a;
import android.view.View;
import b2.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;

public class v extends a	// class@000938
{
    public final RecyclerView d;
    public final v$a e;

    public void v(RecyclerView p0){
       super();
       this.d = p0;
       a uoa = this.l();
       this.e = (uoa != null && uoa instanceof v$a)? uoa: new v$a(this);
       return;
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       if (!this.m() && this.d.getLayoutManager() != null) {
          this.d.getLayoutManager().onInitializeAccessibilityNodeInfo(p1);
       }
       return;
    }
    public boolean h(View p0,int p1,Bundle p2){
       if (super.h(p0, p1, p2)) {
          return true;
       }
       if (!this.m() && this.d.getLayoutManager() != null) {
          return this.d.getLayoutManager().performAccessibilityAction(p1, p2);
       }
       return false;
    }
    public a l(){
       return this.e;
    }
    public boolean m(){
       return this.d.hasPendingAdapterUpdates();
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
       if (p0 instanceof RecyclerView && (!this.m() && p0.getLayoutManager() != null)) {
          p0.getLayoutManager().onInitializeAccessibilityEvent(p1);
       }
    label_001c :
       return;
    }
}
