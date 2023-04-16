package com.kwai.framework.network.diffinfo.DiffInfoSwitch$isKeyConfigOpen$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e66.a;
import android.content.SharedPreferences;

public final class DiffInfoSwitch$isKeyConfigOpen$2 extends Lambda implements a	// class@000bff
{
    public static final DiffInfoSwitch$isKeyConfigOpen$2 INSTANCE;

    static {
       DiffInfoSwitch$isKeyConfigOpen$2.INSTANCE = new DiffInfoSwitch$isKeyConfigOpen$2();
    }
    public void DiffInfoSwitch$isKeyConfigOpen$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DiffInfoSwitch$isKeyConfigOpen$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("KeyConfigDiffInfoSwitch", false);
    }
}
