package com.kuaishou.webkit.WebResourceError;
import java.lang.Object;
import java.lang.CharSequence;

public abstract class WebResourceError	// class@00126f
{

    public void WebResourceError(){
       super();
    }
    public abstract CharSequence getDescription();
    public abstract int getErrorCode();
}
