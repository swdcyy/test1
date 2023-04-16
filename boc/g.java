package boc.g;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import android.app.Application;
import o56.a;
import java.lang.StringBuilder;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public final class g implements Runnable	// class@000442
{
    public final String b;

    public void g(String p0){
       this.b = p0;
    }
    public final void run(){
       Toast.makeText(a.b(), "魔表模型无法下载，未知模型："+this.b, 1).show();
    }
}
