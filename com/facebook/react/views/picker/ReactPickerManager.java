package com.facebook.react.views.picker.ReactPickerManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.picker.ReactPicker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.views.picker.ReactPickerManager$a;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import com.facebook.react.views.picker.ReactPicker$c;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Objects;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import sf.a;
import android.content.Context;
import java.util.List;
import androidx.appcompat.widget.AppCompatSpinner;
import android.widget.ArrayAdapter;
import java.util.Collection;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Boolean;
import sf.b;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableMap;
import java.lang.CharSequence;

public abstract class ReactPickerManager extends SimpleViewManager	// class@0013d9
{

    public void ReactPickerManager(){
       super();
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactPicker p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactPickerManager.class, "7")) {
          return;
       }
       p1.setOnSelectListener(new ReactPickerManager$a(p1, p0.getNativeModule(UIManagerModule.class).getEventDispatcher()));
       return;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ReactPicker p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactPickerManager.class, "6")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, ReactPicker.class, "5")) {
          p0.setOnItemSelectedListener(null);
          a adapter = p0.getAdapter();
          int selectedItem = p0.getSelectedItemPosition();
          ReactPicker n = p0.n;
          if (n != null && n != p0.m) {
             p0.m = n;
             p0.n = null;
             if (adapter == null) {
                adapter = new a(p0.getContext(), p0.m);
                p0.setAdapter(adapter);
             }else {
                adapter.clear();
                adapter.addAll(p0.m);
                adapter.notifyDataSetChanged();
             }
          }
          n = p0.o;
          if (n != null && n.intValue() != selectedItem) {
             p0.setSelection(p0.o.intValue(), false);
             p0.o = null;
          }
          ReactPicker p = p0.p;
          if (p != null && (adapter != null && p != adapter.c)) {
             if (!PatchProxy.applyVoidOneRefs(p, adapter, a.class, "4")) {
                adapter.c = p;
                adapter.notifyDataSetChanged();
             }
             p0.p = null;
          }
       label_0084 :
          p0.setOnItemSelectedListener(p0.q);
       }
       return;
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactPicker p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactPickerManager.class, "8")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (p1.equals("setNativeSelectedPosition") && p2 != null) {
          p0.setImmediateSelection(p2.getInt(0));
       }
       return;
    }
    public void setColor(ReactPicker p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactPickerManager.class, "2")) {
          return;
       }
       p0.setStagedPrimaryTextColor(p1);
       return;
    }
    public void setEnabled(ReactPicker p0,boolean p1){
       ReactPickerManager reactPickerM = ReactPickerManager.class;
       if (PatchProxy.isSupport(reactPickerM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactPickerM, "4")) {
          return;
       }
       p0.setEnabled(p1);
       return;
    }
    public void setItems(ReactPicker p0,ReadableArray p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactPickerManager.class, str)) {
          return;
       }
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p1, obj, b.class, str);
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else if(p1 == null){
          obj = new ArrayList(p1.size());
          for (int i = 0; i < p1.size(); i = i + 1) {
             obj.add(new b(p1.getMap(i)));
          }
       }
       p0.setStagedItems(obj);
       return;
    }
    public void setPrompt(ReactPicker p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactPickerManager.class, "3")) {
          return;
       }
       p0.setPrompt(p1);
       return;
    }
    public void setSelected(ReactPicker p0,int p1){
       ReactPickerManager reactPickerM = ReactPickerManager.class;
       if (PatchProxy.isSupport(reactPickerM) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactPickerM, "5")) {
          return;
       }
       p0.setStagedSelection(p1);
       return;
    }
}
