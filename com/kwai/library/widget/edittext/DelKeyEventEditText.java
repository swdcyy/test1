package com.kwai.library.widget.edittext.DelKeyEventEditText;
import com.kwai.library.widget.edittext.PasteTextEditText;
import android.content.Context;
import com.kwai.library.widget.edittext.PasteTextEditText$a;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.kwai.library.widget.edittext.DelKeyEventEditText$a;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.View$OnKeyListener;

public class DelKeyEventEditText extends PasteTextEditText	// class@000924
{
    public View$OnKeyListener i;

    public void DelKeyEventEditText(Context p0,PasteTextEditText$a p1){
       super(p0, p1);
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       return new DelKeyEventEditText$a(this, super.onCreateInputConnection(p0), true);
    }
    public void setSoftKeyListener(View$OnKeyListener p0){
       this.i = p0;
    }
}
