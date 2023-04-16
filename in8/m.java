package in8.m;
import java.lang.Double;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Long;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Iterator;
import java.util.List;
import in8.j;
import hn8.e;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class m	// class@0026c3
{
    public List mChildren;
    public final Map mLastLoopID;
    public final Map mMemoizedValue;
    public final int mNodeID;
    public final b mNodesManager;
    public final e mUpdateContext;
    public static final Double ONE;
    public static final Double ZERO;

    static {
       m.ZERO = Double.valueOf(0);
       m.ONE = Double.valueOf(0x3ff0000000000000);
    }
    public void m(int p0,ReadableMap p1,b p2){
       super();
       HashMap hashMap = new HashMap();
       this.mLastLoopID = hashMap;
       this.mMemoizedValue = new HashMap();
       hashMap.put("", Long.valueOf(-1));
       this.mNodeID = p0;
       this.mNodesManager = p2;
       this.mUpdateContext = p2.p;
    }
    public static void findAndUpdateNodes(m p0,Set p1,Stack p2){
       if (p1.contains(p0)) {
          return;
       }
       p1.add(p0);
       m mChildren = p0.mChildren;
       if (mChildren != null) {
          Iterator iterator = mChildren.iterator();
          while (iterator.hasNext()) {
             m.findAndUpdateNodes(iterator.next(), p1, p2);
          }
       }
       if (p0 instanceof j) {
          p2.push(p0);
       }
       return;
    }
    public static void runUpdates(e p0){
       UiThreadUtil.assertOnUiThread();
       e c = p0.c;
       HashSet hashSet = new HashSet();
       Stack stack = new Stack();
       int i = 0;
       while (i < c.size()) {
          m.findAndUpdateNodes(c.get(i), hashSet, stack);
          int i1 = c.size() - 1;
          if (i == i1) {
             while (!stack.isEmpty()) {
                stack.pop().c();
             }
          }
          i = i + 1;
       }
       c.clear();
       p0.a = p0.a + 1;
       return;
    }
    public void addChild(m p0){
       if (this.mChildren == null) {
          this.mChildren = new ArrayList();
       }
       this.mChildren.add(p0);
       p0.dangerouslyRescheduleEvaluate();
       return;
    }
    public final void dangerouslyRescheduleEvaluate(){
       this.mLastLoopID.put(this.mUpdateContext.b, Long.valueOf(-1));
       this.markUpdated();
    }
    public final Double doubleValue(){
       Double obj = this.value();
       if (obj == null) {
          return m.ZERO;
       }
       if (obj instanceof Double) {
          return obj;
       }
       if (obj instanceof Number) {
          return Double.valueOf(obj.doubleValue());
       }
       if (!obj instanceof Boolean) {
          throw new IllegalStateException("Value of node "+this+" cannot be cast to a number");
       }
       obj = (obj.booleanValue())? m.ONE: m.ZERO;
       return obj;
    }
    public abstract Object evaluate();
    public final void forceUpdateMemoizedValue(Object p0){
       this.mMemoizedValue.put(this.mUpdateContext.b, p0);
       this.markUpdated();
    }
    public void markUpdated(){
       UiThreadUtil.assertOnUiThread();
       this.mUpdateContext.c.add(this);
       m tmNodesManag = this.mNodesManager;
       tmNodesManag.n = true;
       tmNodesManag.f();
    }
    public void removeChild(m p0){
       m tmChildren = this.mChildren;
       if (tmChildren != null) {
          tmChildren.remove(p0);
       }
       return;
    }
    public final Object value(){
       if (this.mLastLoopID.containsKey(this.mUpdateContext.b)) {
          m tmUpdateCont = this.mUpdateContext;
          if (this.mLastLoopID.get(this.mUpdateContext.b).longValue() - tmUpdateCont.a >= 0) {
             return this.mMemoizedValue.get(tmUpdateCont.b);
          }
       }
       m tmUpdateCont1 = this.mUpdateContext;
       this.mLastLoopID.put(tmUpdateCont1.b, Long.valueOf(tmUpdateCont1.a));
       Object obj = this.evaluate();
       this.mMemoizedValue.put(this.mUpdateContext.b, obj);
       return obj;
    }
}
