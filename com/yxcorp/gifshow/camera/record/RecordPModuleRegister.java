package com.yxcorp.gifshow.camera.record.RecordPModuleRegister;
import tj7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import j8c.c;
import z1.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Collection;
import java.lang.StringBuilder;
import java.util.Iterator;

public class RecordPModuleRegister extends a	// class@001c94
{
    public static final RecordPModuleRegister b;
    public static boolean c;

    static {
       RecordPModuleRegister.b = new RecordPModuleRegister();
       RecordPModuleRegister.c = false;
    }
    public void RecordPModuleRegister(){
       super();
    }
    public static RecordPModuleRegister f(){
       return RecordPModuleRegister.b;
    }
    public synchronized void a(){
       if (PatchProxy.applyVoid(null, this, RecordPModuleRegister.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordPModuleRegister", "init", objArray);
       if (!RecordPModuleRegister.c) {
          c uoc = new c(this);
          RecordPModuleRegister.c = true;
       }
       return;
    }
    public void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecordPModuleRegister.class, "4")) {
          return;
       }
       this.a();
       RecordPModuleRegister$a uoa = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uoa == PatchProxyResult.class) {
          uoa = this.a.get(p0);
       }
       if (uoa != null) {
          p1.accept(uoa);
       }
       return;
    }
    public synchronized void d(){
       if (PatchProxy.applyVoid(null, this, RecordPModuleRegister.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("RecordPModuleRegister", "clear", objArray);
       this.a.clear();
       RecordPModuleRegister.c = false;
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordPModuleRegister.class, "3")) {
          return;
       }
       this.a();
       Object[] objArray = new Object[0];
       a.D().s("RecordPModuleRegister", "foreach size="+this.a.size(), objArray);
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          p0.accept(iterator.next());
       }
       return;
    }
    public boolean g(){
       return RecordPModuleRegister.c;
    }
}
