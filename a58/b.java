package a58.b;
import java.lang.Runnable;
import com.mini.app.installer.b;
import java.lang.Object;
import java.util.Objects;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import w78.b;
import n88.b;
import com.mini.channel.b;
import java.lang.String;
import w78.c;
import android.os.Bundle;

public final class b implements Runnable	// class@00002d
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       o d = a.d;
       d.b().a.i().getChannel().i("get_mini_app_engine_so_response", tb.a);
       d.b().a.i().getChannel().d("get_ks_mini_app_engine_so_request", new Bundle());
    }
}
