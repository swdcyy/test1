package com.yxcorp.gifshow.widget.EnableReselectedGroup;
import android.widget.LinearLayout;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import tyc.b1;
import android.view.View$OnClickListener;

public class EnableReselectedGroup extends LinearLayout	// class@00183c
{
    public final List b;
    public int c;
    public boolean d;
    public EnableReselectedGroup$a e;
    public static final int f;

    public void EnableReselectedGroup(Context p0){
       super(p0);
       this.b = new ArrayList();
       this.a(p0, null, 0);
    }
    public void EnableReselectedGroup(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.a(p0, p1, 0);
    }
    public void EnableReselectedGroup(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.a(p0, p1, p2);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       if (PatchProxy.isSupport(EnableReselectedGroup.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, EnableReselectedGroup.class, "7")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.y0, p2, 0);
       this.c = typedArray.getResourceId(0, -1);
       this.d = typedArray.getBoolean(1, 0);
       typedArray.recycle();
       return;
    }
    public final void getChildViewList(){
       if (PatchProxy.applyVoid(null, this, EnableReselectedGroup.class, "5")) {
          return;
       }
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.b.add(this.getChildAt(i));
       }
       return;
    }
    public int getCurrSelectedViewPosition(){
       Object obj = PatchProxy.apply(null, this, EnableReselectedGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       while (true) {
          if (i >= this.b.size()) {
             return -1;
          }
          if (this.b.get(i).isSelected()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EnableReselectedGroup.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, EnableReselectedGroup.class, "4")) {
          this.getChildViewList();
          if (!this.b.isEmpty()) {
             Iterator iterator = this.b.iterator();
             while (iterator.hasNext()) {
                View view = iterator.next();
                if (view.getId() == this.c) {
                   view.setSelected(true);
                }
                view.setOnClickListener(new b1(this));
             }
          }
       }
       return;
    }
}
