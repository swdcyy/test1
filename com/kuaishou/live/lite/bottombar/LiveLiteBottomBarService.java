package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$c;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$b;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.util.List;

public interface abstract LiveLiteBottomBarService	// class@001eb4
{
    public static final LiveLiteBottomBarService$c a;

    static {
       LiveLiteBottomBarService.a = LiveLiteBottomBarService$c.b;
    }
    void a(LiveLiteBottomBarService$a p0);
    void b(LiveLiteBottomBarService$b p0);
    void c(LiveLiteBottomBarService$a p0);
    boolean d(LiveLiteBottomBarService$a p0);
    boolean e(LiveLiteBottomBarService$BottomBarType p0,LiveLiteBottomBarService$a p1);
    void f(LiveLiteBottomBarService$b p0);
    List g();
    boolean h(LiveLiteBottomBarService$BottomBarType p0,LiveLiteBottomBarService$a p1);
}
