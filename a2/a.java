package a2.a;
import android.view.View$AccessibilityDelegate;
import java.lang.Object;
import a2.a$a;
import android.view.View;
import java.util.List;
import java.util.Collections;
import android.view.accessibility.AccessibilityEvent;
import b2.e;
import android.view.accessibility.AccessibilityNodeProvider;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.CharSequence;
import b2.d;
import android.view.ViewGroup;
import android.os.Bundle;
import b2.d$a;
import java.lang.String;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

public class a	// class@00004a
{
    public final View$AccessibilityDelegate a;
    public final View$AccessibilityDelegate b;
    public static final View$AccessibilityDelegate c;

    static {
       a.c = new View$AccessibilityDelegate();
    }
    public void a(){
       super(a.c);
    }
    public void a(View$AccessibilityDelegate p0){
       super();
       this.a = p0;
       this.b = new a$a(this);
    }
    public static List c(View p0){
       List tag = p0.getTag(R.id.tag_accessibility_actions);
       if (tag == null) {
          tag = Collections.emptyList();
       }
       return tag;
    }
    public boolean a(View p0,AccessibilityEvent p1){
       return this.a.dispatchPopulateAccessibilityEvent(p0, p1);
    }
    public e b(View p0){
       AccessibilityNodeProvider accessibilit = this.a.getAccessibilityNodeProvider(p0);
       if (accessibilit != null) {
          return new e(accessibilit);
       }
       return null;
    }
    public View$AccessibilityDelegate d(){
       return this.b;
    }
    public final boolean e(ClickableSpan p0,View p1){
       if (p0 != null) {
          ClickableSpan[] uClickableSp = d.p(p1.createAccessibilityNodeInfo().getText());
          int i = 0;
          while (uClickableSp != null && i < uClickableSp.length) {
             if (p0.equals(uClickableSp[i])) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public void f(View p0,d p1){
       this.a.onInitializeAccessibilityNodeInfo(p0, p1.F0());
    }
    public boolean g(ViewGroup p0,View p1,AccessibilityEvent p2){
       return this.a.onRequestSendAccessibilityEvent(p0, p1, p2);
    }
    public boolean h(View p0,int p1,Bundle p2){
       List list = a.c(p0);
       boolean b = false;
       int i = 0;
       while (i < list.size()) {
          d$a uoa = list.get(i);
          if (uoa.b() == p1) {
             b = uoa.d(p0, p2);
             break ;
          }else {
             i = i + 1;
          }
       }
       if (!b) {
          b = this.a.performAccessibilityAction(p0, p1, p2);
       }
       if (!b && p1 == 0x7f0a003e) {
          b = this.i(p2.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), p0);
       }
       return b;
    }
    public final boolean i(int p0,View p1){
       SparseArray tag = p1.getTag(R.id.tag_accessibility_clickable_spans);
       if (tag != null) {
          WeakReference weakReferenc = tag.get(p0);
          if (weakReferenc != null) {
             ClickableSpan uClickableSp = weakReferenc.get();
             if (this.e(uClickableSp, p1)) {
                uClickableSp.onClick(p1);
                return true;
             }
          }
       }
       return false;
    }
    public void j(View p0,int p1){
       this.a.sendAccessibilityEvent(p0, p1);
    }
    public void k(View p0,AccessibilityEvent p1){
       this.a.sendAccessibilityEventUnchecked(p0, p1);
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       this.a.onInitializeAccessibilityEvent(p0, p1);
    }
    public void onPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       this.a.onPopulateAccessibilityEvent(p0, p1);
    }
}
