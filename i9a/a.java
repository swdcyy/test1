package i9a.a;
import androidx.lifecycle.ViewModel;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.lang.Throwable;

public class a extends ViewModel	// class@0027d1
{
    public ClientEvent$ExpTagTrans a;

    public void a(){
       super();
       this.a = null;
    }
    public static a o0(Fragment p0){
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          Log.d("ProfileSwipeExpTagTransViewModel", "get ProfileSwipeExpTagTransViewModel when fragment is null");
          return null;
       }else if(p0.isDetached()){
          Log.d("ProfileSwipeExpTagTransViewModel", "get ProfileSwipeExpTagTransViewModel when fragment detached");
          return null;
       }else if(!p0.isAdded()){
          Log.d("ProfileSwipeExpTagTransViewModel", "get ProfileSwipeExpTagTransViewModel when fragment not added");
          return null;
       }else if(p0.getActivity() == null){
          Log.d("ProfileSwipeExpTagTransViewModel", "get ProfileSwipeExpTagTransViewModel when fragment getActivity return null");
          return null;
       }else {
          try{
             return ViewModelProviders.of(p0).get(uoa);
          }catch(java.lang.Exception e4){
             Log.e(obj, "get ProfileSwipeExpTagTransViewModel other crash", e4);
             return v1;
          }
       }
    }
}
