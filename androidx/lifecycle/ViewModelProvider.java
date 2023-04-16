package androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import androidx.lifecycle.ViewModelProvider$KeyedFactory;

public class ViewModelProvider	// class@000808
{
    public final ViewModelProvider$Factory mFactory;
    public final ViewModelStore mViewModelStore;

    public void ViewModelProvider(ViewModelStore p0,ViewModelProvider$Factory p1){
       super();
       this.mFactory = p1;
       this.mViewModelStore = p0;
    }
    public void ViewModelProvider(ViewModelStoreOwner p0,ViewModelProvider$Factory p1){
       super(p0.getViewModelStore(), p1);
    }
    public ViewModel get(Class p0){
       String canonicalNam = p0.getCanonicalName();
       if (canonicalNam != null) {
          return this.get("androidx.lifecycle.ViewModelProvider.DefaultKey:"+canonicalNam, p0);
       }
       throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    public ViewModel get(String p0,Class p1){
       ViewModel viewModel = this.mViewModelStore.get(p0);
       if (p1.isInstance(viewModel)) {
          return viewModel;
       }
       ViewModelProvider tmFactory = this.mFactory;
       ViewModel viewModel1 = (tmFactory instanceof ViewModelProvider$KeyedFactory)? tmFactory.create(p0, p1): tmFactory.create(p1);
       this.mViewModelStore.put(p0, viewModel1);
       return viewModel1;
    }
}
