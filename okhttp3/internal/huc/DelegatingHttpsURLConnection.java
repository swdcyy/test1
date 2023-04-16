package okhttp3.internal.huc.DelegatingHttpsURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.lang.String;
import okhttp3.Handshake;
import okhttp3.CipherSuite;
import java.lang.Object;
import java.lang.Class;
import java.io.InputStream;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import java.security.cert.Certificate;
import java.util.List;
import java.security.Principal;
import java.io.OutputStream;
import java.security.Permission;
import javax.net.ssl.SSLSocketFactory;

public abstract class DelegatingHttpsURLConnection extends HttpsURLConnection	// class@001fbf
{
    public final HttpURLConnection delegate;

    public void DelegatingHttpsURLConnection(HttpURLConnection p0){
       super(p0.getURL());
       this.delegate = p0;
    }
    public void addRequestProperty(String p0,String p1){
       this.delegate.addRequestProperty(p0, p1);
    }
    public void connect(){
       this.connected = true;
       this.delegate.connect();
    }
    public void disconnect(){
       this.delegate.disconnect();
    }
    public boolean getAllowUserInteraction(){
       return this.delegate.getAllowUserInteraction();
    }
    public String getCipherSuite(){
       Handshake handshake = this.handshake();
       String str = (handshake != null)? handshake.cipherSuite().javaName(): null;
       return str;
    }
    public int getConnectTimeout(){
       return this.delegate.getConnectTimeout();
    }
    public Object getContent(){
       return this.delegate.getContent();
    }
    public Object getContent(Class[] p0){
       return this.delegate.getContent(p0);
    }
    public String getContentEncoding(){
       return this.delegate.getContentEncoding();
    }
    public int getContentLength(){
       return this.delegate.getContentLength();
    }
    public long getContentLengthLong(){
       return this.delegate.getContentLengthLong();
    }
    public String getContentType(){
       return this.delegate.getContentType();
    }
    public long getDate(){
       return this.delegate.getDate();
    }
    public boolean getDefaultUseCaches(){
       return this.delegate.getDefaultUseCaches();
    }
    public boolean getDoInput(){
       return this.delegate.getDoInput();
    }
    public boolean getDoOutput(){
       return this.delegate.getDoOutput();
    }
    public InputStream getErrorStream(){
       return this.delegate.getErrorStream();
    }
    public long getExpiration(){
       return this.delegate.getExpiration();
    }
    public String getHeaderField(int p0){
       return this.delegate.getHeaderField(p0);
    }
    public String getHeaderField(String p0){
       return this.delegate.getHeaderField(p0);
    }
    public long getHeaderFieldDate(String p0,long p1){
       return this.delegate.getHeaderFieldDate(p0, p1);
    }
    public int getHeaderFieldInt(String p0,int p1){
       return this.delegate.getHeaderFieldInt(p0, p1);
    }
    public String getHeaderFieldKey(int p0){
       return this.delegate.getHeaderFieldKey(p0);
    }
    public long getHeaderFieldLong(String p0,long p1){
       return this.delegate.getHeaderFieldLong(p0, p1);
    }
    public Map getHeaderFields(){
       return this.delegate.getHeaderFields();
    }
    public abstract HostnameVerifier getHostnameVerifier();
    public long getIfModifiedSince(){
       return this.delegate.getIfModifiedSince();
    }
    public InputStream getInputStream(){
       return this.delegate.getInputStream();
    }
    public boolean getInstanceFollowRedirects(){
       return this.delegate.getInstanceFollowRedirects();
    }
    public long getLastModified(){
       return this.delegate.getLastModified();
    }
    public Certificate[] getLocalCertificates(){
       Handshake handshake = this.handshake();
       Certificate[] uCertificate = null;
       if (handshake == null) {
          return uCertificate;
       }
       List list = handshake.localCertificates();
       if (!list.isEmpty()) {
          uCertificate = new Certificate[list.size()];
          uCertificate = list.toArray(uCertificate);
       }
       return uCertificate;
    }
    public Principal getLocalPrincipal(){
       Handshake handshake = this.handshake();
       Principal principal = (handshake != null)? handshake.localPrincipal(): null;
       return principal;
    }
    public OutputStream getOutputStream(){
       return this.delegate.getOutputStream();
    }
    public Principal getPeerPrincipal(){
       Handshake handshake = this.handshake();
       Principal principal = (handshake != null)? handshake.peerPrincipal(): null;
       return principal;
    }
    public Permission getPermission(){
       return this.delegate.getPermission();
    }
    public int getReadTimeout(){
       return this.delegate.getReadTimeout();
    }
    public String getRequestMethod(){
       return this.delegate.getRequestMethod();
    }
    public Map getRequestProperties(){
       return this.delegate.getRequestProperties();
    }
    public String getRequestProperty(String p0){
       return this.delegate.getRequestProperty(p0);
    }
    public int getResponseCode(){
       return this.delegate.getResponseCode();
    }
    public String getResponseMessage(){
       return this.delegate.getResponseMessage();
    }
    public abstract SSLSocketFactory getSSLSocketFactory();
    public Certificate[] getServerCertificates(){
       Handshake handshake = this.handshake();
       Certificate[] uCertificate = null;
       if (handshake == null) {
          return uCertificate;
       }
       List list = handshake.peerCertificates();
       if (!list.isEmpty()) {
          uCertificate = new Certificate[list.size()];
          uCertificate = list.toArray(uCertificate);
       }
       return uCertificate;
    }
    public URL getURL(){
       return this.delegate.getURL();
    }
    public boolean getUseCaches(){
       return this.delegate.getUseCaches();
    }
    public abstract Handshake handshake();
    public void setAllowUserInteraction(boolean p0){
       this.delegate.setAllowUserInteraction(p0);
    }
    public void setChunkedStreamingMode(int p0){
       this.delegate.setChunkedStreamingMode(p0);
    }
    public void setConnectTimeout(int p0){
       this.delegate.setConnectTimeout(p0);
    }
    public void setDefaultUseCaches(boolean p0){
       this.delegate.setDefaultUseCaches(p0);
    }
    public void setDoInput(boolean p0){
       this.delegate.setDoInput(p0);
    }
    public void setDoOutput(boolean p0){
       this.delegate.setDoOutput(p0);
    }
    public void setFixedLengthStreamingMode(int p0){
       this.delegate.setFixedLengthStreamingMode(p0);
    }
    public void setFixedLengthStreamingMode(long p0){
       this.delegate.setFixedLengthStreamingMode(p0);
    }
    public abstract void setHostnameVerifier(HostnameVerifier p0);
    public void setIfModifiedSince(long p0){
       this.delegate.setIfModifiedSince(p0);
    }
    public void setInstanceFollowRedirects(boolean p0){
       this.delegate.setInstanceFollowRedirects(p0);
    }
    public void setReadTimeout(int p0){
       this.delegate.setReadTimeout(p0);
    }
    public void setRequestMethod(String p0){
       this.delegate.setRequestMethod(p0);
    }
    public void setRequestProperty(String p0,String p1){
       this.delegate.setRequestProperty(p0, p1);
    }
    public abstract void setSSLSocketFactory(SSLSocketFactory p0);
    public void setUseCaches(boolean p0){
       this.delegate.setUseCaches(p0);
    }
    public String toString(){
       return this.delegate.toString();
    }
    public boolean usingProxy(){
       return this.delegate.usingProxy();
    }
}
