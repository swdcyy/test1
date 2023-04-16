package c98.e;
import w78.c;
import com.mini.guide.GuideMiniManagerImpl;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import android.os.Bundle;
import java.lang.String;
import java.lang.Boolean;
import wi8.c;
import com.mini.d;
import c98.h;
import java.lang.Runnable;

public final class e implements c	// class@0003c8
{
    public final GuideMiniManagerImpl a;

    public void e(GuideMiniManagerImpl p0){
       this.a = p0;
    }
    public final void a(Message p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == null) {
       }else {
          Bundle data = p0.getData();
          if (data != null) {
             boolean booleanx = data.getBoolean("key_channel_result", false);
             ta.d = Boolean.valueOf(booleanx);
             d.v().X1(new h(ta, booleanx), 0);
          }
       }
       return;
    }
}
