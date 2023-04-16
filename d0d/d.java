package d0d.d;
import d0d.b;
import d0d.g$b;
import java.util.LinkedList;
import d0d.f;
import java.lang.Object;
import okhttp3.Call;
import aegon.chrome.net.n$b;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import okhttp3.EventListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Protocol;
import okhttp3.Connection;
import tjd.a;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Handshake;

public class d extends b	// class@00145b
{
    public LinkedList a;

    public void d(g$b p0){
       super();
       LinkedList linkedList = new LinkedList();
       this.a = linkedList;
       linkedList.addFirst(new f(p0));
    }
    public void c(Call p0,n$b p1,String p2){
       if (p1 == null) {
          Log.g("HttpEventListenerWrapper", "HttpEventListenerWrapper:onCronetMetrics metrics == null");
          return;
       }else {
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0, p1, p2);
          }
          return;
       }
    }
    public void callEnd(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().callEnd(p0);
       }
       return;
    }
    public void callFailed(Call p0,IOException p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().callFailed(p0, p1);
       }
       return;
    }
    public void callStart(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().callStart(p0);
       }
       return;
    }
    public void connectEnd(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().connectEnd(p0, p1, p2, p3);
       }
       return;
    }
    public void connectFailed(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3,IOException p4){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().connectFailed(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void connectStart(Call p0,InetSocketAddress p1,Proxy p2){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().connectStart(p0, p1, p2);
       }
       return;
    }
    public void connectionAcquired(Call p0,Connection p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().connectionAcquired(p0, p1);
       }
       return;
    }
    public void connectionReleased(Call p0,Connection p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().connectionReleased(p0, p1);
       }
       return;
    }
    public void d(Call p0,a p1){
       if (p1 == null) {
          Log.g("HttpEventListenerWrapper", "HttpEventListenerWrapper:onInterceptorMetrics metrics == null");
          return;
       }else {
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().d(p0, p1);
          }
          return;
       }
    }
    public void dnsEnd(Call p0,String p1,List p2){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().dnsEnd(p0, p1, p2);
       }
       return;
    }
    public void dnsStart(Call p0,String p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().dnsStart(p0, p1);
       }
       return;
    }
    public LinkedList e(){
       return this.a;
    }
    public void requestBodyEnd(Call p0,long p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().requestBodyEnd(p0, p1);
       }
       return;
    }
    public void requestBodyStart(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().requestBodyStart(p0);
       }
       return;
    }
    public void requestHeadersEnd(Call p0,Request p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().requestHeadersEnd(p0, p1);
       }
       return;
    }
    public void requestHeadersStart(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().requestHeadersStart(p0);
       }
       return;
    }
    public void responseBodyEnd(Call p0,long p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().responseBodyEnd(p0, p1);
       }
       return;
    }
    public void responseBodyStart(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().responseBodyStart(p0);
       }
       return;
    }
    public void responseHeadersEnd(Call p0,Response p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().responseHeadersEnd(p0, p1);
       }
       return;
    }
    public void responseHeadersStart(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().responseHeadersStart(p0);
       }
       return;
    }
    public void secureConnectEnd(Call p0,Handshake p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().secureConnectEnd(p0, p1);
       }
       return;
    }
    public void secureConnectStart(Call p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().secureConnectStart(p0);
       }
       return;
    }
}
