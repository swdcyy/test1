package hp8.m;
import android.view.View$OnLongClickListener;
import com.tachikoma.core.component.text.TKText;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.String;
import android.content.ClipboardManager;
import com.tachikoma.core.component.e;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.CharSequence;
import android.content.ClipData;
import android.widget.Toast;

public final class m implements View$OnLongClickListener	// class@0025d4
{
    public final TKText b;

    public void m(TKText p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       m tb = this.b;
       tb.getContext().getSystemService("clipboard").setPrimaryClip(ClipData.newPlainText("copyText", tb.getView().getText()));
       Toast toast = Toast.makeText(tb.getContext(), null, 0);
       toast.setText("¸´ÖÆ³É¹¦");
       toast.setGravity(17, 0, 0);
       toast.show();
       return 0;
    }
}
