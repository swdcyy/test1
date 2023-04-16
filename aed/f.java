package aed.f;
import android.text.TextWatcher;
import com.yxcorp.plugin.search.result.hashtag.page.SoundTrackRenameActivity;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.KwaiActionBar;

public class f implements TextWatcher	// class@000103
{
    public final SoundTrackRenameActivity b;

    public void f(SoundTrackRenameActivity p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (c == 10 || c == 13) {
             int i1 = i + 1;
             p0.replace(i, i1, "\t");
          }
          i = i + 1;
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, f.class, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.b.B.setVisibility(8);
          this.b.z.m(R.drawable.arg_RES_7f0819e4);
       }else {
          this.b.B.setVisibility(0);
          this.b.z.m(R.drawable.arg_RES_7f0824be);
       }
       return;
    }
}
