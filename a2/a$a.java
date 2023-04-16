package a2.a$a;
import android.view.View$AccessibilityDelegate;
import a2.a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import b2.e;
import java.lang.Object;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.d;
import a2.i0;
import java.lang.CharSequence;
import java.util.List;
import b2.d$a;
import android.view.ViewGroup;
import android.os.Bundle;

public final class a$a extends View$AccessibilityDelegate	// class@000048
{
    public final a a;

    public void a$a(a p0){
       super();
       this.a = p0;
    }
    public boolean dispatchPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       return this.a.a(p0, p1);
    }
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View p0){
       e uoe = this.a.b(p0);
       AccessibilityNodeProvider uAccessibili = (uoe != null)? uoe.c(): null;
       return uAccessibili;
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       this.a.onInitializeAccessibilityEvent(p0, p1);
    }
    public void onInitializeAccessibilityNodeInfo(View p0,AccessibilityNodeInfo p1){
       d uod = d.G0(p1);
       uod.v0(i0.b0(p0));
       uod.l0(i0.W(p0));
       uod.q0(i0.q(p0));
       uod.B0(i0.K(p0));
       this.a.f(p0, uod);
       uod.f(p1.getText(), p0);
       List list = a.c(p0);
       for (int i = 0; i < list.size(); i++) {
          uod.b(list.get(i));
       }
       return;
    }
    public void onPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       this.a.onPopulateAccessibilityEvent(p0, p1);
    }
    public boolean onRequestSendAccessibilityEvent(ViewGroup p0,View p1,AccessibilityEvent p2){
       return this.a.g(p0, p1, p2);
    }
    public boolean performAccessibilityAction(View p0,int p1,Bundle p2){
       return this.a.h(p0, p1, p2);
    }
    public void sendAccessibilityEvent(View p0,int p1){
       this.a.j(p0, p1);
    }
    public void sendAccessibilityEventUnchecked(View p0,AccessibilityEvent p1){
       this.a.k(p0, p1);
    }
}
