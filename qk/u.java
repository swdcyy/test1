package qk.u;
import java.util.Queue;
import qk.p;
import java.lang.Object;
import java.util.Collection;

public abstract class u extends p implements Queue	// class@002a1b
{

    public void u(){
       super();
    }
    public Object delegate(){
       return this.delegate();
    }
    public Collection delegate(){
       return this.delegate();
    }
    public abstract Queue delegate();
    public Object element(){
       return this.delegate().element();
    }
    public boolean offer(Object p0){
       return this.delegate().offer(p0);
    }
    public Object peek(){
       return this.delegate().peek();
    }
    public Object poll(){
       return this.delegate().poll();
    }
    public Object remove(){
       return this.delegate().remove();
    }
    public boolean standardOffer(Object p0){
       try{
          return this.add(p0);
       }catch(java.lang.IllegalStateException e0){
          return false;
       }
    }
    public Object standardPeek(){
       try{
          return this.element();
       }catch(java.util.NoSuchElementException e0){
          return null;
       }
    }
    public Object standardPoll(){
       try{
          return this.remove();
       }catch(java.util.NoSuchElementException e0){
          return null;
       }
    }
}
