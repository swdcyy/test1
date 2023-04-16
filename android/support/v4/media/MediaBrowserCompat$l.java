package android.support.v4.media.MediaBrowserCompat$l;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$m;
import java.util.List;
import r2.a;

public class MediaBrowserCompat$l	// class@0003d1
{
    public final List a;
    public final List b;

    public void MediaBrowserCompat$l(){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
    }
    public MediaBrowserCompat$m a(Bundle p0){
       int i = 0;
       while (true) {
          if (i >= this.b.size()) {
             return null;
          }
          if (a.a(this.b.get(i), p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return this.a.get(i);
    }
    public List b(){
       return this.a;
    }
    public List c(){
       return this.b;
    }
    public boolean d(){
       return this.a.isEmpty();
    }
    public void e(Bundle p0,MediaBrowserCompat$m p1){
       int i = 0;
       while (true) {
          if (i < this.b.size()) {
             if (a.a(this.b.get(i), p0)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             this.a.add(p1);
             this.b.add(p0);
             return;
          }
       }
       this.a.set(i, p1);
       return;
    }
}
