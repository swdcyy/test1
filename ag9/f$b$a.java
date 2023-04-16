package ag9.f$b$a;
import android.view.View$OnClickListener;
import ag9.f$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import ag9.f;
import com.yxcorp.gifshow.bubble.b;
import android.content.Intent;

public final class f$b$a implements View$OnClickListener	// class@0000bc
{
    public final f$b b;

    public void f$b$a(f$b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b$a.class, "1")) {
          return;
       }
       f$b$a tb = this.b;
       tb.a.n2(tb.b);
       f a = this.b.a.A;
       if (a != null) {
          a.dismiss();
       }
       tb = this.b;
       f$b a1 = tb.a;
       a1.A = null;
       a1.g2(tb.c, tb.b);
       return;
    }
}
