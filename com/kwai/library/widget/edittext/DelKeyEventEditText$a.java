package com.kwai.library.widget.edittext.DelKeyEventEditText$a;
import android.view.inputmethod.InputConnectionWrapper;
import com.kwai.library.widget.edittext.DelKeyEventEditText;
import android.view.inputmethod.InputConnection;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnKeyListener;

public class DelKeyEventEditText$a extends InputConnectionWrapper	// class@000923
{
    public final DelKeyEventEditText a;

    public void DelKeyEventEditText$a(DelKeyEventEditText p0,InputConnection p1,boolean p2){
       this.a = p0;
       super(p1, p2);
    }
    public boolean deleteSurroundingText(int p0,int p1){
       int i = 1;
       if (p0 != i || p1) {
          return super.deleteSurroundingText(p0, p1);
       }
       if (!this.sendKeyEvent(new KeyEvent(0, 67)) || !this.sendKeyEvent(new KeyEvent(i, 67))) {
          i = false;
       }
       return i;
    }
    public boolean sendKeyEvent(KeyEvent p0){
       DelKeyEventEditText$a ta = this.a;
       DelKeyEventEditText i = ta.i;
       if (i != null) {
          i.onKey(ta, p0.getKeyCode(), p0);
       }
       return super.sendKeyEvent(p0);
    }
}
