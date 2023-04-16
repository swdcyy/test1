package eca.g;
import mn9.a;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Collection;

public final class g implements a	// class@00210c
{
    public final ArrayList a;
    public int b;
    public final VideoTemplate c;
    public final int d;
    public final String e;
    public final String f;

    public void g(VideoTemplate p0,int p1,String p2,String p3){
       a.p(p0, "template");
       a.p(p2, "groupId");
       a.p(p3, "groupName");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = new ArrayList();
       this.b = -1;
    }
    public void g(VideoTemplate p0,int p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = 0;
       }
       p3 = "";
       p2 = (p4 & 0x04)? p3: null;
       if (!(p4 & 0x08)) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static int m(g p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       return p0.l(p1);
    }
    public boolean a(){
       return true;
    }
    public final VideoTemplate b(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          if (obj == 2) {
             obj = this.b;
             if (obj >= null && obj < this.a.size()) {
                objArray = this.a.get(this.b);
             }
          }
       }else {
          objArray = this.c;
       }
       return objArray;
    }
    public final String c(){
       return this.e;
    }
    public boolean d(){
       boolean b = true;
       if (this.d != b) {
       }else {
          b = false;
       }
       return b;
    }
    public final String e(){
       return this.f;
    }
    public final VideoTemplate f(){
       return this.c;
    }
    public final boolean g(){
       boolean b = (this.d == 2)? true: false;
       return b;
    }
    public String getId(){
       String id;
       g obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != 1) {
          id = (obj != 2)? this.c.getId(): "-2";
       }else {
          id = UUID.randomUUID().toString();
          a.o(id, "UUID.randomUUID\(\).toString\(\)");
       }
       return id;
    }
    public int h(){
       return this.d;
    }
    public boolean i(){
       return false;
    }
    public final boolean j(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public final void k(int p0){
       this.b = p0;
    }
    public final int l(boolean p0){
       int i1;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, og, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       og = this.a;
       int i = 0;
       og = (og == null || og.isEmpty())? 1: null;
       if (og) {
          return -1;
       }else {
          og = this.b;
          if (og < null) {
             return i;
          }else if(p0){
             if (og == null) {
                i1 = this.a.size() - 1;
                this.b = i1;
             }else {
                this.b = og - 1;
             }
             return i1;
          }else if(og == (this.a.size() - 1)){
             this.b = i;
          }else {
             i = this.b;
             this.b = i + 1;
          }
          return i;
       }
    }
}
