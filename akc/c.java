package akc.c;
import akc.b;
import androidx.room.RoomDatabase;
import java.lang.Object;
import akc.c$a;
import akc.c$b;
import akc.c$c;
import akc.c$d;
import akc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v2.p;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import v2.o0;
import a3.e;
import android.os.CancellationSignal;
import android.database.Cursor;
import x2.c;
import x2.b;
import java.util.ArrayList;
import a3.f;
import v2.q0;
import a3.d;
import java.lang.Number;
import v2.q;
import java.util.Collection;

public final class c implements b	// class@000150
{
    public final RoomDatabase a;
    public final q b;
    public final p c;
    public final p d;
    public final q0 e;

    public void c(RoomDatabase p0){
       super();
       this.a = p0;
       this.b = new c$a(this, p0);
       this.c = new c$b(this, p0);
       this.d = new c$c(this, p0);
       this.e = new c$d(this, p0);
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.d.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public List b(String p0){
       ArrayList obj = this;
       Object obj1 = p0;
       o0 obj2 = PatchProxy.applyOneRefs(obj1, obj, c.class, "8");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = 1;
       obj2 = o0.b("SELECT * FROM FolUserSearch WHERE source_user_id = ? ORDER BY id DESC", i);
       if (obj1 == null) {
          obj2.bindNull(i);
       }else {
          obj2.bindString(i, obj1);
       }
       obj.a.d();
       Cursor uCursor = c.b(obj.a, obj2, false, null);
       int i1 = b.e(uCursor, "id");
       int i2 = b.e(uCursor, "user_id");
       int i3 = b.e(uCursor, "source_user_id");
       int i4 = b.e(uCursor, "user_name");
       int i5 = b.e(uCursor, "pinyin");
       int i6 = b.e(uCursor, "remark_name");
       int i7 = b.e(uCursor, "remark_pinyin");
       int i8 = b.e(uCursor, "gender");
       int i9 = b.e(uCursor, "is_friend");
       int i10 = b.e(uCursor, "raw");
       int i11 = b.e(uCursor, "pinyin_start");
       int i12 = b.e(uCursor, "remark_pinyin_start");
       int i13 = b.e(uCursor, "insert_time");
       o0 oo0 = obj2;
       obj = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          a uoa = new a(uCursor.getLong(i1), uCursor.getString(i2), uCursor.getString(i3), uCursor.getString(i4), uCursor.getString(i5), uCursor.getString(i6), uCursor.getString(i7), uCursor.getString(i8), uCursor.getInt(i9), uCursor.getString(i10), uCursor.getString(i11), uCursor.getString(i12), uCursor.getLong(i13));
          obj.add(obj2);
       }
       uCursor.close();
       oo0.release();
       return obj;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       this.a.d();
       f uof = this.e.a();
       if (p0 == null) {
          uof.bindNull(1);
       }else {
          uof.bindString(1, p0);
       }
       this.a.e();
       uof.executeUpdateDelete();
       this.a.C();
       this.a.k();
       this.e.f(uof);
       return;
    }
    public a d(String p0,String p1){
       Object obj = this;
       Object obj1 = p0;
       Cursor obj2 = p1;
       o0 obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, c.class, "7");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       int i = 2;
       obj3 = o0.b("SELECT * FROM FolUserSearch WHERE source_user_id = ? AND user_id = ?", i);
       int i1 = 1;
       if (obj1 == null) {
          obj3.bindNull(i1);
       }else {
          obj3.bindString(i1, obj1);
       }
       if (obj2 == null) {
          obj3.bindNull(i);
       }else {
          obj3.bindString(i, obj2);
       }
       obj.a.d();
       obj2 = c.b(obj.a, obj3, false, null);
       int i2 = b.e(obj2, "id");
       i1 = b.e(obj2, "user_id");
       int i3 = b.e(obj2, "source_user_id");
       int i4 = b.e(obj2, "user_name");
       int i5 = b.e(obj2, "pinyin");
       int i6 = b.e(obj2, "remark_name");
       int i7 = b.e(obj2, "remark_pinyin");
       int i8 = b.e(obj2, "gender");
       int i9 = b.e(obj2, "is_friend");
       int i10 = b.e(obj2, "raw");
       int i11 = b.e(obj2, "pinyin_start");
       int i12 = b.e(obj2, "remark_pinyin_start");
       i = b.e(obj2, "insert_time");
       if (obj2.moveToFirst()) {
          a uoa = new a(obj2.getLong(i2), obj2.getString(i1), obj2.getString(i3), obj2.getString(i4), obj2.getString(i5), obj2.getString(i6), obj2.getString(i7), obj2.getString(i8), obj2.getInt(i9), obj2.getString(i10), obj2.getString(i11), obj2.getString(i12), obj2.getLong(i));
       }else {
          a uoa1 = null;
       }
       obj2.close();
       obj3.release();
       return i;
    }
    public long e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       this.a.d();
       this.a.e();
       this.a.C();
       this.a.k();
       return this.b.j(p0);
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.a.d();
       this.a.e();
       this.c.h(p0);
       this.a.C();
       this.a.k();
       return;
    }
    public List g(String p0,String p1){
       ArrayList obj = this;
       Object obj1 = p0;
       Cursor obj2 = p1;
       o0 obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, c.class, "6");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       int i = 7;
       obj3 = o0.b("SELECT * FROM FolUserSearch WHERE source_user_id = ? AND \(user_name like ? OR pinyin like ? OR remark_name like ? OR remark_pinyin like ? OR pinyin_start like ? OR remark_pinyin_start like ?\) ORDER BY insert_time DESC", i);
       int i1 = 1;
       if (obj1 == null) {
          obj3.bindNull(i1);
       }else {
          obj3.bindString(i1, obj1);
       }
       int i2 = 2;
       if (obj2 == null) {
          obj3.bindNull(i2);
       }else {
          obj3.bindString(i2, obj2);
       }
       i2 = 3;
       if (obj2 == null) {
          obj3.bindNull(i2);
       }else {
          obj3.bindString(i2, obj2);
       }
       i2 = 4;
       if (obj2 == null) {
          obj3.bindNull(i2);
       }else {
          obj3.bindString(i2, obj2);
       }
       i2 = 5;
       if (obj2 == null) {
          obj3.bindNull(i2);
       }else {
          obj3.bindString(i2, obj2);
       }
       i2 = 6;
       if (obj2 == null) {
          obj3.bindNull(i2);
       }else {
          obj3.bindString(i2, obj2);
       }
       if (obj2 == null) {
          obj3.bindNull(i);
       }else {
          obj3.bindString(i, obj2);
       }
       obj.a.d();
       obj2 = c.b(obj.a, obj3, false, null);
       i2 = b.e(obj2, "id");
       i = b.e(obj2, "user_id");
       i1 = b.e(obj2, "source_user_id");
       int i3 = b.e(obj2, "user_name");
       int i4 = b.e(obj2, "pinyin");
       int i5 = b.e(obj2, "remark_name");
       int i6 = b.e(obj2, "remark_pinyin");
       int i7 = b.e(obj2, "gender");
       int i8 = b.e(obj2, "is_friend");
       int i9 = b.e(obj2, "raw");
       int i10 = b.e(obj2, "pinyin_start");
       int i11 = b.e(obj2, "remark_pinyin_start");
       int i12 = b.e(obj2, "insert_time");
       o0 oo0 = obj3;
       obj = new ArrayList(obj2.getCount());
       while (obj2.moveToNext()) {
          a uoa = new a(obj2.getLong(i2), obj2.getString(i), obj2.getString(i1), obj2.getString(i3), obj2.getString(i4), obj2.getString(i5), obj2.getString(i6), obj2.getString(i7), obj2.getInt(i8), obj2.getString(i9), obj2.getString(i10), obj2.getString(i11), obj2.getLong(i12));
          obj.add(obj3);
       }
       obj2.close();
       oo0.release();
       return obj;
    }
    public List h(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.d();
       this.a.e();
       this.a.C();
       this.a.k();
       return this.b.l(p0);
    }
}
