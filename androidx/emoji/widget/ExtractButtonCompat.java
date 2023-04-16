package androidx.emoji.widget.ExtractButtonCompat;
import android.widget.Button;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import androidx.core.widget.b;

public class ExtractButtonCompat extends Button	// class@00076c
{

    public void ExtractButtonCompat(Context p0){
       super(p0, null);
    }
    public void ExtractButtonCompat(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ExtractButtonCompat(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean hasWindowFocus(){
       boolean b = (this.isEnabled() && !this.getVisibility())? true: false;
       return b;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
}
