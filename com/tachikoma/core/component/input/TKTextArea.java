package com.tachikoma.core.component.input.TKTextArea;
import com.tachikoma.core.component.input.TKInput;
import gx4.f;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.input.MenuOptionEditText;
import android.widget.EditText;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.tachikoma.core.component.input.a;
import com.tachikoma.core.component.input.a$a;

public class TKTextArea extends TKInput	// class@000d79
{
    public int autoResize;
    public int rows;

    public void TKTextArea(f p0){
       super(p0);
       this.getView().setGravity(0x800033);
    }
    public boolean isSingleLine(){
       return false;
    }
    public void setAutoResize(int p0){
       TKTextArea tKTextArea = TKTextArea.class;
       if (PatchProxy.isSupport(tKTextArea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKTextArea, "4")) {
          return;
       }
       if (p0 < 0) {
          p0 = Integer.MAX_VALUE;
       }
       this.autoResize = p0;
       this.setAutoResizeLines(p0);
       return;
    }
    public void setLineClamp(int p0){
       TKTextArea tKTextArea = TKTextArea.class;
       if (PatchProxy.isSupport(tKTextArea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKTextArea, "2")) {
          return;
       }
       this.setTextLineClamp(p0);
       return;
    }
    public void setRows(int p0){
       TKTextArea tKTextArea = TKTextArea.class;
       if (PatchProxy.isSupport(tKTextArea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKTextArea, "3")) {
          return;
       }
       this.rows = p0;
       this.setInitialLines(p0);
       return;
    }
    public void setTextLineClamp(int p0){
       TKTextArea tKTextArea = TKTextArea.class;
       if (PatchProxy.isSupport(tKTextArea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKTextArea, "1")) {
          return;
       }
       this.setMaxLines(p0);
       TKInput tmProperty = this.mProperty;
       Objects.requireNonNull(tmProperty);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tmProperty, uoa, "12")) {
          tmProperty.c.b = p0;
       }
       return;
    }
}
