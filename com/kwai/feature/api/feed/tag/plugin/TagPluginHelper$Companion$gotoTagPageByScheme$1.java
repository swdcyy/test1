package com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion$gotoTagPageByScheme$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TagPluginHelper$Companion$gotoTagPageByScheme$1 extends Lambda implements a	// class@000f6d
{
    public final Context $context;
    public final Intent $intent;

    public void TagPluginHelper$Companion$gotoTagPageByScheme$1(Context p0,Intent p1){
       this.$context = p0;
       this.$intent = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TagPluginHelper$Companion$gotoTagPageByScheme$1.class, "1")) {
          return;
       }
       this.$context.startActivity(this.$intent);
       return;
    }
}
