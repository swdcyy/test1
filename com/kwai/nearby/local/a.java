package com.kwai.nearby.local.a;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import com.kwai.nearby.local.HomeLocalFragment;
import gj0.e;
import java.lang.String;
import js6.a;
import gj0.d;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import java.util.List;
import java.util.Collections;

public final class a implements MessageQueue$IdleHandler	// class@000f7c
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean queueIdle(){
       a.b.o4(new d("KwaiNearbyRoamPanel", JsFramework.REACT.name(), Collections.singletonList(new e("RoamPanelHome", ""))));
       return false;
    }
}
