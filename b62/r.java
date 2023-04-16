package b62.r;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.f;
import android.animation.TimeInterpolator;

public final class r implements DialogInterface$OnShowListener	// class@000354
{
    public final LiveConditionRedPacketBaseResultDialogFragment b;

    public void r(LiveConditionRedPacketBaseResultDialogFragment p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{j.b(new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb.v, propertyValu);
       objectAnimat.setDuration(400);
       objectAnimat.setInterpolator(new f(0x3f800000, 0x3f800000));
       objectAnimat.start();
    }
}
