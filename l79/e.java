package l79.e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.Button;
import q79.d;
import r79.a;
import w69.k;
import android.widget.TextView;
import o79.i;
import java.lang.CharSequence;

public final class e implements Observer	// class@002cba
{
    public final AlbumSelectedContainer b;

    public void e(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int b;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(p0 != null){
          b = p0.booleanValue();
       }else {
          b = 0;
       }
       View view = this.b.J();
       if (view != null) {
          view.setSelected((b ^ 0x01));
       }
       Button uButton = this.b.A();
       if (uButton != null) {
          i = (b)? 8: 0;
          uButton.setVisibility(i);
       }
       if (AlbumSelectedContainer.g(this.b).s0().m().j() == 2) {
          TextView textView = this.b.K();
          if (textView != null) {
             b = (b)? 0x7f1018a7: 0x7f101897;
             textView.setText(i.p(b));
          }
       }
       AlbumSelectedContainer.f0(this.b, 0, 1, null);
       return;
    }
}
