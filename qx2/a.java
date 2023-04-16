package qx2.a;
import android.view.View;
import ox2.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import xh3.b;
import xh3.g;
import xh3.l;
import qx2.a$a;
import z0.a;
import androidx.lifecycle.Transformations;
import qx2.a$b;
import androidx.lifecycle.Observer;
import qx2.a$c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import qx2.a$d;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class a	// class@003ede
{
    public final KwaiBindableImageView a;
    public final TextView b;
    public final KwaiImageView c;
    public final View d;
    public final View e;
    public final d f;

    public void a(View p0,d p1){
       a.p(p0, "rootView");
       a.p(p1, "launcher");
       super();
       this.f = p1;
       this.a = p0.findViewById(0x7f0a4353);
       this.b = p0.findViewById(0x7f0a4381);
       this.c = p0.findViewById(0x7f0a435c);
       this.d = p0.findViewById(0x7f0a2921);
       this.e = p0.findViewById(0x7f0a094a);
    }
    public void a(LifecycleOwner p0,UserLevelInfoViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "lifecycleOwner");
       a.p(p1, "viewModel");
       a ta = this.a;
       a.o(ta, "avatarView");
       b.c(ta, p0, p1.b);
       ta = this.b;
       a.o(ta, "nameView");
       g.a(ta, p0, p1.d);
       ta = this.c;
       a.o(ta, "badgeView");
       b.b(ta, p0, p1.e);
       ta = this.d;
       a.o(ta, "loadingView");
       l.e(ta, p0, p1.w0(), false, 4, null);
       ta = this.e;
       a.o(ta, "contentView");
       LiveData liveData = Transformations.map(p1.w0(), new a$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       l.e(ta, p0, liveData, false, 4, null);
       p1.w0().observe(p0, new a$b(this));
       p1.m.observe(p0, new a$c(this));
       this.c.setOnClickListener(new a$d(p1));
       return;
    }
}
