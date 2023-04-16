package a1d.c0;
import android.view.View$OnClickListener;
import a1d.h0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import android.widget.TextView;

public final class c0 implements View$OnClickListener	// class@000019
{
    public final h0 b;

    public void c0(h0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.getSelectionStart() == -1 && p0.getSelectionEnd() == -1) {
          tb.R8();
       }
       return;
    }
}
