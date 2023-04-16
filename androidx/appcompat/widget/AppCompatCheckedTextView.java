package androidx.appcompat.widget.AppCompatCheckedTextView;
import android.widget.CheckedTextView;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import androidx.appcompat.widget.b;
import android.widget.TextView;
import w0.x;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import w0.e;
import r0.a;
import android.view.ActionMode$Callback;
import androidx.core.widget.b;

public class AppCompatCheckedTextView extends CheckedTextView	// class@0005e3
{
    public final b b;
    public static final int[] c;

    static {
       int[] ointArray = new int[]{0x1010108};
       AppCompatCheckedTextView.c = ointArray;
    }
    public void AppCompatCheckedTextView(Context p0){
       super(p0, null);
    }
    public void AppCompatCheckedTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0x10103c8);
    }
    public void AppCompatCheckedTextView(Context p0,AttributeSet p1,int p2){
       v.a(p0);
       super(p0, p1, p2);
       s.a(this, this.getContext());
       b uob = new b(this);
       this.b = uob;
       uob.m(p1, p2);
       uob.b();
       x ox = x.v(this.getContext(), p1, AppCompatCheckedTextView.c, p2, 0);
       this.setCheckMarkDrawable(ox.g(0));
       ox.w();
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatCheckedTextView tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       e.a(inputConnect, p0, this);
       return inputConnect;
    }
    public void setCheckMarkDrawable(int p0){
       this.setCheckMarkDrawable(a.d(this.getContext(), p0));
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setTextAppearance(Context p0,int p1){
       super.setTextAppearance(p0, p1);
       AppCompatCheckedTextView tb = this.b;
       if (tb != null) {
          tb.q(p0, p1);
       }
       return;
    }
}
