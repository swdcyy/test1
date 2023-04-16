package com.kuaishou.webkit.extension.KsWebExtensionStatics$PageLoadListenerWrapper;
import com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.util.Iterator;

public class KsWebExtensionStatics$PageLoadListenerWrapper implements KsWebViewPageLoadListener	// class@0012d9
{
    public final List listeners;

    public void KsWebExtensionStatics$PageLoadListenerWrapper(){
       super();
       this.listeners = new ArrayList();
    }
    public void addPageLoadListener(KsWebViewPageLoadListener p0){
       this.listeners.add(p0);
    }
    public void onPageLoad(String p0,int p1,boolean p2){
       Iterator iterator = this.listeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageLoad(p0, p1, p2);
       }
       return;
    }
    public void onPageLoad(String p0,int p1,boolean p2,String p3){
       Iterator iterator = this.listeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageLoad(p0, p1, p2, p3);
       }
       return;
    }
    public void onUploadKsWebViewAssistantInfo(String p0,String p1,String p2){
       Iterator iterator = this.listeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onUploadKsWebViewAssistantInfo(p0, p1, p2);
       }
       return;
    }
    public void removePageLoadListener(KsWebViewPageLoadListener p0){
       this.listeners.remove(p0);
    }
}
