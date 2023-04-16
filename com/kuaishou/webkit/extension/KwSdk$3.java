package com.kuaishou.webkit.extension.KwSdk$3;
import com.kuaishou.webkit.internal.EventReporter$Delegate;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.extension.KsCoreListener;

public class KwSdk$3 implements EventReporter$Delegate	// class@0012ed
{

    public void KwSdk$3(){
       super();
    }
    public void onEvent(String p0,JSONObject p1){
       KsCoreListener sKsCoreListe = KwSdk.sKsCoreListener;
       if (sKsCoreListe != null) {
          sKsCoreListe.onEvent(p0, p1);
       }
       return;
    }
}
