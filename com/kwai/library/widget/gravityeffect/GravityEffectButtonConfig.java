package com.kwai.library.widget.gravityeffect.GravityEffectButtonConfig;
import com.kwai.library.widget.gravityeffect.GravityEffectButtonConfig$b;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kwai.library.widget.gravityeffect.GravityEffectButtonConfig$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import java.lang.String;
import java.lang.Class;
import com.kwai.library.widget.gravityeffect.GravityEffectButtonConfig$a;
import java.util.Objects;

public final class GravityEffectButtonConfig	// class@00093c
{
    public final int a;
    public final GravityEffectButtonConfig$a b;
    public static final p c;
    public static final GravityEffectButtonConfig$b d;

    static {
       GravityEffectButtonConfig.d = new GravityEffectButtonConfig$b(null);
       GravityEffectButtonConfig.c = s.b(LazyThreadSafetyMode.SYNCHRONIZED, GravityEffectButtonConfig$Companion$instance$2.INSTANCE);
    }
    public void GravityEffectButtonConfig(){
       super();
       this.a = WidgetThemeManager.INSTANCE.findThemeId(KwaiGravityEffectButton.class.getName());
       this.b = new GravityEffectButtonConfig$a();
    }
    public void GravityEffectButtonConfig(u p0){
       super();
       this.a = WidgetThemeManager.INSTANCE.findThemeId(KwaiGravityEffectButton.class.getName());
       this.b = new GravityEffectButtonConfig$a();
    }
    public static final GravityEffectButtonConfig b(){
       Objects.requireNonNull(GravityEffectButtonConfig.d);
       return GravityEffectButtonConfig.c.getValue();
    }
    public final GravityEffectButtonConfig$a a(){
       return this.b;
    }
}
