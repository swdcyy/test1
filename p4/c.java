package p4.c;
import java.lang.Object;
import p4.d;
import android.os.HandlerThread;
import java.lang.String;
import p4.e;
import android.os.Looper;
import android.content.Intent;
import android.content.Context;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import r4.b;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.os.SystemClock;

public class c	// class@0028b3
{
    public IInterface a;
    public String b;
    public String c;
    public final Object d;
    public ServiceConnection e;
    public Handler f;
    public HandlerThread g;
    public Context h;
    public IBinder$DeathRecipient i;

    public void c(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.d = new Object();
       this.e = null;
       this.i = new d(this);
       HandlerThread handlerThrea = new HandlerThread("GetIDWorkThread");
       this.g = handlerThrea;
       handlerThrea.start();
       this.f = new e(this, this.g.getLooper());
    }
    public Intent a(){
       throw null;
    }
    public void b(Context p0,String p1,String p2){
       throw null;
    }
    public void c(Context p0,List p1,boolean p2){
       boolean b;
       _monitor_enter(this);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          b = (p2)? this.e(str): this.d(str);
          if (!b) {
             uArrayList.add(str);
          }
       }
       if (!uArrayList.isEmpty()) {
          try{
             if (this.a == null && (a.a(p0, this.a(), this.e, 1) && this.a == null)) {
                c td1 = this.d;
                _monitor_enter(td1);
                try{
                   if (this.a == null) {
                      this.d.wait(0x2710);
                   }
                   _monitor_exit(td1);
                }catch(java.lang.InterruptedException e0){
                }
             }
          }catch(java.lang.Exception e9){
             if (e9.getMessage() != null) {
                e9.getMessage();
             }else {
                e9.getLocalizedMessage();
             }
          }
          if (this.a != null) {
             if (TextUtils.isEmpty(this.b)) {
                this.b = p0.getPackageName();
             }
             if (TextUtils.isEmpty(this.c)) {
                this.c = b.b(p0, this.b, "SHA1");
             }
             int i = 2;
             this.f.removeMessages(i);
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                String str1 = iterator1.next();
                c td = this.d;
                _monitor_enter(td);
                Message message = this.f.obtainMessage();
                message.what = (str1.equals("RESET_OUID"))? 3: 1;
                Bundle uBundle = new Bundle();
                uBundle.putString("IdType", str1);
                message.setData(uBundle);
                this.f.sendMessage(message);
                long l = SystemClock.uptimeMillis();
                int i1 = (str1.equals("DUID"))? 5000: 2000;
                this.d.wait((long)i1);
                long l1 = SystemClock.uptimeMillis() - l;
                _monitor_exit(td);
             }
             Message message1 = this.f.obtainMessage();
             message1.what = i;
             this.f.sendMessageDelayed(message1, 0x493e0);
          }
       }
       _monitor_exit(this);
       return;
    }
    public boolean d(String p0){
       throw false;
    }
    public boolean e(String p0){
       throw false;
    }
    public String f(String p0){
       throw null;
    }
}
