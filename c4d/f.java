package c4d.f;
import tyc.u4;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;

public class f extends u4	// class@0004e4
{
    public final SearchEmotionGifFragment b;

    public void f(SearchEmotionGifFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.b.z.setVisibility(0);
       }
       if (TextUtils.x((p0.toString()).trim())) {
          this.b.z.setVisibility(4);
       }
       return;
    }
}
