package b2.d;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import java.lang.CharSequence;
import android.text.style.ClickableSpan;
import android.text.Spanned;
import java.lang.Class;
import w1.a;
import android.os.Bundle;
import b2.d$a;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.util.SparseArray;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import java.lang.Integer;
import android.graphics.Rect;
import b2.d$b;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import b2.d$c;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import java.util.List;
import android.os.Build$VERSION;
import java.util.Collections;
import b2.d$d;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;
import java.lang.StringBuilder;
import android.text.SpannableString;
import android.text.TextUtils;
import b2.a;

public class d	// class@000ac3
{
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;
    public static int d;

    public void d(AccessibilityNodeInfo p0){
       super();
       this.b = -1;
       this.c = -1;
       this.a = p0;
    }
    public void d(Object p0){
       super();
       this.b = -1;
       this.c = -1;
       this.a = p0;
    }
    public static d G0(AccessibilityNodeInfo p0){
       return new d(p0);
    }
    public static d M(){
       return d.G0(AccessibilityNodeInfo.obtain());
    }
    public static d N(View p0){
       return d.G0(AccessibilityNodeInfo.obtain(p0));
    }
    public static d O(d p0){
       return d.G0(AccessibilityNodeInfo.obtain(p0.a));
    }
    public static String j(int p0){
       if (p0 == 1) {
          return "ACTION_FOCUS";
       }
       if (p0 == 2) {
          return "ACTION_CLEAR_FOCUS";
       }
       switch (p0){
           case 4:
             return "ACTION_SELECT";
           case 8:
             return "ACTION_CLEAR_SELECTION";
           case 16:
             return "ACTION_CLICK";
           case 32:
             return "ACTION_LONG_CLICK";
           case '@':
             return "ACTION_ACCESSIBILITY_FOCUS";
           case 128:
             return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
           case 256:
             return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
           case 512:
             return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
           case 1024:
             return "ACTION_NEXT_HTML_ELEMENT";
           case 2048:
             return "ACTION_PREVIOUS_HTML_ELEMENT";
           case 4096:
             return "ACTION_SCROLL_FORWARD";
           case 8192:
             return "ACTION_SCROLL_BACKWARD";
           case 0x4000:
             return "ACTION_COPY";
           case 0x8000:
             return "ACTION_PASTE";
           case 0x10000:
             return "ACTION_CUT";
           case 0x20000:
             return "ACTION_SET_SELECTION";
           case 0x40000:
             return "ACTION_EXPAND";
           case 0x80000:
             return "ACTION_COLLAPSE";
           case 0x200000:
             return "ACTION_SET_TEXT";
           case 0x1020042:
             return "ACTION_MOVE_WINDOW";
           case 0x1020054:
             return "ACTION_IME_ENTER";
           default:
             switch (p0){
                 case 0x1020036:
                   return "ACTION_SHOW_ON_SCREEN";
                 case 0x1020037:
                   return "ACTION_SCROLL_TO_POSITION";
                 case 0x1020038:
                   return "ACTION_SCROLL_UP";
                 case 0x1020039:
                   return "ACTION_SCROLL_LEFT";
                 case 0x102003a:
                   return "ACTION_SCROLL_DOWN";
                 case 0x102003b:
                   return "ACTION_SCROLL_RIGHT";
                 case 0x102003c:
                   return "ACTION_CONTEXT_CLICK";
                 case 0x102003d:
                   return "ACTION_SET_PROGRESS";
                 default:
                   switch (p0){
                       case 0x1020044:
                         return "ACTION_SHOW_TOOLTIP";
                       case 0x1020045:
                         return "ACTION_HIDE_TOOLTIP";
                       case 0x1020046:
                         return "ACTION_PAGE_UP";
                       case 0x1020047:
                         return "ACTION_PAGE_DOWN";
                       case 0x1020048:
                         return "ACTION_PAGE_LEFT";
                       case 0x1020049:
                         return "ACTION_PAGE_RIGHT";
                       case 0x102004a:
                         return "ACTION_PRESS_AND_HOLD";
                       default:
                         return "ACTION_UNKNOWN";
                   }
             }
       }
    }
    public static ClickableSpan[] p(CharSequence p0){
       if (p0 instanceof Spanned) {
          return p0.getSpans(0, p0.length(), ClickableSpan.class);
       }
       return null;
    }
    public boolean A(){
       return this.a.isAccessibilityFocused();
    }
    public void A0(View p0,int p1){
       this.c = p1;
       this.a.setSource(p0, p1);
    }
    public boolean B(){
       return this.a.isCheckable();
    }
    public void B0(CharSequence p0){
       if (a.a()) {
          this.a.setStateDescription(p0);
       }else {
          this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", p0);
       }
       return;
    }
    public boolean C(){
       return this.a.isChecked();
    }
    public void C0(CharSequence p0){
       this.a.setText(p0);
    }
    public boolean D(){
       return this.a.isClickable();
    }
    public void D0(String p0){
       this.a.setViewIdResourceName(p0);
    }
    public boolean E(){
       return this.a.isEnabled();
    }
    public void E0(boolean p0){
       this.a.setVisibleToUser(p0);
    }
    public boolean F(){
       return this.a.isFocusable();
    }
    public AccessibilityNodeInfo F0(){
       return this.a;
    }
    public boolean G(){
       return this.a.isFocused();
    }
    public boolean H(){
       return this.a.isLongClickable();
    }
    public boolean I(){
       return this.a.isPassword();
    }
    public boolean J(){
       return this.a.isScrollable();
    }
    public boolean K(){
       return this.a.isSelected();
    }
    public boolean L(){
       return this.a.isVisibleToUser();
    }
    public boolean P(int p0,Bundle p1){
       return this.a.performAction(p0, p1);
    }
    public void Q(){
       this.a.recycle();
    }
    public boolean R(d$a p0){
       return this.a.removeAction(p0.a);
    }
    public final void S(View p0){
       SparseArray sparseArray = this.v(p0);
       if (sparseArray != null) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          int i1 = 0;
          while (i1 < sparseArray.size()) {
             if (sparseArray.valueAt(i1).get() == null) {
                uArrayList.add(Integer.valueOf(i1));
             }
             i1 = i1 + 1;
          }
          for (; i < uArrayList.size(); i = i + 1) {
             sparseArray.remove(uArrayList.get(i).intValue());
          }
       }
       return;
    }
    public void T(boolean p0){
       this.a.setAccessibilityFocused(p0);
    }
    public final void U(int p0,boolean p1){
       Bundle uBundle = this.r();
       if (uBundle != null) {
          int i = uBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~ p0);
          if (!p1) {
             p0 = 0;
          }
          uBundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (p0 | i));
       }
       return;
    }
    public void V(Rect p0){
       this.a.setBoundsInParent(p0);
    }
    public void W(Rect p0){
       this.a.setBoundsInScreen(p0);
    }
    public void X(boolean p0){
       this.a.setCanOpenPopup(p0);
    }
    public void Y(boolean p0){
       this.a.setCheckable(p0);
    }
    public void Z(boolean p0){
       this.a.setChecked(p0);
    }
    public void a(int p0){
       this.a.addAction(p0);
    }
    public void a0(CharSequence p0){
       this.a.setClassName(p0);
    }
    public void b(d$a p0){
       this.a.addAction(p0.a);
    }
    public void b0(boolean p0){
       this.a.setClickable(p0);
    }
    public void c(View p0){
       this.a.addChild(p0);
    }
    public void c0(Object p0){
       this.a.setCollectionInfo(p0.a);
    }
    public void d(View p0,int p1){
       this.a.addChild(p0, p1);
    }
    public void d0(Object p0){
       this.a.setCollectionItemInfo(p0.a);
    }
    public final void e(ClickableSpan p0,Spanned p1,int p2){
       this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(p1.getSpanStart(p0)));
       this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(p1.getSpanEnd(p0)));
       this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(p1.getSpanFlags(p0)));
       this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(p2));
    }
    public void e0(CharSequence p0){
       this.a.setContentDescription(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof d) {
          return false;
       }
       d ta = this.a;
       if (ta == null) {
          if (p0.a != null) {
             return false;
          }
       }else if(!ta.equals(p0.a)){
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }else if(this.b != p0.b){
          return false;
       }else {
          return true;
       }
    }
    public void f(CharSequence p0,View p1){
       if (Build$VERSION.SDK_INT < 26) {
          this.g();
          this.S(p1);
          ClickableSpan[] uClickableSp = d.p(p0);
          if (uClickableSp != null && uClickableSp.length > 0) {
             this.r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
             SparseArray sparseArray = this.t(p1);
             for (int i = 0; i < uClickableSp.length; i = i + 1) {
                int i1 = this.z(uClickableSp[i], sparseArray);
                sparseArray.put(i1, new WeakReference(uClickableSp[i]));
                this.e(uClickableSp[i], p0, i1);
             }
          }
       }
       return;
    }
    public void f0(boolean p0){
       this.a.setContentInvalid(p0);
    }
    public final void g(){
       this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
       this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
       this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
       this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }
    public void g0(boolean p0){
       this.a.setDismissable(p0);
    }
    public final List h(String p0){
       ArrayList integerArray = this.a.getExtras().getIntegerArrayList(p0);
       if (integerArray == null) {
          integerArray = new ArrayList();
          this.a.getExtras().putIntegerArrayList(p0, integerArray);
       }
       return integerArray;
    }
    public void h0(boolean p0){
       this.a.setEnabled(p0);
    }
    public int hashCode(){
       d ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return i;
    }
    public List i(){
       List actionList = this.a.getActionList();
       if (actionList == null) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList();
       int i = actionList.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.add(new d$a(actionList.get(i1)));
       }
       return uArrayList;
    }
    public void i0(CharSequence p0){
       this.a.setError(p0);
    }
    public void j0(boolean p0){
       this.a.setFocusable(p0);
    }
    public int k(){
       return this.a.getActions();
    }
    public void k0(boolean p0){
       this.a.setFocused(p0);
    }
    public void l(Rect p0){
       this.a.getBoundsInParent(p0);
    }
    public void l0(boolean p0){
       if (Build$VERSION.SDK_INT >= 28) {
          this.a.setHeading(p0);
       }else {
          this.U(2, p0);
       }
       return;
    }
    public void m(Rect p0){
       this.a.getBoundsInScreen(p0);
    }
    public void m0(CharSequence p0){
       if (Build$VERSION.SDK_INT >= 26) {
          this.a.setHintText(p0);
       }else {
          this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", p0);
       }
       return;
    }
    public int n(){
       return this.a.getChildCount();
    }
    public void n0(boolean p0){
       this.a.setLongClickable(p0);
    }
    public CharSequence o(){
       return this.a.getClassName();
    }
    public void o0(int p0){
       this.a.setMovementGranularities(p0);
    }
    public void p0(CharSequence p0){
       this.a.setPackageName(p0);
    }
    public CharSequence q(){
       return this.a.getContentDescription();
    }
    public void q0(CharSequence p0){
       if (Build$VERSION.SDK_INT >= 28) {
          this.a.setPaneTitle(p0);
       }else {
          this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", p0);
       }
       return;
    }
    public Bundle r(){
       return this.a.getExtras();
    }
    public void r0(View p0){
       this.b = -1;
       this.a.setParent(p0);
    }
    public int s(){
       return this.a.getMovementGranularities();
    }
    public void s0(View p0,int p1){
       this.b = p1;
       this.a.setParent(p0, p1);
    }
    public final SparseArray t(View p0){
       SparseArray sparseArray = this.v(p0);
       if (sparseArray == null) {
          sparseArray = new SparseArray();
          p0.setTag(R.id.tag_accessibility_clickable_spans, sparseArray);
       }
       return sparseArray;
    }
    public void t0(d$d p0){
       this.a.setRangeInfo(p0.a);
    }
    public String toString(){
       Rect rect = new Rect();
       this.l(rect);
       this.m(rect);
       StringBuilder str = super.toString()+"; boundsInParent: "+rect+"; boundsInScreen: "+rect+"; packageName: "+this.u()+"; className: "+this.o()+"; text: "+this.w()+"; contentDescription: "+this.q()+"; viewId: "+this.x()+"; checkable: "+this.B()+"; checked: "+this.C()+"; focusable: "+this.F()+"; focused: "+this.G()+"; selected: "+this.K()+"; clickable: "+this.D()+"; longClickable: "+this.H()+"; enabled: "+this.E()+"; password: "+this.I()+"; scrollable: "+this.J()+"; [";
       List list = this.i();
       int i = 0;
       while (i < list.size()) {
          d$a uoa = list.get(i);
          String str1 = d.j(uoa.b());
          if (str1.equals("ACTION_UNKNOWN") && uoa.c() != null) {
             str1 = uoa.c().toString();
          }
          str = str+str1;
          int i1 = list.size() - 1;
          if (i != i1) {
             str = str+", ";
          }
          i = i + 1;
       }
       return str+"]";
    }
    public CharSequence u(){
       return this.a.getPackageName();
    }
    public void u0(CharSequence p0){
       this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", p0);
    }
    public final SparseArray v(View p0){
       return p0.getTag(0x7f0a3cc5);
    }
    public void v0(boolean p0){
       if (Build$VERSION.SDK_INT >= 28) {
          this.a.setScreenReaderFocusable(p0);
       }else {
          this.U(1, p0);
       }
       return;
    }
    public CharSequence w(){
       if (!this.y()) {
          return this.a.getText();
       }
       List list = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
       List list1 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
       List list2 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
       List list3 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
       int i = 0;
       SpannableString spannableStr = new SpannableString(TextUtils.substring(this.a.getText(), i, this.a.getText().length()));
       for (; i < list.size(); i = i + 1) {
          spannableStr.setSpan(new a(list3.get(i).intValue(), this, this.r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), list.get(i).intValue(), list1.get(i).intValue(), list2.get(i).intValue());
       }
       return spannableStr;
    }
    public void w0(boolean p0){
       this.a.setScrollable(p0);
    }
    public String x(){
       return this.a.getViewIdResourceName();
    }
    public void x0(boolean p0){
       this.a.setSelected(p0);
    }
    public final boolean y(){
       return (this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ 0x01);
    }
    public void y0(boolean p0){
       if (Build$VERSION.SDK_INT >= 26) {
          this.a.setShowingHintText(p0);
       }else {
          this.U(4, p0);
       }
       return;
    }
    public final int z(ClickableSpan p0,SparseArray p1){
       int i = 0;
       while (true) {
          if (i < p1.size()) {
             if (p0.equals(p1.valueAt(i).get())) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             int d = d.d;
             d.d = d + 1;
             return d;
          }
       }
       return p1.keyAt(i);
    }
    public void z0(View p0){
       this.c = -1;
       this.a.setSource(p0);
    }
}
