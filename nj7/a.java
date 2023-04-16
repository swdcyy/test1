package nj7.a;
import nj7.e;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import com.kwai.plugin.dva.repository.model.PluginConfig;
import java.util.HashMap;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.Set;

public class a implements e	// class@001f4c
{
    public final e a;
    public List b;
    public boolean c;

    public void a(e p0){
       super();
       this.c = false;
       this.a = p0;
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a();
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l();
       return new ArrayList(this.b);
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       this.l();
       a tb = this.b;
       _monitor_enter(tb);
       HashSet hashSet = new HashSet(p0);
       int i = this.b.size();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          if (hashSet.contains(this.b.get(i1).name)) {
             this.b.remove(i1);
             i = this.b.size();
             i2 = 1;
          }else {
             i1 = i1 + 1;
          }
       }
       _monitor_exit(tb);
       if (i2) {
          this.a.c(p0);
       }
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       this.l();
       a tb = this.b;
       _monitor_enter(tb);
       a uoa = null;
       int i = 0;
       while (i < this.b.size()) {
          if (p0.equals(this.b.get(i).name)) {
             this.b.remove(i);
             uoa = 1;
             break ;
          }else {
             i = i + 1;
          }
       }
       _monitor_exit(tb);
       if (uoa != null) {
          this.a.d(p0);
       }
       return;
    }
    public void e(PluginConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.l();
       a tb = this.b;
       _monitor_enter(tb);
       int i = this.b.size();
       int i1 = 0;
       int i2 = 0;
       int i3 = 1;
       while (i2 < i) {
          if ((p0.name).equals(this.b.get(i2).name)) {
             this.b.set(i2, p0);
             i1 = 1;
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       if (i2 == this.b.size()) {
          this.b.add(p0);
       }else {
          i3 = i1;
       }
       _monitor_exit(tb);
       if (i3) {
          this.a.e(p0);
       }
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       this.l();
       a tb = this.b;
       _monitor_enter(tb);
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          PluginConfig pluginConfig = iterator.next();
          hashMap.put(pluginConfig.name, pluginConfig);
       }
       int i = this.b.size();
       int i1 = 0;
       a uoa = null;
       while (i1 < i) {
          PluginConfig pluginConfig1 = this.b.get(i1);
          if (hashMap.containsKey(pluginConfig1.name)) {
             this.b.set(i1, hashMap.get(pluginConfig1.name));
             hashMap.remove(pluginConfig1.name);
             uoa = 1;
          }
          i1 = i1 + 1;
       }
       if (hashMap.values().size()) {
          uoa = 1;
       }
       this.b.addAll(hashMap.values());
       _monitor_exit(tb);
       if (uoa != null) {
          this.a.f(p0);
       }
       return;
    }
    public PluginConfig g(String p0){
       PluginConfig pluginConfig;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l();
       obj = this.b;
       _monitor_enter(obj);
       Iterator iterator = this.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             pluginConfig = iterator.next();
             if (p0.equals(pluginConfig.name)) {
                break ;
             }
          }else {
             _monitor_exit(obj);
             return null;
          }
       }
       _monitor_exit(obj);
       return pluginConfig;
    }
    public PluginInfo h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.h(p0);
    }
    public Set i(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l();
       return this.a.i();
    }
    public void j(PluginInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.a.j(p0);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.b = this.a.b();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.c == null) {
          _monitor_enter(this);
          if (this.c == null) {
             this.k();
             this.c = true;
          }
          _monitor_exit(this);
       }
       return;
    }
}
