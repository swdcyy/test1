package com.yxcorp.plugin.setting.stencil.item.storage.CleanerItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanerItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.net.Uri;
import ihc.a;
import android.app.Activity;

public final class CleanerItem$action$1 extends Lambda implements l	// class@00092a
{
    public final CleanerItem this$0;

    public void CleanerItem$action$1(CleanerItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CleanerItem$action$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("kwai://cleaner"));
       intent.putExtra("SETTINGS", true);
       this.this$0.c.startActivity(intent);
       return;
    }
}
