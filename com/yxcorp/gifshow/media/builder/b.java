package com.yxcorp.gifshow.media.builder.b;
import java.io.File;
import java.lang.Object;
import java.util.ArrayList;
import r6b.b;
import java.lang.String;
import com.yxcorp.gifshow.media.builder.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.media.builder.MP4Builder;
import java.lang.Integer;
import ykd.a;
import q87.c;
import java.util.Iterator;
import java.lang.StringBuilder;

public class b	// class@001cfe
{
    public b a;
    public final File b;
    public final List c;

    public void b(File p0){
       super();
       this.c = new ArrayList();
       this.b = p0;
       this.a = new b(p0, null);
    }
    public synchronized boolean a(b$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c.add(p0);
       b ta = this.a;
       if (ta != null) {
          ta.b(p0.a.clone(), p0.b, p0.c, p0.d, p0.e);
       }
       return true;
    }
    public synchronized boolean b(byte[] p0,int p1,int p2,int p3,int p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b$a uoa = new b$a();
       uoa.a = p0.clone();
       uoa.b = p1;
       uoa.c = p2;
       uoa.d = p3;
       uoa.e = p4;
       this.c.add(uoa);
       b ta = this.a;
       if (ta != null) {
          ta.b(p0, p1, p2, p3, p4);
       }
       return 1;
    }
    public synchronized void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("MultiSegmentAudioBuilder", "cancel", objArray);
       this.c.clear();
       b ta = this.a;
       if (ta != null) {
          ta.cancel();
       }
       this.a = null;
       return;
    }
    public synchronized void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "5")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().s("MultiSegmentAudioBuilder", "finish", objArray1);
       if (this.a == null) {
          this.b.delete();
          this.a = new b(this.b, objArray);
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             b$a uoa = iterator.next();
             this.a.b(uoa.a, uoa.b, uoa.c, uoa.d, uoa.e);
          }
       }
       this.a.a();
       if (this.b != null) {
          Object[] objArray2 = new Object[0];
          a.C().s("MultiSegmentAudioBuilder", "mFinalOutputFilePath: "+this.b.getAbsolutePath(), objArray2);
       }
       return;
    }
    public synchronized void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       if (p0 >= this.c.size() || p0 < 0) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("MultiSegmentAudioBuilder", "trim audio from "+p0, objArray);
       for (int i = this.c.size() - 1; i >= p0; i = i - 1) {
          this.c.remove(i);
       }
       b ta = this.a;
       if (ta != null) {
          ta.cancel();
          this.a = null;
       }
       return;
    }
}
