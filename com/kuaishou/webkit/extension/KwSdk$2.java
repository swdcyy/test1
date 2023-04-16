package com.kuaishou.webkit.extension.KwSdk$2;
import com.kuaishou.webkit.internal.Logger$Delegate;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.extension.KsCoreListener;

public class KwSdk$2 implements Logger$Delegate	// class@0012ec
{

    public void KwSdk$2(){
       super();
    }
    public void log(int p0,String p1,String p2){
       KsCoreListener sKsCoreListe = KwSdk.sKsCoreListener;
       if (sKsCoreListe != null) {
          sKsCoreListe.onLogging(p0, p1, p2);
       }
       return;
    }
}
