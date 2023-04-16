package akc.c$c;
import v2.p;
import akc.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import akc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;

public class c$c extends p	// class@00014e
{
    public final c d;

    public void c$c(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "UPDATE OR REPLACE `FolUserSearch` SET `id` = ?,`user_id` = ?,`source_user_id` = ?,`user_name` = ?,`pinyin` = ?,`remark_name` = ?,`remark_pinyin` = ?,`gender` = ?,`is_friend` = ?,`raw` = ?,`pinyin_start` = ?,`remark_pinyin_start` = ?,`insert_time` = ? WHERE `id` = ?";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$c.class, "1")) {
       }else {
          p0.bindLong(1, p1.b());
          int i = 2;
          if (p1.l() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.l());
          }
          i = 3;
          if (p1.j() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.j());
          }
          i = 4;
          if (p1.c() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.c());
          }
          i = 5;
          if (p1.d() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.d());
          }
          i = 6;
          if (p1.g() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.g());
          }
          i = 7;
          if (p1.h() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.h());
          }
          i = 8;
          if (p1.a() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.a());
          }
          p0.bindLong(9, (long)p1.m());
          i = 10;
          if (p1.f() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.f());
          }
          i = 11;
          if (p1.e() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.e());
          }
          i = 12;
          if (p1.i() == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, p1.i());
          }
          p0.bindLong(13, p1.k());
          p0.bindLong(14, p1.b());
       }
       return;
    }
}
