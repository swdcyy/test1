package a31.d;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import java.lang.Object;
import android.widget.CompoundButton;
import com.kuaishou.live.audience.component.shake.view.LiveAudienceShakeJumpDialog;

public final class d implements CompoundButton$OnCheckedChangeListener	// class@00003a
{
    public final CheckBox b;

    public void d(CheckBox p0){
       this.b = p0;
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       this.b.setChecked(p1);
    }
}
