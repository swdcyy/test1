package com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import java.lang.Object;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController$a;
import android.os.Looper;
import android.os.Message;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController$2;
import androidx.lifecycle.LifecycleObserver;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController$3;
import java.lang.Runnable;
import com.yxcorp.download.DownloadManager;
import java.util.Objects;
import qfc.a;
import java.lang.StringBuilder;
import q87.c;

public class ResourceDownloadController	// class@000cd6
{
    public boolean a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Handler e;
    public static ResourceDownloadController f;

    public void ResourceDownloadController(){
       super();
       this.a = false;
       this.b = Collections.synchronizedSet(new HashSet());
       this.c = Collections.synchronizedSet(new HashSet());
       this.d = Collections.synchronizedSet(new HashSet());
       this.e = new ResourceDownloadController$a(this, Looper.getMainLooper());
    }
    public static ResourceDownloadController e(){
       if (ResourceDownloadController.f == null) {
          ResourceDownloadController resourceDown = ResourceDownloadController.class;
          _monitor_enter(resourceDown);
          if (ResourceDownloadController.f == null) {
             ResourceDownloadController.f = new ResourceDownloadController();
          }
          _monitor_exit(resourceDown);
       }
       return ResourceDownloadController.f;
    }
    public void a(){
       int i1;
       int i = 0;
       if (!this.d.isEmpty()) {
          i1 = 3;
       }else if(!this.c.isEmpty()){
          i1 = 2;
       }else if(!this.b.isEmpty()){
          i1 = 1;
       }else {
          i1 = 0;
       }
       int i2 = 4;
       Message message = this.e.obtainMessage(i2, i1, i);
       this.e.removeMessages(i2);
       if (!i1) {
          this.e.sendMessageDelayed(message, 5000);
       }else {
          this.e.sendMessage(message);
          this.e.sendMessageDelayed(this.e.obtainMessage(i2, i, i), 0x493e0);
       }
       return;
    }
    public void b(GifshowActivity p0){
       if (this.a == null) {
          return;
       }
       p0.getLifecycle().addObserver(new ResourceDownloadController$2(this, String.valueOf(p0.f())));
       return;
    }
    public void c(Fragment p0){
       if (this.a != null) {
          String url = p0.getUrl();
          if (TextUtils.isEmpty(url)) {
             return;
          }else {
             p0.getViewLifecycleOwner().getLifecycle().addObserver(new ResourceDownloadController$3(this, url));
          }
       }
       return;
    }
    public void d(boolean p0){
       this.a = p0;
       if (!p0) {
          this.e.removeCallbacks(null);
          this.e.removeMessages(4);
          Objects.requireNonNull(DownloadManager.n());
       }
       return;
    }
    public void f(String p0){
       if (this.a == null) {
          return;
       }
       this.h(p0);
       return;
    }
    public void g(String p0){
       this.i(p0, 2);
    }
    public void h(String p0){
       Object[] objArray = new Object[0];
       a.C().w("DownloadController", "resource download end "+p0, objArray);
       this.e.removeMessages(3, p0);
       this.b.remove(p0);
       this.c.remove(p0);
       this.d.remove(p0);
       this.a();
    }
    public void i(String p0,int p1){
       if (this.a != null && !TextUtils.isEmpty(p0)) {
          Object[] objArray = new Object[0];
          a.C().w("DownloadController", "resource download start "+p0+" "+p1, objArray);
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 == 3) {
                   this.d.add(p0);
                }
             }else {
                this.c.add(p0);
             }
          }else {
             this.b.add(p0);
          }
          this.e.removeMessages(3, p0);
          this.e.sendMessageDelayed(this.e.obtainMessage(3, p0), 0xea60);
          this.a();
       }
       return;
    }
    public void j(String p0){
       this.h(p0);
    }
}
