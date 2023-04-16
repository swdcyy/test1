package com.yxcorp.gifshow.init.module.c0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.GameCenterInitModule;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import tka.e;
import com.yxcorp.gifshow.init.module.b0;
import java.lang.String;
import am8.d;

public final class c0 implements Runnable	// class@0019b5
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final void run(){
       GameCenterPlugin gameCenterPl = d.a(-1986139969);
       if (gameCenterPl == null || !gameCenterPl.isAvailable()) {
          e.a().b(false, false);
       }
       d.d(b0.b, "gzone_report_game_download_complete", 2);
       return;
    }
}
