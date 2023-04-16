package com.yxcorp.gifshow.tti.module.d;
import java.lang.Runnable;
import java.lang.Object;
import i4b.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import wkd.b;
import j80.c;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;

public final class d implements Runnable	// class@001dd6
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, null, g.class, "12")) {
       }else {
          g.a(new File(b.a(-1504323719).k(), ".magic_emoji"), MagicEmojiResourceHelper.f(".magic_emoji"));
          g.a(new File(b.a(-1504323719).k(), ".vf"), MagicEmojiResourceHelper.f(".vf"));
       }
       return;
    }
}
