package com.kwai.framework.network.diffinfo.DiffInfoSwitch$isOpen$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import e66.a;
import android.content.SharedPreferences;

public final class DiffInfoSwitch$isOpen$2 extends Lambda implements a	// class@000c00
{
    public static final DiffInfoSwitch$isOpen$2 INSTANCE;

    static {
       DiffInfoSwitch$isOpen$2.INSTANCE = new DiffInfoSwitch$isOpen$2();
    }
    public void DiffInfoSwitch$isOpen$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, DiffInfoSwitch$isOpen$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.d())? true: a.a.getBoolean("DiffInfoSwitch", false);
       return b;
    }
}
