package emd.d;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import lnc.a1;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;

public final class d implements Runnable	// class@000d94
{
    public final NewVoteStickerDrawer b;
    public final String c;

    public void d(NewVoteStickerDrawer p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0x7f10513e;
       if (!tc.equals(a1.p(i)) || !(tb.mOptionsTwoView.getText().toString()).equals("")) {
          tb.mOptionsTwoView.setCursorVisible(false);
          NewVoteStickerDrawer mOptionsTwoV = tb.mOptionsTwoView;
          if (tc.equals(a1.p(i))) {
             tc = "";
          }
          mOptionsTwoV.setText(tc);
       }
       return;
    }
}
