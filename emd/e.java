package emd.e;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import lnc.a1;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;

public final class e implements Runnable	// class@000d95
{
    public final NewVoteStickerDrawer b;
    public final String c;

    public void e(NewVoteStickerDrawer p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0x7f103b43;
       if (!tc.equals(a1.p(i)) || !(tb.mOptionsThreeView.getText().toString()).equals("")) {
          tb.mOptionsThreeView.setCursorVisible(false);
          NewVoteStickerDrawer mOptionsThre = tb.mOptionsThreeView;
          if (tc.equals(a1.p(i))) {
             tc = "";
          }
          mOptionsThre.setText(tc);
       }
       return;
    }
}
