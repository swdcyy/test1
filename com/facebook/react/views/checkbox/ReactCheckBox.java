package com.facebook.react.views.checkbox.ReactCheckBox;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.CompoundButton;
import android.widget.CheckBox;

public class ReactCheckBox extends AppCompatCheckBox	// class@00139d
{
    public boolean e;

    public void ReactCheckBox(Context p0){
       super(p0);
       this.e = true;
    }
    public void setChecked(boolean p0){
       if (PatchProxy.isSupport(ReactCheckBox.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactCheckBox.class, "1")) {
          return;
       }
       if (this.e != null) {
          this.e = false;
          super.setChecked(p0);
       }
       return;
    }
    public void setOn(boolean p0){
       if (PatchProxy.isSupport(ReactCheckBox.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactCheckBox.class, "2")) {
          return;
       }
       if (this.isChecked() != p0) {
          super.setChecked(p0);
       }
       this.e = true;
       return;
    }
}
