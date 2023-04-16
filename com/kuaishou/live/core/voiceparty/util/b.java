package com.kuaishou.live.core.voiceparty.util.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import mz6.b$d;
import mz6.b;
import android.content.Context;
import java.util.Collection;
import com.kuaishou.live.core.voiceparty.util.a;
import android.content.DialogInterface$OnCancelListener;
import yx2.m;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public class b	// class@001ad5
{

    public void b(){
       super();
    }
    public static void a(Activity p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartyActionUtil showUnfollowDialog");
       if (p0 == null || (!p0.isFinishing() && !p0.isDestroyed())) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new b$d(R.string.arg_RES_7f104f05, -1, R.color.arg_RES_7f060c49));
          b uob = new b(p0);
          uob.b(uArrayList);
          uob.k(a.b);
          uob.l(new m(p1, p2));
          uob.q();
       }
    label_0051 :
       return;
    }
}
