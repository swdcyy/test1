package com.kuaishou.merchant.live.cart.onsale.widget.AutoHideTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.kuaishou.merchant.live.cart.onsale.widget.StartPosition;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.Objects;
import android.view.ViewGroup;
import m54.a;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.live.cart.onsale.widget.AutoHideTextView$a;

public final class AutoHideTextView extends AppCompatTextView	// class@0019bb
{
    public ArrayList f;
    public boolean g;
    public boolean h;
    public int i;
    public StartPosition j;
    public HashMap k;

    public void AutoHideTextView(Context p0){
       super(p0, null, 0);
       this.f = new ArrayList();
       this.h = true;
       this.j = StartPosition.LEFT_START;
    }
    public void AutoHideTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.f = new ArrayList();
       this.h = true;
       this.j = StartPosition.LEFT_START;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, AutoHideTextView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.f.clear();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Iterator iterator;
       if (PatchProxy.isSupport(AutoHideTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AutoHideTextView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          if (this.h == null) {
             return;
          }else {
             ViewParent parent = this.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
             int measuredWidt = parent.getMeasuredWidth();
             p2 = a.a[this.j.ordinal()];
             p4 = 8;
             if (p2 != 1) {
                if (p2 == 2) {
                   if ((p3 - this.getMeasuredWidth()) > this.i) {
                   label_0079 :
                      p4 = 0;
                   }
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else if(p3 >= (measuredWidt - this.i)){
             }
             this.setVisibility(p4);
          }
       }
       if (!this.getVisibility()) {
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(1);
          }
       }else {
          iterator = this.f.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(0);
          }
       }
       if (this.g != null && p1 != p3) {
          this.h = false;
       }
       return;
    }
    public final void setExtraWidth(int p0){
       this.i = p0;
    }
    public final void setIsOnlyCalculateOneTime(boolean p0){
       this.g = p0;
    }
    public final void setStartPosition(StartPosition p0){
       this.j = p0;
    }
}
