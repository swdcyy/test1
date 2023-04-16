package hp8.e;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.AssetManager;
import hp8.e$b;
import java.lang.Integer;
import hp8.e$a;
import android.graphics.Typeface;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import android.content.Context;
import iq8.q;
import hp8.d;
import java.util.Map;
import java.util.HashMap;

public class e	// class@0025cc
{
    public ConcurrentHashMap a;
    public Map b;
    public boolean c;
    public static final String[] d;
    public static final String[] e;
    public static e f;

    static {
       String[] stringArray = new String[]{"","_bold","_italic","_bold_italic"};
       e.d = stringArray;
       stringArray = new String[]{".ttf",".otf"};
       e.e = stringArray;
    }
    public void e(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static e c(){
       Object obj = PatchProxy.apply(null, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.f == null) {
          e.f = new e();
       }
       return e.f;
    }
    public final e$b a(String p0,int p1,AssetManager p2,String p3){
       e$b obj;
       Typeface typeface;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, e.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new e$b(null);
       Object obj1 = PatchProxy.applyThreeRefs(p0, p2, p3, null, e.class, "9");
       if (obj1 != patchProxyRe) {
          typeface = obj1;
       }else {
          String str = "fonts/"+p0;
          try{
             typeface = Typeface.createFromAsset(p2, str);
          }catch(java.lang.RuntimeException e0){
             typeface = Typeface.createFromAsset(p2, p0);
          }
       }
    }
    public Typeface b(String p0,int p1){
       String obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.c != null) {
          this.a.putAll(this.b);
          this.b.clear();
          this.c = false;
       }
       obj = ".ttf";
       if (p0.endsWith(obj) || p0.endsWith(".otf")) {
          Typeface typeface = this.e(p0, p1);
          if (typeface != null) {
             return typeface;
          }
       }
       Typeface typeface1 = this.e(p0+obj, p1);
       if (typeface1 != null) {
          return typeface1;
       }else {
          return this.e(p0+".otf", p1);
       }
    }
    public Typeface d(String p0,int p1,AssetManager p2,String p3){
       e$b obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, e.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.c != null) {
          this.a.putAll(this.b);
          this.b.clear();
          this.c = false;
       }
       obj = this.a.get(p0);
       if (obj == null) {
          obj = this.a(p0, p1, p2, p3);
          this.a.put(p0, obj);
       }
       return obj.a(p1);
    }
    public final Typeface e(String p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e$b uob = this.a.get(p0);
       if (uob != null) {
          return uob.a(p1);
       }else {
          return null;
       }
    }
    public final Typeface f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = d.a(q.a(), p0);
       if (uFile.exists()) {
          return Typeface.createFromFile(uFile.getAbsoluteFile());
       }
       return null;
    }
    public Typeface g(String p0,int p1){
       e$b obj;
       Typeface typeface;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new e$b(null);
       String str = ".ttf";
       if (!p0.endsWith(str)) {
          String str1 = ".otf";
          if (p0.endsWith(str1)) {
          label_0059 :
             typeface = this.f(p0);
             str = p0;
          }else {
             str = p0+str;
             typeface = this.f(str);
             if (typeface == null) {
                str = p0+str1;
                typeface = this.f(str);
             }
          }
       }else {
          goto label_0059 ;
       }
       if (typeface == null) {
          obj.b(true);
          typeface = Typeface.create(p0, p1);
       }
       if (typeface != null) {
          obj.c(p1, typeface);
          this.a.put(str, obj);
       }
       return typeface;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          return;
       }
       if (this.b == null) {
          this.b = new HashMap();
       }
       this.b.put("alte-din.ttf", this.a("alte-din.ttf", -1, q.a().getAssets(), objArray));
       this.b.put("AvenirNext-BoldItalic.ttf", this.a("AvenirNext-BoldItalic.ttf", -1, q.a().getAssets(), objArray));
       this.c = true;
       return;
    }
}
