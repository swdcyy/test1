package com.kwai.dva.dex2oat.Dex2OatManager$mDex2OatSwitcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.dva.dex2oat.switch.Dex2OatSwitcherImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.dva.dex2oat.switch.Dex2OatSwitcherImpl$a;

public final class Dex2OatManager$mDex2OatSwitcher$2 extends Lambda implements a	// class@000ad6
{
    public static final Dex2OatManager$mDex2OatSwitcher$2 INSTANCE;

    static {
       Dex2OatManager$mDex2OatSwitcher$2.INSTANCE = new Dex2OatManager$mDex2OatSwitcher$2();
    }
    public void Dex2OatManager$mDex2OatSwitcher$2(){
       super(0);
    }
    public final Dex2OatSwitcherImpl invoke(){
       Dex2OatSwitcherImpl obj = PatchProxy.apply(null, this, Dex2OatManager$mDex2OatSwitcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Dex2OatSwitcherImpl();
       Dex2OatSwitcherImpl uDex2OatSwit = Dex2OatSwitcherImpl.class;
       if (PatchProxy.isSupport(uDex2OatSwit) && (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, obj, uDex2OatSwit, "3") && !Dex2OatSwitcherImpl.e)) {
          Dex2OatSwitcherImpl$a b = Dex2OatSwitcherImpl.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(Dex2OatSwitcherImpl$a.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, b, Dex2OatSwitcherImpl$a.class, "3")) {
             Dex2OatSwitcherImpl.setDebugModel(false);
          }
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
