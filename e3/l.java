package e3.l;
import android.view.ViewGroup;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.util.SparseArray;
import android.view.LayoutInflater;
import java.lang.Runnable;

public class l	// class@001eea
{
    public Context a;
    public int b;
    public ViewGroup c;
    public View d;
    public Runnable e;
    public Runnable f;

    public void l(ViewGroup p0){
       super();
       this.b = -1;
       this.c = p0;
    }
    public void l(ViewGroup p0,int p1,Context p2){
       super();
       this.b = -1;
       this.a = p2;
       this.c = p0;
       this.b = p1;
    }
    public void l(ViewGroup p0,View p1){
       super();
       this.b = -1;
       this.c = p0;
       this.d = p1;
    }
    public static l c(ViewGroup p0){
       return p0.getTag(0x7f0a4052);
    }
    public static l d(ViewGroup p0,int p1,Context p2){
       int i = 0x7f0a405b;
       SparseArray tag = p0.getTag(i);
       if (tag == null) {
          tag = new SparseArray();
          p0.setTag(i, tag);
       }
       l ol = tag.get(p1);
       if (ol != null) {
          return ol;
       }else {
          ol = new l(p0, p1, p2);
          tag.put(p1, ol);
          return ol;
       }
    }
    public static void g(ViewGroup p0,l p1){
       p0.setTag(R.id.transition_current_scene, p1);
    }
    public void a(){
       if (this.b > null || this.d != null) {
          this.e().removeAllViews();
          if (this.b > null) {
             LayoutInflater.from(this.a).inflate(this.b, this.c);
          }else {
             this.c.addView(this.d);
          }
       }
       l te = this.e;
       if (te != null) {
          te.run();
       }
       l.g(this.c, this);
       return;
    }
    public void b(){
       if (l.c(this.c) == this) {
          l tf = this.f;
          if (tf != null) {
             tf.run();
          }
       }
       return;
    }
    public ViewGroup e(){
       return this.c;
    }
    public boolean f(){
       boolean b = (this.b > null)? true: false;
       return b;
    }
}
