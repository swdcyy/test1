package com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import com.facebook.react.modules.blob.BlobModule$a;
import com.facebook.react.modules.blob.BlobModule$b;
import com.facebook.react.modules.blob.BlobModule$c;
import com.facebook.react.modules.blob.BlobModule$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yd.e;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.NetworkingModule$g;
import com.facebook.react.modules.network.NetworkingModule$e;
import com.facebook.react.modules.network.NetworkingModule$f;
import java.lang.Integer;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.modules.websocket.WebSocketModule$b;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableMap;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import java.util.Iterator;
import android.net.Uri;
import com.kwai.robust.PatchProxyResult;
import android.content.ContentResolver;
import android.content.ContextWrapper;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import android.content.res.Resources;
import vd.d;
import java.lang.Number;
import java.io.File;
import com.kuaishou.webkit.MimeTypeMap;
import android.database.Cursor;
import com.facebook.react.modules.blob.BlobCollector;
import he.a;
import java.lang.Runnable;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.Arrays;
import okio.ByteString;
import java.util.UUID;

public class BlobModule extends ReactContextBaseJavaModule	// class@001279
{
    public final Map mBlobs;
    public final NetworkingModule$e mNetworkingRequestBodyHandler;
    public final NetworkingModule$f mNetworkingResponseHandler;
    public final NetworkingModule$g mNetworkingUriHandler;
    public final WebSocketModule$b mWebSocketContentHandler;

