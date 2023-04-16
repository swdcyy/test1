package com.kwai.feature.component.entry.tk.SearchEntryTkManager;
import java.lang.Object;
import com.kwai.feature.component.entry.tk.SearchEntryTkManager$a;
import com.kwai.feature.component.entry.tk.SearchEntryTkManager$ViewType;
import sx4.e$a;
import tx4.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rx4.a;
import android.app.Activity;
import rx4.b;
import android.view.ViewGroup;
import iy5.d;
import java.lang.StringBuilder;
import q87.c;
import tx4.h;
import sx4.e;
import tx4.w;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import j06.e;

public class SearchEntryTkManager	// class@001211
{
    public final String a;
    public String b;
    public a c;
    public e d;
    public e$a e;
    public o f;

    public void SearchEntryTkManager(){
       super();
       this.a = "search_entry";
       this.f = new SearchEntryTkManager$a(this);
    }
    public void a(SearchEntryTkManager$ViewType p0,e$a p1,o p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SearchEntryTkManager.class, "2")) {
          return;
       }
       this.b = p0.getValue();
       this.e = p1;
       if (p2 != null) {
          this.f = p2;
       }
       SearchEntryTkManager tc = this.c;
       if (tc != null) {
          Object[] objArray = new Object[0];
          tc.n(5000, p1, this.f, p0.getValue(), objArray);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SearchEntryTkManager.class, "7")) {
          return;
       }
       SearchEntryTkManager tc = this.c;
       if (tc != null) {
          tc.onPause();
          if (!this.c.isDestroyed()) {
             this.c.onDestroy();
          }
       }
       this.d = null;
       this.e = null;
       return;
    }
    public void c(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEntryTkManager.class, "1")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       b uob = new b(p0, null, "SearchEntry", "Search");
       uob.g(true);
       a uoa = uob.b();
       this.c = uoa;
       uoa.y(false);
       return;
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchEntryTkManager.class, "6")) {
          return;
       }
       SearchEntryTkManager td = this.d;
       if (td == null) {
          Object[] objArray = new Object[0];
          d.C().w("SearchEntryTkManager", "ITKViewContainer is null "+p0, objArray);
          return;
       }else {
          td.b(p0, p1, null);
          return;
       }
    }
    public void e(String p0,String p1,w p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SearchEntryTkManager.class, "8")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       JsonObject jsonObject1 = new JsonObject();
       JsonObject jsonObject2 = new JsonObject();
       if (p2 != null) {
          jsonObject2.a0("bundle_version_code", Integer.valueOf(p2.d));
          jsonObject2.c0("bundle_id", p2.b);
       }
       jsonObject1.G(p1, jsonObject2);
       jsonObject.G("bundle_info_list", jsonObject1);
       e.b("search_entry", "warning", p0, null, jsonObject, true);
       return;
    }
    public void f(e p0){
       this.d = p0;
    }
}
