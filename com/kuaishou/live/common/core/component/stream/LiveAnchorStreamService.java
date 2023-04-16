package com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService;
import lp3.c;
import java.lang.String;
import com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService$a;
import com.kuaishou.live.common.core.component.stream.LiveAnchorStreamService$LivePushDestinationType;
import android.graphics.Bitmap;

public interface abstract LiveAnchorStreamService implements c	// class@00177d
{

    String A5();
    void He(LiveAnchorStreamService$a p0);
    String U6();
    void Uj();
    void Vl();
    LiveAnchorStreamService$LivePushDestinationType W6();
    int X2();
    boolean Yk();
    void Zi();
    void d4(Bitmap p0);
    void e6(long p0);
    void n(int p0,int p1);
    void onPause();
    void onResume();
    void t0(byte[] p0);
    void tf(LiveAnchorStreamService$a p0);
    void u6();
    void x(int p0,int p1);
}
