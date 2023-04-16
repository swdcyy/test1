package l61.d;
import k61.c;
import android.view.View;
import k61.f;
import z61.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import android.widget.TextView;
import n61.a;
import z61.l;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;
import com.kuaishou.live.bottombar.component.widget.view.PressableTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.bottombar.component.widget.view.PressableKwaiImageView;
import android.widget.ImageView;
import l61.d$a;
import android.view.View$OnClickListener;

public class d extends c	// class@002e8a
{
    public PressableKwaiImageView c;
    public View d;
    public TextView e;
    public PressableTextView f;
    public final f g;
    public final boolean h;

    public void d(View p0,boolean p1,f p2){
       super(p0);
       this.h = p1;
       this.g = p2;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (!p0 instanceof LiveNormalBottomBarItem) {
          return;
       }
       a.d(this.f, p0);
       if (this.h == null) {
          this.f.setSelected(p0.mIsSelected);
       }
       a.a(p0.mDisableShowRedPoint, p0.mBadge, this.d, this.e);
       this.f.setPressedEnable(true);
       a.c((this.h ^ true), this.c, p0);
       this.c.setPressedEnable(true);
       this.c.setSelected(p0.mIsSelected);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.c = p0.findViewById(0x7f0a1aa4);
       this.d = p0.findViewById(0x7f0a1aa1);
       this.e = p0.findViewById(0x7f0a1ac1);
       this.f = p0.findViewById(0x7f0a1aa5);
       p0.setOnClickListener(new d$a(this));
       return;
    }
}
