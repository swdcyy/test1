package com.kuaishou.growth.privacy.dialog.helper.i;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import java.util.HashMap;
import o56.a;
import java.lang.Integer;
import java.lang.System;
import java.lang.Long;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;

public final class i implements Runnable	// class@000717
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void run(){
       HashMap hashMap = new HashMap();
       hashMap.put("kdfp_didTag", Integer.valueOf(a.c));
       hashMap.put("kdfp_did", a.a);
       hashMap.put("event_timestamp", Long.valueOf(System.currentTimeMillis()));
       b.a(0x4b316083).logCustomEvent("yunfama_did_tag", a.a.q(hashMap));
    }
}
