package ajd.a;
import retrofit2.a;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;
import retrofit2.p;
import okhttp3.Request;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ukd.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import okhttp3.FormBody$Builder;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Builder;
import okhttp3.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import okhttp3.MultipartBody$Part;
import okhttp3.Headers;
import byd.a;
import ajd.a$a;

public class a implements a	// class@000046
{
    public final a b;
    public String c;
    public Map d;
    public Map e;

    public void a(a p0){
       super();
       this.d = new HashMap();
       this.e = new HashMap();
       this.b = p0;
    }
    public void a(String p0,String p1){
       this.d.put(p0, p1);
    }
    public void b(String p0,String p1){
       this.e.put(p0, p1);
    }
    public boolean c(String p0){
       return this.e.containsKey(p0);
    }
    public void cancel(){
       this.b.cancel();
    }
    public Object clone(){
       return this.clone();
    }
    public a clone(){
       a uoa = new a(this.b.clone());
       uoa.d(this.c);
       uoa.d = this.d;
       uoa.e = this.e;
       return uoa;
    }
    public void d(String p0){
       this.c = p0;
    }
    public p execute(){
       Iterator iterator1;
       Map$Entry uEntry1;
       String key1;
       Request request = this.b.request();
       HttpUrl$Builder uBuilder = request.url().newBuilder();
       Iterator iterator = this.e.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uBuilder.addQueryParameter(key, uEntry.getValue());
       }
       a.o(request, "url", uBuilder.build());
       if (!TextUtils.isEmpty(this.c) || !this.d.isEmpty()) {
          RequestBody requestBody = request.body();
          if (requestBody instanceof FormBody) {
             FormBody$Builder uBuilder1 = new FormBody$Builder();
             int i = requestBody.size();
             int i1 = 0;
             while (i1 < i) {
                if (!this.d.containsKey(requestBody.name(i1))) {
                   uBuilder1.add(requestBody.name(i1), requestBody.value(i1));
                }
                i1 = i1 + 1;
             }
             iterator1 = this.d.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry1 = iterator1.next();
                key1 = uEntry1.getKey();
                uBuilder1.add(key1, uEntry1.getValue());
             }
             if (!TextUtils.isEmpty(this.c)) {
                uBuilder1.add("captcha_token", this.c);
             }
             a.o(request, "body", uBuilder1.build());
          }else if(requestBody instanceof MultipartBody){
             MultipartBody$Builder uBuilder2 = new MultipartBody$Builder();
             uBuilder2.setType(requestBody.type());
             iterator1 = new ArrayList(requestBody.parts()).iterator();
             while (iterator1.hasNext()) {
                MultipartBody$Part part = iterator1.next();
                Headers headers = part.headers();
                uBuilder2.addPart(headers, part.body());
             }
             iterator1 = this.d.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry1 = iterator1.next();
                key1 = uEntry1.getKey();
                uBuilder2.addFormDataPart(key1, uEntry1.getValue());
             }
             if (!TextUtils.isEmpty(this.c)) {
                uBuilder2.addFormDataPart("captcha_token", this.c);
             }
             a.o(request, "body", uBuilder2.build());
          }
       }
       return this.b.execute();
    }
    public void h4(a p0){
       this.b.h4(new a$a(this, p0));
    }
    public boolean isCanceled(){
       return this.b.isCanceled();
    }
    public boolean isExecuted(){
       return this.b.isExecuted();
    }
    public Request request(){
       return this.b.request();
    }
}
