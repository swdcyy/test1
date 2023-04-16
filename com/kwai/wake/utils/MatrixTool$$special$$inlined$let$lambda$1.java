package com.kwai.wake.utils.MatrixTool$$special$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import zsd.u;

public final class MatrixTool$$special$$inlined$let$lambda$1 extends Lambda implements l	// class@001129
{
    public final List $list$inlined;
    public final String $selfPkg$inlined;

    public void MatrixTool$$special$$inlined$let$lambda$1(List p0,String p1){
       this.$list$inlined = p0;
       this.$selfPkg$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(ActivityManager$RunningAppProcessInfo p0){
       p0 = p0.processName;
       a.o(p0, "it.processName");
       MatrixTool$$special$$inlined$let$lambda$1 t$selfPkg$in = this.$selfPkg$inlined;
       a.o(t$selfPkg$in, "selfPkg");
       return u.o2(p0, t$selfPkg$in, false);
    }
}
