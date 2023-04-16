package emd.c;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import lnc.a1;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;

public final class c implements Runnable	// class@000d93
{
    public final NewVoteStickerDrawer b;
    public final String c;

    public void c(NewVoteStickerDrawer p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0x7f10513d;
       if (!tc.equals(a1.p(i)) || !(tb.mOptionsOneView.getText().toString()).equals("")) {
          tb.mOptionsOneView.setCursorVisible(false);
          NewVoteStickerDrawer mOptionsOneV = tb.mOptionsOneView;
          if (tc.equals(a1.p(i))) {
             tc = "";
          }
          mOptionsOneV.setText(tc);
       }
       return;
    }
}
