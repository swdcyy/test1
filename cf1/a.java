package cf1.a;
import ok.x;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.HighFluencyWeakStyleView;
import o56.a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.basic.widget.HollowTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.comments.fluency.highfluencymessage.handlers.widget.c;
import ok.h;
import java.lang.CharSequence;
import android.graphics.drawable.BitmapDrawable;
import d61.j0;

public final class a implements x	// class@0004a9
{
    public final LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle b;
    public final String c;

    public void a(LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       HollowTextView hollowTextVi = a.c(a.B, R.layout.arg_RES_7f0d0abc, null);
       hollowTextVi.setTextSize(1, 12.00f);
       hollowTextVi.setVisibility(0);
       LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[] highFluencyS = new LiveAudienceDelayInfosResponse$HighFluencyStyle$WeakStyle[]{this.b,HighFluencyWeakStyleView.h};
       hollowTextVi.setText(this.c);
       hollowTextVi.setBackgroundColor(HighFluencyWeakStyleView.d(c.b, highFluencyS));
       return j0.d(hollowTextVi);
    }
}
