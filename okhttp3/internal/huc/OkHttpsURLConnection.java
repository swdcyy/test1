package okhttp3.internal.huc.OkHttpsURLConnection;
import okhttp3.internal.huc.DelegatingHttpsURLConnection;
import java.net.URL;
import okhttp3.OkHttpClient;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.URLFilter;
import java.net.HttpURLConnection;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.io.InputStream;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import java.security.cert.Certificate;
import java.security.Principal;
import java.io.OutputStream;
import java.security.Permission;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Handshake;
import java.lang.IllegalStateException;
import okhttp3.OkHttpClient$Builder;
import java.lang.IllegalArgumentException;

public final class OkHttpsURLConnection extends DelegatingHttpsURLConnection	// class@001fc4
{
    public final OkHttpURLConnection delegate;

    public void OkHttpsURLConnection(URL p0,OkHttpClient p1){
       super(new OkHttpURLConnection(p0, p1));
    }
    public void OkHttpsURLConnection(URL p0,OkHttpClient p1,URLFilter p2){
       super(new OkHttpURLConnection(p0, p1, p2));
    }
    public void OkHttpsURLConnection(OkHttpURLConnection p0){
       super(p0);
       this.delegate = p0;
    }
    public void addRequestProperty(String p0,String p1){
       super.addRequestProperty(p0, p1);
    }
    public void connect(){
       super.connect();
    }
    public void disconnect(){
       super.disconnect();
    }
    public boolean getAllowUserInteraction(){
       return super.getAllowUserInteraction();
    }
    public String getCipherSuite(){
       return super.getCipherSuite();
    }
    public int getConnectTimeout(){
       return super.getConnectTimeout();
    }
    public Object getContent(){
       return super.getContent();
    }
    public Object getContent(Class[] p0){
       return super.getContent(p0);
    }
    public String getContentEncoding(){
       return super.getContentEncoding();
    }
    public int getContentLength(){
       return super.getContentLength();
    }
    public long getContentLengthLong(){
       return super.getContentLengthLong();
    }
    public String getContentType(){
       return super.getContentType();
    }
    public long getDate(){
       return super.getDate();
    }
    public boolean getDefaultUseCaches(){
       return super.getDefaultUseCaches();
    }
    public boolean getDoInput(){
       return super.getDoInput();
    }
    public boolean getDoOutput(){
       return super.getDoOutput();
    }
    public InputStream getErrorStream(){
       return super.getErrorStream();
    }
    public long getExpiration(){
       return super.getExpiration();
    }
    public String getHeaderField(int p0){
       return super.getHeaderField(p0);
    }
    public String getHeaderField(String p0){
       return super.getHeaderField(p0);
    }
    public long getHeaderFieldDate(String p0,long p1){
       return super.getHeaderFieldDate(p0, p1);
    }
    public int getHeaderFieldInt(String p0,int p1){
       return super.getHeaderFieldInt(p0, p1);
    }
    public String getHeaderFieldKey(int p0){
       return super.getHeaderFieldKey(p0);
    }
    public long getHeaderFieldLong(String p0,long p1){
       return super.getHeaderFieldLong(p0, p1);
    }
    public Map getHeaderFields(){
       return super.getHeaderFields();
    }
    public HostnameVerifier getHostnameVerifier(){
       return this.delegate.client.hostnameVerifier();
    }
    public long getIfModifiedSince(){
       return super.getIfModifiedSince();
    }
    public InputStream getInputStream(){
       return super.getInputStream();
    }
    public boolean getInstanceFollowRedirects(){
       return super.getInstanceFollowRedirects();
    }
    public long getLastModified(){
       return super.getLastModified();
    }
    public Certificate[] getLocalCertificates(){
       return super.getLocalCertificates();
    }
    public Principal getLocalPrincipal(){
       return super.getLocalPrincipal();
    }
    public OutputStream getOutputStream(){
       return super.getOutputStream();
    }
    public Principal getPeerPrincipal(){
       return super.getPeerPrincipal();
    }
    public Permission getPermission(){
       return super.getPermission();
    }
    public int getReadTimeout(){
       return super.getReadTimeout();
    }
    public String getRequestMethod(){
       return super.getRequestMethod();
    }
    public Map getRequestProperties(){
       return super.getRequestProperties();
    }
    public String getRequestProperty(String p0){
       return super.getRequestProperty(p0);
    }
    public int getResponseCode(){
       return super.getResponseCode();
    }
    public String getResponseMessage(){
       return super.getResponseMessage();
    }
    public SSLSocketFactory getSSLSocketFactory(){
       return this.delegate.client.sslSocketFactory();
    }
    public Certificate[] getServerCertificates(){
       return super.getServerCertificates();
    }
    public URL getURL(){
       return super.getURL();
    }
    public boolean getUseCaches(){
       return super.getUseCaches();
    }
    public Handshake handshake(){
       OkHttpsURLConnection tdelegate = this.delegate;
       if (tdelegate.call != null) {
          return tdelegate.handshake;
       }
       throw new IllegalStateException("Connection has not yet been established");
    }
    public void setAllowUserInteraction(boolean p0){
       super.setAllowUserInteraction(p0);
    }
    public void setChunkedStreamingMode(int p0){
       super.setChunkedStreamingMode(p0);
    }
    public void setConnectTimeout(int p0){
       super.setConnectTimeout(p0);
    }
    public void setDefaultUseCaches(boolean p0){
       super.setDefaultUseCaches(p0);
    }
    public void setDoInput(boolean p0){
       super.setDoInput(p0);
    }
    public void setDoOutput(boolean p0){
       super.setDoOutput(p0);
    }
    public void setFixedLengthStreamingMode(int p0){
       super.setFixedLengthStreamingMode(p0);
    }
    public void setFixedLengthStreamingMode(long p0){
       super.setFixedLengthStreamingMode(p0);
    }
    public void setHostnameVerifier(HostnameVerifier p0){
       OkHttpsURLConnection tdelegate = this.delegate;
       tdelegate.client = tdelegate.client.newBuilder().hostnameVerifier(p0).build();
    }
    public void setIfModifiedSince(long p0){
       super.setIfModifiedSince(p0);
    }
    public void setInstanceFollowRedirects(boolean p0){
       super.setInstanceFollowRedirects(p0);
    }
    public void setReadTimeout(int p0){
       super.setReadTimeout(p0);
    }
    public void setRequestMethod(String p0){
       super.setRequestMethod(p0);
    }
    public void setRequestProperty(String p0,String p1){
       super.setRequestProperty(p0, p1);
    }
    public void setSSLSocketFactory(SSLSocketFactory p0){
       if (p0 == null) {
          throw new IllegalArgumentException("sslSocketFactory == null");
       }
       OkHttpsURLConnection tdelegate = this.delegate;
       tdelegate.client = tdelegate.client.newBuilder().sslSocketFactory(p0).build();
       return;
    }
    public void setUseCaches(boolean p0){
       super.setUseCaches(p0);
    }
    public String toString(){
       return super.toString();
    }
    public boolean usingProxy(){
       return super.usingProxy();
    }
}
