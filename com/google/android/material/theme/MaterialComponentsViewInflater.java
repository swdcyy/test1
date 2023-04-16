package com.google.android.material.theme.MaterialComponentsViewInflater;
import androidx.appcompat.app.b;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;

public class MaterialComponentsViewInflater extends b	// class@0016e6
{

    public void MaterialComponentsViewInflater(){
       super();
    }
    public AppCompatButton createButton(Context p0,AttributeSet p1){
       return new MaterialButton(p0, p1);
    }
}
