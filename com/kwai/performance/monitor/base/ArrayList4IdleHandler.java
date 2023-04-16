package com.kwai.performance.monitor.base.ArrayList4IdleHandler;
import java.util.ArrayList;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.a;
import android.util.Printer;

public final class ArrayList4IdleHandler extends ArrayList	// class@0010fb
{
    public Printer mPrinter;

    public void ArrayList4IdleHandler(){
       super();
    }
    public boolean add(MessageQueue$IdleHandler p0){
       a.q(p0, "idleHandler");
       return super.add(new a(p0, this.mPrinter));
    }
    public boolean add(Object p0){
       return this.add(p0);
    }
    public boolean contains(MessageQueue$IdleHandler p0){
       return super.contains(p0);
    }
    public final boolean contains(Object p0){
       if (p0 instanceof MessageQueue$IdleHandler) {
          return this.contains(p0);
       }
       return false;
    }
    public int getSize(){
       return super.size();
    }
    public int indexOf(MessageQueue$IdleHandler p0){
       return super.indexOf(p0);
    }
    public final int indexOf(Object p0){
       if (p0 instanceof MessageQueue$IdleHandler) {
          return this.indexOf(p0);
       }
       return -1;
    }
    public int lastIndexOf(MessageQueue$IdleHandler p0){
       return super.lastIndexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       if (p0 instanceof MessageQueue$IdleHandler) {
          return this.lastIndexOf(p0);
       }
       return -1;
    }
    public final MessageQueue$IdleHandler remove(int p0){
       return this.removeAt(p0);
    }
    public boolean remove(MessageQueue$IdleHandler p0){
       return super.remove(p0);
    }
    public final boolean remove(Object p0){
       if (p0 instanceof MessageQueue$IdleHandler) {
          return this.remove(p0);
       }
       return false;
    }
    public MessageQueue$IdleHandler removeAt(int p0){
       return this.remove(p0);
    }
    public final void setPrinter(Printer p0){
       this.mPrinter = p0;
    }
    public final int size(){
       return this.getSize();
    }
}
