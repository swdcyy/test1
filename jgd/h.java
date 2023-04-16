package jgd.h;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class h implements SlipSwitchButton$b	// class@0016e4
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       DanmakuSwitchUtils h = DanmakuSwitchUtils.h;
       Objects.requireNonNull(h);
       DanmakuSwitchUtils uDanmakuSwit = DanmakuSwitchUtils.class;
       if (!PatchProxy.isSupport(uDanmakuSwit) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), h, uDanmakuSwit, "9")) {
          DanmakuSwitchUtils.i(h, p1, false, 2, null);
       }
       return;
    }
}
