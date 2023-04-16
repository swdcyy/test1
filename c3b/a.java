package c3b.a;
import zk.d;
import com.google.gson.Gson;
import android.content.Context;
import java.lang.Object;
import f3b.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences;
import vid.b;
import q2b.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.google.common.collect.ImmutableMap$b;
import zk.g;
import com.google.protobuf.nano.MessageNano;
import f3b.m;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import f3b.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Map;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.log.urt.RestDyeConfig;
import c3b.a$a;
import java.lang.reflect.Type;
import el.a;
import f3b.i;
import android.content.res.AssetManager;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.ByteArrayOutputStream;
import java.lang.Throwable;
import java.io.IOException;
import k2b.z1;
import c3b.a$b;

public class a	// class@000383
{
    public Map a;
    public Map b;
    public Context c;
    public RestDyeConfig d;
    public boolean e;
    public static String f = "a";
    public static Gson g;
    public static int h;

    static {
       d uod = new d();
       uod.c();
       a.g = uod.b();
    }
    public void a(Context p0){
       super();
       boolean b = false;
       this.e = b;
       this.c = p0;
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, "urt_id", Integer.valueOf(b), null, d.class, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.intValue();
          }else if(p0 == null || TextUtils.x("urt_id")){
             b = b.c(p0, "log_store", 4).getInt("urt_id", b);
          }
       }else {
          goto label_002c ;
       }
       a.h = b;
       return;
    }
    public final void a(String p0,String p1,e p2,ClientEvent$ClickEvent p3,ImmutableMap$b p4){
       a uoa = a.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       try{
          p4.c("page_code", new g(p0));
          p4.c("element_action", new g(p1));
          m.d(p0, p1, p2, p3, p4);
          e initData = p2.initData;
          if (initData != null && initData.size() > 0) {
             Iterator iterator = p2.initData.iterator();
             while (iterator.hasNext()) {
                String[] stringArray = (iterator.next()).split(",");
                if (stringArray.length > i1) {
                   p4.c(stringArray[i1], new g(stringArray[i]));
                }
             }
          label_006c :
             n.a(p2.mAreaPackage, p3.areaPackage, p4);
             ClientEvent$ClickEvent contentPacka = p3.contentPackage;
             if (contentPacka != null) {
                n.b(contentPacka, p2.mContentPackage, p4);
             }else if(!TextUtils.x(p3.contentWrapper) && !p2.mContentPackage.isEmpty()){
                n.c(p0, p1, p3.contentWrapper, p2.mContentPackage, p4);
             }
             n.d(p2.mInterStidContainer, p3.interStidContainer, p4);
             p4.c("urt_id", new g(Integer.valueOf(a.h)));
             int h = a.h;
             a.h = (h < 0x98967f)? h + i1: i;
             a tc = this.c;
             int h1 = a.h;
             if (!PatchProxy.isSupport(d.class) || (PatchProxy.applyVoidThreeRefs(tc, "urt_id", Integer.valueOf(h1), null, d.class, "2") || (tc != null && !TextUtils.x("urt_id")))) {
                SharedPreferences$Editor uEditor = b.c(tc, "log_store", 4).edit();
                uEditor.putInt("urt_id", h1);
                g.a(uEditor);
             }
          }else {
             goto label_006c ;
          }
       }catch(java.lang.Exception e10){
          Log.d(a.f, "exception buildUserRoute info:"+e10.getMessage());
       }
       return;
    }
    public Map b(){
       return this.a;
    }
    public void c(Context p0){
       GZIPInputStream gZIPInputStr;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a td = this.d;
       String str = "urt_whitelist";
       if (td != null && (td.a() != null && !this.d.a().isEmpty())) {
          this.a = this.d.a();
          d.d(p0, str, a.g.q(this.d.a()));
          if (this.a.containsKey("APP_GENERAL")) {
             this.b = this.a.remove("APP_GENERAL");
          }
       }else {
          String str1 = null;
          str = d.b(p0, str, str1);
          if (!TextUtils.x(str)) {
             this.a = a.g.i(str, new a$a(this).getType());
          }else {
             String str2 = "gzip_entry_tag_config.json";
             byte[] uobyteArray = PatchProxy.applyTwoRefs(p0, str2, str1, i.class, "1");
             if (uobyteArray != PatchProxyResult.class) {
             }else {
                AssetManager assets = p0.getAssets();
                try{
                   uobyteArray = 0;
                   InputStream inputStream = SplitAssetHelper.open(assets, str2);
                   try{
                      gZIPInputStr = new GZIPInputStream(inputStream);
                      ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                      byte[] uobyteArray1 = new byte[1024];
                      i = gZIPInputStr.read(uobyteArray1);
                      while (i >= 0) {
                         uByteArrayOu.write(uobyteArray1, uobyteArray, i);
                      }
                      gZIPInputStr.close();
                      uByteArrayOu.close();
                      uobyteArray = uByteArrayOu.toByteArray();
                      try{
                         gZIPInputStr.close();
                      }catch(java.io.IOException e9){
                         Log.e("GzipUtil", "IOException", e9);
                      }
                   }catch(java.io.IOException e9){
                      GZIPInputStream gZIPInputStr1 = gZIPInputStr;
                   }
                   z1.g("urt", e9.getMessage());
                   if (str1) {
                      try{
                         str1.close();
                      }catch(java.io.IOException e9){
                         Log.e("GzipUtil", "IOException", e9);
                      }
                   }
                }catch(java.io.IOException e9){
                   goto label_00c3 ;
                }
             }
          }
          a ta = this.a;
          if (ta != null && ta.containsKey("APP_GENERAL")) {
             this.b = this.a.remove("APP_GENERAL");
          }
       }
    label_0102 :
       this.e = true;
       return;
    }
}
