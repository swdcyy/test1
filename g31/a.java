package g31.a;
import lf3.g;
import com.kuaishou.live.audience.component.topbar.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBeautyMessages$SCLiveBeautyLabel;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class a implements g	// class@002408
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       LiveBeautyMessages$SCLiveBeautyLabel beautyLabel = p0.beautyLabel;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(beautyLabel), tb, uoa, "6") && tb.r != beautyLabel)) {
          tb.P8();
          tb.r = beautyLabel;
          if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(beautyLabel), tb, uoa, "9") && tb.S8(beautyLabel))) {
             if (beautyLabel == 1) {
                tb.p.setText(a1.p(R.string.arg_RES_7f102840));
             }else if(beautyLabel == 2){
                tb.p.setText(a1.p(R.string.arg_RES_7f10283f));
             }
             tb.V8();
          }
          b.c0(LiveLogTag.LIVE_BEAUTY, "onReceiveLiveBeautyLabelChange", "beautyLabelType", Integer.valueOf(beautyLabel));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
