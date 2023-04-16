package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.a;
import wc.c;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a extends c	// class@001dcf
{
    public final LiveLiteGiftBoxSideBarItem$ViewHolder a;

    public void a(LiveLiteGiftBoxSideBarItem$ViewHolder p0){
       this.a = p0;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "dataSource");
       p0.close();
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 != null && !p0.isRecycled()) {
          a ta = this.a;
          Bitmap$Config config = p0.getConfig();
          if (config == null) {
             config = Bitmap$Config.ARGB_8888;
          }
          ta.g(p0.copy(config, true));
       }
    label_0031 :
       return;
    }
}
