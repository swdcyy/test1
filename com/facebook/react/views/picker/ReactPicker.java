package com.facebook.react.views.picker.ReactPicker;
import androidx.appcompat.widget.AppCompatSpinner;
import android.content.Context;
import com.facebook.react.views.picker.ReactPicker$a;
import com.facebook.react.views.picker.ReactPicker$b;
import android.util.AttributeSet;
import com.facebook.react.views.picker.ReactPicker$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.widget.Spinner;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AbsSpinner;
import java.lang.Runnable;
import java.util.List;

public class ReactPicker extends AppCompatSpinner	// class@0013d7
{
    public int k;
    public ReactPicker$c l;
    public List m;
    public List n;
    public Integer o;
    public Integer p;
    public final AdapterView$OnItemSelectedListener q;
    public final Runnable r;

    public void ReactPicker(Context p0){
       super(p0);
       this.k = 0;
       this.q = new ReactPicker$a(this);
       this.r = new ReactPicker$b(this);
    }
    public void ReactPicker(Context p0,int p1){
       super(p0, p1);
       this.k = 0;
       this.q = new ReactPicker$a(this);
       this.r = new ReactPicker$b(this);
       this.k = p1;
    }
    public void ReactPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = 0;
       this.q = new ReactPicker$a(this);
       this.r = new ReactPicker$b(this);
    }
    public void ReactPicker(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = 0;
       this.q = new ReactPicker$a(this);
       this.r = new ReactPicker$b(this);
    }
    public int getMode(){
       return this.k;
    }
    public ReactPicker$c getOnSelectListener(){
       return this.l;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactPicker.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactPicker.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.getOnItemSelectedListener() == null) {
          this.setOnItemSelectedListener(this.q);
       }
       return;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, ReactPicker.class, "1")) {
          return;
       }
       super.requestLayout();
       this.post(this.r);
       return;
    }
    public void setImmediateSelection(int p0){
       if (PatchProxy.isSupport(ReactPicker.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactPicker.class, "4")) {
          return;
       }
       if (p0 != this.getSelectedItemPosition()) {
          this.setOnItemSelectedListener(null);
          this.setSelection(p0, false);
          this.setOnItemSelectedListener(this.q);
       }
       return;
    }
    public void setOnSelectListener(ReactPicker$c p0){
       this.l = p0;
    }
    public void setStagedItems(List p0){
       this.n = p0;
    }
    public void setStagedPrimaryTextColor(Integer p0){
       this.p = p0;
    }
    public void setStagedSelection(int p0){
       if (PatchProxy.isSupport(ReactPicker.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactPicker.class, "3")) {
          return;
       }
       this.o = Integer.valueOf(p0);
       return;
    }
}
