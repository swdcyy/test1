package co8.e;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.network.TKNetwork;
import java.util.Map;
import cq8.a;
import java.lang.Boolean;
import java.util.Objects;
import iq8.r;
import java.lang.Integer;
import iq8.a;
import com.tkruntime.v8.V8Function;
import java.lang.Number;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;

public class e implements b	// class@00053a
{

    public void e(){
       super();
    }
    public Object a(f p0){
       TKNetwork tKNetwork = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (tKNetwork != PatchProxyResult.class) {
       }else {
          tKNetwork = new TKNetwork(p0);
       }
       return tKNetwork;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x82b0ba03:
             if (p0.equals("isAddExtraParameters")) {
                i = 0;
             }
             break;
           case 0xb1af4d61:
             if (p0.equals("timeout")) {
                i = 1;
             }
             break;
           case 0xbfc5d0e1:
             if (p0.equals("method")) {
                i = 2;
             }
             break;
           case 0xc4aaf986:
             if (p0.equals("params")) {
                i = 3;
             }
             break;
           case 0xcd096f43:
             if (p0.equals("fileKey")) {
                i = 4;
             }
             break;
           case 0xce040e01:
             if (p0.equals("upload")) {
                i = 5;
             }
             break;
           case 0xd7e3ce6b:
             if (p0.equals("businessName")) {
                i = 6;
             }
             break;
           case 0x1c56f:
             if (p0.equals("url")) {
                i = 7;
             }
             break;
           case 0x6581ae0:
             if (p0.equals("parts")) {
                i = 8;
             }
             break;
           case 0x2f676f86:
             if (p0.equals("headers")) {
                i = 9;
             }
             break;
           case 0x30ef06fe:
             if (p0.equals("paramString")) {
                i = 10;
             }
             break;
           case 0x5707bf6c:
             if (p0.equals("isAddCommonParameters")) {
                i = 11;
             }
             break;
           case 0x7e72584c:
             if (p0.equals("localFilePath")) {
                i = 12;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
           case 1:
           default:
             return false;
       }
       return true;
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x82b0ba03:
             if (p1.equals("isAddExtraParameters")) {
                i = 0;
             }
             break;
           case 0xb1af4d61:
             if (p1.equals("timeout")) {
                i = 1;
             }
             break;
           case 0xbfc5d0e1:
             if (p1.equals("method")) {
                i = 2;
             }
             break;
           case 0xc4aaf986:
             if (p1.equals("params")) {
                i = 3;
             }
             break;
           case 0xcd096f43:
             if (p1.equals("fileKey")) {
                i = 4;
             }
             break;
           case 0xce040e01:
             if (p1.equals("upload")) {
                i = 5;
             }
             break;
           case 0xd7e3ce6b:
             if (p1.equals("businessName")) {
                i = 6;
             }
             break;
           case 0x1c56f:
             if (p1.equals("url")) {
                i = 7;
             }
             break;
           case 0x6581ae0:
             if (p1.equals("parts")) {
                i = 8;
             }
             break;
           case 0x2f676f86:
             if (p1.equals("headers")) {
                i = 9;
             }
             break;
           case 0x30ef06fe:
             if (p1.equals("paramString")) {
                i = 10;
             }
             break;
           case 0x5707bf6c:
             if (p1.equals("isAddCommonParameters")) {
                i = 11;
             }
             break;
           case 0x7e72584c:
             if (p1.equals("localFilePath")) {
                i = 12;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return Integer.valueOf(p0.isAddExtraParameters);
           case 1:
             return Integer.valueOf(p0.timeout);
           case 2:
             return p0.method;
           case 3:
             return p0.params;
           case 4:
             return p0.fileKey;
           case 5:
             return Boolean.valueOf(p0.upload);
           case 6:
             return p0.businessName;
           case 7:
             return p0.url;
           case 8:
             return p0.parts;
           case 9:
             return p0.headers;
           case 10:
             return p0.paramString;
           case 11:
             return Integer.valueOf(p0.isAddCommonParameters);
           case 12:
             return p0.localFilePath;
           default:
             r.a();
             return null;
       }
    }
    public Object f(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xae7a2e7a:
             if (p1.equals("cancel")) {
                i = 0;
             }
             break;
           case 0x414ef28f:
             if (p1.equals("request")) {
                i = 1;
             }
             break;
           case 0x46f1ddf4:
             if (p1.equals("sourceRequest")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.cancel();
             return null;
           case 1:
             p0.request(a.a(p2, 0));
             return null;
           case 2:
             p0.sourceRequest(a.a(p2, 0));
             return null;
           default:
             r.a();
             return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xae7a2e7a:
             if (p0.equals("cancel")) {
                i = 0;
             }
             break;
           case 0x414ef28f:
             if (p0.equals("request")) {
                i = 1;
             }
             break;
           case 0x46f1ddf4:
             if (p0.equals("sourceRequest")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 1:
           default:
             return 0;
       }
       return 1;
    }
    public String i(){
       return "1";
    }
    public boolean k(Object p0,String p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p1);
       int i = -1;
       boolean b = false;
       switch (p1.hashCode()){
           case 0x82b0ba03:
             if (p1.equals("isAddExtraParameters")) {
                i = 0;
             }
             break;
           case 0xb1af4d61:
             if (p1.equals("timeout")) {
                i = 1;
             }
             break;
           case 0xbfc5d0e1:
             if (p1.equals("method")) {
                i = 2;
             }
             break;
           case 0xc4aaf986:
             if (p1.equals("params")) {
                i = 3;
             }
             break;
           case 0xcd096f43:
             if (p1.equals("fileKey")) {
                i = 4;
             }
             break;
           case 0xce040e01:
             if (p1.equals("upload")) {
                i = 5;
             }
             break;
           case 0xd7e3ce6b:
             if (p1.equals("businessName")) {
                i = 6;
             }
             break;
           case 0x1c56f:
             if (p1.equals("url")) {
                i = 7;
             }
             break;
           case 0x6581ae0:
             if (p1.equals("parts")) {
                i = 8;
             }
             break;
           case 0x2f676f86:
             if (p1.equals("headers")) {
                i = 9;
             }
             break;
           case 0x30ef06fe:
             if (p1.equals("paramString")) {
                i = 10;
             }
             break;
           case 0x5707bf6c:
             if (p1.equals("isAddCommonParameters")) {
                i = 11;
             }
             break;
           case 0x7e72584c:
             if (p1.equals("localFilePath")) {
                i = 12;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.isAddExtraParameters = a.m(p2);
          label_0135 :
             b = true;
             break;
           case 1:
             p0.setTimeout(a.m(p2));
             goto label_0135 ;
             break;
           case 2:
             p0.setMethod(p2);
             goto label_0135 ;
             break;
           case 3:
             p0.setParams(V8ObjectUtilsQuick.getValue(p2));
             goto label_0135 ;
             break;
           case 4:
             p0.setFileKey(p2);
             goto label_0135 ;
             break;
           case 5:
             p0.setUpload(p2.booleanValue());
             goto label_0135 ;
             break;
           case 6:
             p0.setBusinessName(p2);
             goto label_0135 ;
             break;
           case 7:
             p0.setUrl(p2);
             goto label_0135 ;
             break;
           case 8:
             p0.setParts(V8ObjectUtilsQuick.getValue(p2));
             goto label_0135 ;
             break;
           case 9:
             p0.setHeaders(V8ObjectUtilsQuick.getValue(p2));
             goto label_0135 ;
             break;
           case 10:
             p0.setParamString(p2);
             goto label_0135 ;
             break;
           case 11:
             p0.setAddCommonParameters(a.m(p2));
             goto label_0135 ;
             break;
           case 12:
             p0.setLocalFilePath(p2);
             goto label_0135 ;
             break;
           default:
             r.a();
       }
       return b;
    }
    public String l(){
       return "localFilePath,timeout,url,isAddExtraParameters,upload,fileKey,isAddCommonParameters,businessName,headers,paramString,method,params,parts,sourceRequest,request,cancel";
    }
}
