package nh9.f;
import com.yxcorp.gifshow.camerasdk.j$r;
import java.util.HashMap;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.o;
import nh9.f$a;
import nh9.f$b;
import nh9.d;
import nh9.f$c;
import com.kwai.video.westeros.Westeros$OnWesterosEventListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.kwai.camerasdk.face.FaceDetectorContext$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import x8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import k2b.u1;
import java.lang.Throwable;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import boc.b;
import com.yxcorp.gifshow.util.resource.MagicModel;
import nh9.e;
import java.lang.Runnable;
import t45.c;

public class f implements j$r	// class@00318b
{
    public Set a;
    public final Set b;
    public final Westeros$OnWesterosEventListener c;
    public final FaceDetectorContext$b d;
    public final FaceMagicController$FaceMagicLoadEffectFailedListener e;
    public static final Map f;

    static {
       f.f = new HashMap();
       Category[] uCategoryArr = Category.values();
       int len = uCategoryArr.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uCategoryArr[i];
          f.f.put(oobject.getResourceName(), oobject);
       }
    }
    public void f(){
       super();
       this.a = o.g();
       this.b = o.g();
       this.c = new f$a(this);
       this.d = new f$b(this);
       this.e = d.b;
    }
    public void f(f$a p0){
       super();
       this.a = o.g();
       this.b = o.g();
       this.c = new f$a(this);
       this.d = new f$b(this);
       this.e = d.b;
    }
    public static f e(){
       return f$c.a;
    }
    public Westeros$OnWesterosEventListener a(){
       return this.c;
    }
    public FaceMagicController$FaceMagicLoadEffectFailedListener b(){
       return this.e;
    }
    public FaceDetectorContext$b c(){
       return this.d;
    }
    public void d(String p0){
       ArrayList uArrayList;
       JSONArray jSONArray;
       String str3;
       String str = "missing_models";
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       if (this.a.contains(p0)) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("ResourceRestoreHelper", "checkAndDownload missingStr "+p0, objArray);
       this.a.add(p0);
       try{
          uArrayList = new ArrayList();
          jSONArray = new JSONObject(p0).getJSONArray(str);
          int i1 = 0;
          while (i1 < jSONArray.length()) {
             str3 = jSONArray.optString(i1);
             if (!this.a.contains(str3)) {
                uArrayList.add(str3);
                this.a.add(str3);
             }
             i1 = i1 + 1;
          }
       }catch(org.json.JSONException e3){
          Object[] objArray1 = new Object[i];
          a.D().A("ResourceRestoreHelper", e3.getMessage(), objArray1);
       }
       String str1 = "missing_models_ext";
       if (!PatchProxy.applyVoidOneRefs(p0, this, uof, "3") && MagicEmojiResourceHelper.n()) {
          JSONObject jSONObject = new JSONObject(p0);
          boolean b = jSONObject.has(str1);
          JSONArray jSONArray1 = (b)? jSONObject.optJSONArray(str1): jSONObject.optJSONArray(str);
          if (jSONArray1 != null) {
             jSONArray = new JSONArray();
             while (i < jSONArray1.length()) {
                jSONObject = new JSONObject();
                str3 = (b)? jSONArray1.getJSONObject(i).get("name").toString(): jSONArray1.optString(i);
                String str4 = (b)? jSONArray1.getJSONObject(i).get("files").toString(): "";
                if (!this.b.contains(str3)) {
                   this.b.add(str3);
                   jSONObject.put("modelName", str3);
                   jSONObject.put("extFile", str4);
                   jSONArray.put(jSONObject);
                }
                i = i + 1;
             }
             if (jSONArray.length()) {
                u1.R("MODEL_MISSING", new JSONObject().put("missingModels", jSONArray).toString(), 2);
             }
          }
       }
    label_011c :
       if (!q.f(uArrayList) && (!PatchProxy.applyVoidOneRefs(uArrayList, this, uof, "4") && !q.f(uArrayList))) {
          ArrayList uArrayList1 = PatchProxy.applyOneRefs(uArrayList, this, uof, "5");
          if (uArrayList1 != PatchProxyResult.class) {
          }else {
             uArrayList1 = new ArrayList();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                String str2 = iterator.next();
                b uob = f.f.get(str2);
                if (uob != null) {
                   uArrayList1.add(uob);
                }else {
                   MagicModel magicModel = MagicEmojiResourceHelper.i(str2);
                   if (magicModel != null) {
                      uArrayList1.add(magicModel);
                   }
                }
             }
          }
          if (!q.f(uArrayList1)) {
             c.a(new e(uArrayList1));
          }
       }
    label_017b :
       return;
    }
}
