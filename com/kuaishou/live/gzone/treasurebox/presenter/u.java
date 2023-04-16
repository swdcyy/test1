package com.kuaishou.live.gzone.treasurebox.presenter.u;
import f67.n0;
import java.lang.Object;
import java.lang.String;
import pm8.a;
import com.kwai.live.gzone.pendant.bean.LiveGzoneFeatureEntranceBubble;
import f67.m0;

public final class u implements n0	// class@001c9d
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public final void a(String p0,String p1,String p2){
       if (("treasure_box").equals(p1)) {
          a.Z1(false);
       }
       return;
    }
    public boolean b(LiveGzoneFeatureEntranceBubble p0){
       return m0.b(this, p0);
    }
    public boolean c(LiveGzoneFeatureEntranceBubble p0){
       return m0.a(this, p0);
    }
    public boolean d(LiveGzoneFeatureEntranceBubble p0){
       return m0.c(this, p0);
    }
}
