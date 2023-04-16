package c4d.d;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.EditText;
import c4d.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d implements View$OnClickListener	// class@0004e2
{
    public final SearchEmotionGifFragment b;

    public void d(SearchEmotionGifFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SearchEmotionGifFragment.class, "12")) {
       }else {
          tb.A.setText("");
          if (!PatchProxy.applyVoid(null, null, g.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GIF_SEARCH_DEL";
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
