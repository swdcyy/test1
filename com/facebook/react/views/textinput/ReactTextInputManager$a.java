package com.facebook.react.views.textinput.ReactTextInputManager$a;
import android.view.View$OnLongClickListener;
import com.facebook.react.views.textinput.ReactTextInputManager;
import java.lang.Object;
import android.view.View;

public class ReactTextInputManager$a implements View$OnLongClickListener	// class@001428
{
    public final boolean b;
    public final ReactTextInputManager c;

    public void ReactTextInputManager$a(ReactTextInputManager p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onLongClick(View p0){
       return this.b;
    }
}
