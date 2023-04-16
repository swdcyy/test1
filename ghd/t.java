package ghd.t;
import x07.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.button.SlipSwitchButton;
import ekd.m1;
import android.widget.TextView;
import ghd.t$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public class t extends b	// class@000f3c
{
    public final GifshowActivity c;

    public void t(int p0,GifshowActivity p1){
       this.c = p1;
       super(p0);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       SlipSwitchButton slipSwitchBu = view.findViewById(R.id.switch_btn);
       m1.f(view, R.id.switch_name_tv).setText(R.string.arg_RES_7f1046d3);
       slipSwitchBu.setSwitch(true);
       slipSwitchBu.setOnSwitchChangeListener2(new t$a(this, p0));
       return view;
    }
}
