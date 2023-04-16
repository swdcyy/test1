package androidx.appcompat.widget.AppCompatToggleButton;
import android.widget.ToggleButton;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import w0.s;
import androidx.appcompat.widget.b;
import android.widget.TextView;

public class AppCompatToggleButton extends ToggleButton	// class@0005f9
{
    public final b b;

    public void AppCompatToggleButton(Context p0){
       super(p0, null);
    }
    public void AppCompatToggleButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x101004b);
    }
    public void AppCompatToggleButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       s.a(this, this.getContext());
       b uob = new b(this);
       this.b = uob;
       uob.m(p1, p2);
    }
}
