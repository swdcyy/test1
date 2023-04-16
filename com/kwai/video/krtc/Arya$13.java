package com.kwai.video.krtc.Arya$13;
import android.net.ConnectivityManager$NetworkCallback;
import com.kwai.video.krtc.Arya;
import android.net.Network;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.utils.Log;
import java.lang.NullPointerException;

public class Arya$13 extends ConnectivityManager$NetworkCallback	// class@00064c
{
    public final Arya this$0;

    public void Arya$13(Arya p0){
       this.this$0 = p0;
       super();
    }
    public void onAvailable(Network p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$13.class, "1")) {
          return;
       }
       try{
          Arya.a(p0);
          Log.i("Arya", "multiNic: wifi network onAvailable");
       }catch(java.lang.NullPointerException e3){
          e3.printStackTrace();
       }
       return;
    }
    public void onUnavailable(){
       if (PatchProxy.applyVoid(null, this, Arya$13.class, "2")) {
          return;
       }
       Log.i("Arya", "multiNic: wifi network onUnavailable");
       Arya.a(null);
       return;
    }
}