    public void BlobModule(ReactApplicationContext p0){
       super(p0);
       this.mBlobs = new HashMap();
       this.mWebSocketContentHandler = new BlobModule$a(this);
       this.mNetworkingUriHandler = new BlobModule$b(this);
       this.mNetworkingRequestBodyHandler = new BlobModule$c(this);
       this.mNetworkingResponseHandler = new BlobModule$d(this);
    }
    public void addNetworkingHandler(){
       if (PatchProxy.applyVoid(null, this, BlobModule.class, "14")) {
          return;
       }
       if (e.Q && this.mReactApplicationContext == null) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          NetworkingModule nativeModule = reactApplica.getNativeModule(NetworkingModule.class);
          nativeModule.addUriHandler(this.mNetworkingUriHandler);
          nativeModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
          nativeModule.addResponseHandler(this.mNetworkingResponseHandler);
       }
       return;
    }
    public void addWebSocketHandler(int p0){
       BlobModule uBlobModule = BlobModule.class;
       if (PatchProxy.isSupport(uBlobModule) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBlobModule, "15")) {
          return;
       }
       WebSocketModule webSocketMod = this.getWebSocketModule("addWebSocketHandler");
       if (webSocketMod != null) {
          webSocketMod.setContentHandler(p0, this.mWebSocketContentHandler);
       }
       return;
    }
    public void createFromParts(ReadableArray p0,String p1){
       ReadableMap map;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BlobModule.class, "18")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(p0.size());
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < p0.size()) {
             map = p0.getMap(i);
             str = "type";
             String str1 = map.getString(str);
             Objects.requireNonNull(str1);
             if (!str1.equals("string")) {
                if (str1.equals("blob")) {
                   map = map.getMap("data");
                   i1 = i1 + map.getInt("size");
                   uArrayList.add(i, this.resolve(map));
                }else {
                   break ;
                }
             }else {
                byte[] bytes = (map.getString("data")).getBytes(Charset.forName("UTF-8"));
                i1 = i1 + bytes.length;
                uArrayList.add(i, bytes);
             }
             i = i + 1;
          }else {
             ByteBuffer uByteBuffer = ByteBuffer.allocate(i1);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                uByteBuffer.put(iterator.next());
             }
             this.store(uByteBuffer.array(), p1);
             return;
          }
       }
       throw new IllegalArgumentException("Invalid type for blob: "+map.getString(str));
    }
    public byte[] getBytesFromUri(Uri p0){
       InputStream obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getReactApplicationContext().getContentResolver().openInputStream(p0);
       if (obj == null) {
          throw new FileNotFoundException("File not found for "+p0);
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = new byte[1024];
       int i = obj.read(uobyteArray);
       while (i != -1) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       return uByteArrayOu.toByteArray();
    }
    public Map getConstants(){
       Object[] objArray = null;
       Resources obj = PatchProxy.apply(objArray, this, BlobModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.Q && this.mReactApplicationContext == null) {
          return objArray;
       }
       obj = this.getReactApplicationContext().getResources();
       int identifier = obj.getIdentifier("blob_provider_authority", "string", this.getReactApplicationContext().getPackageName());
       if (!identifier) {
          return objArray;
       }
       return d.e("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", obj.getString(identifier));
    }
    public long getLastModifiedFromUri(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (("file").equals(p0.getScheme())) {
          return new File(p0.toString()).lastModified();
       }
       return 0;
    }
    public String getMimeTypeFromUri(Uri p0){
       String obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getReactApplicationContext().getContentResolver().getType(p0);
       if (obj == null) {
          String fileExtensio = MimeTypeMap.getFileExtensionFromUrl(p0.getPath());
          if (fileExtensio != null) {
             obj = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensio);
          }
       }
       if (obj == null) {
          obj = "";
       }
       return obj;
    }
    public String getName(){
       return "BlobModule";
    }
    public String getNameFromUri(Uri p0){
       Cursor obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("file").equals(p0.getScheme())) {
          return p0.getLastPathSegment();
       }
       String[] stringArray = new String[]{"_display_name"};
       obj = this.getReactApplicationContext().getContentResolver().query(p0, stringArray, null, null, null);
       if (obj != null) {
          if (obj.moveToFirst()) {
             obj.close();
             return obj.getString(0);
          }else {
             obj.close();
          }
       }
       return p0.getLastPathSegment();
    }
    public final WebSocketModule getWebSocketModule(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "13");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       WebSocketModule webSocketMod = null;
       if (e.Q && this.mReactApplicationContext == null) {
          return webSocketMod;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          return reactApplica.getNativeModule(WebSocketModule.class);
       }
       return webSocketMod;
    }
    public void initialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BlobModule.class, "1")) {
          return;
       }
       if (e.Q && this.mReactApplicationContext == null) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       if (!PatchProxy.applyVoidTwoRefs(reactApplica, this, objArray, BlobCollector.class, "1")) {
          reactApplica.runOnJSQueueThread(new a(reactApplica, this));
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, BlobModule.class, "20")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       if (e.Q) {
          this.mReactApplicationContext = null;
       }
       return;
    }
    public void release(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlobModule.class, "19")) {
          return;
       }
       this.remove(p0);
       return;
    }
    public void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlobModule.class, "5")) {
          return;
       }
       BlobModule tmBlobs = this.mBlobs;
       _monitor_enter(tmBlobs);
       this.mBlobs.remove(p0);
       _monitor_exit(tmBlobs);
       return;
    }
    public void removeWebSocketHandler(int p0){
       BlobModule uBlobModule = BlobModule.class;
       if (PatchProxy.isSupport(uBlobModule) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBlobModule, "16")) {
          return;
       }
       WebSocketModule webSocketMod = this.getWebSocketModule("removeWebSocketHandler");
       if (webSocketMod != null) {
          webSocketMod.setContentHandler(p0, null);
       }
       return;
    }
    public byte[] resolve(Uri p0){
       String obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getLastPathSegment();
       int i = 0;
       int i1 = -1;
       String queryParamet = p0.getQueryParameter("offset");
       if (queryParamet != null) {
          i = Integer.parseInt(queryParamet, 10);
       }
       String queryParamet1 = p0.getQueryParameter("size");
       if (queryParamet1 != null) {
          i1 = Integer.parseInt(queryParamet1, 10);
       }
       return this.resolve(obj, i, i1);
    }
    public byte[] resolve(ReadableMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.resolve(p0.getString("blobId"), p0.getInt("offset"), p0.getInt("size"));
    }
    public byte[] resolve(String p0,int p1,int p2){
       BlobModule obj;
       if (PatchProxy.isSupport(BlobModule.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BlobModule.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mBlobs;
       _monitor_enter(obj);
       byte[] uobyteArray = this.mBlobs.get(p0);
       if (uobyteArray == null) {
          _monitor_exit(obj);
          return null;
       }else if(p2 == -1){
          p2 = uobyteArray.length - p1;
       }
       if (p1 > 0 || p2 != uobyteArray.length) {
          uobyteArray = Arrays.copyOfRange(uobyteArray, p1, (p2 + p1));
       }
       _monitor_exit(obj);
       return uobyteArray;
    }
    public void sendOverSocket(ReadableMap p0,int p1){
       BlobModule uBlobModule = BlobModule.class;
       if (PatchProxy.isSupport(uBlobModule) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uBlobModule, "17")) {
          return;
       }
       WebSocketModule webSocketMod = this.getWebSocketModule("sendOverSocket");
       if (webSocketMod != null) {
          byte[] uobyteArray = this.resolve(p0.getString("blobId"), p0.getInt("offset"), p0.getInt("size"));
          if (uobyteArray != null) {
             webSocketMod.sendBinary(ByteString.of(uobyteArray), p1);
          }else {
             webSocketMod.sendBinary(null, p1);
          }
       }
       return;
    }
    public String store(byte[] p0){
       String obj = PatchProxy.applyOneRefs(p0, this, BlobModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = UUID.randomUUID().toString();
       this.store(p0, obj);
       return obj;
    }
    public void store(byte[] p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BlobModule.class, "4")) {
          return;
       }
       BlobModule tmBlobs = this.mBlobs;
       _monitor_enter(tmBlobs);
       this.mBlobs.put(p1, p0);
       _monitor_exit(tmBlobs);
       return;
    }
}
