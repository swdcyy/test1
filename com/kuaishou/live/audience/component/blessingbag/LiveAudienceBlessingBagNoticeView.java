package com.kuaishou.live.audience.component.blessingbag.LiveAudienceBlessingBagNoticeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class LiveAudienceBlessingBagNoticeView extends ConstraintLayout	// class@000a43
{
    public final ImageView B;
    public boolean C;
    public HashMap D;

    public void LiveAudienceBlessingBagNoticeView(Context p0){
       a.p(p0, "context");
       super(p0);
       View view = a.k(this, R.layout.arg_RES_7f0d09f4, true).findViewById(R.id.checkbox);
       a.o(view, "rootView.findViewById\(R.id.checkbox\)");
       this.B = view;
       view.setSelected(false);
    }
    public final boolean getHasChecked(){
       return this.C;
    }
    public final void setHasChecked(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceBlessingBagNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceBlessingBagNoticeView.class, "1")) {
          return;
       }
       this.B.setSelected(p0);
       this.C = p0;
       return;
    }
}
