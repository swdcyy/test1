package com.xiaomi.mipush.sdk.MessageHandleService$a;
import android.content.Intent;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.lang.Object;

public class MessageHandleService$a	// class@0010d5
{
    public PushMessageReceiver a;
    public Intent b;

    public void MessageHandleService$a(Intent p0,PushMessageReceiver p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public Intent a(){
       return this.b;
    }
    public PushMessageReceiver b(){
       return this.a;
    }
}
