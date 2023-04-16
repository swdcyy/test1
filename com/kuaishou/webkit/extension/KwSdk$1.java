package com.kuaishou.webkit.extension.KwSdk$1;
import java.lang.Thread;
import java.lang.String;
import com.kuaishou.webkit.internal.KsWebViewUtils;

public class KwSdk$1 extends Thread	// class@0012eb
{

    public void KwSdk$1(String p0){
       super(p0);
    }
    public void run(){
       KsWebViewUtils.preLoad();
    }
}
