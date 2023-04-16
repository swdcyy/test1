package com.facebook.react.views.picker.ReactDialogPickerManager;
import jf.c;
import com.facebook.react.views.picker.ReactPickerManager;
import jf.b;
import ze.b;
import ze.n0;
import android.view.View;
import com.facebook.react.views.picker.ReactPicker;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import ze.c1;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;

public class ReactDialogPickerManager extends ReactPickerManager implements c	// class@0013d1
{
    public final c1 mDelegate;

    public void ReactDialogPickerManager(){
       super();
       this.mDelegate = new b(this);
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactPicker createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactDialogPickerManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactPicker(p0, 0);
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public String getName(){
       return "AndroidDialogPicker";
    }
    public void setColor(View p0,Integer p1){
       super.setColor(p0, p1);
    }
    public void setEnabled(View p0,boolean p1){
       super.setEnabled(p0, p1);
    }
    public void setItems(View p0,ReadableArray p1){
       super.setItems(p0, p1);
    }
    public void setPrompt(View p0,String p1){
       super.setPrompt(p0, p1);
    }
    public void setSelected(View p0,int p1){
       super.setSelected(p0, p1);
    }
}
