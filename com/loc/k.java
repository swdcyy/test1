package com.loc.k;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import java.util.Map;

public final class k extends Exception	// class@001448
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public Map j;

    public void k(String p0){
       String str2;
       int i = this;
       String str = p0;
       super(p0);
       String str1 = "δ֪�Ĵ���";
       i.a = str1;
       i.b = "";
       i.c = "";
       i.d = "1900";
       i.e = "UnknownError";
       int i1 = -1;
       i.f = i1;
       i.g = i1;
       i.h = false;
       i.a = str;
       if (("IO �����쳣 - IOException").equals(str)) {
          i.f = 21;
          i.d = "1902";
          str2 = "IOException";
       }else if("socket �����쳣 - SocketException".equals(str)){
          i1 = 22;
       }else if("socket ���ӳ�ʱ - SocketTimeoutException".equals(str)){
          i.f = 23;
          i.d = "1802";
          str2 = "SocketTimeoutException";
       }else if(("��Ч�Ĳ��� - IllegalArgumentException").equals(str)){
          i.f = 24;
          i.d = "1901";
          str2 = "IllegalArgumentException";
       }else if(("��ָ���쳣 - NullPointException").equals(str)){
          i.f = 25;
          i.d = "1903";
          str2 = "NullPointException";
       }else if(("url�쳣 - MalformedURLException").equals(str)){
          i.f = 26;
          i.d = "1803";
          str2 = "MalformedURLException";
       }else if("δ֪���� - UnKnowHostException".equals(str)){
          i.f = 27;
          i.d = "1804";
          str2 = "UnknownHostException";
       }else if(("����������ʧ�� - UnknownServiceException").equals(str)){
          i.f = 28;
          i.d = "1805";
          str2 = "CannotConnectToHostException";
       }else if(("Э��������� - ProtocolException").equals(str)){
          i.f = 29;
          i.d = "1801";
          str2 = "ProtocolException";
       }else {
          i1 = 30;
          if ("http����ʧ�� - ConnectionException".equals(str)) {
             i.f = i1;
             str2 = "1806";
          }else if(("����QPS����").equalsIgnoreCase(str)){
             i.f = i1;
             str2 = "2001";
          }else if(str1.equals(str)){
             i1 = 31;
          }else if(("key��Ȩʧ��").equals(str)){
             i1 = 32;
          }else if(("requeust is null").equals(str)){
             i1 = 1;
          }else if(("request url is empty").equals(str)){
             i.f = 2;
          label_017b :
             if ("IO �����쳣 - IOException".equals(str)) {
                i.g = 7;
                return;
             }else if("socket �����쳣 - SocketException".equals(str)){
                i.g = 6;
                return;
             }else if("socket ���ӳ�ʱ - SocketTimeoutException".equals(str)){
                i.g = 2;
                return;
             }else if(!"δ֪���� - UnKnowHostException".equals(str)){
                if ("http����ʧ�� - ConnectionException".equals(str)) {
                   i.g = 6;
                   return;
                }else if(!str1.equals(str) && "DNS����ʧ��".equals(str)){
                   i.g = 3;
                   return;
                }
             }
             i.g = 9;
             return;
          }else if(("response is null").equals(str)){
             if (("thread pool has exception").equals(str)) {
                i1 = 4;
             }else if(("sdk name is invalid").equals(str)){
                i1 = 5;
             }else if(("sdk info is null").equals(str)){
                i.f = 6;
                goto label_017b ;
             }else if(("sdk packages is null").equals(str)){
                i.f = 7;
                goto label_017b ;
             }else if(("�̳߳�Ϊ��").equals(str)){
                i1 = 8;
             }else if(("��ȡ�������").equals(str)){
                i1 = 101;
             }else if("DNS����ʧ��".equals(str)){
                i1 = -1;
             }
          }
          i.f = 3;
          goto label_017b ;
          i.d = str2;
          i.e = "ConnectionException";
          goto label_017b ;
       }
       i.f = i1;
       goto label_017b ;
       i.e = str2;
       goto label_017b ;
    }
    public void k(String p0,String p1,String p2){
       super(p0);
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.a;
    }
    public final void a(String p0){
       this.i = p0;
    }
    public final void a(Map p0){
       this.j = p0;
    }
    public final String b(){
       return this.d;
    }
    public final String c(){
       return this.e;
    }
    public final String d(){
       return this.b;
    }
    public final String e(){
       return this.c;
    }
    public final int f(){
       return this.f;
    }
    public final int g(){
       return this.g;
    }
    public final int h(){
       this.g = 10;
       return 10;
    }
    public final boolean i(){
       return this.h;
    }
    public final void j(){
       this.h = true;
    }
}
