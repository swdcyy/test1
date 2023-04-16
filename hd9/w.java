package hd9.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import java.util.Objects;
import lnc.i3;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import java.lang.Boolean;
import ed9.h;
import com.yxcorp.gifshow.util.PostUtils;

public final class w implements Runnable	// class@00262e
{
    public final d b;
    public final int c;
    public final int d;
    public final boolean e;

    public void w(d p0,int p1,int p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       w tb = this.b;
       Objects.requireNonNull(tb);
       i3 oi3 = i3.f();
       oi3.c("code", Integer.valueOf(this.c));
       oi3.c("extra", Integer.valueOf(this.d));
       oi3.a("isRecording", Boolean.valueOf(this.e));
       oi3.d("filePath", tb.F.a);
       PostUtils.x("sample_player_error", oi3.e());
    }
}
