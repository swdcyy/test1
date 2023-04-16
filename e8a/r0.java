package e8a.r0;
import android.content.DialogInterface$OnShowListener;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.Object;
import android.content.DialogInterface;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.text.InputFilter;
import uw9.k;
import android.widget.EditText;

public final class r0 implements DialogInterface$OnShowListener	// class@0020d3
{
    public final BaseEditorFragment b;

    public void r0(BaseEditorFragment p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       r0 tb = this.b;
       if (tb.Kh() != null) {
          InputFilter[] inputFilterA = new InputFilter[]{new k(255)};
          tb.Kh().setFilters(inputFilterA);
       }
       return;
    }
}
