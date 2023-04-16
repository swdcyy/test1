package emd.b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.String;
import java.lang.Object;
import android.widget.EditText;
import java.lang.CharSequence;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import android.widget.FrameLayout;

public final class b implements Runnable	// class@000d92
{
    public final NewVoteStickerDrawer b;
    public final String c;

    public void b(NewVoteStickerDrawer p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       tb.mQuestionView.setCursorVisible(false);
       NewVoteStickerDrawer mQuestionVie = tb.mQuestionView;
       if (tc == null) {
          tc = "";
       }
       mQuestionVie.setText(tc);
       if (!TextUtils.x(tb.mQuestionView.getText().toString())) {
          tb.mQuestionContainer.setVisibility(false);
       }
       return;
    }
}
