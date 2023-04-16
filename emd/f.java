package emd.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import java.lang.CharSequence;

public class f implements ViewTreeObserver$OnGlobalLayoutListener	// class@000d96
{
    public final NewVoteStickerDrawer b;

    public void f(NewVoteStickerDrawer p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b.mQuestionView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       f tb = this.b;
       tb.mQuestionView.setText(tb.mBaseDrawerData.V0());
       this.b.layoutVoteContainer();
       this.b.addQuestionTextChangeListener();
       return;
    }
}
