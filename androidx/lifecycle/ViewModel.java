package androidx.lifecycle.ViewModel;
import java.lang.Object;
import java.util.HashMap;
import java.io.Closeable;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.lang.String;

public abstract class ViewModel	// class@000801
{
    public final Map mBagOfTags;
    public boolean mCleared;

    public void ViewModel(){
       super();
       this.mBagOfTags = new HashMap();
       this.mCleared = false;
    }
    public static void closeWithRuntimeException(Object p0){
       if (p0 instanceof Closeable) {
          try{
             p0.close();
          }catch(java.io.IOException e1){
             throw new RuntimeException(e1);
          }
       }
       return;
    }
    public final void clear(){
       this.mCleared = true;
       ViewModel tmBagOfTags = this.mBagOfTags;
       if (tmBagOfTags != null) {
          _monitor_enter(tmBagOfTags);
          Iterator iterator = this.mBagOfTags.values().iterator();
          while (iterator.hasNext()) {
             ViewModel.closeWithRuntimeException(iterator.next());
          }
          _monitor_exit(tmBagOfTags);
       }
       this.onCleared();
       return;
    }
    public Object getTag(String p0){
       ViewModel tmBagOfTags = this.mBagOfTags;
       _monitor_enter(tmBagOfTags);
       _monitor_exit(tmBagOfTags);
       return this.mBagOfTags.get(p0);
    }
    public void onCleared(){
    }
    public Object setTagIfAbsent(String p0,Object p1){
       ViewModel tmBagOfTags = this.mBagOfTags;
       _monitor_enter(tmBagOfTags);
       Object obj = this.mBagOfTags.get(p0);
       if (obj == null) {
          this.mBagOfTags.put(p0, p1);
       }
       _monitor_exit(tmBagOfTags);
       if (obj != null) {
          p1 = obj;
       }
       if (this.mCleared != null) {
          ViewModel.closeWithRuntimeException(p1);
       }
       return p1;
    }
}
