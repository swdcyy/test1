package com.yxcorp.gifshow.detail.player.panel.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.player.panel.config.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfigPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001626
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putString("PlayerPanelConfig", b.e(p0.mPlayerPanelConfig));
          g.a(uEditor);
       }
       return;
    }
}