package m61.b;
import k61.c;
import android.view.View;
import k61.f;
import z61.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarSettingItem;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import n61.a;
import com.kuaishou.live.bottombar.component.widget.view.PressableKwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.bottombar.component.widget.view.PressableTextView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import x61.b;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarItemBadge$Type;
import m61.b$a;
import android.view.View$OnClickListener;

public class b extends c	// class@00312b
{
    public PressableKwaiImageView c;
    public PressableTextView d;
    public PressableTextView e;
    public TextView f;
    public View g;
    public final f h;

    public void b(View p0,f p1){
       super(p0);
       this.h = p1;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (!p0 instanceof LiveBottomBarSettingItem) {
          return;
       }
       LiveNormalBottomBarItem liveNormalBo = p0;
       a.c(false, this.c, liveNormalBo);
       this.c.setPressedEnable(true);
       a.d(this.d, p0);
       this.d.setPressedEnable(true);
       ViewGroup$LayoutParams layoutParams = this.itemView.getLayoutParams();
       if (TextUtils.x(liveNormalBo.mSubTitle)) {
          layoutParams.height = b.a;
          this.e.setVisibility(8);
       }else {
          layoutParams.height = b.b;
          this.e.setVisibility(false);
       }
       this.e.setText(TextUtils.j(liveNormalBo.mSubTitle));
       this.e.setPressedEnable(true);
       this.f.setText(liveNormalBo.mRightDescription);
       LiveNormalBottomBarItem mBadge = liveNormalBo.mBadge;
       if (liveNormalBo.mDisableShowRedPoint == null && (mBadge != null && mBadge.b == LiveBottomBarItemBadge$Type.RED_DOT)) {
          this.g.setVisibility(false);
       }else {
          this.g.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c = p0.findViewById(0x7f0a1a9e);
       this.d = p0.findViewById(0x7f0a1ac0);
       this.e = p0.findViewById(0x7f0a1abd);
       this.f = p0.findViewById(0x7f0a1ab7);
       this.g = p0.findViewById(0x7f0a1aa1);
       p0.setOnClickListener(new b$a(this));
       return;
    }
}
