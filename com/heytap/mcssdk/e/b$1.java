package com.heytap.mcssdk.e.b$1;
import java.lang.Runnable;
import com.heytap.mcssdk.e.b;
import com.heytap.msp.push.mode.DataMessage;
import android.content.Context;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import java.lang.Object;

public class b$1 implements Runnable	// class@000538
{
    public final DataMessage a;
    public final Context b;
    public final IDataMessageCallBackService c;
    public final b d;

    public void b$1(b p0,DataMessage p1,Context p2,IDataMessageCallBackService p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (this.a.getMsgCommand() == 1) {
          b.a(this.d, this.b, this.a);
       }else {
          this.c.processMessage(this.b, this.a);
       }
       return;
    }
}
