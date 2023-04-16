package asc.a;
import ei0.a;
import t36.f;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import asc.a$c;
import asc.a$a;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import asc.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a extends a	// class@0002c6
{
    public final View c;
    public final HashMap d;
    public final a$c e;
    public final f f;
    public final Fragment g;

    public void a(f p0,Fragment p1,View p2){
       a.p(p0, "mAlbumSelectItemEventListeners");
       a.p(p1, "fragment");
       a.p(p2, "rootView");
       super(p2);
       this.f = p0;
       this.g = p1;
       View view = this.A().findViewById(R.id.import_music_button);
       a.o(view, "mRootView.findViewById\(R.id.import_music_button\)");
       this.c = view;
       this.d = new HashMap();
       this.e = new a$c(this);
       view.setOnClickListener(new a$a(this));
       view.getViewTreeObserver().addOnGlobalLayoutListener(new a$b(this));
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.f.d(this.e);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.f.c(this.e);
       return;
    }
}
