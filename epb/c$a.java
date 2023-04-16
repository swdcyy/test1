package epb.c$a;
import android.view.View$OnClickListener;
import epb.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$c;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;

public final class c$a implements View$OnClickListener	// class@0027a5
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, c.class, "2")) {
          c p = tb.p;
          if (p != null) {
             MusicSearchUiOption$c uiListener = p.getUiListener();
             if (uiListener != null) {
                uiListener.b();
             }
          }
       }
       return;
    }
}
