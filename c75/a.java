package c75.a;
import c75.d;
import e75.b;
import android.content.Context;
import android.content.ContentValues;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.ArrayList;
import g75.c;
import android.database.sqlite.SQLiteDatabase;
import c75.b;
import c75.e;
import java.lang.StringBuilder;
import java.lang.Integer;
import h75.i;
import f75.a;
import org.greenrobot.eventbus.a;
import java.util.List;
import java.util.Iterator;

public abstract class a extends d	// class@000423
{

    public void a(b p0,Context p1){
       super(p0, p1);
    }
    public int j(ContentValues[] p0,boolean p1){
       int i2;
       Object[] objArray;
       a uoa1;
       long l;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (p0 != null && p0.length > 0) {
          ArrayList uArrayList = new ArrayList(p0.length);
          String str = this.n().e().g();
          this.n().j();
          SQLiteDatabase sQLiteDataba = this.p();
          try{
             sQLiteDataba.beginTransaction();
             int len = p0.length;
             int i1 = 0;
             i2 = 0;
             while (i1 < len) {
                object oobject = p0[i1];
                String str1 = null;
                int i3 = 0;
                try{
                   l = sQLiteDataba.insertWithOnConflict(str, str1, oobject, this.t());
                }catch(android.database.SQLException e0){
                   l = i3;
                }
                if (l - i3 > 0) {
                   i2 = i2 + 1;
                   uArrayList.add(this.l(oobject));
                }
                i1 = i1 + 1;
             }
             sQLiteDataba.setTransactionSuccessful();
          }catch(java.lang.Exception e0){
             i2 = 0;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public int s(ContentValues p0,String p1,String[] p2,boolean p3){
       List obj;
       Iterator this;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       if (p3) {
          obj = this.h(p1, p2, null, null, null, null);
          if (obj != null) {
             this = obj.iterator();
             while (this.hasNext()) {
                this.next().updateByContentValues(p0);
             }
          }
       }
       String str = this.a.e().g();
       this.a.j();
       int i = this.p().updateWithOnConflict(str, p0, p1, p2, this.t());
       if (e.a()) {
          Object[] objArray = new Object[]{Integer.valueOf(i)};
          i.a(str+String.format(", update %s data", objArray));
       }
       this.a.l();
       if (i > 0 && p3) {
          a uoa = new a(str, this.a.c());
          uoa.a(2, obj);
          a.d().k(uoa);
       }
       return i;
    }
    public int t(){
       return 5;
    }
}
