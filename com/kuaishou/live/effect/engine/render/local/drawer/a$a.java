package com.kuaishou.live.effect.engine.render.local.drawer.a$a;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import android.view.MotionEvent;

public interface abstract a$a	// class@001b18
{

    void a();
    void b();
    void c(String p0);
    MagicEmoji$MagicFace d();
    void e(LiveFlvStream$LiveFaceTransDataMessage p0,boolean p1);
    void f(int p0,int p1,int p2,int p3);
    void g(int p0,int p1);
    void h();
    void i(MagicEmoji$MagicFace p0,int p1,int p2);
    void onTouch(MotionEvent p0);
}
