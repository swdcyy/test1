package apb.a;
import android.view.View$OnClickListener;
import apb.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.kuaishou.android.model.music.Music;
import jqb.k;
import com.yxcorp.gifshow.music.utils.m;
import e17.i;

public final class a implements View$OnClickListener	// class@0002a3
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
       }else {
          tb.q.reset();
          k.k(tb.p);
          m.a(tb.p);
          i.a(R.style.arg_RES_7f110669, 0x7f1009eb);
       }
       return;
    }
}
