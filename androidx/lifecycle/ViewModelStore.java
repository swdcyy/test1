package androidx.lifecycle.ViewModelStore;
import java.lang.Object;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public class ViewModelStore	// class@00080c
{
    public final HashMap mMap;

    public void ViewModelStore(){
       super();
       this.mMap = new HashMap();
    }
    public final void clear(){
       Iterator iterator = this.mMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().clear();
       }
       this.mMap.clear();
       return;
    }
    public final ViewModel get(String p0){
       return this.mMap.get(p0);
    }
    public Set keys(){
       return new HashSet(this.mMap.keySet());
    }
    public final void put(String p0,ViewModel p1){
       ViewModel viewModel = this.mMap.put(p0, p1);
       if (viewModel != null) {
          viewModel.onCleared();
       }
       return;
    }
}
