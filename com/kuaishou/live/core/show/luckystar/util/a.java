package com.kuaishou.live.core.show.luckystar.util.a;
import ok.x;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.util.b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLuckyStarConfig;
import wg3.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import lnc.a1;
import va1.l0;
import java.lang.Integer;

public final class a implements x	// class@000cf8
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       LiveConfigStartupResponse$LiveLuckyStarConfig liveLuckySta = LiveConfigStartupResponse$LiveLuckyStarConfig.class;
       String str = a.a.getString("luckyStarConfig", "{}");
       liveLuckySta = (str == null || str == "")? null: b.a(str, liveLuckySta);
       int i = 0x7f061d74;
       int i1 = (liveLuckySta == null)? a1.a(i): l0.j(liveLuckySta.mDefaultPanelBackgroundColor, a1.a(i));
       return Integer.valueOf(i1);
    }
}
