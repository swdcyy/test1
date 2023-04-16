package br.c;
import br.b;
import androidx.room.RoomDatabase;
import java.lang.Object;
import br.c$a;
import br.c$b;
import br.c$c;
import br.c$d;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import v2.p;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import v2.o0;
import a3.e;
import android.database.Cursor;
import v2.q;
import com.kuaishou.android.vader.Channel;
import java.lang.Integer;
import tq.b;
import java.util.ArrayList;
import com.kuaishou.android.vader.persistent.LogRecord;
import java.lang.Long;
import a3.f;
import v2.q0;
import a3.d;

public class c implements b	// class@000334
{
    public final RoomDatabase a;
    public final q b;
    public final p c;
    public final q0 d;
    public final q0 e;

    public void c(RoomDatabase p0){
       super();
       this.a = p0;
       this.b = new c$a(this, p0);
       this.c = new c$b(this, p0);
       this.d = new c$c(this, p0);
       this.e = new c$d(this, p0);
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.a.e();
       this.c.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public int b(){
       o0 obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       obj = o0.b("SELECT count\(*\) from LogRecord", i);
       Cursor uCursor = this.a.A(obj);
       if (uCursor.moveToFirst()) {
          i = uCursor.getInt(i);
       }
       uCursor.close();
       obj.release();
       return i;
    }
    public int c(){
       o0 obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       obj = o0.b("SELECT max\(seqId\) FROM LogRecord", i);
       Cursor uCursor = this.a.A(obj);
       if (uCursor.moveToFirst()) {
          i = uCursor.getInt(i);
       }
       uCursor.close();
       obj.release();
       return i;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.a.e();
       this.b.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public List e(Channel p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, c.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       o0 oo0 = o0.b("SELECT * FROM LogRecord WHERE channelType = ? AND channelSeqId >= ? AND channelSeqId < ? LIMIT ?", 4);
       oo0.bindLong(1, (long)b.b(p0));
       oo0.bindLong(2, (long)p1);
       oo0.bindLong(3, (long)p2);
       oo0.bindLong(4, (long)p3);
       Cursor uCursor = this.a.A(oo0);
       int columnIndexO = uCursor.getColumnIndexOrThrow("seqId");
       int columnIndexO1 = uCursor.getColumnIndexOrThrow("channelType");
       int columnIndexO2 = uCursor.getColumnIndexOrThrow("channelSeqId");
       int columnIndexO3 = uCursor.getColumnIndexOrThrow("customType");
       int columnIndexO4 = uCursor.getColumnIndexOrThrow("customSeqId");
       int columnIndexO5 = uCursor.getColumnIndexOrThrow("clientTimestamp");
       int columnIndexO6 = uCursor.getColumnIndexOrThrow("payload");
       int columnIndexO7 = uCursor.getColumnIndexOrThrow("compressAlgorithm");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          LogRecord logRecord = new LogRecord(uCursor.getInt(columnIndexO), b.a(uCursor.getInt(columnIndexO1)), uCursor.getInt(columnIndexO2), uCursor.getString(columnIndexO3), uCursor.getInt(columnIndexO4), uCursor.getLong(columnIndexO5), uCursor.getBlob(columnIndexO6), uCursor.getInt(columnIndexO7));
          uArrayList.add(v12);
       }
       uCursor.close();
       oo0.release();
       return uArrayList;
    }
    public int f(String p0){
       o0 obj = PatchProxy.applyOneRefs(p0, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       obj = o0.b("SELECT max\(customType\) FROM LogRecord WHERE customType = ?", i);
       if (p0 == null) {
          obj.bindNull(i);
       }else {
          obj.bindString(i, p0);
       }
       Cursor uCursor = this.a.A(obj);
       int i1 = 0;
       if (uCursor.moveToFirst()) {
          i1 = uCursor.getInt(i1);
       }
       uCursor.close();
       obj.release();
       return i1;
    }
    public int g(Channel p0){
       o0 obj = PatchProxy.applyOneRefs(p0, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = o0.b("SELECT max\(channelSeqId\) FROM LogRecord WHERE channelType = ?", 1);
       obj.bindLong(1, (long)b.b(p0));
       Cursor uCursor = this.a.A(obj);
       int i = 0;
       if (uCursor.moveToFirst()) {
          i = uCursor.getInt(i);
       }
       uCursor.close();
       obj.release();
       return i;
    }
    public List getAll(){
       Object obj = this;
       Object obj1 = PatchProxy.apply(null, obj, c.class, "11");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       o0 oo0 = o0.b("SELECT * FROM LogRecord", 0);
       Cursor uCursor = obj.a.A(oo0);
       int columnIndexO = uCursor.getColumnIndexOrThrow("seqId");
       int columnIndexO1 = uCursor.getColumnIndexOrThrow("channelType");
       int columnIndexO2 = uCursor.getColumnIndexOrThrow("channelSeqId");
       int columnIndexO3 = uCursor.getColumnIndexOrThrow("customType");
       int columnIndexO4 = uCursor.getColumnIndexOrThrow("customSeqId");
       int columnIndexO5 = uCursor.getColumnIndexOrThrow("clientTimestamp");
       int columnIndexO6 = uCursor.getColumnIndexOrThrow("payload");
       int columnIndexO7 = uCursor.getColumnIndexOrThrow("compressAlgorithm");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          LogRecord logRecord = new LogRecord(uCursor.getInt(columnIndexO), b.a(uCursor.getInt(columnIndexO1)), uCursor.getInt(columnIndexO2), uCursor.getString(columnIndexO3), uCursor.getInt(columnIndexO4), uCursor.getLong(columnIndexO5), uCursor.getBlob(columnIndexO6), uCursor.getInt(columnIndexO7));
          uArrayList.add(v12);
       }
       uCursor.close();
       oo0.release();
       return uArrayList;
    }
    public int h(long p0){
       f obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.d.a();
       this.a.e();
       obj.bindLong(1, p0);
       this.a.C();
       this.a.k();
       this.d.f(obj);
       return obj.executeUpdateDelete();
    }
    public void i(LogRecord p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.a.e();
       this.b.i(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public int j(){
       o0 obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       obj = o0.b("SELECT max\(seqId\) from LogRecord", i);
       Cursor uCursor = this.a.A(obj);
       if (uCursor.moveToFirst()) {
          i = uCursor.getInt(i);
       }
       uCursor.close();
       obj.release();
       return i;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       f uof = this.e.a();
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.e.f(uof);
       return;
    }
    public List l(int p0){
       Object obj = this;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoc, "12");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       o0 oo0 = o0.b("SELECT * FROM LogRecord LIMIT ?", 1);
       oo0.bindLong(1, (long)p0);
       Cursor uCursor = obj.a.A(oo0);
       int columnIndexO = uCursor.getColumnIndexOrThrow("seqId");
       int columnIndexO1 = uCursor.getColumnIndexOrThrow("channelType");
       int columnIndexO2 = uCursor.getColumnIndexOrThrow("channelSeqId");
       int columnIndexO3 = uCursor.getColumnIndexOrThrow("customType");
       int columnIndexO4 = uCursor.getColumnIndexOrThrow("customSeqId");
       int columnIndexO5 = uCursor.getColumnIndexOrThrow("clientTimestamp");
       int columnIndexO6 = uCursor.getColumnIndexOrThrow("payload");
       int columnIndexO7 = uCursor.getColumnIndexOrThrow("compressAlgorithm");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          LogRecord logRecord = new LogRecord(uCursor.getInt(columnIndexO), b.a(uCursor.getInt(columnIndexO1)), uCursor.getInt(columnIndexO2), uCursor.getString(columnIndexO3), uCursor.getInt(columnIndexO4), uCursor.getLong(columnIndexO5), uCursor.getBlob(columnIndexO6), uCursor.getInt(columnIndexO7));
          uArrayList.add(v12);
       }
       uCursor.close();
       oo0.release();
       return uArrayList;
    }
    public long m(){
       o0 obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = o0.b("SELECT min\(clientTimestamp\) from LogRecord", 0);
       Cursor uCursor = this.a.A(obj);
       long longx = (uCursor.moveToFirst())? uCursor.getLong(0): 0;
       uCursor.close();
       obj.release();
       return longx;
    }
    public int n(){
       o0 obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       obj = o0.b("SELECT min\(seqId\) from LogRecord", i);
       Cursor uCursor = this.a.A(obj);
       if (uCursor.moveToFirst()) {
          i = uCursor.getInt(i);
       }
       uCursor.close();
       obj.release();
       return i;
    }
    public void o(LogRecord p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.a.e();
       this.c.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
}
