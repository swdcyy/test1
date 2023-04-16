package com.facebook.drawee.components.DraweeEventTracker;
import java.lang.Object;
import java.util.concurrent.ArrayBlockingQueue;
import com.facebook.drawee.components.DraweeEventTracker$Event;
import java.util.Queue;
import java.lang.String;

public class DraweeEventTracker	// class@001081
{
    public final Queue a;
    public static final DraweeEventTracker b;
    public static boolean c;

    static {
       DraweeEventTracker.b = new DraweeEventTracker();
       DraweeEventTracker.c = true;
    }
    public void DraweeEventTracker(){
       super();
       this.a = new ArrayBlockingQueue(20);
    }
    public static DraweeEventTracker a(){
       DraweeEventTracker uDraweeEvent = (DraweeEventTracker.c)? new DraweeEventTracker(): DraweeEventTracker.b;
       return uDraweeEvent;
    }
    public void b(DraweeEventTracker$Event p0){
       if (!DraweeEventTracker.c) {
          return;
       }
       if ((this.a.size() + 1) > 20) {
          this.a.poll();
       }
       this.a.add(p0);
       return;
    }
    public String toString(){
       return this.a.toString();
    }
}
