package a4d.a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import android.view.View;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class a implements View$OnClickListener	// class@000084
{
    public final EmotionFloatEditorFragment b;

    public void a(EmotionFloatEditorFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       BaseEditorFragment l = this.b.L;
       if (l != null) {
          l.onClick(p0);
       }
       return;
    }
}
