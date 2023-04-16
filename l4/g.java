package l4.g;
import rd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.util.ArrayList;
import com.RNFetchBlob.RNFetchBlob;
import java.util.Collections;

public class g implements c0	// class@002514
{

    public void g(){
       super();
    }
    public List createNativeModules(ReactApplicationContext p0){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new RNFetchBlob(p0));
       return uArrayList;
    }
    public List createViewManagers(ReactApplicationContext p0){
       return Collections.emptyList();
    }
}
