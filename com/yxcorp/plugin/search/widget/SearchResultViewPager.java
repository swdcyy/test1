package com.yxcorp.plugin.search.widget.SearchResultViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;
import android.util.AttributeSet;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.plugin.search.widget.SearchResultViewPager$a;
import java.lang.Math;
import android.view.ViewConfiguration;

public class SearchResultViewPager extends CommonLogViewPager	// class@0007e1
{
    public boolean A;
    public float B;
    public float C;
    public float u;
    public int[] v;
    public boolean w;
    public Set x;
    public HashMap y;
    public boolean z;

    public void SearchResultViewPager(Context p0){
       super(p0);
       int[] ointArray = new int[2];
       this.v = ointArray;
       this.x = new HashSet();
       this.y = new HashMap();
       this.z = true;
       this.A = true;
    }
    public void SearchResultViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.v = ointArray;
       this.x = new HashSet();
       this.y = new HashMap();
       this.z = true;
       this.A = true;
    }
    public final boolean o(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SearchResultViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.getLocationOnScreen(this.v);
       int i = (int)p1.getRawX();
       int i1 = (int)p1.getRawY();
       SearchResultViewPager tv = this.v;
       int i2 = tv[0];
       int i3 = tv[1];
       int i4 = p0.getMeasuredWidth() + i2;
       int i5 = p0.getMeasuredHeight() + i3;
       if (i1 >= i3 && (i1 <= i5 && (i >= i2 && i <= i4))) {
          return 1;
       }
       return 0;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Iterator iterator;
       SearchResultViewPager obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       View obj = PatchProxy.applyOneRefs(p0, this, SearchResultViewPager.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean action = p0.getAction();
       if (!action) {
          this.u = p0.getRawX();
          if (!PatchProxy.applyVoidOneRefs(p0, this, SearchResultViewPager.class, "6") && this.x.size()) {
             iterator = this.x.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (this.o(obj, p0) && this.y.containsKey(obj)) {
                   this.y.get(obj).a(obj, p0);
                   break ;
                }
             }
          }
          this.B = p0.getX();
          this.C = p0.getY();
       }else if(action == 0.00f){
          float f = this.u - p0.getRawX();
          this.u = p0.getRawX();
          boolean b = true;
          if (this.w == null) {
             action = (Math.abs(f) - (float)ViewConfiguration.getTouchSlop() >= 0)? true: false;
             this.w = action;
          }
          if (this.w != null) {
             obj1 = PatchProxy.applyOneRefs(p0, this, SearchResultViewPager.class, "4");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(!this.x.size()){
                iterator = this.x.iterator();
                do {
                   if (iterator.hasNext()) {
                   }
                } while (this.o(iterator.next(), p0));
             }
             b = false;
             if (b) {
                return false;
             }
          }
          float x = p0.getX();
          if ((Math.abs((x - this.B)) * 0x3f000000) - Math.abs((p0.getY() - this.C)) > 0) {
             obj1 = this.B;
             if (obj1 - x > 0 && this.z == null) {
                return false;
             }else if(obj1 - x < 0 && this.A == null){
                return false;
             }
          }
       }else {
          this.u = 0;
          this.w = false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void setEnableSwipeLeft(boolean p0){
       this.z = p0;
    }
    public void setEnableSwipeRight(boolean p0){
       this.A = p0;
    }
}
