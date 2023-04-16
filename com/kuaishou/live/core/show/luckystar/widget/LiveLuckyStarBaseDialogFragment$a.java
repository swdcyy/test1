package com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment$a;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveLuckyStarBaseDialogFragment$a implements View$OnTouchListener	// class@000d0e
{
    public final LiveLuckyStarBaseDialogFragment b;

    public void LiveLuckyStarBaseDialogFragment$a(LiveLuckyStarBaseDialogFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveLuckyStarBaseDialogFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       LiveLuckyStarBaseDialogFragment$a tb = this.b;
       if (!n.N(tb.th(tb.getView()), p1)) {
          return false;
       }
       this.b.dismissAllowingStateLoss();
       return true;
    }
}
